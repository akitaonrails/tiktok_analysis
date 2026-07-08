package X;

import Y.ACListenerS161S0100000_27;
import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.ss.android.ugc.aweme.live.toplives.watchlater.StreamCardCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.audience.WatchLaterHistoryResp;

/* JADX INFO: renamed from: X.0y2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.toplives.watchlater.StreamCardCell$register$1", f = "WatchLaterHistoryCells.kt", l = {274}, m = "invokeSuspend")
public final class C1842320y2g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ StreamCardCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1842320y2g(long j, StreamCardCell streamCardCell, InterfaceC1364105Vn<? super C1842320y2g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = streamCardCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1842320y2g(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        WatchLaterHistoryResp.Item item;
        LiveEventInfo liveEventInfo;
        C1C7U.LIZ("StreamCardCell@bb36.register$1");
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
            String strValueOf = String.valueOf(this.LLILLJJLI);
            this.LL = 1;
            obj = iLiveEventService.ZC2(strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StreamCardCell@bb36.register$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C993630bxp item2 = this.LLILLL.getItem();
            if (item2 != null && (item = item2.LL) != null && (liveEventInfo = item.upcomingLiveEvent) != null) {
                liveEventInfo.subscribed = true;
            }
            this.LLILLL.N5().setText(this.LLILLL.itemView.getContext().getString(2131856894));
            this.LLILLL.N5().setButtonVariant(1);
            C786410Ut5.U8(this.LLILLL.N5(), new ACListenerS161S0100000_27(this.LLILLL, 50));
        } else {
            ((ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class)).oe0(this.LLILLL.itemView.getContext(), null, true, false, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreamCardCell@bb36.register$1");
        return unit;
    }
}
