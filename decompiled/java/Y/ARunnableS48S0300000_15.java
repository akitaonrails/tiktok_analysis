package Y;

import X.AbstractC981980bf2;
import X.C118300cf;
import X.C1295960jpS;
import X.C12DM;
import X.C12ES;
import X.C15438062q;
import X.C1697810uHb;
import X.C16FS;
import X.C19EG;
import X.C1C7U;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C259800zU;
import X.C416040GTa;
import X.C497740JfY;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C930540aK4;
import X.C936720aU2;
import X.C937310aUz;
import X.C937520aVK;
import X.C937610aVT;
import X.C937980aW4;
import X.C938000aW6;
import X.C939550aYb;
import X.C939750aYv;
import X.C940950aar;
import X.C963790bBh;
import X.C970310bMD;
import X.C970560bMc;
import X.C970630bMj;
import X.C970760bMw;
import X.C973660bRc;
import X.C975600bUk;
import X.C975970bVL;
import X.C976230bVl;
import X.C977620bY0;
import X.C977630bY1;
import X.C978130bYp;
import X.C978440bZK;
import X.C982360bfe;
import X.EnumC919170a1j;
import X.EnumC964170bCJ;
import X.EnumC970440bMQ;
import X.EnumC974980bTk;
import X.InterfaceC934710aQn;
import X.InterfaceC937900aVw;
import X.InterfaceC940060aZQ;
import X.InterfaceC954180awC;
import X.InterfaceC958070b2T;
import X.InterfaceC976360bVy;
import X.InterfaceC983270bh7;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.matchv2.connection.teammatch.coordinator.inviter.view.TeamMatchInviterFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AvatarOpenCameraEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestLearningAvatarFragment;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiTopLiveEntranceAnimatorDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveAddIconScaleAnimatorForExitLiveSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TopLiveExitAnimDocEnabledSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS244S0000000_12;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.multi_guest_social_data.AvatarImageSelectTips;

/* JADX INFO: loaded from: classes16.dex */
public class ARunnableS48S0300000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view;
        ViewGroup viewGroup;
        C939750aYv c939750aYv = (C939750aYv) this.l0;
        View view2 = (View) this.l1;
        ViewGroup viewGroup2 = (ViewGroup) this.l2;
        c939750aYv.getClass();
        Object parent = viewGroup2.getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return;
        }
        ViewParent parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (viewGroup = (ViewGroup) parent2) == null) {
            return;
        }
        int width = view.getWidth();
        int i = C939750aYv.LLILZLL;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width + (C938000aW6.LIZ() * 2), view.getHeight() + (C938000aW6.LIZ() * 2));
        layoutParams.leftMargin = view.getLeft() - C938000aW6.LIZ();
        layoutParams.topMargin = view.getTop() - C938000aW6.LIZ();
        C786410Ut5.W5(view2, layoutParams);
        if (c939750aYv.LLILZIL) {
            C936720aU2.LIZLLL(view2, C20736316Cj.LIZIZ(R.attr.eut, view2.getContext()), C939750aYv.LLILZLL, c939750aYv.LL);
        } else {
            C936720aU2.LIZLLL(view2, C20736316Cj.LIZIZ(R.attr.ewy, view2.getContext()), C939750aYv.LLILZLL, c939750aYv.LL);
        }
        C12ES.LJIILL(0, view2);
        C930540aK4.LJJIL(-1, view2, viewGroup);
        ((HashMap) c939750aYv.LLILZ.getValue()).put(view2, viewGroup2);
    }

    public final void LIZ$1() {
        int i;
        C937520aVK c937520aVK = C937520aVK.LIZ;
        Fragment fragment = (Fragment) this.l0;
        final Bitmap bitmap = (Bitmap) this.l1;
        final View view = (View) this.l2;
        c937520aVK.getClass();
        View view2 = fragment.getView();
        if (!(view2 != null && view2.getVisibility() == 0)) {
            C937520aVK.LIZJ(bitmap);
            C20441214yg.LJ("MultiGuestMicHangupHelper", "tryPlayTopLiveExitAnimAfterHome failed, view is not visible");
            C937520aVK.LIZLLL(0, "view_invisible");
            return;
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            C20441214yg.LJ("MultiGuestMicHangupHelper", "tryPlayTopLiveExitAnimAfterHome failed, no activity");
            C937520aVK.LIZJ(bitmap);
            C937520aVK.LIZLLL(0, "no_activity");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
        if (viewGroup == null) {
            C20441214yg.LJ("MultiGuestMicHangupHelper", "tryPlayTopLiveExitAnimAfterHome failed, no container");
            C937520aVK.LIZJ(bitmap);
            C937520aVK.LIZLLL(0, "no_container");
            return;
        }
        final int i2 = C937520aVK.LJIIIIZZ;
        C937520aVK.LJIIIIZZ = 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPlayTopLiveExitAnimAfterHome prepare, exitCause=");
        sbLIZ.append(i2);
        sbLIZ.append(", snapshotAgeMs=");
        sbLIZ.append(C937520aVK.LJII);
        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ));
        if (view == null || view.getVisibility() != 0) {
            C937520aVK.LIZJ(bitmap);
            C937520aVK.LIZLLL(0, "no_iconView");
            C20441214yg.LJ("MultiGuestMicHangupHelper", "tryPlayTopLiveExitAnimAfterHome failed , iconView is null/invisible");
            return;
        }
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0 || !viewGroup.isAttachedToWindow()) {
            C937520aVK.LIZJ(bitmap);
            C937520aVK.LIZLLL(0, "no_rootView");
            C20441214yg.LJ("MultiGuestMicHangupHelper", "tryPlayTopLiveExitAnimAfterHome failed , rootView's size is invalid/rootView is not attached");
            return;
        }
        final View view3 = new View(activity);
        C786410Ut5.W5(view3, new FrameLayout.LayoutParams(-1, -1));
        view3.setBackgroundColor(-16777216);
        C786410Ut5.T4(view3, 0.5f);
        view3.setClickable(false);
        final ImageView imageView = new ImageView(activity);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (viewGroup.getWidth() * 0.8f), (int) (viewGroup.getHeight() * 0.8f));
        layoutParams.gravity = 17;
        C786410Ut5.c6(imageView, layoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageBitmap(bitmap);
        C937610aVT c937610aVT = new C937610aVT();
        imageView.setOutlineProvider(c937610aVT);
        imageView.setClipToOutline(true);
        viewGroup.addView(view3);
        viewGroup.addView(imageView);
        float width = viewGroup.getWidth();
        float height = viewGroup.getHeight();
        imageView.getLocationOnScreen(new int[2]);
        view.getLocationOnScreen(new int[2]);
        float width2 = (r1[0] - r10[0]) + (view.getWidth() / 2.0f);
        float fMax = Math.max(width, height);
        float fMax2 = Math.max(1, Math.min(view.getWidth(), view.getHeight())) / fMax;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.0f, fMax2);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, fMax2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_X, 0.0f, width2 - (width / 2.0f));
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.TRANSLATION_Y, 0.0f, ((r1[1] - r10[1]) + (view.getHeight() / 2.0f)) - (height / 2.0f));
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 1.0f, 0.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, fMax / 2.0f);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS222S0200000_15(c937610aVT, imageView, 0));
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, view3.getAlpha(), 0.0f);
        final AnimatorSet animatorSet = new AnimatorSet();
        long value = MultiTopLiveEntranceAnimatorDurationSetting.getValue();
        TimeInterpolator pathInterpolator = i2 == 2 ? new PathInterpolator(0.32f, 0.94f, 0.6f, 1.0f) : new C12DM();
        animatorSet.setDuration(value);
        animatorSet.setInterpolator(pathInterpolator);
        if (TopLiveExitAnimDocEnabledSetting.isEnable()) {
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, valueAnimatorOfFloat, objectAnimatorOfFloat6);
            i = 2;
        } else {
            i = 2;
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, valueAnimatorOfFloat);
        }
        imageView.setLayerType(i, null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TopLive exit anim start, exitCause=");
        sbLIZ2.append(i2);
        C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ2));
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0aVM
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ViewGroup viewGroup2;
                ViewGroup viewGroup3;
                imageView.setLayerType(0, null);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(imageView, viewGroup3);
                }
                ViewParent parent2 = view3.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(view3, viewGroup2);
                }
                C937520aVK c937520aVK2 = C937520aVK.LIZ;
                Bitmap bitmap2 = bitmap;
                c937520aVK2.getClass();
                C937520aVK.LIZJ(bitmap2);
                C937520aVK.LJ = null;
                C937520aVK.LJFF = null;
                C937520aVK.LJI = 0L;
                C937520aVK.LJII = 0L;
                C937520aVK.LJIIIIZZ = 0;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("TopLive exit anim cancel, exitCause=");
                sbLIZ3.append(i2);
                C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ3));
                animatorSet.removeListener(this);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2;
                ViewGroup viewGroup3;
                imageView.setLayerType(0, null);
                ViewParent parent = imageView.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup3 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(imageView, viewGroup3);
                }
                ViewParent parent2 = view3.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(view3, viewGroup2);
                }
                C937520aVK c937520aVK2 = C937520aVK.LIZ;
                Bitmap bitmap2 = bitmap;
                c937520aVK2.getClass();
                C937520aVK.LIZJ(bitmap2);
                C937520aVK.LJ = null;
                C937520aVK.LJFF = null;
                C937520aVK.LJI = 0L;
                C937520aVK.LJII = 0L;
                C937520aVK.LJIIIIZZ = 0;
                if (TopLiveAddIconScaleAnimatorForExitLiveSetting.isEnable()) {
                    View view4 = view;
                    ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.SCALE_X, 1.0f, 1.2f, 1.0f);
                    ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.SCALE_Y, 1.0f, 1.2f, 1.0f);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8);
                    animatorSet2.setDuration(300L);
                    animatorSet2.start();
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("TopLive exit anim end, exitCause=");
                sbLIZ3.append(i2);
                C20441214yg.LIZIZ("MultiGuestMicHangupHelper", C2188811AlT.LIZIZ(sbLIZ3));
                C937520aVK.LIZLLL(1, null);
                animatorSet.removeListener(this);
            }
        });
        HandlerHook.viewPost(imageView, new ARunnableS102S0100000_2(animatorSet, 1));
    }

    public final void LIZ$2() {
        if (((View) this.l0).getParent() == null || ((FragmentManager) this.l1) == null) {
            return;
        }
        if (((MultiGuestAvatarPreviewFragment) this.l2).LLJILJILJ == null || !InterfaceC934710aQn.hc.LIZIZ().booleanValue()) {
            DataChannel dataChannel = ((MultiGuestAvatarPreviewFragment) this.l2).LLILZLL;
            if (dataChannel != null) {
                dataChannel.FQ2(AvatarOpenCameraEvent.class);
                return;
            }
            return;
        }
        AvatarImageSelectTips avatarImageSelectTips = ((MultiGuestAvatarPreviewFragment) this.l2).LLJILJILJ;
        MultiGuestLearningAvatarFragment multiGuestLearningAvatarFragment = new MultiGuestLearningAvatarFragment();
        multiGuestLearningAvatarFragment.LL = avatarImageSelectTips;
        multiGuestLearningAvatarFragment.show((FragmentManager) this.l1, "MultiGuestLearningAvatarFragment");
    }

    public final void LIZ$3() {
        Map map;
        Map map2;
        EnumC974980bTk enumC974980bTk = ((TeamMatchInviterFragment) this.l0).LLJJ ? EnumC974980bTk.REJECT : ((EnumC964170bCJ) this.l1).compareTo(EnumC964170bCJ.INVITED) >= 0 ? EnumC974980bTk.WITHDRAW : EnumC974980bTk.INVITE;
        C973660bRc c973660bRc = C973660bRc.LIZ;
        C16FS c16fs = ((TeamMatchInviterFragment) this.l0).LLJIJIL;
        boolean zIsEnabled = c16fs != null ? c16fs.isEnabled() : false;
        MutableLiveData mutableLiveData = (MutableLiveData) this.l2;
        List list = null;
        List list2 = (mutableLiveData == null || (map2 = (Map) mutableLiveData.getValue()) == null) ? null : (List) map2.get(Boolean.TRUE);
        MutableLiveData mutableLiveData2 = (MutableLiveData) this.l2;
        if (mutableLiveData2 != null && (map = (Map) mutableLiveData2.getValue()) != null) {
            list = (List) map.get(Boolean.FALSE);
        }
        TeamMatchInviterFragment teamMatchInviterFragment = (TeamMatchInviterFragment) this.l0;
        C973660bRc.LJJJZ(zIsEnabled, list2, list, enumC974980bTk, null, teamMatchInviterFragment.LLJILLL, false, null, false, null, null, false, C978440bZK.LJ(teamMatchInviterFragment.LLJJJIL), null, 12224);
    }

    public final void LIZ$4() {
        float fLJJI = C497740JfY.LJJI(((C1295960jpS) this.l0).getMeasuredHeight());
        float f = fLJJI / 2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGuideAnimationTriggered onFinish, guideAnimationState: ");
        sbLIZ.append((C978130bYp) this.l1);
        sbLIZ.append(", panelHeaderHeight: ");
        sbLIZ.append(52);
        sbLIZ.append(", halfHeight: ");
        sbLIZ.append(f);
        sbLIZ.append(", guideLottieHeight: ");
        sbLIZ.append(fLJJI);
        C20441214yg.LIZIZ("CombinedMatchInviterLynxPlugin", C2188811AlT.LIZIZ(sbLIZ));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.l2;
        int i = ((C978130bYp) this.l1).LIZIZ;
        if (i < 0) {
            i = 0;
        }
        layoutParams.topMargin = (int) C497740JfY.LIZIZ((i + 52) - f);
    }

    public final void LIZ$5() {
        StringBuilder sb = new StringBuilder("switchNewLayoutData, updateLocalLinkedList, before:oldList=");
        List list = (List) this.l0;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            LinkUser linkUser = (LinkUser) obj;
            Integer numValueOf = Integer.valueOf(i2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("name=");
            sbLIZ.append(linkUser.userId);
            sbLIZ.append(",linkMicId=");
            sbLIZ.append(linkUser.linkMicId);
            arrayList.add(new Pair(numValueOf, C2188811AlT.LIZIZ(sbLIZ)));
            i2 = i3;
        }
        sb.append(arrayList);
        sb.append("},newList=");
        Iterable iterable = (Iterable) ((C259800zU) this.l1).element;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
        int i4 = 0;
        for (Object obj2 : iterable) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            LinkUser linkUser2 = (LinkUser) obj2;
            Integer numValueOf2 = Integer.valueOf(i4);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("name=");
            sbLIZ2.append(linkUser2.userId);
            sbLIZ2.append(",linkMicId=");
            sbLIZ2.append(linkUser2.linkMicId);
            arrayList2.add(new Pair(numValueOf2, C2188811AlT.LIZIZ(sbLIZ2)));
            i4 = i5;
        }
        sb.append(arrayList2);
        sb.append("}, ");
        C20441214yg.LIZIZ("MultiHostCrossAdapter", sb.toString());
        StringBuilder sb2 = new StringBuilder("postUserListChangeForAnchor, updateLocalLinkedList 2_plus_2_change_position: beforeList=");
        List list2 = (List) this.l0;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(String.valueOf(((LinkUser) it2.next()).linkMicId));
        }
        sb2.append(arrayList3);
        sb2.append(", afterList=");
        Iterable iterable2 = (Iterable) ((C259800zU) this.l1).element;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(iterable2, 10));
        Iterator it3 = iterable2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(String.valueOf(((LinkUser) it3.next()).linkMicId));
        }
        sb2.append(arrayList4);
        C20441214yg.LJIIIZ("MultiHostCrossAdapter", sb2.toString());
        InterfaceC958070b2T interfaceC958070b2TLLJJ = ((InterfaceC954180awC) this.l2).LLJJ();
        if (interfaceC958070b2TLLJJ != null) {
            interfaceC958070b2TLLJJ.LJJJJJ((List) ((C259800zU) this.l1).element, null);
        }
        List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
        StringBuilder sb3 = new StringBuilder("switchNewLayoutData, updateLocalLinkedList, after:updatedList=");
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listLLLLIILL, 10));
        for (LinkUser linkUser3 : listLLLLIILL) {
            int i6 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            LinkUser linkUser4 = linkUser3;
            Integer numValueOf3 = Integer.valueOf(i);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("name=");
            sbLIZ3.append(linkUser4.userId);
            sbLIZ3.append(",linkMicId=");
            sbLIZ3.append(linkUser4.linkMicId);
            arrayList5.add(new Pair(numValueOf3, C2188811AlT.LIZIZ(sbLIZ3)));
            i = i6;
        }
        sb3.append(arrayList5);
        sb3.append("}, ");
        C20441214yg.LIZIZ("MultiHostCrossAdapter", sb3.toString());
    }

    public final void LIZ$6() {
        Boolean boolLJLZ;
        try {
            C416040GTa c416040GTa = ((C940950aar) this.l0).LLJJ;
            if (c416040GTa != null) {
                C930540aK4.LJJIJL(c416040GTa);
            }
            C940950aar c940950aar = (C940950aar) this.l0;
            C416040GTa c416040GTa2 = c940950aar.LLJJ;
            if (c416040GTa2 != null) {
                c416040GTa2.setCornerRadius(c940950aar.getCornerRadius());
            }
            Context context = ((C940950aar) this.l0).getContext();
            Rect rect = (Rect) this.l1;
            Rect rect2 = (Rect) this.l2;
            InterfaceC940060aZQ externalLayout = ((C940950aar) this.l0).getExternalLayout();
            FrameLayout.LayoutParams layoutParamsLIZIZ = C939550aYb.LIZIZ(context, rect, rect2, externalLayout instanceof InterfaceC937900aVw ? (InterfaceC937900aVw) externalLayout : null);
            String realTag = ((C940950aar) this.l0).getRealTag();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateBorderViewV2 offsetLayoutParam leftMargin=");
            sbLIZ.append(layoutParamsLIZIZ.leftMargin);
            sbLIZ.append(" topMargin=");
            sbLIZ.append(layoutParamsLIZIZ.topMargin);
            C937310aUz.LJII(realTag, C2188811AlT.LIZIZ(sbLIZ));
            C416040GTa c416040GTa3 = ((C940950aar) this.l0).LLJJ;
            if (c416040GTa3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c416040GTa3);
                c416040GTa3.setLayoutParams(layoutParamsLIZIZ);
            }
            C940950aar c940950aar2 = (C940950aar) this.l0;
            C416040GTa c416040GTa4 = c940950aar2.LLJJ;
            if (c416040GTa4 != null) {
                c940950aar2.LLJI.addView(c416040GTa4);
            }
            C416040GTa c416040GTa5 = ((C940950aar) this.l0).LLJJ;
            if (c416040GTa5 != null) {
                c416040GTa5.bringToFront();
            }
            C416040GTa c416040GTa6 = ((C940950aar) this.l0).LLJJ;
            if (c416040GTa6 != null) {
                c416040GTa6.invalidate();
            }
            C940950aar c940950aar3 = (C940950aar) this.l0;
            C416040GTa c416040GTa7 = c940950aar3.LLJJ;
            if (c416040GTa7 == null || (boolLJLZ = c940950aar3.LLJJIJI.LJLZ()) == null || !(!boolLJLZ.booleanValue())) {
                return;
            }
            c940950aar3.setNormalBorderBg(c416040GTa7);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String realTag2 = ((C940950aar) this.l0).getRealTag();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateBorderViewV2 error=");
            sbLIZ2.append(e);
            C937310aUz.LJFF(realTag2, C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static final void run$0(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("RoundCornerStyle@1068.cancelStyle$1$1");
        try {
            C930540aK4.LJJIJL((View) aRunnableS48S0300000_15.l0);
            ((C937980aW4) aRunnableS48S0300000_15.l1).LJIIIZ().remove((View) aRunnableS48S0300000_15.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RoundCornerStyle@1068.cancelStyle$1$1");
    }

    public static final void run$1(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("RoundCornerStyleV2@5fb3.handleStyle$1");
        try {
            aRunnableS48S0300000_15.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RoundCornerStyleV2@5fb3.handleStyle$1");
    }

    public static final void run$10(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MatchingStateFinishExtKt@cd18.requestMultiFinishApi$4$1");
        try {
            C976230bVl.LIZ((C975970bVL) aRunnableS48S0300000_15.l0, (InterfaceC976360bVy) aRunnableS48S0300000_15.l1, 105, false, 0L, ((C118300cf) aRunnableS48S0300000_15.l2).element, 0L, 64);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchingStateFinishExtKt@cd18.requestMultiFinishApi$4$1");
    }

    public static final void run$11(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("CompetitionStateSettlementExtKt@5584.requestSettlementEndApi$2$1");
        try {
            C982360bfe.LIZ((AbstractC981980bf2) aRunnableS48S0300000_15.l1, (InterfaceC983270bh7) aRunnableS48S0300000_15.l2, 105, ((C118300cf) aRunnableS48S0300000_15.l0).element, 32);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CompetitionStateSettlementExtKt@5584.requestSettlementEndApi$2$1");
    }

    public static final void run$12(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiHostCrossAdapterImpl@dfc5.postUserListChangeForAnchor$3");
        try {
            aRunnableS48S0300000_15.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiHostCrossAdapterImpl@dfc5.postUserListChangeForAnchor$3");
    }

    public static final void run$13(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("TwoMatchInviterViewModel@1a1b.sendInviteWithEvent$1");
        try {
            ((C977620bY0) aRunnableS48S0300000_15.l0).LJIL((C975600bUk) aRunnableS48S0300000_15.l1, (Function0) aRunnableS48S0300000_15.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TwoMatchInviterViewModel@1a1b.sendInviteWithEvent$1");
    }

    public static final void run$14(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("BorderBizViewElement@9067.updateBorderViewV2$1$runnable$1");
        try {
            aRunnableS48S0300000_15.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BorderBizViewElement@9067.updateBorderViewV2$1$runnable$1");
    }

    public static final void run$2(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestMicHangupHelper@f073.tryPlayTopLiveExitAnimAfterHome$1");
        try {
            aRunnableS48S0300000_15.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestMicHangupHelper@f073.tryPlayTopLiveExitAnimAfterHome$1");
    }

    public static final void run$3(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestAvatarPreviewFragment@53ab.onCustomizeClick$1");
        try {
            aRunnableS48S0300000_15.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestAvatarPreviewFragment@53ab.onCustomizeClick$1");
    }

    public static final void run$4(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("TeamMatchInviterFragment@9fba.initSelectionView$4");
        try {
            aRunnableS48S0300000_15.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TeamMatchInviterFragment@9fba.initSelectionView$4");
    }

    public static final void run$5(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("CompetitionInfoIdentifier@fc80.retryCheckCompetitionInfo$1");
        try {
            C970560bMc c970560bMc = (C970560bMc) aRunnableS48S0300000_15.l0;
            LiveWidget liveWidget = (LiveWidget) aRunnableS48S0300000_15.l1;
            Function2 function2 = (Function2) aRunnableS48S0300000_15.l2;
            c970560bMc.getClass();
            C963790bBh.LIZ(liveWidget, EnumC919170a1j.MATCH_TYPE_TAKE_THE_STAGE, "audience_room_enter", new AwS381S0200000_15(c970560bMc, function2, 80), new AwS244S0000000_12(2));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CompetitionInfoIdentifier@fc80.retryCheckCompetitionInfo$1");
    }

    public static final void run$6(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("CombinedMatchInviterViewModel@5274.sendInviteWithEvent$1");
        try {
            ((C977630bY1) aRunnableS48S0300000_15.l0).LJJIIJ((C975600bUk) aRunnableS48S0300000_15.l1, (Function0) aRunnableS48S0300000_15.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CombinedMatchInviterViewModel@5274.sendInviteWithEvent$1");
    }

    public static final void run$7(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("CombinedMatchInviterLynxPlugin@5b9c.onGuideAnimationTriggered$3$onFinish$1");
        try {
            aRunnableS48S0300000_15.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CombinedMatchInviterLynxPlugin@5b9c.onGuideAnimationTriggered$3$onFinish$1");
    }

    public static final void run$8(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MatchBattleInfoIdentifier@830f.retryCheckBattleInfo$1");
        try {
            C970630bMj c970630bMj = (C970630bMj) aRunnableS48S0300000_15.l0;
            LiveWidget liveWidget = (LiveWidget) aRunnableS48S0300000_15.l1;
            Function2 function2 = (Function2) aRunnableS48S0300000_15.l2;
            c970630bMj.getClass();
            C970760bMw.LIZ(liveWidget, 0L, EnumC970440bMQ.BATTLE_INFO_SCENE_MISS_OPEN.getType(), new AwS594S0100000_15(function2, (Function2<? super Boolean, ? super String, Unit>) 889), new AwS244S0000000_12(5));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchBattleInfoIdentifier@830f.retryCheckBattleInfo$1");
    }

    public static final void run$9(ARunnableS48S0300000_15 aRunnableS48S0300000_15) {
        boolean zLIZ;
        C1C7U.LIZ("MatchSeiIdentifier@bb88.retryCheckBattleInfo$1");
        try {
            C970310bMD c970310bMD = (C970310bMD) aRunnableS48S0300000_15.l0;
            LiveWidget liveWidget = (LiveWidget) aRunnableS48S0300000_15.l1;
            Function2 function2 = (Function2) aRunnableS48S0300000_15.l2;
            c970310bMD.getClass();
            C970760bMw.LIZ(liveWidget, 0L, EnumC970440bMQ.BATTLE_INFO_SCENE_SEI_FALLBACK.getType(), new AwS594S0100000_15(function2, (Function2<? super Boolean, ? super String, Unit>) 890), new AwS244S0000000_12(6));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchSeiIdentifier@bb88.retryCheckBattleInfo$1");
    }

    public ARunnableS48S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
