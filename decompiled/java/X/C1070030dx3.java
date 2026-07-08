package X;

import com.ss.android.ugc.aweme.relation.ffp.FfpSearchApiImpl;

/* JADX INFO: renamed from: X.0dx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.FfpSearchApiImpl", f = "FfpSearchApiImpl.kt", l = {51}, m = "searchFriends-0E7RQCE")
public final class C1070030dx3 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public FfpSearchApiImpl LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ FfpSearchApiImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070030dx3(FfpSearchApiImpl ffpSearchApiImpl, InterfaceC1364105Vn<? super C1070030dx3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = ffpSearchApiImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FfpSearchApiImpl@fb6c.searchFriends$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("FfpSearchApiImpl@fb6c.searchFriends$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("FfpSearchApiImpl@fb6c.searchFriends$1");
        return c189200o6M1boximpl;
    }
}
