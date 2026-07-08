package Y;

import X.C036E;
import X.C0HD5;
import X.C0NB9;
import X.C0OBG;
import X.C0P0T;
import X.C0QQT;
import X.C0T1L;
import X.C118300cf;
import X.C1336205Ku;
import X.C1350920lG6;
import X.C1354570lLz;
import X.C1354590lM1;
import X.C1354620lM4;
import X.C1365870leD;
import X.C1368450liN;
import X.C1372270loX;
import X.C1381010m2d;
import X.C1381020m2e;
import X.C1385060m9A;
import X.C1389890mGx;
import X.C1395850mQZ;
import X.C1395870mQb;
import X.C197039127h;
import X.C2201941BFw;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C473380IhM;
import X.C623130OcJ;
import X.C735370Ssx;
import X.C786410Ut5;
import X.EnumC255700yp;
import X.InterfaceC1384330m7z;
import X.InterfaceC1395860mQa;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.DanmakuLandscapePresentAssem;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssemV2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.model.IDanmakuData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailFragment;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.otherpage.sheet.TakoSheetFragment;
import com.ss.android.ugc.aweme.tako.ui.TakoChatFragment;
import com.ss.android.ugc.tiktok.anchor.StickerAnchorMaker;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS86S0300000_21 implements View.OnClickListener {
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
            case 16:
                onClick$16(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) aCListenerS86S0300000_21.l1;
                IDanmakuData iDanmakuData = (IDanmakuData) aCListenerS86S0300000_21.l2;
                danmakuPresentAssem.Ip().xQ2(iDanmakuData, EnumC255700yp.IS_NOT_LANDSCAPE);
                InterfaceC1384330m7z interfaceC1384330m7z = danmakuPresentAssem.LLLFF;
                if (interfaceC1384330m7z != null) {
                    interfaceC1384330m7z.LJJIJIIJIL(1004, iDanmakuData.getData(), null);
                }
                iDanmakuData.LIZ(false);
                C1385060m9A c1385060m9A = danmakuPresentAssem.LLJZ;
                if (c1385060m9A != null) {
                    c1385060m9A.invalidate();
                }
                C0P0T c0p0t = ((DanmakuPresentAssem) aCListenerS86S0300000_21.l1).LLLII;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(((DanmakuPresentAssem) aCListenerS86S0300000_21.l1).LJJIJL());
        c1389890mGx.LJIIIZ(2131829435);
        c1389890mGx.LJIIJJI();
    }

    public static final void onClick$1(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        CommentEventModel eventModel;
        CommentEventModel eventModel2;
        C118300cf c118300cf = (C118300cf) aCListenerS86S0300000_21.l0;
        if (c118300cf.element <= 0) {
            c118300cf.element = ((ViewGroup) aCListenerS86S0300000_21.l1).getHeight();
        }
        DefaultCommentPageContainerFragment defaultCommentPageContainerFragment = (DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2;
        if (!defaultCommentPageContainerFragment.LLLFFI) {
            defaultCommentPageContainerFragment.LLLFFI = true;
            TuxIconView tuxIconView = defaultCommentPageContainerFragment.LLLFZ;
            if (tuxIconView != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_collapse;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
                tuxIconView.setTuxIcon(c419910GdJ);
            }
            int height = ((ViewGroup) aCListenerS86S0300000_21.l1).getHeight();
            ValueAnimator duration = ValueAnimator.ofInt(height, ((Number) C473380IhM.LIZ(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).getActivity()).getSecond()).intValue() - C0HD5.LIZ((ViewGroup) aCListenerS86S0300000_21.l1, 8)).setDuration(200L);
            duration.addUpdateListener(new AUListenerS59S0201000_21(height, (ViewGroup) aCListenerS86S0300000_21.l1, (DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2, 0));
            DefaultCommentPageContainerFragment defaultCommentPageContainerFragment2 = (DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2;
            defaultCommentPageContainerFragment2.getClass();
            duration.addListener(new AAListenerS332S0100000_21(defaultCommentPageContainerFragment2, 22));
            duration.start();
            CommentContextSource commentContextSourceGL = ((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).GL();
            if (commentContextSourceGL != null && (eventModel2 = commentContextSourceGL.getEventModel()) != null) {
                eventModel2.setSplitPercent(9);
            }
            C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
            String strEnterFrom = CommentContextSourceKt.enterFrom(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).gS());
            String strEnterMethod = CommentContextSourceKt.enterMethod(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).gS());
            Aweme aweme = CommentContextSourceKt.aweme(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).gS());
            c1350920lG6.getClass();
            C1350920lG6.LJJIJIIJI(9, aweme, strEnterFrom, strEnterMethod);
            C0QQT c0qqtHS = ((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).hS();
            if (c0qqtHS != null) {
                c0qqtHS.L9(true);
                return;
            }
            return;
        }
        defaultCommentPageContainerFragment.LLLFFI = false;
        TuxIconView tuxIconView2 = defaultCommentPageContainerFragment.LLLFZ;
        if (tuxIconView2 != null) {
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_chevron_expand;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView2.setTuxIcon(c419910GdJ2);
        }
        int height2 = ((ViewGroup) aCListenerS86S0300000_21.l1).getHeight();
        ValueAnimator duration2 = ValueAnimator.ofInt(height2, ((C118300cf) aCListenerS86S0300000_21.l0).element).setDuration(200L);
        duration2.addUpdateListener(new AUListenerS59S0201000_21(height2, (ViewGroup) aCListenerS86S0300000_21.l1, (DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2, 1));
        DefaultCommentPageContainerFragment defaultCommentPageContainerFragment3 = (DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2;
        defaultCommentPageContainerFragment3.getClass();
        duration2.addListener(new AAListenerS332S0100000_21(defaultCommentPageContainerFragment3, 22));
        duration2.start();
        CommentContextSource commentContextSourceGL2 = ((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).GL();
        if (commentContextSourceGL2 != null && (eventModel = commentContextSourceGL2.getEventModel()) != null) {
            eventModel.setSplitPercent(6);
        }
        C1350920lG6 c1350920lG62 = C1350920lG6.LIZ;
        String strEnterFrom2 = CommentContextSourceKt.enterFrom(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).gS());
        String strEnterMethod2 = CommentContextSourceKt.enterMethod(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).gS());
        Aweme aweme2 = CommentContextSourceKt.aweme(((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).gS());
        c1350920lG62.getClass();
        C1350920lG6.LJJIJIIJI(6, aweme2, strEnterFrom2, strEnterMethod2);
        C0QQT c0qqtHS2 = ((DefaultCommentPageContainerFragment) aCListenerS86S0300000_21.l2).hS();
        if (c0qqtHS2 == null) {
            return;
        }
        c0qqtHS2.L9(false);
    }

    public static final void onClick$10(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        IIMService iIMServiceLIZ = C1336205Ku.LIZ(false);
        if (iIMServiceLIZ != null) {
            String str = "long_press";
            if (!Intrinsics.LJFF("long_press", ((C1365870leD) aCListenerS86S0300000_21.l0).LJFF)) {
                str = "share_toast";
            }
            if (((C1365870leD) aCListenerS86S0300000_21.l0).LIZJ) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", ((C1365870leD) aCListenerS86S0300000_21.l0).LJ, bundle);
                C786410Ut5.LJJJI("enter_method", "share_toast", bundle);
                iIMServiceLIZ.getImChatService().LJIIL(view.getContext(), bundle, false, null);
            } else {
                IIMChatService imChatService = iIMServiceLIZ.getImChatService();
                EnterChatParams enterChatParams = new EnterChatParams(view.getContext(), ((C1365870leD) aCListenerS86S0300000_21.l0).LIZ);
                C1365870leD c1365870leD = (C1365870leD) aCListenerS86S0300000_21.l0;
                Aweme aweme = (Aweme) aCListenerS86S0300000_21.l2;
                enterChatParams.setEnterFromForMob(c1365870leD.LJ);
                enterChatParams.setEnterMethodForMob(str);
                enterChatParams.setEnterFrom(6);
                enterChatParams.setAuthorId(C735370Ssx.LIZLLL(aweme));
                enterChatParams.setGroupId(C735370Ssx.LIZJ(aweme));
                enterChatParams.setQuickChat(true);
                imChatService.LJIILLIIL(enterChatParams, null);
            }
        }
        C1381010m2d c1381010m2d = C1381010m2d.LIZ;
        C1381020m2e c1381020m2e = (C1381020m2e) aCListenerS86S0300000_21.l1;
        c1381010m2d.getClass();
        C1381010m2d.LIZ(c1381020m2e);
    }

    public static final void onClick$11(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        if (((C1365870leD) aCListenerS86S0300000_21.l0).LIZJ) {
            IIMChatService iIMChatService = (IIMChatService) ((TakoChatFragment) aCListenerS86S0300000_21.l1).LLLIIIL.getValue();
            if (iIMChatService != null) {
                Context context = (Context) aCListenerS86S0300000_21.l2;
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", ((C1365870leD) aCListenerS86S0300000_21.l0).LJ, bundle);
                C786410Ut5.LJJJI("enter_method", "share_toast", bundle);
                iIMChatService.LJIIL(context, bundle, true, null);
                return;
            }
            return;
        }
        EnterChatParams enterChatParams = new EnterChatParams(view.getContext(), ((C1365870leD) aCListenerS86S0300000_21.l0).LIZ);
        enterChatParams.setEnterFromForMob(((C1365870leD) aCListenerS86S0300000_21.l0).LJ);
        enterChatParams.setEnterMethodForMob("share_toast");
        enterChatParams.setEnterFrom(6);
        enterChatParams.setQuickChat(true);
        IIMChatService iIMChatService2 = (IIMChatService) ((TakoChatFragment) aCListenerS86S0300000_21.l1).LLLIIIL.getValue();
        if (iIMChatService2 == null) {
            return;
        }
        iIMChatService2.LJIILLIIL(enterChatParams, null);
    }

    public static final void onClick$12(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        C2201941BFw c2201941BFw = IMUser.Companion;
        User user = (User) aCListenerS86S0300000_21.l0;
        c2201941BFw.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(((VideoRelationBtnAssem) aCListenerS86S0300000_21.l1).getContext(), C2201941BFw.LIZJ(user));
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS86S0300000_21.l2;
        enterChatParams.setQuickChat(true);
        enterChatParams.setEnterFrom(6);
        enterChatParams.setEnterFromForMob(videoItemParams.mEventType);
        enterChatParams.setEnterMethodForMob("maf_video");
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
    }

    public static final void onClick$13(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        C2201941BFw c2201941BFw = IMUser.Companion;
        User user = (User) aCListenerS86S0300000_21.l0;
        c2201941BFw.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(((VideoRelationBtnAssemV2) aCListenerS86S0300000_21.l1).getContext(), C2201941BFw.LIZJ(user));
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS86S0300000_21.l2;
        enterChatParams.setQuickChat(true);
        enterChatParams.setEnterFrom(6);
        enterChatParams.setEnterFromForMob(videoItemParams.mEventType);
        enterChatParams.setEnterMethodForMob("maf_video");
        C1336205Ku.LIZ(false).getImChatService().LJIILLIIL(enterChatParams, null);
    }

    public static final void onClick$14(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        C786410Ut5.LJLLLLLL(8, (View) aCListenerS86S0300000_21.l0);
        ((Keva) C1372270loX.LIZ.getValue()).storeInt("key_play_tip_show_count", Integer.MAX_VALUE);
        C0NB9.LIZ(new C623130OcJ((BaseSharePackage) aCListenerS86S0300000_21.l1, ((Aweme) aCListenerS86S0300000_21.l2).getAid(), "click_exit_icon"), "share_panel_redesign_toast");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$15(Y.ACListenerS86S0300000_21 r9, android.view.View r10) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS86S0300000_21.onClick$15(Y.ACListenerS86S0300000_21, android.view.View):void");
    }

    public static final void onClick$16(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        if (((C1365870leD) aCListenerS86S0300000_21.l0).LIZJ) {
            ((TakoSheetFragment) aCListenerS86S0300000_21.l1).ts2();
            IIMChatService iIMChatService = (IIMChatService) ((TakoSheetFragment) aCListenerS86S0300000_21.l1).LLLIIIL.getValue();
            if (iIMChatService != null) {
                Context context = (Context) aCListenerS86S0300000_21.l2;
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", ((C1365870leD) aCListenerS86S0300000_21.l0).LJ, bundle);
                C786410Ut5.LJJJI("enter_method", "share_toast", bundle);
                iIMChatService.LJIIL(context, bundle, true, null);
                return;
            }
            return;
        }
        EnterChatParams enterChatParams = new EnterChatParams(view.getContext(), ((C1365870leD) aCListenerS86S0300000_21.l0).LIZ);
        enterChatParams.setEnterFromForMob(((C1365870leD) aCListenerS86S0300000_21.l0).LJ);
        enterChatParams.setEnterMethodForMob("share_toast");
        enterChatParams.setEnterFrom(6);
        enterChatParams.setQuickChat(true);
        IIMChatService iIMChatService2 = (IIMChatService) ((TakoSheetFragment) aCListenerS86S0300000_21.l1).LLLIIIL.getValue();
        if (iIMChatService2 == null) {
            return;
        }
        iIMChatService2.LJIILLIIL(enterChatParams, null);
    }

    public static final void onClick$2(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                DanmakuLandscapePresentAssem danmakuLandscapePresentAssem = (DanmakuLandscapePresentAssem) aCListenerS86S0300000_21.l1;
                IDanmakuData iDanmakuData = (IDanmakuData) aCListenerS86S0300000_21.l2;
                danmakuLandscapePresentAssem.Fp().xQ2(iDanmakuData, danmakuLandscapePresentAssem.Qp());
                InterfaceC1384330m7z interfaceC1384330m7z = danmakuLandscapePresentAssem.LLLI;
                if (interfaceC1384330m7z != null) {
                    interfaceC1384330m7z.LJJIJIIJIL(1004, iDanmakuData.getData(), null);
                }
                iDanmakuData.LIZ(false);
                C1385060m9A c1385060m9A = danmakuLandscapePresentAssem.LLLFZ;
                if (c1385060m9A != null) {
                    c1385060m9A.invalidate();
                }
                C0P0T c0p0t = ((DanmakuLandscapePresentAssem) aCListenerS86S0300000_21.l1).LLLILZLLLI;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(((DanmakuLandscapePresentAssem) aCListenerS86S0300000_21.l1).LJJIJL());
        c1389890mGx.LJIIIZ(2131829435);
        c1389890mGx.LJIIJJI();
    }

    public static final void onClick$3(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        Aweme awemeLJIIZILJ;
        if (C0T1L.LIZ().effectPageEnable && (awemeLJIIZILJ = ((StickerAnchorMaker) aCListenerS86S0300000_21.l0).LJIIZILJ()) != null && (!awemeLJIIZILJ.isAd())) {
            C786410Ut5.LIZIZ((Dialog) aCListenerS86S0300000_21.l1);
        }
        if (!C0OBG.LIZIZ(view)) {
            ((StickerAnchorMaker) aCListenerS86S0300000_21.l0).LJJJLL(view, (C2344009Gk) aCListenerS86S0300000_21.l2);
        }
    }

    public static final void onClick$4(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        ((InterfaceC1395860mQa) aCListenerS86S0300000_21.l0).LIZIZ(((C1395850mQZ) aCListenerS86S0300000_21.l1).LIZ);
        ((C1395870mQb) aCListenerS86S0300000_21.l2).LJ();
    }

    public static final void onClick$5(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        if (C0OBG.LIZ(200L, (C197039127h) aCListenerS86S0300000_21.l0)) {
            return;
        }
        C1368450liN c1368450liN = (C1368450liN) aCListenerS86S0300000_21.l1;
        C197039127h c197039127h = (C197039127h) aCListenerS86S0300000_21.l0;
        c1368450liN.P5(c197039127h, c197039127h.getContext(), (IMContact) aCListenerS86S0300000_21.l2);
    }

    public static final void onClick$6(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        if (C0OBG.LIZ(200L, (C197039127h) aCListenerS86S0300000_21.l0)) {
            return;
        }
        ((C1368450liN) aCListenerS86S0300000_21.l1).R5((C197039127h) aCListenerS86S0300000_21.l0, (IMContact) aCListenerS86S0300000_21.l2);
        C1368450liN c1368450liN = (C1368450liN) aCListenerS86S0300000_21.l1;
        C197039127h c197039127h = (C197039127h) aCListenerS86S0300000_21.l0;
        IMContact iMContact = (IMContact) aCListenerS86S0300000_21.l2;
        c1368450liN.getClass();
        c197039127h.setText(c197039127h.getContext().getString(2131836997));
        c197039127h.setButtonVariant(1);
        C786410Ut5.U8(c197039127h, new ACListenerS86S0300000_21(c197039127h, c1368450liN, iMContact, 5));
    }

    public static final void onClick$7(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        if (((C1365870leD) aCListenerS86S0300000_21.l0).LIZJ) {
            IIMChatService iIMChatService = (IIMChatService) ((SeriesDetailFragment) aCListenerS86S0300000_21.l1).LLJJIJI.getValue();
            if (iIMChatService != null) {
                Context context = (Context) aCListenerS86S0300000_21.l2;
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("enter_from", ((C1365870leD) aCListenerS86S0300000_21.l0).LJ, bundle);
                C786410Ut5.LJJJI("enter_method", "share_toast", bundle);
                iIMChatService.LJIIL(context, bundle, true, null);
                return;
            }
            return;
        }
        EnterChatParams enterChatParams = new EnterChatParams(view.getContext(), ((C1365870leD) aCListenerS86S0300000_21.l0).LIZ);
        enterChatParams.setEnterFromForMob(((C1365870leD) aCListenerS86S0300000_21.l0).LJ);
        enterChatParams.setEnterMethodForMob("share_toast");
        enterChatParams.setEnterFrom(6);
        enterChatParams.setQuickChat(false);
        IIMChatService iIMChatService2 = (IIMChatService) ((SeriesDetailFragment) aCListenerS86S0300000_21.l1).LLJJIJI.getValue();
        if (iIMChatService2 == null) {
            return;
        }
        iIMChatService2.LJIILLIIL(enterChatParams, null);
    }

    public static final void onClick$8(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        ((C1354620lM4) aCListenerS86S0300000_21.l0).LIZ.invoke((Bitmap) aCListenerS86S0300000_21.l1, Boolean.TRUE);
        ((C1354570lLz) aCListenerS86S0300000_21.l2).getCancelButtonFromXml().performClick();
        C1354590lM1.LIZ("story");
    }

    public static final void onClick$9(ACListenerS86S0300000_21 aCListenerS86S0300000_21, View view) {
        ((C1354620lM4) aCListenerS86S0300000_21.l0).LIZ.invoke((Bitmap) aCListenerS86S0300000_21.l1, Boolean.FALSE);
        ((C1354570lLz) aCListenerS86S0300000_21.l2).getCancelButtonFromXml().performClick();
        C1354590lM1.LIZ("post");
    }

    public ACListenerS86S0300000_21(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
