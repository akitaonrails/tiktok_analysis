package X;

import com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl;

/* JADX INFO: renamed from: X.0MU8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl", f = "AITheaterAutoTaskServiceImpl.kt", l = {448}, m = "getAutoTaskInfo")
public final class C0MU8 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AITheaterAutoTaskServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MU8(AITheaterAutoTaskServiceImpl aITheaterAutoTaskServiceImpl, InterfaceC1364105Vn<? super C0MU8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = aITheaterAutoTaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterAutoTaskServiceImpl@5fbc.getAutoTaskInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object autoTaskInfo = this.LLILLJJLI.getAutoTaskInfo(this);
        C1C7U.LIZIZ("AITheaterAutoTaskServiceImpl@5fbc.getAutoTaskInfo$1");
        return autoTaskInfo;
    }
}
