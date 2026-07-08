package X;

import Y.ARunnableS112S0100000_12;
import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.end.EndIncentiveSettlementFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorFinishEncourageData;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorFinishEncourageBugFixABSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.15CZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CZ extends ConstraintLayout implements C15CR {
    public C16F5 LL;
    public ConstraintLayout LLILLJJLI;
    public LiveIconView LLILLL;
    public ConstraintLayout LLILZ;
    public C16FZ LLILZIL;
    public LinearLayout LLILZLL;
    public ViewPager LLIZ;
    public C19737412Ke LLIZLLLIL;
    public ProgressBar LLJ;
    public ProgressBar LLJI;
    public InterfaceC782600Umw LLJIJIL;
    public AnchorFinishEncourageData LLJILJIL;
    public final ArrayList<InterfaceC20481115Cf> LLJILJILJ;
    public MediaPlayer LLJILLL;
    public boolean LLJJ;
    public ValueAnimator LLJJI;
    public ValueAnimator LLJJIII;
    public ValueAnimator LLJJIJI;
    public long LLJJIJIIJIL;
    public long LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public C11JF LLJJJJ;
    public boolean LLJJJJJIL;
    public C20480915Cd LLJJJJLIIL;
    public final ARunnableS112S0100000_12 LLJJL;

    public final void x40() {
        MediaPlayer mediaPlayer;
        try {
            this.LLJJ = true;
            MediaPlayer mediaPlayer2 = this.LLJILLL;
            if (mediaPlayer2 == null || !mediaPlayer2.isPlaying() || (mediaPlayer = this.LLJILLL) == null) {
                return;
            }
            mediaPlayer.pause();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C15CR
    public final void f() {
        if (C15CY.LJIILLIIL(this.LLJILJIL)) {
            Iterator<InterfaceC20481115Cf> it2 = this.LLJILJILJ.iterator();
            while (it2.hasNext()) {
                it2.next().KL();
            }
            ViewPager vpContainerFromXml = getVpContainerFromXml();
            if (vpContainerFromXml != null) {
                vpContainerFromXml.setCurrentItem(1, true);
            }
            ValueAnimator valueAnimator = this.LLJJI;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ProgressBar topLeftProgressBarFromXml = getTopLeftProgressBarFromXml();
            if (topLeftProgressBarFromXml != null) {
                topLeftProgressBarFromXml.setProgress(100);
            }
        }
    }

    public final C16F5 getCompleteTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.enj);
            this.LL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final ConstraintLayout getContentContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eux);
            this.LLILZ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C19737412Ke getExpandingCircleViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hgd);
            this.LLIZLLLIL = (C19737412Ke) callbackFindViewById;
        }
        return (C19737412Ke) callbackFindViewById;
    }

    public final LiveIconView getIconSpeakerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.k3z);
            this.LLILLL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C16FZ getLiveBroadcastLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.muf);
            this.LLILZIL = (C16FZ) callbackFindViewById;
        }
        return (C16FZ) callbackFindViewById;
    }

    public final ConstraintLayout getRootViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tsc);
            this.LLILLJJLI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final ProgressBar getTopLeftProgressBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ybb);
            this.LLJ = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final LinearLayout getTopProgressBarContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yc_);
            this.LLILZLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final ProgressBar getTopRightProgressBarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ycp);
            this.LLJI = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final ViewPager getVpContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vp_container);
            this.LLIZ = (ViewPager) callbackFindViewById;
        }
        return (ViewPager) callbackFindViewById;
    }

    private final void setTopProgressView(AnchorFinishEncourageData anchorFinishEncourageData) {
        if (anchorFinishEncourageData == null) {
            return;
        }
        if (C15CY.LJIILLIIL(anchorFinishEncourageData)) {
            LinearLayout topProgressBarContainerFromXml = getTopProgressBarContainerFromXml();
            if (topProgressBarContainerFromXml != null) {
                C786410Ut5.LJZL(0, topProgressBarContainerFromXml);
                return;
            }
            return;
        }
        LinearLayout topProgressBarContainerFromXml2 = getTopProgressBarContainerFromXml();
        if (topProgressBarContainerFromXml2 == null) {
            return;
        }
        C786410Ut5.LJZL(8, topProgressBarContainerFromXml2);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.15Cd] */
    private final void setViewPager(AnchorFinishEncourageData anchorFinishEncourageData) {
        final FragmentManager fragmentManagerLJJ;
        EndIncentiveSettlementFragment endIncentiveSettlementFragment;
        if (anchorFinishEncourageData == null) {
            return;
        }
        Iterator it2 = C15CY.LJIIIZ(anchorFinishEncourageData).iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    int i3 = C15CS.LIZ[((C15CV) next).ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                C15CV c15cv = C15CV.ACHIEVEMENT;
                                if (i != 0) {
                                    z = false;
                                }
                                endIncentiveSettlementFragment = new EndIncentiveSettlementFragment();
                                endIncentiveSettlementFragment.LLJJJIL = anchorFinishEncourageData;
                                endIncentiveSettlementFragment.LLJJJ = c15cv;
                                endIncentiveSettlementFragment.LLJJJJ = this;
                                endIncentiveSettlementFragment.LLL = z;
                            } else {
                                i = i2;
                            }
                        } else {
                            C15CV c15cv2 = C15CV.LIVE_JOURNEY;
                            if (i != 0) {
                                z = false;
                            }
                            endIncentiveSettlementFragment = new EndIncentiveSettlementFragment();
                            endIncentiveSettlementFragment.LLJJJIL = anchorFinishEncourageData;
                            endIncentiveSettlementFragment.LLJJJ = c15cv2;
                            endIncentiveSettlementFragment.LLJJJJ = this;
                            endIncentiveSettlementFragment.LLL = z;
                        }
                    } else {
                        C15CV c15cv3 = C15CV.LOP;
                        if (i != 0) {
                            z = false;
                        }
                        endIncentiveSettlementFragment = new EndIncentiveSettlementFragment();
                        endIncentiveSettlementFragment.LLJJJIL = anchorFinishEncourageData;
                        endIncentiveSettlementFragment.LLJJJ = c15cv3;
                        endIncentiveSettlementFragment.LLJJJJ = this;
                        endIncentiveSettlementFragment.LLL = z;
                    }
                    this.LLJILJILJ.add(endIncentiveSettlementFragment);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if ((!this.LLJILJILJ.isEmpty()) && this.LLJILJILJ.size() <= 2 && (fragmentManagerLJJ = C520010KaN.LJJ(this, false)) != null) {
                    final ArrayList<InterfaceC20481115Cf> arrayList = this.LLJILJILJ;
                    this.LLJJJJLIIL = new AbstractC480450Isl(fragmentManagerLJJ, arrayList) { // from class: X.15Cd
                        public final List<InterfaceC20481115Cf> LLJ;

                        @Override // androidx.viewpager.widget.PagerAdapter
                        public final int getCount() {
                            List<InterfaceC20481115Cf> list = this.LLJ;
                            if (list == null || list.isEmpty()) {
                                return 0;
                            }
                            return this.LLJ.size();
                        }

                        @Override // X.AbstractC480450Isl
                        public final Fragment LJJIJIL(int i4) {
                            List<InterfaceC20481115Cf> list = this.LLJ;
                            if (list != null && !list.isEmpty()) {
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
                        vpContainerFromXml2.setAdapter(this.LLJJJJLIIL);
                    }
                    ViewPager vpContainerFromXml3 = getVpContainerFromXml();
                    if (vpContainerFromXml3 != null) {
                        final float fLJIIZILJ = C497740JfY.LJIIZILJ();
                        vpContainerFromXml3.setPageTransformer(false, new C15D7(fLJIIZILJ) { // from class: X.15Ci
                            public final float LIZ;
                            public final C20481315Ch LIZIZ = new C20481315Ch(this);

                            {
                                this.LIZ = fLJIIZILJ;
                            }

                            @Override // X.C15D7
                            public final void LIZ(View view, float f) {
                                view.setPivotY(view.getHeight() / 2);
                                if (f < -1.0f) {
                                    view.setPivotX(0.0f);
                                    C786410Ut5.Ib(view, 90.0f);
                                } else if (f <= 0.0f) {
                                    view.setPivotX(this.LIZ);
                                    C786410Ut5.Ib(view, -this.LIZIZ.getInterpolation(-f));
                                } else if (f <= 1.0f) {
                                    view.setPivotX(0.0f);
                                    C786410Ut5.Ib(view, this.LIZIZ.getInterpolation(f));
                                } else {
                                    view.setPivotX(0.0f);
                                    C786410Ut5.Ib(view, 90.0f);
                                }
                            }
                        });
                    }
                    ViewPager vpContainerFromXml4 = getVpContainerFromXml();
                    if (vpContainerFromXml4 != null) {
                        vpContainerFromXml4.addOnPageChangeListener(new C20749116Hh(this, anchorFinishEncourageData, 0));
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public final void e0(boolean z) {
        C20480915Cd c20480915Cd;
        String str;
        String str2;
        Iterator<InterfaceC20481115Cf> it2 = this.LLJILJILJ.iterator();
        boolean z2 = true;
        while (it2.hasNext()) {
            if (!it2.next().wt()) {
                z2 = false;
            }
        }
        if (this.LLJJIJIL != 0) {
            AnchorFinishEncourageData anchorFinishEncourageData = this.LLJILJIL;
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLJJIJIL;
            if (z2) {
                str = "finish_leave";
            } else {
                str = "unfinish_leave";
            }
            if (z) {
                str2 = "complete";
            } else {
                str2 = "others";
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_positive_feedback_page_leave");
            c474500IjALIZ.LJJIIJZLJL(C15CY.LJII(anchorFinishEncourageData));
            c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis), "duration");
            c474500IjALIZ.LJJII(str, "finish_type");
            c474500IjALIZ.LJJII(str2, "action_type");
            c474500IjALIZ.LIZ();
        }
        C16FZ liveBroadcastLoadingViewFromXml = getLiveBroadcastLoadingViewFromXml();
        if (liveBroadcastLoadingViewFromXml != null) {
            C786410Ut5.LLLIZZ(liveBroadcastLoadingViewFromXml, 8);
        }
        InterfaceC782600Umw interfaceC782600Umw = this.LLJIJIL;
        if (interfaceC782600Umw != null) {
            interfaceC782600Umw.AA();
        }
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJJI = null;
        ValueAnimator valueAnimator2 = this.LLJJIII;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.LLJJIII = null;
        Iterator<InterfaceC20481115Cf> it3 = this.LLJILJILJ.iterator();
        while (it3.hasNext()) {
            it3.next().release();
        }
        this.LLJILJILJ.clear();
        if (AnchorFinishEncourageBugFixABSetting.INSTANCE.isMatch() && (c20480915Cd = this.LLJJJJLIIL) != null) {
            c20480915Cd.notifyDataSetChanged();
        }
        ValueAnimator valueAnimator3 = this.LLJJIJI;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.LLJJIJI = null;
        C11JF c11jf = this.LLJJJJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        InterfaceC782600Umw interfaceC782600Umw2 = this.LLJIJIL;
        if (interfaceC782600Umw2 != null) {
            interfaceC782600Umw2.t8();
        }
        try {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            x40();
            MediaPlayer mediaPlayer = this.LLJILLL;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.LLJILLL;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.LLJILLL = null;
            C194305110d.LJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final void h0(boolean z) {
        String str;
        LiveIconView iconSpeakerFromXml = getIconSpeakerFromXml();
        if (z) {
            str = "ttlive_end_speaker_unmute.png";
        } else {
            str = "ttlive_end_speaker.png";
        }
        C1143680frq.LJ(iconSpeakerFromXml, "tiktok_live_broadcast_demand_8", str, ImageView.ScaleType.CENTER_CROP);
    }

    public final void setCompleteTextFromXml(C16F5 c16f5) {
        this.LL = c16f5;
    }

    public final void setContentContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
    }

    public final void setData(AnchorFinishEncourageData anchorFinishEncourageData) {
        if (anchorFinishEncourageData != null && ((anchorFinishEncourageData.liveJourneyInfo != null || anchorFinishEncourageData.lopInfo != null || anchorFinishEncourageData.achievementInfo != null) && getVisibility() != 8)) {
            if (this.LLJILJIL != null) {
                return;
            }
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
            C15CY.LIZLLL(anchorFinishEncourageData, SystemClock.uptimeMillis() - this.LLJJIJIIJIL, 1);
            this.LLJILJIL = anchorFinishEncourageData;
            setTopProgressView(anchorFinishEncourageData);
            setViewPager(anchorFinishEncourageData);
            this.LLJJIJIL = SystemClock.uptimeMillis();
            return;
        }
        e0(false);
    }

    public final void setExpandingCircleViewFromXml(C19737412Ke c19737412Ke) {
        this.LLIZLLLIL = c19737412Ke;
    }

    public final void setIconSpeakerFromXml(LiveIconView liveIconView) {
        this.LLILLL = liveIconView;
    }

    public final void setLiveBroadcastLoadingViewFromXml(C16FZ c16fz) {
        this.LLILZIL = c16fz;
    }

    public final void setRootViewFromXml(ConstraintLayout constraintLayout) {
        this.LLILLJJLI = constraintLayout;
    }

    public final void setTopLeftProgressBarFromXml(ProgressBar progressBar) {
        this.LLJ = progressBar;
    }

    public final void setTopProgressBarContainerFromXml(LinearLayout linearLayout) {
        this.LLILZLL = linearLayout;
    }

    public final void setTopRightProgressBarFromXml(ProgressBar progressBar) {
        this.LLJI = progressBar;
    }

    public final void setVpContainerFromXml(ViewPager viewPager) {
        this.LLIZ = viewPager;
    }

    public C15CZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C15CZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILJILJ = new ArrayList<>();
        this.LLJJL = new ARunnableS112S0100000_12(this, 44);
    }

    @Override // X.C15CR
    public final void p(long j, boolean z, final boolean z2) {
        LinearLayout topProgressBarContainerFromXml = getTopProgressBarContainerFromXml();
        if (topProgressBarContainerFromXml != null && topProgressBarContainerFromXml.getVisibility() == 8) {
            return;
        }
        if (z) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
            this.LLJJI = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setDuration(j);
            }
            ValueAnimator valueAnimator = this.LLJJI;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.15Cb
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        Integer num;
                        ViewPager vpContainerFromXml;
                        Object animatedValue = valueAnimator2.getAnimatedValue();
                        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                            C15CZ c15cz = this.LL;
                            boolean z3 = z2;
                            int iIntValue = num.intValue();
                            ProgressBar topLeftProgressBarFromXml = c15cz.getTopLeftProgressBarFromXml();
                            if (topLeftProgressBarFromXml != null) {
                                topLeftProgressBarFromXml.setProgress(iIntValue);
                            }
                            if (iIntValue >= 100 && !z3 && (vpContainerFromXml = c15cz.getVpContainerFromXml()) != null) {
                                vpContainerFromXml.setCurrentItem(1, true);
                            }
                        }
                    }
                });
            }
            ValueAnimator valueAnimator2 = this.LLJJI;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
                return;
            }
            return;
        }
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 100);
        this.LLJJIII = valueAnimatorOfInt2;
        if (valueAnimatorOfInt2 != null) {
            valueAnimatorOfInt2.setDuration(j);
        }
        ValueAnimator valueAnimator3 = this.LLJJIII;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS278S0100000_31(this, 36));
        }
        ValueAnimator valueAnimator4 = this.LLJJIII;
        if (valueAnimator4 == null) {
            return;
        }
        valueAnimator4.start();
    }
}
