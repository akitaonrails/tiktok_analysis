package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11we, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19664211we extends C2217421BqW implements Function1<C19663611wY, Unit> {
    public C19664211we(Object obj) {
        super(1, obj, LiveEventStickerPreviewWrapperWidget.class, "addLiveEventSticker", "addLiveEventSticker(Lcom/bytedance/android/livesdk/comp/impl/liveeventsticker/data/LiveEventSticker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19663611wY c19663611wY) {
        C19663611wY c19663611wY2 = c19663611wY;
        LiveEventStickerPreviewWrapperWidget liveEventStickerPreviewWrapperWidget = (LiveEventStickerPreviewWrapperWidget) this.receiver;
        C19665511wr c19665511wr = liveEventStickerPreviewWrapperWidget.LLILZLL;
        if (c19665511wr != null) {
            c19665511wr.LJI(c19663611wY2, new C19664011wc(liveEventStickerPreviewWrapperWidget), new C19665111wn(liveEventStickerPreviewWrapperWidget));
        }
        return Unit.LIZ;
    }
}
