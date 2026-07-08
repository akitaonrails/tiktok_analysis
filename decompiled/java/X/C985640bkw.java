package X;

import Y.AAListenerS326S0100000_15;
import Y.ACListenerS150S0100000_15;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS115S0100000_15;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.competition.states.event.CompetitionScoreChangeEvent;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985640bkw extends AbstractC983420bhM implements InterfaceC985580bkq {
    public final BPEAHandler LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public C16F5 LLJ;
    public C16F5 LLJI;
    public C1324720kZq LLJIJIL;
    public C1324720kZq LLJILJIL;
    public C16F5 LLJILJILJ;
    public C16F5 LLJILLL;
    public C16F5 LLJJ;
    public C1126540fQC LLJJI;
    public final AnimatorSet LLJJIII;
    public final AnimatorSet LLJJIJI;
    public final AnimatorSet LLJJIJIIJIL;
    public final AnimatorSet LLJJIJIL;
    public final AnimatorSet LLJJJ;
    public C16F5 LLJJJIL;
    public C1324720kZq LLJJJJ;
    public C16F5 LLJJJJJIL;
    public C1324720kZq LLJJJJLIIL;
    public C16F5 LLJJL;
    public C1324720kZq LLJJLIIIJLLLLLLLZ;
    public final ArrayList<C985670bkz> LLJL;
    public View LLJLIL;
    public C1320810kTX LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public long LLLFF;
    public long LLLFFI;
    public boolean LLLFZ;

    @Override // X.AbstractC983420bhM
    public final String LJIIJ() {
        return "CatchBeansScoreBarComponent";
    }

    @Override // X.InterfaceC985580bkq
    public final void LJI() {
        C983460bhQ c983460bhQ;
        C983460bhQ c983460bhQ2;
        LJIIJJI("onStartAnimationPlayStart");
        LJIIJJI("setInitialCountDownTextValue");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c983460bhQ2 = (C983460bhQ) dataChannel.gg0(CompetitionCountTimeEvent.class)) != null) {
            LJIJJLI(c983460bhQ2);
        }
        C500260Jjc.LLFFF(this.LLIZ);
        C500260Jjc.LLFFF(this.LLILZLL);
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C500260Jjc.LJIILIIL(this.LLJJ);
        C500260Jjc.LJIILIIL(this.LLJJL);
        C500260Jjc.LJIILIIL(this.LLJJLIIIJLLLLLLLZ);
        C500260Jjc.LLFFF(this.LLJIJIL);
        C500260Jjc.LLFFF(this.LLJILJIL);
        DataChannel dataChannel2 = this.LLILLJJLI;
        long j = (dataChannel2 == null || (c983460bhQ = (C983460bhQ) dataChannel2.gg0(CompetitionCountTimeEvent.class)) == null) ? 0L : c983460bhQ.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartAnimationPlayStart, timeLeft = ");
        sbLIZ.append(j);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL.invoke() != EnumC974260bSa.START || j <= 20) {
            LJIJI();
            return;
        }
        C500260Jjc.LLFFF(this.LLJJJJJIL);
        C500260Jjc.LLFFF(this.LLJJJJLIIL);
        C786410Ut5.LJLIIL(1000L, this.LLILZIL, new ARunnableS115S0100000_15(this, 27));
    }

    public final void LJIJ() {
        this.LLJL.clear();
        int i = 0;
        for (C954460awe c954460awe : C915980Zwa.LJII().LJJLI()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            this.LLJL.add(new C985670bkz(c954460awe.LJ));
            i = i2;
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(CompetitionScoreChangeEvent.class, this, new AwS594S0100000_15(this, 103));
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(CompetitionCountTimeEvent.class, this, new AwS594S0100000_15(this, 104));
        }
    }

    @Override // X.AbstractC983420bhM
    public final void LJIIIIZZ() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        super.LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LLILZLL);
        C500260Jjc.LJIILIIL(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C500260Jjc.LJIILIIL(this.LLJJJIL);
        C16F5 c16f5 = this.LLJJJIL;
        if (c16f5 != null) {
            c16f5.clearFocus();
        }
        this.LLJL.clear();
        this.LLILZIL.removeCallbacksAndMessages(null);
        this.LLJJJ.end();
        C16F5 c16f52 = this.LLJ;
        if (c16f52 != null) {
            c16f52.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C16F5 c16f53 = this.LLJI;
        if (c16f53 != null) {
            c16f53.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C16F5 c16f54 = this.LLJJL;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJI(2131851549));
        }
        C16F5 c16f55 = this.LLJI;
        if (c16f55 != null) {
            c16f55.setTextSize(15.0f);
        }
        C16F5 c16f56 = this.LLJ;
        if (c16f56 != null) {
            c16f56.setTextSize(15.0f);
        }
        C16F5 c16f57 = this.LLJILLL;
        if (c16f57 != null && (layoutParams3 = c16f57.getLayoutParams()) != null) {
            layoutParams3.width = (int) C497740JfY.LIZIZ(52.0f);
        }
        C16F5 c16f58 = this.LLJILLL;
        if (c16f58 != null && (layoutParams2 = c16f58.getLayoutParams()) != null) {
            layoutParams2.height = (int) C497740JfY.LIZIZ(19.0f);
        }
        C16F5 c16f59 = this.LLJJ;
        if (c16f59 != null && (layoutParams = c16f59.getLayoutParams()) != null) {
            layoutParams.height = (int) C497740JfY.LIZIZ(19.0f);
        }
        C16F5 c16f510 = this.LLJJ;
        if (c16f510 != null) {
            c16f510.setTextSize(15.0f);
        }
        C16F5 c16f511 = this.LLJILLL;
        if (c16f511 != null) {
            c16f511.setTextSize(15.0f);
        }
        C16F5 c16f512 = this.LLJILJILJ;
        if (c16f512 != null) {
            c16f512.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c16f512.getContext()));
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C500260Jjc.LJIILIIL(this.LLJJ);
        C500260Jjc.LJIILIIL(this.LLJJI);
        C500260Jjc.LJIILIIL(this.LLJ);
        C500260Jjc.LJIILIIL(this.LLJI);
        this.LLJLLIL = false;
        this.LLJLL = false;
        this.LLJLLL = false;
        this.LLJZ = false;
        this.LLLF = false;
        this.LLJZIJLIL = false;
        this.LLL = false;
        this.LLLFZ = false;
        this.LLLFF = -1L;
        this.LLLFFI = -1L;
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILIIL() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        super.LJIILIIL();
        LJIJ();
        View view = this.LLIZLLLIL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        C16F5 c16f5 = this.LLJJJIL;
        if (c16f5 != null) {
            c16f5.clearFocus();
        }
        C16F5 c16f52 = this.LLJJJIL;
        if (c16f52 != null) {
            C500260Jjc.LJIILIIL(c16f52);
        }
        C16F5 c16f53 = this.LLJ;
        if (c16f53 != null) {
            c16f53.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C16F5 c16f54 = this.LLJI;
        if (c16f54 != null) {
            c16f54.setText(CardStruct.IStatusCode.DEFAULT);
        }
        C16F5 c16f55 = this.LLJILJILJ;
        if (c16f55 != null) {
            c16f55.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c16f55.getContext()));
        }
        C16F5 c16f56 = this.LLJJL;
        if (c16f56 != null) {
            c16f56.setText(C497740JfY.LJIJI(2131851549));
        }
        C16F5 c16f57 = this.LLJ;
        if (c16f57 != null) {
            c16f57.setTextSize(15.0f);
        }
        C16F5 c16f58 = this.LLJI;
        if (c16f58 != null) {
            c16f58.setTextSize(15.0f);
        }
        C16F5 c16f59 = this.LLJILLL;
        if (c16f59 != null && (layoutParams3 = c16f59.getLayoutParams()) != null) {
            layoutParams3.width = (int) C497740JfY.LIZIZ(52.0f);
        }
        C16F5 c16f510 = this.LLJILLL;
        if (c16f510 != null && (layoutParams2 = c16f510.getLayoutParams()) != null) {
            layoutParams2.height = (int) C497740JfY.LIZIZ(19.0f);
        }
        C16F5 c16f511 = this.LLJJ;
        if (c16f511 != null && (layoutParams = c16f511.getLayoutParams()) != null) {
            layoutParams.height = (int) C497740JfY.LIZIZ(19.0f);
        }
        C16F5 c16f512 = this.LLJJ;
        if (c16f512 != null) {
            c16f512.setTextSize(15.0f);
        }
        C16F5 c16f513 = this.LLJILLL;
        if (c16f513 != null) {
            c16f513.setTextSize(15.0f);
        }
        C500260Jjc.LJIILIIL(this.LLJ);
        C500260Jjc.LJIILIIL(this.LLJI);
        this.LLJLL = false;
        this.LLLFZ = false;
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZ = false;
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILL() {
        AbstractC1320710kTN abstractC1320710kTNLIZ;
        super.LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showClockAnimation, isShowingClock = ");
        sbLIZ.append(this.LLJLL);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJLL) {
            return;
        }
        this.LLJLL = true;
        C500260Jjc.LJIILIIL(this.LLJJJJJIL);
        C500260Jjc.LJIILIIL(this.LLJJJJLIIL);
        C500260Jjc.LLFFF(this.LLJJL);
        C500260Jjc.LLFFF(this.LLJJLIIIJLLLLLLLZ);
        C500260Jjc.LLFFF(this.LLJJI);
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C500260Jjc.LJIILIIL(this.LLJJ);
        C1126540fQC c1126540fQC = this.LLJJI;
        if (c1126540fQC != null) {
            C786410Ut5.g5(c1126540fQC, 1.0f);
        }
        C1126540fQC c1126540fQC2 = this.LLJJI;
        if (c1126540fQC2 != null) {
            C1320810kTX c1320810kTX = this.LLJLILLLLZIIL;
            if (c1320810kTX != null) {
                c1320810kTX.LJIIJJI = true;
                abstractC1320710kTNLIZ = c1320810kTX.LIZ();
            } else {
                abstractC1320710kTNLIZ = null;
            }
            c1126540fQC2.setController(abstractC1320710kTNLIZ);
        }
    }

    public final void LJIJI() {
        C16F5 c16f5;
        C981900beu c981900beu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showCountDownViewAndScore, getCurStatus() = ");
        sbLIZ.append(this.LLILLL.invoke());
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c981900beu = (C981900beu) dataChannel.gg0(CompetitionScoreChangeEvent.class)) != null) {
            LJIL(c981900beu, false);
        }
        C500260Jjc.LJIILIIL(this.LLJJJJJIL);
        C500260Jjc.LJIILIIL(this.LLJJJJLIIL);
        C500260Jjc.LLFFF(this.LLJJL);
        C500260Jjc.LLFFF(this.LLJJLIIIJLLLLLLLZ);
        C500260Jjc.LLFFF(this.LLJ);
        C500260Jjc.LLFFF(this.LLJI);
        if (this.LLILLL.invoke() == EnumC974260bSa.PUNISH) {
            C500260Jjc.LLFFF(this.LLJILLL);
            C500260Jjc.LLFFF(this.LLJJ);
            C500260Jjc.LJIILIIL(this.LLJILJILJ);
        } else if (this.LLILLL.invoke() == EnumC974260bSa.SETTLE) {
            C500260Jjc.LJIILIIL(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJJ);
            C500260Jjc.LJIILIIL(this.LLJILJILJ);
        } else {
            C500260Jjc.LLFFF(this.LLJILJILJ);
            C500260Jjc.LJIILIIL(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJJ);
            if (this.LLILLL.invoke() == EnumC974260bSa.DRAW && (c16f5 = this.LLJILJILJ) != null) {
                c16f5.setText("00:00");
            }
        }
        C500260Jjc.LLFFF(this.LLJIJIL);
        C500260Jjc.LLFFF(this.LLJILJIL);
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void onUnload() {
        super.onUnload();
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public static AnimatorSet LJIILLIIL(C16F5 c16f5) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(LJIIZILJ(c16f5, 0.0f, 1.25f, 240L), LJIIZILJ(c16f5, 1.25f, 0.9f, 200L), LJIIZILJ(c16f5, 0.9f, 1.0f, 120L));
        return animatorSet;
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        C16F5 c16f5;
        C16F5 c16f52;
        C16F5 c16f53;
        C16F5 c16f54;
        C16F5 c16f55;
        C1324720kZq c1324720kZq;
        C1324720kZq c1324720kZq2;
        C1126540fQC c1126540fQC;
        C16F5 c16f56;
        C1324720kZq c1324720kZq3;
        C16F5 c16f57;
        C1324720kZq c1324720kZq4;
        C16F5 c16f58;
        String str;
        String str2;
        View view = matchBaseWidget.LL;
        this.LLJLIL = view;
        C1324720kZq c1324720kZq5 = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.di0);
        } else {
            viewFindViewById = null;
        }
        this.LLILZLL = viewFindViewById;
        View view2 = this.LLJLIL;
        if (view2 != null) {
            viewFindViewById2 = view2.findViewById(R.id.di1);
        } else {
            viewFindViewById2 = null;
        }
        this.LLIZ = viewFindViewById2;
        View view3 = this.LLJLIL;
        if (view3 != null) {
            viewFindViewById3 = view3.findViewById(R.id.di2);
        } else {
            viewFindViewById3 = null;
        }
        this.LLIZLLLIL = viewFindViewById3;
        View view4 = this.LLIZ;
        if (view4 != null) {
            c16f5 = (C16F5) view4.findViewById(R.id.ztm);
        } else {
            c16f5 = null;
        }
        this.LLJ = c16f5;
        View view5 = this.LLIZ;
        if (view5 != null) {
            c16f52 = (C16F5) view5.findViewById(R.id.tv_right_score_text);
        } else {
            c16f52 = null;
        }
        this.LLJI = c16f52;
        View view6 = this.LLIZ;
        if (view6 != null) {
            c16f53 = (C16F5) view6.findViewById(R.id.zcb);
        } else {
            c16f53 = null;
        }
        this.LLJILJILJ = c16f53;
        View view7 = this.LLIZ;
        if (view7 != null) {
            c16f54 = (C16F5) view7.findViewById(R.id.zcc);
        } else {
            c16f54 = null;
        }
        this.LLJILLL = c16f54;
        View view8 = this.LLIZ;
        if (view8 != null) {
            c16f55 = (C16F5) view8.findViewById(R.id.zcd);
        } else {
            c16f55 = null;
        }
        this.LLJJ = c16f55;
        View view9 = this.LLIZ;
        if (view9 != null) {
            c1324720kZq = (C1324720kZq) view9.findViewById(R.id.jt1);
        } else {
            c1324720kZq = null;
        }
        this.LLJIJIL = c1324720kZq;
        View view10 = this.LLIZ;
        if (view10 != null) {
            c1324720kZq2 = (C1324720kZq) view10.findViewById(R.id.jt2);
        } else {
            c1324720kZq2 = null;
        }
        this.LLJILJIL = c1324720kZq2;
        View view11 = this.LLIZ;
        if (view11 != null) {
            c1126540fQC = (C1126540fQC) view11.findViewById(R.id.jsx);
        } else {
            c1126540fQC = null;
        }
        this.LLJJI = c1126540fQC;
        View view12 = this.LLIZLLLIL;
        if (view12 != null) {
            c16f56 = (C16F5) view12.findViewById(R.id.zcj);
        } else {
            c16f56 = null;
        }
        this.LLJJJIL = c16f56;
        if (c16f56 != null) {
            c16f56.setText(C497740JfY.LJIJI(2131851528));
            C786410Ut5.l8(c16f56, new ACListenerS150S0100000_15(this, 33));
        }
        View view13 = this.LLIZLLLIL;
        if (view13 != null) {
            c1324720kZq3 = (C1324720kZq) view13.findViewById(R.id.jsy);
        } else {
            c1324720kZq3 = null;
        }
        this.LLJJJJ = c1324720kZq3;
        if (c1324720kZq3 != null) {
            C786410Ut5.e8(c1324720kZq3, new ACListenerS150S0100000_15(this, 34));
        }
        View view14 = this.LLIZ;
        if (view14 != null) {
            c16f57 = (C16F5) view14.findViewById(R.id.zcq);
        } else {
            c16f57 = null;
        }
        this.LLJJJJJIL = c16f57;
        if (c16f57 != null) {
            c16f57.setText(C497740JfY.LJIJI(2131851549));
            C786410Ut5.l8(c16f57, new ACListenerS150S0100000_15(this, 35));
        }
        View view15 = this.LLIZ;
        if (view15 != null) {
            c1324720kZq4 = (C1324720kZq) view15.findViewById(R.id.jt0);
        } else {
            c1324720kZq4 = null;
        }
        this.LLJJJJLIIL = c1324720kZq4;
        if (c1324720kZq4 != null) {
            C786410Ut5.e8(c1324720kZq4, new ACListenerS150S0100000_15(this, 36));
        }
        View view16 = this.LLIZ;
        if (view16 != null) {
            c16f58 = (C16F5) view16.findViewById(R.id.zcp);
        } else {
            c16f58 = null;
        }
        this.LLJJL = c16f58;
        if (c16f58 != null) {
            c16f58.setText(C497740JfY.LJIJI(2131851549));
            C786410Ut5.l8(c16f58, new ACListenerS150S0100000_15(this, 37));
        }
        View view17 = this.LLIZ;
        if (view17 != null) {
            c1324720kZq5 = (C1324720kZq) view17.findViewById(R.id.jsz);
        }
        this.LLJJLIIIJLLLLLLLZ = c1324720kZq5;
        if (c1324720kZq5 != null) {
            C786410Ut5.e8(c1324720kZq5, new ACListenerS150S0100000_15(this, 38));
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
        this.LLJLILLLLZIIL = c1320810kTXLIZJ;
        C1126540fQC c1126540fQC2 = this.LLJJI;
        if (c1126540fQC2 != null) {
            c1320810kTXLIZJ.LJIIJJI = true;
            c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0ajc
                @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                public final void LJ(String str3, Object obj, Animatable animatable) {
                    AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                    animatedDrawable2.LJI(new C946370ajb(animatedDrawable2.LLILLL, 10));
                }
            };
            c1126540fQC2.setController(c1320810kTXLIZJ.LIZ());
        }
        C1143680frq.LIZLLL(this.LLJIJIL, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_score_bar_left_emoji.png");
        C1143680frq.LIZLLL(this.LLJILJIL, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_score_bar_right_emoji.png");
        C1324720kZq c1324720kZq6 = this.LLJJJJLIIL;
        String str3 = "ttlive_icon_catch_beans_score_bar_chevro_left_bright.png";
        if (C497740JfY.LJJ()) {
            str = "ttlive_icon_catch_beans_score_bar_chevro_left_bright.png";
        } else {
            str = "ttlive_icon_catch_beans_score_bar_chevro_right_bright.png";
        }
        C1143680frq.LIZLLL(c1324720kZq6, "tiktok_live_interaction_demand_10", str);
        C1324720kZq c1324720kZq7 = this.LLJJLIIIJLLLLLLLZ;
        if (C497740JfY.LJJ()) {
            str2 = "ttlive_icon_catch_beans_score_bar_chevro_left_dark.png";
        } else {
            str2 = "ttlive_icon_catch_beans_score_bar_chevro_right_dark.png";
        }
        C1143680frq.LIZLLL(c1324720kZq7, "tiktok_live_interaction_demand_10", str2);
        C1143680frq.LIZLLL(this.LLJJI, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_score_bar_clock.png");
        C1324720kZq c1324720kZq8 = this.LLJJJJ;
        if (!C497740JfY.LJJ()) {
            str3 = "ttlive_icon_catch_beans_score_bar_chevro_right_bright.png";
        }
        C1143680frq.LIZLLL(c1324720kZq8, "tiktok_live_interaction_demand_10", str3);
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILJJIL(EnumC982500bfs enumC982500bfs) {
        super.LJIILJJIL(enumC982500bfs);
        this.LLJLLIL = false;
        LJIJ();
        LJIJI();
        C500260Jjc.LJIILIIL(this.LLJJI);
        C1126540fQC c1126540fQC = this.LLJJI;
        if (c1126540fQC != null) {
            c1126540fQC.LIZLLL();
        }
        C16F5 c16f5 = this.LLJILJILJ;
        if (c16f5 != null) {
            c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c16f5.getContext()));
        }
        C500260Jjc.LLFFF(this.LLILZLL);
        C500260Jjc.LLFFF(this.LLIZ);
    }

    public final void LJIJJ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textChangeAlphaAnimation, position = ");
        sbLIZ.append(i);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !this.LLLF) {
                    this.LLLF = true;
                    this.LLJJIJIIJIL.removeAllListeners();
                    AnimatorSet animatorSet = this.LLJJIJIIJIL;
                    animatorSet.play(LJIILLIIL(this.LLJILJILJ));
                    animatorSet.addListener(new AAListenerS326S0100000_15(this, 3));
                    animatorSet.start();
                    return;
                }
                return;
            }
            if (this.LLL) {
                return;
            }
            this.LLL = true;
            this.LLJJIJI.removeAllListeners();
            AnimatorSet animatorSet2 = this.LLJJIJI;
            animatorSet2.play(LJIILLIIL(this.LLJI));
            animatorSet2.addListener(new AAListenerS326S0100000_15(this, 1));
            animatorSet2.start();
            return;
        }
        if (this.LLJZIJLIL) {
            return;
        }
        this.LLJZIJLIL = true;
        this.LLJJIII.removeAllListeners();
        AnimatorSet animatorSet3 = this.LLJJIII;
        animatorSet3.play(LJIILLIIL(this.LLJ));
        animatorSet3.addListener(new AAListenerS326S0100000_15(this, 0));
        animatorSet3.start();
    }

    public final void LJIJJLI(C983460bhQ c983460bhQ) {
        int i;
        C16F5 c16f5;
        long j;
        String strLJIIL;
        String strLJIJI;
        View view;
        Context context;
        String strLJIJI2;
        long j2 = c983460bhQ.LJ;
        if (c983460bhQ.LJFF == TimeUnit.MILLISECONDS) {
            i = LSPassThroughRecordSizeConfig.DEFAULT;
        } else {
            i = 1;
        }
        long j3 = j2 / ((long) i);
        if (j3 < 0) {
            j3 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBattleCountDown, data.value = ");
        sbLIZ.append(c983460bhQ.LJ);
        sbLIZ.append(", durationSecond = ");
        sbLIZ.append(j3);
        sbLIZ.append(", isShowingSpeedTime = ");
        sbLIZ.append(this.LLJLLIL);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL.invoke() == EnumC974260bSa.PUNISH) {
            C16F5 c16f52 = this.LLJILLL;
            if (c16f52 != null) {
                c16f52.setText(C963140bAe.LJIIL(j3));
                if (this.LLLFZ) {
                    LJIIJJI("catchBeansCountDownTextForPunish, isShrink, true!");
                    c16f52.getLayoutParams().width = (int) C497740JfY.LIZIZ(40.0f);
                    c16f52.getLayoutParams().height = (int) C497740JfY.LIZIZ(16.0f);
                    c16f52.setTextSize(12.0f);
                } else {
                    LJIIJJI("catchBeansCountDownTextForPunish, isShrink, false!");
                    c16f52.getLayoutParams().width = (int) C497740JfY.LIZIZ(52.0f);
                    c16f52.getLayoutParams().height = (int) C497740JfY.LIZIZ(19.0f);
                    c16f52.setTextSize(15.0f);
                }
            }
            C16F5 c16f53 = this.LLJJ;
            if (c16f53 != null) {
                String strLJIJI3 = C497740JfY.LJIJI(2131842811);
                if (strLJIJI3 != null && strLJIJI3.length() > 16) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(a0.LJLIIIL(C497740JfY.LJIJI(2131842811).substring(0, 13)).toString());
                    sbLIZ2.append("...");
                    strLJIJI2 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    strLJIJI2 = C497740JfY.LJIJI(2131842811);
                }
                c16f53.setText(strLJIJI2);
                if (this.LLLFZ) {
                    LJIIJJI("catchBeansVictoryLap, isShrink, true!");
                    c16f53.setTextSize(12.0f);
                    c16f53.getLayoutParams().height = (int) C497740JfY.LIZIZ(16.0f);
                } else {
                    LJIIJJI("catchBeansVictoryLap, isShrink, false!");
                    c16f53.getLayoutParams().height = (int) C497740JfY.LIZIZ(19.0f);
                    c16f53.setTextSize(15.0f);
                }
            }
        } else {
            EnumC974260bSa enumC974260bSaInvoke = this.LLILLL.invoke();
            EnumC974260bSa enumC974260bSa = EnumC974260bSa.START;
            if (enumC974260bSaInvoke == enumC974260bSa && (c16f5 = this.LLJILJILJ) != null && !this.LLJLLIL) {
                if (this.LLILLL.invoke() == EnumC974260bSa.DRAW) {
                    strLJIIL = "00:00";
                    j = 10;
                } else {
                    j = 10;
                    if (j3 <= 10) {
                        strLJIIL = String.valueOf(j3);
                    } else {
                        strLJIIL = C963140bAe.LJIIL(j3);
                    }
                }
                c16f5.setText(strLJIIL);
                if (j3 <= j && this.LLILLL.invoke() == enumC974260bSa) {
                    c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.er6, c16f5.getContext()));
                    LJIJJ(3);
                } else {
                    c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, c16f5.getContext()));
                }
            }
        }
        if (j3 == 10 && this.LLILLL.invoke() == EnumC974260bSa.START && (view = this.LLJLIL) != null && (context = view.getContext()) != null) {
            try {
                Vibrator vibrator = (Vibrator) C786410Ut5.H2(context, "vibrator");
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(350L, 100));
                } else {
                    vibrator.vibrate(350L);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        long j4 = c983460bhQ.LJ;
        if (28 <= j4 && j4 < 31 && this.LLILLL.invoke() == EnumC974260bSa.START) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("tryShowSpeedTimeTips, data.value = ");
            sbLIZ3.append(c983460bhQ.LJ);
            sbLIZ3.append(" durationSecond = ");
            sbLIZ3.append(j3);
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            if (!this.LLJLLIL && !this.LLJLLL) {
                this.LLJLLIL = true;
                this.LLJLLL = true;
                String strLJIJI4 = C497740JfY.LJIJI(2131851566);
                if (strLJIJI4 != null && strLJIJI4.length() > 16) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(a0.LJLIIIL(C497740JfY.LJIJI(2131851566).substring(0, 13)).toString());
                    sbLIZ4.append("...");
                    strLJIJI = C2188811AlT.LIZIZ(sbLIZ4);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131851566);
                }
                C16F5 c16f54 = this.LLJILJILJ;
                if (c16f54 != null) {
                    c16f54.setText(strLJIJI);
                }
                C786410Ut5.LJLIIL(2000L, this.LLILZIL, new ARunnableS113S0100000_13(this, 43));
            }
        }
    }

    public final void LJIL(C981900beu c981900beu, boolean z) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3;
        String strLJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBattleScore, teamScoresMapWithUid = ");
        sbLIZ.append(c981900beu.LIZJ);
        sbLIZ.append("teamScoresMapWithTeamId = ");
        sbLIZ.append(c981900beu.LIZIZ);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        for (C985670bkz c985670bkz : this.LLJL) {
            C982390bfh c982390bfh = c981900beu.LIZJ.get(Long.valueOf(c985670bkz.LIZ));
            if (c982390bfh != null) {
                long j = c982390bfh.LIZIZ;
                if (j <= 0) {
                    j = 0;
                }
                C982390bfh c982390bfh2 = c981900beu.LIZJ.get(Long.valueOf(c985670bkz.LIZ));
                Long lValueOf4 = null;
                if (c982390bfh2 != null) {
                    lValueOf = Long.valueOf(c982390bfh2.LIZ);
                } else {
                    lValueOf = null;
                }
                C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
                if (c981480beEM91 != null) {
                    lValueOf2 = Long.valueOf(c981480beEM91.LJIILIIL);
                } else {
                    lValueOf2 = null;
                }
                boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("teamScoresMapWithUid, isSelfTeam = ");
                sbLIZ2.append(zLJFF);
                sbLIZ2.append(", competitionInternalService.getCompetitionModel(false)?.selfTeamId = ");
                C981480beE c981480beEM912 = C915980Zwa.LIZIZ().M91(false);
                if (c981480beEM912 != null) {
                    lValueOf3 = Long.valueOf(c981480beEM912.LJIILIIL);
                } else {
                    lValueOf3 = null;
                }
                sbLIZ2.append(lValueOf3);
                sbLIZ2.append(" eventData.teamScoresMapWithUid[userData.userId]?.teamId = ");
                C982390bfh c982390bfh3 = c981900beu.LIZJ.get(Long.valueOf(c985670bkz.LIZ));
                if (c982390bfh3 != null) {
                    lValueOf4 = Long.valueOf(c982390bfh3.LIZ);
                }
                sbLIZ2.append(lValueOf4);
                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                String strValueOf = String.valueOf(j);
                if (strValueOf.length() != 0) {
                    int length = strValueOf.length();
                    ArrayList arrayList = new ArrayList();
                    while (length > 3) {
                        int i = length - 3;
                        arrayList.add(strValueOf.substring(i, length));
                        length = i;
                    }
                    arrayList.add(strValueOf.substring(0, length));
                    StringBuilder sb = new StringBuilder();
                    for (int size = arrayList.size() - 1; size > 0; size--) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append((String) ListProtector.get(arrayList, size));
                        sbLIZ3.append(',');
                        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    sb.append((String) ListProtector.get(arrayList, 0));
                    strValueOf = sb.toString();
                }
                if (zLJFF) {
                    C16F5 c16f5 = this.LLJ;
                    if (c16f5 != null) {
                        c16f5.setText(strValueOf);
                        if (z && this.LLLFF != j) {
                            LJIJJ(1);
                        }
                        this.LLLFF = j;
                    }
                } else {
                    C16F5 c16f52 = this.LLJI;
                    if (c16f52 != null) {
                        c16f52.setText(strValueOf);
                        if (z && this.LLLFFI != j) {
                            LJIJJ(2);
                        }
                        this.LLLFFI = j;
                    }
                }
                if (j > 1000000) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("isShrink = true, score = ");
                    sbLIZ4.append(j);
                    LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
                    this.LLLFZ = true;
                    String strLJIJI2 = C497740JfY.LJIJI(2131851549);
                    if (strLJIJI2 != null && strLJIJI2.length() > 19) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(a0.LJLIIIL(C497740JfY.LJIJI(2131851549).substring(0, 16)).toString());
                        sbLIZ5.append("...");
                        strLJIJI = C2188811AlT.LIZIZ(sbLIZ5);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131851549);
                    }
                    C16F5 c16f53 = this.LLJJL;
                    if (c16f53 != null) {
                        c16f53.setText(strLJIJI);
                    }
                }
            }
        }
    }

    public C985640bkw(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLILZIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIII = new AnimatorSet();
        this.LLJJIJI = new AnimatorSet();
        this.LLJJIJIIJIL = new AnimatorSet();
        this.LLJJIJIL = new AnimatorSet();
        this.LLJJJ = new AnimatorSet();
        this.LLJL = new ArrayList<>();
        this.LLLFF = -1L;
        this.LLLFFI = -1L;
    }

    public static AnimatorSet LJIIZILJ(C16F5 c16f5, float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(c16f5, (Property<C16F5, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }
}
