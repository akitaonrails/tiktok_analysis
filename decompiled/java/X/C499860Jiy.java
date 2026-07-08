package X;

import com.bytedance.android.livesdk.comp.api.subscription.model.PunishInfo;
import com.bytedance.android.livesdk.comp.api.subscription.model.PunishmentData;
import com.bytedance.android.livesdk.comp.api.subscription.model.SubscriptionAccess;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.scene.Scene;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Jiy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499860Jiy {
    public PunishmentData LIZIZ;
    public String LIZ = "";
    public final C499850Jix LIZJ = new C499850Jix(new AwS586S0100000_7(this, 571));

    public final boolean LIZ() {
        SubscriptionAccess subscriptionAccess;
        PunishInfo punishInfo;
        if (this.LIZ.length() == 0) {
            return false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("violation_toast");
        PunishmentData punishmentData = this.LIZIZ;
        c474500IjALIZ.LJJII(punishmentData != null ? Long.valueOf(punishmentData.anchorId) : null, "anchor_id");
        PunishmentData punishmentData2 = this.LIZIZ;
        c474500IjALIZ.LJJII((punishmentData2 == null || (subscriptionAccess = punishmentData2.LIZ) == null || (punishInfo = subscriptionAccess.punishInfo) == null) ? null : punishInfo.punishId, "record_id");
        c474500IjALIZ.LJJII("ban_subscription", "violation_type");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(0, "subscription_tab");
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        c474500IjALIZ.LJJII(roomLJJLI != null ? Long.valueOf(roomLJJLI.getId()) : null, "room_id");
        c474500IjALIZ.LJJII("banner", "enter_from");
        c474500IjALIZ.LJJII("golive page", Scene.SCENE_SERVICE);
        c474500IjALIZ.LIZ();
        C766270U4b.LJIIJJI(this.LIZ);
        return true;
    }
}
