package X;

import Y.AgS289S0100000_8;

/* JADX INFO: renamed from: X.0LX9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskDataUtilsKt$toTaskInfo$$inlined$map$1$2", f = "CreationAsyncTaskDataUtils.kt", l = {223}, m = "emit")
public final class C0LX9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS289S0100000_8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LX9(AgS289S0100000_8 agS289S0100000_8, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS289S0100000_8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskDataUtilsKt@2fec.toTaskInfo$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("CreationAsyncTaskDataUtilsKt@2fec.toTaskInfo$$inlined$map$1$2$1");
        return objEmit;
    }
}
