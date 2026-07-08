package X;

import android.content.Context;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS0S3310000_6;

/* JADX INFO: renamed from: X.0mD5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387490mD5 {
    public static final boolean LIZIZ(Aweme aweme) {
        int awemeType = aweme.getAwemeType();
        if (awemeType == 41 || awemeType == 43 || LIZLLL(aweme)) {
            return false;
        }
        C735280Sso.LIZ.getClass();
        if (!(!C735280Sso.LJFF(aweme))) {
            return false;
        }
        C1376270luz.LIZ.getClass();
        if (!C1376270luz.LIZ() || !C1376270luz.LIZLLL()) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(long j) {
        if ((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j <= 86400) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        boolean z;
        C735280Sso.LIZ.getClass();
        boolean zLJFF = C735280Sso.LJFF(aweme);
        if (aweme.getAuthor() != null && C2093608Ic.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), aweme.getAuthor().getUid())) {
            z = true;
        } else {
            z = false;
        }
        if (zLJFF && z) {
            return true;
        }
        return false;
    }

    public static final void LJI(Aweme aweme) {
        String uid;
        boolean z;
        C2241008qG c2241008qG = new C2241008qG();
        User author = aweme.getAuthor();
        if (author == null || (uid = author.getUid()) == null) {
            uid = "";
        }
        c2241008qG.LIZ.put("author_id", uid);
        if (aweme.getVideo() == null) {
            z = true;
        } else {
            z = false;
        }
        c2241008qG.LIZ.put("video_is_null", Boolean.valueOf(z));
        C794240VDq.LIZJ("aweme_video_author_info_unmatch", c2241008qG.LJ());
    }

    public static final boolean LIZ(Context context, Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
        if (statusSafety != null && !statusSafety.isAllowShare()) {
            if (statusSafety.isInReviewing() && statusSafety.isSelfSee()) {
                C1233040iBy c1233040iBy = new C1233040iBy(context);
                c1233040iBy.LIZIZ(2131850553);
                c1233040iBy.LIZLLL();
                return false;
            }
            if (AwemeExtKt.isAdTraffic(aweme)) {
                C1233040iBy c1233040iBy2 = new C1233040iBy(context);
                c1233040iBy2.LIZIZ(2131824731);
                c1233040iBy2.LIZLLL();
                return false;
            }
            C1233040iBy c1233040iBy3 = new C1233040iBy(context);
            c1233040iBy3.LIZIZ(2131858575);
            c1233040iBy3.LIZLLL();
            return false;
        }
        return true;
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
    public static final void LJ(Aweme aweme, String str, String str2, String str3, String str4) {
        long playCount;
        int i;
        C19651011uW c19651011uW = C19651011uW.LIZIZ;
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("panel_source", str2);
        c2344009Gk.LJIIIIZZ("impr_id", str3);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        if (C729510SjV.LJJIJIL(aweme)) {
            c2344009Gk.LJFF("story_collection_id", C729510SjV.LJII(aweme));
        }
        c2344009Gk.LIZJ(C729510SjV.LJJ(aweme) ? 1 : 0, "is_story");
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        c2344009Gk.LIZLLL(playCount, "item_vv");
        c2344009Gk.LIZJ(aweme.getRetryType(), "retry_type");
        long createTime = aweme.getCreateTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        int i2 = 1;
        if (((jCurrentTimeMillis / j) - createTime) / ((long) 60) <= 30) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_30min_delete");
        c2344009Gk.LIZLLL((System.currentTimeMillis() / j) - aweme.getCreateTime(), "interval_from_post");
        c2344009Gk.LIZJ(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        C2344009Gk c2344009Gk2 = (C2344009Gk) c19651011uW.LJIIIZ(aweme, c2344009Gk);
        c2344009Gk2.getClass();
        c2344009Gk2.LJIIIIZZ("tab_name", str4);
        c2344009Gk2.LIZJ(LIZJ(aweme.getCreateTime()) ? 1 : 0, "is_post_in_24h");
        if (C298650BnD.LIZ()) {
            if (!aweme.isSubOnlyVideo() || !AwemeExtKt.isPhotoMode(aweme)) {
                i2 = 0;
            }
            c2344009Gk2.LIZJ(i2, "is_sub_only_photo");
        }
        if (C298640BnC.LIZ()) {
            c2344009Gk2.LIZJ(C1447940nma.LIZIZ(aweme), "preview_photo_cnt");
        }
        c2344009Gk2.LIZJ(aweme.getAwemeType(), "aweme_type");
        C548590LfN.LIZ.getClass();
        C548590LfN.LIZJ().LJII(c2344009Gk2, aweme);
        C20684815ws.LJIILLIIL("click_delete_video", c2344009Gk2.LIZ);
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
    public static void LJFF(boolean z, Aweme aweme, String str, String str2, String str3, String str4, int i) {
        long playCount;
        int i2;
        String str5;
        int i3;
        if ((i & 128) != 0) {
            str4 = "";
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(aweme));
        c2344009Gk.LJIIIIZZ("impr_id", str3);
        int i4 = 1;
        c2344009Gk.LIZJ(1, "is_from_edit_tab");
        c2344009Gk.LJIIIIZZ("click_position", str4);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme, c2344009Gk);
        C1609930rzr.LJIIJJI(aweme, c2344009Gk);
        C1609930rzr.LJIIIIZZ(aweme, c2344009Gk);
        if (C729510SjV.LJJIJIL(aweme)) {
            c2344009Gk.LJFF("story_collection_id", C729510SjV.LJII(aweme));
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        c2344009Gk.LIZLLL(playCount, "item_vv");
        c2344009Gk.LIZJ(aweme.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        c2344009Gk.LJIIIIZZ("tab_name", str2);
        c2344009Gk.LIZJ(LIZJ(aweme.getCreateTime()) ? 1 : 0, "is_post_in_24h");
        if (C591970NJr.LIZIZ().LIZIZ(aweme)) {
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo == null || (str5 = nowPostInfo.nowMediaType) == null) {
                str5 = "post";
            }
            c2344009Gk.LJFF("now_type", str5);
            AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
            if (statusSafety != null && statusSafety.getReviewStatus() == 1) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            c2344009Gk.LIZJ(i3, "is_review_failed");
        }
        if (z) {
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            c2344009Gk.LIZJ(aweme.getRetryType(), "retry_type");
            if (((System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - aweme.getCreateTime()) / ((long) 60) <= 30) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            c2344009Gk.LIZJ(i2, "is_30min_delete");
            c2344009Gk.LIZJ(0, "is_posted_draft");
            Object objLJIIIZ = c19651011uW.LJIIIZ(aweme, c2344009Gk);
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            C2344009Gk c2344009Gk2 = (C2344009Gk) objLJIIIZ;
            if (C298650BnD.LIZ()) {
                if (!aweme.isSubOnlyVideo() || !AwemeExtKt.isPhotoMode(aweme)) {
                    i4 = 0;
                }
                c2344009Gk2.LIZJ(i4, "is_sub_only_photo");
            }
            if (C298640BnC.LIZ()) {
                c2344009Gk2.LIZJ(C1447940nma.LIZIZ(aweme), "preview_photo_cnt");
            }
            C548590LfN.LIZ.getClass();
            C548590LfN.LIZJ().LJII(c2344009Gk, aweme);
            C20684815ws.LJIILLIIL("confirm_delete_video", c2344009Gk.LIZ);
            return;
        }
        C20684815ws.LJIILLIIL("cancel_delete_video", c2344009Gk.LIZ);
    }

    public static final void LJII(Context context, C0HTT<C737030Svd> c0htt, Aweme aweme, String str, String str2, String str3, boolean z, Function0<Unit> function0) {
        int i;
        if (C729510SjV.LJJ(aweme)) {
            i = 2131830546;
        } else {
            i = 2131830531;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(i);
        if (z) {
            c1397580mTM.LJFF(2131844940);
            i = 2131844939;
        }
        c1397580mTM.LIZ(i);
        C985403tE.LIZ(c1397580mTM, new AwS0S3310000_6(c0htt, aweme, z, function0, str, str2, str3, 0));
        c1397580mTM.LJ(AFwS259S0000000_21.get$arr$(335));
        c1397580mTM.LIZLLL(AFwS259S0000000_21.get$arr$(336));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void LJIIIZ(Context context, C0HTT c0htt, Aweme aweme, String str, String str2, String str3, boolean z, Function0 function0, Function0 function02) {
        C054G c054gLIZIZ = C2296808zG.LIZIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c054gLIZIZ, C2107308Nj.LIZ.LLIILII(), null, new C1387510mD7(aweme, z, context, c0htt, str, str2, str3, function0, function02, null), 2);
    }

    public static void LJIIIIZZ(Context context, Aweme aweme, C0HTT c0htt, String str, String str2, String str3, String str4, Function0 function0, Function0 function02, int i) {
        Function0 function03 = function0;
        String str5 = str3;
        String str6 = str2;
        Function0 function04 = function02;
        String str7 = str;
        String str8 = "";
        if ((i & 8) != 0) {
            str7 = "";
        }
        if ((i & 16) != 0) {
            str6 = "";
        }
        if ((i & 32) != 0) {
            str5 = "";
        }
        if ((i & 64) == 0) {
            str8 = str4;
        }
        if ((i & 128) != 0) {
            function03 = null;
        }
        if ((i & 1024) != 0) {
            function04 = null;
        }
        ComplianceServiceProvider.LJI().LJJJJLL(aweme, new C1387580mDE(context, c0htt, aweme, str7, str6, str5, str8, function03, function04, null));
    }

    public static final void LJIIJ(C0HTT<C737030Svd> c0htt, Aweme aweme, boolean z, String str, String str2, String str3, Function0<Unit> function0, IExternalService iExternalService, AwemeDraft awemeDraft, String str4) {
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, aweme);
            c737030Svd.LJIJ = Boolean.valueOf(z);
            c0htt.LLIIL(c737030Svd);
        }
        LJFF(true, aweme, str, str2, str3, str4, 96);
        if (function0 != null) {
            function0.invoke();
        }
        if (awemeDraft != null) {
            iExternalService.draftService().deletePostedDraft(awemeDraft);
        }
    }
}
