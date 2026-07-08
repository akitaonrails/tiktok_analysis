package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ve4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802580Ve4 {
    public static String LIZ;
    public static String LIZIZ;

    public static C801830Vcr LIZ(String str) {
        String strLIZ;
        Header header = new Header();
        if (C803650Vfn.LIZ == null) {
            C803650Vfn.LIZ = new C803650Vfn();
        }
        C803650Vfn.LIZ.getClass();
        HashMap map = new HashMap();
        try {
            C802790VeP c802790VeP = k.LIZ;
            if (c802790VeP != null) {
                map.put("aid", Integer.decode(c802790VeP.LIZ()));
                map.put("channel", c802790VeP.LIZIZ());
                map.put("app_version", c802790VeP.LJII().LIZLLL);
                map.put("update_version_code", Long.valueOf(c802790VeP.LJII().LIZ));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C803730Vfv c803730VfvLIZ = C803190Vf3.LIZ();
        if (TextUtils.isEmpty(c803730VfvLIZ.LIZ)) {
            c803730VfvLIZ.LIZ = CardStruct.IStatusCode.DEFAULT;
        }
        try {
            C802790VeP c802790VeP2 = k.LIZ;
            if (c802790VeP2 != null) {
                header.LIZ.put("device_id", c802790VeP2.LIZLLL(CardStruct.IStatusCode.DEFAULT));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (C803650Vfn.LIZ == null) {
            C803650Vfn.LIZ = new C803650Vfn();
        }
        C803650Vfn.LIZ.getClass();
        try {
            C802790VeP c802790VeP3 = k.LIZ;
            if (c802790VeP3 != null) {
                c802790VeP3.LJI();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        try {
            C802790VeP c802790VeP4 = k.LIZ;
            if (c802790VeP4 != null) {
                header.LIZ.put("user_id", c802790VeP4.LJI());
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        try {
            header.LIZ.put("aid", 88888);
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        C801830Vcr c801830Vcr = new C801830Vcr();
        c801830Vcr.LIZJ("header", header.LIZ);
        c801830Vcr.LIZIZ = header;
        c801830Vcr.LIZJ("is_native_crash", 1);
        c801830Vcr.LIZJ("data", str);
        Matcher matcher = PatternProtector.compile("lib\\w+\\.so").matcher(str);
        HashSet<String> hashSet = new HashSet();
        while (matcher.find()) {
            hashSet.add(matcher.group());
        }
        JSONArray jSONArray = new JSONArray();
        for (String str2 : hashSet) {
            C0VJH.LIZIZ().getClass();
            try {
                strLIZ = NativeBridge.LIZ(str2);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                strLIZ = null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lib_name", str2);
                jSONObject.put("lib_uuid", C0VJH.LIZ(strLIZ));
                jSONArray.put(jSONObject);
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
        }
        c801830Vcr.LIZJ("crash_lib_uuid", jSONArray);
        c801830Vcr.LIZJ("crash_time", Long.valueOf(System.currentTimeMillis()));
        return c801830Vcr;
    }

    public static String LIZIZ(Context context) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C803080Ves.LIZIZ();
        sbLIZ.append(C803080Ves.LIZ(context));
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("gmt");
        sbLIZ.append(str);
        sbLIZ.append("tombstone.txt");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static List<JSONObject> LIZJ(String str) throws Throwable {
        StringBuilder sbLIZ;
        BufferedReader bufferedReader = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new C0VSF(str));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            if (line.startsWith("report GL usage start")) {
                                JSONObject jSONObject = new JSONObject();
                                StringBuffer stringBuffer = new StringBuffer();
                                jSONObject.put("name", "GL_USAGE");
                                jSONObject.put("usages", "null");
                                jSONObject.put("backtrace", "null");
                                while (true) {
                                    String line2 = bufferedReader2.readLine();
                                    if (line2 == null) {
                                        break;
                                    }
                                    ALog.i("GL Usage", line2);
                                    if (line2.startsWith("report GL usage end")) {
                                        jSONObject.put("usages", stringBuffer.toString());
                                        arrayList.add(jSONObject);
                                        break;
                                    }
                                    stringBuffer.append(line2);
                                    stringBuffer.append('\n');
                                }
                            }
                            if (line.startsWith("report GL unwind usage start")) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("name", "GL_UNWIND_USAGE");
                                jSONObject2.put("usages", "null");
                                jSONObject2.put("backtrace", "null");
                                StringBuffer stringBuffer2 = new StringBuffer();
                                int i = 0;
                                while (true) {
                                    String line3 = bufferedReader2.readLine();
                                    if (line3 == null) {
                                        break;
                                    }
                                    if (line3.startsWith("context")) {
                                        jSONObject2.put("usages", line3);
                                    } else {
                                        if (line3.startsWith("report GL unwind usage end")) {
                                            jSONObject2.put("backtrace", stringBuffer2.toString());
                                            arrayList.add(jSONObject2);
                                            break;
                                        }
                                        if (i >= 3) {
                                            int i2 = i - 3;
                                            if (i2 > 9) {
                                                sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(i2);
                                                sbLIZ.append("");
                                            } else {
                                                sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(CardStruct.IStatusCode.DEFAULT);
                                                sbLIZ.append(i2);
                                            }
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("    #");
                                            sbLIZ2.append(strLIZIZ);
                                            sbLIZ2.append(" ");
                                            sbLIZ2.append(line3);
                                            stringBuffer2.append(C2188811AlT.LIZIZ(sbLIZ2));
                                            stringBuffer2.append('\n');
                                        }
                                        i++;
                                    }
                                }
                            }
                        } else {
                            C798010VSd.LIZ(bufferedReader2);
                            return arrayList;
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(e);
                        C798010VSd.LIZ(bufferedReader);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        TryCatchGuardChecker.doCheck(th);
                        C798010VSd.LIZ(bufferedReader);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r12, java.lang.String r13, java.util.List r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802580Ve4.LIZLLL(android.content.Context, java.lang.String, java.util.List):void");
    }
}
