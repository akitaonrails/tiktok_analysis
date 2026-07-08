package X;

import Y.ALAdapterS21S0100000_26;
import Y.ARunnableS35S0300000_2;
import Y.ATListenerS458S0100000_26;
import Y.AUListenerS274S0100000_26;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS705S0100000_26;

/* JADX INFO: renamed from: X.0w2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1765620w2y extends FrameLayout {
    public C1087110eOb LL;
    public C1087110eOb LLILLJJLI;
    public C1087110eOb LLILLL;
    public C19736512Jv LLILZ;
    public C0GXB LLILZIL;
    public C19736512Jv LLILZLL;
    public View LLIZ;
    public ProgressBar LLIZLLLIL;
    public ConstraintLayout LLJ;
    public C289601Ag LLJI;
    public C19736512Jv LLJIJIL;
    public TuxTextView LLJILJIL;
    public View LLJILJILJ;
    public InterfaceC1765630w2z LLJILLL;
    public Function0<Unit> LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public EnumC1153520g7i LLJJIJIIJIL;
    public C1508390pM5 LLJJIJIL;
    public Integer LLJJJ;
    public Float LLJJJIL;

    public final void LJ() {
        this.LLJJIJI = true;
        C998660c5w.LIZIZ(getContainerFromXml(), new ALAdapterS21S0100000_26(this, 7), new AUListenerS274S0100000_26(this, 5));
    }

    public final void LJI() {
        if (this.LLJJIJIIJIL != EnumC1153520g7i.FULL_SCREEN) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, getActionBarFromXml());
        LIZLLL();
    }

    public final void LJIIIIZZ() {
        if (!this.LLJJIII) {
            C1508390pM5 c1508390pM5 = this.LLJJIJIL;
            if ((c1508390pM5 != null ? c1508390pM5.LJIILLIIL : null) == EnumC1508950pMz.PLAYER_IDLE || this.LLJJIJIIJIL == EnumC1153520g7i.FULL_SCREEN) {
                LJFF(0);
                return;
            }
        }
        C786410Ut5.LLLLLLLLL(getPlayCenterFromXml(), 8);
    }

    public final View getActionBarFromXml() {
        View view = this.LLJILJILJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.a15);
        this.LLJILJILJ = viewFindViewById;
        return viewFindViewById;
    }

    public final ConstraintLayout getContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.eqx);
            this.LLJ = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C19736512Jv getPlayCenterFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qmi);
            this.LLJIJIL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final C1087110eOb getPlayLoadingViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qn7);
            this.LL = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final C19736512Jv getPlaySideFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnd);
            this.LLILZ = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final TuxTextView getPlaySpinnerTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnh);
            this.LLJILJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ProgressBar getSliderCarouselFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkh);
            this.LLIZLLLIL = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final C19736512Jv getSliderCustomIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vki);
            this.LLILZLL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final C0GXB getSliderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkd);
            this.LLILZIL = (C0GXB) callbackFindViewById;
        }
        return (C0GXB) callbackFindViewById;
    }

    public final C289601Ag getTimeTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xwn);
            this.LLJI = (C289601Ag) callbackFindViewById;
        }
        return (C289601Ag) callbackFindViewById;
    }

    public final C1087110eOb getVideoErrorFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_error);
            this.LLILLJJLI = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final C1087110eOb getVideoRetryFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_retry);
            this.LLILLL = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final View getVideoRetryMaskFromXml() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.video_retry_mask);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    public final void LIZIZ() {
        C786410Ut5.LLLLLLLLLL(getTimeTipsFromXml(), 8);
        if (this.LLJJIII) {
            LJFF(2);
        } else if (this.LLJJIJIIJIL == EnumC1153520g7i.FULL_SCREEN) {
            LJFF(0);
        }
    }

    public final void LIZLLL() {
        int visibility = getActionBarFromXml().getVisibility();
        float alpha = getContainerFromXml().getAlpha();
        Integer num = this.LLJJJ;
        if (num != null && visibility == num.intValue() && Intrinsics.LIZLLL(this.LLJJJIL, alpha)) {
            return;
        }
        this.LLJJJ = Integer.valueOf(visibility);
        this.LLJJJIL = Float.valueOf(alpha);
        InterfaceC1765630w2z interfaceC1765630w2z = this.LLJILLL;
        if (interfaceC1765630w2z != null) {
            interfaceC1765630w2z.LJI();
        }
    }

    public final void LJII() {
        C998660c5w.LIZIZ(getContainerFromXml(), new ALAdapterS21S0100000_26(this, 8), new AUListenerS274S0100000_26(this, 6));
    }

    public final EnumC1153520g7i getDisplayMode() {
        return this.LLJJIJIIJIL;
    }

    public final boolean getNeedShowMask() {
        return this.LLJJIJI;
    }

    public final Function0<Unit> getOnMaskTap() {
        return this.LLJJ;
    }

    public final InterfaceC1765630w2z getOnPlayerActionBarListener() {
        return this.LLJILLL;
    }

    public final C1508390pM5 getPlayer() {
        return this.LLJJIJIL;
    }

    public final void LIZ(boolean z) {
        EnumC1508950pMz enumC1508950pMz;
        this.LLJJIII = false;
        C786410Ut5.LLILZIL(getPlayLoadingViewFromXml(), 8);
        if (this.LLJJIJIIJIL != EnumC1153520g7i.FULL_SCREEN) {
            C1508390pM5 c1508390pM5 = this.LLJJIJIL;
            if (c1508390pM5 != null) {
                enumC1508950pMz = c1508390pM5.LJIILLIIL;
            } else {
                enumC1508950pMz = null;
            }
            if (enumC1508950pMz != EnumC1508950pMz.PLAYER_IDLE) {
                return;
            }
        }
        if (z) {
            getPlayCenterFromXml().LIZJ();
            C1508390pM5 c1508390pM52 = this.LLJJIJIL;
            if (c1508390pM52 != null) {
                c1508390pM52.LJIILLIIL = EnumC1508950pMz.PLAYER_START;
            }
        }
        LJFF(0);
    }

    public final void LIZJ(long j) {
        if (this.LLJJIJIIJIL == EnumC1153520g7i.PREVIEW) {
            return;
        }
        ARunnableS35S0300000_2 aRunnableS35S0300000_2 = new ARunnableS35S0300000_2(getContainerFromXml(), new AUListenerS274S0100000_26(this, 4), new ALAdapterS21S0100000_26(this, 6), 10);
        C998660c5w.LIZIZ = aRunnableS35S0300000_2;
        C01GW c01gw = C998660c5w.LIZ;
        ((Handler) c01gw.getValue()).removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(j, (Handler) c01gw.getValue(), aRunnableS35S0300000_2);
    }

    public final void LJFF(int i) {
        C443120HZe c443120HZe;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c443120HZe = new C443120HZe(8, 8, 8);
                } else {
                    c443120HZe = new C443120HZe(8, 8, 0);
                }
            } else {
                c443120HZe = new C443120HZe(8, 0, 8);
            }
        } else {
            c443120HZe = new C443120HZe(0, 8, 8);
        }
        int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
        int iIntValue2 = ((Number) c443120HZe.getSecond()).intValue();
        int iIntValue3 = ((Number) c443120HZe.getThird()).intValue();
        C786410Ut5.LLLLLLLLL(getPlayCenterFromXml(), iIntValue);
        C786410Ut5.LLLLLLLLLL(getTimeTipsFromXml(), iIntValue2);
        C786410Ut5.LLILZIL(getPlayLoadingViewFromXml(), iIntValue3);
    }

    public final void setActionBarFromXml(View view) {
        this.LLJILJILJ = view;
    }

    public final void setContainerFromXml(ConstraintLayout constraintLayout) {
        this.LLJ = constraintLayout;
    }

    public final void setCustomSliding(boolean z) {
        this.LLJJI = z;
    }

    public final void setDisplayMode(EnumC1153520g7i enumC1153520g7i) {
        this.LLJJIJIIJIL = enumC1153520g7i;
    }

    public final void setLoading(boolean z) {
        this.LLJJIII = z;
    }

    public final void setNeedShowMask(boolean z) {
        this.LLJJIJI = z;
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

    public final void setOnMaskTap(Function0<Unit> function0) {
        this.LLJJ = function0;
    }

    public final void setOnPlayerActionBarListener(InterfaceC1765630w2z interfaceC1765630w2z) {
        this.LLJILLL = interfaceC1765630w2z;
    }

    public final void setPlayCenterFromXml(C19736512Jv c19736512Jv) {
        this.LLJIJIL = c19736512Jv;
    }

    public final void setPlayLoadingViewFromXml(C1087110eOb c1087110eOb) {
        this.LL = c1087110eOb;
    }

    public final void setPlaySideFromXml(C19736512Jv c19736512Jv) {
        this.LLILZ = c19736512Jv;
    }

    public final void setPlaySpinnerTextFromXml(TuxTextView tuxTextView) {
        this.LLJILJIL = tuxTextView;
    }

    public final void setPlayer(C1508390pM5 c1508390pM5) {
        this.LLJJIJIL = c1508390pM5;
    }

    public final void setSliderCarouselFromXml(ProgressBar progressBar) {
        this.LLIZLLLIL = progressBar;
    }

    public final void setSliderCustomIconFromXml(C19736512Jv c19736512Jv) {
        this.LLILZLL = c19736512Jv;
    }

    public final void setSliderFromXml(C0GXB c0gxb) {
        this.LLILZIL = c0gxb;
    }

    public final void setTimeTipsFromXml(C289601Ag c289601Ag) {
        this.LLJI = c289601Ag;
    }

    public final void setVideoErrorFromXml(C1087110eOb c1087110eOb) {
        this.LLILLJJLI = c1087110eOb;
    }

    public final void setVideoRetryFromXml(C1087110eOb c1087110eOb) {
        this.LLILLL = c1087110eOb;
    }

    public final void setVideoRetryMaskFromXml(View view) {
        this.LLIZ = view;
    }

    public C1765620w2y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = EnumC1153520g7i.PREVIEW;
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.as7, this, true);
        getPlayLoadingViewFromXml().setReferencedIds(new int[]{R.id.qng, R.id.qnh});
        C786410Ut5.LLILZIL(getPlayLoadingViewFromXml(), 8);
        getVideoErrorFromXml().setReferencedIds(new int[]{R.id.video_error_mask, R.id.qnv, R.id.qnw});
        C786410Ut5.LLILZIL(getVideoErrorFromXml(), 8);
        getVideoRetryFromXml().setReferencedIds(new int[]{R.id.video_retry_mask, R.id.qnx, R.id.qny});
        C786410Ut5.LLILZIL(getVideoRetryFromXml(), 8);
        C786410Ut5.I7(new AbS705S0100000_26(this, 6, 42), getPlaySideFromXml());
        C786410Ut5.xb(getSliderFromXml(), new C1775880wJW(this, 1));
        C786410Ut5.I7(new AbS705S0100000_26(this, 7, 42), getSliderCustomIconFromXml());
        C786410Ut5.I7(new AbS705S0100000_26(this, 8, 42), getVideoRetryMaskFromXml());
        getSliderFromXml().setMax(10000);
        getSliderCarouselFromXml().setMax(10000);
        getSliderFromXml().setOnTouchListener(new ATListenerS458S0100000_26(this, 5));
        getContainerFromXml().setOnTouchListener(new ATListenerS458S0100000_26(this, 6));
    }
}
