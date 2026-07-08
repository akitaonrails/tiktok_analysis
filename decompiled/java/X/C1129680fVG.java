package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1129680fVG extends C2217421BqW implements Function1<Gift, AbstractC1126600fQI<? extends AnonymousClass0054>> {
    public C1129680fVG(Object obj) {
        super(1, obj, C1128720fTi.class, "createGiftPanelItem", "createGiftPanelItem(Lcom/bytedance/android/livesdk/model/Gift;)Lcom/bytedance/android/livesdk/gift/model/panel/AbsPanel;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC1126600fQI<? extends AnonymousClass0054> invoke(Gift gift) {
        this.receiver.getClass();
        return C1128720fTi.LIZ(gift);
    }
}
