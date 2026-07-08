package Y;

import X.AbstractC1585810rMx;
import X.C013C;
import X.C01GW;
import X.C07TP;
import X.C0BX3;
import X.C0RD4;
import X.C0S3B;
import X.C0S3L;
import X.C0S3Q;
import X.C0S3R;
import X.C0S3S;
import X.C0S3V;
import X.C0S3W;
import X.C0SNV;
import X.C0SOM;
import X.C0SOP;
import X.C0SPB;
import X.C0SQR;
import X.C0SQW;
import X.C0SQX;
import X.C0SRL;
import X.C0SRX;
import X.C0SRZ;
import X.C0SSR;
import X.C0SSX;
import X.C0SSZ;
import X.C0SU0;
import X.C0SU4;
import X.C0SU5;
import X.C0SX4;
import X.C0TU9;
import X.C10EU;
import X.C118300cf;
import X.C1350920lG6;
import X.C1389890mGx;
import X.C1440005kM;
import X.C1483410ohn;
import X.C1558520qew;
import X.C16F4;
import X.C1ER1;
import X.C20600815jK;
import X.C20737116Cr;
import X.C2097608Jq;
import X.C21599719g3;
import X.C2183561Ad0;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C2487409ou;
import X.C265940AbY;
import X.C281470B1l;
import X.C584080MvW;
import X.C584760Mwc;
import X.C631370Opb;
import X.C709340Rs4;
import X.C715040S3a;
import X.C715060S3c;
import X.C715070S3d;
import X.C715120S3i;
import X.C721130SQl;
import X.C721190SQr;
import X.C721250SQx;
import X.C722590SWb;
import X.C722910SXh;
import X.C735740StY;
import X.C735840Sti;
import X.C786410Ut5;
import X.EnumC721170SQp;
import X.EnumC725960Sdm;
import X.InterfaceC1210210hb9;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.InterfaceC737440SwI;
import X.RunnableC514801zW;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.BottomFriendsV3DetailStoryDMAssem;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.collab.CollabInFeedLabelAssem;
import com.ss.android.ugc.aweme.feed.assem.live.LiveNoticeCTAButtonAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.aweme.tako.mob.TakoAIVideoMobFiller;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import com.ss.android.ugc.aweme.ui.assem.feed.CollabFeedTagAssem;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoNumIndicatorAssem;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeProfileWrapperFragment;
import com.ss.android.ugc.aweme.ui.view.PostModeActionBarComponentV2;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaSizeMobComponent;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import com.ss.android.ugc.feed.platform.panel.earphone.IEarphonePlayerControlComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS11S0100002_11;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AObserverS215S0100000_11 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
            case 47:
                onChanged$47(this, obj);
                break;
            case 48:
                onChanged$48(this, obj);
                break;
            case 49:
                onChanged$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onChanged$50(this, obj);
                break;
            case 51:
                onChanged$51(this, obj);
                break;
            case 52:
                onChanged$52(this, obj);
                break;
            case 53:
                onChanged$53(this, obj);
                break;
            case 54:
                onChanged$54(this, obj);
                break;
            case 55:
                onChanged$55(this, obj);
                break;
            case 56:
                onChanged$56(this, obj);
                break;
            case 57:
                onChanged$57(this, obj);
                break;
            case 58:
                onChanged$58(this, obj);
                break;
            case 59:
                onChanged$59(this, obj);
                break;
            case 60:
                onChanged$60(this, obj);
                break;
        }
    }

    public AObserverS215S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        String aid;
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            BottomFriendsV3DetailStoryDMAssem bottomFriendsV3DetailStoryDMAssem = (BottomFriendsV3DetailStoryDMAssem) aObserverS215S0100000_11.l0;
            bottomFriendsV3DetailStoryDMAssem.getClass();
            String aid2 = aweme.getAid();
            Aweme aweme2 = bottomFriendsV3DetailStoryDMAssem.LLJILLL;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(aid2, aid) && bottomFriendsV3DetailStoryDMAssem.LLJILLL != null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onAwemeBind aid=");
            sbLIZ.append(aweme.getAid());
            C2188811AlT.LIZIZ(sbLIZ);
            bottomFriendsV3DetailStoryDMAssem.LLJILLL = aweme;
            bottomFriendsV3DetailStoryDMAssem.LLJJI = false;
            bottomFriendsV3DetailStoryDMAssem.LLJJIJIIJIL = null;
            bottomFriendsV3DetailStoryDMAssem.So();
        }
    }

    public static final void onChanged$1(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        String userId;
        FollowStatus followStatus = (FollowStatus) obj;
        Aweme aweme = ((BottomFriendsV3DetailStoryDMAssem) aObserverS215S0100000_11.l0).LLJILLL;
        if (aweme != null && (userId = followStatus.getUserId()) != null && Intrinsics.LJFF(userId, AwemeExtKt.getAuthorUid(aweme))) {
            ((BottomFriendsV3DetailStoryDMAssem) aObserverS215S0100000_11.l0).So();
        }
    }

    public static final void onChanged$10(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Boolean bool = (Boolean) obj;
        Boolean value = ((PostModePageViewModel) aObserverS215S0100000_11.l0).xQ2().getValue();
        if (bool.booleanValue() && !Intrinsics.LJFF(bool, value) && Intrinsics.LJFF(((PostModePageViewModel) aObserverS215S0100000_11.l0).LLJZ.getValue(), Boolean.TRUE)) {
            ((PostModePageViewModel) aObserverS215S0100000_11.l0).xQ2().setValue(bool);
        }
    }

    public static final void onChanged$11(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Boolean bool = (Boolean) obj;
        Boolean value = ((PostModePageViewModel) aObserverS215S0100000_11.l0).xQ2().getValue();
        if (bool.booleanValue() && !Intrinsics.LJFF(bool, value) && Intrinsics.LJFF(((PostModePageViewModel) aObserverS215S0100000_11.l0).LLJLLL.getValue(), Boolean.TRUE)) {
            ((PostModePageViewModel) aObserverS215S0100000_11.l0).xQ2().setValue(bool);
        }
    }

    public static final void onChanged$12(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            num.intValue();
            C01GW c01gw = C709340Rs4.LIZ;
            C709340Rs4.LIZIZ(new ARunnableS80S0200000_11((InteractAreaSizeMobComponent) aObserverS215S0100000_11.l0, num, 27));
        }
    }

    public static final void onChanged$13(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C21599719g3 c21599719g3Mo34LLLIIIIL = ((C0SRZ) aObserverS215S0100000_11.l0).mo34LLLIIIIL();
        if (c21599719g3Mo34LLLIIIIL != null) {
            c21599719g3Mo34LLLIIIIL.LLFFF(0, true);
        }
    }

    public static final void onChanged$14(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0SSR c0ssrLLLIIIIL = ((C0SRZ) aObserverS215S0100000_11.l0).LLLIIIIL();
        if (c0ssrLLLIIIIL != null) {
            c0ssrLLLIIIIL.LLLLZLLIL = zBooleanValue;
        }
    }

    public static final void onChanged$15(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        InterfaceC1210210hb9 interfaceC1210210hb9 = (InterfaceC1210210hb9) obj;
        C0SSR c0ssrLLLIIIIL = ((C0SRZ) aObserverS215S0100000_11.l0).LLLIIIIL();
        if (c0ssrLLLIIIIL != null) {
            c0ssrLLLIIIIL.LLLLZLLLI = interfaceC1210210hb9;
        }
    }

    public static final void onChanged$16(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Boolean bool = (Boolean) obj;
        PostModeCommentListFragmentV2 postModeCommentListFragmentV2 = (PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0;
        C0SU0 c0su0 = postModeCommentListFragmentV2.LLJILJIL;
        if (c0su0 != null) {
            HandlerHook.viewRemoveCallbacks(c0su0, postModeCommentListFragmentV2.LLJL);
        }
        if (bool.booleanValue()) {
            C0SU0 c0su02 = ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).LLJILJIL;
            if ((c0su02 instanceof C0SU0) && c0su02 != null) {
                c0su02.LLJILJILJ = false;
                return;
            }
            return;
        }
        if (c0su0 != null) {
            HandlerHook.viewPostDelay(c0su0, ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).LLJL, 100L);
            return;
        }
        C0SU0 c0su03 = ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).LLJILJIL;
        if (!(c0su03 instanceof C0SU0) || c0su03 == null) {
            return;
        }
        c0su03.LLJILJILJ = true;
    }

    public static final void onChanged$17(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        PostModeActionBarComponentV2 postModeActionBarComponentV2 = ((PostModeDetailFragment) aObserverS215S0100000_11.l0).LLJJIJIL;
        if (postModeActionBarComponentV2 != null) {
            PostModeActionBarComponentV2.LJIIZILJ(postModeActionBarComponentV2, null, null, null, null, 15);
        }
    }

    public static final void onChanged$18(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKAd0;
        List<InterfaceC1891350zJl> listLJII;
        String authorUid;
        Integer numValueOf;
        String str;
        CommentCommonModel commonModel;
        User author;
        ICommentListAssemAbility iCommentListAssemAbility = (ICommentListAssemAbility) ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).LLJJJJLIIL.getValue();
        if (iCommentListAssemAbility != null && (c20600815jKAd0 = iCommentListAssemAbility.ad0()) != null && (listLJII = c20600815jKAd0.LJII()) != null) {
            PostModeCommentListFragmentV2 postModeCommentListFragmentV2 = (PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0;
            if (!postModeCommentListFragmentV2.LLIZ) {
                postModeCommentListFragmentV2.LLJJ.setTempEnterMethod("click_actionbar");
            }
            C721190SQr c721190SQr = C721190SQr.LIZ;
            Aweme aweme = postModeCommentListFragmentV2.LLJJJJJIL;
            PostModeDetailParams postModeDetailParams = postModeCommentListFragmentV2.LLILZLL;
            c721190SQr.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C721190SQr.LIZJ(c2344009Gk, postModeDetailParams);
            c2344009Gk.LJFF("enter_method", "click_actionbar");
            C721190SQr.LJ(c2344009Gk, aweme);
            C721190SQr.LIZIZ(c2344009Gk, aweme);
            C721190SQr.LIZLLL(c721190SQr, c2344009Gk);
            C721190SQr.LIZ(c2344009Gk, aweme);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            c2344009Gk.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                numValueOf = Integer.valueOf(author.getFollowStatus());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "follow_status");
            C1ER1 c1er1 = C1ER1.LIZIZ;
            if (postModeDetailParams != null) {
                str = postModeDetailParams.eventType;
            } else {
                str = null;
            }
            c2344009Gk.LJII(c1er1.I(aweme, str));
            C721190SQr.LJJI(new RunnableC514801zW(c2344009Gk, 76));
            if (!postModeCommentListFragmentV2.LLIZ) {
                postModeCommentListFragmentV2.LLJJ.setTempEnterMethod("click_actionbar");
                CommentContextSource commentContextSourceGL = postModeCommentListFragmentV2.GL();
                if (commentContextSourceGL != null && (commonModel = commentContextSourceGL.getCommonModel()) != null) {
                    commonModel.setTempEnterMethod(postModeCommentListFragmentV2.LLJJ.getTempEnterMethod());
                }
                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                CommentContextSource commentContextSourceGL2 = postModeCommentListFragmentV2.GL();
                c1350920lG6.getClass();
                C1350920lG6.LJLJL(commentContextSourceGL2, null);
                postModeCommentListFragmentV2.LLIZ = true;
            }
            postModeCommentListFragmentV2.hS(listLJII);
        }
    }

    public static final void onChanged$19(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        PostModeActionBarComponentV2 postModeActionBarComponentV2;
        C2183561Ad0 c2183561Ad0;
        if (Intrinsics.LJFF(obj, Boolean.TRUE) && (postModeActionBarComponentV2 = ((PostModeDetailFragment) aObserverS215S0100000_11.l0).LLJJIJIL) != null && (c2183561Ad0 = postModeActionBarComponentV2.LLJ) != null) {
            c2183561Ad0.i0();
        }
    }

    public static final void onChanged$2(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            if (Intrinsics.LJFF(aweme.getAid(), ((VideoItemParams) C631370Opb.LIZ((CollabInFeedLabelAssem) aObserverS215S0100000_11.l0)).getAweme().getAid())) {
                ((CollabInFeedLabelAssem) aObserverS215S0100000_11.l0).Ep(aweme);
            }
        }
    }

    public static final void onChanged$20(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((PostModeDetailFragment) aObserverS215S0100000_11.l0).cS(true);
    }

    public static final void onChanged$21(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Aweme aweme;
        Map<? extends String, ? extends String> mapLJ;
        Long l;
        String str;
        PostModePageViewModel postModePageViewModel;
        PostModeDetailParams postModeDetailParams;
        PostModeDetailParams postModeDetailParams2;
        PostModeDetailParams postModeDetailParams3;
        PostModePageViewModel postModePageViewModel2;
        PostModePageViewModel postModePageViewModel3;
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 0) {
            PostModeDetailFragment postModeDetailFragment = (PostModeDetailFragment) aObserverS215S0100000_11.l0;
            postModeDetailFragment.getClass();
            postModeDetailFragment.LLILLL = System.currentTimeMillis();
            C0SQX c0sqx = ((PostModeDetailFragment) aObserverS215S0100000_11.l0).SJ().LL;
            c0sqx.getClass();
            c0sqx.LIZ = Long.valueOf(System.currentTimeMillis());
            C0SRL c0srl = ((PostModeDetailFragment) aObserverS215S0100000_11.l0).LLJILJIL;
            if (c0srl != null && (postModePageViewModel3 = c0srl.LJIIIIZZ) != null) {
                postModePageViewModel3.LLJLILLLLZIIL.setValue(Boolean.FALSE);
                return;
            }
            return;
        }
        ((PostModeDetailFragment) aObserverS215S0100000_11.l0).PR();
        ((PostModeDetailFragment) aObserverS215S0100000_11.l0).cS(false);
        PostModeDetailFragment postModeDetailFragment2 = (PostModeDetailFragment) aObserverS215S0100000_11.l0;
        postModeDetailFragment2.LLJJL = false;
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModelSJ = postModeDetailFragment2.SJ();
        PostModeDetailFragment postModeDetailFragment3 = (PostModeDetailFragment) aObserverS215S0100000_11.l0;
        C0SRL c0srl2 = postModeDetailFragment3.LLJILJIL;
        String str2 = null;
        if (c0srl2 != null) {
            aweme = c0srl2.LIZJ;
        } else {
            aweme = null;
        }
        EnumC721170SQp enumC721170SQp = EnumC721170SQp.VIEW_PAGER_PAGE_CHANGE;
        HashMap<String, String> map = new HashMap<>();
        C0SRL c0srl3 = postModeDetailFragment3.LLJILJIL;
        if (c0srl3 == null || (postModePageViewModel2 = c0srl3.LJIIIIZZ) == null || (mapLJ = C2097608Jq.LJIIZILJ(postModePageViewModel2.wQ2())) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        map.putAll(mapLJ);
        C0SRL c0srl4 = postModeDetailFragment3.LLJILJIL;
        if (c0srl4 != null && (postModeDetailParams3 = c0srl4.LJII) != null) {
            l = postModeDetailParams3.exploreTabId;
        } else {
            l = null;
        }
        map.put("explore_topic_id", String.valueOf(l));
        C0SRL c0srl5 = postModeDetailFragment3.LLJILJIL;
        if (c0srl5 != null && (postModeDetailParams2 = c0srl5.LJII) != null) {
            str = postModeDetailParams2.exploreTabName;
        } else {
            str = null;
        }
        map.put("explore_topic", String.valueOf(str));
        C0SRL c0srl6 = postModeDetailFragment3.LLJILJIL;
        if (c0srl6 != null && (postModeDetailParams = c0srl6.LJII) != null) {
            str2 = postModeDetailParams.fromExplorePage;
        }
        map.put("from_explore_page", String.valueOf(str2));
        postModeTimeLoggerViewModelSJ.wQ2(aweme, enumC721170SQp, false, map);
        C0SRL c0srl7 = ((PostModeDetailFragment) aObserverS215S0100000_11.l0).LLJILJIL;
        if (c0srl7 == null || (postModePageViewModel = c0srl7.LJIIIIZZ) == null) {
            return;
        }
        postModePageViewModel.LLJLILLLLZIIL.setValue(Boolean.TRUE);
    }

    public static final void onChanged$22(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0SU0 c0su0;
        Boolean bool = (Boolean) obj;
        PostModeCommentListFragmentV2 postModeCommentListFragmentV2 = (PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0;
        C0SU0 c0su02 = postModeCommentListFragmentV2.LLJILJIL;
        if (c0su02 instanceof C0SU0) {
            c0su0 = c0su02;
        } else {
            c0su0 = null;
        }
        if (c0su0 != null) {
            c0su0.LLJILJILJ = true;
        }
        final PostModePageViewModel postModePageViewModelDR = postModeCommentListFragmentV2.DR();
        final AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0, 1326);
        final AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0, 1327);
        final C721250SQx c721250SQx = new C721250SQx(((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).DR());
        final C722590SWb c722590SWb = new C722590SWb((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0);
        final AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0, 1328);
        final AwS555S0100000_11 awS555S0100000_114 = new AwS555S0100000_11((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0, 1329);
        final C118300cf c118300cf = new C118300cf();
        final C013C c013c = new C013C();
        c013c.element = true;
        final C013C c013c2 = new C013C();
        c013c2.element = true;
        AbstractC1585810rMx abstractC1585810rMx = new AbstractC1585810rMx() { // from class: X.0SWY
            @Override // X.AbstractC1585810rMx
            public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                LinearLayoutManager linearLayoutManager;
                LinearLayoutManager linearLayoutManager2;
                Integer numValueOf;
                if (i == 0 && i2 == 0) {
                    return;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    linearLayoutManager = (LinearLayoutManager) layoutManager;
                } else {
                    linearLayoutManager = null;
                }
                boolean z = false;
                if (linearLayoutManager != null) {
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    Function0<Unit> function0 = awS555S0100000_11;
                    Function0<Unit> function02 = awS555S0100000_112;
                    C118300cf c118300cf2 = c118300cf;
                    PostModePageViewModel postModePageViewModel = postModePageViewModelDR;
                    Function0<Unit> function03 = awS555S0100000_113;
                    Function0<Unit> function04 = awS555S0100000_114;
                    AbstractC21673619ry adapter = recyclerView.getAdapter();
                    if (adapter != null && adapter.getItemCount() == 1) {
                        if (recyclerView.canScrollVertically(-1)) {
                            function0.invoke();
                        } else {
                            function02.invoke();
                        }
                    } else {
                        if (iFindLastVisibleItemPosition > 0) {
                            if (iFindLastVisibleItemPosition != c118300cf2.element) {
                                function0.invoke();
                            }
                            postModePageViewModel.LLJJ.setValue(Unit.LIZ);
                            if (iFindLastVisibleItemPosition > 1) {
                                if (iFindLastVisibleItemPosition != c118300cf2.element) {
                                    function03.invoke();
                                }
                            }
                            c118300cf2.element = iFindLastVisibleItemPosition;
                        } else if (iFindLastVisibleItemPosition != c118300cf2.element) {
                            function02.invoke();
                        }
                        if (iFindLastVisibleItemPosition != c118300cf2.element) {
                            function04.invoke();
                        }
                        c118300cf2.element = iFindLastVisibleItemPosition;
                    }
                }
                RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null && (numValueOf = Integer.valueOf(linearLayoutManager2.findFirstVisibleItemPosition())) != null && numValueOf.intValue() == 0) {
                    C013C c013c3 = c013c2;
                    if (!c013c3.element) {
                        c013c3.element = true;
                        Function1<Boolean, Unit> function1 = c722590SWb;
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                    }
                    if (C344590Df7.LIZ(recyclerView) >= 0.5f) {
                        z = true;
                    }
                    C013C c013c4 = c013c;
                    if (z != c013c4.element) {
                        c013c4.element = z;
                        Function1<Boolean, Unit> function12 = c721250SQx;
                        if (function12 != null) {
                            function12.invoke(Boolean.valueOf(z));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C013C c013c5 = c013c2;
                if (!c013c5.element) {
                    return;
                }
                c013c5.element = false;
                Function1<Boolean, Unit> function13 = c722590SWb;
                if (function13 == null) {
                    return;
                }
                function13.invoke(Boolean.FALSE);
            }
        };
        AsS38S0100000_11 asS38S0100000_11 = new AsS38S0100000_11(postModePageViewModelDR, 2);
        if (c0su02 != null) {
            c0su02.addOnScrollListener(abstractC1585810rMx);
            c0su02.addOnScrollListener(asS38S0100000_11);
        }
        ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).DR().zQ2(true);
        ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).iS(true);
        ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).nS();
        PostModeCommentListFragmentV2 postModeCommentListFragmentV22 = (PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0;
        bool.booleanValue();
        postModeCommentListFragmentV22.getClass();
        ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).mS();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$23(Y.AObserverS215S0100000_11 r29, java.lang.Object r30) {
        /*
            r4 = r29
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2 r1 = (com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2) r1
            boolean r0 = r1.LLIZ
            r12 = 0
            if (r0 == 0) goto L94
            X.0lDx r0 = r1.LLJJIJIIJIL
            r0.LJ()
            java.lang.Object r5 = r4.l0
            com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2 r5 = (com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2) r5
            java.lang.String r11 = "leave_detail_page"
            X.0lDx r0 = r5.LLJJIJIIJIL
            long r9 = r0.LIZ()
            X.0lDx r0 = r5.LLJJIJIIJIL
            long r2 = r0.LIZLLL
            long r13 = r0.LIZIZ(r9)
            boolean r0 = X.C292460BdE.LIZ()
            if (r0 == 0) goto Lc5
            com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM r0 = r5.VR()
            X.0SWn r6 = r0.LLILZ
            long r15 = r6.LJFF
            java.util.Set<java.lang.String> r0 = r6.LJIIIIZZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lbc
            r7 = 0
        L3c:
            long r15 = r15 + r7
            r6.LJFF = r15
            X.01GW r0 = X.AnonymousClass0761.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L58
            long r15 = r15 - r2
            r6 = 0
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 > 0) goto Lc5
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 > 0) goto Lc5
        L58:
            boolean r0 = X.C286390BKj.LIZ()
            if (r0 == 0) goto Lb9
            X.0Q7z r0 = X.C1558360qeg.LJFF(r5, r12)
            com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility r0 = X.C1345760l7m.LIZLLL(r5, r0)
            if (r0 == 0) goto Lb9
            X.0l3S r17 = r0.Ki2()
        L6c:
            boolean r0 = r5.LLJJJIL
            if (r0 == 0) goto La9
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r5)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0HD6 r18 = new X.0HD6
            r6 = r18
            r19 = r5
            r20 = r9
            r22 = r11
            r23 = r13
            r25 = r15
            r27 = r17
            r28 = r2
            r30 = r12
            r18.<init>(r19, r20, r22, r23, r25, r27, r28, r30)
            r2 = 2
            X.0956 r0 = X.C23250099c.LIZLLL(r1, r0, r12, r6, r2)
            r5.LLJJIJI = r0
        L94:
            X.0lCN r1 = X.C1348610lCN.LIZ
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2 r0 = (com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLJJJJJIL
            if (r0 == 0) goto La2
            java.lang.String r12 = r0.getAid()
        La2:
            r1.getClass()
            X.C1348610lCN.LIZ(r12)
            return
        La9:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r8 = r5.GL()
            r18 = 0
            r24 = 1304(0x518, float:1.827E-42)
            r20 = r2
            r22 = r18
            X.C1350920lG6.LJJLIIIJLJLI(r8, r9, r11, r12, r13, r15, r17, r18, r20, r22, r24)
            goto L94
        Lb9:
            r17 = r12
            goto L6c
        Lbc:
            long r7 = java.lang.System.currentTimeMillis()
            long r0 = r6.LJI
            long r7 = r7 - r0
            goto L3c
        Lc5:
            r15 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS215S0100000_11.onChanged$23(Y.AObserverS215S0100000_11, java.lang.Object):void");
    }

    public static final void onChanged$24(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 0) {
            ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).VR().RI0(EnumC725960Sdm.RESUME);
        } else {
            ((PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0).VR().RI0(EnumC725960Sdm.STOP);
        }
    }

    public static final void onChanged$25(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C721190SQr c721190SQr = C721190SQr.LIZ;
            PostModeCommentListFragmentV2 postModeCommentListFragmentV2 = (PostModeCommentListFragmentV2) aObserverS215S0100000_11.l0;
            Aweme aweme = postModeCommentListFragmentV2.LLJJJJJIL;
            PostModeDetailParams postModeDetailParams = postModeCommentListFragmentV2.LLILZLL;
            c721190SQr.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C721190SQr.LJ(c2344009Gk, aweme);
            C721190SQr.LJIIJ(c2344009Gk, aweme);
            C721190SQr.LIZ(c2344009Gk, aweme);
            C721190SQr.LIZIZ(c2344009Gk, aweme);
            C721190SQr.LJII(c2344009Gk, aweme);
            C721190SQr.LIZJ(c2344009Gk, postModeDetailParams);
            C721190SQr.LIZIZ(c2344009Gk, aweme);
            C721190SQr.LJII(c2344009Gk, aweme);
            c2344009Gk.LJFF("enter_method", "down");
            c2344009Gk.LJFF("from_page", "graphic_detail");
            C721190SQr.LJJI(new RunnableC514801zW(c2344009Gk, 49));
        }
    }

    public static final void onChanged$26(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0S3B) aObserverS215S0100000_11.l0).LJIIIIZZ();
    }

    public static final void onChanged$27(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        DetailFragment detailFragment = (DetailFragment) aObserverS215S0100000_11.l0;
        detailFragment.getClass();
        if ("on_ear_phone_unplug".equals(obj)) {
            if (C1483410ohn.LJLJJI().isPlaying()) {
                C1483410ohn.LJLJJI().LIZ();
                C584080MvW.LIZIZ(detailFragment.LLJI, "play", detailFragment.getFrom());
            } else {
                C584080MvW.LIZIZ(detailFragment.LLJI, "pause", detailFragment.getFrom());
            }
        }
    }

    public static final void onChanged$28(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        StoryGalleryListViewModel storyGalleryListViewModel = (StoryGalleryListViewModel) aObserverS215S0100000_11.l0;
        storyGalleryListViewModel.setState(new AwS377S0200000_11(storyGalleryListViewModel, (C0RD4) obj, 105));
    }

    public static final void onChanged$29(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        StoryGalleryListViewModel storyGalleryListViewModel = (StoryGalleryListViewModel) aObserverS215S0100000_11.l0;
        storyGalleryListViewModel.setState(new AwS590S0100000_11(storyGalleryListViewModel, 418));
    }

    public static final void onChanged$3(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        String aid;
        obj.getClass();
        Aweme aweme = C0SU5.LIZLLL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, ((VideoItemParams) C631370Opb.LIZ((LiveNoticeCTAButtonAssem) aObserverS215S0100000_11.l0)).getAweme().getAid()) && C0SU5.LIZIZ == 1) {
            ((LiveNoticeCTAButtonAssem) aObserverS215S0100000_11.l0).Gp("save");
        }
    }

    public static final void onChanged$30(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        StoryGalleryListViewModel storyGalleryListViewModel = (StoryGalleryListViewModel) aObserverS215S0100000_11.l0;
        storyGalleryListViewModel.setState(new AwS590S0100000_11(storyGalleryListViewModel, 419));
    }

    public static final void onChanged$31(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        BaseListFragmentPanel baseListFragmentPanel = (BaseListFragmentPanel) aObserverS215S0100000_11.l0;
        baseListFragmentPanel.getClass();
        if ("on_ear_phone_unplug".equals(obj)) {
            if (baseListFragmentPanel.getPlayerManager().isPlaying()) {
                if (C0BX3.LIZ()) {
                    if (baseListFragmentPanel.LLJJJJJIL == null) {
                        InterfaceC665370Q7z interfaceC665370Q7z = baseListFragmentPanel.LL;
                        int i = EarphonePlayerControlComponent.LLILZIL;
                        baseListFragmentPanel.LLJJJJJIL = (IEarphonePlayerControlComponent) C1558520qew.LIZ(interfaceC665370Q7z, IEarphonePlayerControlComponent.class, null);
                    }
                    if (baseListFragmentPanel.LLJJJJJIL != null) {
                        baseListFragmentPanel.LLJJJJJIL.z12();
                    }
                }
                baseListFragmentPanel.showIvPlay();
                baseListFragmentPanel.LLJLLIL();
                if (((Number) C265940AbY.LIZ.getValue()).intValue() == 1) {
                    Aweme awemeLJIIIIZZ = baseListFragmentPanel.LJIIIIZZ();
                    String eventType = baseListFragmentPanel.getEventType();
                    baseListFragmentPanel.getPageType();
                    C1440005kM.LIZ(new C722910SXh(awemeLJIIIIZZ, eventType, 1, (IBaseListFragmentPanel) baseListFragmentPanel, false));
                }
                C584080MvW.LIZIZ(baseListFragmentPanel.LJIIIIZZ(), "play", baseListFragmentPanel.getEventType());
                if (baseListFragmentPanel.LJIIIIZZ() != null) {
                    C735740StY c735740StY = new C735740StY();
                    c735740StY.LJJLIIIJLLLLLLLZ = "earphone_disconnected";
                    c735740StY.LJJIJIL(baseListFragmentPanel.LLLLIIIILLL.getPageType(), baseListFragmentPanel.LJIIIIZZ());
                    c735740StY.LJJLIIIJ = baseListFragmentPanel.LLLLIIIILLL.getEventType();
                    c735740StY.LJJLIIIIJ = C584760Mwc.LIZ(baseListFragmentPanel.LLLLIIIILLL.getPreviousPage(), baseListFragmentPanel.LLLLIIIILLL.getFromGroupId());
                    C735840Sti c735840Sti = C735840Sti.LIZ;
                    Aweme awemeLLLLLJLJLL = baseListFragmentPanel.LLLLLJLJLL();
                    String eventType2 = baseListFragmentPanel.getEventType();
                    String from = baseListFragmentPanel.getFrom();
                    Activity activity = baseListFragmentPanel.activity;
                    Fragment fragment = baseListFragmentPanel.getFragment();
                    c735840Sti.getClass();
                    C735840Sti.LIZJ(c735740StY, awemeLLLLLJLJLL, eventType2, from, activity, fragment);
                    if (baseListFragmentPanel.LLLLIIIILLL.getNavArgModel() != null) {
                        c735740StY.LIZIZ(TakoAIVideoMobFiller.toParams(baseListFragmentPanel.LLLLIIIILLL));
                    }
                    c735740StY.LJIILJJIL();
                    return;
                }
                return;
            }
            C584080MvW.LIZIZ(baseListFragmentPanel.LJIIIIZZ(), "pause", baseListFragmentPanel.getEventType());
        }
    }

    public static final void onChanged$32(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        TextView textView;
        C0S3L c0s3l = (C0S3L) aObserverS215S0100000_11.l0;
        C715040S3a c715040S3a = (C715040S3a) obj;
        if (c715040S3a.LIZIZ && (textView = (TextView) c0s3l.LJIIIIZZ.getValue()) != null) {
            textView.setText(c0s3l.LJIIIZ(c715040S3a.LIZ));
        }
    }

    public static final void onChanged$33(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0S3L c0s3l = (C0S3L) aObserverS215S0100000_11.l0;
        C0S3R c0s3r = ((C715070S3d) obj).LIZ;
        if (c0s3r != null) {
            int i = C0S3Q.LIZ[c0s3r.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C786410Ut5.LJLLLLLL(8, c0s3l.LJFF());
                    return;
                }
                return;
            }
            C786410Ut5.LJLLLLLL(0, c0s3l.LJFF());
        }
    }

    public static final void onChanged$34(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C715060S3c c715060S3c = (C715060S3c) aObserverS215S0100000_11.l0;
        if (((Boolean) obj).booleanValue()) {
            if (c715060S3c.LJFF().getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, c715060S3c.LJFF());
            }
        } else {
            if (c715060S3c.LJFF().getVisibility() != 0) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, c715060S3c.LJFF());
        }
    }

    public static final void onChanged$35(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0S3V c0s3v = (C0S3V) aObserverS215S0100000_11.l0;
        C0S3R c0s3r = ((C715070S3d) obj).LIZ;
        if (c0s3r != null) {
            int i = C0S3S.LIZ[c0s3r.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c0s3v.LJIIJ = false;
                    return;
                }
                return;
            }
            c0s3v.LJIIJ = true;
        }
    }

    public static final void onChanged$36(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C715120S3i c715120S3i = (C715120S3i) obj;
        C0S3W c0s3wLJIIIZ = ((C0S3V) aObserverS215S0100000_11.l0).LJIIIZ();
        if (c0s3wLJIIIZ != null) {
            c0s3wLJIIIZ.onTouchEvent(c715120S3i.LIZ);
        }
    }

    public static final void onChanged$37(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0S3V c0s3v = (C0S3V) aObserverS215S0100000_11.l0;
        if (((Boolean) obj).booleanValue()) {
            if (c0s3v.LJFF().getVisibility() != 0) {
                C786410Ut5.LJLLLLLL(0, c0s3v.LJFF());
            }
        } else {
            if (c0s3v.LJFF().getVisibility() != 0) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, c0s3v.LJFF());
        }
    }

    public static final void onChanged$38(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        View viewFindViewById;
        Boolean bool = (Boolean) obj;
        View viewNd = ((C0SRX) aObserverS215S0100000_11.l0).Nd();
        if (viewNd != null) {
            viewFindViewById = viewNd.findViewById(R.id.bnu);
        } else {
            viewFindViewById = null;
        }
        if (bool.booleanValue()) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            C786410Ut5.Pd(ObjectAnimator.ofFloat(viewFindViewById, "alpha", 0.0f, 1.0f));
        } else {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            C786410Ut5.Pd(ObjectAnimator.ofFloat(viewFindViewById, "alpha", 1.0f, 0.0f));
        }
    }

    public static final void onChanged$39(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        String str = (String) obj;
        C0SRX c0srx = (C0SRX) aObserverS215S0100000_11.l0;
        if (c0srx instanceof PostModeDetailActivity) {
            C1389890mGx c1389890mGx = new C1389890mGx((Activity) ((C0SRX) aObserverS215S0100000_11.l0));
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            return;
        }
        if (!(c0srx instanceof PostModeDetailRootFragment)) {
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx((Fragment) ((C0SRX) aObserverS215S0100000_11.l0));
        c1389890mGx2.LJIIJ(str);
        c1389890mGx2.LIZLLL(3000L);
        c1389890mGx2.LJIIJJI();
    }

    public static final void onChanged$4(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Aweme aweme = (Aweme) obj;
        if (aweme != null) {
            if (Intrinsics.LJFF(aweme.getAid(), ((VideoItemParams) C631370Opb.LIZ((CollabFeedTagAssem) aObserverS215S0100000_11.l0)).getAweme().getAid())) {
                ((CollabFeedTagAssem) aObserverS215S0100000_11.l0).Ep(aweme);
            }
        }
    }

    public static final void onChanged$40(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        if (!((C0SRX) aObserverS215S0100000_11.l0).mo33if()) {
            Object obj2 = (C0SRX) aObserverS215S0100000_11.l0;
            if (obj2 instanceof PostModeDetailActivity) {
                ((PostModeDetailActivity) obj2).onBackPressed();
                return;
            } else {
                if (!(obj2 instanceof PostModeDetailRootFragment)) {
                    return;
                }
                ((SAFTikTokFragment) obj2).onBackPressed();
                return;
            }
        }
        ((C0SRX) aObserverS215S0100000_11.l0).ft();
    }

    public static final void onChanged$41(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((VideoViewCell) aObserverS215S0100000_11.l0).getClass();
    }

    public static final void onChanged$42(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C2487409ou.LIZJ(new ARunnableS80S0200000_11((C0SU4) aObserverS215S0100000_11.l0, (C0SU5) obj, 69));
    }

    public static final void onChanged$43(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0SOP) aObserverS215S0100000_11.l0).LIZLLL();
    }

    public static final void onChanged$44(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0SX4) aObserverS215S0100000_11.l0).LJIIIIZZ();
    }

    public static final void onChanged$45(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0SX4) aObserverS215S0100000_11.l0).LJIIIIZZ();
    }

    public static final void onChanged$46(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0SX4) aObserverS215S0100000_11.l0).LJIIIIZZ();
    }

    public static final void onChanged$47(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C0SX4) aObserverS215S0100000_11.l0).LJIIIIZZ();
        }
    }

    public static final void onChanged$48(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0SU0 c0su0;
        WeakReference<C0SU0> weakReference = ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LLJJL;
        C0SU0 c0su02 = null;
        if (weakReference != null && (c0su0 = weakReference.get()) != null) {
            C786410Ut5.Cd(c0su0, ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LLLILZ);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0su0);
            c0su0.setAlpha(1.0f);
        }
        PostModeNestHeaderComponent postModeNestHeaderComponent = (PostModeNestHeaderComponent) aObserverS215S0100000_11.l0;
        postModeNestHeaderComponent.LLJLILLLLZIIL = true;
        postModeNestHeaderComponent.LJJLJLI(1);
        if (!((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LLILLL.LJIIZILJ()) {
            PostModeNestHeaderComponent postModeNestHeaderComponent2 = (PostModeNestHeaderComponent) aObserverS215S0100000_11.l0;
            AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(postModeNestHeaderComponent2, 1579);
            WeakReference<C0SU0> weakReference2 = postModeNestHeaderComponent2.LLJJL;
            if (weakReference2 != null) {
                c0su02 = weakReference2.get();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(120L);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setStartDelay(80L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(c0su02, postModeNestHeaderComponent2, 17));
            valueAnimatorOfFloat.addListener(new AAListenerS263S0200000_11(c0su02, awS555S0100000_11, 5));
            postModeNestHeaderComponent2.LLJZ = valueAnimatorOfFloat;
            ValueAnimator valueAnimator = ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LLJZ;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            return;
        }
        ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LJJLIIIJLJLI();
    }

    public static final void onChanged$49(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        String str;
        EnumC721170SQp enumC721170SQp = (EnumC721170SQp) obj;
        if (enumC721170SQp != null) {
            PostModeDetailParams postModeDetailParams = ((C0SQR) aObserverS215S0100000_11.l0).LL.LJII;
            if (postModeDetailParams == null || (str = postModeDetailParams.eventType) == null) {
                str = "";
            }
            if (!C07TP.LIZIZ(str)) {
                C20737116Cr.LJFF();
            }
            if (C281470B1l.LIZ()) {
                C0SNV.LIZ("photomode_fullpage_exit", str);
            }
            IPhotoNestHeaderAbility iPhotoNestHeaderAbility = (IPhotoNestHeaderAbility) ((C0SQR) aObserverS215S0100000_11.l0).LLJIJIL.getValue();
            if (iPhotoNestHeaderAbility != null && iPhotoNestHeaderAbility.yD0(enumC721170SQp, new C0SPB((C0SQR) aObserverS215S0100000_11.l0))) {
                return;
            }
            ((C0SQR) aObserverS215S0100000_11.l0).LJIIIIZZ();
        }
    }

    public static final void onChanged$5(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((PhotoNumIndicatorAssem) aObserverS215S0100000_11.l0).mp().setState(new AwS26S0001000_11(((Integer) obj).intValue(), 10));
    }

    public static final void onChanged$50(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ValueAnimator valueAnimator;
        if (!((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LJJJJZI() && Intrinsics.LJFF(obj, Boolean.TRUE) && (valueAnimator = ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LLJZ) != null && !valueAnimator.isRunning()) {
            ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).LJJLIIIJLJLI();
        }
    }

    public static final void onChanged$51(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ValueAnimator valueAnimator;
        PostModeNestHeaderComponent postModeNestHeaderComponent = (PostModeNestHeaderComponent) aObserverS215S0100000_11.l0;
        if (postModeNestHeaderComponent.LLJL == 1 || ((valueAnimator = postModeNestHeaderComponent.LLJZ) != null && valueAnimator.isStarted())) {
            ((PostModeNestHeaderComponent) aObserverS215S0100000_11.l0).e = true;
            return;
        }
        PostModeNestHeaderComponent postModeNestHeaderComponent2 = (PostModeNestHeaderComponent) aObserverS215S0100000_11.l0;
        postModeNestHeaderComponent2.LJLJJLL(null);
        postModeNestHeaderComponent2.LJII(true);
    }

    public static final void onChanged$52(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        InterfaceC737440SwI interfaceC737440SwI;
        if (obj != null && (interfaceC737440SwI = ((PostModeActionBarComponentV2) aObserverS215S0100000_11.l0).LLIZLLLIL) != null) {
            interfaceC737440SwI.yQ(true);
        }
    }

    public static final void onChanged$53(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0SQR) aObserverS215S0100000_11.l0).LJIILIIL();
    }

    public static final void onChanged$54(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && !((C721130SQl) aObserverS215S0100000_11.l0).LLILLJJLI.LLILZLL.LJIIL()) {
            C721130SQl c721130SQl = (C721130SQl) aObserverS215S0100000_11.l0;
            float fFloatValue = ((Number) pair.getFirst()).floatValue();
            float fFloatValue2 = ((Number) pair.getSecond()).floatValue() - ((Number) ((C721130SQl) aObserverS215S0100000_11.l0).LLILLL.getValue()).intValue();
            PostModeFullPageViewModel postModeFullPageViewModel = c721130SQl.LL.LJIIIZ;
            if (postModeFullPageViewModel != null) {
                postModeFullPageViewModel.withState(new AwS590S0100000_11(new AwS11S0100002_11(c721130SQl, fFloatValue, fFloatValue2, 1), 593));
            }
        }
    }

    public static final void onChanged$55(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C16F4 c16f4LIZ;
        C16F4 c16f4LIZ2 = ((C721130SQl) aObserverS215S0100000_11.l0).LIZ();
        if (c16f4LIZ2 != null && c16f4LIZ2.getChildCount() > 0 && (c16f4LIZ = ((C721130SQl) aObserverS215S0100000_11.l0).LIZ()) != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c16f4LIZ, null);
            c16f4LIZ.removeAllViews();
        }
    }

    public static final void onChanged$56(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((C0SQR) aObserverS215S0100000_11.l0).LJIILIIL();
    }

    public static final void onChanged$57(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C0SQR c0sqr = (C0SQR) aObserverS215S0100000_11.l0;
            C0SQW c0sqw = c0sqr.LL.LJIILIIL;
            c0sqw.LIZIZ = 0.0f;
            c0sqw.LIZ = 0.0f;
            float fFloatValue = c0sqr.LJII(false).getFirst().floatValue();
            View viewLJIIJ = c0sqr.LJIIJ();
            if (viewLJIIJ != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewLJIIJ.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.height = (int) fFloatValue;
                }
                C786410Ut5.W5(viewLJIIJ, marginLayoutParams);
            }
        }
    }

    public static final void onChanged$58(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ImageView imageView;
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C0SQR c0sqr = (C0SQR) aObserverS215S0100000_11.l0;
            View viewLIZ = c0sqr.LL.LIZ(R.id.hgx);
            if (viewLIZ != null && (imageView = (ImageView) viewLIZ.findViewById(R.id.hgu)) != null && imageView.getAlpha() != 0.0f) {
                imageView.animate().cancel();
                imageView.animate().alpha(0.0f).setDuration(c0sqr.LLJ).withEndAction(new ARunnableS104S0100000_4(imageView, 129)).start();
            }
        }
    }

    public static final void onChanged$59(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((PostModePhotosComponent) aObserverS215S0100000_11.l0).LJJJJ();
    }

    public static final void onChanged$6(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0TU9 c0tu9;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.LJFF(obj, bool) && (c0tu9 = ((PostModeDetailPageFragment) aObserverS215S0100000_11.l0).LLIZ) != null) {
            c0tu9.LIZLLL = bool;
            if (Intrinsics.LJFF(c0tu9.LIZJ, bool) && !c0tu9.LJI) {
                C0TU9.LJIIL(c0tu9, false, null, 3);
                c0tu9.LIZJ();
            }
        }
    }

    public static final void onChanged$60(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        ((PostModePhotosComponent) aObserverS215S0100000_11.l0).LJIJJLI();
        C0SOM c0som = ((PostModePhotosComponent) aObserverS215S0100000_11.l0).LLILZ;
        if (c0som != null && !c0som.LLLLLJLJLL) {
            c0som.LLLLLJLJLL = true;
            c0som.LJJIII();
        }
    }

    public static final void onChanged$7(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        C0SSX c0ssx;
        C0SSZ c0ssz;
        C0SSX c0ssx2;
        PostModeProfileWrapperFragment postModeProfileWrapperFragment = (PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0;
        User author = null;
        if (!postModeProfileWrapperFragment.LLIZ) {
            postModeProfileWrapperFragment.LLIZ = true;
            ComponentCallbacks componentCallbacks = postModeProfileWrapperFragment.LLILLL;
            if ((componentCallbacks instanceof C0SSX) && (c0ssx2 = (C0SSX) componentCallbacks) != null) {
                c0ssx2.lL(Boolean.TRUE);
            }
            ComponentCallbacks componentCallbacks2 = ((PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0).LLILZ;
            if ((componentCallbacks2 instanceof C0SSZ) && (c0ssz = (C0SSZ) componentCallbacks2) != null) {
                c0ssz.Tx();
            }
        }
        PostModeProfileWrapperFragment postModeProfileWrapperFragment2 = (PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0;
        ComponentCallbacks componentCallbacks3 = postModeProfileWrapperFragment2.LLILLL;
        if ((componentCallbacks3 instanceof C0SSX) && (c0ssx = (C0SSX) componentCallbacks3) != null) {
            Aweme aweme = ((PhotoSharedViewModel) postModeProfileWrapperFragment2.LLILLJJLI.getValue()).LLILLJJLI;
            if (aweme != null) {
                author = aweme.getAuthor();
            }
            c0ssx.WL(author, false);
        }
    }

    public static final void onChanged$8(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Serializable serializable;
        User user;
        Integer num = (Integer) obj;
        Bundle arguments = ((PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0).getArguments();
        Boolean boolValueOf = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("author");
        } else {
            serializable = null;
        }
        if ((serializable instanceof User) && (user = (User) serializable) != null) {
            ((PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0).getClass();
            boolValueOf = Boolean.valueOf(PostModeProfileWrapperFragment.MR(user));
        }
        if (num != null && num.intValue() == 1) {
            ((PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0).NR(true, boolValueOf);
        } else {
            ((PostModeProfileWrapperFragment) aObserverS215S0100000_11.l0).NR(false, boolValueOf);
        }
    }

    public static final void onChanged$9(AObserverS215S0100000_11 aObserverS215S0100000_11, Object obj) {
        Object uid;
        User user;
        int iIntValue;
        FollowStatus followStatus = (FollowStatus) obj;
        Iterator<UpvoteStruct> it2 = ((UpvoteListViewModelNew) aObserverS215S0100000_11.l0).LIZ().iterator();
        while (true) {
            uid = null;
            if (!it2.hasNext()) {
                break;
            }
            UpvoteStruct next = it2.next();
            User user2 = next.user;
            if (user2 != null) {
                uid = user2.getUid();
            }
            if (Intrinsics.LJFF(uid, followStatus.getUserId())) {
                uid = next;
                break;
            }
        }
        UpvoteStruct upvoteStruct = (UpvoteStruct) uid;
        if (upvoteStruct != null && (user = upvoteStruct.user) != null) {
            user.setFollowStatus(followStatus.getFollowStatus());
            Integer followerStatus = followStatus.getFollowerStatus();
            if (followerStatus != null) {
                iIntValue = followerStatus.intValue();
            } else {
                iIntValue = -1;
            }
            user.setFollowerStatus(iIntValue);
        }
    }
}
