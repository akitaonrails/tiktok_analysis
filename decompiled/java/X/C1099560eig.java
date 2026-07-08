package X;

import Y.ACListenerS152S0100000_17;
import Y.AUListenerS78S0110000_17;
import Y.AfS186S0100000_17;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.GroupLiveMemberMatchOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchGroupLiveIcyClashSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099560eig {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public final DataChannel LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public final C01GW LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;
    public final C01GW LJIL;
    public final C01GW LJJ;
    public final C01GW LJJI;
    public AnonymousClass0194 LJJIFFI;
    public AnonymousClass0194 LJJII;
    public C11JF LJJIII;
    public C11JF LJJIIJ;
    public Function1<? super Long, Unit> LJJIIJZLJL;
    public C11JF LJJIIZ;
    public EnumC2856018s LJJIIZI;
    public long LJJIJ;
    public boolean LJJIJIIJI;
    public final C1320810kTX LJJIJIIJIL;
    public ValueAnimator LJJIJIL;
    public ValueAnimator LJJIJL;
    public int LJJIJLIJ;

    public final C16F5 LJ() {
        return (C16F5) this.LJIIIIZZ.getValue();
    }

    public final C0GUW LJFF() {
        return (C0GUW) this.LJFF.getValue();
    }

    public final void LJII() {
        this.LJJIIZI = EnumC2856018s.HIDDEN;
        C11JF c11jf = this.LJJIIJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJJIIJ = null;
        C786410Ut5.LJLZ(8, this.LIZ);
        this.LJJIJIIJI = false;
    }

    public final void LJIIJ() {
        C11JF c11jf = this.LJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJJIII = null;
        C11JF c11jf2 = this.LJJIIJ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LJJIIJ = null;
        C11JF c11jf3 = this.LJJIIZ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LJJIIZ = null;
    }

    public static String LJI(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Locale locale = Locale.US;
        sbLIZ.append(C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60)}, 1)));
        sbLIZ.append(":");
        sbLIZ.append(C786410Ut5.k4(locale, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j % 60)}, 1)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(boolean z) {
        ValueAnimator valueAnimator;
        if (z) {
            valueAnimator = this.LJJIJIL;
        } else {
            valueAnimator = this.LJJIJL;
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 1.5f);
        if (z) {
            this.LJJIJIL = valueAnimatorOfFloat;
        } else {
            this.LJJIJL = valueAnimatorOfFloat;
        }
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.setRepeatCount(1);
            valueAnimatorOfFloat.setRepeatMode(2);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS78S0110000_17(this, z, 1));
            valueAnimatorOfFloat.start();
        }
    }

    public final void LJIIIIZZ(long j) {
        boolean z;
        if (1 <= j && j < 11) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLJJI((C1126540fQC) this.LJIIJJI.getValue(), 8);
            LJIILIIL(true);
            LJ().setText(String.valueOf(j));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(LIZLLL(0.0f, 1.25f, 240L), LIZLLL(1.25f, 0.9f, 200L), LIZLLL(0.9f, 1.0f, 120L));
            animatorSet.start();
            return;
        }
        if (j == 0) {
            C1126540fQC c1126540fQC = (C1126540fQC) this.LJIIJJI.getValue();
            if (c1126540fQC != null) {
                C786410Ut5.LLJJI(c1126540fQC, 0);
            }
            LJIILIIL(false);
            C11JF c11jf = this.LJJIIZ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJJIIZ = (C11JF) C11NZ.LJJJJJL(0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new AfS186S0100000_17(this, 97));
            return;
        }
        C786410Ut5.LLJJI((C1126540fQC) this.LJIIJJI.getValue(), 8);
        LJIILIIL(true);
        LJ().setText(LJI(j));
    }

    public final void LJIILIIL(boolean z) {
        if (z && ((View) this.LJIIIZ.getValue()).getVisibility() != 0) {
            C786410Ut5.LLJJJJ(LJ(), 0);
        } else {
            C786410Ut5.LLJJJJ(LJ(), 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1099560eig(Context context, ViewGroup viewGroup, DataChannel dataChannel) {
        this.LIZ = viewGroup;
        this.LIZIZ = context;
        this.LIZJ = dataChannel;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 401));
        this.LJ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 409));
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 417));
        C01GW c01gwLIZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 406));
        this.LJI = c01gwLIZ;
        C01GW c01gwLIZ2 = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 414));
        this.LJII = c01gwLIZ2;
        this.LJIIIIZZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 397));
        this.LJIIIZ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 399));
        this.LJIIJ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 398));
        this.LJIIJJI = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 396));
        C01GW c01gwLIZ3 = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 405));
        this.LJIIL = c01gwLIZ3;
        C01GW c01gwLIZ4 = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 413));
        this.LJIILIIL = c01gwLIZ4;
        this.LJIILJJIL = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 404));
        this.LJIILL = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 412));
        this.LJIILLIIL = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 408));
        this.LJIIZILJ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 416));
        this.LJIJ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 402));
        this.LJIJI = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 410));
        this.LJIJJ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 403));
        this.LJIJJLI = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 411));
        this.LJIL = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 415));
        this.LJJ = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 407));
        this.LJJI = C452501pT.LIZ(enumC452301pR, new AwS561S0100000_17(this, 400));
        this.LJJIIZI = EnumC2856018s.HIDDEN;
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
        this.LJJIJIIJIL = c1320810kTXLIZJ;
        Iterator it2 = C1697810uHb.LJIIJJI(c01gwLIZ.getValue(), c01gwLIZ2.getValue(), c01gwLIZ3.getValue(), c01gwLIZ4.getValue(), LJ()).iterator();
        while (it2.hasNext()) {
            ((TextView) it2.next()).setShadowLayer(1.0f, 0.0f, C497740JfY.LIZIZ(1.0f), C497740JfY.LIZLLL(R.attr.cc_, this.LIZIZ));
        }
    }

    public final void LIZIZ(C019G c019g, long j, long j2) {
        long j3 = this.LJJIJ;
        if (j3 != 0 && j3 != j2) {
            return;
        }
        LJIILIIL(true);
        LJ().setText(LJI(0L));
        C786410Ut5.LLJJI((C1126540fQC) this.LJIIJJI.getValue(), 8);
        C500260Jjc.LJIILIIL((View) this.LJJ.getValue());
        C500260Jjc.LJIILIIL((View) this.LJIL.getValue());
        C786410Ut5.LL(0, (ConstraintLayout) this.LJIILJJIL.getValue());
        C786410Ut5.LL(0, (ConstraintLayout) this.LJIILL.getValue());
        int i = C019H.LIZ[c019g.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C786410Ut5.LLILIL((AppCompatImageView) this.LJIJ.getValue(), 0);
                    C786410Ut5.LLILIL((AppCompatImageView) this.LJIJI.getValue(), 0);
                    C786410Ut5.LLILIL((AppCompatImageView) this.LJIILLIIL.getValue(), 8);
                    C786410Ut5.LLILIL((AppCompatImageView) this.LJIIZILJ.getValue(), 8);
                    C786410Ut5.LLILIL((AppCompatImageView) this.LJIJJ.getValue(), 8);
                    C786410Ut5.LLILIL((AppCompatImageView) this.LJIJJLI.getValue(), 8);
                } else {
                    throw new C1954807lC();
                }
            } else {
                C786410Ut5.LLILIL((AppCompatImageView) this.LJIIZILJ.getValue(), 0);
                C786410Ut5.LLILIL((AppCompatImageView) this.LJIJI.getValue(), 8);
                C786410Ut5.LLILIL((AppCompatImageView) this.LJIJJLI.getValue(), 8);
                C786410Ut5.LLILIL((AppCompatImageView) this.LJIILLIIL.getValue(), 8);
                C786410Ut5.LLILIL((AppCompatImageView) this.LJIJ.getValue(), 8);
                C786410Ut5.LLILIL((AppCompatImageView) this.LJIJJ.getValue(), 0);
            }
        } else {
            C786410Ut5.LLILIL((AppCompatImageView) this.LJIILLIIL.getValue(), 0);
            C786410Ut5.LLILIL((AppCompatImageView) this.LJIJ.getValue(), 8);
            C786410Ut5.LLILIL((AppCompatImageView) this.LJIJJ.getValue(), 8);
            C786410Ut5.LLILIL((AppCompatImageView) this.LJIIZILJ.getValue(), 8);
            C786410Ut5.LLILIL((AppCompatImageView) this.LJIJI.getValue(), 8);
            C786410Ut5.LLILIL((AppCompatImageView) this.LJIJJLI.getValue(), 0);
        }
        this.LJJIIZI = EnumC2856018s.FINISHED;
        C11JF c11jf = this.LJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJJIII = null;
        C11JF c11jf2 = this.LJJIIZ;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LJJIIZ = null;
        C11JF c11jf3 = this.LJJIIJ;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LJJIIJ = (C11JF) C11NZ.LJLJJLL(j, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new C516201zk(this, 170), new C516201zk(this, 171));
    }

    public final AnimatorSet LIZLLL(float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(LJ(), (Property<C16F5, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(LJ(), (Property<C16F5, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }

    public final void LJIIJJI(final int i, final long j, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showIcyClashContainer: show=");
        sbLIZ.append(z);
        sbLIZ.append(", timeRemaining=");
        sbLIZ.append(j);
        sbLIZ.append(", gameplayOption=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("TimedCompetitionScoreBarManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LiveMatchGroupLiveIcyClashSetting.INSTANCE.isEnable() && !this.LJJIJIIJI) {
            if (z && j >= 5 && i == 2) {
                C786410Ut5.LL(0, (ConstraintLayout) this.LJIIIZ.getValue());
                C786410Ut5.Y7((ConstraintLayout) this.LJIIIZ.getValue(), new ACListenerS152S0100000_17(this, 108));
                if (C497740JfY.LJJ()) {
                    C786410Ut5.Qb((ImageView) this.LJIIJ.getValue(), -1.0f);
                }
                LJIILIIL(false);
                C473410IhP.LIZJ(new Runnable() { // from class: X.0eMQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("TimedCompetitionScoreBarManager@2fad.showIcyClashContainer$2");
                        try {
                            this.LL.LJIIJJI(i, j - ((long) 3), false);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TimedCompetitionScoreBarManager@2fad.showIcyClashContainer$2");
                    }
                }, 3000L);
                return;
            }
            C786410Ut5.LL(8, (ConstraintLayout) this.LJIIIZ.getValue());
            LJIILIIL(true);
        }
    }

    public final void LIZJ(final C019G c019g, final long j, final long j2, boolean z) {
        long j3 = this.LJJIJ;
        if (j3 != 0 && j3 != j2) {
            return;
        }
        this.LJJIJIIJI = z;
        if (z) {
            C11JF c11jf = this.LJJIIJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJJIIJ = null;
            C11JF c11jf2 = this.LJJIII;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            C786410Ut5.LL(8, (ConstraintLayout) this.LJIIIZ.getValue());
            LJIIIIZZ(0L);
            C20441214yg.LIZIZ("TimedCompetitionScoreBarManager", "If the EndCompetition from cutShort, it should show clock animation 3s, then doEndCompetition");
            C473410IhP.LIZJ(new Runnable() { // from class: X.019R
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TimedCompetitionScoreBarManager@2fad.endCompetition$1");
                    try {
                        this.LL.LIZIZ(c019g, j, j2);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TimedCompetitionScoreBarManager@2fad.endCompetition$1");
                }
            }, 3000L);
            return;
        }
        LIZIZ(c019g, j, j2);
    }

    public final void LJIILL(long j, long j2, long j3, boolean z) {
        int i;
        long j4 = this.LJJIJ;
        if (j4 != 0 && j4 != j3) {
            return;
        }
        View view = (View) this.LJJI.getValue();
        if (j == 0 && j2 == 0) {
            LJFF().setActive(false);
            i = 0;
        } else {
            LJFF().setActive(true);
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        ((TextView) this.LJIIL.getValue()).setText(String.valueOf(j));
        ((TextView) this.LJIILIIL.getValue()).setText(String.valueOf(j2));
        AnonymousClass0194 anonymousClass0194 = this.LJJII;
        if ((anonymousClass0194 == null || j != anonymousClass0194.LIZLLL) && z) {
            LIZ(true);
        }
        AnonymousClass0194 anonymousClass01942 = this.LJJIFFI;
        if ((anonymousClass01942 == null || j2 != anonymousClass01942.LIZLLL) && z) {
            LIZ(false);
        }
        LJFF().setLeftValue(j);
        LJFF().setRightValue(j2);
        AnonymousClass0194 anonymousClass01943 = this.LJJIFFI;
        if (anonymousClass01943 != null) {
            anonymousClass01943.LIZLLL = j2;
        }
        AnonymousClass0194 anonymousClass01944 = this.LJJII;
        if (anonymousClass01944 != null) {
            anonymousClass01944.LIZLLL = j;
        }
    }

    public static void LJIILJJIL(AnonymousClass0194 anonymousClass0194, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, C16F5 c16f5, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3) {
        String strLIZIZ;
        if (GroupLiveMemberMatchOptimizationSetting.INSTANCE.isEnable() && anonymousClass0194.LJFF > 0) {
            C500260Jjc.LLFFF(constraintLayout);
            if (anonymousClass0194.LJFF <= 99) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("x ");
                sbLIZ.append(anonymousClass0194.LJFF);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "x 99+";
            }
            C500260Jjc.LLFFF(appCompatImageView);
            c16f5.setText(strLIZIZ);
            C500260Jjc.LLFFF(c16f5);
            C500260Jjc.LJIILIIL(appCompatImageView2);
            C500260Jjc.LJIILIIL(appCompatImageView3);
            return;
        }
        C500260Jjc.LJIILIIL(constraintLayout);
    }

    public final void LJIIL(final long j, final AnonymousClass0194 anonymousClass0194, final AnonymousClass0194 anonymousClass01942, final long j2, final int i, int i2) {
        if (this.LJJIIZI == EnumC2856018s.HIDDEN) {
            if (j <= 0) {
                return;
            }
            LJIIIZ(j, anonymousClass0194, anonymousClass01942, j2, null, i, i2);
        } else {
            LJIIJ();
            LJII();
            if (j <= 1) {
                return;
            }
            C473410IhP.LIZJ(new Runnable() { // from class: X.019W
                public final /* synthetic */ C019G LLILZLL = null;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TimedCompetitionScoreBarManager@2fad.startCompetition$1");
                    try {
                        this.LL.LJIIIZ(j - 1, anonymousClass0194, anonymousClass01942, j2, this.LLILZLL, i, 3);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TimedCompetitionScoreBarManager@2fad.startCompetition$1");
                }
            }, 1000L);
        }
    }

    public final void LJIIIZ(long j, AnonymousClass0194 anonymousClass0194, AnonymousClass0194 anonymousClass01942, long j2, C019G c019g, int i, int i2) {
        this.LJJIJ = j2;
        this.LJJIJLIJ = i2;
        C786410Ut5.LJLZ(0, this.LIZ);
        ImageModel imageModel = anonymousClass0194.LIZJ;
        if (imageModel != null) {
            C0JSS.LJII((ImageView) this.LIZLLL.getValue(), imageModel);
        } else {
            ((AppCompatImageView) this.LIZLLL.getValue()).setImageResource(R.drawable.f9u);
        }
        ImageModel imageModel2 = anonymousClass01942.LIZJ;
        if (imageModel2 != null) {
            C0JSS.LJII((ImageView) this.LJ.getValue(), imageModel2);
        } else {
            ((AppCompatImageView) this.LJ.getValue()).setImageResource(R.drawable.f9u);
        }
        ((TextView) this.LJI.getValue()).setText(anonymousClass0194.LIZIZ);
        ((TextView) this.LJII.getValue()).setText(anonymousClass01942.LIZIZ);
        C0GUW c0guwLJFF = LJFF();
        c0guwLJFF.LLIZ = 0L;
        c0guwLJFF.LLIZLLLIL = 0L;
        c0guwLJFF.LLILLL = 0.5f;
        c0guwLJFF.LLJJIII = false;
        C0GUW c0guwLJFF2 = LJFF();
        TextView textView = (TextView) this.LJIIL.getValue();
        TextView textView2 = (TextView) this.LJIILIIL.getValue();
        c0guwLJFF2.LL = textView;
        c0guwLJFF2.LLILLJJLI = textView2;
        LJIILL(anonymousClass0194.LIZLLL, anonymousClass01942.LIZLLL, j2, false);
        this.LJJIIZI = EnumC2856018s.STARTED;
        if (c019g != null) {
            LIZJ(c019g, j, j2, false);
        } else {
            LJIILJJIL(anonymousClass0194, (ConstraintLayout) this.LJIILJJIL.getValue(), (AppCompatImageView) this.LJIILLIIL.getValue(), (C16F5) this.LJJ.getValue(), (AppCompatImageView) this.LJIJJ.getValue(), (AppCompatImageView) this.LJIJ.getValue());
            LJIILJJIL(anonymousClass01942, (ConstraintLayout) this.LJIILL.getValue(), (AppCompatImageView) this.LJIIZILJ.getValue(), (C16F5) this.LJIL.getValue(), (AppCompatImageView) this.LJIJJLI.getValue(), (AppCompatImageView) this.LJIJI.getValue());
            LJIIJJI(i, j, true);
            LJIIIIZZ(j);
            C11JF c11jf = this.LJJIIJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            this.LJJIIJ = null;
            C11JF c11jf2 = this.LJJIII;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LJJIII = (C11JF) C11NZ.LJJJJLL(0L, j + 1, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLJLI(new C516401zm(j, this, 3));
        }
        this.LJJIFFI = anonymousClass01942;
        this.LJJII = anonymousClass0194;
    }
}
