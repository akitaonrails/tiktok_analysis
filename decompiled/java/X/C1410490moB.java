package X;

import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.service.UploadResponse;

/* JADX INFO: renamed from: X.0moB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService", f = "ScreenShotFeedbackService.kt", l = {332, 335, 337, 339}, m = "dogfoodUploadFlow")
public final class C1410490moB extends AbstractC23140094w {
    public Object LL;
    public UploadResponse LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ScreenShotFeedbackService LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410490moB(ScreenShotFeedbackService screenShotFeedbackService, InterfaceC1364105Vn<? super C1410490moB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = screenShotFeedbackService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenShotFeedbackService@5b9a.dogfoodUploadFlow$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objDogfoodUploadFlow = this.LLILZ.dogfoodUploadFlow(null, this);
        C1C7U.LIZIZ("ScreenShotFeedbackService@5b9a.dogfoodUploadFlow$1");
        return objDogfoodUploadFlow;
    }
}
