package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VYR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYR {
    public static final C0VYR LIZJ = new C0VYR();
    public C0VYQ LIZ = new C0VYQ();
    public final ARunnableS113S0100000_13 LIZIZ = new ARunnableS113S0100000_13(this, 228);

    public final void LIZ(File file) {
        C0VYQ c0vyq = this.LIZ;
        if (c0vyq != null) {
            c0vyq.getClass();
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (c0vyq) {
                    try {
                        Iterator it2 = ((ConcurrentHashMap) c0vyq.LIZJ).values().iterator();
                        while (it2.hasNext()) {
                            Object objLIZ = ((C2031907xd) it2.next()).LIZ();
                            if (objLIZ != null) {
                                PrintStream printStream = System.out;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("NPTH::checkLeaks:+");
                                sbLIZ.append(objLIZ);
                                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                                Iterator<C0VYS> it3 = c0vyq.LIZIZ.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C0VYS next = it3.next();
                                        if (objLIZ.hashCode() == next.LIZ) {
                                            next.LIZLLL = System.currentTimeMillis();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        JSONArray jSONArray = new JSONArray();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                        for (C0VYS c0vys : c0vyq.LIZIZ) {
                            if (c0vys.LIZ > 0) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("hash", c0vys.LIZ);
                                jSONObject2.put("leak_start_time", c0vys.LIZJ);
                                if (c0vys.LIZJ > 0) {
                                    jSONObject2.put("leak_start_time_str", simpleDateFormat.format(new Date(c0vys.LIZJ)));
                                }
                                jSONObject2.put("leak_end_ime", c0vys.LIZLLL);
                                if (c0vys.LIZLLL > 0) {
                                    jSONObject2.put("leak_end_time_str", simpleDateFormat.format(new Date(c0vys.LIZLLL)));
                                }
                                jSONObject2.put("start_watch_time", c0vys.LIZIZ);
                                jSONObject2.put("gc_count", 0);
                                jSONObject2.put("leak_object_name", c0vys.LJ);
                                jSONObject2.put("leak_duration", c0vys.LIZLLL - c0vys.LIZJ);
                                jSONArray.put(jSONObject2);
                            }
                        }
                        if (jSONArray.length() > 0) {
                            jSONObject.put("leak_objects", jSONArray);
                        }
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (file != null && file.exists() && jSONObject.has("leak_objects")) {
                    C08SE.LJIIIIZZ(new C0VSJ(file, "leak_object.txt"), C786410Ut5.J3(jSONObject), false);
                }
            } catch (Throwable th) {
            }
        }
    }
}
