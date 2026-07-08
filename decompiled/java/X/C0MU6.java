package X;

import com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl;

/* JADX INFO: renamed from: X.0MU6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl", f = "AITheaterAutoTaskServiceImpl.kt", l = {420, 439, 441}, m = "saveDraft")
public final class C0MU6 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ AITheaterAutoTaskServiceImpl LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MU6(AITheaterAutoTaskServiceImpl aITheaterAutoTaskServiceImpl, InterfaceC1364105Vn<? super C0MU6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = aITheaterAutoTaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AITheaterAutoTaskServiceImpl@5fbc.saveDraft$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objSaveDraft = this.LLILZLL.saveDraft(null, null, null, null, this);
        C1C7U.LIZIZ("AITheaterAutoTaskServiceImpl@5fbc.saveDraft$1");
        return objSaveDraft;
    }
}
