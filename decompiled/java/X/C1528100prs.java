package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api.TranslationApi;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0prs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528100prs {
    public static final /* synthetic */ C1528100prs LIZ = new C1528100prs();
    public static final IECRetrofitFactory LIZIZ;
    public static final TranslationApi LIZJ;
    public static final TranslationApi LIZLLL;
    public static final String LJ;

    static {
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        IECRetrofitFactory iECRetrofitFactory = (IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class);
        LIZIZ = iECRetrofitFactory;
        LIZJ = (TranslationApi) iECRetrofitFactory.LIZ("").create(TranslationApi.class);
        LIZLLL = (TranslationApi) iECRetrofitFactory.LIZ("https://api16-normal-alisg.helo-api.com").create(TranslationApi.class);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IAppSettingDependencyService.class.getName(), anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        LJ = ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C1528110prt
            if (r0 == 0) goto L22
            r7 = r11
            X.0prt r7 = (X.C1528110prt) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r6 = 0
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L30
            if (r0 != r5) goto L28
            goto L5c
        L22:
            X.0prt r7 = new X.0prt
            r7.<init>(r9, r11)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            if (r10 == 0) goto L3f
            boolean r0 = kotlin.text.a0.LJJJIL(r10)
            if (r0 != 0) goto L3f
            r0 = 0
        L3c:
            if (r0 == 0) goto L41
            return r4
        L3f:
            r0 = 1
            goto L3c
        L41:
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationContent r0 = new com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationContent     // Catch: java.lang.Exception -> L7a
            r0.<init>(r10)     // Catch: java.lang.Exception -> L7a
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Exception -> L7a
            java.lang.String r3 = X.C1741890vQh.LJIIIIZZ(r0)     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.api.TranslationApi r2 = X.C1528100prs.LIZJ     // Catch: java.lang.Exception -> L7a
            java.lang.String r1 = X.C1528100prs.LJ     // Catch: java.lang.Exception -> L7a
            r7.LLILLL = r5     // Catch: java.lang.Exception -> L7a
            r0 = 2
            java.lang.Object r1 = r2.getTranslation(r1, r3, r0, r7)     // Catch: java.lang.Exception -> L7a
            if (r1 != r8) goto L5f
            return r8
        L5c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7a
        L5f:
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationResponse r1 = (com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslationResponse) r1     // Catch: java.lang.Exception -> L7a
            java.lang.Integer r0 = r1.statusCode     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L79
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L7a
            if (r0 != 0) goto L79
            java.util.List<com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslatedContent> r0 = r1.translatedContentList     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L79
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r6, r0)     // Catch: java.lang.Exception -> L7a
            com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslatedContent r0 = (com.ss.android.ugc.aweme.ecommerce.core.translate.repository.model.TranslatedContent) r0     // Catch: java.lang.Exception -> L7a
            if (r0 == 0) goto L79
            java.lang.String r4 = r0.translatedContent     // Catch: java.lang.Exception -> L7a
        L79:
            return r4
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1528100prs.LIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
