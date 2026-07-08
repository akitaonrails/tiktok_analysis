package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C489201vO extends C2217421BqW implements Function1<Gift, AbstractC1126600fQI<? extends AnonymousClass0054>> {
    public C489201vO(Object obj) {
        super(1, obj, LiveNewGiftPanelWidget.class, "createPanel", "createPanel(Lcom/bytedance/android/livesdk/model/Gift;)Lcom/bytedance/android/livesdk/gift/model/panel/AbsPanel;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC1126600fQI<? extends AnonymousClass0054> invoke(Gift gift) {
        return ((LiveNewGiftPanelWidget) this.receiver).y1(gift);
    }
}
