package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractViewOnClickListenerC1636290sgN extends C1636260sgK<Effect> implements View.OnClickListener {
    public final C1662850tND LLILZIL;
    public final InterfaceC1624480sNK LLILZLL;
    public InterfaceC1631540sYi<Effect> LLIZ;
    public InterfaceC1625960sPi LLIZLLLIL;
    public InterfaceC1636220sgG LLJ;

    @Override // X.C1636260sgK
    public final void R5() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate = this.LLILZIL.animate();
        if (viewPropertyAnimatorAnimate != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        C19670811xi c19670811xi = this.LLILZIL.LLLJL;
        if (c19670811xi == null) {
            c19670811xi = null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = c19670811xi.animate();
        if (viewPropertyAnimatorAnimate2 != null) {
            viewPropertyAnimatorAnimate2.cancel();
        }
    }

    @Override // X.C1636260sgK
    public final void S5(boolean z) {
        boolean z2;
        C1662850tND c1662850tND = this.LLILZIL;
        TextView textView = c1662850tND.getTextView();
        if (textView instanceof AnonymousClass1280) {
            AnonymousClass1280 anonymousClass1280 = (AnonymousClass1280) textView;
            if (!z && c1662850tND.isSelected()) {
                z2 = true;
            } else {
                z2 = false;
            }
            anonymousClass1280.setMarqueeEnable$lib_runtime_release(z2);
        }
    }

    public void U5(boolean z) {
        this.LLILZIL.setCustomSelected(z);
    }

    @Override // X.C1636260sgK
    public final void P5(float f, boolean z) {
        if (z) {
            View view = this.itemView;
            ViewOnTouchListenerC1657570tEh viewOnTouchListenerC1657570tEh = new ViewOnTouchListenerC1657570tEh(f, 100L, this.LLILZIL);
            if (C2281551ESb.LIZIZ.LJJIIZI()) {
                viewOnTouchListenerC1657570tEh.LLILZ = true;
            }
            view.setOnTouchListener(viewOnTouchListenerC1657570tEh);
            return;
        }
        this.itemView.setOnTouchListener(null);
    }

    public final void V5(EnumC1641420soe enumC1641420soe, Integer num) {
        int i = C1632150sZh.LIZ[enumC1641420soe.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    if (num == null) {
                        this.LLILZIL.LJIJI();
                        return;
                    } else {
                        this.LLILZIL.LJIIZILJ(num.intValue());
                        return;
                    }
                }
                throw new C1954807lC();
            }
            this.LLILZIL.LJIJ();
            return;
        }
        this.LLILZIL.LJIJJ();
    }

    public AbstractViewOnClickListenerC1636290sgN(View view, C1662850tND c1662850tND, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1631540sYi<Effect> interfaceC1631540sYi) {
        super(view);
        this.LLILZIL = c1662850tND;
        this.LLILZLL = interfaceC1624480sNK;
        this.LLIZ = interfaceC1631540sYi;
        this.LLJ = new InterfaceC1636220sgG() { // from class: X.0sgE
            @Override // X.InterfaceC1636220sgG
            public final boolean LIZ(Effect effect, Effect effect2) {
                if (C1635900sfk.LIZ()) {
                    return C1625940sPg.LJIILJJIL(this.LIZ.LLILZLL, effect2);
                }
                if (C1625940sPg.LJIIL(this.LIZ.LLILZLL, effect2) && !C1624200sMs.LJIIIIZZ(effect2)) {
                    return true;
                }
                return false;
            }
        };
        C786410Ut5.I7(this, view);
        c1662850tND.setShowDownloadIcon(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1636260sgK
    /* JADX INFO: renamed from: T5, reason: merged with bridge method [inline-methods] */
    public void N5(Effect effect, EnumC1641420soe enumC1641420soe, Integer num, int i) {
        String effectId;
        boolean zBooleanValue;
        String effectId2 = effect.getEffectId();
        Effect effect2 = (Effect) this.LL;
        if (effect2 != null) {
            effectId = effect2.getEffectId();
        } else {
            effectId = null;
        }
        if (!Intrinsics.LJFF(effectId2, effectId)) {
            return;
        }
        InterfaceC1636220sgG interfaceC1636220sgG = this.LLJ;
        boolean zBooleanValue2 = false;
        if (interfaceC1636220sgG != null && interfaceC1636220sgG.LIZ(this.LLILZLL.LLILIL(), effect)) {
            C1662850tND c1662850tND = this.LLILZIL;
            Boolean value = this.LLIZ.LLLIIIL().getValue();
            if (value != null) {
                zBooleanValue2 = value.booleanValue();
            }
            C1637440siE.LJ(c1662850tND, true, zBooleanValue2);
        } else {
            C1662850tND c1662850tND2 = this.LLILZIL;
            Boolean value2 = this.LLIZ.LLLIIIL().getValue();
            if (value2 != null) {
                zBooleanValue = value2.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1637440siE.LJ(c1662850tND2, false, zBooleanValue);
        }
        V5(enumC1641420soe, num);
    }
}
