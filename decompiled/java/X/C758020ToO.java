package X;

import com.bytedance.android.livesdk.dataChannel.VisibleScopeSelectedChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0ToO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758020ToO {
    public static final C758020ToO LIZ = new C758020ToO();

    public static void LIZ(DataChannel dataChannel, String str, String str2, boolean z, boolean z2) {
        Object obj;
        Integer numValueOf;
        C758220Toi c758220Toi;
        C758220Toi c758220Toi2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_distribution_scope_icon");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "event_action_type");
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "is_private_account");
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "is_sub_only_live");
        c474500IjALIZ.LJJII(str2, "enter_from");
        if (dataChannel != null && (c758220Toi2 = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class)) != null) {
            int i = c758220Toi2.LIZ;
            if (!z || i != 0) {
                c474500IjALIZ.LJJII(C473420IhQ.LIZ(Integer.valueOf(i)), "distribution_type");
            }
        } else if (!z && !z2) {
            if (dataChannel != null && (c758220Toi = (C758220Toi) dataChannel.gg0(VisibleScopeSelectedChannel.class)) != null) {
                numValueOf = Integer.valueOf(c758220Toi.LIZ);
            } else {
                numValueOf = null;
            }
            c474500IjALIZ.LJJII(C473420IhQ.LIZ(numValueOf), "distribution_type");
        }
        c474500IjALIZ.LIZ();
    }
}
