package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INearbyFeedService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.nearby.api.INearbyMobService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376320lv4 {
    public static final C1376320lv4 LIZ = new C1376320lv4();

    public static String LIZ(Aweme aweme) {
        String uid;
        if (aweme.getAuthor() != null) {
            C0XQ7.LJ();
            String curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            if (TextUtils.equals(curUserId, uid)) {
                return "self";
            }
            return "other";
        }
        return "other";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZIZ(java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            java.lang.String r1 = "shortcut_panel"
            switch(r0) {
                case -856829657: goto Lc;
                case 108405416: goto L17;
                case 573144267: goto L20;
                case 694717273: goto L27;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = ""
        Lb:
            return r1
        Lc:
            java.lang.String r0 = "long_press_download"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r1 = "long_press"
            return r1
        L17:
            java.lang.String r0 = "retry"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto Lb
            goto L9
        L20:
            boolean r0 = r2.equals(r1)
            if (r0 != 0) goto Lb
            goto L9
        L27:
            java.lang.String r0 = "click_download_icon"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            java.lang.String r1 = "share_panel"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376320lv4.LIZIZ(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Pair<java.lang.Integer, java.lang.String> LIZLLL(int r2) {
        /*
            if (r2 == 0) goto L66
            r0 = 1
            if (r2 == r0) goto L63
            r0 = 2
            if (r2 == r0) goto L60
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 == r0) goto L5c
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r2 == r0) goto L58
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 == r0) goto L5c
            r0 = 2001(0x7d1, float:2.804E-42)
            if (r2 == r0) goto L58
            r0 = 3002(0xbba, float:4.207E-42)
            if (r2 == r0) goto L54
            r0 = 3003(0xbbb, float:4.208E-42)
            if (r2 == r0) goto L4f
            r0 = 4000(0xfa0, float:5.605E-42)
            if (r2 == r0) goto L4b
            r0 = 4001(0xfa1, float:5.607E-42)
            if (r2 == r0) goto L46
            r0 = 5000(0x1388, float:7.006E-42)
            if (r2 == r0) goto L42
            r0 = 8000(0x1f40, float:1.121E-41)
            if (r2 == r0) goto L3d
            r0 = -1
            java.lang.String r2 = ""
        L33:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            return r1
        L3d:
            r0 = 20
            java.lang.String r2 = "window_follow"
            goto L33
        L42:
            r0 = 7
            java.lang.String r2 = "found"
            goto L33
        L46:
            r0 = 8
            java.lang.String r2 = "music_new"
            goto L33
        L4b:
            r0 = 6
            java.lang.String r2 = "music_hot"
            goto L33
        L4f:
            r0 = 9
            java.lang.String r2 = "challenge"
            goto L33
        L54:
            r0 = 5
            java.lang.String r2 = "challenge_hot"
            goto L33
        L58:
            r0 = 4
            java.lang.String r2 = "personal_collection"
            goto L33
        L5c:
            r0 = 3
            java.lang.String r2 = "personal_homepage"
            goto L33
        L60:
            java.lang.String r2 = "homepage_fresh"
            goto L33
        L63:
            java.lang.String r2 = "homepage_follow"
            goto L33
        L66:
            r0 = 0
            java.lang.String r2 = "homepage_hot"
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376320lv4.LIZLLL(int):kotlin.Pair");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LIZJ(Aweme aweme, String str, String str2, String str3, String str4, Bundle bundle) {
        String idStr;
        C2344009Gk c2344009Gk = new C2344009Gk();
        C735840Sti c735840Sti = C735840Sti.LIZ;
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("enter_from", str);
        LIZ.getClass();
        c2344009Gk.LJIIIIZZ("download_type", LIZ(aweme));
        c2344009Gk.LJIIIIZZ("download_method", str2);
        c2344009Gk.LJIIIIZZ("panel_source", LIZIZ(str2));
        C1376270luz.LIZ.getClass();
        c2344009Gk.LIZJ(C1376270luz.LJIIIZ, "retry_time");
        c2344009Gk.LJIIIIZZ("compilation_id", AwemeExtKt.getMixId(aweme));
        c2344009Gk.LJIIIIZZ("impr_type", C735370Ssx.LJI(aweme));
        c2344009Gk.LIZJ(0, "is_reposted");
        c2344009Gk.LJIIIIZZ("from_group_id", str3);
        String string = bundle.getString("detail_tab_name");
        if (string == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("detail_tab_name", string);
        c2344009Gk.LIZJ(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        C1359610lU7.LJ(c2344009Gk, aweme, null);
        c2344009Gk.LJIIIIZZ("is_save_with_watermark", "1");
        C1380890m2R.LIZJ(c2344009Gk, aweme.getAid());
        Activity activityLJFF = C2214201BlK.LJFF();
        c735840Sti.getClass();
        c2344009Gk.LJIIIIZZ("enter_position", C735840Sti.LJIIJ(activityLJFF, null, null));
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        c2344009Gk.LIZJ(aweme.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
        String string2 = bundle.getString("is_self_video");
        if (string2 == null) {
            string2 = "";
        }
        c2344009Gk.LJIIIIZZ("is_self_video", string2);
        String string3 = bundle.getString("download_id");
        if (string3 == null) {
            string3 = "";
        }
        c2344009Gk.LJFF("download_id", string3);
        if (str4 != null && str4.length() != 0) {
            c2344009Gk.LJFF("news_id", str4);
        }
        if (((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJIIZILJ(str)) {
            c2344009Gk.LJFF("play_mode", ((FypAutoScrollService) ServiceManager.get().getService(FypAutoScrollService.class)).LJI());
        }
        if (AwemeExtKt.getRepostFromGroupId(aweme) != null || AwemeExtKt.getRepostFromUserId(aweme) != null) {
            c2344009Gk.LJFF("group_id", AwemeExtKt.getRepostFromGroupId(aweme));
            c2344009Gk.LJFF("author_id", AwemeExtKt.getRepostFromUserId(aweme));
            c2344009Gk.LJFF("repost_from_group_id", aweme.getAid());
            c2344009Gk.LJFF("repost_from_user_id", AwemeExtKt.getAuthorUid(aweme));
            c2344009Gk.LIZJ(1, "is_reposted");
        }
        if (C735370Ssx.LJJIJL(str)) {
            if (!TextUtils.equals(str, "homepage_fresh")) {
                TextUtils.equals(str, "homepage_channel");
            }
            c2344009Gk.LJFF("log_pb", C584850Mwl.LIZ.LIZIZ(C735370Ssx.LJIJJ(aweme)));
        }
        if ("".length() > 0) {
            c2344009Gk.LJFF("action_on", "");
        }
        ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJFF(c2344009Gk, aweme);
        C1ER1 c1er1 = C1ER1.LIZIZ;
        Map<String, String> mapFetchSearchParams = c1er1.fetchSearchParams(str, c1er1.LLZLLLL(str));
        if (!mapFetchSearchParams.isEmpty()) {
            c2344009Gk.LJII(mapFetchSearchParams);
        }
        C1606660rua.LIZIZ.LIZJ(str, (HashMap) c2344009Gk.LIZ, aweme, false);
        C1367960lha.LIZ.getClass();
        Map mapLJIILJJIL = C1367960lha.LIZ().LJIILJJIL(aweme, null);
        if (!mapLJIILJJIL.isEmpty()) {
            c2344009Gk.LJII(mapLJIILJJIL);
        }
        C1357130lQ7.LIZIZ(c2344009Gk, "download", null);
        c2344009Gk.LIZJ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(C2214201BlK.LJFF(), aweme), "music_name");
        Music music = aweme.getMusic();
        if (music != null && (idStr = music.getIdStr()) != null) {
            c2344009Gk.LJFF("music_id", idStr);
        }
        c1er1.LJJJJ().LIZ(c2344009Gk, aweme);
        Map<String, String> mapH0 = c1er1.h0(aweme);
        if (mapH0 != null) {
            c2344009Gk.LJII(mapH0);
        }
        C1370890lmJ c1370890lmJ = C1370890lmJ.LIZ;
        Object objLJIIIZ = C19651011uW.LIZIZ.LJIIIZ(aweme, c2344009Gk);
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        c1370890lmJ.appendCreationParams(objLJIIIZ, aweme);
        if (bundle.containsKey("is_enter_graphic_detail")) {
            c2344009Gk.LIZJ(bundle.getInt("is_enter_graphic_detail", 0), "is_enter_graphic_detail");
        }
        if (Intrinsics.LJFF(str, "homepage_nearby")) {
            HashMap<String, String> map = new HashMap<>();
            ((INearbyMobService) ServiceManager.get().getService(INearbyFeedService.class)).LIZJ(str, map, aweme, false);
            if (!map.isEmpty()) {
                c2344009Gk.LJI(map);
            }
        }
        ShareDependService.LIZ.getClass();
        ShareDependServiceImpl.LJJJJI().LJJIL(c2344009Gk);
    }
}
