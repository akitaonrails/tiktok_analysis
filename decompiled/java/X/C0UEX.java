package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS97S1000000_12;

/* JADX INFO: renamed from: X.0UEX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEX {
    public static long LIZIZ;
    public static int LIZLLL;
    public static final HashSet<String> LIZ = new HashSet<>();
    public static String LIZJ = "";

    public static final void LIZLLL() {
        if (LIZJ.length() > 0) {
            long j = LIZIZ;
            if (j > 0 && LIZLLL == 2) {
                LJ(j, LIZJ);
            }
        }
        LIZJ = "";
    }

    public static final void LIZ(DataChannel dataChannel, boolean z) {
        LiveEffect liveEffect;
        LiveEffect liveEffect2;
        if (z) {
            return;
        }
        C0UAA multiGuestBeautyLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getMultiGuestBeautyLogManager();
        if (multiGuestBeautyLogManager != null) {
            C0UD7.LJIIJ = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).composerManagerB();
            C0UD7 c0ud7 = (C0UD7) multiGuestBeautyLogManager;
            c0ud7.LIZIZ(false);
            C0UD7.LJIIJJI = C924620aAW.LJIILL();
            C0UD7.LJIIJ(dataChannel, C0UD7.LIZIZ);
            C0UD7.LJII();
            Map<Long, C0UD8> map = C0UD7.LJII;
            ((LinkedHashMap) map).clear();
            map.putAll(C0UD7.LIZLLL);
            c0ud7.LIZ();
        }
        C0UEY liveMultiGuestStickerLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveMultiGuestStickerLogManager();
        if (liveMultiGuestStickerLogManager != null) {
            List<LiveEffect> listQr = C768760UDq.LIZ().qr(C0UD4.LJ);
            if (listQr != null) {
                ArrayList arrayList = new ArrayList();
                for (LiveEffect liveEffect3 : listQr) {
                    if (liveEffect3.getEffectId() != 0) {
                        arrayList.add(liveEffect3);
                    }
                }
                liveEffect = (LiveEffect) C13LP.LJJJLZIJ(0, arrayList);
            } else {
                liveEffect = null;
            }
            liveMultiGuestStickerLogManager.LIZIZ();
            MultiGuestNaviAvatarSwitcherSetting multiGuestNaviAvatarSwitcherSetting = MultiGuestNaviAvatarSwitcherSetting.INSTANCE;
            if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                liveEffect2 = C924790aAn.LIZLLL().LJFF;
            } else {
                liveEffect2 = liveEffect;
            }
            liveMultiGuestStickerLogManager.LIZ(liveEffect2);
            if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                liveEffect = C924790aAn.LIZLLL().LJFF;
            }
            liveMultiGuestStickerLogManager.LJIIJ(liveEffect, dataChannel);
        }
    }

    public static final void LIZJ(int i, boolean z) {
        LIZLLL = i;
        if (i == 1 && z) {
            LJ(LIZIZ, LIZJ);
        } else {
            if (i != 2) {
                return;
            }
            LIZIZ = System.currentTimeMillis();
        }
    }

    public static void LJ(long j, String str) {
        String str2;
        if (str.length() > 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_connection_beauty_panel_use_time");
            c474500IjALIZ.LJJII(str, "tab");
            AwS97S1000000_12 awS97S1000000_12 = C474640IjO.LJFF;
            if (awS97S1000000_12 == null || (str2 = awS97S1000000_12.s0) == null) {
                str2 = "";
            }
            c474500IjALIZ.LJJII(str2, "event_page");
            c474500IjALIZ.LJJI(false);
            c474500IjALIZ.LJJII(String.valueOf((System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "use_time");
            c474500IjALIZ.LJJIJL();
        }
    }

    public static final void LIZIZ(DataChannel dataChannel, String str, boolean z) {
        LiveEffect liveEffect;
        RtcUserInfo rtcUserInfoG0;
        C0UEY liveMultiGuestStickerLogManager;
        LiveEffect liveEffect2;
        LiveEffect liveEffect3;
        C0UAA multiGuestBeautyLogManager;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGuestLeaveToUploadBeauty, source: ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiGuestBeautyPropsLogUtil", C2188811AlT.LIZIZ(sbLIZ));
        if (z && (multiGuestBeautyLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getMultiGuestBeautyLogManager()) != null) {
            C0UD7.LJIIJ = C768760UDq.LIZ();
            C0UD7 c0ud7 = (C0UD7) multiGuestBeautyLogManager;
            c0ud7.LIZIZ(true);
            C0UD7.LJIIJJI = C924620aAW.LJIILL();
            C0UD7.LJIIJ(dataChannel, C0UD7.LIZIZ);
            c0ud7.LIZ();
            c0ud7.release();
        }
        List<LiveEffect> listQr = C768760UDq.LIZ().qr(C0UD4.LJ);
        String str2 = null;
        if (listQr != null) {
            ArrayList arrayList = new ArrayList();
            for (LiveEffect liveEffect4 : listQr) {
                if (liveEffect4.getEffectId() != 0) {
                    arrayList.add(liveEffect4);
                }
            }
            liveEffect = (LiveEffect) C13LP.LJJJLZIJ(0, arrayList);
        } else {
            liveEffect = null;
        }
        if (z && (liveMultiGuestStickerLogManager = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveMultiGuestStickerLogManager()) != null) {
            liveMultiGuestStickerLogManager.LIZIZ();
            MultiGuestNaviAvatarSwitcherSetting multiGuestNaviAvatarSwitcherSetting = MultiGuestNaviAvatarSwitcherSetting.INSTANCE;
            if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                liveEffect2 = C924790aAn.LIZLLL().LJFF;
            } else {
                liveEffect2 = liveEffect;
            }
            liveMultiGuestStickerLogManager.LIZ(liveEffect2);
            if (multiGuestNaviAvatarSwitcherSetting.isEnable()) {
                liveEffect3 = C924790aAn.LIZLLL().LJFF;
            } else {
                liveEffect3 = liveEffect;
            }
            liveMultiGuestStickerLogManager.LJIIJ(liveEffect3, dataChannel);
            liveMultiGuestStickerLogManager.release();
        }
        HashSet<String> hashSet = LIZ;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (rtcUserInfoG0 = interfaceC954180awCLLJLL.G0()) != null) {
            str2 = rtcUserInfoG0.linkMicId;
        }
        hashSet.add(str2);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getUploadEffectRelatedLog();
        C768300UBw.LJIILL(liveEffect, true);
    }
}
