package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0daq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.perf.FFPLoadBehavior", f = "FFPLoadBehavior.kt", l = {BaseNotice.CREATOR}, m = "invokeContactAPI")
public final class C1056260daq<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1056250dap LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056260daq(C1056250dap c1056250dap, InterfaceC1364105Vn<? super C1056260daq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1056250dap;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FFPLoadBehavior@faad.invokeContactAPI$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this, null);
        C1C7U.LIZIZ("FFPLoadBehavior@faad.invokeContactAPI$1");
        return objLIZIZ;
    }
}
