package X;

/* JADX INFO: renamed from: X.0i3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.newconversation.FriendContentTabDataSourceProtocol", f = "FriendContentTabDataSourceProtocol.kt", l = {151}, m = "refreshMuf-IoAF18A")
public final class C1228080i3y extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1228060i3w LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228080i3y(C1228060i3w c1228060i3w, InterfaceC1364105Vn<? super C1228080i3y> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1228060i3w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FriendContentTabDataSourceProtocol@b484.refreshMuf$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJJL = this.LLILLL.LJJJJJL(this);
        if (objLJJJJJL == C099R.LJFF()) {
            C1C7U.LIZIZ("FriendContentTabDataSourceProtocol@b484.refreshMuf$1");
            return objLJJJJJL;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJJJJJL);
        C1C7U.LIZIZ("FriendContentTabDataSourceProtocol@b484.refreshMuf$1");
        return c189200o6M1boximpl;
    }
}
