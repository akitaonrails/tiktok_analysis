package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Z5J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5J {
    public static final String LIZ(C869590Y9l c869590Y9l) {
        String str = c869590Y9l.getExt().get("a:mask_type");
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -606053617) {
                if (iHashCode != 277474905) {
                    if (iHashCode != 1022432685 || !str.equals("keywords_filter") || !C287710BPl.LIZ()) {
                        return null;
                    }
                    return "keywords_filter";
                }
                if (!str.equals("negativity_filter") || !C287720BPm.LIZ()) {
                    return null;
                }
                return "negativity_filter";
            }
            if (str.equals("nude_filter")) {
                return "nude_filter";
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[Catch: NumberFormatException -> 0x003b, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x003b, blocks: (B:3:0x0003, B:6:0x0014, B:8:0x001a, B:10:0x0022, B:18:0x0031, B:20:0x0036), top: B:25:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: NumberFormatException -> 0x003b, TryCatch #0 {NumberFormatException -> 0x003b, blocks: (B:3:0x0003, B:6:0x0014, B:8:0x001a, B:10:0x0022, B:18:0x0031, B:20:0x0036), top: B:25:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZIZ(X.C0Y8T r5) {
        /*
            java.lang.String r1 = "a:media_mask"
            r4 = 0
            java.util.Map r0 = r5.getLocalExt()     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)     // Catch: java.lang.NumberFormatException -> L3b
            if (r0 == 0) goto L14
            return r4
        L14:
            java.util.Map r0 = r5.getExt()     // Catch: java.lang.NumberFormatException -> L3b
            if (r0 == 0) goto L29
            java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L3b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.NumberFormatException -> L3b
            if (r2 == 0) goto L2a
            int r0 = r2.length()     // Catch: java.lang.NumberFormatException -> L3b
            if (r0 == 0) goto L2a
            goto L2c
        L29:
            r2 = 0
        L2a:
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            java.lang.String r0 = "1"
            if (r1 != 0) goto L36
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)     // Catch: java.lang.NumberFormatException -> L3b
            return r0
        L36:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)     // Catch: java.lang.NumberFormatException -> L3b
            return r0
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z5J.LIZIZ(X.0Y8T):boolean");
    }

    public static final boolean LIZJ(C869590Y9l c869590Y9l) {
        if (!Intrinsics.LJFF(c869590Y9l.getExt().get("a:is_nude"), "true") && !Intrinsics.LJFF(c869590Y9l.getExt().get("a:mask_type"), "nude_filter")) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(C869590Y9l c869590Y9l) {
        String str;
        List listLJJLIIIJILLIZJL;
        if (c869590Y9l.getLocalExt().get("a:unmasked") != null) {
            return true;
        }
        if (C123100dR.LIZ(c869590Y9l.getExt().get("a:unmasked")) && (str = c869590Y9l.getExt().get("a:unmasked")) != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6)) != null) {
            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
            if (curUserId == null) {
                curUserId = "";
            }
            if (listLJJLIIIJILLIZJL.contains(curUserId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJ(C869590Y9l c869590Y9l) {
        c869590Y9l.getLocalExt().put("a:unmasked", "1");
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1504605um(c869590Y9l, null), 2);
    }
}
