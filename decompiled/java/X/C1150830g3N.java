package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletExchange;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150830g3N {
    public static final Map<String, InterfaceC1149850g1n> LIZ = new LinkedHashMap();

    public static boolean LJ(String str) {
        if (Intrinsics.LJFF(str, "exchange")) {
            return InterfaceC1094160eZy.M0.LIZIZ().booleanValue();
        }
        if (Intrinsics.LJFF(str, "guide")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r2, java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.String r0 = "exchange"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            r1 = 1
            if (r0 == 0) goto L55
            r0 = 2
            if (r2 != r0) goto L3d
            X.14i1<java.lang.Integer> r1 = X.InterfaceC1094160eZy.L0
            java.lang.Object r0 = r1.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJFF(r0)
        L21:
            if (r5 == 0) goto L3c
        L23:
            java.util.Map<java.lang.String, X.0g1n> r1 = X.C1150830g3N.LIZ
            boolean r0 = r1.containsKey(r3)
            if (r0 == 0) goto L3c
            r0 = r1
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r3)
            X.0g1n r0 = (X.InterfaceC1149850g1n) r0
            if (r0 == 0) goto L39
            r0.LIZJ()
        L39:
            r1.remove(r3)
        L3c:
            return
        L3d:
            if (r2 != r1) goto L21
            X.14i1<java.lang.Integer> r1 = X.InterfaceC1094160eZy.K0
            java.lang.Object r0 = r1.LIZIZ()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.LJFF(r0)
            goto L21
        L55:
            java.lang.String r0 = "guide"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L21
            X.14i1<java.lang.Integer> r2 = X.InterfaceC1094160eZy.P0
            java.lang.Object r1 = r2.LIZIZ()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r5 == 0) goto L6d
            int r0 = r1.intValue()
            if (r0 < 0) goto L23
        L6d:
            int r0 = r1.intValue()
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJFF(r0)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1150830g3N.LIZ(int, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(final android.content.Context r4, X.InterfaceC1149850g1n r5, final X.C1144350fsv r6, java.lang.String r7) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "exchange"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L2b
            X.0g3M r2 = new X.0g3M
            r2.<init>(r3, r4, r6)
        L15:
            r0 = 1
            boolean r1 = r2.LIZIZ(r0)
        L1a:
            if (r4 == 0) goto L2a
            if (r5 == 0) goto L2a
            if (r1 == 0) goto L2a
            java.util.Map<java.lang.String, X.0g1n> r0 = X.C1150830g3N.LIZ
            r0.put(r3, r5)
            if (r2 == 0) goto L2a
            r2.LJIIJJI(r4)
        L2a:
            return r1
        L2b:
            java.lang.String r0 = "guide"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L39
            X.0g3U r2 = new X.0g3U
            r2.<init>(r4, r6, r3)
            goto L15
        L39:
            r2 = 0
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1150830g3N.LIZIZ(android.content.Context, X.0g1n, X.0fsv, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(final android.content.Context r4, X.InterfaceC1149850g1n r5, final X.C1144350fsv r6, java.lang.String r7) {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "exchange"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L2b
            X.0g3L r2 = new X.0g3L
            r2.<init>(r3, r4, r6)
        L15:
            r0 = 1
            boolean r1 = r2.LIZIZ(r0)
        L1a:
            if (r4 == 0) goto L2a
            if (r5 == 0) goto L2a
            if (r1 == 0) goto L2a
            java.util.Map<java.lang.String, X.0g1n> r0 = X.C1150830g3N.LIZ
            r0.put(r3, r5)
            if (r2 == 0) goto L2a
            r2.LJIIJJI(r4)
        L2a:
            return r1
        L2b:
            java.lang.String r0 = "guide"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L39
            X.0g3V r2 = new X.0g3V
            r2.<init>(r3, r4, r6)
            goto L15
        L39:
            r2 = 0
            r1 = 0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1150830g3N.LIZJ(android.content.Context, X.0g1n, X.0fsv, java.lang.String):boolean");
    }

    public static void LIZLLL(int i, int i2, String str, String str2, String str3, boolean z, long j) {
        Map<String, InterfaceC1149850g1n> map = LIZ;
        if (map.containsKey(str)) {
            InterfaceC1149850g1n interfaceC1149850g1n = (InterfaceC1149850g1n) ((LinkedHashMap) map).get(str);
            if (z) {
                if (i != 1) {
                    if (i == 2) {
                        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange().getClass();
                        WalletExchange.LIZLLL("not_auto_exchange", str3, false);
                    }
                } else {
                    ((WalletExchange) ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletExchange()).LJJIIJ("not_auto_exchange", str3);
                }
            } else if (Intrinsics.LJFF(str2, "guide")) {
                LIZ(i, str, str2, false);
            }
            if (interfaceC1149850g1n != null) {
                interfaceC1149850g1n.LIZIZ(i, j, true, z, i2, null);
            }
            map.remove(str);
        }
    }
}
