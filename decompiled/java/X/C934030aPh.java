package X;

import android.graphics.RectF;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.effect.api.KaraokeStateChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestPanelLayoutStyleSupportFloatTypeSetting;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixAvatarLayoutKeyToStreamSettingsSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMixAvatarToStreamSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.LinkUserState;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C934030aPh implements InterfaceC969870bLV {
    public InterfaceC921320a5C LIZ;
    public final /* synthetic */ C921520a5W LIZIZ;

    @Override // X.InterfaceC969870bLV
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC969870bLV
    public final RectF LJIJ(RectF rectF, long j, long j2) {
        return null;
    }

    @Override // X.InterfaceC969870bLV
    public final RectF LJJ(RectF rectF, long j, long j2) {
        return null;
    }

    @Override // X.InterfaceC969870bLV
    public final RectF LJJII(RectF rectF) {
        return null;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LIZ() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        if (C01ZD.LIZ(7)) {
            MultiGuestPanelLayoutStyleSupportFloatTypeSetting multiGuestPanelLayoutStyleSupportFloatTypeSetting = MultiGuestPanelLayoutStyleSupportFloatTypeSetting.INSTANCE;
            if (multiGuestPanelLayoutStyleSupportFloatTypeSetting.getValue().length != 0) {
                if (C13LQ.LJIILJJIL(C940770aaZ.LIZ().getDataSource().getPanelLayoutType(), multiGuestPanelLayoutStyleSupportFloatTypeSetting.getValue())) {
                    return false;
                }
            }
        }
        int iLJII = C940770aaZ.LIZ().getDataSource().LJII();
        return iLJII == 2 || iLJII == 4;
    }

    @Override // X.InterfaceC969870bLV
    public final List<PosIdentity> LIZIZ() {
        InterfaceC927510aFB zoomService;
        C918060Zzw.LIZ.getClass();
        if (!C918060Zzw.LIZ(true) || (zoomService = this.LIZIZ.getZoomService()) == null) {
            return null;
        }
        return zoomService.LIZIZ();
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJIILL() {
        C917720ZzO.LIZ.getClass();
        return C917720ZzO.LIZJ() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(KaraokeStateChannel.class), Boolean.TRUE);
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJIJI() {
        return LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE.enableAnchorMixStream() && C940770aaZ.LIZ().getDataSource().LJII() == 1;
    }

    @Override // X.InterfaceC969870bLV
    public final int LJIIJJI() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null) ? 2 : 0;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJIIZILJ() {
        return C925150aBN.LJJIII();
    }

    @Override // X.InterfaceC969870bLV
    public final EnumC1276740jKS LJIJJLI() {
        return EnumC1276740jKS.RENDER_HIDDEN;
    }

    public C934030aPh(C921520a5W c921520a5W) {
        this.LIZIZ = c921520a5W;
    }

    @Override // X.InterfaceC969870bLV
    public final LinkUserState L8(String str) {
        UserState userStateL8;
        ILinkStateAbility iLinkStateAbilityLJJLIIIJLJLI = this.LIZIZ.LJJLIIIJLJLI();
        if (iLinkStateAbilityLJJLIIIJLJLI != null && (userStateL8 = iLinkStateAbilityLJJLIIIJLJLI.L8(str)) != null) {
            LinkUserState linkUserState = new LinkUserState();
            linkUserState.audioMuted = userStateL8.audioMuted;
            linkUserState.videoMuted = userStateL8.videoMuted;
            return linkUserState;
        }
        return new LinkUserState();
    }

    @Override // X.InterfaceC969870bLV
    public final int LIZLLL(String str) {
        UserState userStateL8;
        this.LIZIZ.getClass();
        if (Intrinsics.LJFF(str, C921520a5W.LJJLIIIJJIZ())) {
            if (C500260Jjc.LJJJI(this.LIZIZ.LLIZLLLIL)) {
                return 2;
            }
            return 1;
        }
        ILinkStateAbility iLinkStateAbilityLJJLIIIJLJLI = this.LIZIZ.LJJLIIIJLJLI();
        if (iLinkStateAbilityLJJLIIIJLJLI != null && (userStateL8 = iLinkStateAbilityLJJLIIIJLJLI.L8(str)) != null) {
            return userStateL8.onlineUserState;
        }
        return 0;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJ(String str) {
        Boolean boolLIZLLL;
        boolean zNy1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(this.LIZIZ.LLILLL.getId()));
        C921520a5W c921520a5W = this.LIZIZ;
        if (zNy1) {
            return true;
        }
        MultiGuestDataHolder multiGuestDataHolder = c921520a5W.getMultiGuestDataHolder();
        if (multiGuestDataHolder != null && (boolLIZLLL = multiGuestDataHolder.LIZLLL(str)) != null) {
            return boolLIZLLL.booleanValue();
        }
        return false;
    }

    @Override // X.InterfaceC969870bLV
    public final long LJFF(String str) {
        MultiGuestDataHolder multiGuestDataHolder = this.LIZIZ.getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJI(str);
        }
        return 0L;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJI(String str) {
        Boolean boolLJIILLIIL;
        this.LIZIZ.getClass();
        boolean z = !Intrinsics.LJFF(str, C921520a5W.LJJLIIIJJIZ());
        MultiGuestDataHolder multiGuestDataHolder = this.LIZIZ.getMultiGuestDataHolder();
        if (multiGuestDataHolder != null && (boolLJIILLIIL = multiGuestDataHolder.LJIILLIIL(str)) != null) {
            return boolLJIILLIIL.booleanValue();
        }
        return z;
    }

    @Override // X.InterfaceC969870bLV
    public final int LJIIL(String str) {
        MultiGuestDataHolder multiGuestDataHolder = this.LIZIZ.getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJIILL(str);
        }
        return 0;
    }

    @Override // X.InterfaceC969870bLV
    public final void LJIILIIL(C966870bGf c966870bGf) {
        this.LIZ = c966870bGf;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJIILJJIL(String str) {
        if (LJFF(str) > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJIILLIIL(String str) {
        return !TextUtils.isEmpty(str);
    }

    @Override // X.InterfaceC969870bLV
    public final double LJIJJ(String str) {
        LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
        if (!livesdkLinkmicFloatWindowOptimizeSetting.enableAnchorMixStream() || C940770aaZ.LIZ().getDataSource().LJII() != 1 || Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()))) {
            return 0.0d;
        }
        return livesdkLinkmicFloatWindowOptimizeSetting.getCORNER_RADIUS_PX();
    }

    @Override // X.InterfaceC969870bLV
    public final int LJIL(String str) {
        MultiGuestDataHolder multiGuestDataHolder = this.LIZIZ.getMultiGuestDataHolder();
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LIZJ(str);
        }
        return 0;
    }

    @Override // X.InterfaceC969870bLV
    public final ImageModel LJJI(String str) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo;
        InterfaceC302401Fe interfaceC302401FeLJJL = this.LIZIZ.LJJL();
        if (interfaceC302401FeLJJL != null && (abstractC928510aGnLIZ = interfaceC302401FeLJJL.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(str)) != null) {
            return linkPlayerInfo.blurredAvatar;
        }
        return null;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJJIII(String str) {
        if (LJIIL(str) >= LiveSeiTalkSetting.INSTANCE.volumeThreshold()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC969870bLV
    public final double LJIIIIZZ(Layout layout, String str) {
        LivesdkLinkmicFloatWindowOptimizeSetting livesdkLinkmicFloatWindowOptimizeSetting = LivesdkLinkmicFloatWindowOptimizeSetting.INSTANCE;
        if (!livesdkLinkmicFloatWindowOptimizeSetting.enableAnchorMixStream() || layout.scene != 4 || (!Intrinsics.LJFF(layout.businessType, EnumC918990a1R.FLOAT.getBusinessType()) && !Intrinsics.LJFF(layout.businessType, EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType()))) {
            return 0.0d;
        }
        if (Intrinsics.LJFF(str, C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ())) && !Intrinsics.LJFF(layout.businessType, EnumC918990a1R.ZOOM_PANEL_FLOAT_GUEST.getBusinessType())) {
            return 0.0d;
        }
        return livesdkLinkmicFloatWindowOptimizeSetting.getCORNER_RADIUS_PX();
    }

    @Override // X.InterfaceC969870bLV
    public final ImageModel LJIIJ(String str, boolean z) {
        AbstractC928510aGn abstractC928510aGnLIZ;
        LinkPlayerInfo linkPlayerInfo;
        User user;
        InterfaceC302401Fe interfaceC302401FeLJJL = this.LIZIZ.LJJL();
        if (interfaceC302401FeLJJL != null && (abstractC928510aGnLIZ = interfaceC302401FeLJJL.LIZ()) != null && (linkPlayerInfo = (LinkPlayerInfo) abstractC928510aGnLIZ.LJFF(str)) != null && (user = linkPlayerInfo.mUser) != null) {
            if (z) {
                ImageModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb == null) {
                    return user.getAvatarMedium();
                }
                return avatarThumb;
            }
            ImageModel avatarMedium = user.getAvatarMedium();
            if (avatarMedium != null) {
                return avatarMedium;
            }
            return user.getAvatarThumb();
        }
        return null;
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJJIFFI(Layout layout, String str, RectF rectF) {
        return LJIIIZ(layout.layoutId, "", str, rectF);
    }

    @Override // X.InterfaceC969870bLV
    public final boolean LJIIIZ(String str, String str2, String str3, RectF rectF) {
        boolean zLIZ$0 = AwS559S0100000_15.LIZ$0(str, rectF, LinkMicMixAvatarToStreamSettings.INSTANCE.getValue());
        if (!zLIZ$0) {
            return false;
        }
        if (str2.length() > 0) {
            return AwS559S0100000_15.LIZ$0(str2, rectF, LinkMicMixAvatarLayoutKeyToStreamSettingsSetting.INSTANCE.getValue());
        }
        return zLIZ$0;
    }

    @Override // X.InterfaceC969870bLV
    public final JSONObject LJII(C1275030jHh c1275030jHh, List<? extends C1276580jKC> list, int i, int i2, Map<String, Integer> map, Layout layout, String str, Map<String, String> map2, String str2, InterfaceC969870bLV interfaceC969870bLV, Map<String, Map<String, Object>> map3, List<String> list2, float f, long j, int i3, HashMap<String, Map<String, JSONObject>> map4, Map<String, OnLineMicInfo> map5, List<PosIdentity> list3) {
        return C969340bKe.LIZIZ(c1275030jHh, list, i, i2, map, layout, str, map2, str2, interfaceC969870bLV, map3, list2, f, j, i3, "", map4, C921180a4y.LJIILLIIL(C915980Zwa.LJIIIIZZ()), map5, list3);
    }
}
