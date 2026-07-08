package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationCreateServiceImpl;

/* JADX INFO: renamed from: X.058E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.request.preload.CelebrationCreateServiceImpl", f = "CelebrationCreateServiceImpl.kt", l = {223}, m = "reportCelebrationEvent")
public final class C058E extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CelebrationCreateServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058E(CelebrationCreateServiceImpl celebrationCreateServiceImpl, InterfaceC1364105Vn<? super C058E> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = celebrationCreateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CelebrationCreateServiceImpl@57dc.reportCelebrationEvent$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objReportCelebrationEvent = this.LLILLJJLI.reportCelebrationEvent(0, 0, this);
        C1C7U.LIZIZ("CelebrationCreateServiceImpl@57dc.reportCelebrationEvent$1");
        return objReportCelebrationEvent;
    }
}
