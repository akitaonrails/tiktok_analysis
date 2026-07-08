package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08de, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2162808de {
    public static final C2162808de LIZ = new C2162808de();
    public static C2162908df LIZIZ;

    public static C2162908df LIZIZ() throws Throwable {
        Object c098200Yq;
        C2162908df c2162908df = LIZIZ;
        if (c2162908df == null) {
            String strLIZ = C2105708Mt.LIZ("ro.build.version.emui");
            if (a0.LJJIIZI(strLIZ, "EmotionUI", false)) {
                try {
                    Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                    c098200Yq = Boolean.valueOf(Intrinsics.LJFF("harmony", cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                c2162908df = Intrinsics.LJFF(c098200Yq, Boolean.TRUE) ? new C2162908df("harmony_os", C2105708Mt.LIZ("ro.huawei.build.display.id")) : new C2162908df("emui", C2105708Mt.LIZ("ro.huawei.build.display.id"));
            } else if (a0.LJJIIZI(strLIZ, "MagicUI", false)) {
                c2162908df = new C2162908df("magic_ui", strLIZ);
            } else if (a0.LJJIIZI(strLIZ, "MagicOS", false)) {
                c2162908df = new C2162908df("magic_od", strLIZ);
            } else {
                String strLIZ2 = C2105708Mt.LIZ("ro.miui.ui.version.name");
                if (strLIZ2.length() > 0) {
                    c2162908df = new C2162908df("miui", strLIZ2);
                } else {
                    String strLIZ3 = C2105708Mt.LIZ("ro.build.version.opporom");
                    if (strLIZ3.length() > 0) {
                        c2162908df = new C2162908df("color_os", strLIZ3);
                    } else {
                        String strLIZ4 = C2105708Mt.LIZ("ro.build.version.oplusrom");
                        if (strLIZ4.length() > 0) {
                            c2162908df = new C2162908df("color_os", strLIZ4);
                        } else {
                            String strLIZ5 = C2105708Mt.LIZ("ro.vivo.os.build.display.id");
                            c2162908df = a0.LJJIIZI(strLIZ5, "Funtouch", false) ? new C2162908df("funtouch_os", strLIZ5) : a0.LJJIIZI(strLIZ5, "OriginOS", false) ? new C2162908df("origin_os", strLIZ5) : new C2162908df("unknown", "");
                        }
                    }
                }
            }
            LIZIZ = c2162908df;
        }
        return c2162908df;
    }

    public static String LIZ(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "0.0.0";
        }
        String[] strArr = (String[]) new Regex("\\.").split(str, 0).toArray(new String[0]);
        int length = strArr.length;
        if (length != 1) {
            if (length != 2) {
                if (length != 3) {
                    return "0.0.0";
                }
                return str;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strArr[0]);
            sbLIZ.append('.');
            sbLIZ.append(strArr[1]);
            sbLIZ.append(".0");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strArr[0]);
        sbLIZ2.append(".0.0");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
