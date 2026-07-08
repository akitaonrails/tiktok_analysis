package X;

import Y.AUListenerS268S0100000_19;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.appdiff.ICommonFeedAppDiffProtocol;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.casting.api.ICastingPlayerService;
import com.ss.android.ugc.aweme.casting.api.ICastingSeekListener;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.tako.detail.model.TakoKeyFramePoint;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS53S0010000_9;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.1Czp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2248671Czp implements C0JO2, InterfaceC1211710hdZ, ICastingSeekListener {
    public static int LLLIIL;
    public final C12P2 LL;
    public final ViewGroup LLILLJJLI;
    public final View LLILLL;
    public final ImageView LLILZ;
    public final ScrollSwitchStateManager LLILZIL;
    public final VideoSeekBarMaskView LLILZLL;
    public final C1213920hh8 LLIZ;
    public final C586640Mze LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final int LLJILJIL;
    public final BPEAHandler LLJILJILJ;
    public final C01GW LLJILLL;
    public Aweme LLJJ;
    public final List<SearchKeyFramePoint> LLJJI;
    public int LLJJIII;
    public Aweme LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public long LLJJJJ;
    public IBaseListFragmentPanel LLJJJJJIL;
    public String LLJJJJLIIL;
    public String LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public int LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public long LLL;
    public boolean LLLF;
    public int LLLFF;
    public long LLLFFI;
    public boolean LLLFZ;
    public C09MI LLLI;
    public C2248761Czy LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public final RunnableC1211120hcc LLLIIIL;

    @Override // X.InterfaceC1211710hdZ
    public void LIZJ() {
    }

    @Override // X.InterfaceC1211710hdZ
    public void LJFF() {
    }

    public String LJIILIIL() {
        return "CommonControl";
    }

    public boolean LJIIZILJ(Object obj) {
        return true;
    }

    public final boolean LJIIIIZZ() {
        Video video;
        if (((Number) C04VS.LIZ.getValue()).intValue() != 1 && !LJIILL()) {
            Aweme aweme = this.LLJJ;
            long duration = (aweme == null || (video = aweme.getVideo()) == null) ? 0L : video.getDuration();
            IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
            if (!C1867340yh2.LIZIZ(duration, iBaseListFragmentPanel != null ? iBaseListFragmentPanel.C7(true) : null)) {
                return false;
            }
        }
        return true;
    }

    public final C2248761Czy LJIIJJI() {
        C2248761Czy c2248761Czy = this.LLLII;
        if (c2248761Czy != null) {
            return c2248761Czy;
        }
        return null;
    }

    public final boolean LJIILJJIL() {
        C0N0Y c0n0yLJLJJI;
        IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
        if (iBaseListFragmentPanel == null || (c0n0yLJLJJI = iBaseListFragmentPanel.getPlayerManager()) == null) {
            c0n0yLJLJJI = C1483410ohn.LJLJJI();
        }
        return c0n0yLJLJJI.isPaused();
    }

    public final boolean LJIILL() {
        IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
        if (!C0RE9.LIZ(iBaseListFragmentPanel != null ? iBaseListFragmentPanel.C7(true) : null)) {
            return false;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LLJJJJJIL;
        return c1er1.LJJLIIIJL(this.LLJJ, iBaseListFragmentPanel2 != null ? iBaseListFragmentPanel2.C7(true) : null);
    }

    public final boolean LJIILLIIL() {
        IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
        if (!C0RE9.LIZ(iBaseListFragmentPanel != null ? iBaseListFragmentPanel.C7(true) : null)) {
            return false;
        }
        C1ER1 c1er1 = C1ER1.LIZIZ;
        IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LLJJJJJIL;
        return c1er1.LLJZIJLIL(this.LLJJ, iBaseListFragmentPanel2 != null ? iBaseListFragmentPanel2.C7(true) : null);
    }

    public final int LJIJ() {
        Context context = this.LL.getContext();
        int i = C14LC.LJIILIIL;
        return LJIJJ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86)) + ((int) C12ES.LIZJ(i, context)) : ((int) C12ES.LIZJ(i, this.LL.getContext())) + ((int) C12ES.LIZJ(60.0f, this.LL.getContext())) + ((int) C12ES.LIZJ(30.0f, this.LL.getContext()));
    }

    public final int LJIJJLI() {
        Context context = this.LL.getContext();
        int i = C14LC.LJIILIIL;
        int iLIZJ = (int) C12ES.LIZJ(i, context);
        int iLIZJ2 = ((int) (C12ES.LIZJ(i, this.LL.getContext()) + C12ES.LIZJ(60.0f, this.LL.getContext()))) + ((int) C12ES.LIZJ(44.0f, this.LL.getContext())) + (LJIILL() ? (int) C12ES.LIZJ(11.0f, this.LL.getContext()) : 0);
        if (LJIJJ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(LJIILL() ? 122 : 118))) + iLIZJ;
        }
        return iLIZJ2;
    }

    public final boolean LJIJJ() {
        C09MI c09mi;
        return LJIIIIZZ() && (c09mi = this.LLLI) != null && c09mi.LIZ();
    }

    public final int LJIL() {
        return LJIJJ() ? LJIILL() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)) : (int) C12ES.LIZJ(60.0f, this.LL.getContext());
    }

    @Override // X.InterfaceC1211710hdZ
    public void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
        this.LLJJJJJIL = null;
        this.LLJILJILJ.removeCallbacks(this.LLLIIIL);
        C09MI c09mi = this.LLLI;
        if (c09mi != null) {
            C11LR c11lr = c09mi.LJIIL;
            if (c11lr != null) {
                c11lr.cancel();
            }
            c09mi.LJIIJJI = null;
            c09mi.LJI = null;
            if (c09mi.LJIIIZ) {
                c09mi.LJIIIIZZ.clear();
            }
        }
    }

    @Override // X.InterfaceC1211710hdZ
    public final String getEventType() {
        return this.LLJJJJLIIL;
    }

    public static int LJIIIZ(int i) {
        if (i < 3600) {
            return ((i / 60) * 60) + (i % 60);
        }
        return ((i / 3600) * 3600) + LJIIIZ(i % 3600);
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingSeekListener
    public final void LIZLLL(Aweme aweme) {
        if (aweme != null) {
            this.LLJJ = aweme;
            LJIJI(aweme);
            LJJIFFI(true);
        }
    }

    public final boolean LJII(Aweme aweme) {
        Fragment fragment;
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = c1618440sDa.LJJIIJ();
        IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
        C0SZ8 c0sz8LJLIL = null;
        if (iBaseListFragmentPanel != null) {
            fragment = iBaseListFragmentPanel.getFragment();
        } else {
            fragment = null;
        }
        if (interfaceC706770RnvLJJIIJ.LJJIIJZLJL(fragment)) {
            this.LLIZLLLIL.LJIIJ("can not show seekbar, in story immersiveFeed", aweme);
            return false;
        }
        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ2 = c1618440sDa.LJJIIJ();
        IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LLJJJJJIL;
        if (iBaseListFragmentPanel2 != null) {
            c0sz8LJLIL = iBaseListFragmentPanel2.LJLIL();
        }
        if (interfaceC706770RnvLJJIIJ2.LJIJI(c0sz8LJLIL)) {
            this.LLIZLLLIL.LJIIIZ("can not show seekbar, in story guide card");
            return false;
        }
        if (1 != this.LLJJIII) {
            this.LLIZLLLIL.LJIIJ("can not show seekbar, state: 1, not in resume", aweme);
            return false;
        }
        if (!C1591860rWi.LIZIZ(aweme)) {
            this.LLIZLLLIL.LJIIJ("can not show seekbar, state: 2, can not drag", aweme);
            return false;
        }
        if (!this.LLJZ) {
            ICommonFeedAppDiffProtocol.LIZ.getClass();
            if (!C1865480ye2.LIZ().LJIIL(new AwS429S0200000_28(this, aweme, 87))) {
                this.LLIZLLLIL.LJIIJ("can not show seekbar, state: 3, not current aweme", aweme);
                return false;
            }
        }
        if (!C1591860rWi.LIZJ(aweme)) {
            this.LLIZLLLIL.LJIIJ("can not show seekbar, state: 4, can not show progressbar", aweme);
            return false;
        }
        if (C729510SjV.LJJIJIL(aweme)) {
            this.LLIZLLLIL.LJIIJ("can not show seekbar, state: 5, is story video", aweme);
            return false;
        }
        if (!C278120AvC.LIZ(aweme)) {
            this.LLIZLLLIL.LJIILL("can not show seekbar, state: 6, hit inverse expriment");
            return false;
        }
        if (C10IT.LJIIJJI(aweme)) {
            this.LLIZLLLIL.LJIILL("can not show seekbar, state: 7, video has mask");
            return false;
        }
        if (aweme == null || !AwemeExtKt.isProhibitedAndShouldTell(aweme)) {
            return true;
        }
        this.LLIZLLLIL.LJIILL("can not show seekbar, state: 10, video is prohibited");
        return false;
    }

    public final int LJIIJ(int i) {
        return (int) (((i / 100.0f) * this.LLJJIJIIJIL) / 100);
    }

    public final int LJIIL(boolean z) {
        Aweme aweme;
        if (this.LLJJIJIIJIL < 30) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            if ((!C586380MzE.LIZ().LIZIZ(this.LLJJJJLIIL) || z) && ((aweme = this.LLJJ) == null || aweme.getAwemeType() != 502)) {
                return 4;
            }
        }
        return 0;
    }

    public final void LJIJI(Aweme aweme) {
        String aid;
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme aweme2 = this.LLJJIJI;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        }
        if (!TextUtils.equals(aid, aid2)) {
            this.LLJJIJI = aweme;
            LJJIFFI(true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public final void LJJIFFI(boolean z) {
        String strC7;
        Aweme aweme;
        int duration;
        Map<String, List<TakoKeyFramePoint>> mapLJZ;
        List<TakoKeyFramePoint> list;
        float f;
        String aid;
        int duration2;
        int iLJIIL;
        C19749612Ow mutableSeekBar;
        int iValueOf;
        Video video;
        Video video2;
        int duration3;
        Aweme aweme2;
        LifecycleOwner lifecycleOwnerLIZIZ;
        Fragment fragment;
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        String aid2 = null;
        if (!this.LLJLIL && (lifecycleOwnerLIZIZ = C1388190mED.LIZIZ(this.LL.getContext())) != null) {
            this.LLJLIL = true;
            IBaseListFragmentPanel iBaseListFragmentPanel = this.LLJJJJJIL;
            if (iBaseListFragmentPanel != null && (fragment = iBaseListFragmentPanel.getFragment()) != null && (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) != null && (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) != null) {
                lifecycleOwnerLIZIZ = fragmentLIZLLL;
            }
            ScrollSwitchStateManager scrollSwitchStateManager = this.LLILZIL;
            if (scrollSwitchStateManager != null) {
                scrollSwitchStateManager.HQ2(lifecycleOwnerLIZIZ, new Observer() { // from class: X.1Czw
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        VerticalViewPager verticalViewPagerLLLIIIIL;
                        int iIntValue = ((Number) obj).intValue();
                        ScrollSwitchStateManager scrollSwitchStateManager2 = this.LL.LLILZIL;
                        CommonPageFragment commonPageFragmentZQ2 = null;
                        if (scrollSwitchStateManager2 != null) {
                            commonPageFragmentZQ2 = scrollSwitchStateManager2.zQ2();
                        }
                        if ((commonPageFragmentZQ2 instanceof IDetailBaseAbility) || (commonPageFragmentZQ2 != null && C1600710rkz.LIZ(commonPageFragmentZQ2) != null)) {
                            C2248671Czp c2248671Czp = this.LL;
                            c2248671Czp.LJJI(c2248671Czp.LLJJ, iIntValue, true);
                        }
                        IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LL.LLJJJJJIL;
                        if (iBaseListFragmentPanel2 != null && (verticalViewPagerLLLIIIIL = iBaseListFragmentPanel2.LLLIIIIL()) != null) {
                            verticalViewPagerLLLIIIIL.setCanTouch(true);
                        }
                    }
                });
            }
            ScrollSwitchStateManager scrollSwitchStateManager2 = this.LLILZIL;
            if (scrollSwitchStateManager2 != null) {
                scrollSwitchStateManager2.LLJJJJJIL.observe(lifecycleOwnerLIZIZ, new Observer() { // from class: X.1Czv
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        Fragment fragment2;
                        VerticalViewPager verticalViewPagerLLLIIIIL;
                        WeakReference<Fragment> weakReference;
                        int iIntValue = ((Number) obj).intValue();
                        ScrollSwitchStateManager scrollSwitchStateManager3 = this.LL.LLILZIL;
                        if (scrollSwitchStateManager3 != null && (weakReference = scrollSwitchStateManager3.LLJJJIL) != null) {
                            fragment2 = weakReference.get();
                        } else {
                            fragment2 = null;
                        }
                        boolean zLIZLLL = C1591860rWi.LIZLLL(fragment2);
                        C2248671Czp c2248671Czp = this.LL;
                        c2248671Czp.LJJI(c2248671Czp.LLJJ, iIntValue, zLIZLLL);
                        IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LL.LLJJJJJIL;
                        if (iBaseListFragmentPanel2 != null && (verticalViewPagerLLLIIIIL = iBaseListFragmentPanel2.LLLIIIIL()) != null) {
                            verticalViewPagerLLLIIIIL.setCanTouch(true);
                        }
                    }
                });
            }
        }
        C12P2 c12p2 = this.LL;
        Float fLIZJ = C705490Rlr.LIZJ(this.LLJJ);
        Float fLIZ = C705490Rlr.LIZ(this.LLJJ);
        C19749612Ow c19749612Ow = c12p2.LLILLJJLI;
        if (c19749612Ow != null) {
            C19749712Ox c19749712Ox = c19749612Ow.LLILZ;
            c19749712Ox.LJIIIZ = fLIZJ;
            c19749712Ox.LJIIJ = fLIZ;
            c19749712Ox.invalidateSelf();
        }
        if ((!Intrinsics.LJFF(this.LLJJJJLIIL, "paid_series_detail_page")) && z) {
            this.LL.setProgress(0.0f);
        }
        if (LJII(this.LLJJ) || ((aweme2 = this.LLJJ) != null && aweme2.getAwemeType() == 502)) {
            ((ArrayList) this.LLJJI).clear();
            ArrayList arrayList = new ArrayList();
            if (LJIILLIIL()) {
                Aweme aweme3 = this.LLJJ;
                if (aweme3 != null) {
                    for (SearchKeyFramePoint searchKeyFramePoint : ((C0PYD) C0Q3E.LIZJ(aweme3).Y30().LIZJ()).LLILZLL) {
                        Video video3 = aweme3.getVideo();
                        if (video3 != null) {
                            duration3 = video3.getDuration();
                        } else {
                            duration3 = 0;
                        }
                        int iLIZJ = C0QBT.LIZJ(duration3);
                        if (searchKeyFramePoint.secondStart * 1000.0f < duration3) {
                            searchKeyFramePoint.LIZIZ = LJIIIZ(r1) / iLIZJ;
                            ((ArrayList) this.LLJJI).add(searchKeyFramePoint);
                        }
                    }
                }
                List<SearchKeyFramePoint> list2 = this.LLJJI;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator it2 = ((ArrayList) list2).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(((SearchKeyFramePoint) it2.next()).LIZIZ));
                }
                arrayList.addAll(arrayList2);
            } else if (C07I7.LIZ()) {
                C14TF c14tf = C14TF.LIZIZ;
                IBaseListFragmentPanel iBaseListFragmentPanel2 = this.LLJJJJJIL;
                if (iBaseListFragmentPanel2 != null) {
                    strC7 = iBaseListFragmentPanel2.C7(true);
                } else {
                    strC7 = null;
                }
                if (c14tf.LJJJJIZL(strC7) && (aweme = this.LLJJ) != null) {
                    Video video4 = aweme.getVideo();
                    if (video4 != null) {
                        duration = video4.getDuration();
                    } else {
                        duration = 0;
                    }
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL.getContext());
                    if (c19egLIZIZ != null && (mapLJZ = C14TF.LIZIZ.LJZ(c19egLIZIZ)) != null && (list = mapLJZ.get(aweme.getAid())) != null) {
                        Iterator<TakoKeyFramePoint> it3 = list.iterator();
                        while (it3.hasNext()) {
                            double d = it3.next().timestamp * ((double) LSPassThroughRecordSizeConfig.DEFAULT);
                            double d2 = duration;
                            if (d < d2) {
                                f = (float) (d / d2);
                            } else {
                                f = 0.0f;
                            }
                            arrayList.add(Float.valueOf(f));
                        }
                    }
                }
            }
            this.LL.setKeyPointsProgressPositions(arrayList);
            C12P2 c12p22 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12p22);
            c12p22.setAlpha(1.0f);
            C786410Ut5.a0(this.LL, 0);
            C586640Mze c586640Mze = this.LLIZLLLIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show progressbar:");
            Aweme aweme4 = this.LLJJ;
            if (aweme4 != null) {
                aid = aweme4.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            c586640Mze.LJ(C2188811AlT.LIZIZ(sbLIZ));
            LJIIJJI().LIZ();
            Aweme aweme5 = this.LLJJ;
            if (aweme5 != null && (video2 = aweme5.getVideo()) != null) {
                duration2 = video2.getDuration();
            } else {
                duration2 = 0;
            }
            this.LLJJIJIIJIL = C0QBT.LIZJ(duration2);
            Aweme aweme6 = this.LLJJ;
            if (aweme6 != null) {
                C20703515zt.LJIIIIZZ(aweme6);
            }
            for (C1D03 c1d03 : LJIIJJI().LIZ) {
                ?? r1 = c1d03.LIZLLL;
                if (r1 != 0) {
                    r1.invoke(c1d03.LIZ);
                }
            }
            if (C274240Aow.LIZ() && (mutableSeekBar = this.LL.getMutableSeekBar()) != null) {
                Aweme aweme7 = this.LLJJ;
                if (aweme7 != null && (video = aweme7.getVideo()) != null) {
                    iValueOf = Integer.valueOf(video.getDuration());
                } else {
                    iValueOf = 0;
                }
                mutableSeekBar.setVideoDuration(iValueOf);
            }
            if ((!Intrinsics.LJFF(this.LLJJJJLIIL, "paid_series_detail_page")) && z) {
                this.LL.LIZIZ(0.0f, false);
            }
            C12P2 c12p23 = this.LL;
            if (this.LLJZ && LJIILJJIL()) {
                iLJIIL = 1;
            } else {
                iLJIIL = LJIIL(false);
            }
            c12p23.setSeekBarShowType(iLJIIL);
            C20285114Yv c20285114Yv = C20285114Yv.LIZ;
            Aweme aweme8 = this.LLJJ;
            c20285114Yv.getClass();
            if (C14Z4.LIZIZ(aweme8)) {
                C01GW<C20285414Yy> c01gw = C20285414Yy.LIZLLL;
                C20285414Yy c20285414YyLIZ = C988000bok.LIZ();
                if (aweme8 != null) {
                    aid2 = aweme8.getAid();
                }
                if (c20285414YyLIZ.LIZ(aid2)) {
                    C786410Ut5.a0(this.LL, 8);
                }
            }
            if (C299690Bot.LIZIZ()) {
                this.LLLIIIIL = true;
                this.LLLIIII = false;
                return;
            }
            return;
        }
        C786410Ut5.a0(this.LL, 8);
        LJIIJJI().LIZ();
        C586640Mze c586640Mze2 = this.LLIZLLLIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hide progressbar:");
        Aweme aweme9 = this.LLJJ;
        if (aweme9 != null) {
            aid2 = aweme9.getAid();
        }
        sbLIZ2.append(aid2);
        sbLIZ2.append(", isReverseEnable: ");
        sbLIZ2.append(C278120AvC.LIZ(this.LLJJ));
        c586640Mze2.LJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @C14EU
    public final void onBackgroundSurveyEvent(C20289414aC c20289414aC) {
        String aid;
        String str = c20289414aC.LIZIZ;
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            if (!c20289414aC.LIZ) {
                LIZJ();
            } else {
                LJFF();
            }
            if (c20289414aC.LIZ) {
                this.LLIZLLLIL.LJIIJJI(new AwS578S0100000_34(c20289414aC, 115));
                C786410Ut5.a0(this.LL, 8);
            } else {
                if (!LJII(this.LLJJ)) {
                    return;
                }
                C786410Ut5.a0(this.LL, 0);
            }
        }
    }

    @C14EU
    public final void onDowngradeRecovery(C1619850sFr c1619850sFr) {
        Aweme aweme;
        C19EG c19eg;
        IFeedPanelPlatformAbility iFeedPanelPlatformAbilityLIZJ;
        if (!LJIIZILJ(c1619850sFr) || (aweme = c1619850sFr.LIZ) == null) {
            return;
        }
        this.LLJJ = aweme;
        LJIJI(aweme);
        String str = c1619850sFr.LIZIZ;
        if (str == null) {
            str = "";
        }
        this.LLJJJJLIIL = str;
        if (this.LLJJJJJIL == null) {
            Activity activityLIZ = C2421209eE.LIZ();
            IBaseListFragmentPanel iBaseListFragmentPanel = null;
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                if (c446900Hfk.LIZ(c19eg).LQ2("For You")) {
                    Fragment fragmentKi = c446900Hfk.LIZ(c19eg).Ki("For You");
                    if (fragmentKi != null) {
                        iFeedPanelPlatformAbilityLIZJ = C0T1R.LIZJ(fragmentKi);
                    } else {
                        iFeedPanelPlatformAbilityLIZJ = null;
                    }
                    if (iFeedPanelPlatformAbilityLIZJ instanceof IBaseListFragmentPanel) {
                        iBaseListFragmentPanel = (IBaseListFragmentPanel) iFeedPanelPlatformAbilityLIZJ;
                    }
                    this.LLJJJJJIL = iBaseListFragmentPanel;
                }
            }
        }
        LJJIFFI(true);
    }

    @C14EU
    public final void onFullFeedFragmentPageStateChangeEvent(C588040N4o c588040N4o) {
        if (LJIIZILJ(c588040N4o) && LJII(c588040N4o.LIZ)) {
            LJJI(c588040N4o.LIZ, c588040N4o.LIZIZ, true);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onFullFeedVideoChangeEvent(C1D01 c1d01) {
        IBaseListFragmentPanel iBaseListFragmentPanel = c1d01.LIZLLL;
        C586640Mze c586640Mze = this.LLIZLLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFullFeedVideoChangeEvent, mIsTrackingTouch=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(", panel.pageResumed=");
        sbLIZ.append(iBaseListFragmentPanel.LJII());
        c586640Mze.LJIIJ(C2188811AlT.LIZIZ(sbLIZ), c1d01.LIZ);
        if (iBaseListFragmentPanel.LJII() && LJIIZILJ(c1d01)) {
            Aweme aweme = c1d01.LIZ;
            this.LLJJ = aweme;
            String str = c1d01.LIZIZ;
            if (str == null) {
                str = "";
            }
            this.LLJJJJLIIL = str;
            this.LLJJLIIIJLLLLLLLZ = c1d01.LIZJ;
            this.LLJJJJJIL = iBaseListFragmentPanel;
            if (!this.LLJLILLLLZIIL) {
                this.LLJLLIL = false;
            }
            if (C0N6Z.LJIIIZ && C2245741Cv6.LIZIZ(aweme)) {
                LJIJI(c1d01.LIZ);
            }
            if (C0SXF.LJJ(c1d01.LIZ)) {
                LJIJI(c1d01.LIZ);
            }
            if (C299690Bot.LIZ() && this.LLJJIJI == null) {
                LJIJI(c1d01.LIZ);
            }
            LJJIFFI(true);
        }
    }

    @C14EU
    public final void onInnerOuterFeedAwemeResetEvent(C1600870rlF c1600870rlF) {
        Aweme aweme = c1600870rlF.LIZ;
        if (aweme == null) {
            return;
        }
        this.LLJJ = aweme;
        LJIJI(aweme);
    }

    @C14EU
    public final void onPlayerControllerVideoPlayProgressChange(C2248751Czx c2248751Czx) {
        Boolean boolValueOf;
        IBaseListFragmentPanel iBaseListFragmentPanel;
        boolean userVisibleHint;
        boolean z = c2248751Czx.LJI;
        boolean zLJIIZILJ = LJIIZILJ(c2248751Czx);
        Aweme aweme = c2248751Czx.LIZ;
        float f = c2248751Czx.LIZJ;
        String str = c2248751Czx.LIZIZ;
        IBaseListFragmentPanel iBaseListFragmentPanel2 = c2248751Czx.LIZLLL;
        if (iBaseListFragmentPanel2 != null) {
            userVisibleHint = iBaseListFragmentPanel2.getUserVisibleHint();
        } else {
            WeakReference<IBaseListFragmentPanel> weakReference = c2248751Czx.LJ;
            if (weakReference != null && (iBaseListFragmentPanel = weakReference.get()) != null) {
                userVisibleHint = iBaseListFragmentPanel.getUserVisibleHint();
            } else {
                boolValueOf = null;
                LJJ(z, zLJIIZILJ, aweme, f, str, boolValueOf);
            }
        }
        boolValueOf = Boolean.valueOf(userVisibleHint);
        LJJ(z, zLJIIZILJ, aweme, f, str, boolValueOf);
    }

    @C14EU
    public final void onPlayerControllerVideoStatusEvent(C722910SXh c722910SXh) {
        this.LLJZ = c722910SXh.LJ;
        if (LJIIZILJ(c722910SXh) && LJII(c722910SXh.LIZ)) {
            int i = c722910SXh.LIZJ;
            if (i != 1) {
                if (i == 2) {
                    this.LL.setPauseStatus(false);
                    if (this.LLJLILLLLZIIL && !this.LLJLL) {
                        this.LL.setSeekBarShowType(LJIIL(false));
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.LLJZ) {
                C786410Ut5.a0(this.LL, 0);
            }
            this.LLJLLL = 0;
            this.LL.setPauseStatus(true);
            this.LL.setSeekBarShowType(1);
            this.LLJILJILJ.removeCallbacks(this.LLLIIIL);
            this.LLJLL = false;
        }
    }

    @C14EU
    public final void onRenderFirstFrame(C1584420rKi c1584420rKi) {
        long jLongValue;
        LruCache<String, Long> lruCache;
        Long l;
        String aid;
        if (LJIIZILJ(c1584420rKi)) {
            Aweme aweme = this.LLJJIJI;
            LJIJI(c1584420rKi.LIZ);
            this.LLIZLLLIL.LJIIJ("onRenderFirstFrame, set renderAweme", this.LLJJIJI);
            String aid2 = null;
            if (((Boolean) C309540CBk.LIZ.getValue()).booleanValue()) {
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                Aweme aweme2 = this.LLJJIJI;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                }
                if (TextUtils.equals(aid, aid2)) {
                    LJJIFFI(true);
                }
            } else {
                LJJIFFI(true);
            }
            this.LLLFF = 0;
            Aweme aweme3 = this.LLJJ;
            String str = this.LLJJJJLIIL;
            if (aweme3 != null && aweme3.getAid() != null && (lruCache = C583820Mv6.LJI.get(str)) != null && (l = lruCache.get(aweme3.getAid())) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            this.LLLFFI = jLongValue;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[PHI: r0
      0x0094: PHI (r0v74 java.util.List) = (r0v73 java.util.List), (r0v82 java.util.List) binds: [B:42:0x0092, B:32:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0JO2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStartTrackingTouch(android.widget.SeekBar r16) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2248671Czp.onStartTrackingTouch(android.widget.SeekBar):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:268:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[PHI: r0
      0x009b: PHI (r0v251 java.util.List) = (r0v250 java.util.List), (r0v259 java.util.List) binds: [B:42:0x0099, B:32:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185  */
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
    @Override // X.C0JO2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onStopTrackingTouch(android.widget.SeekBar r18) {
        /*
            Method dump skipped, instruction units count: 1826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2248671Czp.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        C1597406Ng c1597406Ng;
        Boolean bool;
        C1597406Ng c1597406Ng2;
        int i = c737030Svd.LIZ;
        if (i != 76) {
            boolean zBooleanValue = false;
            if (i != 80) {
                if (i == 83 && C0COM.LIZIZ()) {
                    Object obj = c737030Svd.LIZIZ;
                    if ((obj instanceof C1597406Ng) && (c1597406Ng2 = (C1597406Ng) obj) != null) {
                        boolean z = c1597406Ng2.LIZ;
                        if (this.LL.getSeekBarShowType() != 1) {
                            if (LJII(this.LLJJ) && z) {
                                this.LL.setSeekBarShowType(0);
                                return;
                            } else {
                                this.LL.setSeekBarShowType(LJIIL(true));
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            Object obj2 = c737030Svd.LIZIZ;
            if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
                zBooleanValue = bool.booleanValue();
            }
            VideoSeekBarMaskView videoSeekBarMaskView = this.LLILZLL;
            if (videoSeekBarMaskView != null) {
                videoSeekBarMaskView.setDisableSeekTouch(zBooleanValue);
            }
            this.LL.setDisableSeekTouch(zBooleanValue);
            if (zBooleanValue) {
                C339190DRl.LIZIZ(this.LL);
                return;
            } else {
                C339190DRl.LIZLLL(this.LL);
                return;
            }
        }
        if (!C305280Bxu.LIZ()) {
            return;
        }
        Object obj3 = c737030Svd.LIZIZ;
        if (!(obj3 instanceof C1597406Ng) || (c1597406Ng = (C1597406Ng) obj3) == null) {
            return;
        }
        boolean z2 = c1597406Ng.LIZ;
        VideoSeekBarMaskView videoSeekBarMaskView2 = this.LLILZLL;
        if (videoSeekBarMaskView2 != null) {
            videoSeekBarMaskView2.setDisableSeekTouch(z2);
        }
        this.LL.setDisableSeekTouch(z2);
        this.LLIZLLLIL.LJIIJJI(new AwS53S0010000_9(z2, 3));
    }

    @C14EU
    public final void onVideoMaskEvent(C0RO7 c0ro7) {
        String aid;
        String str = c0ro7.LIZIZ;
        Aweme aweme = this.LLJJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(str, aid)) {
            this.LLIZLLLIL.LJIIJJI(new AwS578S0100000_34(c0ro7, 116));
            if (!c0ro7.LIZ) {
                LIZJ();
            } else {
                LJFF();
            }
        }
        if (c0ro7.LIZJ) {
            LJFF();
            LJIIJJI().LIZ();
        }
    }

    @C14EU
    public final void onVideoProgressVolumeKeyEvent(C16ED c16ed) {
        if (LJIIZILJ(c16ed) && LJII(c16ed.LIZ) && this.LLJLILLLLZIIL) {
            if (c16ed.LIZJ) {
                C786410Ut5.a0(this.LL, 4);
            } else {
                C786410Ut5.a0(this.LL, 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175 A[PHI: r7
      0x0175: PHI (r7v5 int) = (r7v2 int), (r7v0 int) binds: [B:16:0x0068, B:7:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1211710hdZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZ(float r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2248671Czp.LIZ(float, boolean):void");
    }

    @Override // X.InterfaceC1211710hdZ
    public final void LJ(final boolean z, Aweme aweme, ValueAnimator valueAnimator) {
        int i;
        this.LLJJ = aweme;
        if (z && !LJII(aweme)) {
            return;
        }
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new AUListenerS268S0100000_19(this, 18));
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: X.1D04
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    if (!z) {
                        C786410Ut5.a0(this.LL, 8);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    if (z) {
                        C786410Ut5.a0(this.LL, 0);
                    }
                }
            });
            valueAnimator.start();
        } else {
            C12P2 c12p2 = this.LL;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.a0(c12p2, i);
        }
    }

    public final void LJJI(Aweme aweme, int i, boolean z) {
        float fFloatValue;
        if (LJII(aweme) && z) {
            if (i == 0) {
                C786410Ut5.a0(this.LL, 0);
                if (C299690Bot.LIZIZ()) {
                    C12P2 c12p2 = this.LL;
                    Float mProgress = c12p2.getMProgress();
                    if (mProgress != null) {
                        fFloatValue = mProgress.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    c12p2.setProgress(fFloatValue);
                }
                this.LLLFZ = false;
                if (this.LLJJIJIL) {
                    LJIIJJI().LIZIZ();
                    return;
                }
            } else {
                C786410Ut5.a0(this.LL, 4);
                this.LLLFZ = true;
            }
            LJIIJJI().LIZ();
            return;
        }
        this.LLIZLLLIL.LJIIJ("updateSeekBarByPageChange can't show seekbar", aweme);
        C786410Ut5.a0(this.LL, 4);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.09AY, kotlin.jvm.functions.Function2] */
    @Override // X.C0JO2
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (this.LLJJIJIL) {
            for (C1D03 c1d03 : LJIIJJI().LIZ) {
                ?? r2 = c1d03.LIZIZ;
                if (r2 != 0) {
                    r2.invoke(Integer.valueOf(i), c1d03.LIZ);
                }
            }
            if (LJIILLIIL()) {
                SearchKeyFramePoint searchKeyFramePoint = null;
                for (SearchKeyFramePoint searchKeyFramePoint2 : (ArrayList) this.LLJJI) {
                    if (searchKeyFramePoint2.LIZIZ * 100.0f > i / 100.0f) {
                        break;
                    } else {
                        searchKeyFramePoint = searchKeyFramePoint2;
                    }
                }
                for (C1D03 c1d032 : LJIIJJI().LIZ) {
                    C1213930hh9 c1213930hh9 = c1d032.LIZJ;
                    if (c1213930hh9 != null) {
                        c1213930hh9.invoke(Integer.valueOf(i), searchKeyFramePoint);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.casting.api.ICastingSeekListener
    public final void LIZIZ(long j, long j2, Aweme aweme, String str) {
        LJJ(true, true, aweme, (j2 / j) * 100, str, Boolean.TRUE);
    }

    @Override // X.InterfaceC1211710hdZ
    public final void LJI(int i, Aweme aweme, String str, String str2) {
        LJIJI(aweme);
        this.LLJJ = aweme;
        this.LLJJJJLIIL = str;
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJJL = str2;
        LJJIFFI(true);
    }

    public final void LJJ(boolean z, boolean z2, Aweme aweme, float f, String str, Boolean bool) {
        boolean zLJII;
        String aid;
        this.LLJZ = z;
        if (!z2) {
            return;
        }
        if (C299690Bot.LIZIZ()) {
            if (this.LLLIIIIL) {
                this.LLLIIII = LJII(aweme);
                this.LLLIIIIL = false;
            }
            zLJII = this.LLLIIII;
        } else {
            zLJII = LJII(aweme);
        }
        if ((zLJII || (aweme != null && aweme.getAwemeType() == 502)) && !this.LLJJIJIL) {
            if (this.LLJJIJI == null && Intrinsics.LJFF(this.LLJJ, aweme)) {
                LJIJI(aweme);
            }
            if (LJIILJJIL() && !C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJLLIL()) {
                int i = this.LLJLLL + 1;
                this.LLJLLL = i;
                if (i > 3) {
                    this.LLJLLL = 0;
                    this.LL.setSeekBarShowType(LJIIL(false));
                }
            }
            if ((!C299690Bot.LIZIZ() || !this.LLLFZ) && this.LL.getVisibility() != 0 && (!C299690Bot.LIZIZ() || Intrinsics.LJFF(bool, Boolean.TRUE))) {
                C786410Ut5.a0(this.LL, 0);
            }
            if (this.LLJJJJ == 0 || SystemClock.elapsedRealtime() > this.LLJJJJ + ((long) 600)) {
                C586630Mzd c586630Mzd = C586630Mzd.LIZ;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                c586630Mzd.getClass();
                C586630Mzd.LIZ(f, aid, str, "seekBar_setProgress");
                if (C274240Aow.LIZ()) {
                    this.LL.LIZIZ(f, true);
                    return;
                }
                C12P2 c12p2 = this.LL;
                float f2 = C12P2.LLJJIJIIJIL;
                c12p2.LIZIZ(f, false);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [X.0hcc] */
    public C2248671Czp(C12P2 c12p2, ViewGroup viewGroup, C12P4 c12p4, ImageView imageView, ScrollSwitchStateManager scrollSwitchStateManager, VideoSeekBarMaskView videoSeekBarMaskView, C1213920hh8 c1213920hh8) {
        ICastingPlayerService iCastingPlayerServiceLJIIJ;
        this.LL = c12p2;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = c12p4;
        this.LLILZ = imageView;
        this.LLILZIL = scrollSwitchStateManager;
        this.LLILZLL = videoSeekBarMaskView;
        this.LLIZ = c1213920hh8;
        C586640Mze c586640Mze = new C586640Mze(LJIILIIL());
        this.LLIZLLLIL = c586640Mze;
        this.LLJ = C452501pT.LIZIZ(new C1209670haH(this));
        this.LLJI = C452501pT.LIZIZ(new C0RU4());
        this.LLJIJIL = C452501pT.LIZIZ(new C0S8W());
        this.LLJILJIL = C12ES.LJIIJ(c12p2.getContext());
        this.LLJILJILJ = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = C452501pT.LIZIZ(new C1213530hgV(this));
        this.LLJJI = new ArrayList();
        new ArrayList();
        this.LLJJIII = 1;
        this.LLJJJJLIIL = "";
        this.LLJJL = "";
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLJLILLLLZIIL = true;
        this.LLJLLIL = true;
        this.LLLIIIIL = true;
        C786410Ut5.a0(c12p2, 8);
        c12p2.setOnSeekBarChangeListener(this);
        EventBus.LIZLLL().LJIJJ(this);
        C1D03 c1d03 = new C1D03(imageView);
        new C2248771Czz(this).invoke(c1d03);
        C1D03 c1d032 = new C1D03(viewGroup.findViewById(R.id.fbf));
        new C1D09(this).invoke(c1d032);
        C1D03 c1d033 = new C1D03(c12p4);
        new C1D0D().invoke(c1d033);
        C1D03 c1d034 = new C1D03(viewGroup.findViewById(R.id.yg3));
        new C1D08(this).invoke(c1d034);
        C1D03 c1d035 = new C1D03(viewGroup.findViewById(R.id.fbg));
        new C1D07(this).invoke(c1d035);
        C1D03 c1d036 = new C1D03(c1213920hh8);
        new C1D02(this).invoke(c1d036);
        this.LLLII = new C2248761Czy(c1d03, new C1D03(viewGroup), c1d032, c1d033, c1d034, c1d035, c1d036);
        LJIIJJI().LIZ();
        C1D0F c1d0f = C1D0F.LIZ;
        if (c1d0f != null && (iCastingPlayerServiceLJIIJ = c1d0f.LJIIJ()) != null) {
            iCastingPlayerServiceLJIIJ.addSeekListener(this);
        }
        c586640Mze.LJIIIZ("video seekbar has been created");
        c12p2.setHorizontalMargin(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        C426750GoL.LJIIIZ(viewGroup.findViewById(R.id.fbg), null, null, null, Integer.valueOf(LJIL()), false, 23);
        C426750GoL.LJIIIZ(imageView, null, null, null, Integer.valueOf(LJIJJLI()), false, 23);
        if (LJIILL()) {
            if (c1213920hh8 != null) {
                C426750GoL.LJIIIZ(c1213920hh8, null, null, null, Integer.valueOf(LJIJ()), false, 23);
            }
        } else if (c1213920hh8 != null) {
            C426750GoL.LJIIIZ(c1213920hh8, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(148))), false, 23);
        }
        this.LLLIIIL = new Runnable() { // from class: X.0hcc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommonControl@b675.seekBarShowTypeRunnable$1");
                try {
                    C2248671Czp c2248671Czp = this.LL;
                    c2248671Czp.LL.setSeekBarShowType(c2248671Czp.LJIIL(false));
                    this.LL.LLJLL = false;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommonControl@b675.seekBarShowTypeRunnable$1");
            }
        };
    }
}
