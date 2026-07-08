package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iGT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository$prefetchList$1", f = "InMemorySchoolListRepository.kt", l = {}, m = "invokeSuspend")
public final class C1235830iGT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InMemorySchoolListRepository LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235830iGT(InMemorySchoolListRepository inMemorySchoolListRepository, InterfaceC1364105Vn<? super C1235830iGT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inMemorySchoolListRepository;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1235830iGT c1235830iGT = new C1235830iGT(this.LLILLJJLI, interfaceC1364105Vn);
        c1235830iGT.LL = obj;
        return c1235830iGT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InMemorySchoolListRepository@548f.prefetchList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        InMemorySchoolListRepository inMemorySchoolListRepository = this.LLILLJJLI;
        if (inMemorySchoolListRepository.LIZIZ == null && inMemorySchoolListRepository.LIZJ == null) {
            inMemorySchoolListRepository.LIZJ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1235820iGS(inMemorySchoolListRepository, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InMemorySchoolListRepository@548f.prefetchList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
