package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl;

/* JADX INFO: renamed from: X.0MU4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterAutoTaskServiceImpl", f = "AITheaterAutoTaskServiceImpl.kt", l = {467}, m = "buildAIGCCreativeModel")
public final class C0MU4 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public User LLILZIL;
    public Object LLILZLL;
    public InterfaceC550750Lir LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ AITheaterAutoTaskServiceImpl LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MU4(AITheaterAutoTaskServiceImpl aITheaterAutoTaskServiceImpl, InterfaceC1364105Vn<? super C0MU4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = aITheaterAutoTaskServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterAutoTaskServiceImpl@5fbc.buildAIGCCreativeModel$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objBuildAIGCCreativeModel = this.LLJ.buildAIGCCreativeModel(null, null, null, null, this);
        C1C7U.LIZIZ("AITheaterAutoTaskServiceImpl@5fbc.buildAIGCCreativeModel$1");
        return objBuildAIGCCreativeModel;
    }
}
