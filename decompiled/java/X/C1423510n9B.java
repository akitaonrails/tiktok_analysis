package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import njp.a;

/* JADX INFO: renamed from: X.0n9B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCategoryFetcher$createFetchCategoriesFlow$1", f = "TemplateTabCategoryFetcher.kt", l = {488}, m = "invokeSuspend")
public final class C1423510n9B extends C09AX implements Function2<C094D<? super C1423660n9Q>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1423490n99 LLILLL;
    public final /* synthetic */ C1423740n9Y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423510n9B(C1423490n99 c1423490n99, C1423740n9Y c1423740n9Y, InterfaceC1364105Vn<? super C1423510n9B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1423490n99;
        this.LLILZ = c1423740n9Y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1423510n9B c1423510n9B = new C1423510n9B(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1423510n9B.LLILLJJLI = obj;
        return c1423510n9B;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1423660n9Q c1423660n9QLIZJ;
        C1C7U.LIZ("TemplateTabCategoryFetcher@9acf.createFetchCategoriesFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            C1423490n99 c1423490n99 = this.LLILLL;
            c1423490n99.LJIILIIL = EnumC1423670n9R.PROGRESS;
            if (c1423490n99.LJIIIIZZ() && (c1423660n9QLIZJ = this.LLILLL.LIZJ(this.LLILZ)) != null) {
                c094d.LJIIIIZZ(c1423660n9QLIZJ);
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final C1423760n9a c1423760n9a = this.LLILZ.LJ;
            InterfaceC1635390sev interfaceC1635390sev = (InterfaceC1635390sev) this.LLILLL.LIZLLL.getValue();
            C1423740n9Y c1423740n9Y = this.LLILZ;
            int i2 = c1423740n9Y.LIZ;
            String str = c1423740n9Y.LIZJ;
            C1423760n9a c1423760n9a2 = c1423740n9Y.LJ;
            String str2 = c1423760n9a2.LIZ;
            C1449490np5 c1449490np5 = C1449490np5.LIZ;
            String str3 = c1423760n9a2.LIZIZ;
            c1449490np5.getClass();
            String strLJIIIZ = C1449490np5.LJIIIZ(str3);
            IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
            if (iToolsDebugGpService != null) {
                iToolsDebugGpService.isOpen();
                Boolean bool = false;
                bool.booleanValue();
            }
            MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo = new MixedAssetsRequestBodyInfo("tt_template", null, null, null, null, str, null, null, null, null, null, str2, null, null, null, null, null, null, null, null, null, null, true, "", strLJIIIZ, "", null, null, null, null, Boolean.FALSE, null, "", null);
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            TemplateScene templateScene = TemplateScene.TEMPLATE_TAB;
            c1429050nI7.getClass();
            Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
            Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
            MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pairLIZJ, "2", c1423760n9a.LIZIZ, null, null, false, null, null, false);
            final C1423740n9Y c1423740n9Y2 = this.LLILZ;
            final C1423490n99 c1423490n992 = this.LLILLL;
            interfaceC1635390sev.LJJI(mixedAssetsQueryAdditionalParameters, "tt_template", i2, mixedAssetsRequestBodyInfo, new IFetchAssetPanelInfo() { // from class: X.0n9C
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetPanelInfo
                public final void onFailed(ExceptionResult exceptionResult) {
                    int errorCode;
                    String msg;
                    String logId;
                    EnumC1423060n8S enumC1423060n8S = EnumC1423060n8S.FETCH_CATEGORY_ERROR;
                    if (exceptionResult != null) {
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        errorCode = 10001;
                    }
                    if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                        msg = "";
                    }
                    boolean z = c1423740n9Y2.LIZIZ;
                    if (exceptionResult != null) {
                        logId = exceptionResult.getLogId();
                    } else {
                        logId = null;
                    }
                    C1422880n8A c1422880n8A = new C1422880n8A(enumC1423060n8S, errorCode, msg, null, z, logId);
                    C1423510n9B.LIZ(c1423490n992, jCurrentTimeMillis, c1423760n9a, c1422880n8A);
                    C094D<C1423660n9Q> c094d2 = c094d;
                    C1423660n9Q c1423660n9QLIZLLL = C1423490n99.LIZLLL(c1423490n992, c1423740n9Y2);
                    if (c1423660n9QLIZLLL == null) {
                        c1423660n9QLIZLLL = new C1423660n9Q(EnumC1423670n9R.FAIL, null, null, c1422880n8A, false);
                    }
                    c094d2.LJIIIIZZ(c1423660n9QLIZLLL);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:59:0x019f  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x01bd A[PHI: r13
                  0x01bd: PHI (r13v3 com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData) = 
                  (r13v2 com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData)
                  (r13v5 com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData)
                 binds: [B:63:0x01b3, B:65:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:80:0x01b1 A[EDGE_INSN: B:80:0x01b1->B:62:0x01b1 BREAK  A[LOOP:3: B:57:0x0199->B:82:?], SYNTHETIC] */
                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse r19) {
                    /*
                        Method dump skipped, instruction units count: 492
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1423520n9C.onSuccess(java.lang.Object):void");
                }
            });
            AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(460);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS210S0000000_22, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.createFetchCategoriesFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.createFetchCategoriesFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C1423660n9Q> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(C1423490n99 c1423490n99, long j, C1423760n9a c1423760n9a, C1422880n8A c1422880n8A) {
        c1423490n99.LJIILIIL = EnumC1423670n9R.FAIL;
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        int i = c1422880n8A.LIZIZ;
        String str = c1422880n8A.LIZJ;
        long jLIZLLL = C1417710mzp.LIZLLL(j);
        String str2 = c1423760n9a.LIZ;
        String str3 = c1423760n9a.LIZIZ;
        String str4 = c1422880n8A.LJFF;
        c1419580n2q.getClass();
        C1419580n2q.LJIIIZ(str, str2, str3, str4, false, jLIZLLL, i);
    }
}
