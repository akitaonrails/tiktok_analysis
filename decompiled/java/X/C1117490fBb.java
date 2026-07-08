package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget$requestPreviewStickerInfo$1$1", f = "LiveEventStickerPreviewWrapperWidget.kt", l = {}, m = "invokeSuspend")
public final class C1117490fBb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEventStickerPreviewWrapperWidget LL;
    public final /* synthetic */ RoomEventMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1117490fBb(LiveEventStickerPreviewWrapperWidget liveEventStickerPreviewWrapperWidget, RoomEventMessage roomEventMessage, InterfaceC1364105Vn<? super C1117490fBb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEventStickerPreviewWrapperWidget;
        this.LLILLJJLI = roomEventMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1117490fBb(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.G1(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
