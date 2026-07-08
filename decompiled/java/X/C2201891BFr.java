package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBaseInfo;

/* JADX INFO: renamed from: X.1BFr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.data.dao.room.IMUserBaseInfoDaoBase", f = "IMUserBaseInfoDaoBase.kt", l = {53}, m = "handleInsertingUser")
public final class C2201891BFr extends AbstractC23140094w {
    public IMUserBaseInfo LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2201851BFn LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201891BFr(C2201851BFn c2201851BFn, InterfaceC1364105Vn<? super C2201891BFr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2201851BFn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserBaseInfoDaoBase@847c.handleInsertingUser$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIJ = this.LLILLL.LJIJ(null, this);
        C1C7U.LIZIZ("IMUserBaseInfoDaoBase@847c.handleInsertingUser$1");
        return objLJIJ;
    }
}
