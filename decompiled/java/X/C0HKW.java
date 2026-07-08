package X;

import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.offline.socialavatar.debug.ISocialAvatarDebugService;
import com.ss.android.ugc.aweme.profile.keva.FestiveSocialAvatarKeva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HKW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HKW {
    public static final C0HKW LIZ = new C0HKW();

    public static TuxPanel LIZ(C19EG c19eg, C0HKX c0hkx, String str, Function0 function0) {
        FestiveSocialAvatarKeva festiveSocialAvatarKeva;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarIntroSheet show with enterFrom as ");
        sbLIZ.append(c0hkx);
        C2188811AlT.LIZIZ(sbLIZ);
        C0HYP c0hyp = C0HYP.LIZ;
        boolean zLJFF = Intrinsics.LJFF(str, "chat");
        c0hyp.getClass();
        if (!C0HYP.LIZ(c0hkx, zLJFF)) {
            ISocialAvatarDebugService iSocialAvatarDebugService = (ISocialAvatarDebugService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarDebugService.class, false, false, false, 14, null);
            if (iSocialAvatarDebugService != null) {
                iSocialAvatarDebugService.LJII();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SocialAvatarIntroSheet will not show sheet, directly call onDismiss as ");
            sbLIZ2.append(function0);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (function0 != null) {
                function0.invoke();
            }
            return null;
        }
        if (c19eg == null) {
            return null;
        }
        TuxPanel tuxPanelLIZ = IMStickerApi.LIZ.LIZIZ().getImMixStudioService().LIZ(c19eg, c0hkx, str, function0);
        tuxPanelLIZ.show(c19eg.getSupportFragmentManager(), "SocialAvatarIntroSheetUtil");
        if (Intrinsics.LJFF(str, "chat") && (festiveSocialAvatarKeva = (FestiveSocialAvatarKeva) C0HYP.LIZJ.getValue()) != null) {
            festiveSocialAvatarKeva.LIZIZ();
        }
        C0HYP.LJ().storeBoolean("has_shown_profile_popup_sheet", true);
        C0HYP.LJ().storeLong("profile_popup_sheet_show_timestamp", System.currentTimeMillis());
        if (c0hkx == C0HKX.PROFILE || c0hkx == C0HKX.MIX_STUDIO || c0hkx == C0HKX.STICKER_POST || c0hkx == C0HKX.ANCHOR) {
            C0HWW.LIZ.getClass();
            C0HWW.LJIJJLI(c0hkx, "show");
        }
        return tuxPanelLIZ;
    }
}
