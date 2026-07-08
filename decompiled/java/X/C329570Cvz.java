package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchProsConsRepo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.vm.SearchProsConsTabAssemViewModel$requestData$1", f = "SearchProsConsTabAssemViewModel.kt", l = {341, 342, 357}, m = "invokeSuspend")
public final class C329570Cvz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EnumC329590Cw1 LLILLJJLI;
    public final /* synthetic */ SearchProsConsTabAssemViewModel LLILLL;
    public final /* synthetic */ C329660Cw8 LLILZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Integer>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C329570Cvz(EnumC329590Cw1 enumC329590Cw1, SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel, C329660Cw8 c329660Cw8, InterfaceC1364105Vn<? super AbstractC316870CbV<Integer>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C329570Cvz> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = enumC329590Cw1;
        this.LLILLL = searchProsConsTabAssemViewModel;
        this.LLILZ = c329660Cw8;
        this.LLILZIL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C329570Cvz(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZIZ;
        Object c316640Cb8;
        C1C7U.LIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            objLIZIZ = ((C189200o6) obj).m10unboximpl();
        } else {
            C155000ia.LIZIZ(obj);
            int iOrdinal = this.LLILLJJLI.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    SearchProsConsRepo searchProsConsRepo = this.LLILLL.LLILLJJLI;
                    C329660Cw8 c329660Cw8 = this.LLILZ;
                    this.LL = 2;
                    objLIZIZ = searchProsConsRepo.LIZ(c329660Cw8, this);
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1");
                        return objLJFF;
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                SearchProsConsRepo searchProsConsRepo2 = this.LLILLL.LLILLJJLI;
                C329660Cw8 c329660Cw82 = this.LLILZ;
                this.LL = 1;
                objLIZIZ = searchProsConsRepo2.LIZIZ(c329660Cw82, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1");
                    return objLJFF;
                }
            }
        }
        InterfaceC1364105Vn<AbstractC316870CbV<Integer>> interfaceC1364105Vn = this.LLILZIL;
        SearchProsConsTabAssemViewModel searchProsConsTabAssemViewModel = this.LLILLL;
        EnumC329590Cw1 enumC329590Cw1 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZIZ);
        if (thM5exceptionOrNullimpl == null) {
            C329560Cvy c329560Cvy = (C329560Cvy) objLIZIZ;
            List<InterfaceC329670Cw9> list = c329560Cvy.LIZJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC329670Cw9> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C329880CwU.LIZ(it2.next()));
            }
            if (c329560Cvy.LIZIZ) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Integer numLJ = C2286608xc.LJ(arrayList.size());
                c317290CcB.getClass();
                c316640Cb8 = new C323380Cm0(null, numLJ, arrayList);
            } else {
                AbstractC316870CbV.LIZ.getClass();
                c316640Cb8 = new C316640Cb8(arrayList);
            }
            C189200o6.m2constructorimpl(c316640Cb8);
            interfaceC1364105Vn.resumeWith(c316640Cb8);
            C09U0 c09u0 = searchProsConsTabAssemViewModel.LLILLL;
            if (c09u0 == null) {
                synchronized (searchProsConsTabAssemViewModel) {
                    c09u0 = searchProsConsTabAssemViewModel.LLILLL;
                    if (c09u0 == null) {
                        c09u0 = (C09U0) C1807670x8n.p();
                        searchProsConsTabAssemViewModel.LLILLL = c09u0;
                    }
                }
            }
            AbstractC2252651DEx abstractC2252651DEx = c09u0.LIZJ;
            C329580Cw0 c329580Cw0 = new C329580Cw0(searchProsConsTabAssemViewModel, enumC329590Cw1, arrayList, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2252651DEx, c329580Cw0) == objLJFF) {
                C1C7U.LIZIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1");
                return objLJFF;
            }
        } else {
            AbstractC316870CbV.LIZ.getClass();
            C316650Cb9 c316650Cb9 = new C316650Cb9((Exception) thM5exceptionOrNullimpl);
            C189200o6.m2constructorimpl(c316650Cb9);
            interfaceC1364105Vn.resumeWith(c316650Cb9);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchProsConsTabAssemViewModel@a84f.requestData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
