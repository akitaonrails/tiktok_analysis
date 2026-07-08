package X;

import Y.ACallableS25S1000000_12;
import Y.ACallableS426S0100000_21;
import Y.ACallableS57S1100000_2;
import Y.ACallableS64S1100000_12;
import Y.AComparatorS25S0000000_6;
import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.model.Word;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentAudioModel;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContentTypeMobParams;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import com.ss.android.ugc.aweme.comment.model.Volume;
import com.ss.android.ugc.aweme.commentv2.uitls.CommentAppLogSamplingOpt;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.feed.model.ZeroCommentConfig;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicDetailCommonModel;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350920lG6 {
    public static boolean LIZIZ;
    public static final C1350920lG6 LIZ = new C1350920lG6();
    public static final LinkedHashMap<String, Unit> LIZJ = new LinkedHashMap<>(8, 0.75f, true);
    public static final LinkedHashMap<String, List<C1349870lEP>> LIZLLL = new LinkedHashMap<>(8, 0.75f, true);
    public static boolean LJ = true;

    public static String LIZ(Intent intent) {
        try {
            return intent.getStringExtra("push_label");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LJFF(Callable<Unit> callable) throws Exception {
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C15O7.LIZIZ(callable, C20684815ws.LJFF(), null);
        } else {
            callable.call();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJJI(com.ss.android.ugc.aweme.comment.model.CommentContextSource r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L42
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r3.getCommonModel()
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.enterFrom
        Lb:
            java.lang.String r1 = "homepage_fresh_topic"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L44
            if (r3 == 0) goto L2e
            com.ss.android.ugc.aweme.comment.model.CommentEventModel r0 = r3.getEventModel()
            if (r0 == 0) goto L25
            boolean r1 = r0.isHotPlayer()
            r0 = 1
            if (r1 != r0) goto L25
            java.lang.String r2 = "trending_page"
        L24:
            return r2
        L25:
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r3.getCommonModel()
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.eventType
            goto L2f
        L2e:
            r0 = r2
        L2f:
            java.lang.String r1 = "paid_series_detail_page"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L44
            if (r3 == 0) goto L24
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r3.getCommonModel()
            if (r0 == 0) goto L24
            java.lang.String r2 = r0.enterFrom
            return r2
        L42:
            r0 = r2
            goto Lb
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJIIJJI(com.ss.android.ugc.aweme.comment.model.CommentContextSource):java.lang.String");
    }

    public static int LJIIL(User user) {
        if (user == null) {
            return -1;
        }
        if (((AbstractC848400XPy) C0XQ7.LJFF()).LIZJ(user.getUid())) {
            return 4;
        }
        if (user.getFollowStatus() == 2) {
            return 2;
        }
        if (user.getFollowStatus() == 1) {
            return 1;
        }
        if (user.getFollowerStatus() == 1) {
            return 3;
        }
        return 0;
    }

    public static String LJIILIIL(Comment comment) {
        List<CommentImageStruct> imageList;
        CommentImageStruct commentImageStruct;
        if (comment != null && (imageList = comment.getImageList()) != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLZIJ(0, imageList)) != null && commentImageStruct.getSource() == 2) {
            return "visual_poet";
        }
        return "upload";
    }

    public static final String LJIILJJIL(String str) {
        if (Intrinsics.LJFF(str, "click_label")) {
            return "click_to_other_tab";
        }
        if (!Intrinsics.LJFF(str, "slide")) {
            return str;
        }
        return "slide_to_other_tab";
    }

    public static final void LJJIL(String str) {
        boolean zLJI = MethodIDManager.LJI(137742);
        LIZ.getClass();
        if (LJJIJIL(2, str)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            LJFF(new ACallableS25S1000000_12(str, 1));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static final void LJLLL(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("action_type", str);
        c2344009Gk.LJFF("tag_type", "icon");
        LJJJ(c2344009Gk, "click_liked_by_creator");
    }

    public static void LLI(LinkedHashMap linkedHashMap) {
        if (linkedHashMap.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            sb.append(((Number) ((Map.Entry) it2.next()).getValue()).intValue());
            sb.append(',');
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "comment");
        c2344009Gk.LJIIIIZZ("cnt", sb.toString());
        LJJJ(c2344009Gk, "send_emoji");
    }

    public final synchronized void LJI(String str) {
        if (str != null) {
            if (str.length() != 0) {
                LIZJ.remove(str);
                LIZLLL.remove(str);
            }
        }
    }

    public static void LIZIZ(C2344009Gk c2344009Gk, Comment comment) {
        CmtAudioStruct audioStruct;
        Float fValueOf;
        Volume volume;
        Double d;
        Volume volume2;
        Volume volume3;
        List<Float> listLJ;
        if (comment != null && (audioStruct = comment.getAudioStruct()) != null) {
            c2344009Gk.LJ(audioStruct.getDurationMillis(), "audio_duration");
            Double d2 = null;
            try {
                String wave = audioStruct.getWave();
                if (wave != null && (listLJ = C1345110l6j.LJ(wave)) != null) {
                    fValueOf = Float.valueOf(C1345110l6j.LIZLLL(listLJ));
                } else {
                    fValueOf = null;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                fValueOf = Float.valueOf(0.0f);
            }
            c2344009Gk.LJ(fValueOf, "audio_volume");
            CommentAudioModel audioModel = audioStruct.getAudioModel();
            if (audioModel != null && (volume = audioModel.volume) != null && volume.loudness != null) {
                CommentAudioModel audioModel2 = audioStruct.getAudioModel();
                if (audioModel2 != null && (volume3 = audioModel2.volume) != null) {
                    d = volume3.loudness;
                } else {
                    d = null;
                }
                c2344009Gk.LJ(d, "audio_ori_loudness");
                CommentAudioModel audioModel3 = audioStruct.getAudioModel();
                if (audioModel3 != null && (volume2 = audioModel3.volume) != null) {
                    d2 = volume2.peak;
                }
                c2344009Gk.LJ(d2, "audio_ori_peak_loudness");
            }
        }
    }

    public static void LIZJ(AbstractC1386130mAt abstractC1386130mAt, int i) {
        if (C1EE2.LIZIZ.LIZLLL()) {
            abstractC1386130mAt.LIZLLL(i, "is_enter_graphic_detail");
        }
    }

    public static C2344009Gk LJIIIZ(String str, String str2) {
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJFF("group_id", str2);
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(str2);
        if (awemeLLILZ != null) {
            authorUid = AwemeExtKt.getAuthorUid(awemeLLILZ);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJFF("author_id", authorUid);
        return c2344009Gk;
    }

    public static boolean LJIIZILJ(CharSequence charSequence, List list) {
        if (charSequence == null || list == null) {
            return false;
        }
        int end = 0;
        for (TextExtraStruct textExtraStruct : C13LP.LJLLLL(new AComparatorS25S0000000_6(10), list)) {
            int start = textExtraStruct.getStart();
            LIZ.getClass();
            if (end < start && !a0.LJJJIL(charSequence.subSequence(end, start))) {
                return false;
            }
            end = textExtraStruct.getEnd();
        }
        int length = charSequence.length();
        if (end >= length) {
            return true;
        }
        return a0.LJJJIL(charSequence.subSequence(end, length));
    }

    public static void LJJIJIIJIL(CommentContextSource commentContextSource, String str) {
        String aid;
        int awemeType;
        String authorUid;
        if (commentContextSource == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", CommentContextSourceKt.enterFrom(commentContextSource));
        String str2 = commentContextSource.getCommonModel().titleClickMethod;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("click_actions", str);
        c2344009Gk.LJIIIIZZ("action_from_page", commentContextSource.getActionFromPage());
        Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme2 != null) {
            awemeType = aweme2.getAwemeType();
        } else {
            awemeType = -1;
        }
        c2344009Gk.LIZJ(awemeType, "aweme_type");
        Aweme aweme3 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme3 != null && (authorUid = AwemeExtKt.getAuthorUid(aweme3)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C20684815ws.LJIILLIIL("title_panel_click", c2344009Gk.LIZ);
    }

    public static boolean LJJIJIL(int i, String str) {
        List<String> list;
        if (C2213981Bky.LIZIZ.LIZLLL()) {
            return false;
        }
        CommentAppLogSamplingOpt.LIZ.getClass();
        CommentAppLogSamplingOpt.Config config = (CommentAppLogSamplingOpt.Config) CommentAppLogSamplingOpt.LIZJ.getValue();
        if (config == null) {
            config = CommentAppLogSamplingOpt.LIZIZ;
        }
        if (i == 2) {
            if (!config.enableAfterProcess) {
                return false;
            }
        } else if (i != 1 || !config.enableBeforeProcess || (list = config.samplingEventList) == null || !list.contains(str)) {
            return false;
        }
        if (!AppLog.isHitStickySamplingDrop(str)) {
            return false;
        }
        return true;
    }

    public static final void LJJIZ(String str, JSONObject jSONObject) throws Exception {
        boolean zLJI = MethodIDManager.LJI(137742);
        LIZ.getClass();
        if (LJJIJIL(2, str)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            LJFF(new ACallableS64S1100000_12(jSONObject, str, 3));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static final void LJJJ(C2344009Gk c2344009Gk, String str) {
        boolean zLJI = MethodIDManager.LJI(137742);
        LIZ.getClass();
        if (LJJIJIL(2, str)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            LJFF(new ACallableS57S1100000_2(c2344009Gk, str, 7));
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static final void LJJJI(Comment comment, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("author_id", comment.getUser().getUid());
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(comment.getUser().getUid()) ? 1 : 0, "is_self_pin");
        LJJJ(c2344009Gk, str);
    }

    public static final void LJJJJZI(int i, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LIZJ(i, "is_story");
        LJJJ(c2344009Gk, "click_add_as_post");
    }

    public static void LJJL(Comment comment, String str) {
        String uid;
        int i;
        C161N c161n = C161N.LIZIZ;
        boolean zLJIILIIL = c161n.LJIILIIL(comment);
        boolean zLJIILLIIL = c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("comment_category", C1345700l7g.LIZ(comment));
        User user = comment.getUser();
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        c2344009Gk.LJIIIIZZ("comment_source_language", comment.getCommentLanguage());
        c2344009Gk.LJIIIIZZ("target_language", c161n.LLIIZ());
        c2344009Gk.LIZJ(c161n.LJIILIIL(comment) ? 1 : 0, "is_comment_translatable");
        c2344009Gk.LIZJ(zLJIILLIIL ? 1 : 0, "is_comment_translated");
        int i2 = 1;
        if (zLJIILIIL && C0BJB.LIZ()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_translation_icon_shown");
        if (!C161T.LIZ().LJ(comment.getAwemeId()) || !zLJIILLIIL) {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_auto_translated");
        c2344009Gk.LJIIIIZZ("llm_variant", c161n.LJJLIIIJ().LIZJ(comment));
        C11NZ.LJJJJI(new ACallableS426S0100000_21(c2344009Gk, 14)).LJL(C11S5.LIZ()).LJJLJ();
    }

    public static void LJJLIIIJ(Comment comment, Aweme aweme) {
        List<TextExtraStruct> textExtra;
        String aid;
        if (comment != null && (textExtra = comment.getTextExtra()) != null && !textExtra.isEmpty()) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct.getType() == 8) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    c2344009Gk.LJIIIIZZ("track_id", C03RE.LIZ("", aid, String.valueOf(textExtraStruct.getProductId())));
                    c2344009Gk.LJIIIIZZ("entrance_from", "video_comment_tagging_anchor");
                    c2344009Gk.LJIIIIZZ("source_page_type", "video");
                    c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                    LJJJ(c2344009Gk, "tiktok_video_anchor_click");
                }
            }
        }
    }

    public static final void LJJLJLI(String str, String str2) {
        LIZ.getClass();
        if (LJJIJIL(1, "comment_list_refresh_request")) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("insert_cids", str2);
        LJJJ(c2344009Gk, "comment_list_refresh_request");
    }

    public static final void LJJZZI(Integer num, String str) {
        LIZ.getClass();
        if (LJJIJIL(1, "comment_page_height")) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("type", str);
        Object obj = num;
        if (num == null) {
            obj = "-1";
        }
        c2344009Gk.LJ(obj, "height");
        LJJJ(c2344009Gk, "comment_page_height");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07e3  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJLJL(com.ss.android.ugc.aweme.comment.model.CommentContextSource r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 2703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJLJL(com.ss.android.ugc.aweme.comment.model.CommentContextSource, java.lang.String):void");
    }

    public static void LLF(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("reply_comment_id", str2);
        c2344009Gk.LJIIIIZZ("direct_replied_comment_id", str2);
        c2344009Gk.LJIIIIZZ("author_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        LJJJ(c2344009Gk, "comment_reply_toast_show");
    }

    public static final void LLIL(boolean z, C1339520kxi c1339520kxi) {
        String str;
        String curUserId;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num;
        if (z) {
            str = "translation_success";
        } else {
            str = "translation_fail";
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        String str7 = null;
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        } else {
            curUserId = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (c1339520kxi != null) {
            str2 = c1339520kxi.LIZ;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", str2);
        if (c1339520kxi != null) {
            str3 = c1339520kxi.LJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        if (c1339520kxi != null) {
            str4 = c1339520kxi.LIZJ;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("comment_id", str4);
        if (c1339520kxi != null) {
            str5 = c1339520kxi.LIZLLL;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("position", str5);
        c2344009Gk.LJIIIIZZ("user_id", curUserId);
        if (c1339520kxi != null) {
            str6 = c1339520kxi.LJI;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("comment_source_lang", str6);
        c2344009Gk.LJIIIIZZ("target_lang", C161N.LIZIZ.LLIIZ());
        if (c1339520kxi != null) {
            num = 0;
        } else {
            num = null;
        }
        c2344009Gk.LJ(num, "is_liked_by_author");
        if (c1339520kxi != null) {
            str7 = c1339520kxi.LIZIZ;
        }
        c2344009Gk.LJIIIIZZ("group_id", str7);
        if (c1339520kxi != null) {
            c2344009Gk.LIZIZ((System.currentTimeMillis() - c1339520kxi.LJFF) / LSPassThroughRecordSizeConfig.DEFAULT, "load_duration_overall");
        }
        C207069161b.LJFF(new AnonymousClass0175(), str, c2344009Gk.LIZ);
    }

    public static void LLILLIZIL(C1350930lG7 c1350930lG7, Aweme aweme) {
        if (MusicDetailCommonModel.INSTANCE.isMDPSquareVideo(aweme)) {
            c1350930lG7.LLJJIJIIJIL = true;
        }
    }

    public static void LIZLLL(C2344009Gk c2344009Gk, FypExposedCommentMobParams fypExposedCommentMobParams, String str) {
        int iIntValue;
        String str2;
        long jLongValue;
        Long l;
        String str3;
        String str4;
        Integer numIsFypShow;
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            if (fypExposedCommentMobParams != null && (numIsFypShow = fypExposedCommentMobParams.isFypShow()) != null) {
                iIntValue = numIsFypShow.intValue();
            } else {
                iIntValue = 0;
            }
            c2344009Gk.LIZJ(iIntValue, "is_fyp_show");
            String str5 = null;
            if (fypExposedCommentMobParams != null) {
                str2 = fypExposedCommentMobParams.fypCommentId;
            } else {
                str2 = null;
            }
            if (C123100dR.LIZ(str2)) {
                if (fypExposedCommentMobParams != null) {
                    str4 = fypExposedCommentMobParams.fypCommentId;
                } else {
                    str4 = null;
                }
                c2344009Gk.LJFF("fyp_comment_id", str4);
            }
            if (fypExposedCommentMobParams != null) {
                str5 = fypExposedCommentMobParams.showCmtInterMetricType;
            }
            if (C123100dR.LIZ(str5)) {
                if (fypExposedCommentMobParams == null || (str3 = fypExposedCommentMobParams.showCmtInterMetricType) == null) {
                    str3 = "";
                }
                c2344009Gk.LJFF("show_cmt_inter_metric_type", str3);
            }
            if (fypExposedCommentMobParams != null && fypExposedCommentMobParams.showCmtInterMetricValue != null) {
                if (fypExposedCommentMobParams != null && (l = fypExposedCommentMobParams.showCmtInterMetricValue) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                c2344009Gk.LIZLLL(jLongValue, "show_cmt_inter_metric_value");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.C2344009Gk r3, java.lang.Boolean r4, java.lang.Integer r5) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 == 0) goto L2c
            java.lang.String r2 = "publish"
        La:
            if (r5 == 0) goto L29
            int r0 = r5.intValue()
            if (r0 != 0) goto L1f
            java.lang.String r1 = "up"
        L14:
            java.lang.String r0 = "enter_method"
            r3.LJFF(r0, r2)
            java.lang.String r0 = "direction"
            r3.LJFF(r0, r1)
            return
        L1f:
            int r1 = r5.intValue()
            r0 = 1
            if (r1 != r0) goto L29
            java.lang.String r1 = "down"
            goto L14
        L29:
            java.lang.String r1 = "none"
            goto L14
        L2c:
            java.lang.String r2 = "consume"
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJ(X.09Gk, java.lang.Boolean, java.lang.Integer):void");
    }

    public static void LJIIJ(CommentContextSource commentContextSource, String str, String str2) {
        Aweme aweme;
        long playCount;
        String str3;
        String uid;
        if (commentContextSource == null || (aweme = CommentContextSourceKt.aweme(commentContextSource)) == null || !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
            return;
        }
        if (TextUtils.isEmpty(str2) && TextUtils.equals(CommentContextSourceKt.eventType(commentContextSource), "notification_page")) {
            str2 = "click_notification";
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", CommentContextSourceKt.eventType(commentContextSource));
        c2344009Gk.LJIIIIZZ("tab_name", str);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LIZLLL(aweme.getCreateTime(), "video_create_time");
        c2344009Gk.LIZLLL((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - aweme.getCreateTime(), "video_elapsed_time");
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        AwemeStatistics statistics = aweme.getStatistics();
        long diggCount = 0;
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        c2344009Gk.LIZLLL(playCount, "vv_cnt");
        AwemeStatistics statistics2 = aweme.getStatistics();
        if (statistics2 != null) {
            diggCount = statistics2.getDiggCount();
        }
        c2344009Gk.LIZLLL(diggCount, "like_count");
        NowPostInfo nowPostInfo = aweme.nowPostInfo;
        if (nowPostInfo == null || (str3 = nowPostInfo.nowMediaType) == null) {
            str3 = "post";
        }
        c2344009Gk.LJIIIIZZ("now_type", str3);
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LIZJ(AwemeExtKt.getFollowStatus(aweme), "follow_status");
        LJJJ(c2344009Gk, "enter_author_reaction_panel");
    }

    public static final void LJIILL(Aweme aweme, String str, boolean z) {
        String aid;
        User author;
        String str2;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str3 = "";
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        if (z) {
            str2 = "normal";
        } else {
            str2 = "fullscreen";
        }
        c2344009Gk.LJIIIIZZ("input_box_status", str2);
        LJJJ(c2344009Gk, "input_box_fullscreen_click");
    }

    public static final void LJIILLIIL(Aweme aweme, String str, boolean z) {
        String aid;
        User author;
        String str2;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str3 = "";
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        if (z) {
            str2 = "normal";
        } else {
            str2 = "fullscreen";
        }
        c2344009Gk.LJIIIIZZ("input_box_status", str2);
        LJJJ(c2344009Gk, "input_box_fullscreen_show");
    }

    public static final void LJJI(Boolean bool, String str, Map map) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        C1341320l0c.LIZLLL(c2344009Gk, str, map);
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str3 = (String) linkedHashMap.get("function_type");
        if (C123100dR.LIZ((String) linkedHashMap.get("function_type"))) {
            c2344009Gk.LJFF("function_type", str3);
        } else if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "unsave_sticker";
            } else {
                str2 = "save_sticker";
            }
            c2344009Gk.LJFF("function_type", str2);
        }
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_quick_menu_click");
    }

    public static final void LJJIFFI(Boolean bool, String str, Map map) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        C1341320l0c.LIZLLL(c2344009Gk, str, map);
        if (bool != null) {
            if (bool.booleanValue()) {
                str2 = "unsave_sticker";
            } else {
                str2 = "save_sticker";
            }
            c2344009Gk.LJFF("function_type", str2);
        }
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_quick_menu_show");
    }

    public static final void LJJII(String str, String str2, Map map) {
        if (map == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str2 == null) {
            str2 = "";
        }
        C1341320l0c.LIZLLL(c2344009Gk, str2, map);
        c2344009Gk.LJIIIIZZ("element_name", str);
        LJJJ(c2344009Gk, "ttinter_comment_sticker_panel_element_click");
    }

    public static final void LJJIII(String str, String str2, Map map) {
        if (map == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str2 == null) {
            str2 = "";
        }
        C1341320l0c.LIZLLL(c2344009Gk, str2, map);
        c2344009Gk.LJIIIIZZ("element_name", str);
        LJJJ(c2344009Gk, "ttinter_comment_sticker_panel_element_show");
    }

    public static final void LJJIIJ(int i, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("info: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        sbLIZ.append(' ');
        sbLIZ.append(i);
        C1344030l4z.LIZ("InvalidClickComment", C2188811AlT.LIZIZ(sbLIZ));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("reason", str);
        c2344009Gk.LIZJ(i, "has_toast");
        C20684815ws.LJIILLIIL("invalid_click_comment", c2344009Gk.LIZ);
    }

    public static final String LJJIIJZLJL(Aweme aweme, String str, boolean z) {
        AwemeStatistics statistics;
        AwemeStatistics statistics2;
        if (z) {
            C1351250lGd.LIZ.getClass();
            if (C1351250lGd.LJIIZILJ(aweme)) {
                return "quick_help_post_card_search_comment";
            }
            if (z) {
                if (C1351290lGh.LIZIZ() && Intrinsics.LJFF(str, "homepage_hot") && C294360BgI.LIZ()) {
                    C1351250lGd.LIZ.getClass();
                    EnumC1351150lGT enumC1351150lGTLJIIIZ = C1351250lGd.LJIIIZ(aweme);
                    if (enumC1351150lGTLJIIIZ == EnumC1351150lGT.ZERO_COMMENT) {
                        if (aweme != null && (statistics2 = aweme.getStatistics()) != null && statistics2.getCommentCount() == 0) {
                            return "zero_comment";
                        }
                        return "low_comment";
                    }
                    if (enumC1351150lGTLJIIIZ == EnumC1351150lGT.DOUBLE_FOLLOW) {
                        return "friends";
                    }
                    return "";
                }
                C1351250lGd.LIZ.getClass();
                if (!C1351250lGd.LJIILJJIL(aweme, str)) {
                    C1351250lGd.LIZ.getClass();
                    if (C1351250lGd.LJIIL(aweme, str)) {
                        if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() == 0) {
                            return "zero_comment";
                        }
                        return "low_comment";
                    }
                    return "";
                }
                return "friends";
            }
            return "";
        }
        return "";
    }

    public static final void LJJJLIIL(Comment comment, String str, int i) {
        String str2;
        List<String> textImageCommentPostItemList;
        if (comment != null && (textImageCommentPostItemList = comment.getTextImageCommentPostItemList()) != null && !textImageCommentPostItemList.isEmpty()) {
            str2 = "show_post_added";
        } else {
            str2 = "show_add_as_post";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LIZJ(i, "is_story");
        LJJJ(c2344009Gk, str2);
    }

    public static void LJJJZ(Comment comment, String str, String str2) {
        String uid;
        int i;
        if (comment == null) {
            return;
        }
        C161N c161n = C161N.LIZIZ;
        boolean zLJIILIIL = c161n.LJIILIIL(comment);
        boolean zLJIILLIIL = c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("comment_category", C1345700l7g.LIZ(comment));
        User user = comment.getUser();
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        c2344009Gk.LJIIIIZZ("comment_source_language", comment.getCommentLanguage());
        c2344009Gk.LJIIIIZZ("target_language", c161n.LLIIZ());
        c2344009Gk.LIZJ(c161n.LJIILIIL(comment) ? 1 : 0, "is_comment_translatable");
        c2344009Gk.LIZJ(zLJIILLIIL ? 1 : 0, "is_comment_translated");
        int i2 = 1;
        if (zLJIILIIL && C0BJB.LIZ()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_translation_icon_shown");
        c2344009Gk.LJIIIIZZ("click_actions", str2);
        if (!C161T.LIZ().LJ(comment.getAwemeId()) || !zLJIILLIIL) {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_auto_translated");
        c2344009Gk.LJIIIIZZ("llm_variant", c161n.LJJLIIIJ().LIZJ(comment));
        C11NZ.LJJJJI(new ACallableS426S0100000_21(c2344009Gk, 13)).LJL(C11S5.LIZ()).LJJLJ();
    }

    public static final void LJJLIIJ(Comment comment, Aweme aweme, String str) {
        Integer numValueOf;
        String aid;
        String uid;
        String str2;
        List<String> textImageCommentPostItemList;
        User author;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String semanticLabel = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        if (comment != null) {
            semanticLabel = comment.getSemanticLabel();
        }
        c2344009Gk.LJIIIIZZ("comment_type", semanticLabel);
        if (comment != null && (textImageCommentPostItemList = comment.getTextImageCommentPostItemList()) != null && !textImageCommentPostItemList.isEmpty()) {
            str2 = "added_to_post";
        } else {
            str2 = "add_to_post";
        }
        c2344009Gk.LJIIIIZZ("entrance_desc_type", str2);
        LJJJ(c2344009Gk, "show_comment_add_as_post");
    }

    public static void LJLLLL(long j, String str, boolean z) {
        if (LJJIJIL(1, "comment_photo_perceptible_load_time")) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJFF(Scene.SCENE_SERVICE, str);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
        LJJJ(c2344009Gk, "comment_photo_perceptible_load_time");
    }

    public static void LLII(Aweme aweme, String str, String str2) {
        String groupId;
        int awemeType;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        String str3 = "";
        if (aweme == null || (groupId = aweme.getGroupId()) == null) {
            groupId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        if (aweme != null) {
            awemeType = aweme.getAwemeType();
        } else {
            awemeType = -1;
        }
        c2344009Gk.LIZJ(awemeType, "aweme_type");
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C20684815ws.LJIILLIIL("title_panel_close", c2344009Gk.LIZ);
    }

    public static void LLIIIZ(Comment comment, Aweme aweme, String str) {
        List<TextExtraStruct> textExtra;
        String aid;
        if (comment != null && (textExtra = comment.getTextExtra()) != null && !textExtra.isEmpty()) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                if (textExtraStruct.getType() == 8) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    String str2 = "";
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    c2344009Gk.LJIIIIZZ("track_id", C03RE.LIZ("", aid, String.valueOf(textExtraStruct.getProductId())));
                    c2344009Gk.LJIIIIZZ("entrance_from", "video_comment_tagging_anchor");
                    if (str != null) {
                        str2 = str;
                    }
                    c2344009Gk.LJIIIIZZ("enter_from", str2);
                    c2344009Gk.LJIIIIZZ("source_page_type", "video");
                    c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
                    LJJJ(c2344009Gk, "tiktok_video_anchor_view");
                }
            }
        }
    }

    public static final void LLIILII(String str, String str2, Aweme aweme) {
        int i;
        String str3;
        String aid;
        String authorUid;
        ZeroCommentConfig zeroCommentConfig;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (aweme != null && C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_video_author");
        if (C729510SjV.LJJIJIL(aweme)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJFF("story_type", str3);
        User author = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJFF("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJFF("author_id", authorUid);
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("enter_method", str2);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        if (aweme != null) {
            author = aweme.getAuthor();
        }
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        c2344009Gk.LJFF("click_area", "");
        if (aweme != null) {
            AwemeCommentConfig commentConfig = aweme.getCommentConfig();
            if (commentConfig != null && (zeroCommentConfig = commentConfig.zeroCommentConfig) != null) {
                c2344009Gk.LJ(zeroCommentConfig.iconType, "show_sticker_type");
                c2344009Gk.LJFF("guide_text", zeroCommentConfig.titleText);
                c2344009Gk.LJFF("writing_entrance_text", zeroCommentConfig.buttonText);
            }
            LJJJ(c2344009Gk, "zero_comment_panel_click");
        }
    }

    public static final void LJII(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("target", str2);
        c2344009Gk.LJIIIIZZ("author_id", str3);
        c2344009Gk.LJIIIIZZ("group_id", str4);
        LJJJ(c2344009Gk, "click_pin_comment_popup");
    }

    public static final void LJIJI(String str, String str2, List list, Set set) {
        synchronized (set) {
            if (list == null) {
                return;
            }
            try {
                int size = list.size();
                int size2 = set.size();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((User) it2.next()).getUid());
                }
                set.addAll(arrayList);
                int size3 = size - (set.size() - size2);
                if (size3 > 0) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("video_type", str);
                    c2344009Gk.LJIIIIZZ("list_user_type", str2);
                    c2344009Gk.LIZJ(size3, "duplicate_cnt");
                    LJJJ(c2344009Gk, "video_list_user_duplicate");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIJJLI(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("author_id", str3);
        c2344009Gk.LJIIIIZZ("sub_position", str4);
        c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
        LJJJ(c2344009Gk, "click_comment_tray_gift_icon");
    }

    public static void LJJIJIIJI(int i, Aweme aweme, String str, String str2) {
        String uid;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "screen_split");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LIZJ(AwemeExtKt.getFollowStatus(aweme), "follow_status");
        LJJJ(c2344009Gk, "switch_screen_split");
    }

    public static void LJJIJLIJ(String str, String str2, String str3, Aweme aweme) {
        String uid;
        if (aweme == null) {
            return;
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("message_type", "comment_poll");
        c2344009Gk.LJIIIIZZ("function_type", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        User author2 = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_quick_menu_click");
    }

    public static void LJJJJJL(String str, String str2, String str3, Aweme aweme) {
        String uid;
        int i;
        if (aweme == null) {
            return;
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_element", str);
        c2344009Gk.LJIIIIZZ("event_page", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        User author2 = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && statistics.getCommentCount() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_zero_comment");
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_entrance_guide_show");
    }

    public static final void LJJLIIIJLLLLLLLZ(String str, String str2, String str3, String str4) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("comment_id", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", str4);
        LJJJ(c2344009Gk, "close_comment_post_pop_up");
    }

    public static final void LJJLL(String str, CommentContextSource commentContextSource, EnumC1342450l2R enumC1342450l2R, EnumC1342450l2R enumC1342450l2R2) {
        Aweme aweme;
        String aid;
        String str2;
        LIZ.getClass();
        if (LJJIJIL(1, str) || commentContextSource == null || (aweme = commentContextSource.getCommonModel().aweme) == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        Aweme aweme2 = commentContextSource.getCommonModel().aweme;
        String authorUid = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        C1341320l0c.LIZ(c2344009Gk, "group_id", aid);
        Aweme aweme3 = commentContextSource.getCommonModel().aweme;
        if (aweme3 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme3);
        }
        C1341320l0c.LIZ(c2344009Gk, "author_id", authorUid);
        c2344009Gk.LIZJ(AwemeExtKt.getFollowStatus(aweme), "follow_status");
        c2344009Gk.LJFF("enter_from", commentContextSource.getCommonModel().enterFrom);
        c2344009Gk.LJFF("enter_method", commentContextSource.getCommonModel().enterMethod);
        if (C729510SjV.LJJ(aweme)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        c2344009Gk.LJFF("story_type", str2);
        c2344009Gk.LJ(Boolean.valueOf(aweme.isAd()), "is_ad");
        c2344009Gk.LIZJ(aweme.getAwemeType(), "aweme_type");
        if (Intrinsics.LJFF(str, "comment_section_sort_change")) {
            c2344009Gk.LJFF("prev_channel", C1342490l2V.LIZ(enumC1342450l2R));
            c2344009Gk.LJFF("channel", C1342490l2V.LIZ(enumC1342450l2R2));
        } else {
            c2344009Gk.LJFF("channel", C1342490l2V.LIZ(commentContextSource.getCurrSortType()));
        }
        if (Intrinsics.LJFF(str, "comment_sort_change_button_click")) {
            c2344009Gk.LJFF("avail_channel", C13LP.LJJLIIIJ(C13LP.LJJJJLI(commentContextSource.getEventModel().availChannelList), ",", null, null, 0, null, null, 62));
        }
        LJJJ(c2344009Gk, str);
    }

    public static void LJLI(EnumC1342350l2H enumC1342350l2H, Long l, Aweme aweme, String str) {
        String aid;
        String authorUid;
        Long lValueOf;
        Integer numValueOf;
        String str2;
        User author;
        AwemeStatistics statistics;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String string = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        c2344009Gk.LJ(lValueOf, "visible_comment_cnt");
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            numValueOf = Integer.valueOf(author.getFollowStatus());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "follow_status");
        c2344009Gk.LJ(l, "event_id");
        if (l != null) {
            string = l.toString();
        }
        c2344009Gk.LJIIIIZZ("comment_event_id", string);
        int i = C1342340l2G.LIZ[enumC1342350l2H.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str2 = "show_top_bar_event";
            } else {
                throw new C1954807lC();
            }
        } else {
            str2 = "click_top_bar_event";
        }
        LJJJ(c2344009Gk, str2);
    }

    public static void LJLIL(CommentTopBarComponent commentTopBarComponent, String str, Aweme aweme, Map map) {
        String str2;
        String aid;
        String authorUid;
        Integer numValueOf;
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        String requestId = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(numValueOf));
        c2344009Gk.LJIIIIZZ("name", commentTopBarComponent.name);
        c2344009Gk.LJIIIIZZ("biz_id", commentTopBarComponent.bizId);
        c2344009Gk.LJ(commentTopBarComponent.bizType, "biz_type");
        c2344009Gk.LJ(commentTopBarComponent.templateType, "template_type");
        if (map != null && (!((HashMap) map).isEmpty())) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String str3 = commentTopBarComponent.tracerInfo;
        if (C123100dR.LIZ(str3) && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt == null || (string = objOpt.toString()) == null) {
                        string = "";
                    }
                    c2344009Gk.LJFF(next, string);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (C735370Ssx.LJJIJL(str)) {
            C611410NyV c611410NyV = C584850Mwl.LIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            }
            c2344009Gk.LJFF("log_pb", c611410NyV.LIZIZ(requestId));
        }
        LJJJ(c2344009Gk, "comment_topbar_component_click");
    }

    public static void LJLJI(CommentTopBarComponent commentTopBarComponent, String str, Aweme aweme, Map map) {
        String str2;
        String aid;
        String authorUid;
        Integer numValueOf;
        String string;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        String requestId = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(numValueOf));
        c2344009Gk.LJIIIIZZ("name", commentTopBarComponent.name);
        c2344009Gk.LJIIIIZZ("biz_id", commentTopBarComponent.bizId);
        c2344009Gk.LJ(commentTopBarComponent.bizType, "biz_type");
        c2344009Gk.LJ(commentTopBarComponent.templateType, "template_type");
        if (map != null && (!map.isEmpty())) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        String str3 = commentTopBarComponent.tracerInfo;
        if (C123100dR.LIZ(str3) && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt == null || (string = objOpt.toString()) == null) {
                        string = "";
                    }
                    c2344009Gk.LJFF(next, string);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (C735370Ssx.LJJIJL(str)) {
            C611410NyV c611410NyV = C584850Mwl.LIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            }
            c2344009Gk.LJFF("log_pb", c611410NyV.LIZIZ(requestId));
        }
        LJJJ(c2344009Gk, "comment_topbar_component_show");
    }

    public static void LJLJJLL(String str, String str2, String str3, String str4) {
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("return_method", str);
        c2241008qG.LIZ.put("group_id", str3);
        c2241008qG.LIZ.put("enter_from", str2);
        c2241008qG.LIZ.put("author_id", str4);
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        C20684815ws.LJIIJ(0L, "emoji_to_keyboard", str2, str3, c2241008qG.LJ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("return_method", str);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        LJJJ(c2344009Gk, "emoji_to_keyboard");
    }

    public static void LJLL(CommentContextSource commentContextSource, Comment comment, Boolean bool, CommentContentTypeMobParams commentContentTypeMobParams) {
        String authorUid;
        String aid;
        String aid2;
        int i;
        String string;
        String strLIZ;
        String accurateRecType;
        AwemeStatistics statistics;
        User user;
        AwemeStatistics statistics2;
        AwemeCommentConfig commentConfig;
        ZeroCommentConfig zeroCommentConfig;
        String region;
        User author;
        if (commentContextSource == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str = commentContextSource.getCommonModel().enterFrom;
        Aweme aweme = CommentContextSourceKt.aweme(commentContextSource);
        c2344009Gk.LJFF("enter_from", str);
        String authorUid2 = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        C1341320l0c.LIZ(c2344009Gk, "author_id", authorUid);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C1341320l0c.LIZ(c2344009Gk, "group_id", aid);
        c2344009Gk.LJFF("comment_category", C1345700l7g.LIZIZ(comment));
        C1341320l0c.LIZ(c2344009Gk, "enter_method", commentContextSource.getKeyboardModel().getClickFrom());
        Integer num = commentContextSource.getEventModel().splitPercent;
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "screen_split");
        }
        if (Intrinsics.LJFF("homepage_country", str)) {
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                region = author.getRegion();
            } else {
                region = null;
            }
            C1341320l0c.LIZ(c2344009Gk, "country_name", region);
        }
        c2344009Gk.LIZJ(commentContextSource.getKeyboardModel().isFromGuideReplyUser() ? 1 : 0, "is_guide_user_reply_cmt");
        if (commentContextSource.getKeyboardModel().isFromGuideReplyUser()) {
            c2344009Gk.LJFF("enter_method", "guide_user_reply_comment");
        }
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, Boolean.TRUE) ? 1 : 0, "show_exposed_emoji");
        String str2 = "";
        int i2 = 0;
        if (Intrinsics.LJFF(str, "search_result") || Intrinsics.LJFF(str, "general_search")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C1ER1.LIZIZ.fetchSearchParams(str, null));
            CharSequence charSequence = (CharSequence) linkedHashMap.get("search_result_id");
            if (charSequence == null || charSequence.length() == 0) {
                if (aweme == null || (aid2 = aweme.getAid()) == null) {
                    aid2 = "";
                }
                linkedHashMap.put("search_result_id", aid2);
            }
            c2344009Gk.LJII(linkedHashMap);
        }
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        if (aweme != null && (commentConfig = aweme.getCommentConfig()) != null && (zeroCommentConfig = commentConfig.zeroCommentConfig) != null && Intrinsics.LJFF(commentContextSource.getKeyboardModel().getClickFrom(), "click_zero_comment_entrance")) {
            c2344009Gk.LJ(zeroCommentConfig.iconType, "show_sticker_type");
            c2344009Gk.LJFF("guide_text", zeroCommentConfig.titleText);
            c2344009Gk.LJFF("writing_entrance_text", zeroCommentConfig.buttonText);
        }
        Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
        long commentCount = 0;
        if (aweme2 != null && (statistics2 = aweme2.getStatistics()) != null && statistics2.getCommentCount() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_zero_comment");
        C1341320l0c.LIZ(c2344009Gk, "from_location", commentContextSource.getKeyboardModel().getFromLocation());
        String str3 = commentContextSource.getEventModel().fromPage;
        if (str3.length() == 0) {
            String str4 = commentContextSource.getCommonModel().fromPage;
            if (str4 != null) {
                str2 = str4;
            }
            str3 = str2;
        }
        C1341320l0c.LIZ(c2344009Gk, "from_page", str3);
        if (aweme != null) {
            string = Integer.valueOf(aweme.getAwemeType()).toString();
        } else {
            string = null;
        }
        C1341320l0c.LIZ(c2344009Gk, "aweme_type", string);
        if (aweme != null) {
            strLIZ = C1381730m3n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        C1341320l0c.LIZ(c2344009Gk, "photo_content_type", strLIZ);
        if (comment != null && (user = comment.getUser()) != null) {
            accurateRecType = user.getAccurateRecType();
        } else {
            accurateRecType = null;
        }
        C1341320l0c.LIZ(c2344009Gk, "rec_type", accurateRecType);
        if (aweme != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
        c2344009Gk.LJFF(Scene.SCENE_SERVICE, LJJIIJZLJL(aweme, str, Intrinsics.LJFF("click_quick_panel", commentContextSource.getKeyboardModel().getClickFrom())));
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            commentCount = statistics.getCommentCount();
        }
        c2344009Gk.LJFF("visible_comment_cnt", String.valueOf(commentCount));
        C1341320l0c.LIZ(c2344009Gk, "session_id", CommentContextSourceKt.getSessionId(commentContextSource));
        C1341320l0c.LIZ(c2344009Gk, "quick_comment_action_type", commentContextSource.getKeyboardModel().getQuickCommentActionType());
        CommentCommonModel commonModel = commentContextSource.getCommonModel();
        if (commonModel != null && commonModel.isInPhotoCommentDetailPage()) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        c2344009Gk.LIZJ(commentContextSource.getCommonModel().choosePhotoFromInnerPage ? 1 : 0, "is_photo_added_from_internal");
        if (commentContentTypeMobParams != null) {
            c2344009Gk.LIZJ(commentContentTypeMobParams.isText ? 1 : 0, "is_text");
            c2344009Gk.LIZJ(commentContentTypeMobParams.isMention ? 1 : 0, "is_mention");
            c2344009Gk.LIZJ(commentContentTypeMobParams.isEmoji ? 1 : 0, "is_emoji");
            c2344009Gk.LIZJ(commentContentTypeMobParams.isPhoto ? 1 : 0, "is_photo");
            c2344009Gk.LIZJ(commentContentTypeMobParams.isSticker ? 1 : 0, "is_sticker");
            c2344009Gk.LIZJ(commentContentTypeMobParams.isAudio ? 1 : 0, "is_audio");
        }
        if (aweme != null && AwemeExtKt.isOfflineVideo(aweme)) {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "is_offline_video");
        LJJJ(c2344009Gk, "enter_text");
    }

    public static void LJLLILLLL(List list, Aweme aweme, String str, Map map) {
        String aid;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ(list, "to_user_id");
        String str2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C1380890m2R.LJFF(c2344009Gk, aweme);
        if (map != null) {
            str2 = (String) map.get("is_include_quick_mention");
        }
        C1341320l0c.LIZIZ(c2344009Gk, "is_include_quick_mention", str2);
        c2344009Gk.LJ(Boolean.valueOf(C1EE1.LIZIZ.LJJIII()), "if_default");
        LJJJ(c2344009Gk, "send_comment_at");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLFZ(java.lang.String r12, com.ss.android.ugc.aweme.feed.model.Aweme r13, boolean r14, X.C1347730lAx r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LLFZ(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, X.0lAx):void");
    }

    public static final void LLIILZL(Aweme aweme, String str, String str2, EnumC1350940lG8 enumC1350940lG8) {
        int i;
        String str3;
        AwemeCommentConfig commentConfig;
        ZeroCommentConfig zeroCommentConfig;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_video_author");
        if (C729510SjV.LJJIJIL(aweme)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJFF("story_type", str3);
        c2344009Gk.LJFF("group_id", aweme.getAid());
        c2344009Gk.LJFF("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJFF("enter_from", str);
        c2344009Gk.LJFF("enter_method", str2);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        if (enumC1350940lG8 == EnumC1350940lG8.COMMENT_EMPTY && (commentConfig = aweme.getCommentConfig()) != null && (zeroCommentConfig = commentConfig.zeroCommentConfig) != null) {
            c2344009Gk.LJ(zeroCommentConfig.iconType, "show_sticker_type");
            c2344009Gk.LJFF("guide_text", zeroCommentConfig.titleText);
            c2344009Gk.LJFF("writing_entrance_text", zeroCommentConfig.buttonText);
        }
        c2344009Gk.LJFF("show_reason", enumC1350940lG8.getValue());
        LJJJ(c2344009Gk, "zero_comment_panel_show");
    }

    public static void LJIIIIZZ(CommentContextSource commentContextSource, String str, long j, String str2, String str3) {
        Aweme aweme;
        String str4;
        String str5;
        long playCount;
        String uid;
        String str6;
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            if (!Intrinsics.LJFF(str3, "slide") && !Intrinsics.LJFF(str3, "click_label")) {
                str4 = "close";
            } else {
                str4 = "change_tab";
            }
            if (!C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme))) {
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            c2344009Gk.LJIIIIZZ("enter_from", CommentContextSourceKt.eventType(commentContextSource));
            c2344009Gk.LJIIIIZZ("tab_name", str);
            c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
            c2344009Gk.LIZLLL(j, "duration");
            c2344009Gk.LJIIIIZZ("exit_method", str4);
            String str7 = "post";
            if (!C729510SjV.LJJ(aweme)) {
                str5 = "post";
            } else {
                str5 = "story";
            }
            c2344009Gk.LJIIIIZZ("story_type", str5);
            c2344009Gk.LJIIIIZZ("story_collection_id", C729510SjV.LJII(aweme));
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                playCount = statistics.getPlayCount();
            } else {
                playCount = 0;
            }
            c2344009Gk.LIZLLL(playCount, "vv_cnt");
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null && (str6 = nowPostInfo.nowMediaType) != null) {
                str7 = str6;
            }
            c2344009Gk.LJIIIIZZ("now_type", str7);
            User author = aweme.getAuthor();
            if (author != null) {
                uid = author.getUid();
            } else {
                uid = null;
            }
            c2344009Gk.LJIIIIZZ("author_id", uid);
            c2344009Gk.LIZJ(AwemeExtKt.getFollowStatus(aweme), "follow_status");
            LJJJ(c2344009Gk, "close_author_reaction_panel");
        }
    }

    public static final void LJJ(String str, Comment comment, EnumC1260930iux enumC1260930iux, String str2, Aweme aweme) {
        User user;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJIJLIJ(str);
        c1260910iuv.LJJIL(str2);
        c1260910iuv.LJJJJIZL("comment_panel");
        if (comment != null) {
            user = comment.getUser();
        } else {
            user = null;
        }
        c1260910iuv.LJJJJZI(user);
        Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c1260910iuv);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, objLJIIIZ);
        ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
    }

    public static void LJJJIL(Aweme aweme, String str, String str2, String str3, String str4) {
        String uid;
        String str5;
        int i;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_element", "audio");
        c2344009Gk.LJIIIIZZ("event_page", str);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author2 = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
        if (C729510SjV.LJJ(aweme)) {
            str5 = "story";
        } else {
            str5 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str5);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && statistics.getCommentCount() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_zero_comment");
        c2344009Gk.LJIIIIZZ("action_type", str3);
        c2344009Gk.LJIIIIZZ("later_element", str4);
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_content_delete");
    }

    public static final void LJJJJL(boolean z, Comment comment, String str, String str2, String str3) {
        String str4;
        if (z) {
            str4 = "pin_comment";
        } else {
            str4 = "unpin_comment";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LJIIIIZZ("to_user_id", comment.getUser().getUid());
        c2344009Gk.LJIIIIZZ("group_id", str3);
        LJJJ(c2344009Gk, str4);
    }

    public static final void LJJJJZ(String str, int i, Comment comment, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "tap_comment");
        c2344009Gk.LJIIIIZZ("position", "comment_panel");
        LLIIZ("see_original_comment_show", comment, str, str2, i, c2344009Gk.LIZ, z);
    }

    public static final void LJJJLZIJ(String str, String str2, Integer num, boolean z, C1347730lAx c1347730lAx) {
        int iIntValue;
        String str3;
        String str4;
        String str5;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("type", str2);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "is_photo_contained");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_internal_image_comment");
        if (c1347730lAx != null) {
            str3 = c1347730lAx.LJIIJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", str3);
        String str6 = "static";
        if (c1347730lAx == null || (str4 = c1347730lAx.LJIILIIL) == null) {
            str4 = "static";
        }
        c2344009Gk.LJIIIIZZ("sub_photo_type", str4);
        if (c1347730lAx != null && (str5 = c1347730lAx.LJIILJJIL) != null) {
            str6 = str5;
        }
        c2344009Gk.LJIIIIZZ("ori_sub_photo_type", str6);
        C1347720lAw.LJI(c2344009Gk, c1347730lAx);
        LJJJ(c2344009Gk, "add_photo_comment");
    }

    public static void LJJLI(String str, String str2, String str3, String str4, boolean z) {
        int iLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", str4);
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(str2) ? 1 : 0, "is_video_author");
        C161N c161n = C161N.LIZIZ;
        c2344009Gk.LJIIIIZZ("target_lang", c161n.LLIIZ());
        c2344009Gk.LIZJ(z ? 1 : 0, "comment_translation_status");
        if (str != null) {
            iLIZLLL = c161n.LJJLIIIJ().LIZLLL(str);
        } else {
            iLIZLLL = 0;
        }
        c2344009Gk.LIZJ(iLIZLLL, "translated_num");
        LJJJ(c2344009Gk, "comment_batch_translation_click");
    }

    public static void LJJLIIIIJ(String str, String str2, String str3, String str4, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", str4);
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(str2) ? 1 : 0, "is_video_author");
        c2344009Gk.LJIIIIZZ("target_lang", C161N.LIZIZ.LLIIZ());
        c2344009Gk.LIZJ(z ? 1 : 0, "comment_translation_status");
        LJJJ(c2344009Gk, "comment_batch_translation_show");
    }

    public static void LJLIIIL(Aweme aweme, String str, String str2, String str3, Map map) {
        String str4;
        String str5;
        String aid;
        Integer numValueOf;
        int i;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str6 = "";
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        if (str3 == null) {
            str5 = "";
        } else {
            str5 = str3;
        }
        c2344009Gk.LJIIIIZZ("event_page", str5);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str6 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str6);
        String requestId = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(numValueOf));
        c2344009Gk.LJIIIIZZ("component_client_show", str2);
        if (C735370Ssx.LJJIJL(str3)) {
            C611410NyV c611410NyV = C584850Mwl.LIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            }
            c2344009Gk.LJFF("log_pb", c611410NyV.LIZIZ(requestId));
        }
        if (aweme != null && !Intrinsics.LJFF(str3, "selfharm") && C1ER1.LIZIZ.LLLLLLLLLL(aweme)) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_search_keywords_server_show");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        LJJJ(c2344009Gk, str);
    }

    public static final void LJLJJI(String str, String str2, Integer num, boolean z, C1347730lAx c1347730lAx) {
        int iIntValue;
        String str3;
        String str4;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("type", str2);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "is_photo_contained");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_internal_image_comment");
        String str5 = "static";
        if (c1347730lAx == null || (str3 = c1347730lAx.LJIILIIL) == null) {
            str3 = "static";
        }
        c2344009Gk.LJIIIIZZ("sub_photo_type", str3);
        if (c1347730lAx != null && (str4 = c1347730lAx.LJIILJJIL) != null) {
            str5 = str4;
        }
        c2344009Gk.LJIIIIZZ("ori_sub_photo_type", str5);
        C1347720lAw.LJI(c2344009Gk, c1347730lAx);
        LJJJ(c2344009Gk, "delete_photo_comment");
    }

    public static void LJLJJL(CommentContextSource commentContextSource, String str, int i, boolean z, int i2) {
        String strEventType;
        String aid;
        Aweme aweme;
        Aweme aweme2;
        if (i != 2 && i != 4) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        String authorUid = null;
        if (commentContextSource != null) {
            strEventType = CommentContextSourceKt.eventType(commentContextSource);
        } else {
            strEventType = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", strEventType);
        if (commentContextSource != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LIZJ(i2 + 1, "click_emoji_location");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_exposed_emoji");
        c2344009Gk.LJIIIIZZ("emoji_code", str);
        LJJJ(c2344009Gk, "click_fast_emoji");
    }

    public static final void LLILII(String str, int i, Comment comment, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "tap_comment");
        c2344009Gk.LJIIIIZZ("position", "comment_panel");
        LLIIZ("translate_comment_show", comment, str, str2, i, c2344009Gk.LIZ, z);
    }

    public static final void LLILIL(Comment comment, String str, int i, Aweme aweme, boolean z) {
        String uid;
        String authorUid;
        String authorUid2;
        String translateVariant;
        String authorUid3;
        int i2;
        String str2;
        String asrLang;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("position", "comment_panel");
        c2344009Gk.LJIIIIZZ("enter_method", "tap_comment");
        User user = comment.getUser();
        String authorUid4 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid2 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
        c2344009Gk.LJFF("action_type", "click_button");
        C161N c161n = C161N.LIZIZ;
        boolean zLJIILLIIL = c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN);
        if (C0BJA.LIZIZ()) {
            translateVariant = c161n.LJJLIIIJ().LIZJ(comment);
        } else {
            C1343720l4U c1343720l4U = C1343720l4U.LIZ;
            String cid = comment.getCid();
            c1343720l4U.getClass();
            Comment commentLIZJ = C1343720l4U.LIZJ(cid);
            if (commentLIZJ != null) {
                translateVariant = commentLIZJ.getTranslateVariant();
            } else {
                translateVariant = null;
            }
        }
        c2344009Gk.LJFF("comment_category", C1345700l7g.LIZ(comment));
        c2344009Gk.LJFF("comment_source_lang", comment.getCommentLanguage());
        c2344009Gk.LJFF("target_lang", c161n.LLIIZ());
        if (aweme != null) {
            authorUid3 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid3 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid3) ? 1 : 0, "is_video_author");
        int i3 = 1;
        if (C161T.LIZ().LJ(comment.getAwemeId()) && zLJIILLIIL) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_auto_translated");
        c2344009Gk.LJFF("llm_variant", translateVariant);
        if (comment.getTransBtnStyle() != 2) {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, "is_translation_icon_clicked");
        String strLIZ = C1350750lFp.LIZ(comment);
        if (C123100dR.LIZ(strLIZ)) {
            str2 = strLIZ;
        } else {
            str2 = "text_comment";
        }
        c2344009Gk.LJFF("message_type", str2);
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct == null || (asrLang = audioStruct.getAsrLang()) == null) {
            asrLang = "";
        }
        c2344009Gk.LJFF("subtitle_source_lang", asrLang);
        if (Intrinsics.LJFF(strLIZ, "audio")) {
            c2344009Gk.LJFF("comment_source_lang", "");
        }
        if (aweme != null) {
            authorUid4 = AwemeExtKt.getAuthorUid(aweme);
        }
        LLIIZ("see_original_comment", comment, str, authorUid4, i, c2344009Gk.LIZ, z);
    }

    public static final void LJJIJ(String str, String str2, String str3, String str4, String str5, Map map) {
        if (map == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        C1341320l0c.LIZLLL(c2344009Gk, str, map);
        c2344009Gk.LJIIIIZZ("function_type", str2);
        c2344009Gk.LJIIIIZZ("source_photo_type", (String) map.get("photo_type"));
        c2344009Gk.LJIIIIZZ("operation_result", str3);
        c2344009Gk.LJIIIIZZ("fail_reason", str4);
        c2344009Gk.LJIIIIZZ("operation_source", str5);
        LJJJ(c2344009Gk, "ttinter_sticker_operation_result_toast_show");
    }

    public static void LJJJJLL(Aweme aweme, String str, String str2, long j, long j2, long j3) {
        String uid;
        String str3;
        int i;
        String str4;
        if (aweme == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_page", str);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author2 = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
        if (C729510SjV.LJJ(aweme)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str3);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && statistics.getCommentCount() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_zero_comment");
        if (j == 0) {
            str4 = "success";
        } else {
            str4 = "fail";
        }
        c2344009Gk.LJIIIIZZ("upload_result", str4);
        c2344009Gk.LIZLLL(j, "upload_error_code");
        c2344009Gk.LIZLLL(j2, "upload_inner_error_code");
        c2344009Gk.LIZLLL(j3, "duration");
        LJJJ(c2344009Gk, "comment_audio_upload_result_android");
    }

    public static final void LJJLIIIJJI(String str, Aweme aweme, boolean z, boolean z2, boolean z3, C1347730lAx c1347730lAx) {
        String aid;
        User author;
        String str2;
        Comment comment;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("position", "comment");
        String str3 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str3 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str3);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        if (z) {
            str2 = "normal";
        } else {
            str2 = "fullscreen";
        }
        c2344009Gk.LJIIIIZZ("input_box_status", str2);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "has_input");
        c2344009Gk.LIZJ(z3 ? 1 : 0, "is_internal_image_comment");
        C1347720lAw.LIZLLL(c2344009Gk, c1347730lAx);
        C1347720lAw.LIZJ(c2344009Gk, c1347730lAx);
        if (c1347730lAx != null && (comment = c1347730lAx.LJIIIZ) != null) {
            c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(comment.getUser()), "follow_status_to_user");
        }
        LJJJ(c2344009Gk, "click_add_photo_comment");
    }

    public static final void LJJZ(EnumC1342350l2H enumC1342350l2H, String str, String str2, Aweme aweme, Comment comment, int i) {
        String aid;
        String authorUid;
        User author;
        String authorUid2;
        String uid;
        String cid;
        String uid2;
        User user;
        String str3;
        CommentStickerStruct stickerStruct;
        User user2;
        User user3;
        String strLJIIZILJ = C1345700l7g.LJIIZILJ(comment);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Integer stickerType = null;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C1351870lHd c1351870lHd = CommentSharePackage.Companion;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c1351870lHd.getClass();
        c2344009Gk.LIZJ(C1351870lHd.LIZIZ(author), "follow_status");
        if (aweme != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid2 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
        if (comment != null && (user3 = comment.getUser()) != null) {
            uid = user3.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(uid) ? 1 : 0, "is_comment_author");
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        if (comment != null && (user2 = comment.getUser()) != null) {
            uid2 = user2.getUid();
        } else {
            uid2 = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_id", uid2);
        c2344009Gk.LJIIIIZZ("comment_category", C1345700l7g.LIZ(comment));
        c2344009Gk.LJIIIIZZ("message_type", strLJIIZILJ);
        if (comment != null) {
            user = comment.getUser();
        } else {
            user = null;
        }
        c2344009Gk.LIZJ(C1351870lHd.LIZIZ(user), "follow_status_to_user");
        c2344009Gk.LJIIIIZZ("function_type", str);
        LIZ.getClass();
        c2344009Gk.LJIIIIZZ("photo_type", LJIILIIL(comment));
        c2344009Gk.LIZJ(i, "is_internal_image_comment");
        if (comment != null && (stickerStruct = comment.getStickerStruct()) != null) {
            stickerType = stickerStruct.getStickerType();
        }
        String strLJIIIIZZ = C454000HrC.LJIIIIZZ(stickerType);
        if (C123100dR.LIZ(strLJIIIIZZ)) {
            c2344009Gk.LJFF("sticker_type", strLJIIIIZZ);
        }
        if (enumC1342350l2H == EnumC1342350l2H.SHOW) {
            str3 = "comment_long_press_panel_show";
        } else {
            str3 = "comment_long_press_panel_click";
        }
        LJJJ(c2344009Gk, str3);
    }

    public static final void LJL(Aweme aweme, Comment comment, String str, String str2, String str3, String str4) {
        String uid;
        String cid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_page", str);
        c2344009Gk.LJIIIIZZ("referpage_name", str2);
        c2344009Gk.LJIIIIZZ("cmt_to_post_preview_position", str3);
        c2344009Gk.LJ(Integer.valueOf(aweme.getAwemeType()), "aweme_type");
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        String semanticLabel = null;
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        c2344009Gk.LJIIIIZZ("shoot_way", "comment_to_post");
        if (comment != null) {
            semanticLabel = comment.getSemanticLabel();
        }
        c2344009Gk.LJIIIIZZ("comment_type", semanticLabel);
        if (str4.length() != 0) {
            c2344009Gk.LJFF("cmt_to_post_initial_content_source", str4);
        }
        LJJJ(c2344009Gk, "ttinter_comment_to_post_preview_card_show");
    }

    public static void LJLILLLLZI(boolean z, Integer num, String str, CommentTopBarComponent commentTopBarComponent, String str2, Aweme aweme) {
        String str3;
        String aid;
        Integer numValueOf;
        Boolean boolValueOf;
        String requestId;
        Integer num2;
        String authorUid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String str4 = "";
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str4 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str4);
        String requestId2 = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(numValueOf));
        c2344009Gk.LIZJ(z ? 1 : 0, "is_hit_refactor");
        if (aweme != null) {
            boolValueOf = Boolean.valueOf(aweme.isAd());
        } else {
            boolValueOf = null;
        }
        c2344009Gk.LJ(boolValueOf, "is_ad");
        if (commentTopBarComponent != null) {
            c2344009Gk.LJFF("name", commentTopBarComponent.name);
            c2344009Gk.LJFF("biz_id", commentTopBarComponent.bizId);
            c2344009Gk.LJ(commentTopBarComponent.bizType, "biz_type");
            c2344009Gk.LJ(commentTopBarComponent.templateType, "template_type");
        }
        if (C123100dR.LIZ(str)) {
            c2344009Gk.LJFF("old_component_name", str);
            if (commentTopBarComponent == null) {
                C1350470lFN.LIZ.getClass();
                List listLJ = C1350470lFN.LJ(str);
                if (listLJ != null && (num2 = (Integer) C13LP.LJJJLL(listLJ)) != null) {
                    c2344009Gk.LIZJ(num2.intValue(), "biz_type");
                }
            }
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "not_hit_reason");
        }
        if (C735370Ssx.LJJIJL(str2)) {
            C611410NyV c611410NyV = C584850Mwl.LIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJFF("log_pb", c611410NyV.LIZIZ(requestId));
            if (!z) {
                if (aweme != null) {
                    requestId2 = aweme.getRequestId();
                }
                c2344009Gk.LJFF("comment_impr_id", c611410NyV.LIZLLL(requestId2));
            }
        }
        LJJJ(c2344009Gk, "comment_topbar_refactor_hit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJLJLJ(User user, CommentContextSource commentContextSource, boolean z, String str, String str2, Integer num) {
        Aweme aweme;
        Activity activityLIZIZ;
        int iIntValue;
        Activity activityLIZIZ2;
        Activity activityLIZIZ3;
        Activity activityLIZIZ4;
        Activity activityLIZIZ5;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ6;
        if (user != null && commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            C2241008qG c2241008qG = new C2241008qG();
            c2241008qG.LIZ.put("group_id", aweme.getAid());
            c2241008qG.LIZ.put("request_id", commentContextSource.getEventModel().requestId);
            c2241008qG.LIZ.put("enter_from", CommentContextSourceKt.enterFrom(commentContextSource));
            c2241008qG.LIZ.put("enter_method", str);
            c2241008qG.LIZ.put("enter_type", "normal_way");
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setEventName("enter_detail");
            mobClickObtain.setLabelName("personal_homepage");
            mobClickObtain.setValue(user.getUid());
            mobClickObtain.setJsonObject(c2241008qG.LJ());
            C20684815ws.onEvent(mobClickObtain);
            C2241008qG c2241008qG2 = new C2241008qG();
            c2241008qG2.LIZ.put("request_id", aweme.getRequestId());
            c2241008qG2.LIZ.put("group_id", aweme.getAid());
            MobClick mobClickObtain2 = MobClick.obtain();
            mobClickObtain2.setEventName("head");
            mobClickObtain2.setLabelName(CommentContextSourceKt.enterFrom(commentContextSource));
            mobClickObtain2.setValue(AwemeExtKt.getAuthorUid(aweme));
            mobClickObtain2.setJsonObject(c2241008qG2.LJ());
            C20684815ws.onEvent(mobClickObtain2);
            C2277711EDh c2277711EDh = C2277711EDh.LIZIZ;
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LLIIIZ = user;
            c735410St1.LIZLLL = CommentContextSourceKt.enterFrom(commentContextSource);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            Activity activityLIZIZ7 = null;
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            c735410St1.LJJIJL(activityLIZIZ);
            c735410St1.LJJLIIIJILLIZJL = str;
            c735410St1.LJJZZIII = "comment_panel";
            c735410St1.LJL = "comment_panel";
            c735410St1.LJLJJI = commentContextSource.getEventModel().fromPage;
            c735410St1.LJLJJL = commentContextSource.getActionFromPage();
            c735410St1.LJIJI(aweme);
            if (num != null || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ6 = abstractC1387200mCcLJ.LIZIZ()) != null && (num = Integer.valueOf(C0SXF.LJJIII(activityLIZIZ6, aweme))) != null)) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c735410St1.LJLZ = iIntValue;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ2 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ2 != null) {
                activityLIZIZ2 = abstractC1387200mCcLIZIZ2.LIZIZ();
            } else {
                activityLIZIZ2 = null;
            }
            c735410St1.LJJJJL = C0SUC.LIZ(activityLIZIZ2).getItemPosition();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ3 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ3 != null) {
                activityLIZIZ3 = abstractC1387200mCcLIZIZ3.LIZIZ();
            } else {
                activityLIZIZ3 = null;
            }
            c735410St1.LJJJJLI = C0SUC.LIZ(activityLIZIZ3).getProfileSearchId();
            c735410St1.LJJLIIJ = user.getUid();
            Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c735410St1);
            String str3 = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            c735840Sti.getClass();
            C735840Sti.LIZJ(objLJIIIZ, aweme, null, null, null, null);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ4 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ4 != null) {
                activityLIZIZ4 = abstractC1387200mCcLIZIZ4.LIZIZ();
            } else {
                activityLIZIZ4 = null;
            }
            AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) c2277711EDh.LJJIIJ(c2277711EDh.LJJIZ(objLJIIIZ, C0SUC.LIZ(activityLIZIZ4)));
            C0SXF.LIZJ(abstractC1386130mAt, CommentContextSourceKt.enterFrom(commentContextSource), aweme, null);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ5 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ5 != null) {
                activityLIZIZ5 = abstractC1387200mCcLIZIZ5.LIZIZ();
            } else {
                activityLIZIZ5 = null;
            }
            C0SXF.LJIIIIZZ(abstractC1386130mAt, aweme, activityLIZIZ5, false);
            AbstractC1387200mCc abstractC1387200mCcLIZIZ6 = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ6 != null) {
                activityLIZIZ7 = abstractC1387200mCcLIZIZ6.LIZIZ();
            }
            C1357130lQ7.LIZ(abstractC1386130mAt, C0SUC.LIZ(activityLIZIZ7).getInboxLogExtra());
            C735410St1 c735410St12 = (C735410St1) abstractC1386130mAt;
            C1ER1 c1er1 = C1ER1.LIZIZ;
            c1er1.j(aweme, c735410St12);
            c1er1.LLILZ(aweme, CommentContextSourceKt.enterFrom(commentContextSource), c735410St12);
            C1599640rjG.LIZIZ.Ou(c735410St12, new C1360330lVH(CommentContextSourceKt.getFriendsV3TrackScene(commentContextSource), str3, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 14));
            if (C295200Bhe.LIZIZ) {
                c735410St12.LJIJJ = user.getAccurateRecType();
                c735410St12.LJZL = Boolean.valueOf(z);
            }
            c735410St12.LJ("comment_id", str2);
            LIZJ(c735410St12, commentContextSource.getEventModel().isEnterGraphicDetail());
            c735410St12.LJIILJJIL();
            C1514430pVp.LJFF(EnumC1584370rKd.PROFILE);
        }
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
    public static void LJZL(Comment comment, Boolean bool, String str, String str2, Integer num, CommentContextSource commentContextSource) {
        String authorUid;
        String cid;
        String cid2;
        int i;
        String str3;
        Integer numValueOf;
        String aid;
        String authorUid2;
        String cid3;
        String cid4;
        int i2;
        String aid2;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        String uid;
        String uid2;
        Object objValueOf4;
        Object objValueOf5;
        User author;
        String authorUid3;
        Activity activityLIZIZ;
        User user;
        User user2;
        String text;
        User author2;
        User user3;
        int i3;
        int i4;
        Activity activityLIZIZ2;
        if (commentContextSource == null) {
            return;
        }
        Aweme aweme = commentContextSource.getCommonModel().aweme;
        String str4 = commentContextSource.getCommonModel().enterFrom;
        if (Intrinsics.LJFF("opus", str4) || Intrinsics.LJFF("collection", str4)) {
            if (Intrinsics.LJFF(commentContextSource.getCommonModel().isMyProfile(), Boolean.TRUE)) {
                str4 = "personal_homepage";
            } else {
                str4 = "others_homepage";
            }
        }
        C2241008qG c2241008qG = new C2241008qG();
        Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        } else {
            authorUid = null;
        }
        c2241008qG.LIZ.put("reply_uid", authorUid);
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2241008qG.LIZ.put("reply_comment_id", cid);
        if (comment != null) {
            cid2 = comment.getCid();
        } else {
            cid2 = null;
        }
        c2241008qG.LIZ.put("direct_replied_comment_id", cid2);
        int iIntValue = 0;
        if (aweme != null && aweme.getAwemeType() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        c2241008qG.LIZ.put("is_photo", Integer.valueOf(i));
        Boolean bool2 = Boolean.TRUE;
        c2241008qG.LIZ.put("is_retry", Integer.valueOf(Intrinsics.LJFF(bool, bool2) ? 1 : 0));
        c2241008qG.LIZ.put("has_title", Integer.valueOf(commentContextSource.getEventModel().hasTitle));
        String str5 = "graphic_detail";
        if (C123100dR.LIZ(commentContextSource.getEventModel().fromPage)) {
            str3 = commentContextSource.getEventModel().fromPage;
        } else if (commentContextSource.getEventModel().isFromPostMode()) {
            str3 = "graphic_detail";
        } else {
            str3 = "";
        }
        c2241008qG.LIZ.put("from_page", str3);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ2 = abstractC1387200mCcLJ.LIZIZ()) != null) {
            numValueOf = Integer.valueOf(C0SXF.LJJIII(activityLIZIZ2, aweme));
        } else {
            numValueOf = null;
        }
        c2241008qG.LIZ.put("is_landscape_screen", numValueOf);
        c2241008qG.LIZ.put("tab_name", commentContextSource.getCommonModel().tabName);
        if (!Intrinsics.LJFF("from_music", str4)) {
            c2241008qG.LIZIZ(Integer.valueOf(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(C2214201BlK.LJFF(), aweme)), "music_name");
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        Aweme aweme3 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme3 != null) {
            aid = aweme3.getAid();
        } else {
            aid = null;
        }
        C20684815ws.LJIIJ(0L, "post_reply_comment", str4, aid, c2241008qG.LJ());
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (comment != null && C295340Bhs.LIZ()) {
            C161N c161n = C161N.LIZIZ;
            boolean zLJIILLIIL = c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN);
            if (C161T.LIZ().LJ(comment.getAwemeId()) && zLJIILLIIL) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            boolean zLJZL = c161n.LJZL(comment.getCommentLanguage());
            boolean zLJIILIIL = c161n.LJIILIIL(comment);
            if (zLJIILIIL && !zLJZL && C0BJB.LIZ()) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            boolean zLJJIIZ = C746760TRa.LIZ().LJJIIZ(comment.getAwemeId(), comment.getCid());
            boolean zLJJIJIIJIL = C746760TRa.LIZ().LJJIJIIJIL(comment.getAwemeId(), comment.getCid());
            c2344009Gk.LJFF("llm_variant", c161n.LJJLIIIJ().LIZJ(comment));
            c2344009Gk.LJFF("comment_source_language", comment.getCommentLanguage());
            c2344009Gk.LJFF("target_language", c161n.LLIIZ());
            c2344009Gk.LIZJ(i4, "is_translation_icon_shown");
            c2344009Gk.LIZJ(i3, "is_auto_translated");
            c2344009Gk.LIZJ(zLJIILIIL ? 1 : 0, "is_comment_translatable");
            c2344009Gk.LIZJ(zLJIILLIIL ? 1 : 0, "is_comment_translated");
            c2344009Gk.LIZJ(zLJJIJIIJIL ? 1 : 0, "is_ever_real_translated");
            c2344009Gk.LIZJ(zLJJIIZ ? 1 : 0, "is_ever_start_translation");
        }
        Aweme aweme4 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme4 == null || (authorUid2 = AwemeExtKt.getAuthorUid(aweme4)) == null) {
            authorUid2 = "";
        }
        c2344009Gk.LJFF("reply_uid", authorUid2);
        if (comment != null) {
            cid3 = comment.getCid();
        } else {
            cid3 = null;
        }
        c2344009Gk.LJFF("reply_comment_id", cid3);
        if (comment != null) {
            cid4 = comment.getCid();
        } else {
            cid4 = null;
        }
        c2344009Gk.LJFF("direct_replied_comment_id", cid4);
        if (aweme != null && aweme.getAwemeType() == 2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_photo");
        c2344009Gk.LIZJ(Intrinsics.LJFF(bool, bool2) ? 1 : 0, "is_retry");
        c2344009Gk.LJFF("enter_from", str4);
        if (aweme != null) {
            aid2 = aweme.getAid();
        } else {
            aid2 = null;
        }
        c2344009Gk.LJFF("group_id", aid2);
        c2344009Gk.LJFF("enter_method", commentContextSource.getCommonModel().enterMethod);
        if (comment != null && (user3 = comment.getUser()) != null) {
            objValueOf = Integer.valueOf(user3.getFollowStatus());
        } else {
            objValueOf = null;
        }
        c2344009Gk.LJ(objValueOf, "follow_status_to_user");
        if (aweme != null && (author2 = aweme.getAuthor()) != null) {
            objValueOf2 = Integer.valueOf(author2.getFollowStatus());
        } else {
            objValueOf2 = null;
        }
        c2344009Gk.LJ(objValueOf2, "follow_status");
        if (comment != null && (text = comment.getText()) != null) {
            objValueOf3 = Integer.valueOf(text.length());
        } else {
            objValueOf3 = null;
        }
        c2344009Gk.LJ(objValueOf3, "parent_comment_length");
        c2344009Gk.LJFF("parent_comment_uid", str2);
        c2344009Gk.LJFF("parent_comment_author_uid", str2);
        if (comment != null && (user2 = comment.getUser()) != null) {
            uid = user2.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJFF("direct_reply_comment_uid", uid);
        if (comment != null && (user = comment.getUser()) != null) {
            uid2 = user.getUid();
        } else {
            uid2 = null;
        }
        c2344009Gk.LJFF("direct_replied_comment_author_uid", uid2);
        c2344009Gk.LJFF("reply_uid", str2);
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        C1341320l0c.LIZIZ(c2344009Gk, "news_id", commentContextSource.getEventModel().newsId);
        c2344009Gk.LJI(C0SUC.LIZ(C2214201BlK.LJFF()).getInboxLogExtra());
        if (comment != null && comment.getTextExtra() != null && comment.getTextExtra().size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                if (textExtraStruct.getType() == 0) {
                    arrayList.add(textExtraStruct.getUserId());
                }
            }
            c2344009Gk.LJFF("parent_comment_mention_user_id", C188900o3.LIZ(arrayList));
        }
        if (aweme != null) {
            objValueOf4 = Integer.valueOf(aweme.getAwemeType());
        } else {
            objValueOf4 = null;
        }
        c2344009Gk.LJ(objValueOf4, "aweme_type");
        c2344009Gk.LIZJ(commentContextSource.getEventModel().hasTitle, "has_title");
        if (C123100dR.LIZ(commentContextSource.getEventModel().fromPage)) {
            str5 = commentContextSource.getEventModel().fromPage;
        } else if (!commentContextSource.getEventModel().isFromPostMode()) {
            str5 = "";
        }
        c2344009Gk.LJFF("from_page", str5);
        AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ2 != null && (activityLIZIZ = abstractC1387200mCcLJ2.LIZIZ()) != null) {
            objValueOf5 = Integer.valueOf(C0SXF.LJJIII(activityLIZIZ, aweme));
        } else {
            objValueOf5 = null;
        }
        c2344009Gk.LJ(objValueOf5, "is_landscape_screen");
        c2344009Gk.LJFF("tab_name", commentContextSource.getCommonModel().tabName);
        if (!Intrinsics.LJFF("from_music", str4)) {
            c2344009Gk.LIZJ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(C2214201BlK.LJFF(), aweme), "music_name");
        }
        if (num != null) {
            iIntValue = num.intValue();
        }
        c2344009Gk.LIZJ(iIntValue, "is_photo_contained");
        c2344009Gk.LIZJ(C1351950lHl.LJII(comment) ? 1 : 0, "is_reply_cmt_photo_contained");
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        C1365450ldX.LJ(c2344009Gk, author);
        String str6 = commentContextSource.getCommonModel().accountType;
        if (str6 != null) {
            c2344009Gk.LJFF("account_type", str6);
        }
        c2344009Gk.LJFF("parent_comment_id", str);
        if (aweme != null) {
            authorUid3 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid3 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid3) ? 1 : 0, "is_video_author");
        c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
        C1341320l0c.LIZIZ(c2344009Gk, "has_suggested_reply", commentContextSource.getEventModel().hasSuggestedReply);
        C1341320l0c.LIZIZ(c2344009Gk, "show_type", commentContextSource.getKeyboardModel().getQuickCommentShowType());
        C1599640rjG.LIZIZ.Ou(c2344009Gk, new C1360330lVH(CommentContextSourceKt.getFriendsV3TrackScene(commentContextSource), "post_reply_comment", CommentContextSourceKt.enterMethod(commentContextSource), null, 8));
        LJJJ(c2344009Gk, "post_reply_comment");
    }

    public static final void LL(int i, String str, String str2, String str3, String str4, String str5) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("group_id", str3);
        c2344009Gk.LJIIIIZZ("author_id", str4);
        c2344009Gk.LIZJ(i, "is_others_video");
        if (str5 != null) {
            c2344009Gk.LJFF("location", str5);
        }
        LJJJ(c2344009Gk, "reply_via_video_show");
    }

    public static void LJIJJ(String str, Aweme aweme, boolean z, boolean z2, String str2, String str3, Boolean bool) {
        String aid;
        User author;
        String str4;
        String authorUid;
        String strLJII = C454000HrC.LJII();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("position", "comment");
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str5 = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (authorUid = AwemeExtKt.getAuthorUid(aweme)) != null) {
            str5 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str5);
        c2344009Gk.LJIIIIZZ("from_page", str3);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String authorUid2 = null;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        String str6 = "normal";
        if (z) {
            str4 = "normal";
        } else {
            str4 = "fullscreen";
        }
        c2344009Gk.LJIIIIZZ("input_box_status", str4);
        if (!z2) {
            str6 = "fullscreen";
        }
        c2344009Gk.LJIIIIZZ("has_input", str6);
        if (aweme != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
        if (C123100dR.LIZ(str2)) {
            c2344009Gk.LJFF("session_id", str2);
        }
        if (C123100dR.LIZ(strLJII)) {
            c2344009Gk.LJFF("emoji_tab", strLJII);
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        LJJJ(c2344009Gk, "click_emoji_entrance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019c A[PHI: r7
      0x019c: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v3 java.lang.String) binds: [B:72:0x0198, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJLL(java.lang.String r15, java.lang.String r16, com.ss.android.ugc.aweme.profile.model.User r17, int r18, com.ss.android.ugc.aweme.comment.model.CommentContextSource r19, java.util.Map r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJJJLL(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, int, com.ss.android.ugc.aweme.comment.model.CommentContextSource, java.util.Map, java.lang.String):void");
    }

    public static final void LJJZZIII(Aweme aweme, Comment comment, String str, String str2, String str3, String str4, String str5) {
        Integer numValueOf;
        String aid;
        String uid;
        String cid;
        User author;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_page", str);
        c2344009Gk.LJIIIIZZ("referpage_name", str2);
        c2344009Gk.LJIIIIZZ("event_element", str3);
        c2344009Gk.LJIIIIZZ("cmt_to_post_preview_position", str4);
        String semanticLabel = null;
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        c2344009Gk.LJIIIIZZ("shoot_way", "comment_to_post");
        if (comment != null) {
            semanticLabel = comment.getSemanticLabel();
        }
        c2344009Gk.LJIIIIZZ("comment_type", semanticLabel);
        if (str5 != null && str5.length() != 0) {
            c2344009Gk.LJFF("cmt_to_post_initial_content_source", str5);
        }
        LJJJ(c2344009Gk, "ttinter_comment_to_post_preview_card_click");
    }

    public static void LJLIIL(Comment comment, String str, boolean z, int i, String str2, String str3, String str4) {
        String uid;
        int i2;
        String asrLang;
        String str5;
        if (comment == null) {
            return;
        }
        comment.getUser().getUid();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("comment_category", C1345700l7g.LIZ(comment));
        User user = comment.getUser();
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        c2344009Gk.LJIIIIZZ("comment_source_lang", comment.getCommentLanguage());
        C161N c161n = C161N.LIZIZ;
        c2344009Gk.LJIIIIZZ("target_lang", c161n.LLIIZ());
        int i3 = 1;
        if (C161T.LIZ().LJ(comment.getAwemeId()) && c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_auto_translated");
        c2344009Gk.LJIIIIZZ("llm_variant", str2);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(str3) ? 1 : 0, "is_video_author");
        if (!z) {
            c2344009Gk.LIZJ(i, "error_code");
        }
        c2344009Gk.LJFF("translation_element", str4);
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct == null || (asrLang = audioStruct.getAsrLang()) == null) {
            asrLang = "";
        }
        c2344009Gk.LJFF("subtitle_source_lang", asrLang);
        String strLIZ = C1350750lFp.LIZ(comment);
        if (C123100dR.LIZ(strLIZ)) {
            str5 = strLIZ;
        } else {
            str5 = "text_comment";
        }
        c2344009Gk.LJFF("message_type", str5);
        if (Intrinsics.LJFF(strLIZ, "audio")) {
            c2344009Gk.LJFF("comment_source_lang", "");
        }
        if (comment.getTransBtnStyle() != 2) {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, "is_translation_icon_clicked");
        C11NZ.LJJJJI(new ACallableS426S0100000_21(c2344009Gk, 15)).LJL(C11S5.LIZ()).LJJLJ();
    }

    public static void LLIIII(CharSequence charSequence, String str, int i, Integer num, String str2, Aweme aweme, CommentContextSource commentContextSource) {
        Aweme aweme2;
        String str3;
        CommentCommonModel commonModel;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("emoji_id", charSequence.toString());
        c2344009Gk.LJIIIIZZ("emoji_source", str);
        c2344009Gk.LIZJ(i, "emoji_num");
        c2344009Gk.LJ(num, "emoji_score");
        c2344009Gk.LJIIIIZZ("emoji_strategy_type", str2);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            aweme2 = commonModel.aweme;
        } else {
            aweme2 = null;
        }
        if (C729510SjV.LJJ(aweme2)) {
            str3 = "story";
        } else {
            str3 = "post";
        }
        c2344009Gk.LJFF("story_type", str3);
        LJJJ(c2344009Gk, "click_emoji");
    }

    public static final void LLIIZ(String str, Comment comment, String str2, String str3, int i, Map<String, String> map, boolean z) {
        String curUserId;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        Integer stickerType = null;
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        } else {
            curUserId = null;
        }
        CommentStickerStruct stickerStruct = comment.getStickerStruct();
        if (stickerStruct != null) {
            stickerType = stickerStruct.getStickerType();
        }
        String strLJIIIIZZ = C454000HrC.LJIIIIZZ(stickerType);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        String cid = comment.getCid();
        String str4 = "";
        if (cid == null) {
            cid = "";
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        c2344009Gk.LJIIIIZZ("user_id", curUserId);
        c2344009Gk.LIZJ(C1351950lHl.LJIILL(comment), "comment_level");
        c2344009Gk.LIZJ(i, "position_rank");
        c2344009Gk.LJIIIIZZ("comment_source_lang", comment.getCommentLanguage());
        c2344009Gk.LJIIIIZZ("target_lang", C161N.LIZIZ.LLIIZ());
        int i2 = 1;
        if (!comment.isAuthorDigged()) {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_liked_by_author");
        String awemeId = comment.getAwemeId();
        if (awemeId != null) {
            str4 = awemeId;
        }
        c2344009Gk.LJIIIIZZ("group_id", str4);
        if (map != null) {
            c2344009Gk.LJII(map);
        }
        if (C123100dR.LIZ(strLJIIIIZZ)) {
            c2344009Gk.LJFF("sticker_type", strLJIIIIZZ);
        }
        if (Intrinsics.LJFF("translate_comment_show", str)) {
            c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
        }
        C1347720lAw.LIZIZ(c2344009Gk, comment);
        C1341320l0c.LIZJ(c2344009Gk, comment, z);
        C207069161b.LJFF(new AnonymousClass0175(), str, c2344009Gk.LIZ);
    }

    public final void LLFII(TextExtraStruct textExtraStruct, Comment comment, String str, String str2, int i, int i2, boolean z) {
        String awemeId;
        String imprId;
        String imprId2;
        String cid;
        String awemeId2;
        String imprId3;
        Integer numValueOf;
        String wordsLang;
        String str3;
        String qrecJsonInfo;
        String awemeId3;
        LogPbBean logPb;
        LogPbBean logPb2;
        LogPbBean logPb3;
        String imprId4;
        String imprId5;
        LogPbBean logPb4;
        LogPbBean logPb5;
        boolean zLJI = MethodIDManager.LJI(137741);
        String textnetId = null;
        if (comment != null) {
            awemeId = comment.getAwemeId();
        } else {
            awemeId = null;
        }
        int i3 = 0;
        if (awemeId != null && awemeId.length() != 0) {
            synchronized (this) {
                if (LIZJ.containsKey(awemeId)) {
                    LinkedHashMap<String, List<C1349870lEP>> linkedHashMap = LIZLLL;
                    List<C1349870lEP> arrayList = linkedHashMap.get(awemeId);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        linkedHashMap.put(awemeId, arrayList);
                    }
                    List<C1349870lEP> list = arrayList;
                    if (list.size() < 60) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        if (comment == null || (logPb5 = comment.getLogPb()) == null || (imprId4 = logPb5.getImprId()) == null) {
                            imprId4 = "";
                        }
                        sbLIZ.append(imprId4);
                        sbLIZ.append(textExtraStruct.getSearchKeywordId());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        if (!list.isEmpty()) {
                            for (C1349870lEP c1349870lEP : list) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                Comment comment2 = c1349870lEP.LIZIZ;
                                if (comment2 == null || (logPb4 = comment2.getLogPb()) == null || (imprId5 = logPb4.getImprId()) == null) {
                                    imprId5 = "";
                                }
                                sbLIZ2.append(imprId5);
                                sbLIZ2.append(c1349870lEP.LIZ.getSearchKeywordId());
                                if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ)) {
                                    break;
                                }
                            }
                        }
                        list.add(new C1349870lEP(textExtraStruct, comment, str, str2, i, i2, z));
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                        return;
                    }
                    return;
                }
            }
        }
        C084D c084d = C084E.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        if (comment == null || (logPb3 = comment.getLogPb()) == null || (imprId = logPb3.getImprId()) == null) {
            imprId = "";
        }
        sbLIZ3.append(imprId);
        sbLIZ3.append(textExtraStruct.getSearchKeywordId());
        if (!c084d.containsKey((Object) C2188811AlT.LIZIZ(sbLIZ3))) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            if (comment == null || (logPb2 = comment.getLogPb()) == null || (imprId2 = logPb2.getImprId()) == null) {
                imprId2 = "";
            }
            sbLIZ4.append(imprId2);
            sbLIZ4.append(textExtraStruct.getSearchKeywordId());
            c084d.put(C2188811AlT.LIZIZ(sbLIZ4), null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("search_position", str);
            int wordPosition = textExtraStruct.getWordPosition();
            if (comment != null) {
                i3 = comment.highLightedWordCount;
            }
            c2344009Gk.LIZJ(wordPosition + i3, "words_position");
            c2344009Gk.LJIIIIZZ("words_source", "comment_highlighted_words");
            c2344009Gk.LJIIIIZZ("words_content", textExtraStruct.getSearchKeyword());
            if (comment != null) {
                cid = comment.getCid();
            } else {
                cid = null;
            }
            c2344009Gk.LJIIIIZZ("comment_id", cid);
            c2344009Gk.LJIIIIZZ("group_id", textExtraStruct.getSearchKeywordId());
            if (comment != null) {
                awemeId2 = comment.getAwemeId();
            } else {
                awemeId2 = null;
            }
            c2344009Gk.LJIIIIZZ("enter_group_id", awemeId2);
            if (comment == null || (logPb = comment.getLogPb()) == null || (imprId3 = logPb.getImprId()) == null) {
                imprId3 = "";
            }
            c2344009Gk.LJIIIIZZ("impr_id", imprId3);
            if (C07IW.LIZ()) {
                if (comment != null) {
                    awemeId3 = comment.getAwemeId();
                } else {
                    awemeId3 = null;
                }
                c2344009Gk.LJFF("last_from_group_id", awemeId3);
                c2344009Gk.LJFF("last_feed_group_id", ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILZ);
            } else {
                c2344009Gk.LJFF("last_from_group_id", str2);
                c2344009Gk.LJFF("last_feed_group_id", ((C0PM7) C0Q3E.LJI().uF().LIZJ()).LLILLL);
            }
            if (comment != null) {
                numValueOf = Integer.valueOf(comment.getCommentType());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "comment_level");
            Word wordRecord = textExtraStruct.getWordRecord();
            if (wordRecord != null) {
                wordsLang = wordRecord.getWordsLang();
            } else {
                wordsLang = null;
            }
            c2344009Gk.LJIIIIZZ("query_lang", wordsLang);
            Word wordRecord2 = textExtraStruct.getWordRecord();
            if (wordRecord2 != null) {
                textnetId = wordRecord2.getTextnetId();
            }
            c2344009Gk.LJIIIIZZ("query_category_full", textnetId);
            c2344009Gk.LIZJ(i, "is_video_ads");
            c2344009Gk.LIZJ(i2, "is_traffic_ads");
            if (z) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("enable_ad_star_hub", str3);
            String strLLJJIJIL = C1ER1.LIZIZ.LLJJIJIL();
            if (strLLJJIJIL != null) {
                c2344009Gk.LJFF("end_to_end_search_session_id", strLLJJIJIL);
            }
            if (Intrinsics.LJFF(str, "photos")) {
                c2344009Gk.LJFF("is_from_photo", "1");
            }
            Map<String, String> mapLJJIJL = ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIJL(textExtraStruct.getSearchPenetrateInfo());
            if (mapLJJIJL != null) {
                for (Map.Entry<String, String> entry : mapLJJIJL.entrySet()) {
                    String value = entry.getValue();
                    if (C123100dR.LIZ(value) && value != null) {
                        c2344009Gk.LJFF(entry.getKey(), entry.getValue());
                    }
                }
            }
            Word wordRecord3 = textExtraStruct.getWordRecord();
            if (wordRecord3 != null && (qrecJsonInfo = wordRecord3.getQrecJsonInfo()) != null) {
                c2344009Gk.LJFF("qrec_json_info", qrecJsonInfo);
            }
            LJJJ(c2344009Gk, "trending_words_show");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LJIJ(int i, int i2, float f, int i3, int i4, float f2, float f3, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(i, "width_pixels");
        c2344009Gk.LIZJ(i2, "height_pixels");
        c2344009Gk.LIZIZ(f, "density");
        c2344009Gk.LIZJ(i3, "density_dpi");
        c2344009Gk.LIZJ(i4, "threshold_width_dp");
        c2344009Gk.LIZIZ(f2, "actual_width_dp");
        c2344009Gk.LIZIZ(f3, "bias_scale");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_hit_experiment");
        LJJJ(c2344009Gk, "comment_density_adaptation_device_info");
    }

    public static void LJJJJIZL(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String uid;
        String str8;
        int i;
        if (aweme == null) {
            return;
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_element", str);
        c2344009Gk.LJIIIIZZ("event_page", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        User author2 = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
        if (C729510SjV.LJJ(aweme)) {
            str8 = "story";
        } else {
            str8 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str8);
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && statistics.getCommentCount() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_zero_comment");
        c2344009Gk.LJIIIIZZ("input_box_status", str4);
        c2344009Gk.LJIIIIZZ("sub_position", str5);
        c2344009Gk.LJIIIIZZ("has_red_dot", str6);
        c2344009Gk.LJIIIIZZ("is_greyed_out", str7);
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_entrance_element_show");
    }

    public static void LJJJJLI(Aweme aweme, User user, String str, String str2, String str3, String str4, String str5, String str6) {
        String str7;
        String str8;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("comment_enter_method", str2);
        String groupId = aweme.getGroupId();
        String str9 = "";
        if (groupId == null) {
            groupId = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (authorUid != null) {
            str9 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str9);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        User author = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(user), "follow_status_to_user");
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && statistics.getCommentCount() > 0) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str7 = "1";
        }
        c2344009Gk.LJIIIIZZ("is_zero_comment", str7);
        if (C729510SjV.LJJIJIL(aweme)) {
            str8 = "story";
        } else {
            str8 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str8);
        c2344009Gk.LJIIIIZZ("comment_category", str6);
        if (C123100dR.LIZ(str)) {
            c2344009Gk.LJFF("enter_from", str);
        }
        if (C123100dR.LIZ(str3)) {
            c2344009Gk.LJFF("enter_method", str3);
        }
        if (C123100dR.LIZ(str4)) {
            c2344009Gk.LJFF("sticker_type", str4);
        }
        if (C123100dR.LIZ(str5)) {
            c2344009Gk.LJFF("sticker_id", str5);
        }
        LJJJ(c2344009Gk, "publish_sticker_comment");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLD(java.lang.String r7, com.ss.android.ugc.aweme.comment.model.Comment r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, int r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LLD(java.lang.String, com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, int, int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final void LLFFF(String str, Aweme aweme, String str2, boolean z, boolean z2, String str3, Boolean bool, AFwS259S0000000_21 aFwS259S0000000_21) {
        String aid;
        String authorUid;
        User author;
        String str4;
        String authorUid2;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        String requestId = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("now_type", "post");
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author), "follow_status");
        if (z) {
            str4 = "normal";
        } else {
            str4 = "fullscreen";
        }
        c2344009Gk.LJIIIIZZ("input_box_status", str4);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "has_input");
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        if (aweme != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid2 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
        if (C123100dR.LIZ(str3)) {
            c2344009Gk.LJFF("session_id", str3);
        }
        if (C735370Ssx.LJJIJL(str2)) {
            C611410NyV c611410NyV = C584850Mwl.LIZ;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            }
            c2344009Gk.LJFF("log_pb", c611410NyV.LIZIZ(requestId));
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        LJJJ(c2344009Gk, "search_comment_at");
    }

    public static void LLIIJI(String str, String str2, long j, Integer num, String str3, boolean z, Comment comment, int i) {
        String cid;
        if ((i & 8) != 0) {
            num = 0;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        String rootCommentId = null;
        if ((i & 64) != 0) {
            comment = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("source", str2);
        c2344009Gk.LIZLLL(j, "duration");
        c2344009Gk.LJ(num, "is_photo_contained");
        c2344009Gk.LJIIIIZZ("group_id", str3);
        if (z) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
            if (comment != null) {
                cid = comment.getCid();
                if (comment.getCommentType() == 2) {
                    rootCommentId = comment.getRootCommentId();
                }
            } else {
                cid = null;
            }
            if (C123100dR.LIZ(cid)) {
                c2344009Gk.LJFF("comment_id", cid);
            }
            if (C123100dR.LIZ(rootCommentId)) {
                c2344009Gk.LJFF("parent_comment_id", rootCommentId);
            }
        }
        LJJJ(c2344009Gk, "full_screen_view_photo_duration");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLIIJLIL(java.lang.String r7, java.lang.String r8, java.lang.Integer r9, com.ss.android.ugc.aweme.comment.model.Comment r10, com.ss.android.ugc.aweme.feed.model.Aweme r11, java.lang.String r12, java.lang.Integer r13, java.util.List<com.ss.android.ugc.aweme.comment.model.CommentImageModel> r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LLIIJLIL(java.lang.String, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.Integer, java.util.List):void");
    }

    public static final void LJJIIZI(String str, Integer num, String str2, String str3, String str4, String str5, Aweme aweme, Comment comment, String str6) {
        String aid;
        String authorUid;
        User author;
        String str7;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("sticker_type", C454000HrC.LJIIIIZZ(num));
        c2344009Gk.LJIIIIZZ("sticker_id", str2);
        c2344009Gk.LJIIIIZZ("sticker_set_name", str3);
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        c2344009Gk.LJIIIIZZ("enter_method", str5);
        User user = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C735840Sti c735840Sti = C735840Sti.LIZ;
        if (aweme != null) {
            author = aweme.getAuthor();
        } else {
            author = null;
        }
        c735840Sti.getClass();
        c2344009Gk.LJIIIIZZ("follow_status", String.valueOf(C735840Sti.LJIIIIZZ(author)));
        if (comment != null) {
            user = comment.getUser();
        }
        c2344009Gk.LJIIIIZZ("follow_status_to_user", String.valueOf(C735840Sti.LJIIIIZZ(user)));
        if (C729510SjV.LJJIJIL(aweme)) {
            str7 = "story";
        } else {
            str7 = "post";
        }
        c2344009Gk.LJIIIIZZ("story_type", str7);
        c2344009Gk.LJIIIIZZ("sticker_source", str6);
        LJJJ(c2344009Gk, "ttinter_sticker_comment_delete");
    }

    public static void LJJLIIIJILLIZJL(Comment comment, int i, int i2, String str, String str2, String str3, boolean z, int i3, int i4) {
        String cid;
        String uid;
        User user;
        if ((i4 & 64) != 0) {
            z = false;
        }
        if ((i4 & 128) != 0) {
            i3 = 0;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", str);
        c2344009Gk.LJIIIIZZ("group_id", str2);
        String sortTags = null;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_id", cid);
        if (comment != null && (user = comment.getUser()) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        if (comment != null) {
            sortTags = comment.getSortTags();
        }
        c2344009Gk.LJIIIIZZ("sort_tags", sortTags);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LIZJ(i, "parent_position");
        c2344009Gk.LIZJ(i2, "secondary_position");
        c2344009Gk.LIZJ(i3, "action_cnt");
        if (z) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        c2344009Gk.LIZJ(C1351950lHl.LJIILL(comment), "comment_level");
        LJJJ(c2344009Gk, "click_more_comment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v40, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v41, types: [T, java.lang.String] */
    public static final void LJJLIL(final String str, final CommentContextSource commentContextSource, final Comment comment, final int i, final int i2, final long j, final int i3, final int i4, final boolean z) {
        T tValueOf;
        Integer numValueOf;
        final String strValueOf;
        String authorUid;
        T t;
        Aweme aweme;
        CommentCommonModel commonModel;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        final C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = "1";
        final C259800zU c259800zU4 = new C259800zU();
        EnumC1342450l2R currSortType = null;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            tValueOf = Boolean.valueOf(commonModel.isInPhotoCommentDetailPage());
        } else {
            tValueOf = 0;
        }
        c259800zU4.element = tValueOf;
        if (C1345700l7g.LIZLLL(comment) == 2) {
            c259800zU.element = comment.getRootCommentId();
            c259800zU2.element = comment.getCid();
            c259800zU3.element = "2";
        } else if (C1345700l7g.LIZLLL(comment) == 1) {
            c259800zU.element = comment.getCid();
            c259800zU3.element = "1";
        }
        RelationDynamicLabel relationLabel = comment.getRelationLabel();
        if (relationLabel != null) {
            numValueOf = Integer.valueOf(relationLabel.getType());
        } else {
            numValueOf = null;
        }
        final String strValueOf2 = String.valueOf(numValueOf);
        if (TextUtils.isEmpty(comment.getLabelText())) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(comment.getLabelType());
        }
        final C259800zU c259800zU5 = new C259800zU();
        c259800zU5.element = "";
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (TextUtils.equals(authorUid, comment.getUser().getUid())) {
            c259800zU5.element = "creator";
        } else if (comment.getUser().getFollowStatus() == 2) {
            c259800zU5.element = "friends";
        } else if (comment.getUser().getFollowStatus() == 1) {
            c259800zU5.element = "following";
        }
        final String predictedAgeGroup = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getPredictedAgeGroup();
        final String predictedAgeGroup2 = comment.getUser().getPredictedAgeGroup();
        if (commentContextSource != null) {
            currSortType = commentContextSource.getCurrSortType();
        }
        final String strLIZ = C1342490l2V.LIZ(currSortType);
        final C259800zU c259800zU6 = new C259800zU();
        if (commentContextSource != null) {
            if (commentContextSource.getEventModel().isFromPostMode() && C123100dR.LIZ(commentContextSource.getCommonModel().tempEnterMethod)) {
                t = commentContextSource.getCommonModel().tempEnterMethod;
            } else {
                t = commentContextSource.getCommonModel().enterMethod;
            }
            c259800zU6.element = t;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(new C2232408os(C20684815ws.LJFF())), null, null, new C333901Rh(new Runnable() { // from class: X.0lFg
            /* JADX WARN: Removed duplicated region for block: B:139:0x0309  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x031b  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x0350  */
            /* JADX WARN: Removed duplicated region for block: B:159:0x0360  */
            /* JADX WARN: Removed duplicated region for block: B:162:0x0369  */
            /* JADX WARN: Removed duplicated region for block: B:167:0x0386  */
            /* JADX WARN: Removed duplicated region for block: B:170:0x038e  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x039e  */
            /* JADX WARN: Removed duplicated region for block: B:183:0x03b3  */
            /* JADX WARN: Removed duplicated region for block: B:186:0x03bb  */
            /* JADX WARN: Removed duplicated region for block: B:192:0x03cb  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x03df  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x03ea  */
            /* JADX WARN: Removed duplicated region for block: B:205:0x03fa  */
            /* JADX WARN: Removed duplicated region for block: B:223:0x0439  */
            /* JADX WARN: Removed duplicated region for block: B:236:0x048f  */
            /* JADX WARN: Removed duplicated region for block: B:241:0x04a6  */
            /* JADX WARN: Removed duplicated region for block: B:244:0x04b0  */
            /* JADX WARN: Removed duplicated region for block: B:247:0x04c7  */
            /* JADX WARN: Removed duplicated region for block: B:250:0x04d5  */
            /* JADX WARN: Removed duplicated region for block: B:253:0x04e0  */
            /* JADX WARN: Removed duplicated region for block: B:256:0x04ee  */
            /* JADX WARN: Removed duplicated region for block: B:259:0x04fb  */
            /* JADX WARN: Removed duplicated region for block: B:264:0x050b  */
            /* JADX WARN: Removed duplicated region for block: B:267:0x0518  */
            /* JADX WARN: Removed duplicated region for block: B:270:0x0522  */
            /* JADX WARN: Removed duplicated region for block: B:273:0x0534  */
            /* JADX WARN: Removed duplicated region for block: B:276:0x054b  */
            /* JADX WARN: Removed duplicated region for block: B:279:0x055a  */
            /* JADX WARN: Removed duplicated region for block: B:282:0x0564  */
            /* JADX WARN: Removed duplicated region for block: B:287:0x0572  */
            /* JADX WARN: Removed duplicated region for block: B:290:0x057b  */
            /* JADX WARN: Removed duplicated region for block: B:293:0x0585  */
            /* JADX WARN: Removed duplicated region for block: B:296:0x058e  */
            /* JADX WARN: Removed duplicated region for block: B:299:0x0598  */
            /* JADX WARN: Removed duplicated region for block: B:302:0x05a9  */
            /* JADX WARN: Removed duplicated region for block: B:305:0x05b4  */
            /* JADX WARN: Removed duplicated region for block: B:316:0x05f6  */
            /* JADX WARN: Removed duplicated region for block: B:319:0x0625  */
            /* JADX WARN: Removed duplicated region for block: B:322:0x0631  */
            /* JADX WARN: Removed duplicated region for block: B:327:0x063f  */
            /* JADX WARN: Removed duplicated region for block: B:350:0x0696  */
            /* JADX WARN: Removed duplicated region for block: B:364:0x06cb  */
            /* JADX WARN: Removed duplicated region for block: B:367:0x06d4  */
            /* JADX WARN: Removed duplicated region for block: B:377:0x0701  */
            /* JADX WARN: Removed duplicated region for block: B:381:0x070d  */
            /* JADX WARN: Removed duplicated region for block: B:384:0x0716  */
            /* JADX WARN: Removed duplicated region for block: B:386:0x071c  */
            /* JADX WARN: Removed duplicated region for block: B:389:0x0730  */
            /* JADX WARN: Removed duplicated region for block: B:396:0x0746  */
            /* JADX WARN: Removed duplicated region for block: B:399:0x0750  */
            /* JADX WARN: Removed duplicated region for block: B:414:0x0795  */
            /* JADX WARN: Removed duplicated region for block: B:415:0x0797  */
            /* JADX WARN: Removed duplicated region for block: B:417:0x079d  */
            /* JADX WARN: Removed duplicated region for block: B:419:0x07a3  */
            /* JADX WARN: Removed duplicated region for block: B:420:0x07a6  */
            /* JADX WARN: Removed duplicated region for block: B:423:0x07af  */
            /* JADX WARN: Removed duplicated region for block: B:424:0x07b2  */
            /* JADX WARN: Removed duplicated region for block: B:426:0x07b8  */
            /* JADX WARN: Removed duplicated region for block: B:427:0x07bb  */
            /* JADX WARN: Removed duplicated region for block: B:428:0x07be  */
            /* JADX WARN: Removed duplicated region for block: B:429:0x07c1  */
            /* JADX WARN: Removed duplicated region for block: B:430:0x07c4  */
            /* JADX WARN: Removed duplicated region for block: B:431:0x07c7  */
            /* JADX WARN: Removed duplicated region for block: B:432:0x07cb  */
            /* JADX WARN: Removed duplicated region for block: B:433:0x07ce  */
            /* JADX WARN: Removed duplicated region for block: B:437:0x07da  */
            /* JADX WARN: Removed duplicated region for block: B:438:0x07dd  */
            /* JADX WARN: Removed duplicated region for block: B:439:0x07e0  */
            /* JADX WARN: Removed duplicated region for block: B:440:0x07e3  */
            /* JADX WARN: Removed duplicated region for block: B:441:0x07e6  */
            /* JADX WARN: Removed duplicated region for block: B:442:0x07e9  */
            /* JADX WARN: Removed duplicated region for block: B:443:0x07ec  */
            /* JADX WARN: Removed duplicated region for block: B:444:0x07ef  */
            /* JADX WARN: Removed duplicated region for block: B:445:0x07f2  */
            /* JADX WARN: Removed duplicated region for block: B:452:0x0805  */
            /* JADX WARN: Removed duplicated region for block: B:484:0x0865  */
            /* JADX WARN: Removed duplicated region for block: B:490:0x087b  */
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
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() throws java.lang.Exception {
                /*
                    Method dump skipped, instruction units count: 2177
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1350660lFg.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommentLogger@c1c.sendCommentDurationEvent$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommentLogger@c1c.sendCommentDurationEvent$2");
            }
        }, null, null), 3);
    }

    public static final void LLFF(String str, Aweme aweme, Comment comment, String str2, String str3, FypExposedCommentMobParams fypExposedCommentMobParams, EnumC1342450l2R enumC1342450l2R, boolean z, Function1<? super C2344009Gk, Unit> function1) {
        String str4;
        int length;
        int iLJIIL;
        String uid;
        String authorUid;
        String str5;
        String string;
        String id;
        Integer stickerType;
        int i;
        UserVoteInfo userVoteInfo;
        Long setId;
        String region;
        User author;
        CommentImageStruct commentImageStruct;
        if (comment == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJI(ForwardStatisticsServiceImpl.LIZIZ().LIZ(aweme, str));
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (C1345700l7g.LJIIJJI(comment)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_video", str4);
        int i2 = 0;
        c2344009Gk.LIZJ(0, "is_recommendation");
        String text = comment.getText();
        if (text != null) {
            length = text.length();
        } else {
            length = 0;
        }
        c2344009Gk.LIZJ(length, "comment_length");
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null) {
            iLJIIL = C1351950lHl.LJIIL(imageList);
        } else {
            iLJIIL = 0;
        }
        c2344009Gk.LIZJ(iLJIIL, "is_photo_contained");
        User user = comment.getUser();
        String rootCommentId = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        List<CommentImageStruct> imageList2 = comment.getImageList();
        if (imageList2 != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList2)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
            str5 = "live_once";
        } else {
            str5 = "static";
        }
        c2344009Gk.LJFF("sub_photo_type", str5);
        if (Intrinsics.LJFF("homepage_country", str)) {
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                region = author.getRegion();
            } else {
                region = null;
            }
            c2344009Gk.LJFF("country_name", region);
        }
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        if (function1 != null) {
            function1.invoke(c2344009Gk);
        }
        if (C123100dR.LIZ(str3)) {
            c2344009Gk.LJFF("session_id", str3);
        }
        String strLIZ = C1350750lFp.LIZ(comment);
        if (!C123100dR.LIZ(strLIZ)) {
            strLIZ = "text_comment";
        }
        c2344009Gk.LJFF("message_type", strLIZ);
        CommentStickerStruct stickerStruct = comment.getStickerStruct();
        if (stickerStruct != null && (setId = stickerStruct.getSetId()) != null) {
            string = setId.toString();
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            c2344009Gk.LJFF("sticker_set_name", string);
        }
        CommentStickerStruct stickerStruct2 = comment.getStickerStruct();
        if (stickerStruct2 != null) {
            id = stickerStruct2.getId();
        } else {
            id = null;
        }
        if (C123100dR.LIZ(id)) {
            c2344009Gk.LJFF("sticker_id", id);
        }
        CommentStickerStruct stickerStruct3 = comment.getStickerStruct();
        if (stickerStruct3 != null) {
            stickerType = stickerStruct3.getStickerType();
        } else {
            stickerType = null;
        }
        String strLJIIIIZZ = C454000HrC.LJIIIIZZ(stickerType);
        if (C123100dR.LIZ(strLJIIIIZZ)) {
            c2344009Gk.LJFF("sticker_type", strLJIIIIZZ);
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            LIZ.getClass();
            LIZLLL(c2344009Gk, fypExposedCommentMobParams, str);
        }
        if (comment.getCommentType() == 2) {
            rootCommentId = comment.getRootCommentId();
        }
        if (C123100dR.LIZ(rootCommentId)) {
            c2344009Gk.LJFF("parent_comment_id", rootCommentId);
        }
        if (C123100dR.LIZ(C1345700l7g.LIZ(comment))) {
            c2344009Gk.LJFF("comment_category", C1345700l7g.LIZ(comment));
        }
        c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
        if (C123100dR.LIZ(comment.getSortTags())) {
            c2344009Gk.LJFF("sort_tags", comment.getSortTags());
        }
        c2344009Gk.LJFF("channel", C1342490l2V.LIZ(enumC1342450l2R));
        C1347720lAw.LIZIZ(c2344009Gk, comment);
        if (comment.getIsTakoGenerated()) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_tako_comment");
        c2344009Gk.LJFF("is_at_tako", C1339840kyE.LIZ(comment));
        LIZ.getClass();
        LIZIZ(c2344009Gk, comment);
        if (z && (userVoteInfo = comment.userVoteInfo) != null) {
            c2344009Gk.LJ(userVoteInfo.pollId, "cmt_poll_id");
            Integer num = userVoteInfo.voteOption;
            if (num != null && num.intValue() != -1) {
                i2 = 1;
            }
            c2344009Gk.LIZJ(i2, "is_cmt_poll_card_show");
            c2344009Gk.LJFF("cmt_poll_card_show_option", userVoteInfo.voteText);
        }
        LJJJ(c2344009Gk, "report_comment");
    }

    public static final void LLILL(Comment comment, String str, int i, Aweme aweme, String str2, FypExposedCommentMobParams fypExposedCommentMobParams, EnumC1342450l2R enumC1342450l2R, boolean z, Function1 function1) {
        String uid;
        String authorUid;
        String authorUid2;
        String authorUid3;
        int i2;
        int i3;
        String str3;
        String id;
        String rootCommentId;
        String asrLang;
        Integer stickerType;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("position", "comment_panel");
        c2344009Gk.LJIIIIZZ("enter_method", "tap_comment");
        c2344009Gk.LIZJ(C1351950lHl.LJIILL(comment), "comment_level");
        C161N c161n = C161N.LIZIZ;
        c2344009Gk.LJIIIIZZ("target_lang", c161n.LLIIZ());
        int i4 = 0;
        c2344009Gk.LIZJ(0, "is_recommendation");
        User user = comment.getUser();
        String authorUid4 = null;
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("comment_author_uid", uid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (aweme != null) {
            authorUid2 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid2 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
        c2344009Gk.LJFF("action_type", "click_button");
        c2344009Gk.LJFF("comment_category", C1345700l7g.LIZ(comment));
        c2344009Gk.LJFF("comment_source_lang", comment.getCommentLanguage());
        c2344009Gk.LJFF("target_lang", c161n.LLIIZ());
        if (aweme != null) {
            authorUid3 = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid3 = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid3) ? 1 : 0, "is_video_author");
        boolean zLJIILIIL = c161n.LJIILIIL(comment);
        boolean zLJJLIL = c161n.LJJLIL(comment);
        if (!zLJIILIIL && !zLJJLIL) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "is_comment_translatable");
        if (comment.getTransBtnStyle() == 2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c2344009Gk.LIZJ(i3, "is_translation_icon_clicked");
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        if (function1 != null) {
            function1.invoke(c2344009Gk);
        }
        if (!TextUtils.isEmpty(str2)) {
            c2344009Gk.LJFF("session_id", str2);
        }
        String strLIZ = C1350750lFp.LIZ(comment);
        if (C123100dR.LIZ(strLIZ)) {
            str3 = strLIZ;
        } else {
            str3 = "text_comment";
        }
        c2344009Gk.LJFF("message_type", str3);
        CommentStickerStruct stickerStruct = comment.getStickerStruct();
        if (stickerStruct != null) {
            id = stickerStruct.getId();
        } else {
            id = null;
        }
        if (C123100dR.LIZ(id)) {
            c2344009Gk.LJFF("sticker_id", id);
        }
        CommentStickerStruct stickerStruct2 = comment.getStickerStruct();
        if (stickerStruct2 != null && (stickerType = stickerStruct2.getStickerType()) != null) {
            c2344009Gk.LJFF("sticker_type", C454000HrC.LJIIIIZZ(stickerType));
        }
        if (comment.getCommentType() == 2) {
            rootCommentId = comment.getRootCommentId();
        } else {
            rootCommentId = null;
        }
        if (C123100dR.LIZ(rootCommentId)) {
            c2344009Gk.LJFF("parent_comment_id", rootCommentId);
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            LIZ.getClass();
            LIZLLL(c2344009Gk, fypExposedCommentMobParams, str);
        }
        c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
        c2344009Gk.LJFF("channel", C1342490l2V.LIZ(enumC1342450l2R));
        if (comment.getIsTakoGenerated()) {
            i4 = 1;
        }
        c2344009Gk.LIZJ(i4, "is_tako_comment");
        c2344009Gk.LJFF("is_at_tako", C1339840kyE.LIZ(comment));
        LIZ.getClass();
        LIZIZ(c2344009Gk, comment);
        CmtAudioStruct audioStruct = comment.getAudioStruct();
        if (audioStruct == null || (asrLang = audioStruct.getAsrLang()) == null) {
            asrLang = "";
        }
        c2344009Gk.LJFF("subtitle_source_lang", asrLang);
        if (Intrinsics.LJFF(strLIZ, "audio")) {
            c2344009Gk.LJFF("comment_source_lang", "");
        }
        if (aweme != null) {
            authorUid4 = AwemeExtKt.getAuthorUid(aweme);
        }
        LLIIZ("translate_comment", comment, str, authorUid4, i, c2344009Gk.LIZ, z);
    }

    public static void LJIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i) {
        if ((i & 8) != 0) {
            str4 = "";
        }
        if ((i & 16) != 0) {
            str5 = "";
        }
        if ((i & 32) != 0) {
            str6 = "";
        }
        if ((i & 64) != 0) {
            str7 = "";
        }
        if ((i & 128) != 0) {
            str8 = "";
        }
        if ((i & 256) != 0) {
            map = new LinkedHashMap();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("action_type", str4);
        c2344009Gk.LJIIIIZZ("to_status", str5);
        c2344009Gk.LJIIIIZZ("story_type", str6);
        c2344009Gk.LJIIIIZZ("pop_up_type", str7);
        c2344009Gk.LJIIIIZZ("auth_result", str8);
        for (Map.Entry entry : map.entrySet()) {
            c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
        }
        LJJJ(c2344009Gk, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0228 A[PHI: r9
      0x0228: PHI (r9v1 java.lang.Long) = (r9v0 java.lang.Long), (r9v4 java.lang.Long) binds: [B:141:0x0224, B:101:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIIZ(com.ss.android.ugc.aweme.feed.model.Aweme r12, com.ss.android.ugc.aweme.comment.model.Comment r13, X.InterfaceC1369790lkX r14, boolean r15, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r16, java.lang.String r17, java.lang.String r18, X.EnumC1342450l2R r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJJIIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, X.0lkX, boolean, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage, java.lang.String, java.lang.String, X.0l2R, int, int):void");
    }

    public static void LJJJJ(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String uid;
        int i;
        if (aweme == null) {
            return;
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("event_element", str);
        c2344009Gk.LJIIIIZZ("event_page", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        c2344009Gk.LJIIIIZZ("enter_method", str3);
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        User author = aweme.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        User author2 = aweme.getAuthor();
        c735840Sti.getClass();
        c2344009Gk.LIZJ(C735840Sti.LJIIIIZZ(author2), "follow_status");
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && statistics.getCommentCount() > 0) {
            i = 0;
        } else {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_zero_comment");
        c2344009Gk.LJIIIIZZ("input_box_status", str4);
        c2344009Gk.LJIIIIZZ("action_result", str5);
        c2344009Gk.LJIIIIZZ("result_code", str6);
        c2344009Gk.LJIIIIZZ("sub_position", str7);
        c2344009Gk.LJIIIIZZ("has_red_dot", str8);
        c2344009Gk.LJIIIIZZ("is_greyed_out", str9);
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        LJJJ(c2344009Gk, "ttinter_comment_multi_genre_entrance_element_click");
    }

    public static final void LJLLI(String str, int i, Comment comment, String str2, String str3, FypExposedCommentMobParams fypExposedCommentMobParams, boolean z, EnumC1342450l2R enumC1342450l2R, Boolean bool, boolean z2) {
        String str4;
        String string;
        String id;
        Integer stickerType;
        String str5;
        int i2;
        UserVoteInfo userVoteInfo;
        CommentImageStruct commentImageStruct;
        Long setId;
        int i3 = 1;
        if (i == 1) {
            str4 = "favorite_comment";
        } else {
            str4 = "cancel_favorite_comment";
        }
        String strLIZ = C1350750lFp.LIZ(comment);
        if (!C123100dR.LIZ(strLIZ)) {
            strLIZ = "text_comment";
        }
        CommentStickerStruct stickerStruct = comment.getStickerStruct();
        String rootCommentId = null;
        if (stickerStruct != null && (setId = stickerStruct.getSetId()) != null) {
            string = setId.toString();
        } else {
            string = null;
        }
        CommentStickerStruct stickerStruct2 = comment.getStickerStruct();
        if (stickerStruct2 != null) {
            id = stickerStruct2.getId();
        } else {
            id = null;
        }
        CommentStickerStruct stickerStruct3 = comment.getStickerStruct();
        if (stickerStruct3 != null) {
            stickerType = stickerStruct3.getStickerType();
        } else {
            stickerType = null;
        }
        String strLJIIIIZZ = C454000HrC.LJIIIIZZ(stickerType);
        if (comment.getCommentType() == 2) {
            rootCommentId = comment.getRootCommentId();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("comment_id", comment.getCid());
        c2344009Gk.LJIIIIZZ("to_user_id", comment.getUser().getUid());
        c2344009Gk.LJIIIIZZ("group_id", comment.getAwemeId());
        C1380890m2R.LJFF(c2344009Gk, comment.getAliasAweme());
        c2344009Gk.LIZJ(0, "is_recommendation");
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(str2) ? 1 : 0, "is_video_author");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_comment_long_press_panel");
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
            str5 = "live_once";
        } else {
            str5 = "static";
        }
        c2344009Gk.LJIIIIZZ("sub_photo_type", str5);
        if (C123100dR.LIZ(str3)) {
            c2344009Gk.LJFF("session_id", str3);
        }
        if (C123100dR.LIZ(string)) {
            c2344009Gk.LJFF("sticker_set_name", string);
        }
        if (C123100dR.LIZ(id)) {
            c2344009Gk.LJFF("sticker_id", id);
        }
        if (C123100dR.LIZ(strLJIIIIZZ)) {
            c2344009Gk.LJFF("sticker_type", strLJIIIIZZ);
        }
        if (C123100dR.LIZ(rootCommentId)) {
            c2344009Gk.LJFF("parent_comment_id", rootCommentId);
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            LIZ.getClass();
            LIZLLL(c2344009Gk, fypExposedCommentMobParams, str);
        }
        c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
        LIZ.getClass();
        LIZIZ(c2344009Gk, comment);
        c2344009Gk.LJIIIIZZ("message_type", strLIZ);
        c2344009Gk.LJIIIIZZ("channel", C1342490l2V.LIZ(enumC1342450l2R));
        if (comment.getIsTakoGenerated()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c2344009Gk.LIZJ(i2, "is_tako_comment");
        c2344009Gk.LJIIIIZZ("is_at_tako", C1339840kyE.LIZ(comment));
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        C1347720lAw.LIZIZ(c2344009Gk, comment);
        if (z2 && (userVoteInfo = comment.userVoteInfo) != null) {
            c2344009Gk.LJ(userVoteInfo.pollId, "cmt_poll_id");
            Integer num = userVoteInfo.voteOption;
            if (num == null || num.intValue() == -1) {
                i3 = 0;
            }
            c2344009Gk.LIZJ(i3, "is_cmt_poll_card_show");
            c2344009Gk.LJFF("cmt_poll_card_show_option", userVoteInfo.voteText);
        }
        LJJJ(c2344009Gk, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ce  */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Boolean, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJLLJ(com.ss.android.ugc.aweme.comment.model.CommentContextSource r26, com.ss.android.ugc.aweme.comment.model.Comment r27, java.lang.String r28, boolean r29, java.lang.String r30, com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJLLJ(com.ss.android.ugc.aweme.comment.model.CommentContextSource, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, boolean, java.lang.String, com.ss.android.ugc.aweme.comment.model.FypExposedCommentMobParams, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLIIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r11, com.ss.android.ugc.aweme.comment.model.Comment r12, java.lang.String r13, int r14, int r15, java.lang.String r16, java.lang.String r17, boolean r18, X.EnumC1342450l2R r19, com.ss.android.ugc.aweme.comment.model.CommentContextSource r20) {
        /*
            Method dump skipped, instruction units count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LLIIIJ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, X.0l2R, com.ss.android.ugc.aweme.comment.model.CommentContextSource):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03fe A[PHI: r24
      0x03fe: PHI (r24v3 java.lang.Long) = (r24v4 java.lang.Long), (r24v5 java.lang.Long) binds: [B:249:0x03fc, B:389:0x06a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0424 A[PHI: r1
      0x0424: PHI (r1v43 java.lang.String) = (r1v42 java.lang.String), (r1v68 java.lang.String) binds: [B:263:0x0422, B:382:0x0695] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0699 A[PHI: r1
      0x0699: PHI (r1v67 java.lang.String) = (r1v43 java.lang.String), (r1v43 java.lang.String), (r1v43 java.lang.String), (r1v68 java.lang.String) binds: [B:265:0x0428, B:267:0x042c, B:269:0x0432, B:382:0x0695] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x069c A[PHI: r24
      0x069c: PHI (r24v1 java.lang.Long) = (r24v3 java.lang.Long), (r24v3 java.lang.Long), (r24v3 java.lang.Long), (r24v4 java.lang.Long) binds: [B:251:0x0402, B:253:0x0406, B:255:0x040c, B:249:0x03fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0738 A[PHI: r11
      0x0738: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:429:0x0734, B:28:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0100  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJLIIIJLJLI(com.ss.android.ugc.aweme.comment.model.CommentContextSource r27, long r28, java.lang.String r30, java.lang.String r31, long r32, long r34, X.C1343080l3S r36, long r37, long r39, long r41, int r43) {
        /*
            Method dump skipped, instruction units count: 1851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJJLIIIJLJLI(com.ss.android.ugc.aweme.comment.model.CommentContextSource, long, java.lang.String, java.lang.String, long, long, X.0l3S, long, long, long, int):void");
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
    public static final void LJJLIIIJL(String str, Aweme aweme, Comment comment, String str2, FypExposedCommentMobParams fypExposedCommentMobParams, boolean z, boolean z2, String str3, String str4, String str5, Integer num, String str6) {
        String uid;
        Object objValueOf;
        String logPbString;
        String cid;
        int length;
        String authorUid;
        String str7;
        String string;
        String id;
        String sortTags;
        String sortTags2;
        String rootCommentId;
        CommentStickerStruct stickerStruct;
        CommentStickerStruct stickerStruct2;
        Long setId;
        List<CommentImageStruct> imageList;
        CommentImageStruct commentImageStruct;
        String text;
        User user;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String aid = "";
        if (comment == null || (user = comment.getUser()) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", uid);
        if (aweme == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(aweme.getAwemeType());
        }
        c2344009Gk.LJ(objValueOf, "aweme_type");
        if (aweme == null || (logPbString = aweme.getLogPbString()) == null) {
            logPbString = "";
        }
        c2344009Gk.LJIIIIZZ("log_pb", logPbString);
        c2344009Gk.LIZJ(C735370Ssx.LJIILL(aweme), "pic_cnt");
        Activity activityLIZIZ = null;
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("object_id", cid);
        c2344009Gk.LJIIIIZZ("object_type", str4);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", "click_comment_button");
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        int i = 0;
        if (comment != null && (text = comment.getText()) != null) {
            length = text.length();
        } else {
            length = 0;
        }
        c2344009Gk.LIZJ(length, "comment_length");
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_comment_long_press_panel");
        if (comment != null && (imageList = comment.getImageList()) != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList)) != null && commentImageStruct.getLivePhotoInfoModel() != null) {
            str7 = "live_once";
        } else {
            str7 = "static";
        }
        c2344009Gk.LJIIIIZZ("sub_photo_type", str7);
        C1347720lAw.LIZIZ(c2344009Gk, comment);
        if (C123100dR.LIZ(str2)) {
            c2344009Gk.LJFF("session_id", str2);
        }
        String strLIZ = C1350750lFp.LIZ(comment);
        if (!C123100dR.LIZ(strLIZ)) {
            strLIZ = "text_comment";
        }
        c2344009Gk.LJFF("message_type", strLIZ);
        if (comment != null && (stickerStruct2 = comment.getStickerStruct()) != null && (setId = stickerStruct2.getSetId()) != null) {
            string = setId.toString();
        } else {
            string = null;
        }
        if (C123100dR.LIZ(string)) {
            c2344009Gk.LJFF("sticker_set_name", string);
        }
        if (C123100dR.LIZ(str3)) {
            c2344009Gk.LJFF("comment_channel", str3);
        }
        if (comment != null && (stickerStruct = comment.getStickerStruct()) != null) {
            id = stickerStruct.getId();
        } else {
            id = null;
        }
        if (C123100dR.LIZ(id)) {
            c2344009Gk.LJFF("sticker_id", id);
        }
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            LIZ.getClass();
            LIZLLL(c2344009Gk, fypExposedCommentMobParams, str);
        }
        if (comment != null) {
            if (comment.getCommentType() == 2) {
                rootCommentId = comment.getRootCommentId();
            } else {
                rootCommentId = null;
            }
            if (C123100dR.LIZ(rootCommentId)) {
                c2344009Gk.LJFF("parent_comment_id", rootCommentId);
            }
            if (C123100dR.LIZ(C1345700l7g.LIZ(comment))) {
                c2344009Gk.LJFF("comment_category", C1345700l7g.LIZ(comment));
            }
            sortTags = comment.getSortTags();
        } else {
            sortTags = null;
        }
        if (C123100dR.LIZ(sortTags)) {
            if (comment != null) {
                sortTags2 = comment.getSortTags();
            } else {
                sortTags2 = null;
            }
            c2344009Gk.LJFF("sort_tags", sortTags2);
        }
        C1347720lAw.LIZIZ(c2344009Gk, comment);
        if (z2) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        if (comment != null && comment.getIsTakoGenerated()) {
            i = 1;
        }
        c2344009Gk.LIZJ(i, "is_tako_comment");
        c2344009Gk.LJFF("is_at_tako", C1339840kyE.LIZ(comment));
        LIZ.getClass();
        LIZIZ(c2344009Gk, comment);
        if (str5 != null) {
            c2344009Gk.LJFF("cmt_poll_id", str5);
        }
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "is_cmt_poll_card_show");
        }
        if (str6 != null) {
            c2344009Gk.LJFF("cmt_poll_card_show_option", str6);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        }
        TakoAIVideoMobFiller.INSTANCE.appendFeedParams(c2344009Gk, C0SUC.LIZ(activityLIZIZ));
        LJJJ(c2344009Gk, "click_report");
    }

    public static void LLIFFJFJJ(String str, String str2, String str3, Boolean bool, boolean z, EnumC1342450l2R enumC1342450l2R, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool2, String str11) {
        String str12;
        C2344009Gk c2344009GkLJIIIZ = LJIIIZ(str, str2);
        c2344009GkLJIIIZ.LJIIIIZZ("comment_id", str3);
        Boolean bool3 = Boolean.TRUE;
        c2344009GkLJIIIZ.LIZJ(Intrinsics.LJFF(bool, bool3) ? 1 : 0, "is_pinned");
        c2344009GkLJIIIZ.LIZJ(0, "is_recommendation");
        if (z) {
            str12 = "comment_long_press_panel";
        } else {
            str12 = "";
        }
        c2344009GkLJIIIZ.LJIIIIZZ("enter_method", str12);
        c2344009GkLJIIIZ.LJIIIIZZ("channel", C1342490l2V.LIZ(enumC1342450l2R));
        c2344009GkLJIIIZ.LIZJ(i, "is_internal_image_comment");
        if (C123100dR.LIZ(str4)) {
            c2344009GkLJIIIZ.LJFF("parent_comment_id", str4);
        }
        c2344009GkLJIIIZ.LJIIIIZZ("message_type", str5);
        c2344009GkLJIIIZ.LJIIIIZZ("original_message_type", str6);
        c2344009GkLJIIIZ.LJIIIIZZ("sticker_id", str7);
        c2344009GkLJIIIZ.LJIIIIZZ("sticker_set_name", str8);
        c2344009GkLJIIIZ.LJIIIIZZ("sticker_type", str9);
        c2344009GkLJIIIZ.LJIIIIZZ("photo_type", str10);
        c2344009GkLJIIIZ.LIZJ(Intrinsics.LJFF(bool2, bool3) ? 1 : 0, "is_tako_comment");
        c2344009GkLJIIIZ.LJFF("is_at_tako", str11);
        LJJJ(c2344009GkLJIIIZ, "tap_comment");
    }

    public static void LJZ(String str, String str2, Aweme aweme, Comment comment, boolean z, Comment comment2, String str3, Boolean bool, FypExposedCommentMobParams fypExposedCommentMobParams, String str4, String str5, String str6, Boolean bool2, Integer num, CommentResponse commentResponse, Integer num2, Boolean bool3, String str7, String str8, C1347730lAx c1347730lAx, String str9, int i, String str10, String str11) {
        String aid;
        String authorUid;
        String cid;
        String uid;
        String noticeIdForComment;
        long commentCount;
        int iIntValue;
        String str12;
        int i2;
        boolean z2;
        String str13;
        String sortTags;
        AwemeStatistics statistics;
        String uri;
        List<CommentImageStruct> imageList;
        CommentImageStruct commentImageStruct;
        UrlModel originUrl;
        String sortTags2;
        User author;
        AwemeStatistics statistics2;
        AwemeStatistics statistics3;
        CommentSurprise commentSurprise;
        Object obj;
        Object obj2;
        Object obj3;
        AwemeStatistics statistics4;
        Activity activityLIZIZ;
        int i3;
        C18T4 c18t4LJI;
        Boolean boolLIZLLL;
        String str14;
        String authorUid2;
        String string;
        String id;
        Integer stickerType;
        Long setId;
        String str15;
        User user;
        String str16 = str9;
        C2344009Gk c2344009Gk = new C2344009Gk();
        Boolean bool4 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool2, bool4);
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009Gk.LJIIIIZZ("direct_replied_comment_id", cid);
        if (comment != null && (user = comment.getUser()) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009Gk.LJIIIIZZ("direct_replied_comment_author_uid", uid);
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        c2344009Gk.LJFF("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "screen_split");
        }
        if (comment2 != null) {
            c2344009Gk.LJIIIIZZ("comment_id", comment2.getCid());
            c2344009Gk.LIZJ(comment2.getRethinkPopType(), "success_type");
            c2344009Gk.LJIIIIZZ("original_text", comment2.getOriginalText());
            c2344009Gk.LJIIIIZZ("edited_text", comment2.getText());
            c2344009Gk.LIZJ(Intrinsics.LJFF(bool, bool4) ? 1 : 0, "is_guide_user_reply_cmt");
            if (aweme != null) {
                authorUid2 = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid2 = null;
            }
            c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid2) ? 1 : 0, "is_video_author");
            c2344009Gk.LIZJ(zLJFF ? 1 : 0, "is_from_keyboard");
            if (C123100dR.LIZ(str3)) {
                c2344009Gk.LJFF("session_id", str3);
            }
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                LIZ.getClass();
                LIZLLL(c2344009Gk, fypExposedCommentMobParams, str);
            }
            String str17 = "static";
            if (str16 == null && (c1347730lAx == null || (str16 = c1347730lAx.LJIILIIL) == null)) {
                str16 = "static";
            }
            c2344009Gk.LJIIIIZZ("sub_photo_type", str16);
            if (c1347730lAx != null && (str15 = c1347730lAx.LJIILJJIL) != null) {
                str17 = str15;
            }
            c2344009Gk.LJFF("ori_sub_photo_type", str17);
            String strLIZ = C1350750lFp.LIZ(comment2);
            if (!C123100dR.LIZ(strLIZ)) {
                strLIZ = "text_comment";
            }
            c2344009Gk.LJFF("message_type", strLIZ);
            CommentStickerStruct stickerStruct = comment2.getStickerStruct();
            if (stickerStruct != null && (setId = stickerStruct.getSetId()) != null) {
                string = setId.toString();
            } else {
                string = null;
            }
            if (C123100dR.LIZ(string)) {
                c2344009Gk.LJFF("sticker_set_name", string);
            }
            CommentStickerStruct stickerStruct2 = comment2.getStickerStruct();
            if (stickerStruct2 != null) {
                id = stickerStruct2.getId();
            } else {
                id = null;
            }
            if (C123100dR.LIZ(id)) {
                c2344009Gk.LJFF("sticker_id", id);
            }
            CommentStickerStruct stickerStruct3 = comment2.getStickerStruct();
            if (stickerStruct3 != null) {
                stickerType = stickerStruct3.getStickerType();
            } else {
                stickerType = null;
            }
            String strLJIIIIZZ = C454000HrC.LJIIIIZZ(stickerType);
            if (C123100dR.LIZ(strLJIIIIZZ)) {
                c2344009Gk.LJFF("sticker_type", strLJIIIIZZ);
            }
        }
        if (c1347730lAx != null) {
            if (C1345630l7Z.LIZ(str3) == 1) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c2344009Gk.LIZJ(i3, "is_visual_poet");
            if (C1345630l7Z.LIZ(str3) == 1) {
                if (c1347730lAx.LIZ) {
                    str14 = "success";
                } else {
                    str14 = "fail";
                }
                c2344009Gk.LJFF("vp_status", str14);
            }
            c2344009Gk.LJFF("photo_type", c1347730lAx.LIZJ);
            c2344009Gk.LJFF("preload_image_status", c1347730lAx.LIZLLL);
            c2344009Gk.LIZJ(c1347730lAx.LJ, "upload_image_status");
            C1347720lAw.LJ(c2344009Gk);
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (c18t4LJI = iAiChatFeatureService.LJI()) != null && (boolLIZLLL = c18t4LJI.LIZLLL()) != null) {
                c2344009Gk.LIZJ(boolLIZLLL.booleanValue() ? 1 : 0, "is_vp_new_user");
            } else {
                c2344009Gk.LJFF("is_vp_new_user", "");
            }
            c2344009Gk.LJFF("ai_generate_model", c1347730lAx.LJII);
            c2344009Gk.LJFF("ai_intention_model", c1347730lAx.LJIIIIZZ);
            c2344009Gk.LJFF("vp_task_id", c1347730lAx.LJFF);
            Integer num3 = c1347730lAx.LJIIJJI;
            if (num3 != null) {
                c2344009Gk.LIZJ(num3.intValue(), "is_history_photo");
            }
            Integer num4 = c1347730lAx.LJIIL;
            if (num4 != null) {
                c2344009Gk.LIZJ(num4.intValue(), "is_vp_generate_result_show");
            }
        }
        if (str5 != null) {
            c2344009Gk.LJFF("quick_comment_action_type", str5);
        }
        if (str4 != null) {
            c2344009Gk.LJFF("account_type", str4);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null) {
            noticeIdForComment = C0SUC.LIZ(activityLIZIZ).getNoticeIdForComment();
        } else {
            noticeIdForComment = null;
        }
        if (C123100dR.LIZ(str6)) {
            noticeIdForComment = str6;
        }
        if (C123100dR.LIZ(noticeIdForComment)) {
            c2344009Gk.LJFF("content_id", noticeIdForComment);
        }
        c2344009Gk.LJFF(Scene.SCENE_SERVICE, LJJIIJZLJL(aweme, str, Intrinsics.LJFF("click_quick_panel", str2)));
        if (aweme != null && (statistics4 = aweme.getStatistics()) != null) {
            commentCount = statistics4.getCommentCount();
        } else {
            commentCount = 0;
        }
        c2344009Gk.LIZLLL(commentCount, "visible_comment_cnt");
        if (commentResponse != null && (commentSurprise = commentResponse.commentSurprise) != null) {
            SurpriseResource surpriseResource = commentSurprise.surpriseResource;
            if (surpriseResource != null) {
                obj = surpriseResource.effectId;
            } else {
                obj = null;
            }
            c2344009Gk.LJ(obj, "easter_egg_id");
            SurpriseResource surpriseResource2 = commentSurprise.surpriseResource;
            if (surpriseResource2 != null) {
                obj2 = surpriseResource2.activityId;
            } else {
                obj2 = null;
            }
            c2344009Gk.LJ(obj2, "activity_id");
            SurpriseResource surpriseResource3 = commentSurprise.surpriseResource;
            if (surpriseResource3 != null) {
                obj3 = surpriseResource3.surpriseType;
            } else {
                obj3 = null;
            }
            c2344009Gk.LJ(obj3, "easter_egg_type");
            c2344009Gk.LJFF("keyword", commentSurprise.keyword);
        }
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        c2344009Gk.LIZJ(iIntValue, "is_photo_contained");
        if (aweme == null || (statistics3 = aweme.getStatistics()) == null || statistics3.getCommentCount() <= 0) {
            if (C296070Bj3.LIZIZ()) {
                str12 = "fallback";
            } else if (C296070Bj3.LIZ()) {
                str12 = "incentive";
            } else {
                str12 = "no";
            }
            c2344009Gk.LJFF("zero_comment_prompt_type", str12);
        }
        c2344009Gk.LJFF("cmt_input_pos", str8);
        if (aweme != null && (statistics2 = aweme.getStatistics()) != null && statistics2.getCommentCount() > 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        c2344009Gk.LIZJ(i2, "is_zero_comment");
        C1357130lQ7.LIZIZ(c2344009Gk, "post_comment_finish", C0SUC.LIZ(C2214201BlK.LJFF()).getInboxLogExtra());
        if (aweme != null && (author = aweme.getAuthor()) != null && author.isEnabledFilterAllComments()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str18 = "1";
        if (z2) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_filterall", str13);
        c2344009Gk.LJII(C1ER1.LIZIZ.LJJJJL());
        if (Intrinsics.LJFF(bool3, bool4)) {
            c2344009Gk.LIZJ(1, "is_internal_image_comment");
        }
        if (comment != null) {
            sortTags = comment.getSortTags();
        } else {
            sortTags = null;
        }
        if (C123100dR.LIZ(sortTags)) {
            if (comment != null) {
                sortTags2 = comment.getSortTags();
            } else {
                sortTags2 = null;
            }
            c2344009Gk.LJFF("sort_tags", sortTags2);
        }
        if (C123100dR.LIZ(C1381730m3n.LIZ(aweme))) {
            C1341320l0c.LIZ(c2344009Gk, "photo_content_type", C1381730m3n.LIZ(aweme));
            if (comment2 != null && (imageList = comment2.getImageList()) != null && (commentImageStruct = (CommentImageStruct) C13LP.LJJJLL(imageList)) != null && (originUrl = commentImageStruct.getOriginUrl()) != null) {
                uri = originUrl.getUri();
            } else {
                uri = null;
            }
            C1341320l0c.LIZ(c2344009Gk, "photo_url", uri);
        }
        c2344009Gk.LJ(Boolean.valueOf(C1EE1.LIZIZ.LJJIII()), "if_default");
        c2344009Gk.LJFF("sticker_source", str7);
        if (aweme != null && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() > 0) {
            str18 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("is_zero_comment", str18);
        LIZIZ(c2344009Gk, comment2);
        c2344009Gk.LJFF("cmt_input_pos", str8);
        c2344009Gk.LIZJ(i, "is_poll_card_show");
        if (str10 != null && str10.length() > 0) {
            c2344009Gk.LJFF("post_method", str10);
        }
        if (str11 != null) {
            c2344009Gk.LJFF("is_include_quick_mention", str11);
        }
        LJJJ(c2344009Gk, "post_comment_finish");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034e A[PHI: r13
      0x034e: PHI (r13v2 java.lang.String) = (r13v1 java.lang.String), (r13v6 java.lang.String) binds: [B:122:0x034a, B:66:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05c9 A[LOOP:1: B:224:0x05c3->B:226:0x05c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0861 A[LOOP:2: B:336:0x085b->B:338:0x0861, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x09c7  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0b57  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0b8e  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0bbe  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0c42  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0cf5  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0d2f  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0d72  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0d93  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0dad  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x04b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b4  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v87 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJLLLLLL(com.ss.android.ugc.aweme.comment.model.CommentContextSource r34, java.lang.CharSequence r35, int r36, com.ss.android.ugc.aweme.comment.model.Comment r37, com.ss.android.ugc.aweme.comment.model.Comment r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.Boolean r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, java.util.List<com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan> r46, java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> r47, java.lang.Integer r48, boolean r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, long r55, java.util.Map<java.lang.String, java.lang.String> r57, java.lang.Boolean r58, java.lang.Boolean r59, java.lang.String r60, X.C1347730lAx r61, java.util.Map<java.lang.String, java.lang.String> r62, boolean r63, java.lang.Long r64, java.lang.Float r65, int r66, java.lang.String r67, java.lang.String r68) {
        /*
            Method dump skipped, instruction units count: 3517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1350920lG6.LJLLLLLL(com.ss.android.ugc.aweme.comment.model.CommentContextSource, java.lang.CharSequence, int, com.ss.android.ugc.aweme.comment.model.Comment, com.ss.android.ugc.aweme.comment.model.Comment, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.Integer, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.util.Map, java.lang.Boolean, java.lang.Boolean, java.lang.String, X.0lAx, java.util.Map, boolean, java.lang.Long, java.lang.Float, int, java.lang.String, java.lang.String):void");
    }
}
