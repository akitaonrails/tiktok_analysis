package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS16S0101000_5;
import Y.ARunnableS34S0201000_29;
import Y.ARunnableS98S0200000_29;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragmentV2;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageV2BugFixABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewLocationAnrOptSetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS137S0101000_31;
import tikcast.api.anchor_data.FinishEncourageContainer;

/* JADX INFO: renamed from: X.15Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20480615Ca extends ConstraintLayout implements C15CR {
    public final BPEAHandler LL;
    public C16F5 LLILLJJLI;
    public ConstraintLayout LLILLL;
    public LiveIconView LLILZ;
    public ConstraintLayout LLILZIL;
    public C16FZ LLILZLL;
    public LinearLayout LLIZ;
    public ViewPager LLIZLLLIL;
    public C19737412Ke LLJ;
    public InterfaceC782600Umw LLJI;
    public List<FinishEncourageContainer> LLJIJIL;
    public final ArrayList<InterfaceC20481115Cf> LLJILJIL;
    public MediaPlayer LLJILJILJ;
    public boolean LLJILLL;
    public ValueAnimator LLJJ;
    public long LLJJI;
    public long LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C11JF LLJJIJIL;
    public C20481015Ce LLJJJ;
    public boolean LLJJJIL;
    public final Map<Integer, ValueAnimator> LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public final C20480815Cc LLJJLIIIJLLLLLLLZ;
    public final C19386810t0 LLJL;
    public final ARunnableS112S0100000_12 LLJLIL;

    public final void x40() {
        MediaPlayer mediaPlayer;
        try {
            this.LLJILLL = true;
            MediaPlayer mediaPlayer2 = this.LLJILJILJ;
            if (mediaPlayer2 == null || !mediaPlayer2.isPlaying() || (mediaPlayer = this.LLJILJILJ) == null) {
                return;
            }
            mediaPlayer.pause();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void e0() {
        if (this.LLJJJJLIIL) {
            C16F5 completeTextFromXml = getCompleteTextFromXml();
            if (completeTextFromXml != null) {
                completeTextFromXml.setBackgroundResource(R.drawable.egg);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.exg, completeTextFromXml.getContext());
                completeTextFromXml.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
            }
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", "[style] applyCompletionStylePersistent -> completeText white bg/black text");
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", "[style] lastPageCompleted=true -> applyCompletionStylePersistent");
        }
    }

    @Override // X.C15CR
    public final void f() {
        List<FinishEncourageContainer> list = this.LLJIJIL;
        if (list == null || list.size() <= 1) {
            return;
        }
        if (this.LLJJIJIIJIL) {
            this.LLJJJJJIL = true;
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", "[guard] user dragging -> suppress auto advance once");
            return;
        }
        if (!(!this.LLJL.LIZ)) {
            this.LLJJJJJIL = true;
            return;
        }
        ViewPager vpContainerFromXml = getVpContainerFromXml();
        if (vpContainerFromXml == null) {
            return;
        }
        int currentItem = vpContainerFromXml.getCurrentItem();
        int i = currentItem + 1;
        int size = this.LLJILJIL.size() - 1;
        if (i > size) {
            i = size;
        }
        if (i == currentItem) {
            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", "[pager] already at last page=$currentItem, no advance");
            return;
        }
        Iterator<InterfaceC20481115Cf> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().KL();
        }
        C19386810t0 c19386810t0 = this.LLJL;
        if (!c19386810t0.LIZ) {
            c19386810t0.LIZ();
            ARunnableS16S0101000_5 aRunnableS16S0101000_5 = new ARunnableS16S0101000_5(i, vpContainerFromXml, 13);
            c19386810t0.LIZIZ = new Pair<>(vpContainerFromXml, aRunnableS16S0101000_5);
            HandlerHook.viewPost(vpContainerFromXml, aRunnableS16S0101000_5);
            HandlerHook.viewPostDelay(vpContainerFromXml, new ARunnableS34S0201000_29(c19386810t0, i, vpContainerFromXml, 11), 50L);
        }
        h0(currentItem);
        setProgressInstantTo100ForPage(currentItem);
    }

    public final C16F5 getCompleteTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.enj);
            this.LLILLJJLI = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final ConstraintLayout getContentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eux);
            this.LLILZIL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C19737412Ke getExpandingCircleViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hgd);
            this.LLJ = (C19737412Ke) callbackFindViewById;
        }
        return (C19737412Ke) callbackFindViewById;
    }

    public final LiveIconView getIconSpeakerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k3z);
            this.LLILZ = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C16FZ getLiveBroadcastLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.muf);
            this.LLILZLL = (C16FZ) callbackFindViewById;
        }
        return (C16FZ) callbackFindViewById;
    }

    public final ConstraintLayout getRootViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tsc);
            this.LLILLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final LinearLayout getTopProgressBarContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yc_);
            this.LLIZ = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ViewPager getVpContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vp_container);
            this.LLIZLLLIL = (ViewPager) callbackFindViewById;
        }
        return (ViewPager) callbackFindViewById;
    }

    public final void i0() {
        ViewPager vpContainerFromXml;
        C16FZ liveBroadcastLoadingViewFromXml = getLiveBroadcastLoadingViewFromXml();
        if (liveBroadcastLoadingViewFromXml != null) {
            C786410Ut5.LLLIZZ(liveBroadcastLoadingViewFromXml, 8);
        }
        Iterator<InterfaceC20481115Cf> it2 = this.LLJILJIL.iterator();
        while (it2.hasNext()) {
            it2.next().release();
        }
        this.LLJILJIL.clear();
        ValueAnimator valueAnimator = this.LLJJ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJ = null;
        Iterator it3 = ((LinkedHashMap) this.LLJJJJ).values().iterator();
        while (it3.hasNext()) {
            ((ValueAnimator) it3.next()).cancel();
        }
        ((LinkedHashMap) this.LLJJJJ).clear();
        C11JF c11jf = this.LLJJIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LL.removeCallbacksAndMessages(null);
        this.LLJL.LIZ();
        if (AnchorFinishEncourageV2BugFixABSetting.INSTANCE.isEnabled() && (vpContainerFromXml = getVpContainerFromXml()) != null) {
            vpContainerFromXml.setAdapter(null);
        }
        this.LLJJJ = null;
        if (LivePreviewLocationAnrOptSetting.INSTANCE.enable()) {
            MediaPlayer mediaPlayer = this.LLJILJILJ;
            this.LLJILJILJ = null;
            C486790J7d.LIZJ(new ARunnableS98S0200000_29(this, mediaPlayer, 11));
            return;
        }
        try {
            x40();
            MediaPlayer mediaPlayer2 = this.LLJILJILJ;
            if (mediaPlayer2 != null) {
                mediaPlayer2.stop();
            }
            MediaPlayer mediaPlayer3 = this.LLJILJILJ;
            if (mediaPlayer3 != null) {
                mediaPlayer3.release();
            }
            this.LLJILJILJ = null;
            C194305110d.LJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i0();
    }

    private final void setTopProgressView(List<FinishEncourageContainer> list) {
        if (list == null) {
            return;
        }
        LinearLayout topProgressBarContainerFromXml = getTopProgressBarContainerFromXml();
        if (topProgressBarContainerFromXml != null) {
            C786410Ut5.LJZL(0, topProgressBarContainerFromXml);
        }
        LinearLayout topProgressBarContainerFromXml2 = getTopProgressBarContainerFromXml();
        if (topProgressBarContainerFromXml2 != null) {
            C786410Ut5.LJJJJJL(topProgressBarContainerFromXml2);
            Iterator it2 = C15CY.LJIIJ(list).iterator();
            int i = 0;
            while (it2.hasNext()) {
                it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    ProgressBar progressBar = new ProgressBar(topProgressBarContainerFromXml2.getContext(), null, android.R.attr.progressBarStyleHorizontal);
                    progressBar.setId(View.generateViewId());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
                    if (i != r9.size() - 1) {
                        layoutParams.setMarginEnd(progressBar.getResources().getDimensionPixelSize(R.dimen.sz));
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(progressBar);
                    progressBar.setLayoutParams(layoutParams);
                    progressBar.setProgress(0);
                    progressBar.setProgressDrawable(C800330VaR.LIZIZ(progressBar.getContext(), R.drawable.egp));
                    progressBar.setTag(R.id.s8w, Integer.valueOf(i));
                    topProgressBarContainerFromXml2.addView(progressBar);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.15Ce] */
    private final void setViewPager(List<FinishEncourageContainer> list) {
        final FragmentManager fragmentManagerLJJ;
        EndIncentiveSettlementFragmentV2 endIncentiveSettlementFragmentV2;
        if (list == null) {
            return;
        }
        ArrayList arrayListLJIIJ = C15CY.LJIIJ(list);
        this.LLJILJIL.clear();
        Iterator it2 = arrayListLJIIJ.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    int i3 = C15CX.LIZ[((C15CV) next).ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            FinishEncourageContainer finishEncourageContainer = (FinishEncourageContainer) ListProtector.get(list, i);
                            C15CV c15cv = C15CV.WEAK_CONTAINER;
                            if (i != 0) {
                                z = false;
                            }
                            endIncentiveSettlementFragmentV2 = new EndIncentiveSettlementFragmentV2();
                            endIncentiveSettlementFragmentV2.LLJJIJI = finishEncourageContainer;
                            endIncentiveSettlementFragmentV2.LLJJIII = c15cv;
                            endIncentiveSettlementFragmentV2.LLJJIJIL = this;
                            endIncentiveSettlementFragmentV2.LLJJLIIIJLLLLLLLZ = z;
                            endIncentiveSettlementFragmentV2.LLJJIJIIJIL = i;
                        } else {
                            i = i2;
                        }
                    } else {
                        FinishEncourageContainer finishEncourageContainer2 = (FinishEncourageContainer) ListProtector.get(list, i);
                        C15CV c15cv2 = C15CV.STRONG_CONTAINER;
                        if (i != 0) {
                            z = false;
                        }
                        endIncentiveSettlementFragmentV2 = new EndIncentiveSettlementFragmentV2();
                        endIncentiveSettlementFragmentV2.LLJJIJI = finishEncourageContainer2;
                        endIncentiveSettlementFragmentV2.LLJJIII = c15cv2;
                        endIncentiveSettlementFragmentV2.LLJJIJIL = this;
                        endIncentiveSettlementFragmentV2.LLJJLIIIJLLLLLLLZ = z;
                        endIncentiveSettlementFragmentV2.LLJJIJIIJIL = i;
                    }
                    this.LLJILJIL.add(endIncentiveSettlementFragmentV2);
                    endIncentiveSettlementFragmentV2.LLJZIJLIL = this.LLJJLIIIJLLLLLLLZ;
                    endIncentiveSettlementFragmentV2.LLL = new AwS137S0101000_31(i, this, 2);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if ((!this.LLJILJIL.isEmpty()) && (fragmentManagerLJJ = C520010KaN.LJJ(this, false)) != null) {
                    final ArrayList<InterfaceC20481115Cf> arrayList = this.LLJILJIL;
                    this.LLJJJ = new AbstractC480450Isl(fragmentManagerLJJ, arrayList) { // from class: X.15Ce
                        public final List<InterfaceC20481115Cf> LLJ;

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final int getCount() {
                            List<InterfaceC20481115Cf> list2 = this.LLJ;
                            if (list2 == null || list2.isEmpty()) {
                                return 0;
                            }
                            return this.LLJ.size();
                        }

                        @Override // X.AbstractC480450Isl
                        public final Fragment LJJIJIL(int i4) {
                            List<InterfaceC20481115Cf> list2 = this.LLJ;
                            if (list2 != null && !list2.isEmpty()) {
                                if (i4 >= this.LLJ.size()) {
                                    List<InterfaceC20481115Cf> list3 = this.LLJ;
                                    return ((InterfaceC20481115Cf) ListProtector.get(list3, list3.size() - 1)).getFragment();
                                }
                                return ((InterfaceC20481115Cf) ListProtector.get(this.LLJ, i4)).getFragment();
                            }
                            return new Fragment();
                        }

                        {
                            this.LLJ = arrayList;
                        }
                    };
                    C20481215Cg c20481215Cg = new C20481215Cg(getContext());
                    c20481215Cg.LIZ = 200;
                    ViewPager vpContainerFromXml = getVpContainerFromXml();
                    try {
                        Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                        declaredField.setAccessible(true);
                        declaredField.set(vpContainerFromXml, c20481215Cg);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    ViewPager vpContainerFromXml2 = getVpContainerFromXml();
                    if (vpContainerFromXml2 != null) {
                        vpContainerFromXml2.setAdapter(this.LLJJJ);
                    }
                    ViewPager vpContainerFromXml3 = getVpContainerFromXml();
                    if (vpContainerFromXml3 != null) {
                        vpContainerFromXml3.setOffscreenPageLimit(this.LLJILJIL.size() - 1);
                    }
                    ViewPager vpContainerFromXml4 = getVpContainerFromXml();
                    if (vpContainerFromXml4 != null) {
                        vpContainerFromXml4.setPageTransformer(false, new C15D7() { // from class: X.0eIA
                            @Override // X.C15D7
                            public final void LIZ(View view, float f) {
                                C786410Ut5.Jc(view, (-f) * view.getWidth() * 0.15f);
                                C786410Ut5.T4(view, C13LZ.LIZLLL(1.0f - Math.abs(f), 0.0f, 1.0f));
                                C786410Ut5.Ob(view, 1.0f);
                                C786410Ut5.pc(view, 1.0f);
                                C786410Ut5.Ab(view, 0.0f);
                                C786410Ut5.Ib(view, 0.0f);
                                C786410Ut5.Hb(view, 0.0f);
                            }
                        });
                    }
                    ViewPager vpContainerFromXml5 = getVpContainerFromXml();
                    if (vpContainerFromXml5 != null) {
                        vpContainerFromXml5.addOnPageChangeListener(new C20749116Hh(this, list, 1));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void h0(int i) {
        ValueAnimator valueAnimatorRemove = this.LLJJJJ.remove(Integer.valueOf(i));
        if (valueAnimatorRemove != null) {
            valueAnimatorRemove.cancel();
        }
    }

    public final void j0(boolean z) {
        String str;
        String str2;
        if (this.LLJJIII != 0) {
            List<FinishEncourageContainer> list = this.LLJIJIL;
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJJIII;
            if (this.LLJJJJLIIL) {
                str = "finish_leave";
            } else {
                str = "unfinish_leave";
            }
            if (z) {
                str2 = "complete";
            } else {
                str2 = "others";
            }
            C20480815Cc c20480815Cc = this.LLJJLIIIJLLLLLLLZ;
            int size = c20480815Cc.LIZJ.size() + c20480815Cc.LIZIZ.size();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_page_leave");
            c474500IjALIZ.LJJIIJZLJL(C15CY.LJIIIIZZ(list));
            c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "duration");
            c474500IjALIZ.LJJII(str, "finish_type");
            c474500IjALIZ.LJJII(str2, "action_type");
            c474500IjALIZ.LJJII(Integer.valueOf(size), "show_content_cnt");
            c474500IjALIZ.LIZ();
        }
        InterfaceC782600Umw interfaceC782600Umw = this.LLJI;
        if (interfaceC782600Umw != null) {
            interfaceC782600Umw.AA();
        }
        i0();
    }

    public final void l0(boolean z) {
        LiveIconView iconSpeakerFromXml = getIconSpeakerFromXml();
        if (iconSpeakerFromXml != null) {
            iconSpeakerFromXml.setIconTintAttr(R.attr.exs);
        }
        if (z) {
            LiveIconView iconSpeakerFromXml2 = getIconSpeakerFromXml();
            if (iconSpeakerFromXml2 != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
                iconSpeakerFromXml2.setIcon(c419910GdJ.LIZ(iconSpeakerFromXml2.getContext()));
                return;
            }
            return;
        }
        LiveIconView iconSpeakerFromXml3 = getIconSpeakerFromXml();
        if (iconSpeakerFromXml3 == null) {
            return;
        }
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_speaker_2_fill_ltr;
        iconSpeakerFromXml3.setIcon(c419910GdJ2.LIZ(iconSpeakerFromXml3.getContext()));
    }

    public final void setCompleteTextFromXml(C16F5 c16f5) {
        this.LLILLJJLI = c16f5;
    }

    public final void setContentContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZIL = constraintLayout;
    }

    public final void setData(List<FinishEncourageContainer> list) {
        C16FZ liveBroadcastLoadingViewFromXml = getLiveBroadcastLoadingViewFromXml();
        if (liveBroadcastLoadingViewFromXml != null) {
            C786410Ut5.LLLIZZ(liveBroadcastLoadingViewFromXml, 8);
        }
        if (list.isEmpty()) {
            j0(false);
            return;
        }
        if (this.LLJIJIL != null) {
            return;
        }
        int visibility = getVisibility();
        setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, this);
        C15CY.LJ(1, SystemClock.uptimeMillis() - this.LLJJI, list);
        this.LLJIJIL = list;
        setTopProgressView(list);
        setViewPager(list);
        this.LLJJIII = SystemClock.uptimeMillis();
    }

    public final void setExpandingCircleViewFromXml(C19737412Ke c19737412Ke) {
        this.LLJ = c19737412Ke;
    }

    public final void setIconSpeakerFromXml(LiveIconView liveIconView) {
        this.LLILZ = liveIconView;
    }

    public final void setLiveBroadcastLoadingViewFromXml(C16FZ c16fz) {
        this.LLILZLL = c16fz;
    }

    public final void setProgressInstantTo100ForPage(int i) {
        ProgressBar progressBar;
        LinearLayout topProgressBarContainerFromXml = getTopProgressBarContainerFromXml();
        if (topProgressBarContainerFromXml != null) {
            View childAt = topProgressBarContainerFromXml.getChildAt(i);
            if ((childAt instanceof ProgressBar) && (progressBar = (ProgressBar) childAt) != null) {
                progressBar.setProgress(100);
            }
        }
    }

    public final void setRootViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILLL = constraintLayout;
    }

    public final void setTopProgressBarContainerFromXml(LinearLayout linearLayout) {
        this.LLIZ = linearLayout;
    }

    public final void setVpContainerFromXml(ViewPager viewPager) {
        this.LLIZLLLIL = viewPager;
    }

    public C20480615Ca(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C20480615Ca(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new ArrayList<>();
        this.LLJJJJ = new LinkedHashMap();
        this.LLJJLIIIJLLLLLLLZ = new C20480815Cc();
        this.LLJL = new C19386810t0();
        this.LLJLIL = new ARunnableS112S0100000_12(this, 45);
    }

    @Override // X.C15CR
    public final void p(final long j, boolean z, boolean z2) {
        final int currentItem;
        ProgressBar progressBar;
        LinearLayout topProgressBarContainerFromXml = getTopProgressBarContainerFromXml();
        if (topProgressBarContainerFromXml != null && topProgressBarContainerFromXml.getVisibility() == 0) {
            ViewPager vpContainerFromXml = getVpContainerFromXml();
            if (vpContainerFromXml != null) {
                currentItem = vpContainerFromXml.getCurrentItem();
            } else {
                currentItem = 0;
            }
            LinearLayout topProgressBarContainerFromXml2 = getTopProgressBarContainerFromXml();
            if (topProgressBarContainerFromXml2 != null) {
                View childAt = topProgressBarContainerFromXml2.getChildAt(currentItem);
                if ((childAt instanceof ProgressBar) && (progressBar = (ProgressBar) childAt) != null) {
                    h0(currentItem);
                    progressBar.setProgress(0);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(j);
                    valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(progressBar, 79));
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: X.0T7R
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[progress-anim] cancel page=");
                            sbLIZ.append(currentItem);
                            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[progress-anim] start page=");
                            sbLIZ.append(currentItem);
                            sbLIZ.append(" durationMs=");
                            sbLIZ.append(j);
                            C20441214yg.LIZIZ("EndIncentiveSettlementViewV2", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    });
                    this.LLJJJJ.put(Integer.valueOf(currentItem), valueAnimatorOfFloat);
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }
}
