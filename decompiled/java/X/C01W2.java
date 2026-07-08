package X;

import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01W2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.ui.PaidEventManager$reportPreviewStatus$2$1$1$1", f = "PaidEventManager.kt", l = {99}, m = "invokeSuspend")
public final class C01W2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01W2(Room room, boolean z, InterfaceC1364105Vn<? super C01W2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = room;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01W2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        C1C7U.LIZ("PaidEventManager@f316.reportPreviewStatus$2$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ILiveEventService iLiveEventService = (ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class);
            LiveEventInfo liveEventInfo = this.LLILLJJLI.liveEventInfo;
            if (liveEventInfo != null) {
                l = liveEventInfo.eventId;
            } else {
                l = null;
            }
            String strValueOf = String.valueOf(l);
            String strValueOf2 = String.valueOf(this.LLILLJJLI.getId());
            boolean z = this.LLILLL;
            this.LL = 1;
            if (iLiveEventService.reportPreviewInfo(strValueOf, strValueOf2, z, this) == objLJFF) {
                C1C7U.LIZIZ("PaidEventManager@f316.reportPreviewStatus$2$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaidEventManager@f316.reportPreviewStatus$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
