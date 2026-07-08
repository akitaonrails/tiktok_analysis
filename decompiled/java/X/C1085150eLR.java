package X;

import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eLR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1085150eLR extends C2217421BqW implements Function0<Unit> {
    public C1085150eLR(Object obj) {
        super(0, obj, LiveEventStickerWrapperWidget.class, "onStickerDelete", "onStickerDelete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((LiveWidget) this.receiver).dataChannel.SX0(C1085140eLQ.class, null);
        return Unit.LIZ;
    }
}
