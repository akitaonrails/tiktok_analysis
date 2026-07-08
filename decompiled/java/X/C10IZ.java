package X;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internal.IPrivacyService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S1200000_28;
import kotlin.jvm.internal.AwS143S1200000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.text.a0;
import uxk.a;

/* JADX INFO: renamed from: X.10IZ, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IZ {
    public static final boolean LJII() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "allow_ai_remix");
        return !(privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType == 2);
    }

    public static final boolean LJIIIZ() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "content_reuse_permission");
        return !(privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType == 2);
    }

    public static final boolean LJI(VideoPublishEditModel videoPublishEditModel) {
        int videoLength;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "allow_ai_remix");
        if (privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.showType == 1) {
            return false;
        }
        if (videoPublishEditModel != null) {
            if (C857680Xkk.LIZIZ(videoPublishEditModel)) {
                return false;
            }
            videoLength = videoPublishEditModel.getVideoLength();
        } else {
            videoLength = 0;
        }
        if (!C1443970ngB.LIZJ(videoLength)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        int videoLength;
        Integer numLIZ;
        if (videoPublishEditModel != null) {
            C548590LfN.LIZ.getClass();
            if (!C548590LfN.LIZIZ().LJIIJ(videoPublishEditModel.creativeModel)) {
                return false;
            }
        }
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "content_reuse_permission");
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("content_reuse_permission")) != null && numLIZ.intValue() == 5) {
            z = false;
        } else {
            z = true;
        }
        if ((privacySettingsRestrictionItemLJIIIZ == null || privacySettingsRestrictionItemLJIIIZ.showType != 1) && !((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ() && z) {
            if (videoPublishEditModel != null) {
                videoLength = videoPublishEditModel.getVideoLength();
            } else {
                videoLength = 0;
            }
            if (!C1443970ngB.LIZJ(videoLength) && (videoPublishEditModel == null || !C857680Xkk.LIZIZ(videoPublishEditModel))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        if (ComplianceServiceProvider.LJI().LJIJI() || (videoPublishEditModel != null && videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType == 2 && C0L1C.LIZ())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void LIZ(C19223110Ij c19223110Ij, C127K c127k, boolean z) {
        C127A c127a;
        C786410Ut5.LLZLL(c127k, 0);
        c127k.setTitle(c19223110Ij.LIZIZ);
        CharSequence charSequence = c19223110Ij.LJI;
        if (charSequence == null) {
            charSequence = c19223110Ij.LIZJ;
        }
        c127k.setSubtitle(charSequence);
        c127k.setCellEnabled(c19223110Ij.LJIIIZ);
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = c19223110Ij.LIZLLL;
            c127k.setIcon(c419910GdJ);
        }
        C127M accessory = c127k.getAccessory();
        if ((accessory instanceof C127A) && (c127a = (C127A) accessory) != 0) {
            c127a.LJIILJJIL(c19223110Ij.LJ);
            c127a.LJI(c19223110Ij.LJIIJ);
            c127a.LJIILL(new AwS272S0300000_28(c19223110Ij, c127k, c127a, 5));
        }
    }

    public static final SpannableString LIZIZ(final C19EG c19eg, final VideoPublishEditModel videoPublishEditModel, final String str) {
        String string;
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        AIGCInfo aIGCInfo;
        String string2 = c19eg.getString(2131849499);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (aIGCInfo = privacySettingModel.aigcInfo) != null && aIGCInfo.AIGCLabelType == 2) {
            string = c19eg.getString(2131849489);
        } else {
            string = c19eg.getString(2131849498);
        }
        sbLIZ.append(string);
        sbLIZ.append(' ');
        sbLIZ.append(string2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int iLJJJ = a0.LJJJ(strLIZIZ, string2, 0, false, 6);
        SpannableString spannableString = new SpannableString(strLIZIZ);
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0Miq
            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                String creationId;
                String strLJIILL;
                AVETParameter avetParameter;
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, "aweme://webview");
                smartRouteBuildRoute.withParam("url", "https://www.tiktok.com/tns-inapp/pages/ai-generated-content?hide_nav_bar=1&enter_from=learn_more");
                smartRouteBuildRoute.withParam("use_spark", true);
                smartRouteBuildRoute.open();
                C0LAB c0lab = new C0LAB();
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                if (videoPublishEditModel2 != null) {
                    creationId = videoPublishEditModel2.getCreationId();
                } else {
                    creationId = "model is null";
                }
                c0lab.LJ("creation_id", creationId);
                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
                String contentSource = null;
                if (videoPublishEditModel3 != null) {
                    strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel3);
                } else {
                    strLJIILL = null;
                }
                c0lab.LJ("content_type", strLJIILL);
                VideoPublishEditModel videoPublishEditModel4 = videoPublishEditModel;
                if (videoPublishEditModel4 != null && (avetParameter = videoPublishEditModel4.getAvetParameter()) != null) {
                    contentSource = avetParameter.getContentSource();
                }
                c0lab.LJ("content_source", contentSource);
                c0lab.LJ("enter_from", str);
                C20684815ws.LJIILLIIL("click_aigc_toggle_learn_more", c0lab.LIZ);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setColor(C960203pA.LIZ(R.attr.a1h, c19eg));
                textPaint.setUnderlineText(false);
            }
        }, iLJJJ, string2.length() + iLJJJ, 17);
        C786410Ut5.p2(spannableString, new C444920HcY(62, false), iLJJJ, string2.length() + iLJJJ, 17);
        return spannableString;
    }

    public static final void LJIIL(Activity activity, Fragment fragment, CreativeToastBuilder creativeToastBuilder) {
        if (fragment != null) {
            C1390380mHk.LJ(fragment, 2007, creativeToastBuilder);
        } else {
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder);
        }
    }

    public static final void LIZJ(Activity activity, Fragment fragment, VideoPublishEditModel videoPublishEditModel, Function0 function0) {
        int videoLength;
        String str;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "allow_ai_remix");
        if (ComplianceServiceProvider.LJIJJ().LJJIFFI()) {
            String str2 = null;
            if (privacySettingsRestrictionItemLJIIIZ != null) {
                str = privacySettingsRestrictionItemLJIIIZ.disabledToast;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                C859330XnP.LIZ.getClass();
                creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
                if (privacySettingsRestrictionItemLJIIIZ != null) {
                    str2 = privacySettingsRestrictionItemLJIIIZ.disabledToast;
                }
                creativeToastBuilder.message(str2);
                LJIIL(activity, fragment, creativeToastBuilder);
                return;
            }
        }
        if (videoPublishEditModel != null) {
            videoLength = videoPublishEditModel.getVideoLength();
        } else {
            videoLength = 0;
        }
        if (C1443970ngB.LIZJ(videoLength)) {
            String strLIZ = C1443970ngB.LIZ(6);
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.message(strLIZ);
            LJIIL(activity, fragment, creativeToastBuilder2);
            return;
        }
        if (((Number) function0.invoke()).intValue() == 4 || (videoPublishEditModel != null && C857680Xkk.LIZIZ(videoPublishEditModel))) {
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder3.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder3.messageRes(2131846008);
            LJIIL(activity, fragment, creativeToastBuilder3);
        }
    }

    public static final void LIZLLL(Activity activity, Fragment fragment, VideoPublishEditModel videoPublishEditModel, Function0 function0) {
        int iIntValue;
        int videoLength;
        Integer numLIZ;
        String str;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "content_reuse_permission");
        if (ComplianceServiceProvider.LJIJJ().LJJIFFI()) {
            String str2 = null;
            if (privacySettingsRestrictionItemLJIIIZ != null) {
                str = privacySettingsRestrictionItemLJIIIZ.disabledToast;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                C859330XnP.LIZ.getClass();
                creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
                if (privacySettingsRestrictionItemLJIIIZ != null) {
                    str2 = privacySettingsRestrictionItemLJIIIZ.disabledToast;
                }
                creativeToastBuilder.message(str2);
                LJIIL(activity, fragment, creativeToastBuilder);
                return;
            }
        }
        if (privacySettingsRestrictionItemLJIIIZ != null && privacySettingsRestrictionItemLJIIIZ.resType == 1) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder2.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder2.messageRes(2131847649);
            LJIIL(activity, fragment, creativeToastBuilder2);
            return;
        }
        if (((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ()) {
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder3.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder3.messageRes(2131845578);
            LJIIL(activity, fragment, creativeToastBuilder3);
            return;
        }
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null && (numLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ("content_reuse_permission")) != null) {
            iIntValue = numLIZ.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue != 5) {
            if (videoPublishEditModel != null) {
                videoLength = videoPublishEditModel.getVideoLength();
            } else {
                videoLength = 0;
            }
            if (C1443970ngB.LIZJ(videoLength)) {
                String strLIZ = C1443970ngB.LIZ(5);
                CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
                creativeToastBuilder4.message(strLIZ);
                LJIIL(activity, fragment, creativeToastBuilder4);
                return;
            }
            if (((Number) function0.invoke()).intValue() == 4 || (videoPublishEditModel != null && C857680Xkk.LIZIZ(videoPublishEditModel))) {
                CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
                C859330XnP.LIZ.getClass();
                creativeToastBuilder5.isCenterToast(C859330XnP.LIZ());
                creativeToastBuilder5.messageRes(2131845575);
                LJIIL(activity, fragment, creativeToastBuilder5);
                return;
            }
            return;
        }
        CreativeToastBuilder creativeToastBuilder6 = new CreativeToastBuilder();
        C859330XnP.LIZ.getClass();
        creativeToastBuilder6.isCenterToast(C859330XnP.LIZ());
        creativeToastBuilder6.messageRes(2131845574);
        LJIIL(activity, fragment, creativeToastBuilder6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIJJI(InterfaceC19222210Ia interfaceC19222210Ia, C19EG c19eg, VideoPublishEditModel videoPublishEditModel, String str) {
        String creationId;
        AVETParameter avetParameter;
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJ = c19eg.getString(2131849497);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.sf;
        c770750ULh.LIZ = c0hti.LIZ(c19eg);
        String strLJIILL = null;
        String string = c19eg.getString(2131849496);
        C444940Hca c444940Hca = new C444940Hca();
        c444940Hca.LIZLLL(0);
        c444940Hca.LIZIZ = false;
        c444940Hca.LIZIZ(42);
        c444940Hca.LIZJ(2131849494);
        c444940Hca.LJIIIIZZ = new AwS143S1200000_28(c19eg, videoPublishEditModel, str, 1);
        c770750ULh.LJ(new C1667580tUq(R.raw.icon_flag, null, c19eg.getString(2131849493), null, 8), new C1667580tUq(R.raw.icon_shield_tick, null, c19eg.getString(2131849495), null, 8), new C1667580tUq(R.raw.icon_block, null, C10KE.LIZIZ(string, c444940Hca.LIZ(c19eg)), null, 8));
        c770750ULh.LJI(c19eg.getString(2131849492), new AwS111S1200000_28(videoPublishEditModel, interfaceC19222210Ia, str, 9));
        c770750ULh.LJII(c19eg.getString(2131849491), new AwS111S1200000_28(videoPublishEditModel, interfaceC19222210Ia, str, 10));
        c770750ULh.LJIILLIIL = false;
        c770750ULh.LJIJ = true;
        TuxSheet tuxSheet = c770750ULh.LIZIZ().LIZ;
        tuxSheet.LLILLL = false;
        tuxSheet.LLJLLL = false;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "intro");
        a aVar = a.LIZ;
        Keva keva = a.LJIIIIZZ;
        String str2 = a.LJFF;
        aVar.getClass();
        keva.storeBoolean(a.LJ(str2), true);
        C0LAB c0lab = new C0LAB();
        if (videoPublishEditModel != null) {
            creationId = videoPublishEditModel.getCreationId();
        } else {
            creationId = "model is null";
        }
        c0lab.LJ("creation_id", creationId);
        String contentSource = null;
        if (videoPublishEditModel != null) {
            strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
        }
        c0lab.LJ("content_type", strLJIILL);
        if (videoPublishEditModel != null && (avetParameter = videoPublishEditModel.getAvetParameter()) != null) {
            contentSource = avetParameter.getContentSource();
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LJ("enter_from", str);
        C20684815ws.LJIILLIIL("show_aigc_pop_up", c0lab.LIZ);
    }

    public static final void LJ(Activity activity, VideoPublishEditModel videoPublishEditModel, PrivacySettingsRestrictionItem privacySettingsRestrictionItem, Function0 function0, boolean z) {
        int videoLength;
        if (ComplianceServiceProvider.LJIJJ().LJJIFFI() && !TextUtils.isEmpty(privacySettingsRestrictionItem.disabledToast)) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder.message(privacySettingsRestrictionItem.disabledToast);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder);
            return;
        }
        if (privacySettingsRestrictionItem.resType == 1) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder2.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder2.messageRes(2131847649);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder2);
            return;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.getCreationMode() == 2) {
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder3.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder3.messageRes(2131858103);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder3);
            return;
        }
        if (((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ()) {
            CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder4.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder4.messageRes(2131858091);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder4);
            return;
        }
        if (!z) {
            CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder5.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder5.messageRes(2131858104);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder5);
            return;
        }
        if (videoPublishEditModel != null) {
            videoLength = videoPublishEditModel.getVideoLength();
        } else {
            videoLength = 0;
        }
        if (C1443970ngB.LIZJ(videoLength)) {
            String strLIZ = C1443970ngB.LIZ(3);
            CreativeToastBuilder creativeToastBuilder6 = new CreativeToastBuilder();
            creativeToastBuilder6.message(strLIZ);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder6);
            return;
        }
        if (((Number) function0.invoke()).intValue() == 4 || (videoPublishEditModel != null && C857680Xkk.LIZIZ(videoPublishEditModel))) {
            CreativeToastBuilder creativeToastBuilder7 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder7.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder7.messageRes(2131849243);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder7);
        }
    }

    public static final void LJFF(Activity activity, VideoPublishEditModel videoPublishEditModel, PrivacySettingsRestrictionItem privacySettingsRestrictionItem, Function0 function0, boolean z) {
        int videoLength;
        if (ComplianceServiceProvider.LJIJJ().LJJIFFI() && !TextUtils.isEmpty(privacySettingsRestrictionItem.disabledToast)) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder.message(privacySettingsRestrictionItem.disabledToast);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder);
            return;
        }
        if (privacySettingsRestrictionItem.resType == 1) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder2.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder2.messageRes(2131847649);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder2);
            return;
        }
        if (((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LIZJ()) {
            CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder3.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder3.messageRes(2131847919);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder3);
            return;
        }
        if (!z) {
            CreativeToastBuilder creativeToastBuilder4 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder4.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder4.messageRes(2131847853);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder4);
            return;
        }
        if (videoPublishEditModel != null) {
            videoLength = videoPublishEditModel.getVideoLength();
        } else {
            videoLength = 0;
        }
        if (C1443970ngB.LIZJ(videoLength)) {
            String strLIZ = C1443970ngB.LIZ(4);
            CreativeToastBuilder creativeToastBuilder5 = new CreativeToastBuilder();
            creativeToastBuilder5.message(strLIZ);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder5);
            return;
        }
        if (((Number) function0.invoke()).intValue() == 4 || (videoPublishEditModel != null && C857680Xkk.LIZIZ(videoPublishEditModel))) {
            CreativeToastBuilder creativeToastBuilder6 = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder6.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder6.messageRes(2131847854);
            C1390380mHk.LIZ(activity, 2007, creativeToastBuilder6);
        }
    }
}
