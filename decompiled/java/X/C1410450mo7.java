package X;

import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService$dogfoodUploadFlow$3$1", f = "ScreenShotFeedbackService.kt", l = {}, m = "invokeSuspend")
public final class C1410450mo7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ ScreenShotFeedbackService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410450mo7(Throwable th, ScreenShotFeedbackService screenShotFeedbackService, InterfaceC1364105Vn<? super C1410450mo7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
        this.LLILLJJLI = screenShotFeedbackService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410450mo7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ScreenShotFeedbackService@5b9a.dogfoodUploadFlow$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.safelyDismissDialogIfNeed();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScreenShotFeedbackService@5b9a.dogfoodUploadFlow$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
