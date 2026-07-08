package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository$getSchoolList$2", f = "InMemorySchoolListRepository.kt", l = {84, 86}, m = "invokeSuspend")
public final class C1235810iGR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1217260hmW>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InMemorySchoolListRepository LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235810iGR(InMemorySchoolListRepository inMemorySchoolListRepository, InterfaceC1364105Vn<? super C1235810iGR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = inMemorySchoolListRepository;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1235810iGR c1235810iGR = new C1235810iGR(this.LLILLL, interfaceC1364105Vn);
        c1235810iGR.LLILLJJLI = obj;
        return c1235810iGR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InMemorySchoolListRepository@548f.getSchoolList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            InMemorySchoolListRepository inMemorySchoolListRepository = this.LLILLL;
            List<C1217260hmW> list = inMemorySchoolListRepository.LIZIZ;
            if (list != null) {
                C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$2");
                return list;
            }
            C099G c099g = inMemorySchoolListRepository.LIZJ;
            if (c099g == null) {
                C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1235800iGQ(inMemorySchoolListRepository, null), 3);
                this.LLILLL.LIZJ = c099gLIZIZ;
                this.LL = 1;
                obj = c099gLIZIZ.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$2");
                    return objLJFF;
                }
            } else {
                this.LL = 2;
                obj = c099g.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$2");
                    return objLJFF;
                }
            }
        }
        C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1217260hmW>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
