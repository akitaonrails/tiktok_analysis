package X;

import com.bytedance.android.livesdk.comp.api.event.api.data.EventStruct;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11wJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget$requestLiveEventDetail$1$1", f = "LiveEventStickerWrapperWidget.kt", l = {}, m = "invokeSuspend")
public final class C19662111wJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19663611wY LL;
    public final /* synthetic */ EventStruct LLILLJJLI;
    public final /* synthetic */ LiveEventStickerWrapperWidget LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19662111wJ(C19663611wY c19663611wY, EventStruct eventStruct, LiveEventStickerWrapperWidget liveEventStickerWrapperWidget, InterfaceC1364105Vn<? super C19662111wJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19663611wY;
        this.LLILLJJLI = eventStruct;
        this.LLILLL = liveEventStickerWrapperWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19662111wJ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19663611wY c19663611wY = this.LL;
        EventStruct eventStruct = this.LLILLJJLI;
        c19663611wY.LJIIJJI = eventStruct.isPaidEvent;
        c19663611wY.LJIIJ = eventStruct.hasSubscribed;
        this.LLILLL.B1(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventStickerWrapperWidget@dd57.requestLiveEventDetail$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
