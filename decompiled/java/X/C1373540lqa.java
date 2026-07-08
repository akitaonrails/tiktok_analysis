package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.share.improve.handler.AwemePhotoShareAbilityHandler;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373540lqa {
    public static boolean LJ(Aweme aweme) {
        AwemeACLShare awemeACLShare;
        AwemeACLShare awemeACLShare2;
        if (aweme != null) {
            awemeACLShare = aweme.awemeACLShareInfo;
        } else {
            awemeACLShare = null;
        }
        if (awemeACLShare == null) {
            return false;
        }
        ACLCommonShare aCLCommonShareLJI = LJI(aweme);
        if (aCLCommonShareLJI == null) {
            return true;
        }
        if (aCLCommonShareLJI.getCode() != 0 || (awemeACLShare2 = aweme.awemeACLShareInfo) == null || awemeACLShare2.getShareListStatus() != 0) {
            return false;
        }
        return true;
    }

    public static EnumC114200c0 LJFF(String str) {
        if (!Intrinsics.LJFF(str, "copy") && !Intrinsics.LJFF(str, "qr_code")) {
            final Activity activityLJFF = C2214201BlK.LJFF();
            C1377070lwH c1377070lwH = new C1377070lwH(new InterfaceC1378050lxr() { // from class: X.0lqx
                @Override // X.InterfaceC1378050lxr
                public final Activity get() {
                    return activityLJFF;
                }
            }, AFwS259S0000000_21.get$arr$(220));
            C1374800lsc.LIZ.getClass();
            InterfaceC1369790lkX interfaceC1369790lkXLIZIZ = C1374800lsc.LIZIZ(str, c1377070lwH);
            if (interfaceC1369790lkXLIZIZ != null && interfaceC1369790lkXLIZIZ.LJJIII()) {
                return EnumC114200c0.THIRD_PLATFORM_FLAG;
            }
            return EnumC114200c0.OTHER_PLATFORM_FLAG;
        }
        return EnumC114200c0.THIRD_PLATFORM_FLAG;
    }

    public static ACLCommonShare LJI(Aweme aweme) {
        ACLCommonShare shareThirdPlatform;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && (shareThirdPlatform = awemeACLShare.getShareThirdPlatform()) != null) {
            shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
            return shareThirdPlatform;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LJIIIIZZ(String str) {
        switch (str.hashCode()) {
            case -1837180097:
                if (!str.equals("whatsapp_status")) {
                    return false;
                }
                return true;
            case 96619420:
                if (!str.equals("email")) {
                    return false;
                }
                return true;
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return false;
                }
                return true;
            case 497130182:
                if (!str.equals("facebook")) {
                    return false;
                }
                return true;
            case 1934780818:
                if (!str.equals("whatsapp")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean LJIIIZ(Aweme aweme) {
        if (aweme.getAwemeType() == 41 || aweme.getAwemeType() == 43) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LJIIJ(String str) {
        switch (str.hashCode()) {
            case -991745245:
                if (!str.equals("youtube")) {
                    return false;
                }
                return true;
            case -816556504:
                if (!str.equals("instagram_story")) {
                    return false;
                }
                return true;
            case 3731178:
                if (!str.equals("zalo")) {
                    return false;
                }
                return true;
            case 28903346:
                if (!str.equals("instagram")) {
                    return false;
                }
                return true;
            case 284397090:
                if (!str.equals("snapchat")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LJIIJJI(String str) {
        switch (str.hashCode()) {
            case -1837180097:
                if (!str.equals("whatsapp_status")) {
                    return false;
                }
                return true;
            case -991745245:
                if (!str.equals("youtube")) {
                    return false;
                }
                return true;
            case -816556504:
                if (!str.equals("instagram_story")) {
                    return false;
                }
                return true;
            case 28903346:
                if (!str.equals("instagram")) {
                    return false;
                }
                return true;
            case 96619420:
                if (!str.equals("email")) {
                    return false;
                }
                return true;
            case 284397090:
                if (!str.equals("snapchat")) {
                    return false;
                }
                return true;
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return false;
                }
                return true;
            case 497130182:
                if (!str.equals("facebook")) {
                    return false;
                }
                return true;
            case 1934780818:
                if (!str.equals("whatsapp")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static boolean LJIILJJIL(Aweme aweme) {
        Activity activityLJFF;
        ACLCommonShare aCLCommonShareLJI = LJI(aweme);
        if (aCLCommonShareLJI == null) {
            return true;
        }
        String toastMsg = aCLCommonShareLJI.getToastMsg();
        if (toastMsg != null && (activityLJFF = C2214201BlK.LJFF()) != null && toastMsg.length() > 0) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
            c1389890mGx.LJIIJ(toastMsg);
            c1389890mGx.LJIIJJI();
        }
        if (aCLCommonShareLJI.getCode() == 0) {
            return true;
        }
        return false;
    }

    public static void LIZ(Context context, AlertDialogC1377870lxZ alertDialogC1377870lxZ) {
        if ((C1388190mED.LIZ(context) == null || (!C1388190mED.LIZ(context).isFinishing() && !C1388190mED.LIZ(context).isDestroyed())) && alertDialogC1377870lxZ.isShowing()) {
            alertDialogC1377870lxZ.dismiss();
            C785410UrT.LIZ(alertDialogC1377870lxZ);
        }
    }

    public static ACLCommonShare LJII(Aweme aweme, String str) {
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null) {
            ACLCommonShare shareThirdPlatform = awemeACLShare.getShareThirdPlatform();
            if (shareThirdPlatform != null) {
                shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
                return shareThirdPlatform;
            }
            List<ACLCommonShare> platformList = awemeACLShare.getPlatformList();
            if (platformList != null) {
                for (ACLCommonShare aCLCommonShare : platformList) {
                    if (TextUtils.equals(str, aCLCommonShare.getPlatformId())) {
                        aCLCommonShare.setAwemeAclType(AclType.PLATFORM_LIST);
                        return aCLCommonShare;
                    }
                }
            }
            ACLCommonShare shareGeneral = awemeACLShare.getShareGeneral();
            if (shareGeneral != null) {
                shareGeneral.setAwemeAclType(AclType.SHARE_GENERAL);
            }
            return awemeACLShare.getShareGeneral();
        }
        return null;
    }

    public static boolean LJIILIIL(AwemeSharePackage awemeSharePackage, String str, InterfaceC1373810lr1 interfaceC1373810lr1) {
        ACLCommonShare shareThirdPlatform;
        Activity currentActivity;
        AwemeACLShare awemeACLShare = awemeSharePackage.LJJIFFI().awemeACLShareInfo;
        Intent intentLJJJJJL = null;
        if (awemeACLShare != null) {
            shareThirdPlatform = awemeACLShare.getShareThirdPlatform();
        } else {
            shareThirdPlatform = null;
        }
        if (shareThirdPlatform != null) {
            interfaceC1373810lr1.LIZIZ();
            return true;
        }
        ACLCommonShare aCLCommonShareLJII = LJII(awemeSharePackage.LJJIFFI(), str);
        if (aCLCommonShareLJII != null) {
            InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ(str, null, null, 6);
            if (interfaceC1369790lkXLIZ instanceof C1376080lug) {
                if (aCLCommonShareLJII.getCode() == 0) {
                    C1376080lug c1376080lug = (C1376080lug) interfaceC1369790lkXLIZ;
                    c1376080lug.getClass();
                    InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
                    if (interfaceC1370110ll3 != null && (currentActivity = interfaceC1370110ll3.getCurrentActivity()) != null) {
                        intentLJJJJJL = c1376080lug.LJJJJJL(currentActivity, "image/*");
                    }
                    c1376080lug.LLILZ = intentLJJJJJL;
                    if (intentLJJJJJL != null) {
                        interfaceC1373810lr1.LIZIZ();
                        return true;
                    }
                }
                interfaceC1373810lr1.LIZ();
                return false;
            }
            if (aCLCommonShareLJII.getCode() == 0) {
                interfaceC1373810lr1.LIZIZ();
                return true;
            }
            interfaceC1373810lr1.LIZ();
            return false;
        }
        interfaceC1373810lr1.LIZ();
        return false;
    }

    public static boolean LJIJ(AwemeSharePackage awemeSharePackage, String str, InterfaceC1373820lr2 interfaceC1373820lr2) {
        Activity currentActivity;
        if (awemeSharePackage.LJJIFFI() != null) {
            AwemeACLShare awemeACLShare = awemeSharePackage.LJJIFFI().awemeACLShareInfo;
            Intent intentLJJJJJL = null;
            if (awemeACLShare != null && awemeACLShare.getShareThirdPlatform() != null) {
                interfaceC1373820lr2.LIZIZ();
                return true;
            }
            ACLCommonShare aCLCommonShareLJII = LJII(awemeSharePackage.LJJIFFI(), str);
            if (aCLCommonShareLJII != null) {
                InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1374810lsd.LIZ(str, null, null, 6);
                if (interfaceC1369790lkXLIZ instanceof C1376080lug) {
                    if (aCLCommonShareLJII.getCode() == 0) {
                        C1376080lug c1376080lug = (C1376080lug) interfaceC1369790lkXLIZ;
                        c1376080lug.getClass();
                        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
                        if (interfaceC1370110ll3 != null && (currentActivity = interfaceC1370110ll3.getCurrentActivity()) != null) {
                            intentLJJJJJL = c1376080lug.LJJJJJL(currentActivity, "video/*");
                        }
                        c1376080lug.LLILLL = intentLJJJJJL;
                        if (intentLJJJJJL != null) {
                            interfaceC1373820lr2.LIZIZ();
                            return true;
                        }
                    }
                    interfaceC1373820lr2.LIZ();
                    return false;
                }
                if (aCLCommonShareLJII.getCode() == 0) {
                    interfaceC1373820lr2.LIZIZ();
                    return true;
                }
                interfaceC1373820lr2.LIZ();
                return false;
            }
        }
        interfaceC1373820lr2.LIZ();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033a A[Catch: Exception -> 0x03c0, TryCatch #0 {Exception -> 0x03c0, blocks: (B:168:0x0308, B:171:0x0311, B:173:0x031e, B:175:0x0334, B:177:0x0346, B:179:0x0373, B:181:0x037c, B:184:0x0385, B:187:0x038c, B:191:0x03a8, B:193:0x03ae, B:194:0x03b2, B:195:0x03b5, B:176:0x033a), top: B:220:0x0308 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v111, types: [X.0lkX] */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v94, types: [T, com.ss.android.ugc.aweme.share.improve.channel.AIRemixChannel] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0lnS] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(final com.ss.android.ugc.aweme.feed.model.Aweme r20, android.content.Context r21, java.lang.String r22, final java.lang.String r23, com.ss.android.ugc.aweme.sharer.model.SharePackage r24) {
        /*
            Method dump skipped, instruction units count: 1053
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373540lqa.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.sharer.model.SharePackage):void");
    }

    public static void LJIIL(int i, int i2, int i3, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "download");
        c2344009Gk.LJIIIIZZ("now_type", str2);
        c2344009Gk.LIZJ(i, "is_today");
        c2344009Gk.LIZJ(i2, "is_self");
        c2344009Gk.LIZJ(i3, "privacy_setting");
        c2344009Gk.LJIIIIZZ("panel_source_v2", "share_panel");
        C20684815ws.LJIILLIIL("show_panel_function", c2344009Gk.LIZ);
    }

    public static void LJIIZILJ(Context context, View view, AwemeSharePackage awemeSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, Function1 function1) {
        C1376270luz c1376270luz = C1376270luz.LIZ;
        String strKey = interfaceC1369790lkX.key();
        c1376270luz.getClass();
        C1376270luz.LJIIIIZZ = strKey;
        C1375730lu7 c1375730lu7 = C1375730lu7.LIZIZ;
        c1375730lu7.LJ();
        c1375730lu7.LJIIJJI();
        C1375740lu8 c1375740lu8 = C1375740lu8.LIZ;
        Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        c1375740lu8.getClass();
        if (C1375740lu8.LIZ(context, awemeLJJIFFI, "download_to_share") && C1375500ltk.LJII(context) != null && awemeSharePackage.LJJIFFI() != null) {
            C1373540lqa c1373540lqa = C1373850lr5.LIZ;
            Aweme awemeLJJIFFI2 = awemeSharePackage.LJJIFFI();
            String strKey2 = interfaceC1369790lkX.key();
            c1373540lqa.getClass();
            ACLCommonShare aCLCommonShareLJII = LJII(awemeLJJIFFI2, strKey2);
            if (aCLCommonShareLJII == null) {
                return;
            }
            String toastMsg = aCLCommonShareLJII.getToastMsg();
            if (toastMsg != null && toastMsg.length() != 0) {
                int code = aCLCommonShareLJII.getCode();
                if (code != 1) {
                    if (code == 2) {
                        C1373550lqb c1373550lqb = C1373550lqb.LIZ;
                        String strKey3 = interfaceC1369790lkX.key();
                        AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(function1, (Function1<? super Boolean, Unit>) 818);
                        c1373550lqb.getClass();
                        C1373550lqb.LIZ(awemeSharePackage, context, view, strKey3, toastMsg, awS565S0100000_21);
                    }
                } else {
                    if (view != null) {
                        if (C299060Bns.LIZ()) {
                            C1389880mGw c1389880mGw = new C1389880mGw(view);
                            c1389880mGw.LJIIIZ(toastMsg);
                            c1389880mGw.LJIIJ();
                        } else {
                            C1389890mGx c1389890mGx = new C1389890mGx(view);
                            c1389890mGx.LJIIJ(toastMsg);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                    function1.invoke(Boolean.FALSE);
                }
            }
            if (aCLCommonShareLJII.getCode() == 0) {
                if (C710930Rud.LJII(awemeSharePackage.LJJIFFI())) {
                    if (awemeSharePackage.aweme != null) {
                        new AwemePhotoShareAbilityHandler(context, function1).LJIIJJI(context, null, awemeSharePackage, interfaceC1369790lkX);
                        return;
                    }
                    return;
                }
                new AwemePhotoShareAbilityHandler(context, function1).LJIIJJI(context, null, awemeSharePackage, interfaceC1369790lkX);
            }
        }
    }

    public static void LJIILLIIL(AwemeSharePackage awemeSharePackage, String str, Context context, View view, final Function1 function1, final Function0 function0) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        Aweme awemeLJJIFFI = awemeSharePackage.LJJIFFI();
        boolean zLJFF = Intrinsics.LJFF(str, "instagram");
        int i = awemeSharePackage.extras.getInt("page_type");
        AbstractC1375080lt4 abstractC1375080lt4 = new AbstractC1375080lt4() { // from class: X.0lqq
            @Override // X.AbstractC1375080lt4
            public final void LIZJ(String str2) {
                function0.invoke();
            }

            @Override // X.AbstractC1375080lt4
            public final void LJFF(String str2, String str3, boolean z) {
                function1.invoke(str2);
            }
        };
        String string = awemeSharePackage.extras.getString("enter_from");
        if (string == null) {
            string = "";
        }
        LIZJ(activityLIZ, view, awemeLJJIFFI, zLJFF, i, str, abstractC1375080lt4, string, awemeSharePackage);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r15, X.InterfaceC1369790lkX r16, com.ss.android.ugc.aweme.sharer.model.SharePackage r17, java.lang.String r18, int r19, java.lang.String r20, kotlin.jvm.functions.Function1 r21) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1373540lqa.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.0lkX, com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.String, int, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public static void LIZJ(Activity activity, View view, Aweme aweme, boolean z, int i, String str, AbstractC1375080lt4 abstractC1375080lt4, String str2, SharePackage sharePackage) {
        if (activity != null) {
            C726220SeC c726220SeC = C726220SeC.LIZIZ;
            if (c726220SeC.LIZ(activity)) {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null && !c726220SeC.LIZ(activityLJFF)) {
                    C1373850lr5.LIZ.getClass();
                    LJIILL(activityLJFF, view, aweme, z, i, str, abstractC1375080lt4, str2, sharePackage);
                    return;
                } else {
                    C0TBO.LIZ(new C1373690lqp(view, aweme, z, i, str, abstractC1375080lt4, str2, sharePackage));
                    return;
                }
            }
            C1373850lr5.LIZ.getClass();
            LJIILL(activity, view, aweme, z, i, str, abstractC1375080lt4, str2, sharePackage);
        }
    }

    public static void LJIILL(Activity activity, View view, final Aweme aweme, boolean z, int i, String str, final AbstractC1375080lt4 abstractC1375080lt4, String str2, final SharePackage sharePackage) {
        C1375740lu8.LIZ.getClass();
        if (!C1375740lu8.LIZ(activity, aweme, "download_to_share")) {
            return;
        }
        int iLJJIII = C0SXF.LJJIII(activity, aweme);
        C1554960qZC.LIZ(GScope.LL, new C1380780m2G(aweme, str2, "download_to_share", C0SXF.LJJIII(activity, aweme), UUID.randomUUID().toString(), null, null, 401), C1380780m2G.class, "Download");
        final ACLCommonShare aCLCommonShareLJII = LJII(aweme, str);
        if (aCLCommonShareLJII == null) {
            return;
        }
        String popupMsg = aCLCommonShareLJII.getPopupMsg();
        InterfaceC21168717sj interfaceC21168717sj = new InterfaceC21168717sj() { // from class: X.0lso
            @Override // X.InterfaceC21168717sj
            public final void onCancel() {
                abstractC1375080lt4.LIZ(null);
                LIZ(false);
            }

            @Override // X.InterfaceC21168717sj
            public final void onFailed() {
                abstractC1375080lt4.LIZJ(null);
                LIZ(false);
            }

            @Override // X.InterfaceC21168717sj
            public final void onStart() {
                String string;
                Bundle bundle;
                abstractC1375080lt4.LIZLLL();
                LIZ(true);
                if (C297600BlW.LIZ()) {
                    Video video = aweme.getVideo();
                    if (video == null || video.getDownloadNoWatermarkAddr() == null) {
                        SharePackage sharePackage2 = sharePackage;
                        if (sharePackage2 == null || (bundle = sharePackage2.extras) == null || (string = bundle.getString("enter_from")) == null) {
                            string = "";
                        }
                        C1374940lsq c1374940lsq = C1374940lsq.LIZ;
                        Aweme aweme2 = aweme;
                        ACLCommonShare aCLCommonShare = aCLCommonShareLJII;
                        int showType = aCLCommonShare != null ? aCLCommonShare.getShowType() : 0;
                        ACLCommonShare aCLCommonShare2 = aCLCommonShareLJII;
                        int transcode = aCLCommonShare2 != null ? aCLCommonShare2.getTranscode() : -1;
                        c1374940lsq.getClass();
                        C1374940lsq.LIZ(showType, transcode, aweme2, "download", "download_to_share", string);
                    }
                }
            }

            public static void LIZ(boolean z2) {
                C1440005kM.LIZ(new C453940Hr6(z2, false, 6));
            }

            @Override // X.InterfaceC21168717sj
            public final void onProgress(int i2) {
                abstractC1375080lt4.LIZIZ(i2);
            }

            @Override // X.InterfaceC21168717sj
            public final void onSuccess(String str3) {
                if (str3 != null && str3.length() != 0) {
                    abstractC1375080lt4.LJFF(str3, null, false);
                    LIZ(false);
                }
            }
        };
        C1379870m0n.LIZ.getClass();
        final AbstractC1382550m57 abstractC1382550m57LIZ = C1379870m0n.LIZ(activity, interfaceC21168717sj, aweme, str2, "download_to_share", z, "share_download", i, str, "", iLJJIII, false);
        if (popupMsg != null && popupMsg.length() != 0) {
            C1377040lwE c1377040lwE = C1377040lwE.LIZ;
            Integer numValueOf = Integer.valueOf(aCLCommonShareLJII.getCode());
            InterfaceC1377050lwF interfaceC1377050lwF = new InterfaceC1377050lwF() { // from class: X.0lqn
                @Override // X.InterfaceC1377050lwF
                public final void LIZ() {
                }

                @Override // X.InterfaceC1377050lwF
                public final void LIZIZ() {
                    if (aCLCommonShareLJII.getCode() == 0) {
                        C21169617ss c21169617ss = C21169617ss.LIZ;
                        AbstractC21169117sn abstractC21169117sn = abstractC1382550m57LIZ;
                        c21169617ss.getClass();
                        C21169617ss.LIZIZ(abstractC21169117sn);
                    }
                }
            };
            c1377040lwE.getClass();
            C1377040lwE.LIZ(activity, popupMsg, numValueOf, interfaceC1377050lwF, true);
            return;
        }
        String toastMsg = aCLCommonShareLJII.getToastMsg();
        if (toastMsg != null && toastMsg.length() != 0) {
            int code = aCLCommonShareLJII.getCode();
            if (code != 1) {
                if (code == 2 && sharePackage != null) {
                    C1373550lqb c1373550lqb = C1373550lqb.LIZ;
                    C1373730lqt c1373730lqt = new C1373730lqt(sharePackage, abstractC1375080lt4);
                    c1373550lqb.getClass();
                    C1373550lqb.LIZ(sharePackage, activity, view, str, toastMsg, c1373730lqt);
                }
            } else {
                if (sharePackage != null) {
                    sharePackage.extras.remove("share_action_key");
                    sharePackage.extras.remove("share_platform");
                }
                if (view != null) {
                    if (C299060Bns.LIZ()) {
                        C1389880mGw c1389880mGw = new C1389880mGw(view);
                        c1389880mGw.LJIIIZ(toastMsg);
                        c1389880mGw.LJIIJ();
                    } else {
                        C1389890mGx c1389890mGx = new C1389890mGx(view);
                        c1389890mGx.LJIIJ(toastMsg);
                        c1389890mGx.LJIIJJI();
                    }
                }
                abstractC1375080lt4.LIZJ(null);
            }
        }
        if (aCLCommonShareLJII.getCode() == 0) {
            C21169617ss.LIZ.getClass();
            C21169617ss.LIZIZ(abstractC1382550m57LIZ);
        }
    }
}
