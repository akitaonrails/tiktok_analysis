package X;

import com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl;

/* JADX INFO: renamed from: X.0MU7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl", f = "AITheaterAutoTaskServiceImpl.kt", l = {302, 314, 342, 344, 345}, m = "runCheckAutoTask")
public final class C0MU7 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC550750Lir LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AITheaterAutoTaskServiceImpl LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MU7(AITheaterAutoTaskServiceImpl aITheaterAutoTaskServiceImpl, InterfaceC1364105Vn<? super C0MU7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aITheaterAutoTaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterAutoTaskServiceImpl@5fbc.runCheckAutoTask$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objRunCheckAutoTask = this.LLILZIL.runCheckAutoTask(null, null, this);
        C1C7U.LIZIZ("AITheaterAutoTaskServiceImpl@5fbc.runCheckAutoTask$1");
        return objRunCheckAutoTask;
    }
}
