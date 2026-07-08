package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iGQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository$getSchoolList$2$localDownloadJob$1", f = "InMemorySchoolListRepository.kt", l = {79}, m = "invokeSuspend")
public final class C1235800iGQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1217260hmW>>, Object> {
    public int LL;
    public final /* synthetic */ InMemorySchoolListRepository LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235800iGQ(InMemorySchoolListRepository inMemorySchoolListRepository, InterfaceC1364105Vn<? super C1235800iGQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inMemorySchoolListRepository;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1235800iGQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InMemorySchoolListRepository@548f.getSchoolList$2$localDownloadJob$1");
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
            InMemorySchoolListRepository inMemorySchoolListRepository = this.LLILLJJLI;
            this.LL = 1;
            obj = inMemorySchoolListRepository.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$2$localDownloadJob$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZJ = null;
        C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$2$localDownloadJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1217260hmW>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
