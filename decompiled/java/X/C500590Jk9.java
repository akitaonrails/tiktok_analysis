package X;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0Jk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500590Jk9 {
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(long r3, com.bytedance.ies.sdk.datachannel.DataChannel r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "livesdk_redpacket_send_failed"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            r2.LJIJJLI(r5)
            java.lang.String r1 = "redpacket_type"
            java.lang.String r0 = "super_fan"
            r2.LJJII(r0, r1)
            java.lang.String r1 = "send_number"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.LJJII(r0, r1)
            java.lang.String r0 = "failed_reason"
            r2.LJJII(r6, r0)
            if (r5 == 0) goto L34
            boolean r1 = X.C500260Jjc.LJIIZILJ(r5)
            r0 = 1
            if (r1 != r0) goto L34
        L27:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_anchor"
            r2.LJJII(r1, r0)
            r2.LIZ()
            return
        L34:
            r0 = 0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C500590Jk9.LIZIZ(long, com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String):void");
    }

    public static final void LIZ(long j, long j2, DataChannel dataChannel, String str, boolean z) {
        boolean z2;
        long followStatus;
        Room roomLJJLIIIIJ;
        User owner;
        FollowInfo followInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_redpacket_send_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LJJII("super_fan", "redpacket_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "superfan_package");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "send_number");
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c474500IjALIZ.LJJII(1, "is_anchor");
        } else {
            c474500IjALIZ.LJJII(0, "is_anchor");
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_unclaimed_superfan");
        c474500IjALIZ.LIZ();
    }

    public static final void LIZJ(DataChannel dataChannel, String str, boolean z, long j, long j2, String str2, int i) {
        boolean z2;
        long followStatus;
        Room roomLJJLIIIIJ;
        User owner;
        FollowInfo followInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_redpacket_send_success");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "entrance");
        c474500IjALIZ.LJJII("super_fan", "redpacket_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "superfan_package");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "send_number");
        c474500IjALIZ.LJJII(str2, "redpacket_id");
        int i2 = 0;
        if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c474500IjALIZ.LJJII(1, "is_anchor");
        } else {
            c474500IjALIZ.LJJII(0, "is_anchor");
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_unclaimed_superfan");
        int iCeil = (int) Math.ceil((((long) i) - C158B.LIZJ()) / 60.0f);
        if (iCeil >= 0) {
            i2 = iCeil;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "countdown_mins");
        c474500IjALIZ.LIZ();
    }
}
