package X;

import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.service.IDogfoodFeedbackService;

/* JADX INFO: renamed from: X.0moA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService", f = "ScreenShotFeedbackService.kt", l = {187}, m = "addDogfoodFlowParameters")
public final class C1410480moA extends AbstractC23140094w {
    public Object LL;
    public IDogfoodFeedbackService LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ScreenShotFeedbackService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410480moA(ScreenShotFeedbackService screenShotFeedbackService, InterfaceC1364105Vn<? super C1410480moA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = screenShotFeedbackService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenShotFeedbackService@5b9a.addDogfoodFlowParameters$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objAddDogfoodFlowParameters = this.LLILZ.addDogfoodFlowParameters(null, null, null, null, this);
        C1C7U.LIZIZ("ScreenShotFeedbackService@5b9a.addDogfoodFlowParameters$1");
        return objAddDogfoodFlowParameters;
    }
}
