package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository;

/* JADX INFO: renamed from: X.0iGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.datasource.InMemorySchoolListRepository", f = "InMemorySchoolListRepository.kt", l = {110}, m = "downloadSchoolList")
public final class C1235850iGV extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InMemorySchoolListRepository LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1235850iGV(InMemorySchoolListRepository inMemorySchoolListRepository, InterfaceC1364105Vn<? super C1235850iGV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = inMemorySchoolListRepository;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InMemorySchoolListRepository@548f.downloadSchoolList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(this);
        C1C7U.LIZIZ("InMemorySchoolListRepository@548f.downloadSchoolList$1");
        return objLIZIZ;
    }
}
