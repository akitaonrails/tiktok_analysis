package X;

import Y.ALAdapterS22S0100000_27;
import Y.ARunnableS35S0300000_2;
import Y.ARunnableS39S0300000_6;
import Y.AUListenerS275S0100000_27;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightVideobarSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835980xsS extends FrameLayout {
    public static final /* synthetic */ int LLJZ = 0;
    public ImageView LL;
    public ImageView LLILLJJLI;
    public C19736512Jv LLILLL;
    public C0GXB LLILZ;
    public C289601Ag LLILZIL;
    public C1087110eOb LLILZLL;
    public C1087110eOb LLIZ;
    public C1087110eOb LLIZLLLIL;
    public View LLJ;
    public ConstraintLayout LLJI;
    public C0EVM LLJIJIL;
    public C19736512Jv LLJILJIL;
    public C376400EpK LLJILJILJ;
    public TuxTextView LLJILLL;
    public View LLJJ;
    public InterfaceC1836070xsb LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public C1752050vh5 LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public boolean LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public Integer LLJLLIL;
    public Float LLJLLL;

    public final void LIZLLL() {
        this.LLJJIJIIJIL = true;
        if (this.LLJJIJIL) {
            ARunnableS35S0300000_2 aRunnableS35S0300000_2 = new ARunnableS35S0300000_2(getContainerFromXml(), new AUListenerS275S0100000_27(this, 86), new ALAdapterS22S0100000_27(this, 5), 4);
            C1836080xsc.LIZIZ = aRunnableS35S0300000_2;
            C1836080xsc.LIZ().removeCallbacksAndMessages(null);
            C786410Ut5.LJLIIL(0L, C1836080xsc.LIZ(), aRunnableS35S0300000_2);
            return;
        }
        C786410Ut5.LL(0, getContainerFromXml());
        C786410Ut5.c5(getContainerFromXml(), 1.0f);
        if (this.LLJJJ) {
            if (this.LLJJIJIL) {
                LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL);
            } else {
                this.LLJJIJIIJIL = false;
                C786410Ut5.c5(getContainerFromXml(), 0.0f);
                LIZJ();
            }
        }
        LIZJ();
    }

    public final void LJFF() {
        if (!LiveReplayHighlightVideobarSetting.INSTANCE.enable()) {
            C786410Ut5.LJLLLLLL(0, getActionBarFromXml());
            LIZJ();
        } else if (this.LLJL) {
            this.LLJLIL = true;
            C786410Ut5.LJLLLLLL(4, getActionBarFromXml());
        } else {
            this.LLJLIL = false;
            C786410Ut5.LJLLLLLL(0, getActionBarFromXml());
            LIZJ();
        }
    }

    public final View getActionBarFromXml() {
        View view = this.LLJJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.a15);
        this.LLJJ = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLJI = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C0EVM getMomentViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ok4);
            this.LLJIJIL = (C0EVM) callbackFindViewById;
        }
        return (C0EVM) callbackFindViewById;
    }

    public final C376400EpK getPlayCenterFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qmi);
            this.LLJILJILJ = (C376400EpK) callbackFindViewById;
        }
        return (C376400EpK) callbackFindViewById;
    }

    public final C1087110eOb getPlayLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qn7);
            this.LLILZLL = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final C19736512Jv getPlaySideFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnd);
            this.LLILLL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final TuxTextView getPlaySpinnerTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnh);
            this.LLJILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ImageView getPlayVideoErrorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnv);
            this.LLILLJJLI = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final ImageView getPlayVideoRetryFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnx);
            this.LL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final C19736512Jv getSliderCustomIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vki);
            this.LLJILJIL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final C0GXB getSliderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkd);
            this.LLILZ = (C0GXB) callbackFindViewById;
        }
        return (C0GXB) callbackFindViewById;
    }

    public final C289601Ag getTimeTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xwn);
            this.LLILZIL = (C289601Ag) callbackFindViewById;
        }
        return (C289601Ag) callbackFindViewById;
    }

    public final C1087110eOb getVideoErrorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_error);
            this.LLIZ = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final C1087110eOb getVideoRetryFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_retry);
            this.LLIZLLLIL = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final View getVideoRetryMaskFromXml() {
        View view = this.LLJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.video_retry_mask);
        this.LLJ = viewFindViewById;
        return viewFindViewById;
    }

    public final void LIZJ() {
        int visibility = getContainerFromXml().getVisibility();
        float alpha = getContainerFromXml().getAlpha();
        Integer num = this.LLJLLIL;
        if (num != null && visibility == num.intValue() && Intrinsics.LIZLLL(this.LLJLLL, alpha)) {
            return;
        }
        this.LLJLLIL = Integer.valueOf(visibility);
        this.LLJLLL = Float.valueOf(alpha);
        InterfaceC1836070xsb interfaceC1836070xsb = this.LLJJI;
        if (interfaceC1836070xsb != null) {
            interfaceC1836070xsb.LJI(alpha, visibility);
        }
    }

    public final boolean getAlwaysHideTimeView() {
        return this.LLJJL;
    }

    public final TuxTextView getCurTimeView() {
        return this.LLJJJJJIL;
    }

    public final boolean getHideMiddleWhenPlaying() {
        return this.LLJJJIL;
    }

    public final C1752050vh5 getMiddleAction() {
        return this.LLJJJJ;
    }

    public final boolean getNeedAnimation() {
        return this.LLJJIJIL;
    }

    public final boolean getNeedHide() {
        return this.LLJJJ;
    }

    public final boolean getNeedShowMask() {
        return this.LLJJIJIIJIL;
    }

    public final InterfaceC1836070xsb getOnPlayerActionBarListener() {
        return this.LLJJI;
    }

    public final TuxTextView getTotalDurationView() {
        return this.LLJJJJLIIL;
    }

    public final void LIZ(boolean z) {
        this.LLJJIJI = false;
        C786410Ut5.LLILZIL(getPlayLoadingViewFromXml(), 8);
        if (z) {
            C376400EpK playCenterFromXml = getPlayCenterFromXml();
            playCenterFromXml.setImageDrawable(playCenterFromXml.LLILLJJLI);
            C1835120xr4.LIZ = EnumC1508960pN0.PLAYER_START;
        }
        LJ(0);
    }

    public final void LIZIZ(long j) {
        ARunnableS39S0300000_6 aRunnableS39S0300000_6 = new ARunnableS39S0300000_6(getContainerFromXml(), new AUListenerS275S0100000_27(this, 6), new ALAdapterS22S0100000_27(this, 3), 10);
        C1836080xsc.LIZIZ = aRunnableS39S0300000_6;
        C1836080xsc.LIZ().removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(j, C1836080xsc.LIZ(), aRunnableS39S0300000_6);
    }

    public final void LJ(int i) {
        C443120HZe c443120HZe;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c443120HZe = new C443120HZe(8, 8, 8);
                } else {
                    c443120HZe = new C443120HZe(8, 8, 0);
                }
            } else if (this.LLJJL) {
                c443120HZe = new C443120HZe(8, 8, 8);
            } else {
                c443120HZe = new C443120HZe(8, 0, 8);
            }
        } else {
            c443120HZe = new C443120HZe(0, 8, 8);
        }
        int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
        int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
        int iIntValue3 = ((Number) c443120HZe.getThird()).intValue();
        C376400EpK playCenterFromXml = getPlayCenterFromXml();
        int visibility = playCenterFromXml.getVisibility();
        playCenterFromXml.setVisibility(iIntValue);
        C1602160rnK.LIZIZ(visibility, iIntValue, playCenterFromXml);
        C786410Ut5.LLLLLLLLLL(getTimeTipsFromXml(), iIntValue2);
        C786410Ut5.LLILZIL(getPlayLoadingViewFromXml(), iIntValue3);
    }

    public final void setActionBarFromXml(View view) {
        this.LLJJ = view;
    }

    public final void setAlwaysHideTimeView(boolean z) {
        this.LLJJL = z;
    }

    public final void setContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJI = constraintLayout;
    }

    public final void setCurTimeView(TuxTextView tuxTextView) {
        this.LLJJJJJIL = tuxTextView;
    }

    public final void setCurrentProgress(String str) {
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setCustomSliding(boolean z) {
        this.LLJJIII = z;
    }

    public final void setDeferActionBarVisible(boolean z) {
        View actionBarFromXml = getActionBarFromXml();
        boolean z2 = true;
        if (z) {
            if (actionBarFromXml.getVisibility() == 0) {
                this.LLJLIL = true;
            }
            this.LLJL = true;
            C786410Ut5.LJLLLLLL(4, actionBarFromXml);
            return;
        }
        if (!this.LLJL || !this.LLJLIL) {
            z2 = false;
        }
        this.LLJL = false;
        if (z2) {
            this.LLJLIL = false;
            C786410Ut5.LJLLLLLL(0, actionBarFromXml);
            LIZJ();
        }
    }

    public final void setHideMiddleWhenPlaying(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setLoading(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setMiddleAction(C1752050vh5 c1752050vh5) {
        this.LLJJJJ = c1752050vh5;
        C500260Jjc.LJLIIIL(500L, getSliderCustomIconFromXml(), new AwS606S0100000_27(this, 123));
    }

    public final void setMomentViewFromXml(C0EVM c0evm) {
        this.LLJIJIL = c0evm;
    }

    public final void setNeedAnimation(boolean z) {
        this.LLJJIJIL = z;
    }

    public final void setNeedHide(boolean z) {
        this.LLJJJ = z;
    }

    public final void setNeedShowMask(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setNetSpeed(int i) {
        TuxTextView playSpinnerTextFromXml = getPlaySpinnerTextFromXml();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (i < 0) {
            i = 0;
        }
        sbLIZ.append(i);
        sbLIZ.append(" KB/s");
        playSpinnerTextFromXml.setText(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void setOnPlayerActionBarListener(InterfaceC1836070xsb interfaceC1836070xsb) {
        this.LLJJI = interfaceC1836070xsb;
    }

    public final void setPlayCenterFromXml(C376400EpK c376400EpK) {
        this.LLJILJILJ = c376400EpK;
    }

    public final void setPlayLoadingViewFromXml(C1087110eOb c1087110eOb) {
        this.LLILZLL = c1087110eOb;
    }

    public final void setPlaySideFromXml(C19736512Jv c19736512Jv) {
        this.LLILLL = c19736512Jv;
    }

    public final void setPlaySpinnerTextFromXml(TuxTextView tuxTextView) {
        this.LLJILLL = tuxTextView;
    }

    public final void setPlayVideoErrorFromXml(ImageView imageView) {
        this.LLILLJJLI = imageView;
    }

    public final void setPlayVideoRetryFromXml(ImageView imageView) {
        this.LL = imageView;
    }

    public final void setSliderCustomIconFromXml(C19736512Jv c19736512Jv) {
        this.LLJILJIL = c19736512Jv;
    }

    public final void setSliderFromXml(C0GXB c0gxb) {
        this.LLILZ = c0gxb;
    }

    public final void setTimeTipsFromXml(C289601Ag c289601Ag) {
        this.LLILZIL = c289601Ag;
    }

    public final void setTotalDuration(String str) {
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setTotalDurationView(TuxTextView tuxTextView) {
        this.LLJJJJLIIL = tuxTextView;
    }

    public final void setVideoErrorFromXml(C1087110eOb c1087110eOb) {
        this.LLIZ = c1087110eOb;
    }

    public final void setVideoRetryFromXml(C1087110eOb c1087110eOb) {
        this.LLIZLLLIL = c1087110eOb;
    }

    public final void setVideoRetryMaskFromXml(View view) {
        this.LLJ = view;
    }

    public C1835980xsS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJIL = true;
        this.LLJJJ = true;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dh4, this, true);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_3pt_refresh;
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        c419910GdJ.LJ = numValueOf;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        getPlayVideoRetryFromXml().setImageDrawable(c419910GdJ.LIZ(getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_large_no_video;
        c419910GdJ2.LJ = numValueOf;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        getPlayVideoErrorFromXml().setImageDrawable(c419910GdJ2.LIZ(getContext()));
        C500260Jjc.LJLIIIL(500L, getPlaySideFromXml(), new AwS606S0100000_27(this, 121));
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) findViewById(R.id.jah);
        C786410Ut5.xb(getSliderFromXml(), new SeekBar.OnSeekBarChangeListener() { // from class: X.0xsY
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStartTrackingTouch(SeekBar seekBar) {
                this.LL.setCustomSliding(true);
                InterfaceC1836070xsb onPlayerActionBarListener = this.LL.getOnPlayerActionBarListener();
                if (onPlayerActionBarListener != null) {
                    onPlayerActionBarListener.LIZ();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onStopTrackingTouch(SeekBar seekBar) {
                int progress = 0;
                this.LL.setCustomSliding(false);
                if (seekBar != null) {
                    progress = seekBar.getProgress();
                }
                InterfaceC1836070xsb onPlayerActionBarListener = this.LL.getOnPlayerActionBarListener();
                if (onPlayerActionBarListener != null) {
                    onPlayerActionBarListener.LJ((progress * 1.0f) / 10000);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                float f = (i * 1.0f) / 10000;
                InterfaceC1836070xsb onPlayerActionBarListener = this.LL.getOnPlayerActionBarListener();
                if (onPlayerActionBarListener != null) {
                    onPlayerActionBarListener.LIZJ(f);
                }
                C1835980xsS c1835980xsS = this.LL;
                if (c1835980xsS.LLJJIII && c1835980xsS.LLJLILLLLZIIL < f && f < c1835980xsS.LLJLL) {
                    C500260Jjc.LLFFF(c1835980xsS.LLJJLIIIJLLLLLLLZ);
                } else {
                    C500260Jjc.LJIILIIL(c1835980xsS.LLJJLIIIJLLLLLLLZ);
                }
            }
        });
        getSliderFromXml().setMax(10000);
        C289601Ag timeTipsFromXml = getTimeTipsFromXml();
        if (timeTipsFromXml != null) {
            this.LLJJJJJIL = (TuxTextView) timeTipsFromXml.findViewById(R.id.fb0);
            this.LLJJJJLIIL = (TuxTextView) timeTipsFromXml.findViewById(R.id.yfn);
        }
        getPlayLoadingViewFromXml().setReferencedIds(new int[]{R.id.qng, R.id.qnh});
        C786410Ut5.LLILZIL(getPlayLoadingViewFromXml(), 8);
        getVideoErrorFromXml().setReferencedIds(new int[]{R.id.video_error_mask, R.id.qnv, R.id.qnw});
        C786410Ut5.LLILZIL(getVideoErrorFromXml(), 8);
        getVideoRetryFromXml().setReferencedIds(new int[]{R.id.video_retry_mask, R.id.qnx, R.id.qny});
        C500260Jjc.LJLIIIL(500L, getVideoRetryMaskFromXml(), new AwS606S0100000_27(this, 122));
        C500260Jjc.LJLIIIL(500L, getSliderCustomIconFromXml(), new AwS606S0100000_27(this, 123));
    }
}
