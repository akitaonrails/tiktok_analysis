package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19664911wl extends C2217421BqW implements Function1<C19663611wY, Unit> {
    public C19664911wl(Object obj) {
        super(1, obj, LiveEventStickerWrapperWidget.class, "createLiveEventSticker", "createLiveEventSticker(Lcom/bytedance/android/livesdk/comp/impl/liveeventsticker/data/LiveEventSticker;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C19663611wY c19663611wY) {
        C19663611wY c19663611wY2 = c19663611wY;
        LiveEventStickerWrapperWidget liveEventStickerWrapperWidget = (LiveEventStickerWrapperWidget) this.receiver;
        liveEventStickerWrapperWidget.C1();
        C19665311wp c19665311wp = liveEventStickerWrapperWidget.LLJILJIL;
        if (c19665311wp != null) {
            c19665311wp.LJI(c19663611wY2, new C19665011wm(liveEventStickerWrapperWidget), null);
        }
        return Unit.LIZ;
    }
}
