package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927550aFF {
    public static String LIZ(DataChannel dataChannel) {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedBgAbility iSharedBgAbility;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        if (dataChannel == null || (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) == null || (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) == null || (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) == null || (state = multiGuestSharedBgAnchorViewModelGL0.getState()) == null) {
            return null;
        }
        return state.LLILZ;
    }

    public static void LIZLLL(DataChannel dataChannel, Long l, Long l2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i, String str, String str2, int i2, C334801Rq c334801Rq, Function1 function1, Function1 function12) {
        LIZIZ(dataChannel, l, l2, multiLiveAnchorPanelSettings, i, str, str2, i2, c334801Rq, function1, function12, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ec A[PHI: r12
      0x00ec: PHI (r12v5 tikcast.linkmic.common.MgTraceInfo) = (r12v1 tikcast.linkmic.common.MgTraceInfo), (r12v6 tikcast.linkmic.common.MgTraceInfo) binds: [B:17:0x0032, B:16:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel r30, java.lang.Long r31, java.lang.Long r32, final com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r33, int r34, java.lang.String r35, java.lang.String r36, int r37, X.C334801Rq r38, final kotlin.jvm.functions.Function1 r39, final kotlin.jvm.functions.Function1 r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C927550aFF.LIZIZ(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.Long, java.lang.Long, com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings, int, java.lang.String, java.lang.String, int, X.01Rq, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean):void");
    }
}
