package X;

import com.bytedance.touchpoint.api.model.DramaBottomButton;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0SFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718220SFg {
    public static final C718220SFg LIZ = new C718220SFg();
    public static int LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: Exception -> 0x0054, TryCatch #0 {Exception -> 0x0054, blocks: (B:3:0x0001, B:5:0x0012, B:7:0x0016, B:8:0x001a, B:11:0x0020, B:12:0x002d, B:14:0x0033, B:16:0x0043, B:17:0x0047), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047 A[EDGE_INSN: B:31:0x0047->B:17:0x0047 BREAK  A[LOOP:0: B:12:0x002d->B:33:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.touchpoint.api.model.DramaBottomButton LIZIZ() {
        /*
            r7 = 0
            X.01GW<X.0zPA> r0 = X.C1894700zPA.LJIJ     // Catch: java.lang.Exception -> L54
            X.0zPA r1 = X.C2178808gE.LIZ()     // Catch: java.lang.Exception -> L54
            r0 = 84
            X.0zNV r6 = r1.LJ(r0)     // Catch: java.lang.Exception -> L54
            com.bytedance.touchpoint.api.model.DramaBottomButton r6 = (com.bytedance.touchpoint.api.model.DramaBottomButton) r6     // Catch: java.lang.Exception -> L54
            r5 = 0
            if (r6 == 0) goto L4c
            java.lang.Integer r0 = r6.showTimes     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L4c
            int r4 = r0.intValue()     // Catch: java.lang.Exception -> L54
        L1a:
            java.lang.String r3 = r6.taskEventKey     // Catch: java.lang.Exception -> L54
            if (r3 != 0) goto L20
        L1e:
            java.lang.String r3 = ""
        L20:
            X.0zUf r0 = X.C1898110zUf.LL     // Catch: java.lang.Exception -> L54
            r0.getClass()     // Catch: java.lang.Exception -> L54
            java.util.List<X.0zUh> r0 = X.C1898110zUf.LLILZ     // Catch: java.lang.Exception -> L54
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L54
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L54
        L2d:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L54
            X.0zUh r1 = (X.InterfaceC1898130zUh) r1     // Catch: java.lang.Exception -> L54
            java.lang.String r0 = r1.getTaskEventKey()     // Catch: java.lang.Exception -> L54
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)     // Catch: java.lang.Exception -> L54
            if (r0 == 0) goto L2d
            boolean r5 = r1.LJII()     // Catch: java.lang.Exception -> L54
        L47:
            int r0 = X.C718220SFg.LIZIZ     // Catch: java.lang.Exception -> L54
            if (r0 >= r4) goto L53
            goto L50
        L4c:
            r4 = 0
            if (r6 == 0) goto L1e
            goto L1a
        L50:
            if (r5 != 0) goto L53
            return r6
        L53:
            return r7
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718220SFg.LIZIZ():com.bytedance.touchpoint.api.model.DramaBottomButton");
    }

    public static final void LIZ() {
        try {
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1894320zOY.getClass();
            C1894320zOY.LJIILJJIL(84, linkedHashMap, null, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZJ() {
        try {
            LIZIZ++;
            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1894320zOY.getClass();
            C1894320zOY.LJIJJ(84, linkedHashMap, null, null, null, "");
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0S0Q((DramaBottomButton) C2178808gE.LIZ().LJ(84), null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
