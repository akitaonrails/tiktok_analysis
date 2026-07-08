package X;

import com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService;

/* JADX INFO: renamed from: X.1AL3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.event.service.LiveEventService", f = "LiveEventService.kt", l = {76}, m = "registerLiveEvent$suspendImpl")
public final class C1AL3 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveEventService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AL3(LiveEventService liveEventService, InterfaceC1364105Vn<? super C1AL3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = liveEventService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventService@c236.registerLiveEvent$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = LiveEventService.LIZ(this.LLILLL, null, this);
        C1C7U.LIZIZ("LiveEventService@c236.registerLiveEvent$1");
        return objLIZ;
    }
}
