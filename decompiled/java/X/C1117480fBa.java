package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.network.ILiveEventStickerApi;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget$requestPreviewStickerInfo$1", f = "LiveEventStickerPreviewWrapperWidget.kt", l = {47, 48}, m = "invokeSuspend")
public final class C1117480fBa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEventStickerPreviewWrapperWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1117480fBa(LiveEventStickerPreviewWrapperWidget liveEventStickerPreviewWrapperWidget, InterfaceC1364105Vn<? super C1117480fBa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEventStickerPreviewWrapperWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1117480fBa(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1117450fBX c1117450fBX = ILiveEventStickerApi.LIZ;
            this.LL = 1;
            obj = c1117450fBX.LIZJ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1117490fBb c1117490fBb = new C1117490fBb(this.LLILLJJLI, (RoomEventMessage) obj, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1117490fBb) == objLJFF) {
            C1C7U.LIZIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveEventStickerPreviewWrapperWidget@c9d8.requestPreviewStickerInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
