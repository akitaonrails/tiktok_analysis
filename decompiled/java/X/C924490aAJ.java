package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestV3PreviewPanelV2OpenEvent;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS55S0310000_15;

/* JADX INFO: renamed from: X.0aAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924490aAJ {
    public static final C924490aAJ LIZ = new C924490aAJ();

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r5, com.bytedance.ies.sdk.datachannel.DataChannel r6) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924490aAJ.LIZ(com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(com.bytedance.ies.sdk.datachannel.DataChannel r6, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r7, boolean r8, X.EnumC932550aNJ r9) {
        /*
            r4 = 0
            X.C0UEX.LIZ(r6, r4)
            boolean r0 = r7.LJIIJ
            r5 = 1
            r0 = r0 ^ 1
            r7.LJJIIZI(r0)
            boolean r0 = r7.LJIIJ
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            X.0aA2 r0 = X.EnumC924320aA2.CAMERA
            r2 = 0
            X.C924330aA3.LIZ(r6, r2, r1, r0)
            boolean r0 = X.C927560aFG.LIZ()
            if (r0 == 0) goto L80
            com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarFeatureSetting.INSTANCE
            boolean r0 = r0.hasUseAbility()
            if (r0 == 0) goto L80
            if (r6 == 0) goto L58
            java.lang.Class<X.0b0P> r0 = X.C956790b0P.class
            java.lang.Object r1 = r6.gg0(r0)
            X.0Q7z r1 = (X.InterfaceC665370Q7z) r1
            if (r1 == 0) goto L4a
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility.class
            X.01wD r0 = X.C1555540qa8.LIZIZ(r1, r0, r2)
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.avatar.common.IAvatarBusinessAbility) r0
            if (r0 == 0) goto L40
            webcast.data.multi_guest_social_data.Avatar r2 = r0.Oj0()
        L40:
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSelectAvatarEvent> r1 = com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestSelectAvatarEvent.class
            X.0a9d r0 = new X.0a9d
            r0.<init>(r2, r4)
            r6.LC0(r1, r0)
        L4a:
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent> r3 = com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent.class
            X.0UI0 r2 = new X.0UI0
            boolean r1 = r7.LJIIJ
            java.lang.String r0 = "business_mute_click_toolbar"
            r2.<init>(r1, r0)
            r6.LC0(r3, r2)
        L58:
            if (r8 == 0) goto L7d
            if (r9 == 0) goto L7d
            int[] r1 = X.C932540aNI.LIZ
            int r0 = r9.ordinal()
            r1 = r1[r0]
            if (r1 == r5) goto L7a
            r0 = 2
            if (r1 != r0) goto L7d
            java.lang.String r3 = "guest_manage_panel"
        L6b:
            java.lang.String r2 = r7.LJJLIIIJILLIZJL
            boolean r1 = r7.LJIILL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.C922490a75.LIZIZ(r3, r2, r0, r4, r1)
            java.lang.String r0 = "toolBarMuteVideo"
            X.C920460a3o.LJIIIIZZ(r0)
            return
        L7a:
            java.lang.String r3 = "guest_interact_panel"
            goto L6b
        L7d:
            java.lang.String r3 = "button_icon"
            goto L6b
        L80:
            if (r6 == 0) goto L58
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C924490aAJ.LIZJ(com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder, boolean, X.0aNJ):void");
    }

    public static void LIZIZ(MultiGuestDataHolder multiGuestDataHolder, DataChannel dataChannel, boolean z, EnumC932550aNJ enumC932550aNJ, boolean z2) {
        int i;
        Integer numValueOf;
        int i2 = multiGuestDataHolder.LJJJLL;
        if (i2 != 2 && i2 != 0 && i2 != -1 && !C498310JgT.LIZ()) {
            if (multiGuestDataHolder.LJIIJ) {
                C945680aiU.LIZ.getClass();
                if (C945680aiU.LIZ()) {
                    C945680aiU.LIZIZ(new AwS55S0310000_15(dataChannel, multiGuestDataHolder, z, enumC932550aNJ, 3));
                    return;
                } else {
                    LIZJ(dataChannel, multiGuestDataHolder, z, enumC932550aNJ);
                    return;
                }
            }
            if (z2) {
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder.LIZIZ();
                if (multiLiveAnchorPanelSettingsLIZIZ != null) {
                    numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.disableGuestOpenCamera);
                } else {
                    numValueOf = null;
                }
                if (C932270aMr.LIZJ(numValueOf)) {
                    C766270U4b.LIZLLL(2131854373);
                    C932270aMr.LJFF();
                    return;
                }
            }
            String str = "button_icon";
            if (dataChannel != null) {
                dataChannel.LC0(MultiGuestV3PreviewPanelV2OpenEvent.class, new C924030a9Z(new C923810a9D(!C927560aFG.LIZIZ(), multiGuestDataHolder.LJIILL, C924790aAn.LIZLLL().LJ, C924790aAn.LIZLLL().LJFF), "camera_icon", "button_icon"));
            }
            if (z && enumC932550aNJ != null) {
                int i3 = C932540aNI.LIZ[enumC932550aNJ.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "guest_manage_panel";
                    }
                } else {
                    str = "guest_interact_panel";
                }
            }
            C922490a75.LIZIZ(str, multiGuestDataHolder.LJJLIIIJILLIZJL, Boolean.TRUE, true, multiGuestDataHolder.LJIILL);
            return;
        }
        if (C498310JgT.LIZ()) {
            i = 2131852220;
        } else {
            i = 2131843597;
        }
        C766270U4b.LIZLLL(i);
    }
}
