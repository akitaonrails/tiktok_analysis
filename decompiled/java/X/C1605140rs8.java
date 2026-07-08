package X;

/* JADX INFO: renamed from: X.0rs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostInnerCacheManager", f = "SchoolPostInnerCacheManager.kt", l = {57}, m = "waitForPreload")
public final class C1605140rs8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1605120rs6 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605140rs8(C1605120rs6 c1605120rs6, InterfaceC1364105Vn<? super C1605140rs8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1605120rs6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolPostInnerCacheManager@c063.waitForPreload$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("SchoolPostInnerCacheManager@c063.waitForPreload$1");
        return objLIZIZ;
    }
}
