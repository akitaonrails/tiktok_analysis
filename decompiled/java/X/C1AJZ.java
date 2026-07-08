package X;

import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C1AJZ extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1AJZ(Object obj) {
        super(1, obj, StickerContainerWidget.class, "onPauseLive", "onPauseLive(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        StickerContainerWidget stickerContainerWidget = (StickerContainerWidget) this.receiver;
        stickerContainerWidget.getClass();
        if (zBooleanValue) {
            stickerContainerWidget.C1(EnumC1847310yAj.PAUSE_LIVE);
        } else {
            stickerContainerWidget.D1(EnumC1847310yAj.PAUSE_LIVE);
        }
        return Unit.LIZ;
    }
}
