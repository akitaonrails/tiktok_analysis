package X;

import Y.ACallableS243S0200000_11;
import Y.ACallableS418S0100000_11;
import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RmL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705790RmL extends AbstractC705690RmB implements InterfaceC20343214is, InterfaceC695290RPb {
    public final /* synthetic */ C705870RmT LLILLJJLI;
    public InterfaceC704770Rkh LLILLL;
    public boolean LLILZ;
    public AbstractC707180Roa LLILZIL;
    public Function0<Unit> LLILZLL;
    public long LLIZ;
    public boolean LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;
    public Function0<Boolean> LLJILJIL;

    public C705790RmL(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void LIZ() {
        AbstractC707180Roa abstractC707180Roa;
        this.LLJIJIL = false;
        AbstractC707180Roa abstractC707180Roa2 = this.LLILZIL;
        if (abstractC707180Roa2 != null && abstractC707180Roa2.getParent() != null && (abstractC707180Roa = this.LLILZIL) != null) {
            abstractC707180Roa.LIZ();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void LJIIJ() {
        this.LLJIJIL = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = C23250099c.LIZLLL(getMainScope(), null, null, new C433420Gz6(this, null), 3);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final View LJIIL() {
        return this;
    }

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public void setCommodityCard(C0R5I c0r5i) {
    }

    public void setCustomRiskId(String str) {
    }

    @Override // X.InterfaceC695290RPb
    public void setOnPerfListener(InterfaceC705840RmQ interfaceC705840RmQ) {
        this.LLILLJJLI.setOnPerfListener(interfaceC705840RmQ);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void unBind() {
    }

    private final InterfaceC497601wk getMainScope() {
        return (InterfaceC497601wk) this.LLJI.getValue();
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC1393670mN3
    public final boolean LIZIZ() {
        if (this.LLILZIL == null) {
            return false;
        }
        View viewRootView = rootView();
        if (viewRootView != null) {
            C786410Ut5.LJLLLLLL(8, viewRootView);
        }
        AbstractC707180Roa abstractC707180Roa = this.LLILZIL;
        if (abstractC707180Roa == null) {
            return true;
        }
        int visibility = abstractC707180Roa.getVisibility();
        abstractC707180Roa.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, abstractC707180Roa);
        return true;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC1393670mN3
    public final void LJFF() {
        C15O7.LIZIZ(new ACallableS418S0100000_11(this, 0), C15O7.LJIIIIZZ, null);
        this.LLILZIL = null;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final void LJIIIIZZ() {
        AbstractC707180Roa abstractC707180Roa = this.LLILZIL;
        if (abstractC707180Roa != null) {
            abstractC707180Roa.LJIIIZ();
        }
    }

    public final void LJJII() {
        if (this.LLILZ) {
            return;
        }
        C20673215v0.LIZLLL(R.layout.b51, C1388190mED.LIZ(getContext()), this, true);
        this.LLILZ = true;
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, rootView());
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJJJL.getValue());
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705570Rlz
    public String getAwemeId() {
        Aweme awemeLJJLIIIJJIZ;
        InterfaceC704770Rkh interfaceC704770Rkh = this.LLILLL;
        if (interfaceC704770Rkh == null || (awemeLJJLIIIJJIZ = interfaceC704770Rkh.LJJLIIIJJIZ()) == null) {
            return null;
        }
        return awemeLJJLIIIJJIZ.getAid();
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public Map<String, String> getStayTimeBizExtraMap() {
        C1400390mXt anchorMobConfiguration;
        Function0<? extends Map<String, String>> function0;
        AbstractC707180Roa abstractC707180Roa = this.LLILZIL;
        Map<String, String> mapInvoke = (abstractC707180Roa == null || (anchorMobConfiguration = abstractC707180Roa.getAnchorMobConfiguration()) == null || (function0 = anchorMobConfiguration.LIZLLL) == null) ? null : function0.invoke();
        if (this.LLILZIL != null) {
            return mapInvoke;
        }
        return null;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void onCreated() {
        setOnPerfListener(new InterfaceC705840RmQ() { // from class: X.0RbC
            @Override // X.InterfaceC705840RmQ
            public final void LIZ(long j) {
                String aid;
                Aweme awemeLJJLIIIJJIZ;
                C697790RYr c697790RYr = C697790RYr.LIZ;
                InterfaceC704770Rkh interfaceC704770Rkh = this.LIZ.LLILLL;
                if (interfaceC704770Rkh != null && (awemeLJJLIIIJJIZ = interfaceC704770Rkh.LJJLIIIJJIZ()) != null) {
                    aid = awemeLJJLIIIJJIZ.getAid();
                } else {
                    aid = null;
                }
                String end = EnumC697290RWt.P_ANCHOR_FCP.getEnd();
                c697790RYr.getClass();
                C697790RYr.LIZJ(aid, end, null, null, null, null);
            }
        });
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void onDestroy() {
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 190);
        if (((Boolean) C1EKI.LJFF.getValue()).booleanValue()) {
            if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                awS555S0100000_11.invoke();
            } else {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS111S0100000_11(awS555S0100000_11, 137));
            }
        }
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final View LJ() {
        return findViewById(R.id.m8c);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final TextView LJIIJJI() {
        LJJII();
        return (TextView) findViewById(R.id.b2n);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final TextView LJIILIIL() {
        return (TextView) findViewById(R.id.b37);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final View LJIILJJIL() {
        return findViewById(R.id.azq);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final TuxIconView LJIILL() {
        return (TuxIconView) findViewById(R.id.b2i);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final TextView LJIILLIIL() {
        return (TextView) findViewById(R.id.b2r);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final TextView LJIJ() {
        return (TextView) findViewById(R.id.b2q);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final View LJIJJ() {
        View viewFindViewById = findViewById(R.id.ms_);
        viewFindViewById.setTag("FeedMultiTagLayoutListButton");
        return viewFindViewById;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final TextView LJIL() {
        LJJII();
        return (TextView) findViewById(R.id.b2l);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final SmartImageView LJJ() {
        return (SmartImageView) findViewById(R.id.b2h);
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return getCustomRiskId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILLJJLI.LIZIZ();
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void onBind() {
        LJJII();
        if (this.LLILZ) {
            C2180521AVm.LIZ(this, EnumC2180541AVo.V_VISIBLITY, (C1AV2) C1AVH.LJIL.getValue());
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            TextView textViewLJIIJJI = LJIIJJI();
            if (textViewLJIIJJI != null) {
                textViewLJIIJJI.setText("");
                ViewGroup.LayoutParams layoutParams = textViewLJIIJJI.getLayoutParams();
                layoutParams.width = -2;
                C786410Ut5.g6(textViewLJIIJJI, layoutParams);
            }
            TextView textViewLJIILLIIL = LJIILLIIL();
            if (textViewLJIILLIIL != null) {
                C786410Ut5.LLIL(textViewLJIILLIIL, 8);
            }
            TextView textViewLJIL = LJIL();
            if (textViewLJIL != null) {
                C786410Ut5.LLIL(textViewLJIL, 8);
                textViewLJIL.setText("");
                ViewGroup.LayoutParams layoutParams2 = textViewLJIL.getLayoutParams();
                layoutParams2.width = -2;
                C786410Ut5.g6(textViewLJIL, layoutParams2);
            }
            TuxIconView tuxIconViewLJIILL = LJIILL();
            if (tuxIconViewLJIILL != null) {
                C786410Ut5.LLLLLLZZ(tuxIconViewLJIILL, 8);
            }
            SmartImageView smartImageViewLJJ = LJJ();
            if (smartImageViewLJJ != null) {
                smartImageViewLJJ.setImageResource(R.attr.uk);
            }
            TextView textViewLJIJ = LJIJ();
            if (textViewLJIJ != null) {
                textViewLJIJ.setText("");
                C786410Ut5.LLIL(textViewLJIJ, 8);
            }
            View viewLJ = LJ();
            if (viewLJ != null) {
                ViewGroup.LayoutParams layoutParams3 = viewLJ.getLayoutParams();
                layoutParams3.height = -2;
                layoutParams3.width = -2;
                C786410Ut5.W5(viewLJ, layoutParams3);
            }
            this.LLIZLLLIL = false;
            this.LLIZ = -1L;
            AnonymousClass0956 anonymousClass0956 = this.LLJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
        InterfaceC704770Rkh interfaceC704770Rkh = this.LLILLL;
        if (interfaceC704770Rkh != null && interfaceC704770Rkh.LJJJZ()) {
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
        }
        Function0<Boolean> function0 = this.LLJILJIL;
        if (function0 == null || function0.invoke().booleanValue()) {
            return;
        }
        C715390S4j.LIZIZ(4, this);
        if (C715400S4k.LIZIZ()) {
            return;
        }
        C715390S4j.LIZ(rootView());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILLJJLI.LIZJ();
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final View rootView() {
        LJJII();
        return findViewById(R.id.b2j);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final View LIZLLL() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC1393670mN3
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        AbstractC707180Roa abstractC707180Roa;
        C705560Rly.LIZIZ(this);
        AbstractC707180Roa abstractC707180Roa2 = this.LLILZIL;
        if (abstractC707180Roa2 != null && abstractC707180Roa2.getParent() != null && (abstractC707180Roa = this.LLILZIL) != null) {
            return abstractC707180Roa.LIZJ(c2344009Gk);
        }
        return false;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final void LJI(int i) {
        AbstractC707180Roa abstractC707180Roa;
        if (!this.LLJIJIL) {
            return;
        }
        AbstractC707180Roa abstractC707180Roa2 = this.LLILZIL;
        if (abstractC707180Roa2 != null && abstractC707180Roa2.getParent() != null && (abstractC707180Roa = this.LLILZIL) != null) {
            abstractC707180Roa.LJI(i);
        }
        InterfaceC704770Rkh interfaceC704770Rkh = this.LLILLL;
        if (interfaceC704770Rkh != null) {
            interfaceC704770Rkh.LJJJLL(this);
        }
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC1393670mN3
    public final void LJII(AbstractC707180Roa abstractC707180Roa) {
        this.LLILZIL = abstractC707180Roa;
        C15O7.LIZIZ(new ACallableS243S0200000_11(abstractC707180Roa, this, 1), C15O7.LJIIIIZZ, null);
        C705560Rly.LIZ(this, abstractC707180Roa);
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void LJIIZILJ(InterfaceC704770Rkh interfaceC704770Rkh) {
        this.LLILLL = interfaceC704770Rkh;
        LJJII();
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public final void LJIJJLI(double d) {
        AbstractC707180Roa abstractC707180Roa = this.LLILZIL;
        if (abstractC707180Roa != null) {
            abstractC707180Roa.LJIIL(d);
        }
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC704780Rki
    public final void LJJI(AwS555S0100000_11 awS555S0100000_11) {
        this.LLJILJIL = awS555S0100000_11;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Function0<Unit> function0;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() == 1 && (function0 = this.LLILZLL) != null) {
            function0.invoke();
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public void setAnimationBundle(C705850RmR c705850RmR) {
        this.LLIZ = c705850RmR.LIZ;
        this.LLIZLLLIL = c705850RmR.LIZIZ;
    }

    @Override // X.AbstractC705690RmB, X.InterfaceC705550Rlx
    public void setInteceptorTouchAction(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    public C705790RmL(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C705870RmT c705870RmT = new C705870RmT();
        this.LLILLJJLI = c705870RmT;
        this.LLIZ = -1L;
        this.LLJI = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(112));
        if (C715260S3w.LIZIZ()) {
            c705870RmT.LL = this;
        }
    }
}
