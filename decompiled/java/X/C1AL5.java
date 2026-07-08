package X;

import com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService;

/* JADX INFO: renamed from: X.1AL5, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService", f = "LiveEventService.kt", l = {100}, m = "reportPreviewInfo$suspendImpl")
public final class C1AL5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ LiveEventService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AL5(LiveEventService liveEventService, InterfaceC1364105Vn<? super C1AL5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = liveEventService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventService@c236.reportPreviewInfo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = LiveEventService.LIZIZ(this.LLILLJJLI, null, null, false, this);
        C1C7U.LIZIZ("LiveEventService@c236.reportPreviewInfo$1");
        return objLIZIZ;
    }
}
