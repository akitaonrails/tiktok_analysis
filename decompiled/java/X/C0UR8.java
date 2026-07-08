package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.ShortCutPanelWidget;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UR8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class C0UR8 extends C2217421BqW implements Function1<EnumC771390UNt, Boolean> {
    public C0UR8(Object obj) {
        super(1, obj, ShortCutPanelWidget.class, "canHideSubPanel", "canHideSubPanel(Lcom/bytedance/android/live/broadcast/shortcutpanel/ShortCutPanel;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(EnumC771390UNt enumC771390UNt) {
        return Boolean.valueOf(((ShortCutPanelWidget) this.receiver).x1(enumC771390UNt));
    }
}
