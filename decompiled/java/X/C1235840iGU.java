package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository;

/* JADX INFO: renamed from: X.0iGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository", f = "InMemorySchoolListRepository.kt", l = {136}, m = "getSchoolList")
public final class C1235840iGU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InMemorySchoolListRepository LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235840iGU(InMemorySchoolListRepository inMemorySchoolListRepository, InterfaceC1364105Vn<? super C1235840iGU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = inMemorySchoolListRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InMemorySchoolListRepository@548f.getSchoolList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object schoolList = this.LLILLJJLI.getSchoolList(this);
        C1C7U.LIZIZ("InMemorySchoolListRepository@548f.getSchoolList$1");
        return schoolList;
    }
}
