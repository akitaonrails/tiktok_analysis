package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.analytics.IIMAIGroupShotAnalytics;
import com.ss.android.ugc.aweme.service.IIMMediaCreativeService;
import com.ss.android.ugc.aweme.service.IIMMediaService;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0ZqH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912070ZqH implements IIMMediaService {
    public static final C912070ZqH LIZIZ = new C912070ZqH();
    public static volatile IIMMediaService LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static volatile long LJFF;

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:2:0x0000, B:4:0x0028, B:6:0x0033, B:7:0x0037, B:8:0x003b), top: B:19:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.service.IIMMediaService LIZ() {
        /*
            java.lang.String r0 = "com.ss.android.ugc.aweme.service.IMMediaServiceImpl"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.framework.services.ServiceManager r2 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<com.ss.android.ugc.aweme.service.IIMMediaService> r1 = com.ss.android.ugc.aweme.service.IIMMediaService.class
            X.0ZqJ r0 = new X.0ZqJ     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.framework.services.Binding r0 = r2.bind(r1, r0)     // Catch: java.lang.Throwable -> L4b
            r0.asSingleton()     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<com.ss.android.ugc.aweme.service.IIMMediaService> r0 = com.ss.android.ugc.aweme.service.IIMMediaService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.service.IIMMediaService r2 = (com.ss.android.ugc.aweme.service.IIMMediaService) r2     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L3b
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.service.IIMMediaService r0 = X.C912100ZqK.LIZ()     // Catch: java.lang.Throwable -> L4b
            if (r2 == r0) goto L3b
            r0 = 0
            X.C912070ZqH.LJFF = r0     // Catch: java.lang.Throwable -> L4b
        L37:
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L3b:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L4b
            X.C912070ZqH.LJFF = r0     // Catch: java.lang.Throwable -> L4b
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            com.ss.android.ugc.aweme.service.IIMMediaService r2 = X.C912100ZqK.LIZ()     // Catch: java.lang.Throwable -> L4b
            goto L37
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L57:
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r2)
            if (r0 == 0) goto L63
            long r0 = android.os.SystemClock.elapsedRealtime()
            X.C912070ZqH.LJFF = r0
        L63:
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.IIMMediaService r1 = X.C912100ZqK.LIZ()
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L73
            r2 = r1
        L73:
            com.ss.android.ugc.aweme.service.IIMMediaService r2 = (com.ss.android.ugc.aweme.service.IIMMediaService) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912070ZqH.LIZ():com.ss.android.ugc.aweme.service.IIMMediaService");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.service.IIMMediaService LIZIZ() {
        /*
            com.ss.android.ugc.aweme.service.IIMMediaService r0 = X.C912070ZqH.LIZJ
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.Class<com.ss.android.ugc.aweme.service.IIMMediaService> r0 = com.ss.android.ugc.aweme.service.IIMMediaService.class
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)
            com.ss.android.ugc.aweme.service.IIMMediaService r1 = (com.ss.android.ugc.aweme.service.IIMMediaService) r1
            if (r1 != 0) goto L2c
            boolean r0 = X.C912070ZqH.LIZLLL
            r7 = 1
            if (r0 != 0) goto L3c
            X.1E0m r2 = X.C2274381E0m.LIZIZ
            boolean r0 = X.C10UI.LIZ()
            r1 = r0 ^ 1
            r0 = 0
            boolean r0 = r2.LIZJ(r1, r0)
            if (r0 != 0) goto L3a
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.IIMMediaService r1 = X.C912100ZqK.LIZ()
        L2c:
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.IIMMediaService r0 = X.C912100ZqK.LIZ()
            if (r1 == r0) goto L39
            X.C912070ZqH.LIZJ = r1
        L39:
            return r1
        L3a:
            X.C912070ZqH.LIZLLL = r7
        L3c:
            long r5 = X.C912070ZqH.LJFF
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L59
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L59
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.IIMMediaService r1 = X.C912100ZqK.LIZ()
            goto L2c
        L59:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L80
            boolean r0 = X.C912070ZqH.LJ
            if (r0 != 0) goto L76
            X.C912070ZqH.LJ = r7
            X.0ZqI r1 = new X.0ZqI
            r0 = 0
            r1.<init>(r0)
            X.C20478080m.LIZ(r1)
        L76:
            X.0ZqK r0 = com.ss.android.ugc.aweme.service.IIMMediaService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.service.IIMMediaService r1 = X.C912100ZqK.LIZ()
            goto L2c
        L80:
            com.ss.android.ugc.aweme.service.IIMMediaService r1 = LIZ()
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C912070ZqH.LIZIZ():com.ss.android.ugc.aweme.service.IIMMediaService");
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911630ZpZ LIZLLL() {
        return LIZIZ().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC1383710m6z LJ() {
        return LIZIZ().LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC902170ZaJ LJFF() {
        return LIZIZ().LJFF();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911620ZpY LJIIIIZZ() {
        return LIZIZ().LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final void LJIIIZ() {
        LIZIZ().LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final IIMAIGroupShotAnalytics LJIIL() {
        return LIZIZ().LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final IIMMediaCreativeService LJIILIIL() {
        return LIZIZ().LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911270Zoz LJIILJJIL() {
        return LIZIZ().LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final C0ZHH LJIILL() {
        return LIZIZ().LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC1435520nSY LJIILLIIL() {
        return LIZIZ().LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911930Zq3 LJIIZILJ() {
        return LIZIZ().LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911690Zpf LJIJI() {
        return LIZIZ().LJIJI();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911670Zpd LJIJJ() {
        return LIZIZ().LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC894920Z8w LJIJJLI() {
        return LIZIZ().LJIJJLI();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC911530ZpP LJJIFFI() {
        return LIZIZ().LJJIFFI();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final InterfaceC459020HzI getUiService() {
        return LIZIZ().getUiService();
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final View LJI(Context context) {
        return LIZIZ().LJI(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final String LJII(Context context) {
        return LIZIZ().LJII(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final View LJIIJ(Context context) {
        return LIZIZ().LJIIJ(context);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final Object LJIIJJI(Object obj) {
        return LIZIZ().LJIIJJI(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final Object LJJ(Object obj) {
        return LIZIZ().LJJ(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final Object LJJI(Object obj) {
        return LIZIZ().LJJI(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final AbstractC19484711Kz LJIJ(int i, boolean z) {
        return LIZIZ().LJIJ(i, z);
    }

    @Override // com.ss.android.ugc.aweme.service.IIMMediaService
    public final String LJIL(Context context, int i, String... strArr) {
        return LIZIZ().LJIL(context, i, (String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
