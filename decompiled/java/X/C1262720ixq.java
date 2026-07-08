package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0ixq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafRelatedSource", f = "MafRelatedSource.kt", l = {48, BaseNotice.RECOMMEND_LIVE}, m = "getRelatedUserList")
public final class C1262720ixq extends AbstractC23140094w {
    public C1261860iwS LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1262710ixp LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1262720ixq(C1262710ixp c1262710ixp, InterfaceC1364105Vn<? super C1262720ixq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1262710ixp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafRelatedSource@f17a.getRelatedUserList$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, this);
        C1C7U.LIZIZ("MafRelatedSource@f17a.getRelatedUserList$1");
        return objLIZ;
    }
}
