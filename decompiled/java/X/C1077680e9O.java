package X;

import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;

/* JADX INFO: renamed from: X.0e9O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1077680e9O implements C0IJS {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZ;

    public /* synthetic */ C1077680e9O(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZ = absAudienceInteractionFragment;
    }

    @Override // X.C0IJS
    public final void LIZ(boolean z) {
        RecyclableWidgetManager recyclableWidgetManager = this.LIZ.LLJJI;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.onCoreMsgSent(z);
        }
    }
}
