package X;

import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJI {
    public final ArrayList<C0VJJ> LIZ;
    public final int LIZIZ;
    public final C0VJJ LIZJ;
    public final File LIZLLL;
    public final C0VJK LJ;
    public final C803420VfQ LJFF;
    public final C0VSJ LJI;

    public final boolean LIZ() {
        C0VJJ c0vjj = this.LIZJ;
        if (c0vjj != null && "WaitingForGcToComplete".equals(c0vjj.LIZIZ)) {
            return true;
        }
        int i = 0;
        int i2 = 0;
        for (C0VJJ c0vjj2 : this.LIZ) {
            if (c0vjj2.LJII) {
                if ("WaitingForGcToComplete".equals(c0vjj2.LIZIZ)) {
                    i++;
                }
                i2++;
            }
        }
        return i >= 5 || i * 4 > i2;
    }

    public final void LIZIZ(JSONObject jSONObject) {
        long j;
        String strLIZ;
        JSONArray jSONArray = new JSONArray();
        for (C0VJJ c0vjj : this.LIZ) {
            JSONArray jSONArray2 = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 1; i < c0vjj.LJIIIZ.size(); i++) {
                try {
                    jSONArray2.put(ListProtector.get(c0vjj.LJIIIZ, i));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            jSONObject2.put("thread_name", ListProtector.get(c0vjj.LJIIIZ, 0));
            jSONObject2.put("thread_stack", jSONArray2);
            jSONArray.put(jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("thread_stacks", jSONArray);
            jSONObject3.put("thread_all_count", this.LIZIZ);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C0VJO.LJIIIIZZ(jSONObject, "all_thread_stacks", jSONObject3);
        C0VJJ c0vjj2 = this.LIZJ;
        long j2 = -1;
        if (c0vjj2 != null) {
            j = c0vjj2.LIZLLL;
            j2 = c0vjj2.LIZJ;
        } else {
            j = -1;
        }
        C0VJO.LJIIIIZZ(jSONObject, "main_thread_cpu_tick", Long.valueOf(j + j2));
        final C0VSJ c0vsj = new C0VSJ(this.LIZLLL, "trace.txt");
        HashMap map = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        new C0VJC(c0vsj) { // from class: X.0VJF
            @Override // X.C0VJC
            public final Pattern LIZ() {
                return PatternProtector.compile("^  native: #\\d{1,3} pc [0-9a-f]{8,16} {2}(/(?:[^/]+/)+.*\\.so).*");
            }

            @Override // X.C0VJC
            public final boolean LIZIZ(String str) {
                return str.startsWith("  native: #");
            }
        }.LIZJ(arrayList);
        for (String str : arrayList) {
            if (!C0VJG.LIZIZ(str) && !map.containsKey(str) && (strLIZ = NativeBridge.LIZ(str)) != null) {
                map.put(str, strLIZ);
            }
        }
        C0VJG.LIZLLL(jSONObject, map);
        try {
            if (jSONObject.optJSONObject("app_memory_info") == null && this.LJ.LIZ > 0) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject.put("app_memory_info", jSONObject4);
                jSONObject4.put("max_memory", this.LJ.LIZ);
                jSONObject4.put("free_memory", this.LJ.LIZIZ);
                jSONObject4.put("total_memory", this.LJ.LIZJ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C0VJI(File file, int i) {
        HashMap map;
        BufferedReader bufferedReader;
        ArrayList<C0VJJ> arrayList = new ArrayList<>();
        this.LJI = new C0VSJ(file, "trace_by_child.txt");
        C803420VfQ c803420VfQ = new C803420VfQ();
        C0VJK c0vjk = new C0VJK();
        C0VSJ c0vsj = new C0VSJ(file, "trace.txt");
        C0VJJ c0vjj = null;
        if (c0vsj.exists() && !c0vsj.isDirectory()) {
            C0VSJ c0vsj2 = new C0VSJ(file, "trace_by_child.txt");
            if (!c0vsj2.exists()) {
                map = null;
            } else {
                map = new HashMap();
                try {
                    bufferedReader = new BufferedReader(new C0VSF(c0vsj2));
                    JSONArray jSONArray = null;
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (!TextUtils.isEmpty(line)) {
                                if (line.contains("sysTid")) {
                                    String strSubstring = line.substring(line.indexOf(61) + 1);
                                    jSONArray = new JSONArray();
                                    jSONArray.put("backtrace: \n");
                                    map.put(strSubstring, jSONArray);
                                } else if (jSONArray != null) {
                                    String strTrim = line.trim();
                                    if (strTrim.startsWith("#")) {
                                        jSONArray.put(strTrim);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C2112008Pe.LIZ(bufferedReader);
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
                C2112008Pe.LIZ(bufferedReader);
            }
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new C0VSP(c0vsj)));
                while (true) {
                    try {
                        String line2 = bufferedReader2.readLine();
                        if (line2 == null) {
                            break;
                        }
                        if (!line2.isEmpty() && !c803420VfQ.LIZ(line2)) {
                            if (line2.startsWith("Free memory ")) {
                                long jLIZ = C0VJK.LIZ(12, line2);
                                if (jLIZ > 0) {
                                    c0vjk.LIZIZ = jLIZ;
                                }
                            } else if (line2.startsWith("Total memory ")) {
                                c0vjk.LIZJ = C0VJK.LIZ(13, line2);
                            } else if (line2.startsWith("Max memory ")) {
                                c0vjk.LIZ = C0VJK.LIZ(11, line2);
                            } else if (line2.charAt(0) == '\"' && line2.contains(" prio=")) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(line2);
                                while (true) {
                                    String line3 = bufferedReader2.readLine();
                                    if (line3 == null || !line3.startsWith("  ")) {
                                        break;
                                    } else {
                                        arrayList2.add(line3);
                                    }
                                }
                                C0VJJ c0vjj2 = new C0VJJ(arrayList2, map);
                                if (c0vjj2.LIZJ()) {
                                    if (c0vjj2.LJ == i) {
                                        c0vjj = c0vjj2;
                                    } else {
                                        arrayList.add(c0vjj2);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                    }
                }
                C2112008Pe.LIZ(bufferedReader2);
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LIZIZ = arrayList.size() + (c0vjj != null ? 1 : 0);
        this.LIZJ = c0vjj;
        this.LIZ = arrayList;
        this.LJ = c0vjk;
        this.LJFF = c803420VfQ;
        this.LIZLLL = file;
    }
}
