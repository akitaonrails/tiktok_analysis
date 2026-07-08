package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.ability.ISearchSuggestContextAbilityNew;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.SuggestAssemViewModel$fetchGuessDataFix$1$2", f = "SuggestAssemViewModel.kt", l = {464}, m = "invokeSuspend")
public final class C673300Qb2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SuggestAssemViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C0QCO LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673300Qb2(SuggestAssemViewModel suggestAssemViewModel, boolean z, C259800zU<String> c259800zU, Map<String, Object> map, long j, C259800zU<String> c259800zU2, C0QCO c0qco, InterfaceC1364105Vn<? super C673300Qb2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = suggestAssemViewModel;
        this.LLILLL = z;
        this.LLILZ = c259800zU;
        this.LLILZIL = map;
        this.LLILZLL = j;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = c0qco;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673300Qb2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0QER c0qer;
        Object obj2;
        Integer num;
        Integer dmaConsentStatus;
        C0QER c0qer2;
        C1C7U.LIZ("SuggestAssemViewModel@b236.fetchGuessDataFix$1$2");
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
            SuggestAssemViewModel suggestAssemViewModel = this.LLILLJJLI;
            InterfaceC673410QbD interfaceC673410QbD = (InterfaceC673410QbD) suggestAssemViewModel.DQ2().getOperator();
            SuggestAssemViewModel suggestAssemViewModel2 = this.LLILLJJLI;
            C0QWJ c0qwj = suggestAssemViewModel2.LLILLL;
            T t = 0;
            if (c0qwj != null) {
                c0qer = c0qwj.LIZ;
            } else {
                c0qer = null;
            }
            boolean z = this.LLILLL;
            String str = this.LLILZ.element;
            C0QWI c0qwi = suggestAssemViewModel2.LLJIJIL;
            boolean z2 = suggestAssemViewModel2.LLILZIL;
            ISearchSuggestContextAbilityNew iSearchSuggestContextAbilityNew = suggestAssemViewModel2.LLIZLLLIL;
            Map<String, Object> map = this.LLILZIL;
            if (map != null) {
                obj2 = map.get("isNonPersonalized");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            Integer numLJ = C2286608xc.LJ(C683760Qru.LIZIZ(num, EnumC683800Qry.TT_DSA_SEARCH_CONSENT));
            C0QWJ c0qwj2 = this.LLILLJJLI.LLILLL;
            if (c0qwj2 != null && (c0qer2 = c0qwj2.LIZ) != null) {
                dmaConsentStatus = c0qer2.getDmaConsentStatus();
            } else {
                dmaConsentStatus = null;
            }
            Integer numLJ2 = C2286608xc.LJ(C683760Qru.LIZIZ(dmaConsentStatus, EnumC683800Qry.TT_DMA_CONSENT));
            SuggestAssemViewModel suggestAssemViewModel3 = this.LLILLJJLI;
            suggestAssemViewModel.LLJILJILJ = interfaceC673410QbD.LJLLLLLL(c0qer, z, str, c0qwi, z2, iSearchSuggestContextAbilityNew, numLJ, numLJ2, !suggestAssemViewModel3.LL, suggestAssemViewModel3.LLJ, suggestAssemViewModel3.LLJJIJI);
            try {
                C259800zU<String> c259800zU = this.LLIZ;
                ListenableFuture<String> listenableFuture = this.LLILLJJLI.LLJILJILJ;
                if (listenableFuture != null) {
                    t = listenableFuture.get();
                }
                c259800zU.element = t;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C673290Qb1 c673290Qb1 = new C673290Qb1(this.LLIZ, this.LLILLJJLI, this.LLILZLL, this.LLIZLLLIL, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c673290Qb1) == objLJFF) {
                C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchGuessDataFix$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SuggestAssemViewModel@b236.fetchGuessDataFix$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
