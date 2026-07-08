package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeImageTransform;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.experiment.ExploreDetailVisualWeakeningExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.AwS99S0110000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721640SSk {
    public static final C721640SSk LIZ = new C721640SSk();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(445));
    public static final Map<C0SY7, Integer> LIZJ;

    static {
        C0SY7 c0sy7 = C0SY7.UNFOLLOW;
        Integer numValueOf = Integer.valueOf(R.raw.icon_plus_small);
        LIZJ = C2097608Jq.LJIIIIZZ(new Pair(c0sy7, numValueOf), new Pair(C0SY7.UNFOLLOW_BUT_BE_FOLLOWED, numValueOf));
    }

    public static C444890HcV LJFF() {
        return (C444890HcV) LIZIZ.getValue();
    }

    public static TransitionSet LIZ(final boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new ChangeClipBounds());
        transitionSet.addTransition(new ChangeImageTransform());
        transitionSet.addTransition(new Transition(z) { // from class: X.0Hhg
            public final boolean LL;

            {
                this.LL = z;
            }

            @Override // android.transition.Transition
            public final void captureEndValues(TransitionValues transitionValues) {
                transitionValues.values.put("customExploreCrossFadeTransition:alpha", Float.valueOf(transitionValues.view.getAlpha()));
            }

            @Override // android.transition.Transition
            public final void captureStartValues(TransitionValues transitionValues) {
                transitionValues.values.put("customExploreCrossFadeTransition:alpha", Float.valueOf(transitionValues.view.getAlpha()));
            }

            @Override // android.transition.Transition
            public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
                boolean z2;
                String transitionName;
                float f;
                String transitionName2;
                if (transitionValues != null && transitionValues2 != null) {
                    View view = transitionValues.view;
                    if (!(view instanceof View) || view == null) {
                        return null;
                    }
                    View view2 = transitionValues2.view;
                    if (!(view2 instanceof View) || view2 == null) {
                        return null;
                    }
                    String transitionName3 = view2.getTransitionName();
                    if (transitionName3 != null && !a0.LJJIIZI(transitionName3, "none", false)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float f2 = 0.0f;
                    if (z2) {
                        if (!this.LL ? (transitionName = view2.getTransitionName()) == null || !a0.LJJIIZI(transitionName, "fade_out", false) : (transitionName2 = view2.getTransitionName()) != null && a0.LJJIIZI(transitionName2, "fade_out", false)) {
                            f = 1.0f;
                        } else {
                            f = 0.0f;
                            f2 = 1.0f;
                        }
                        C786410Ut5.T4(view, f);
                        C786410Ut5.T4(view2, f2);
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, f, f2);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(345L);
                        animatorSet.setInterpolator(new InterpolatorC448120Hhi(4.0f));
                        animatorSet.playTogether(objectAnimatorOfFloat);
                        return animatorSet;
                    }
                    if (view2.getTransitionName() != null) {
                        if (this.LL) {
                            f2 = 1.0f;
                        }
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, f2, 1.0f);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setDuration(172L);
                        animatorSet2.setInterpolator(new InterpolatorC448120Hhi(4.0f));
                        animatorSet2.playTogether(objectAnimatorOfFloat2);
                        return animatorSet2;
                    }
                }
                return null;
            }
        });
        transitionSet.setDuration(345L);
        transitionSet.setInterpolator((TimeInterpolator) new InterpolatorC448120Hhi(4.0f));
        transitionSet.setOrdering(0);
        return transitionSet;
    }

    public static TransitionSet LIZIZ(boolean z) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new ChangeClipBounds());
        transitionSet.addTransition(new ChangeImageTransform());
        if (z) {
            transitionSet.setDuration(150L);
        } else {
            transitionSet.setDuration(100L);
        }
        transitionSet.setInterpolator((TimeInterpolator) new InterpolatorC448120Hhi(4.0f));
        transitionSet.setOrdering(0);
        return transitionSet;
    }

    public static void LIZJ(RelationButton relationButton) {
        relationButton.LJJJJL(null);
        relationButton.setButtonStartIcon(null);
        relationButton.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        relationButton.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        relationButton.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
    }

    public static int LJII(Context context) {
        int dimensionPixelSize = 0;
        if (context == null) {
            return 0;
        }
        int iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android");
        if (iN3 > 0) {
            try {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(iN3);
                return dimensionPixelSize;
            } catch (Resources.NotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return dimensionPixelSize;
    }

    public static int LJIIIIZZ(C19EG c19eg) {
        Rect rect = new Rect();
        Window window = c19eg.getWindow();
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = rect.top;
        View viewQe = C786410Ut5.qe(window, android.R.id.content);
        if (viewQe != null) {
            int top = i - viewQe.getTop();
            if (top != 0 && top >= 0) {
                return top;
            }
            return C497820Jfg.LIZJ(c19eg);
        }
        return C497820Jfg.LIZJ(c19eg);
    }

    public static boolean LJIIJ(Aweme aweme) {
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJIILLIIL(aweme) || (aweme != null && aweme.isCmtSwt())) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(int i) {
        if (i == -16777216 || ((double) 1) - ((((((double) Color.red(i)) * 0.299d) + (((double) Color.green(i)) * 0.587d)) + (((double) Color.blue(i)) * 0.114d)) / ((double) 255)) >= 0.5d) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(PostModeDetailParams postModeDetailParams) {
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (postModeDetailParams != null) {
            postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism;
        } else {
            postModeEntranceMechanism = null;
        }
        if (postModeEntranceMechanism == PostModeEntranceMechanism.EXPLORE_CARD) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL(Aweme aweme) {
        Map<String, Object> postExtraMap;
        PhotoModeImageInfo photoModeImageInfo;
        Map<String, Object> postExtraMap2;
        PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo2 != null && (postExtraMap = photoModeImageInfo2.getPostExtraMap()) != null && postExtraMap.containsKey("photo_blurhash") && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (postExtraMap2 = photoModeImageInfo.getPostExtraMap()) != null && Intrinsics.LJFF(postExtraMap2.get("photo_blurhash"), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILLIIL(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        Map<String, Object> postExtraMap;
        PhotoModeImageInfo photoModeImageInfo2;
        Map<String, Object> postExtraMap2;
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (postExtraMap = photoModeImageInfo.getPostExtraMap()) != null && postExtraMap.containsKey("photo_progressive") && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (postExtraMap2 = photoModeImageInfo2.getPostExtraMap()) != null && Intrinsics.LJFF(postExtraMap2.get("photo_progressive"), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static String LJ(Aweme aweme, long j) {
        if (C0OAD.LIZIZ(aweme)) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        return C618720OOo.LIZ(j);
    }

    public static int LJIIIZ(int i, Context context) {
        View viewFindViewById;
        Activity activityLIZ;
        if (C0SKM.LJIIIIZZ().enableCrashFix) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
        }
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            viewFindViewById = activityLIZ.findViewById(R.id.tpm);
        } else {
            viewFindViewById = null;
        }
        int height = 0;
        if (viewFindViewById != null) {
            if (viewFindViewById.getHeight() == 0) {
                height = viewFindViewById.getMeasuredHeight();
            } else {
                height = viewFindViewById.getHeight();
            }
        }
        if (height >= i) {
            return height;
        }
        return i;
    }

    public static boolean LJIIL(Aweme aweme, VideoItemParams videoItemParams) {
        PlayListInfo playListInfo;
        BaseFeedPageParams baseFeedPageParams;
        if (aweme == null) {
            return false;
        }
        PlayListInfo playListInfo2 = aweme.playlist_info;
        Fragment fragment = null;
        if (playListInfo2 == null || playListInfo2.getMixId() == null || (playListInfo = aweme.playlist_info) == null || playListInfo.getIndex() == null) {
            return false;
        }
        C0S4N c0s4n = C0S4N.LIZ;
        if (videoItemParams != null) {
            baseFeedPageParams = videoItemParams.baseFeedPageParams;
        } else {
            baseFeedPageParams = null;
        }
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        if (videoItemParams != null) {
            fragment = videoItemParams.fragment;
        }
        boolean zPu = c1599640rjG.Pu(fragment);
        c0s4n.getClass();
        if (!C0S4N.LIZ(aweme, baseFeedPageParams, zPu)) {
            return false;
        }
        return true;
    }

    public static void LJIILIIL(ConstraintLayout constraintLayout, float f) {
        if (constraintLayout != null) {
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJIJI(R.id.qeg).LIZLLL.LJJJJZI = f;
            c19mb.LIZIZ(constraintLayout);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIZILJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r2, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility r3) {
        /*
            r1 = 1
            if (r2 == 0) goto Lc
            int r0 = com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PlayListBottomBarAssemTrigger.LLJL
            boolean r0 = X.C0S4M.LIZ(r2)
            if (r0 != r1) goto Lc
        Lb:
            return r1
        Lc:
            boolean r0 = X.C699840Rck.LIZ(r3)
            if (r0 != 0) goto Lb
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721640SSk.LJIIZILJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams, com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility):boolean");
    }

    public static void LIZLLL(RelationButton relationButton, User user, C0SRL c0srl) {
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        if (c0srl != null && (aweme = c0srl.LIZJ) != null) {
            FullPageParam fullPageParam = new FullPageParam(aweme, c0srl.LJII, new ArrayList(), false);
            fullPageParam.setIsEnterGraphicDetail(c0srl.LJIIL.NR());
            Aweme aweme2 = fullPageParam.getAweme();
            if (aweme2 != null && (postModeDetailParams = fullPageParam.getPostModeDetailParams()) != null) {
                Map mapLIZ = C0JBR.LIZ(aweme2, ((ISearchService) ServiceManager.get().getService(ISearchService.class)).I(aweme2, postModeDetailParams.eventType));
                LIZJ(relationButton);
                String uid = user.getUid();
                C0XQ7.LJ();
                if (TextUtils.equals(uid, C0XQ7.LIZ.LJIIJ().getCurUserId())) {
                    C786410Ut5.t0(relationButton, 8);
                    return;
                }
                C786410Ut5.t0(relationButton, 0);
                boolean zEnableFollowButtonWeakening = ExploreDetailVisualWeakeningExperiment.INSTANCE.enableFollowButtonWeakening(postModeDetailParams.eventType);
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                LifecycleOwner lifecycleOwnerLIZJ = SAFExtensionKt.LIZJ(relationButton);
                if (lifecycleOwnerLIZJ == null) {
                    lifecycleOwnerLIZJ = C0SY5.LIZIZ(relationButton.getContext());
                }
                c1387050mCN.LJIIJJI = lifecycleOwnerLIZJ;
                c1387050mCN.LJIIL = C0SY5.LIZJ(relationButton.getContext());
                if (zEnableFollowButtonWeakening) {
                    c1387050mCN.LIZIZ(LIZJ);
                }
                relationButton.LLLLZIL(c1387050mCN.LIZ());
                C721640SSk c721640SSk = LIZ;
                C0SY6 c0sy6 = C0SY7.Companion;
                int followStatus = user.getFollowStatus();
                c0sy6.getClass();
                C0SY7 c0sy7LIZ = C0SY6.LIZ(followStatus);
                c721640SSk.getClass();
                LJIJ(relationButton, zEnableFollowButtonWeakening, c0sy7LIZ);
                relationButton.setDataChangeListener(new AwS99S0110000_11(relationButton, zEnableFollowButtonWeakening, 6));
                relationButton.setTracker(new AwS140S0400000_11(postModeDetailParams, (PostModeDetailParams) aweme2, (Aweme) mapLIZ, (Map<String, String>) fullPageParam, (FullPageParam) 8));
            }
        }
    }

    public static float LJI(Aweme aweme, boolean z, boolean z2) {
        int i;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        int iLIZLLL = C720310SNh.LIZLLL(aweme, z2);
        if (z) {
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null && imageList.size() > 1) {
                i = 24;
            } else {
                i = 16;
            }
            iLIZLLL += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
        return iLIZLLL;
    }

    public static void LJIJ(RelationButton relationButton, boolean z, C0SY7 c0sy7) {
        if (!z) {
            LIZJ(relationButton);
            return;
        }
        if (c0sy7 != C0SY7.UNFOLLOW && c0sy7 != C0SY7.UNFOLLOW_BUT_BE_FOLLOWED) {
            LIZJ(relationButton);
            relationButton.setButtonStartIcon(null);
            relationButton.setButtonVariant(1);
        } else {
            relationButton.setButtonVariant(1);
            relationButton.setButtonStartIcon(Integer.valueOf(R.raw.icon_plus_small));
            relationButton.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            relationButton.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            relationButton.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
            relationButton.LJJJJL(AFwS232S0000000_4.get$arr$(229));
        }
    }
}
