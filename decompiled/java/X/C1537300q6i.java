package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor;
import com.ss.android.ugc.aweme.ecommerce.dependency.HybridDependencyService;
import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoFrontUpdateModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.hybrid.IHybridDependencyService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0q6i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.router.EcomGeckoUpdateInterceptor$preloadGeckoForSceneByCommonDispatch$1$1", f = "EcomGeckoUpdateInterceptor.kt", l = {214}, m = "invokeSuspend")
public final class C1537300q6i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C0VSJ LLILLJJLI;
    public Object LLILLL;
    public C1551950qUL LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537300q6i(String str, InterfaceC1364105Vn<? super C1537300q6i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1537300q6i(this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
        String accessKey;
        C0VSJ c0vsj;
        String geckoHost;
        C1551950qUL c1551950qULInitGeckoXMultiClient;
        Set<String> setLLIIJI;
        boolean z;
        String name;
        C1C7U.LIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        if (i != 0) {
            if (i == 1) {
                setLLIIJI = (Set) this.LLILZIL;
                c1551950qULInitGeckoXMultiClient = this.LLILZ;
                geckoHost = (String) this.LLILLL;
                c0vsj = this.LLILLJJLI;
                accessKey = (String) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = HybridDependencyService.createIHybridDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IHybridDependencyService.class.getName();
                if (anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IHybridDependencyService.class);
            }
            IHybridDependencyService iHybridDependencyService = (IHybridDependencyService) anonymousClass0317CreateIHybridDependencyServicebyMonsterPlugin;
            accessKey = iHybridDependencyService.getAccessKey();
            if (accessKey != null && accessKey.length() != 0) {
                c0vsj = new C0VSJ(C7879035x.LIZ().getFilesDir(), iHybridDependencyService.geckoXRootDir());
                geckoHost = iHybridDependencyService.getGeckoHost();
                EcomGeckoUpdateInterceptor.LL.getClass();
                EcomGeckoFrontUpdateModel ecomGeckoFrontUpdateModel = (EcomGeckoFrontUpdateModel) ((Map) EcomGeckoUpdateInterceptor.LLILLJJLI.getValue()).get(this.LLIZ);
                if (ecomGeckoFrontUpdateModel == null) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
                    return unit;
                }
                c1551950qULInitGeckoXMultiClient = iHybridDependencyService.initGeckoXMultiClient();
                if (c1551950qULInitGeckoXMultiClient == null) {
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
                    return unit2;
                }
                C1537290q6h c1537290q6h = new C1537290q6h(this.LLIZ, accessKey, geckoHost);
                EcomGeckoUpdateInterceptor.LLILZ.add(this.LLIZ);
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(ecomGeckoFrontUpdateModel.update, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : listLJJLIIIJILLIZJL) {
                    String str = (String) obj2;
                    Set<String> set = EcomGeckoUpdateInterceptor.LLILZ;
                    if (!set.contains(str)) {
                        if (C1550600qSA.LIZ(accessKey, str)) {
                            c1537290q6h.invoke(str, "LocalNewestVersion", true, null);
                            set.add(str);
                        } else {
                            arrayList.add(obj2);
                        }
                    }
                }
                setLLIIJI = C13LP.LLIIJI(arrayList);
                if (setLLIIJI.isEmpty()) {
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
                    return unit3;
                }
                long j = ecomGeckoFrontUpdateModel.delay;
                this.LL = accessKey;
                this.LLILLJJLI = c0vsj;
                this.LLILLL = geckoHost;
                this.LLILZ = c1551950qULInitGeckoXMultiClient;
                this.LLILZIL = setLLIIJI;
                this.LLILZLL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
                    return objLJFF;
                }
            } else {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
                return unit4;
            }
        }
        final String str2 = this.LLIZ;
        for (final String str3 : setLLIIJI) {
            C1551330qTL.LIZ.getClass();
            if (C1551330qTL.LJIIIIZZ(accessKey, str3)) {
                C1550610qSB.LIZIZ(accessKey, str3);
            } else {
                EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor = EcomGeckoUpdateInterceptor.LL;
                final String str4 = geckoHost;
                final C1551950qUL c1551950qUL = c1551950qULInitGeckoXMultiClient;
                final String str5 = accessKey;
                final C0VSJ c0vsj2 = c0vsj;
                InterfaceC1508110pLd interfaceC1508110pLd = new InterfaceC1508110pLd() { // from class: X.0q6j
                    @Override // X.InterfaceC1508110pLd
                    public final InterfaceC1508150pLh LIZ(C1508120pLe c1508120pLe) {
                        EcomGeckoUpdateInterceptor ecomGeckoUpdateInterceptor2 = EcomGeckoUpdateInterceptor.LL;
                        String str6 = str2;
                        C1537330q6l c1537330q6l = new C1537330q6l(str5, c0vsj2, str4, c1551950qUL);
                        String str7 = str3;
                        ecomGeckoUpdateInterceptor2.getClass();
                        EcomGeckoUpdateInterceptor.LIZ(str6, c1537330q6l, null, str7, c1508120pLe, true);
                        return new InterfaceC1508150pLh() { // from class: X.0q6m
                            @Override // X.InterfaceC1508150pLh
                            public final void LIZ() {
                            }
                        };
                    }
                };
                ecomGeckoUpdateInterceptor.getClass();
                EcomGeckoUpdateInterceptor.LIZIZ(str2, str3, interfaceC1508110pLd);
            }
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("EcomGeckoUpdateInterceptor@8673.preloadGeckoForSceneByCommonDispatch$1$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
