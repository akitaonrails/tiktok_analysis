package X;

import com.bytedance.android.livesdk.comp.api.event.ILiveEventService;
import com.bytedance.android.livesdk.comp.api.event.api.data.EventDetailData;
import com.bytedance.android.livesdk.comp.api.event.api.data.EventStruct;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11wI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget$requestLiveEventDetail$1", f = "LiveEventStickerWrapperWidget.kt", l = {321, 325, 327}, m = "invokeSuspend")
public final class C19662011wI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C19663611wY LLILLL;
    public final /* synthetic */ LiveEventStickerWrapperWidget LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19662011wI(long j, C19663611wY c19663611wY, LiveEventStickerWrapperWidget liveEventStickerWrapperWidget, InterfaceC1364105Vn<? super C19662011wI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c19663611wY;
        this.LLILZ = liveEventStickerWrapperWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19662011wI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EventDetailData eventDetailData;
        EventStruct eventStruct;
        C1C7U.LIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                eventDetailData = (EventDetailData) obj;
                if (eventDetailData == null && (eventStruct = eventDetailData.event) != null) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C19662111wJ c19662111wJ = new C19662111wJ(this.LLILLL, eventStruct, this.LLILZ, null);
                    this.LL = 3;
                    if (C23250099c.LJI(this, abstractC2238408pq, c19662111wJ) == objLJFF) {
                        C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
                        return objLJFF;
                    }
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
                    return unit2;
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
                return unit3;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            if (j > 0) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
                    return objLJFF;
                }
            }
        }
        ILiveEventService iLiveEventService = (ILiveEventService) C1161920gLG.LIZJ(ILiveEventService.class);
        String strValueOf = String.valueOf(this.LLILLL.LIZLLL);
        this.LL = 2;
        obj = iLiveEventService.mk2(strValueOf, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
            return objLJFF;
        }
        eventDetailData = (EventDetailData) obj;
        if (eventDetailData == null) {
        }
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
