package Y;

import X.AnonymousClass1192;
import X.C036E;
import X.C0N0Y;
import X.C0P0T;
import X.C0R60;
import X.C0T3Q;
import X.C119A;
import X.C119B;
import X.C1388190mED;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1483410ohn;
import X.C15O7;
import X.C1618440sDa;
import X.C19400510vD;
import X.C19400610vE;
import X.C19404210vo;
import X.C19404310vp;
import X.C19404410vq;
import X.C19404510vr;
import X.C19404610vs;
import X.C19582611jU;
import X.C19584111jj;
import X.C19584211jk;
import X.C19595911ld;
import X.C19597211lq;
import X.C19624911qJ;
import X.C19723912Ez;
import X.C19774412Yk;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2203211BKt;
import X.C2344009Gk;
import X.C259800zU;
import X.C451220Hmi;
import X.C561550M0r;
import X.C616460OFw;
import X.C705930RmZ;
import X.C828330WeV;
import X.InterfaceC828360WeY;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentPostStickerStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.urllink.model.LinkStickerStruct;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public class ACListenerS93S0300000_29 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        String str;
        String string;
        String string2;
        String string3;
        String str2;
        boolean zLJI = MethodIDManager.LJI(72105);
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS93S0300000_29.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = (C19EG) aCListenerS93S0300000_29.l1;
        c19582611jU.getClass();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C19582611jU.LIZJ((C705930RmZ) aCListenerS93S0300000_29.l2, 0);
                VideoReplyStruct videoReplyStruct = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
                if (videoReplyStruct != null) {
                    Comment comment = new Comment();
                    comment.setCollectStatus(0);
                    comment.setAwemeId(String.valueOf(videoReplyStruct.getAwemeId()));
                    comment.setCid(String.valueOf(videoReplyStruct.getCommentId()));
                    comment.setText(videoReplyStruct.getCommentMsg());
                    User user = new User();
                    user.setNickname(videoReplyStruct.getUserName());
                    user.setRemarkName(videoReplyStruct.getUserName());
                    user.setAvatarThumb(videoReplyStruct.getUserAvatar());
                    comment.setUser(user);
                    C1440005kM.LIZ(new C0T3Q(comment, null));
                }
                CommentService commentService = (CommentService) ServiceManager.get().getService(CommentService.class);
                C705930RmZ c705930RmZ = (C705930RmZ) aCListenerS93S0300000_29.l2;
                C0R60 c0r60 = c705930RmZ.LJIIZILJ;
                if (c0r60 == null || (str = c0r60.LIZ) == null) {
                    str = "";
                }
                VideoReplyStruct videoReplyStruct2 = c705930RmZ.LJIJ;
                if (videoReplyStruct2 == null || (string = Long.valueOf(videoReplyStruct2.getCommentId()).toString()) == null) {
                    string = "";
                }
                VideoReplyStruct videoReplyStruct3 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
                if (videoReplyStruct3 == null || (string2 = Long.valueOf(videoReplyStruct3.getCommentUserId()).toString()) == null) {
                    string2 = "";
                }
                VideoReplyStruct videoReplyStruct4 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
                if (videoReplyStruct4 == null || (string3 = Long.valueOf(videoReplyStruct4.getAwemeId()).toString()) == null) {
                    string3 = "";
                }
                C0R60 c0r602 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIIZILJ;
                if (c0r602 == null || (str2 = c0r602.LIZJ) == null) {
                    str2 = "";
                }
                commentService.LJLJJI(0, str, string, string2, string3, str2);
                VideoReplyStruct videoReplyStruct5 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
                if (videoReplyStruct5 != null) {
                    C19EG c19eg2 = (C19EG) aCListenerS93S0300000_29.l1;
                    C15O7<BaseResponse> c15o7LIZIZ = C616460OFw.LIZ.LIZIZ(String.valueOf(videoReplyStruct5.getCommentId()), 0);
                    if (c15o7LIZIZ != null) {
                        c15o7LIZIZ.LJ(new C19774412Yk(videoReplyStruct5, c19eg2, 1), C15O7.LJIIIIZZ, null);
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C19582611jU.LJII(2131837962, 0, 0, c19eg);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onClick$1(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        boolean zLIZIZ;
        String str;
        String string;
        String string2;
        String string3;
        String str2;
        boolean zLJI = MethodIDManager.LJI(72105);
        C0P0T c0p0t = (C0P0T) ((C259800zU) aCListenerS93S0300000_29.l0).element;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C19582611jU c19582611jU = C19582611jU.LIZ;
        C19EG c19eg = (C19EG) aCListenerS93S0300000_29.l1;
        c19582611jU.getClass();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C19582611jU.LJII(2131837962, 0, 0, c19eg);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C19582611jU.LIZJ((C705930RmZ) aCListenerS93S0300000_29.l2, 1);
        VideoReplyStruct videoReplyStruct = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
        if (videoReplyStruct != null) {
            Comment comment = new Comment();
            comment.setCollectStatus(1);
            comment.setAwemeId(String.valueOf(videoReplyStruct.getAwemeId()));
            comment.setCid(String.valueOf(videoReplyStruct.getCommentId()));
            comment.setText(videoReplyStruct.getCommentMsg());
            User user = new User();
            user.setNickname(videoReplyStruct.getUserName());
            user.setRemarkName(videoReplyStruct.getUserName());
            user.setAvatarThumb(videoReplyStruct.getUserAvatar());
            comment.setUser(user);
            C1440005kM.LIZ(new C0T3Q(comment, null));
        }
        CommentService commentService = (CommentService) ServiceManager.get().getService(CommentService.class);
        C705930RmZ c705930RmZ = (C705930RmZ) aCListenerS93S0300000_29.l2;
        C0R60 c0r60 = c705930RmZ.LJIIZILJ;
        String str3 = "";
        if (c0r60 == null || (str = c0r60.LIZ) == null) {
            str = "";
        }
        VideoReplyStruct videoReplyStruct2 = c705930RmZ.LJIJ;
        if (videoReplyStruct2 == null || (string = Long.valueOf(videoReplyStruct2.getCommentId()).toString()) == null) {
            string = "";
        }
        VideoReplyStruct videoReplyStruct3 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
        if (videoReplyStruct3 == null || (string2 = Long.valueOf(videoReplyStruct3.getCommentUserId()).toString()) == null) {
            string2 = "";
        }
        VideoReplyStruct videoReplyStruct4 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
        if (videoReplyStruct4 == null || (string3 = Long.valueOf(videoReplyStruct4.getAwemeId()).toString()) == null) {
            string3 = "";
        }
        C0R60 c0r602 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIIZILJ;
        if (c0r602 != null && (str2 = c0r602.LIZJ) != null) {
            str3 = str2;
        }
        commentService.LJLJJI(1, str, string, string2, string3, str3);
        VideoReplyStruct videoReplyStruct5 = ((C705930RmZ) aCListenerS93S0300000_29.l2).LJIJ;
        if (videoReplyStruct5 != null) {
            C19EG c19eg2 = (C19EG) aCListenerS93S0300000_29.l1;
            C15O7<BaseResponse> c15o7LIZIZ = C616460OFw.LIZ.LIZIZ(String.valueOf(videoReplyStruct5.getCommentId()), 1);
            if (c15o7LIZIZ != null) {
                c15o7LIZIZ.LJ(new C19774412Yk(videoReplyStruct5, c19eg2, 2), C15O7.LJIIIIZZ, null);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void onClick$10(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        Function1<View, Unit> itemClick = ((C19404510vr) aCListenerS93S0300000_29.l0).getItemClick();
        if (itemClick != null) {
            itemClick.invoke(view);
        }
        ((C19723912Ez) aCListenerS93S0300000_29.l1).LJIIJ.invoke((C19404310vp) aCListenerS93S0300000_29.l2);
    }

    public static final void onClick$11(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        User user = (User) aCListenerS93S0300000_29.l0;
        if (user != null) {
            C19624911qJ c19624911qJ = (C19624911qJ) aCListenerS93S0300000_29.l1;
            c19624911qJ.LIZLLL(c19624911qJ.getContext(), user, ((NewLiveRoomStruct) aCListenerS93S0300000_29.l2).id);
        }
    }

    public static final void onClick$12(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        User user = (User) aCListenerS93S0300000_29.l0;
        if (user != null) {
            C19624911qJ c19624911qJ = (C19624911qJ) aCListenerS93S0300000_29.l1;
            c19624911qJ.LIZLLL(c19624911qJ.getContext(), user, ((NewLiveRoomStruct) aCListenerS93S0300000_29.l2).id);
        }
    }

    public static final void onClick$13(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        String str;
        C0R60 c0r60;
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        float currentPosition = c0n0yLJLJJI.getCurrentPosition() / c0n0yLJLJJI.getDuration();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C451220Hmi) aCListenerS93S0300000_29.l0).LIZ, "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((CommentPostStickerStruct) aCListenerS93S0300000_29.l1).originalAwemeId);
        smartRouteBuildRoute.withParam("extra_seek_progress", currentPosition);
        smartRouteBuildRoute.withParam("comment_enter_method", "click_view_comment_post");
        C705930RmZ c705930RmZ = ((C19584111jj) aCListenerS93S0300000_29.l2).LIZJ;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("refer", str);
        smartRouteBuildRoute.withParam("cid", String.valueOf(((CommentPostStickerStruct) aCListenerS93S0300000_29.l1).originalCommentId));
        smartRouteBuildRoute.open();
        ((C19584111jj) aCListenerS93S0300000_29.l2).LJJI("click", (CommentPostStickerStruct) aCListenerS93S0300000_29.l1);
        C19584111jj c19584111jj = (C19584111jj) aCListenerS93S0300000_29.l2;
        HandlerHook.viewPost(c19584111jj.LJIIL, new ARunnableS129S0100000_29(c19584111jj, 228));
    }

    public static final void onClick$14(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        String str;
        C0R60 c0r60;
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        float currentPosition = c0n0yLJLJJI.getCurrentPosition() / c0n0yLJLJJI.getDuration();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C451220Hmi) aCListenerS93S0300000_29.l0).LIZ, "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((CommentPostStickerStruct) aCListenerS93S0300000_29.l1).originalAwemeId);
        smartRouteBuildRoute.withParam("extra_seek_progress", currentPosition);
        C705930RmZ c705930RmZ = ((C19584211jk) aCListenerS93S0300000_29.l2).LIZJ;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        smartRouteBuildRoute.withParam("refer", str);
        smartRouteBuildRoute.open();
        ((C19584211jk) aCListenerS93S0300000_29.l2).LJJI("click", (CommentPostStickerStruct) aCListenerS93S0300000_29.l1);
        C19584211jk c19584211jk = (C19584211jk) aCListenerS93S0300000_29.l2;
        HandlerHook.viewPost(c19584211jk.LJIIL, new ARunnableS129S0100000_29(c19584211jk, 230));
    }

    public static final void onClick$15(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        String str;
        C0R60 c0r60;
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        long currentPosition = c0n0yLJLJJI.getCurrentPosition();
        long duration = c0n0yLJLJJI.getDuration();
        ((C19595911ld) aCListenerS93S0300000_29.l0).getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((C451220Hmi) aCListenerS93S0300000_29.l2).LIZ, "//aweme/detail");
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, ((VideoShareInfoStruct) aCListenerS93S0300000_29.l1).awemeId);
        smartRouteBuildRoute.withParam("extra_seek_progress", currentPosition);
        smartRouteBuildRoute.withParam("extra_current_video_duration", duration);
        smartRouteBuildRoute.withParam("extra_current_played_duration", currentPosition);
        boolean z = true;
        smartRouteBuildRoute.withParam("extra_is_from_shared_story", true);
        smartRouteBuildRoute.withParam("extra_prev_panel_id", C1618440sDa.LIZIZ.LJIJJLI().LJIILL());
        smartRouteBuildRoute.withParam("story_to_post_photomode_index", ((VideoShareInfoStruct) aCListenerS93S0300000_29.l1).photomodeIndex);
        C705930RmZ c705930RmZ = ((C19595911ld) aCListenerS93S0300000_29.l0).LIZJ;
        if (c705930RmZ != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
            str = c0r60.LIZ;
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        smartRouteBuildRoute.withParam("enter_from", str);
        String aid = ((C19595911ld) aCListenerS93S0300000_29.l0).LJIIIZ.getAid();
        if (aid != null) {
            str2 = aid;
        }
        smartRouteBuildRoute.withParam("share_to_story_aid_of_story", str2);
        smartRouteBuildRoute.open();
        C19595911ld c19595911ld = (C19595911ld) aCListenerS93S0300000_29.l0;
        HandlerHook.viewPost(c19595911ld.LJIIJJI, new ARunnableS129S0100000_29(c19595911ld, 232));
        C19595911ld c19595911ld2 = (C19595911ld) aCListenerS93S0300000_29.l0;
        VideoShareInfoStruct videoShareInfoStruct = (VideoShareInfoStruct) aCListenerS93S0300000_29.l1;
        if (C2203211BKt.LIZ(c19595911ld2.LJIIIZ) == null) {
            z = false;
        }
        c19595911ld2.LJJI("click", videoShareInfoStruct, z);
    }

    public static final void onClick$2(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        Function1<View, Unit> function1 = ((C19400610vE) aCListenerS93S0300000_29.l0).LJFF;
        if (function1 != null) {
            function1.invoke(((C19400510vD) aCListenerS93S0300000_29.l1).itemView);
        }
        ((Function0) aCListenerS93S0300000_29.l2).invoke();
    }

    public static final void onClick$3(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        Function0<Boolean> function0 = ((C19400610vE) aCListenerS93S0300000_29.l0).LJ;
        boolean z = false;
        if (function0 != null && function0.invoke().booleanValue()) {
            return;
        }
        if (((C19400610vE) aCListenerS93S0300000_29.l0).LIZ.businessType == 109) {
            C561550M0r c561550M0r = C561550M0r.LIZ;
            C19EG c19eg = (C19EG) C1388190mED.LIZ(((C19400510vD) aCListenerS93S0300000_29.l1).itemView.getContext());
            c561550M0r.getClass();
            C561550M0r.LIZ(c19eg);
            return;
        }
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableToastCenter()) {
            z = true;
        }
        if (z) {
            C1389880mGw c1389880mGw = new C1389880mGw((View) aCListenerS93S0300000_29.l2);
            c1389880mGw.LJIIIIZZ(2131844929);
            c1389880mGw.LIZ(true);
            c1389880mGw.LJIIJ();
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx((View) aCListenerS93S0300000_29.l2);
        c1389890mGx.LJIIIZ(2131844929);
        c1389890mGx.LIZ(true);
        c1389890mGx.LJIIJJI();
    }

    public static final void onClick$4(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        ((TuxSheet) aCListenerS93S0300000_29.l0).dismiss();
        ((C19597211lq) aCListenerS93S0300000_29.l1).getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("click_result", "proceed");
        C20684815ws.LJIILLIIL("external_website_security_pop_up_window_click", c2344009Gk.LIZ);
        C19597211lq c19597211lq = (C19597211lq) aCListenerS93S0300000_29.l1;
        LinkStickerStruct urlLinkSticker = ((InteractStickerStruct) aCListenerS93S0300000_29.l2).getUrlLinkSticker();
        if (urlLinkSticker != null) {
            c19597211lq.getClass();
            String fullURL = urlLinkSticker.getFullURL();
            if (!u.LJJIIJZLJL(fullURL, "https://", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("https://");
                sbLIZ.append(fullURL);
                fullURL = C2188811AlT.LIZIZ(sbLIZ);
            }
            final String strLIZIZ = ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).LIZIZ(fullURL, "link_sticker");
            if (strLIZIZ != null) {
                try {
                    C828330WeV c828330WeV = new C828330WeV(new ThirdPartyBizCert(402665477));
                    Context context = c19597211lq.LL;
                    if (context != null) {
                        c828330WeV.LIZIZ(context, strLIZIZ, new InterfaceC828360WeY() { // from class: X.09fc
                            @Override // X.InterfaceC828360WeY
                            public final void LIZ(Context context2, String str) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                String str2 = strLIZIZ;
                                intent.addFlags(268435456);
                                intent.addCategory("android.intent.category.BROWSABLE");
                                C2429209fW.LIZ().appendDataFlowId(intent, 1207967489);
                                intent.setData(UriProtector.parse(str2));
                                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                                C1701330uNH.LIZ(intent, context2);
                                C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9bMiocYG7Tr2KulaM57YVThXYFZxik8bWn/uC1usnQ7J0PgNgT9Qrk=", null));
                            }
                        }, null);
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (ActivityNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void onClick$5(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        ((C119A) aCListenerS93S0300000_29.l0).LLILZ.setChecked(true);
        LiveEventModule liveEventModule = (LiveEventModule) aCListenerS93S0300000_29.l1;
        liveEventModule.LIZ = true;
        AnonymousClass1192 anonymousClass1192 = ((C119B) aCListenerS93S0300000_29.l2).LIZIZ;
        if (anonymousClass1192 != null) {
            anonymousClass1192.LLJJIJI(liveEventModule);
        }
    }

    public static final void onClick$6(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        Function1<View, Unit> itemClick = ((C19404410vq) aCListenerS93S0300000_29.l0).getItemClick();
        if (itemClick != null) {
            itemClick.invoke(view);
        }
        ((C19723912Ez) aCListenerS93S0300000_29.l1).LJIIJ.invoke((C19404310vp) aCListenerS93S0300000_29.l2);
    }

    public static final void onClick$7(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        ((C19723912Ez) aCListenerS93S0300000_29.l0).LJIIJ.invoke((C19404210vo) aCListenerS93S0300000_29.l1);
        Function1<View, Unit> itemClick = ((C19404610vs) aCListenerS93S0300000_29.l2).getItemClick();
        if (itemClick != null) {
            itemClick.invoke(view);
        }
    }

    public static final void onClick$8(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        Function1<View, Unit> itemClick = ((C19404610vs) aCListenerS93S0300000_29.l0).getItemClick();
        if (itemClick != null) {
            itemClick.invoke(view);
        }
        ((C19723912Ez) aCListenerS93S0300000_29.l1).LJIIJ.invoke((C19404310vp) aCListenerS93S0300000_29.l2);
    }

    public static final void onClick$9(ACListenerS93S0300000_29 aCListenerS93S0300000_29, View view) {
        ((C19723912Ez) aCListenerS93S0300000_29.l0).LJIIJ.invoke((C19404210vo) aCListenerS93S0300000_29.l1);
        Function1<View, Unit> itemClick = ((C19404510vr) aCListenerS93S0300000_29.l2).getItemClick();
        if (itemClick != null) {
            itemClick.invoke(view);
        }
    }

    public ACListenerS93S0300000_29(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
