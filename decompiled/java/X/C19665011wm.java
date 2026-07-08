package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19665011wm extends C2217421BqW implements Function1<C19663611wY, Unit> {
    public C19665011wm(LiveEventStickerWrapperWidget liveEventStickerWrapperWidget) {
        super(1, liveEventStickerWrapperWidget, LiveEventStickerWrapperWidget.class, "addLiveEventSticker", "addLiveEventSticker(Lcom/bytedance/android/livesdk/comp/impl/liveeventsticker/data/LiveEventSticker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19663611wY c19663611wY) {
        ((LiveEventStickerWrapperWidget) this.receiver).B1(c19663611wY);
        return Unit.LIZ;
    }
}
