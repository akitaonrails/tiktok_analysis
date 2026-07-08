package X;

import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Lh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.service.AITheaterCreationLauncherImpl", f = "AITheaterCreationLauncherImpl.kt", l = {128}, m = "tryRedirectToAISelfRecord")
public final class C549660Lh6 extends AbstractC23140094w {
    public Object LL;
    public IAITheaterCreationLauncher.EnterParams LLILLJJLI;
    public Object LLILLL;
    public Function0 LLILZ;
    public InterfaceC1659430tHh LLILZIL;
    public AITheaterProfileService LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C549650Lh5 LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C549660Lh6(C549650Lh5 c549650Lh5, InterfaceC1364105Vn<? super C549660Lh6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c549650Lh5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterCreationLauncherImpl@c251.tryRedirectToAISelfRecord$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLIZLLLIL.LJIIIIZZ(null, null, null, null, this);
        C1C7U.LIZIZ("AITheaterCreationLauncherImpl@c251.tryRedirectToAISelfRecord$1");
        return objLJIIIIZZ;
    }
}
