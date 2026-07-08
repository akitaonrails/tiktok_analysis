package X;

import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Bv5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2220251Bv5 {
    public static C2220221Bv2 LIZ(EnumC2221121BwU enumC2221121BwU, String str) {
        int code = enumC2221121BwU.getCode();
        boolean zLJJJIL = a0.LJJJIL(str);
        String msg = enumC2221121BwU.getMsg();
        if (!zLJJJIL) {
            msg = msg + " " + str;
        }
        return new C2220221Bv2(1, new C2220231Bv3(false, null, new C2220241Bv4(code, msg), null));
    }

    public static C2220221Bv2 LIZJ(C1849450yEB c1849450yEB, Map map) {
        return new C2220221Bv2(0, new C2220231Bv3(true, c1849450yEB, null, map));
    }
}
