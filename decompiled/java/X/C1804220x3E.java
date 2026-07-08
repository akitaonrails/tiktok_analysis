package X;

import com.bytedance.android.live.wallet.IWalletService;

/* JADX INFO: renamed from: X.0x3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804220x3E extends AbstractC1805010x4V<C1804420x3Y, C1804840x4E> implements InterfaceC1804540x3k {
    public final InterfaceC1567100qsm LIZIZ;
    public final InterfaceC1804600x3q LIZJ;
    public final IWalletService LIZLLL;

    public static void LJIIJ(C1804420x3Y c1804420x3Y) {
        C1803560x2A c1803560x2ALIZJ;
        String strValueOf;
        if (c1804420x3Y.LJI) {
            int i = c1804420x3Y.LIZ;
            if (i == 2) {
                strValueOf = "live_room";
            } else {
                strValueOf = String.valueOf(i);
            }
            c1803560x2ALIZJ = C1803540x28.LIZJ(strValueOf);
        } else {
            c1803560x2ALIZJ = null;
        }
        C1803440x1y.LIZ("ttlive_wallet_recharge_query_package_get_cache", null);
        if (c1803560x2ALIZJ != null) {
            c1803560x2ALIZJ.LIZIZ = true;
            c1803560x2ALIZJ.LJI = C158B.LIZ();
            c1803560x2ALIZJ.LIZJ = true;
            c1803560x2ALIZJ.LJII = C158B.LIZ();
            C1803540x28.LIZIZ(c1803560x2ALIZJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:25:0x0072, B:26:0x0075, B:28:0x007a, B:30:0x0080, B:32:0x0084, B:33:0x0086, B:35:0x008e, B:38:0x00a8, B:39:0x00ac, B:41:0x00b3, B:21:0x005e, B:22:0x0061, B:17:0x003e), top: B:46:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:25:0x0072, B:26:0x0075, B:28:0x007a, B:30:0x0080, B:32:0x0084, B:33:0x0086, B:35:0x008e, B:38:0x00a8, B:39:0x00ac, B:41:0x00b3, B:21:0x005e, B:22:0x0061, B:17:0x003e), top: B:46:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3 A[Catch: Exception -> 0x00b9, TryCatch #0 {Exception -> 0x00b9, blocks: (B:25:0x0072, B:26:0x0075, B:28:0x007a, B:30:0x0080, B:32:0x0084, B:33:0x0086, B:35:0x008e, B:38:0x00a8, B:39:0x00ac, B:41:0x00b3, B:21:0x005e, B:22:0x0061, B:17:0x003e), top: B:46:0x001d }] */
    @Override // X.AbstractC1805010x4V
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C1804420x3Y r11, X.InterfaceC1364105Vn<? super X.C1804840x4E> r12) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C1804370x3T
            if (r0 == 0) goto L26
            r9 = r12
            X.0x3T r9 = (X.C1804370x3T) r9
            int r2 = r9.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r9.LLILZLL = r2
        L12:
            java.lang.Object r7 = r9.LLILZ
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILZLL
            r4 = 2
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L3b
            if (r0 == r6) goto L34
            if (r0 != r4) goto L2c
            X.0x3Y r11 = r9.LL
            goto L72
        L26:
            X.0x3T r9 = new X.0x3T
            r9.<init>(r10, r12)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.0x3Y r0 = r9.LLILLL
            X.0x3q r3 = r9.LLILLJJLI
            X.0x3Y r11 = r9.LL
            goto L5e
        L3b:
            X.C155000ia.LIZIZ(r7)
            com.bytedance.android.live.wallet.IWalletService r0 = r10.LIZLLL     // Catch: java.lang.Exception -> Lb9
            r0.setIapResultExtra(r5)     // Catch: java.lang.Exception -> Lb9
            X.0x3q r3 = r10.LIZJ     // Catch: java.lang.Exception -> Lb9
            X.0qsm r2 = r10.LIZIZ     // Catch: java.lang.Exception -> Lb9
            X.0504 r1 = new X.0504     // Catch: java.lang.Exception -> Lb9
            r0 = 0
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lb9
            r9.LL = r11     // Catch: java.lang.Exception -> Lb9
            r9.LLILLJJLI = r3     // Catch: java.lang.Exception -> Lb9
            r9.LLILLL = r11     // Catch: java.lang.Exception -> Lb9
            r9.LLILZLL = r6     // Catch: java.lang.Exception -> Lb9
            java.lang.Object r7 = r2.LJ(r1, r9)     // Catch: java.lang.Exception -> Lb9
            if (r7 != r8) goto L5c
            return r8
        L5c:
            r0 = r11
            goto L61
        L5e:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> Lb9
        L61:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> Lb9
            r9.LL = r11     // Catch: java.lang.Exception -> Lb9
            r9.LLILLJJLI = r5     // Catch: java.lang.Exception -> Lb9
            r9.LLILLL = r5     // Catch: java.lang.Exception -> Lb9
            r9.LLILZLL = r4     // Catch: java.lang.Exception -> Lb9
            X.0x4E r7 = r3.LJIIJ(r0, r7)     // Catch: java.lang.Exception -> Lb9
            if (r7 != r8) goto L75
            return r8
        L72:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Exception -> Lb9
        L75:
            r4 = r7
            X.0x4E r4 = (X.C1804840x4E) r4     // Catch: java.lang.Exception -> Lb9
            if (r4 == 0) goto La4
            webcast.api.profit.IapListResult$ListResultExtra r0 = r4.LJII()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La4
            webcast.api.profit.IapListResult$IapCustomData r0 = r0.iapCustomData     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La4
            java.lang.String r3 = r0.rechargeV3PanelUrl     // Catch: java.lang.Exception -> Lb9
        L86:
            com.bytedance.android.live.wallet.IWalletService r0 = r10.LIZLLL     // Catch: java.lang.Exception -> Lb9
            boolean r0 = r0.canRedirectRechargeV3()     // Catch: java.lang.Exception -> Lb9
            if (r0 == 0) goto La6
            com.bytedance.android.live.wallet.IWalletService r2 = r10.LIZLLL     // Catch: java.lang.Exception -> Lb9
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()     // Catch: java.lang.Exception -> Lb9
            X.0Jki r0 = r0.user()     // Catch: java.lang.Exception -> Lb9
            long r0 = r0.getCurrentUserId()     // Catch: java.lang.Exception -> Lb9
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> Lb9
            r2.setRechargeV3Cache(r0, r3)     // Catch: java.lang.Exception -> Lb9
            goto La6
        La4:
            r3 = r5
            goto L86
        La6:
            if (r4 == 0) goto Lac
            webcast.api.profit.IapListResult$ListResultExtra r5 = r4.LJII()     // Catch: java.lang.Exception -> Lb9
        Lac:
            com.bytedance.android.live.wallet.IWalletService r0 = r10.LIZLLL     // Catch: java.lang.Exception -> Lb9
            r0.setIapResultExtra(r5)     // Catch: java.lang.Exception -> Lb9
            if (r4 == 0) goto Lb8
            r4.LJ = r6     // Catch: java.lang.Exception -> Lb9
            LJIIJ(r11)     // Catch: java.lang.Exception -> Lb9
        Lb8:
            return r7
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1804220x3E.LJFF(X.0x3Y, X.05Vn):java.lang.Object");
    }

    public C1804220x3E(C1796830wrJ c1796830wrJ, C1804610x3r c1804610x3r, IWalletService iWalletService) {
        this.LIZIZ = c1796830wrJ;
        this.LIZJ = c1804610x3r;
        this.LIZLLL = iWalletService;
    }
}
