package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.01py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.GateFlow", f = "DataGate.kt", l = {BaseNotice.CREATOR}, m = "awaitOrNull")
public final class C455601py extends AbstractC23140094w {
    public Object LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C455501px<Object> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C455601py(C455501px<Object> c455501px, InterfaceC1364105Vn<? super C455601py> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c455501px;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GateFlow@752a.awaitOrNull$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(0L, null, this);
        C1C7U.LIZIZ("GateFlow@752a.awaitOrNull$1");
        return objLIZ;
    }
}
