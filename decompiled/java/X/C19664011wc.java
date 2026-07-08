package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerPreviewWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19664011wc extends C2217421BqW implements Function1<C19663611wY, Unit> {
    public C19664011wc(LiveEventStickerPreviewWrapperWidget liveEventStickerPreviewWrapperWidget) {
        super(1, liveEventStickerPreviewWrapperWidget, LiveEventStickerPreviewWrapperWidget.class, "onAddStickerSuccess", "onAddStickerSuccess(Lcom/bytedance/android/livesdk/comp/impl/liveeventsticker/data/LiveEventSticker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19663611wY c19663611wY) {
        ((LiveEventStickerPreviewWrapperWidget) this.receiver).H1(c19663611wY);
        return Unit.LIZ;
    }
}
