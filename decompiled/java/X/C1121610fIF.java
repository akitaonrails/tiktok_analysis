package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fIF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121610fIF {
    public boolean LIZ;
    public boolean LIZIZ;
    public int LIZJ;

    public final void LIZJ(boolean z) {
        this.LIZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDeactivateInfo2, isPendingRevoke: ");
        sbLIZ.append(z);
        sbLIZ.append(", isSmbDeactivated: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revokeReason: ");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("ServicePlusDeactivationInfoDelegate", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(int i) {
        this.LIZJ = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDeactivateInfo3, isPendingRevoke: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSmbDeactivated: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revokeReason: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("ServicePlusDeactivationInfoDelegate", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJ(boolean z) {
        this.LIZIZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setDeactivateInfo1, isPendingRevoke: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSmbDeactivated: ");
        sbLIZ.append(z);
        sbLIZ.append(", revokeReason: ");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("ServicePlusDeactivationInfoDelegate", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        Long lValueOf;
        User userLJIJJLI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_entrance_bubble_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
            lValueOf = Long.valueOf(userLJIJJLI.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        c474500IjALIZ.LJJII("", "room_id");
        c474500IjALIZ.LJJII("live_take_page", "show_entrance");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str, "bubble_type");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0140 A[PHI: r3
      0x0140: PHI (r3v3 java.lang.Object) = (r3v1 java.lang.Object), (r3v2 java.lang.Object), (r3v5 java.lang.Object) binds: [B:31:0x012f, B:25:0x00ec, B:8:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r9, kotlin.jvm.internal.AwS666S0100000_17 r10) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1121610fIF.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, kotlin.jvm.internal.AwS666S0100000_17):void");
    }
}
