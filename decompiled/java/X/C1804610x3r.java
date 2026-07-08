package X;

import android.content.Context;
import com.bytedance.WalletRechargeService;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.data.api.IRechargeApi;
import com.bytedance.android.live.wallet.data.api.IWalletApi;
import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.Unit;
import org.json.JSONException;
import webcast.api.profit.ListV3Result;

/* JADX INFO: renamed from: X.0x3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804610x3r implements InterfaceC1804600x3q {
    public final InterfaceC1804670x3x LIZ;
    public final IRechargeApi LIZIZ;
    public final WalletRechargeService LIZJ;
    public final IWalletService LIZLLL;
    public final IWalletApi LJ;

    @Override // X.InterfaceC1804600x3q
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // X.InterfaceC1804600x3q
    public final InterfaceC346201Wa<C00F7> LJ() {
        return this.LIZ.LJ();
    }

    @Override // X.InterfaceC1804600x3q
    public final InterfaceC346201Wa<C788570UwZ> LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC1804600x3q
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // X.InterfaceC1804600x3q
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZIZ = this.LIZ.LIZIZ(interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1804600x3q
    public final Object LIZJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZJ = this.LIZ.LIZJ(interfaceC1364105Vn);
        if (objLIZJ == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1804600x3q
    public final Object LIZLLL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZLLL = this.LIZ.LIZLLL(interfaceC1364105Vn);
        if (objLIZLLL == C099R.LJFF()) {
            return objLIZLLL;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1804600x3q
    public final Unit LJIIJJI(C1804680x3y c1804680x3y) {
        this.LIZLLL.getRechargeService().LIZIZ(c1804680x3y.LIZ, c1804680x3y.LIZIZ, c1804680x3y.LIZJ, c1804680x3y.LIZLLL, c1804680x3y.LJ);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    @Override // X.InterfaceC1804600x3q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C1567680qti r9, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdk.wallet.Diamond>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1804640x3u
            if (r0 == 0) goto L3d
            r7 = r10
            X.0x3u r7 = (X.C1804640x3u) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.0wqm r4 = X.C1797270ws1.LIZIZ()
            java.util.List<java.lang.String> r3 = r9.LIZ
            boolean r2 = r9.LIZIZ
            r1 = 2
            r0 = 0
            X.11Kz r0 = r4.LJ(r1, r0, r2, r3)
            r7.LLILLL = r5
            java.lang.Object r1 = X.C11UD.LIZIZ(r0, r7)
            if (r1 != r6) goto L22
            return r6
        L3d:
            X.0x3u r7 = new X.0x3u
            r7.<init>(r8, r10)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1804610x3r.LJII(X.0qti, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1804600x3q
    public final Object LJIIIIZZ(C1804690x3z c1804690x3z, InterfaceC1364105Vn<? super ListV3Result> interfaceC1364105Vn) throws JSONException {
        Context context;
        WalletRechargeService walletRechargeService = this.LIZJ;
        RecommendStrategyParam recommendStrategyParam = c1804690x3z.LIZ.LJFF;
        if (recommendStrategyParam != null) {
            recommendStrategyParam.LIZ();
        }
        ((InterfaceC1791930wjP) C1161920gLG.LIZJ(IapService.class)).getBillingCountryCode();
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && (context = iHostAppContext.context()) != null) {
            context.getPackageName();
        }
        return C11UD.LJI(walletRechargeService.LIZ(), interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    @Override // X.InterfaceC1804600x3q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C1567200qsw r8, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.wallet.NoticesResult.Data> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1804650x3v
            if (r0 == 0) goto L41
            r6 = r9
            X.0x3v r6 = (X.C1804650x3v) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 != r4) goto L49
            X.C155000ia.LIZIZ(r1)
        L22:
            com.bytedance.android.live.network.response.BaseResponse r1 = (com.bytedance.android.live.network.response.BaseResponse) r1
            if (r1 == 0) goto L47
            T r0 = r1.data
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.live.wallet.data.api.IWalletApi r3 = r7.LJ
            java.lang.String r2 = r8.LIZ
            java.lang.String r1 = r8.LIZIZ
            java.lang.String r0 = r8.LIZJ
            X.11NZ r0 = r3.getNotifications(r2, r1, r0)
            r6.LLILLL = r4
            java.lang.Object r1 = X.C11UD.LJI(r0, r6)
            if (r1 != r5) goto L22
            return r5
        L41:
            X.0x3v r6 = new X.0x3v
            r6.<init>(r7, r9)
            goto L12
        L47:
            r0 = 0
            return r0
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1804610x3r.LJIIIZ(X.0qsw, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1804600x3q
    public final C1804840x4E LJIIJ(C1804420x3Y c1804420x3Y, String str) {
        C1804840x4E c1804840x4ELJII = this.LIZLLL.getRechargeService().LJII(c1804420x3Y.LIZ, c1804420x3Y.LIZIZ, str, c1804420x3Y.LJIIIIZZ, String.valueOf(c1804420x3Y.LJIIIZ));
        if (c1804840x4ELJII != null) {
            return c1804840x4ELJII;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    @Override // X.InterfaceC1804600x3q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.C1804690x3z r20, X.InterfaceC1364105Vn<? super webcast.api.profit.IapListResult> r21) throws org.json.JSONException {
        /*
            r19 = this;
            r4 = r21
            boolean r0 = r4 instanceof X.C1804660x3w
            r5 = r19
            if (r0 == 0) goto L86
            r2 = r4
            X.0x3w r2 = (X.C1804660x3w) r2
            int r3 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L86
            int r3 = r3 - r1
            r2.LLILLL = r3
        L16:
            java.lang.Object r4 = r2.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r3 = r2.LLILLL
            r0 = 1
            if (r3 == 0) goto L27
            if (r3 != r0) goto L8c
            X.C155000ia.LIZIZ(r4)
        L26:
            return r4
        L27:
            X.C155000ia.LIZIZ(r4)
            boolean r3 = X.C1792950wl3.LIZ()
            if (r3 == 0) goto L83
            r11 = 8
        L32:
            java.lang.Class<com.bytedance.android.live.iap.service.IapService> r3 = com.bytedance.android.live.iap.service.IapService.class
            X.006A r3 = X.C1161920gLG.LIZJ(r3)
            X.0wjP r3 = (X.InterfaceC1791930wjP) r3
            java.lang.String r17 = r3.getBillingCountryCode()
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r3 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.006A r3 = X.C1161920gLG.LIZJ(r3)
            com.bytedance.android.livesdkapi.host.IHostAppContext r3 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r3
            if (r3 == 0) goto L54
            android.content.Context r3 = r3.context()
            if (r3 == 0) goto L54
            java.lang.String r18 = r3.getPackageName()
            if (r18 != 0) goto L56
        L54:
            java.lang.String r18 = ""
        L56:
            com.bytedance.android.live.wallet.data.api.IRechargeApi r5 = r5.LIZIZ
            r4 = r20
            java.lang.String r6 = r4.LIZIZ
            X.0x3Y r3 = r4.LIZ
            long r7 = r3.LIZJ
            long r9 = r3.LIZLLL
            int r13 = r3.LIZ
            boolean r14 = r3.LJ
            com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam r3 = r3.LJFF
            if (r3 == 0) goto L81
            java.lang.String r15 = r3.LIZ()
        L6e:
            X.0x3Y r3 = r4.LIZ
            int r3 = r3.LJIIIZ
            r16 = r3
            X.11NZ r3 = r5.fetchDiamondPackage(r6, r7, r9, r11, r13, r14, r15, r16, r17, r18)
            r2.LLILLL = r0
            java.lang.Object r4 = X.C11UD.LJI(r3, r2)
            if (r4 != r1) goto L26
            return r1
        L81:
            r15 = 0
            goto L6e
        L83:
            r11 = 0
            goto L32
        L86:
            X.0x3w r2 = new X.0x3w
            r2.<init>(r5, r4)
            goto L16
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1804610x3r.LJIIL(X.0x3z, X.05Vn):java.lang.Object");
    }

    public C1804610x3r(C1805070x4b c1805070x4b, IRechargeApi iRechargeApi, WalletRechargeService walletRechargeService, IWalletService iWalletService, IWalletApi iWalletApi) {
        this.LIZ = c1805070x4b;
        this.LIZIZ = iRechargeApi;
        this.LIZJ = walletRechargeService;
        this.LIZLLL = iWalletService;
        this.LJ = iWalletApi;
    }
}
