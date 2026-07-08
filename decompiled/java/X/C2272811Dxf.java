package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Dxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272811Dxf {
    public static final Map<String, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair("BrandAi1", Integer.valueOf(R.attr.ca)), new Pair("BrandOscarGold", Integer.valueOf(R.attr.d4)), new Pair("BrandTako1", Integer.valueOf(R.attr.d5)), new Pair("BrandTako2", Integer.valueOf(R.attr.d6)), new Pair("BrandTikTokPlus1", Integer.valueOf(R.attr.dk)), new Pair("BrandTikTokPlus2", Integer.valueOf(R.attr.dl)), new Pair("BrandTikTokBackground", Integer.valueOf(R.attr.d7)), new Pair("BrandTikTokBackgroundElement", Integer.valueOf(R.attr.d8)), new Pair("BrandTikTokBlack", Integer.valueOf(R.attr.d9)), new Pair("BrandTikTokRazzmatazz", Integer.valueOf(R.attr.dm)), new Pair("BrandTikTokSplash", Integer.valueOf(R.attr.do_res_0x7f06005d)), new Pair("BrandTikTokSpotlight", Integer.valueOf(R.attr.dp)), new Pair("BrandTikTokSubjectInSpotlight", Integer.valueOf(R.attr.dq)), new Pair("BrandTikTokWhite", Integer.valueOf(R.attr.ds)), new Pair("BrandTikTokPhotos1", Integer.valueOf(R.attr.di)), new Pair("BrandTikTokPhotos2", Integer.valueOf(R.attr.dj)), new Pair("BrandTokopedia1", Integer.valueOf(R.attr.dt)), new Pair("CreationAdjustBackground", Integer.valueOf(R.attr.el)), new Pair("CreationAdjustHSLBlue", Integer.valueOf(R.attr.em)), new Pair("CreationAdjustHSLCyan", Integer.valueOf(R.attr.en)), new Pair("CreationAdjustHSLFuchsia", Integer.valueOf(R.attr.eo)), new Pair("CreationAdjustHSLGreen", Integer.valueOf(R.attr.ep)), new Pair("CreationAdjustHSLIndigo", Integer.valueOf(R.attr.eq)), new Pair("CreationAdjustHSLOrange", Integer.valueOf(R.attr.er)), new Pair("CreationAdjustHSLRed", Integer.valueOf(R.attr.es)), new Pair("CreationAdjustHSLYellow", Integer.valueOf(R.attr.et)), new Pair("CreationAdjustLabel", Integer.valueOf(R.attr.eu)), new Pair("CreationFilterBackground", Integer.valueOf(R.attr.f1)), new Pair("CreationFirstCommentGradientRed1", Integer.valueOf(R.attr.f3)), new Pair("CreationFirstCommentGradientRed2", Integer.valueOf(R.attr.f4)), new Pair("CreationFlashLightCold", Integer.valueOf(R.attr.f5)), new Pair("CreationFlashLightWarm", Integer.valueOf(R.attr.f6)), new Pair("CreationGlanceWatermark", Integer.valueOf(R.attr.f7)), new Pair("CreationPillOverlay", Integer.valueOf(R.attr.f8)), new Pair("CreationStickerBackground", Integer.valueOf(R.attr.f9)), new Pair("CreationStickerLabel", Integer.valueOf(R.attr.f_)), new Pair("ECBlackText1", Integer.valueOf(R.attr.fr)), new Pair("ECBlackText2", Integer.valueOf(R.attr.fs)), new Pair("ECBlackText3", Integer.valueOf(R.attr.ft)), new Pair("ECCyanBanner", Integer.valueOf(R.attr.g0)), new Pair("ECCyanBorder", Integer.valueOf(R.attr.g1)), new Pair("ECCyanMain", Integer.valueOf(R.attr.g2)), new Pair("ECCyanTag", Integer.valueOf(R.attr.g3)), new Pair("ECCyanText", Integer.valueOf(R.attr.g4)), new Pair("ECCyanTextOnTag", Integer.valueOf(R.attr.g5)), new Pair("ECGoldMain", Integer.valueOf(R.attr.g8)), new Pair("ECGoldTag", Integer.valueOf(R.attr.g9)), new Pair("ECGoldText", Integer.valueOf(R.attr.g_)), new Pair("ECGoldTextOnTag", Integer.valueOf(R.attr.ga)), new Pair("ECNeutralTag", Integer.valueOf(R.attr.gc)), new Pair("ECNeutralText", Integer.valueOf(R.attr.gd)), new Pair("ECNeutralTextOnTag", Integer.valueOf(R.attr.f497ge)), new Pair("ECPrimaryBanner", Integer.valueOf(R.attr.gl)), new Pair("ECPrimaryBorder", Integer.valueOf(R.attr.gm)), new Pair("ECPrimaryTag", Integer.valueOf(R.attr.go)), new Pair("ECPrimaryTextOnTag", Integer.valueOf(R.attr.gp)), new Pair("ECWhiteText1", Integer.valueOf(R.attr.hn)), new Pair("ECWhiteText2", Integer.valueOf(R.attr.ho)), new Pair("ECWhiteText3", Integer.valueOf(R.attr.hp)), new Pair("EffectPlatformCapability3D", Integer.valueOf(R.attr.hq)), new Pair("EffectPlatformCapabilityAudio", Integer.valueOf(R.attr.hr)), new Pair("EffectPlatformCapabilityFace", Integer.valueOf(R.attr.hs)), new Pair("EffectPlatformCapabilityOther", Integer.valueOf(R.attr.ht)), new Pair("EffectPlatformCapabilityRender", Integer.valueOf(R.attr.hu)), new Pair("EffectPlatformCapabilityScreen", Integer.valueOf(R.attr.hv)), new Pair("EffectPlatformCapabilityTracker", Integer.valueOf(R.attr.hw)), new Pair("FeedAnchorBg", Integer.valueOf(R.attr.ij)), new Pair("FeedComponentsTextBackdrop", Integer.valueOf(R.attr.il)), new Pair("FeedTopTabTextShadowA30", Integer.valueOf(R.attr.f500io)), new Pair("FeedTopTabTextShadowA40", Integer.valueOf(R.attr.ip)), new Pair("FeedTopTabTextShadowA50", Integer.valueOf(R.attr.iq)), new Pair("FeedTopTabTextShadowA66", Integer.valueOf(R.attr.ir)), new Pair("FeedTopTabTextShadowA83", Integer.valueOf(R.attr.is)), new Pair("IllustrationColorPrimary", Integer.valueOf(R.attr.f501it)), new Pair("IllustrationColorSecondary", Integer.valueOf(R.attr.iu)), new Pair("IllustrationColorStroke", Integer.valueOf(R.attr.iv)), new Pair("IllustrationColorSymbol", Integer.valueOf(R.attr.iw)), new Pair("IllustrationColorTertiary", Integer.valueOf(R.attr.ix)), new Pair("IllustrationGrayFill", Integer.valueOf(R.attr.iy)), new Pair("IllustrationGrayStroke", Integer.valueOf(R.attr.iz)), new Pair("InboxFilterHighlight", Integer.valueOf(R.attr.j0)), new Pair("InboxFilterTextOnHighlight", Integer.valueOf(R.attr.j1)), new Pair("LIVEBrand1", Integer.valueOf(R.attr.k8)), new Pair("LIVEBrand2", Integer.valueOf(R.attr.k9)), new Pair("LIVERevenueTeamShape1", Integer.valueOf(R.attr.ml)), new Pair("LIVERevenueTeamShape2", Integer.valueOf(R.attr.mm)), new Pair("LIVERevenueTeamTextPrimary1", Integer.valueOf(R.attr.mo)), new Pair("LIVERevenueTeamTextPrimary2", Integer.valueOf(R.attr.mp)), new Pair("LocalServicePOI", Integer.valueOf(R.attr.no)), C0OFE.LIZ("LocalServicePOIBackground", Integer.valueOf(R.attr.np)), C0OFE.LIZ("MiscOnlineShape", Integer.valueOf(R.attr.nv)), C0OFE.LIZ("MiscOnlineShape4", Integer.valueOf(R.attr.nw)), C0OFE.LIZ("MiscOnlineText", Integer.valueOf(R.attr.nx)), C0OFE.LIZ("MiscRatingStarSelectedFill", Integer.valueOf(R.attr.ny)), C0OFE.LIZ("MiscVerifiedBadge1", Integer.valueOf(R.attr.o2)), C0OFE.LIZ("MiscVerifiedBadge2", Integer.valueOf(R.attr.o3)), C0OFE.LIZ("ProfileIconBackgroundDarkGray", Integer.valueOf(R.attr.of)), C0OFE.LIZ("SocialAvatarBrand1", Integer.valueOf(R.attr.so)), C0OFE.LIZ("SocialAvatarProfile011", Integer.valueOf(R.attr.sp)), C0OFE.LIZ("SocialAvatarProfile012", Integer.valueOf(R.attr.sq)), C0OFE.LIZ("SocialAvatarProfile021", Integer.valueOf(R.attr.f513ss)), C0OFE.LIZ("SocialAvatarProfile022", Integer.valueOf(R.attr.st)), C0OFE.LIZ("SocialAvatarProfile031", Integer.valueOf(R.attr.sv)), C0OFE.LIZ("SocialAvatarProfile032", Integer.valueOf(R.attr.sw)), C0OFE.LIZ("SocialAvatarProfile041", Integer.valueOf(R.attr.sy)), C0OFE.LIZ("SocialAvatarProfile042", Integer.valueOf(R.attr.sz)), C0OFE.LIZ("SocialAvatarProfile051", Integer.valueOf(R.attr.t1)), C0OFE.LIZ("SocialAvatarProfile052", Integer.valueOf(R.attr.t2)), C0OFE.LIZ("SocialAvatarProfile061", Integer.valueOf(R.attr.t4)), C0OFE.LIZ("SocialAvatarProfile062", Integer.valueOf(R.attr.f514t5)), C0OFE.LIZ("SocialChatGradientBlue1", Integer.valueOf(R.attr.t7)), C0OFE.LIZ("SocialChatGradientBlue2", Integer.valueOf(R.attr.t8)), C0OFE.LIZ("SocialChatGradientBlue3", Integer.valueOf(R.attr.t9)), C0OFE.LIZ("SocialSnail1", Integer.valueOf(R.attr.tg)), C0OFE.LIZ("SocialStoryGradientGreen1", Integer.valueOf(R.attr.ti)), C0OFE.LIZ("SocialStoryGradientGreen2", Integer.valueOf(R.attr.tj)), C0OFE.LIZ("SocialStoryGradientGreen3", Integer.valueOf(R.attr.tk)), C0OFE.LIZ("SocialStoryGradientPurple1", Integer.valueOf(R.attr.tl)), C0OFE.LIZ("SocialStoryGradientPurple2", Integer.valueOf(R.attr.tm)), C0OFE.LIZ("SocialStoryGradientPurple3", Integer.valueOf(R.attr.tn)), C0OFE.LIZ("SocialStoryShapePurple", Integer.valueOf(R.attr.tp)), C0OFE.LIZ("SocialTextStreak", Integer.valueOf(R.attr.u5)), C0OFE.LIZ("UIImageOverlayBlack", Integer.valueOf(R.attr.z_)), C0OFE.LIZ("UIImageOverlayBlackA15", Integer.valueOf(R.attr.za)), C0OFE.LIZ("UIImageOverlayBlackA25", Integer.valueOf(R.attr.zb)), C0OFE.LIZ("UIImageOverlayBlackA50", Integer.valueOf(R.attr.zc)), C0OFE.LIZ("UIImageOverlayBlackA80", Integer.valueOf(R.attr.zd)), C0OFE.LIZ("UIImageOverlayDarkGrayA30", Integer.valueOf(R.attr.ze)), C0OFE.LIZ("UIImageOverlayDarkGrayA60", Integer.valueOf(R.attr.zg)), C0OFE.LIZ("UIImageOverlayDarkGrayA85", Integer.valueOf(R.attr.zh)), C0OFE.LIZ("UIImageOverlayWhite", Integer.valueOf(R.attr.zi)), C0OFE.LIZ("UIImageOverlayWhiteA20", Integer.valueOf(R.attr.zj)), C0OFE.LIZ("UIImageOverlayWhiteA40", Integer.valueOf(R.attr.zk)), C0OFE.LIZ("UIImageOverlayWhiteA75", Integer.valueOf(R.attr.zl)), C0OFE.LIZ("UIPageFlat1", Integer.valueOf(R.attr.zm)), C0OFE.LIZ("UIPageFlat2", Integer.valueOf(R.attr.zn)), C0OFE.LIZ("UIPageFlat3", Integer.valueOf(R.attr.zo)), C0OFE.LIZ("UIPageGrouped1", Integer.valueOf(R.attr.zp)), C0OFE.LIZ("UIPageGrouped2", Integer.valueOf(R.attr.zq)), C0OFE.LIZ("UIPageGrouped3", Integer.valueOf(R.attr.zr)), C0OFE.LIZ("UIShapeDanger", Integer.valueOf(R.attr.zs)), C0OFE.LIZ("UIShapeDanger2", Integer.valueOf(R.attr.zt)), C0OFE.LIZ("UIShapeDanger3", Integer.valueOf(R.attr.zu)), C0OFE.LIZ("UIShapeDanger4", Integer.valueOf(R.attr.zv)), C0OFE.LIZ("UIShapeInfo", Integer.valueOf(R.attr.zw)), C0OFE.LIZ("UIShapeInfo2", Integer.valueOf(R.attr.zx)), C0OFE.LIZ("UIShapeInfo3", Integer.valueOf(R.attr.zy)), C0OFE.LIZ("UIShapeInfo4", Integer.valueOf(R.attr.zz)), C0OFE.LIZ("UIShapeNeutral", Integer.valueOf(R.attr.a00)), C0OFE.LIZ("UIShapeNeutral2", Integer.valueOf(R.attr.a01)), C0OFE.LIZ("UIShapeNeutral3", Integer.valueOf(R.attr.a02)), C0OFE.LIZ("UIShapeNeutral4", Integer.valueOf(R.attr.a03)), C0OFE.LIZ("UIShapePrimary", Integer.valueOf(R.attr.a04)), C0OFE.LIZ("UIShapePrimary2", Integer.valueOf(R.attr.a05)), C0OFE.LIZ("UIShapePrimary3", Integer.valueOf(R.attr.a06)), C0OFE.LIZ("UIShapePrimary4", Integer.valueOf(R.attr.a07)), C0OFE.LIZ("UIShapeSecondary", Integer.valueOf(R.attr.a09)), C0OFE.LIZ("UIShapeSecondary2", Integer.valueOf(R.attr.a0_)), C0OFE.LIZ("UIShapeSecondary3", Integer.valueOf(R.attr.a0a)), C0OFE.LIZ("UIShapeSecondary4", Integer.valueOf(R.attr.a0b)), C0OFE.LIZ("UIShapeSecondary5", Integer.valueOf(R.attr.a0c)), C0OFE.LIZ("UIShapeSecondaryMuted", Integer.valueOf(R.attr.a0d)), C0OFE.LIZ("UIShapeSecondaryMuted2", Integer.valueOf(R.attr.a0e)), C0OFE.LIZ("UIShapeSecondaryMuted3", Integer.valueOf(R.attr.a0f)), C0OFE.LIZ("UIShapeSecondaryMuted4", Integer.valueOf(R.attr.a0g)), C0OFE.LIZ("UIShapeSecondaryMuted5", Integer.valueOf(R.attr.a0h)), C0OFE.LIZ("UIShapeSuccess", Integer.valueOf(R.attr.a0i)), C0OFE.LIZ("UIShapeSuccess2", Integer.valueOf(R.attr.a0j)), C0OFE.LIZ("UIShapeSuccess3", Integer.valueOf(R.attr.a0k)), C0OFE.LIZ("UIShapeSuccess4", Integer.valueOf(R.attr.a0l)), C0OFE.LIZ("UIShapeText1OnDanger", Integer.valueOf(R.attr.a0m)), C0OFE.LIZ("UIShapeText1OnInfo", Integer.valueOf(R.attr.a0n)), C0OFE.LIZ("UIShapeText1OnNeutral", Integer.valueOf(R.attr.a0o)), C0OFE.LIZ("UIShapeText1OnPrimary", Integer.valueOf(R.attr.a0p)), C0OFE.LIZ("UIShapeText1OnSecondary", Integer.valueOf(R.attr.a0q)), C0OFE.LIZ("UIShapeText1OnSecondaryMuted", Integer.valueOf(R.attr.a0r)), C0OFE.LIZ("UIShapeText1OnSuccess", Integer.valueOf(R.attr.a0s)), C0OFE.LIZ("UIShapeText1OnWarning", Integer.valueOf(R.attr.a0t)), C0OFE.LIZ("UIShapeText2OnDanger", Integer.valueOf(R.attr.a0u)), C0OFE.LIZ("UIShapeText2OnInfo", Integer.valueOf(R.attr.a0v)), C0OFE.LIZ("UIShapeText2OnNeutral", Integer.valueOf(R.attr.a0w)), C0OFE.LIZ("UIShapeText2OnPrimary", Integer.valueOf(R.attr.a0x)), C0OFE.LIZ("UIShapeText2OnSecondary", Integer.valueOf(R.attr.a0y)), C0OFE.LIZ("UIShapeText2OnSecondaryMuted", Integer.valueOf(R.attr.a0z)), C0OFE.LIZ("UIShapeText2OnSuccess", Integer.valueOf(R.attr.a10)), C0OFE.LIZ("UIShapeText2OnWarning", Integer.valueOf(R.attr.a11)), C0OFE.LIZ("UIShapeTextOnSecondary2Or3", Integer.valueOf(R.attr.a12)), C0OFE.LIZ("UIShapeTextOnSecondary4Or5", Integer.valueOf(R.attr.a13)), C0OFE.LIZ("UIShapeTextOnSecondaryMuted2Or3", Integer.valueOf(R.attr.a14)), C0OFE.LIZ("UIShapeTextOnSecondaryMuted4Or5", Integer.valueOf(R.attr.a15)), C0OFE.LIZ("UIShapeWarning", Integer.valueOf(R.attr.a16)), C0OFE.LIZ("UIShapeWarning2", Integer.valueOf(R.attr.f518a17)), C0OFE.LIZ("UIShapeWarning3", Integer.valueOf(R.attr.a18)), C0OFE.LIZ("UIShapeWarning4", Integer.valueOf(R.attr.a19)), C0OFE.LIZ("UISheetBackdrop1", Integer.valueOf(R.attr.a1_)), C0OFE.LIZ("UISheetBackdrop2", Integer.valueOf(R.attr.a1a)), C0OFE.LIZ("UISheetFlat1", Integer.valueOf(R.attr.a1b)), C0OFE.LIZ("UISheetFlat2", Integer.valueOf(R.attr.a1c)), C0OFE.LIZ("UISheetFlat3", Integer.valueOf(R.attr.a1d)), C0OFE.LIZ("UISheetGrouped1", Integer.valueOf(R.attr.a1e)), C0OFE.LIZ("UISheetGrouped2", Integer.valueOf(R.attr.a1f)), C0OFE.LIZ("UISheetGrouped3", Integer.valueOf(R.attr.a1g)), C0OFE.LIZ("UIText1", Integer.valueOf(R.attr.a1h)), C0OFE.LIZ("UIText1Display", Integer.valueOf(R.attr.a1i)), C0OFE.LIZ("UIText2", Integer.valueOf(R.attr.a1j)), C0OFE.LIZ("UIText3", Integer.valueOf(R.attr.a1k)), C0OFE.LIZ("UITextDanger", Integer.valueOf(R.attr.a1l)), C0OFE.LIZ("UITextDangerDisplay", Integer.valueOf(R.attr.a1m)), C0OFE.LIZ("UITextInfo", Integer.valueOf(R.attr.a1n)), C0OFE.LIZ("UITextInfoDisplay", Integer.valueOf(R.attr.a1o)), C0OFE.LIZ("UITextPlaceholder", Integer.valueOf(R.attr.a1p)), C0OFE.LIZ("UITextPrimary", Integer.valueOf(R.attr.a1q)), C0OFE.LIZ("UITextPrimaryDisplay", Integer.valueOf(R.attr.a1r)), C0OFE.LIZ("UITextSecondary", Integer.valueOf(R.attr.a1s)), C0OFE.LIZ("UITextSecondaryDisplay", Integer.valueOf(R.attr.a1t)), C0OFE.LIZ("UITextSuccess", Integer.valueOf(R.attr.a1u)), C0OFE.LIZ("UITextSuccessDisplay", Integer.valueOf(R.attr.a1v)), C0OFE.LIZ("UITextWarning", Integer.valueOf(R.attr.a1w)), C0OFE.LIZ("UITextWarningDisplay", Integer.valueOf(R.attr.a1x)));
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();

    public static final Float LJ(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (obj instanceof String) {
            return C2327809Ae.LJIIIIZZ(a0.LJLIIIL((String) obj).toString());
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x015c, code lost:
    
        if (r1.equals("H3-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0166, code lost:
    
        if (r1.equals("SMALLTEXT2-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017f, code lost:
    
        if (r1.equals("SMALLTEXT1-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0189, code lost:
    
        if (r1.equals("H2-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0193, code lost:
    
        if (r1.equals("H1-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01ca, code lost:
    
        if (r1.equals("H3-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x023d, code lost:
    
        if (r1.equals("H1-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0247, code lost:
    
        if (r1.equals("P2-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0251, code lost:
    
        return 72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0258, code lost:
    
        return 112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x025f, code lost:
    
        return 122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0266, code lost:
    
        return 42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x026d, code lost:
    
        return 102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0274, code lost:
    
        return 52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x027b, code lost:
    
        return 92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0282, code lost:
    
        return 82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0289, code lost:
    
        return 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0290, code lost:
    
        return 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0297, code lost:
    
        return 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x029e, code lost:
    
        return 62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r1.equals("HEADLINE-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r1.equals("H4-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
    
        if (r1.equals("SMALLTEXT1-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        if (r1.equals("P3-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        if (r1.equals("P2-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
    
        if (r1.equals("LARGETITLE-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
    
        if (r1.equals("H2-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c8, code lost:
    
        if (r1.equals("P1-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d2, code lost:
    
        if (r1.equals("LONGFORM-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dc, code lost:
    
        if (r1.equals("P3-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        if (r1.equals("LONGFORM-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
    
        if (r1.equals("LARGETITLE-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0134, code lost:
    
        if (r1.equals("H4-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x013e, code lost:
    
        if (r1.equals("HEADLINE-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0148, code lost:
    
        if (r1.equals("P1-MEDIUM") == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0152, code lost:
    
        if (r1.equals("SMALLTEXT2-SEMIBOLD") == false) goto L11;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Integer LJFF(java.util.Map<?, ?> r3) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2272811Dxf.LJFF(java.util.Map):java.lang.Integer");
    }

    public static final Integer LJI(Object obj) {
        Float fLJIIIIZZ;
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String) || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(a0.LJLIIIL((String) obj).toString())) == null) {
            return null;
        }
        return Integer.valueOf((int) fLJIIIIZZ.floatValue());
    }

    public static final void LIZ(ViewGroup.MarginLayoutParams marginLayoutParams, C2272831Dxh c2272831Dxh) {
        marginLayoutParams.topMargin = c2272831Dxh.LIZ;
        marginLayoutParams.setMarginEnd(c2272831Dxh.LIZIZ);
        marginLayoutParams.bottomMargin = c2272831Dxh.LIZJ;
        marginLayoutParams.setMarginStart(c2272831Dxh.LIZLLL);
    }

    public static final int LIZIZ(float f, Context context) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static final float[] LIZJ(Context context, String str) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        boolean z;
        float fFloatValue5;
        int iLIZIZ;
        float fFloatValue6;
        float fFloatValue7;
        List<String> listSplit = new Regex("[,\\s]+").split(str, 0);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSplit, 10));
        Iterator<String> it2 = listSplit.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL(it2.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            String strLJLIL = a0.LJLIL(a0.LJLIIIL((String) it3.next()).toString().toLowerCase(Locale.ROOT), '[', ']');
            if (strLJLIL.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            float f = 0.0f;
            if (!z) {
                if (u.LJIIZILJ(strLJLIL, "dp", false)) {
                    Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(a0.LJJJLL("dp", strLJLIL));
                    if (fLJIIIIZZ != null && fLJIIIIZZ.floatValue() >= 0.0f) {
                        fFloatValue7 = fLJIIIIZZ.floatValue();
                    } else {
                        fFloatValue7 = 0.0f;
                    }
                    iLIZIZ = LIZIZ(fFloatValue7, context);
                } else if (u.LJIIZILJ(strLJLIL, "px", false)) {
                    Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(a0.LJJJLL("px", strLJLIL));
                    if (fLJIIIIZZ2 != null && fLJIIIIZZ2.floatValue() >= 0.0f) {
                        fFloatValue6 = fLJIIIIZZ2.floatValue();
                    } else {
                        fFloatValue6 = 0.0f;
                    }
                    if (Float.isNaN(fFloatValue6) && fFloatValue6 >= 0.0f) {
                        f = fFloatValue6;
                    }
                } else {
                    Float fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(strLJLIL);
                    if (fLJIIIIZZ3 != null && fLJIIIIZZ3.floatValue() >= 0.0f) {
                        fFloatValue5 = fLJIIIIZZ3.floatValue();
                    } else {
                        fFloatValue5 = 0.0f;
                    }
                    iLIZIZ = LIZIZ(fFloatValue5, context);
                }
                fFloatValue6 = iLIZIZ;
                if (Float.isNaN(fFloatValue6)) {
                }
            }
            arrayList3.add(Float.valueOf(f));
        }
        List listLL = C13LP.LL(arrayList3, 4);
        if (listLL.isEmpty()) {
            return null;
        }
        int size = listLL.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    fFloatValue = ((Number) ListProtector.get(listLL, 0)).floatValue();
                    fFloatValue3 = ((Number) ListProtector.get(listLL, 1)).floatValue();
                    fFloatValue4 = ((Number) ListProtector.get(listLL, 2)).floatValue();
                    fFloatValue2 = ((Number) ListProtector.get(listLL, 3)).floatValue();
                } else {
                    fFloatValue = ((Number) ListProtector.get(listLL, 0)).floatValue();
                    fFloatValue3 = ((Number) ListProtector.get(listLL, 1)).floatValue();
                    fFloatValue4 = ((Number) ListProtector.get(listLL, 2)).floatValue();
                }
            } else {
                fFloatValue = ((Number) ListProtector.get(listLL, 0)).floatValue();
                fFloatValue3 = ((Number) ListProtector.get(listLL, 1)).floatValue();
                fFloatValue4 = fFloatValue;
            }
            fFloatValue2 = fFloatValue3;
        } else {
            fFloatValue = ((Number) ListProtector.get(listLL, 0)).floatValue();
            fFloatValue2 = fFloatValue;
            fFloatValue3 = fFloatValue;
            fFloatValue4 = fFloatValue;
        }
        return new float[]{fFloatValue, fFloatValue, fFloatValue3, fFloatValue3, fFloatValue4, fFloatValue4, fFloatValue2, fFloatValue2};
    }

    public static final int LIZLLL(Context context, String str) {
        int iN3;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (u.LJJIIJZLJL(str, "#", false)) {
            String strLJJJJZ = a0.LJJJJZ("#", str);
            if (strLJJJJZ.length() == 8) {
                String strSubstring = strLJJJJZ.substring(0, 6);
                String strSubstring2 = strLJJJJZ.substring(6, 8);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(strSubstring2);
                sbLIZ.append(strSubstring);
                return Color.parseColor(C2188811AlT.LIZIZ(sbLIZ));
            }
            return Color.parseColor(str);
        }
        Integer num = LIZ.get(str);
        if (num != null) {
            iN3 = num.intValue();
        } else {
            Map<String, Integer> map = LIZIZ;
            Integer num2 = (Integer) ((LinkedHashMap) map).get(str);
            if (num2 != null) {
                iN3 = num2.intValue();
            } else {
                iN3 = C786410Ut5.n3(context.getResources(), str, "attr", context.getPackageName());
                if (iN3 != 0) {
                    map.put(str, Integer.valueOf(iN3));
                }
                return 0;
            }
        }
        if (iN3 != 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(iN3, typedValue, true);
            return typedValue.data;
        }
        return 0;
    }

    public static final int LJII(Context context, Object obj) {
        if (obj instanceof String) {
            String lowerCase = a0.LJLIIIL((String) obj).toString().toLowerCase(Locale.ROOT);
            if (!Intrinsics.LJFF(lowerCase, "match_parent")) {
                if (!Intrinsics.LJFF(lowerCase, "wrap_content")) {
                    if (!Intrinsics.LJFF(lowerCase, "100%")) {
                        if (!Intrinsics.LJFF(lowerCase, "fit-content")) {
                            if (u.LJIIZILJ(lowerCase, "px", false)) {
                                Integer numLJIIJJI = C2095008Iq.LJIIJJI(u.LJJIFFI(lowerCase, "px", "", false));
                                if (numLJIIJJI != null) {
                                    return numLJIIJJI.intValue();
                                }
                                return -2;
                            }
                            float fFloatValue = 0.0f;
                            if (u.LJIIZILJ(lowerCase, "dp", false)) {
                                Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(u.LJJIFFI(lowerCase, "dp", "", false));
                                if (fLJIIIIZZ != null) {
                                    fFloatValue = fLJIIIIZZ.floatValue();
                                }
                                return LIZIZ(fFloatValue, context);
                            }
                            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(lowerCase);
                            if (fLJIIIIZZ2 != null) {
                                fFloatValue = fLJIIIIZZ2.floatValue();
                            }
                            return LIZIZ(fFloatValue, context);
                        }
                        return -2;
                    }
                    return -1;
                }
                return -2;
            }
            return -1;
        }
        if (obj instanceof Number) {
            return LIZIZ(((Number) obj).floatValue(), context);
        }
        return -2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[PHI: r2
      0x0078: PHI (r2v1 int) = (r2v0 int), (r2v0 int), (r2v0 int), (r2v10 int) binds: [B:3:0x0001, B:5:0x0009, B:7:0x001c, B:18:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3 A[PHI: r1 r2 r3 r4
      0x00c3: PHI (r1v1 int) = (r1v5 int), (r1v9 int), (r1v10 int) binds: [B:22:0x0094, B:45:0x00f9, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r2v2 int) = (r2v6 int), (r2v7 int), (r2v8 int) binds: [B:22:0x0094, B:45:0x00f9, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r3v0 int) = (r3v3 int), (r3v7 int), (r3v9 int) binds: [B:22:0x0094, B:45:0x00f9, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
      0x00c3: PHI (r4v1 int) = (r4v5 int), (r4v7 int), (r4v8 int) binds: [B:22:0x0094, B:45:0x00f9, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2272831Dxh LJIIIIZZ(android.content.Context r7, java.util.Map<?, ?> r8) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2272811Dxf.LJIIIIZZ(android.content.Context, java.util.Map):X.1Dxh");
    }

    public static final int LJIIJ(Context context, Object obj) {
        String lowerCase;
        String string;
        String string2;
        if (obj == null || (string = obj.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null || (lowerCase = string2.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = CardStruct.IStatusCode.DEFAULT;
        }
        if (u.LJIIZILJ(lowerCase, "px", false)) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(u.LJJIFFI(lowerCase, "px", "", false));
            if (numLJIIJJI == null) {
                return 0;
            }
            return numLJIIJJI.intValue();
        }
        float fFloatValue = 0.0f;
        if (u.LJIIZILJ(lowerCase, "dp", false)) {
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(u.LJJIFFI(lowerCase, "dp", "", false));
            if (fLJIIIIZZ != null) {
                fFloatValue = fLJIIIIZZ.floatValue();
            }
            return LIZIZ(fFloatValue, context);
        }
        Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(lowerCase);
        if (fLJIIIIZZ2 != null) {
            fFloatValue = fLJIIIIZZ2.floatValue();
        }
        return LIZIZ(fFloatValue, context);
    }

    public static final int LJIIJJI(Context context, Map map) {
        String str;
        Object obj;
        Integer numValueOf;
        boolean zLIZIZ = C960203pA.LIZIZ(context);
        String str2 = "backgroundColor";
        if (!zLIZIZ) {
            str = "backgroundColor";
        } else {
            str = "backgroundColorDark";
        }
        if (!zLIZIZ) {
            str2 = null;
        }
        Object obj2 = map.get(str);
        if (obj2 != null) {
            numValueOf = Integer.valueOf(LIZLLL(context, obj2.toString()));
        } else if (str2 != null && (obj = map.get(str2)) != null) {
            numValueOf = Integer.valueOf(LIZLLL(context, obj.toString()));
        } else {
            return 0;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    public static final void LJIIIZ(Context context, View view, Map<String, ? extends Object> map) {
        int iLJIIJ;
        int iLJIIJ2;
        int iLJIIJ3;
        int iLJIIJ4;
        Object obj = map.get("padding");
        int iLJIIJ5 = 0;
        if (obj != null) {
            List<String> listSplit = new Regex("\\s+").split(a0.LJLIIIL(obj.toString()).toString(), 0);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSplit, 10));
            Iterator<String> it2 = listSplit.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL(it2.next()).toString());
            }
            int size = arrayList.size();
            if (size != 1) {
                if (size != 2) {
                    if (size != 3) {
                        if (size == 4) {
                            iLJIIJ3 = LJIIJ(context, ListProtector.get(arrayList, 0));
                            iLJIIJ2 = LJIIJ(context, ListProtector.get(arrayList, 1));
                            iLJIIJ = LJIIJ(context, ListProtector.get(arrayList, 2));
                            iLJIIJ5 = LJIIJ(context, ListProtector.get(arrayList, 3));
                        }
                    } else {
                        iLJIIJ4 = LJIIJ(context, ListProtector.get(arrayList, 1));
                        iLJIIJ3 = LJIIJ(context, ListProtector.get(arrayList, 0));
                        iLJIIJ2 = LJIIJ(context, ListProtector.get(arrayList, 1));
                        iLJIIJ = LJIIJ(context, ListProtector.get(arrayList, 2));
                    }
                } else {
                    iLJIIJ4 = LJIIJ(context, ListProtector.get(arrayList, 1));
                    iLJIIJ3 = LJIIJ(context, ListProtector.get(arrayList, 0));
                    iLJIIJ2 = LJIIJ(context, ListProtector.get(arrayList, 1));
                    iLJIIJ = LJIIJ(context, ListProtector.get(arrayList, 0));
                }
                iLJIIJ5 = iLJIIJ4;
            } else {
                iLJIIJ5 = LJIIJ(context, ListProtector.get(arrayList, 0));
            }
            iLJIIJ = iLJIIJ5;
            iLJIIJ2 = iLJIIJ5;
            iLJIIJ3 = iLJIIJ5;
        } else {
            iLJIIJ = iLJIIJ5;
            iLJIIJ2 = iLJIIJ5;
            iLJIIJ3 = iLJIIJ5;
        }
        view.setPadding(iLJIIJ5, iLJIIJ3, iLJIIJ2, iLJIIJ);
    }

    public static final int LJIIL(Context context, int i, Map map) {
        String str;
        Object obj;
        Integer numValueOf;
        if (map == null) {
            return i;
        }
        boolean zLIZIZ = C960203pA.LIZIZ(context);
        String str2 = "color";
        if (!zLIZIZ) {
            str = "color";
        } else {
            str = "colorDark";
        }
        if (!zLIZIZ) {
            str2 = null;
        }
        Object obj2 = map.get(str);
        if (obj2 != null) {
            numValueOf = Integer.valueOf(LIZLLL(context, obj2.toString()));
        } else {
            if (str2 == null || (obj = map.get(str2)) == null) {
                return i;
            }
            numValueOf = Integer.valueOf(LIZLLL(context, obj.toString()));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return i;
    }

    public static final void LJIILIIL(Context context, String str, GradientDrawable gradientDrawable) {
        String lowerCase = a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT);
        float fFloatValue = 0.0f;
        if (u.LJIIZILJ(lowerCase, "dp", false)) {
            Float fLJIIIIZZ = C2327809Ae.LJIIIIZZ(u.LJJIFFI(lowerCase, "dp", "", false));
            if (fLJIIIIZZ != null) {
                fFloatValue = fLJIIIIZZ.floatValue();
            }
            gradientDrawable.setCornerRadius(LIZIZ(fFloatValue, context));
            return;
        }
        if (u.LJIIZILJ(lowerCase, "px", false)) {
            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(u.LJJIFFI(lowerCase, "px", "", false));
            if (fLJIIIIZZ2 != null) {
                fFloatValue = fLJIIIIZZ2.floatValue();
            }
            gradientDrawable.setCornerRadius(fFloatValue);
            return;
        }
        Float fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(lowerCase);
        if (fLJIIIIZZ3 != null) {
            fFloatValue = fLJIIIIZZ3.floatValue();
        }
        gradientDrawable.setCornerRadius(LIZIZ(fFloatValue, context));
    }
}
