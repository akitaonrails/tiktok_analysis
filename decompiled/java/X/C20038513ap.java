package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS183S0101000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13ap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20038513ap extends AbstractC20085213iM {
    public final C05P0<Function2<InterfaceC1680500tpg, Integer, Unit>> LLJ;
    public boolean LLJI;

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C20038513ap.class.getName();
    }

    @Override // X.AbstractC20085213iM, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(getContext());
        if (componentCallbacks2LIZ instanceof InterfaceC1563380qmm) {
            ((InterfaceC1563380qmm) componentCallbacks2LIZ).LLLIIL(EnumC682280QpW.MAIN, new AwS574S0100000_30(this, 338));
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // X.AbstractC20085213iM
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LLJI;
    }

    public C20038513ap(Context context) {
        super(context, null, 0);
        this.LLJ = C20028913Yh.LJI(null);
    }

    public final void setContent(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        this.LLJI = true;
        ((C13FE) this.LLJ).setValue(function2);
        if (isAttachedToWindow()) {
            LIZJ();
        }
    }

    @Override // X.AbstractC20085213iM
    public final void LIZ(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(233135889);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Function2 function2 = (Function2) ((C13FE) this.LLJ).getValue();
            if (function2 != null) {
                function2.invoke(c13zcLJIIJ, 0);
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS183S0101000_30(this, i, 3);
        }
    }
}
