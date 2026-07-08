package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.service.IDogfoodFeedbackService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService$openFeedbackPage$1", f = "ScreenShotFeedbackService.kt", l = {140, 142, 165, 165, 165}, m = "invokeSuspend")
public final class C1410470mo9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ ScreenShotFeedbackService LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C0XI4 LLILZLL;
    public final /* synthetic */ IDogfoodFeedbackService LLIZ;
    public final /* synthetic */ Aweme LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410470mo9(boolean z, ScreenShotFeedbackService screenShotFeedbackService, Context context, C0XI4 c0xi4, IDogfoodFeedbackService iDogfoodFeedbackService, Aweme aweme, InterfaceC1364105Vn<? super C1410470mo9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = screenShotFeedbackService;
        this.LLILZIL = context;
        this.LLILZLL = c0xi4;
        this.LLIZ = iDogfoodFeedbackService;
        this.LLIZLLLIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410470mo9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1410470mo9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
