package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383920F3m implements C0EFX {
    public final ViewGroup LIZ;
    public final InterfaceC360800ECo LIZIZ;
    public final View LIZJ;
    public final C0E5S LIZLLL;
    public final C0E48 LJ;
    public float LJFF = 1.0f;
    public final Map<View, Integer> LJI = new LinkedHashMap();
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1080));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1079));

    @Override // X.C0EFX
    public final void LIZ() {
        InterfaceC360800ECo interfaceC360800ECo = this.LIZIZ;
        if (interfaceC360800ECo != null) {
            interfaceC360800ECo.b5(EnumC373600Eko.PLAY);
        }
        C0E48 c0e48 = this.LJ;
        this.LJFF = (c0e48 == null || !c0e48.Bo().LIZ()) ? 0.34f : 1.0f;
        C0E48 c0e482 = this.LJ;
        if (c0e482 != null) {
            c0e482.Bo().LJFF();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.34f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 24));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 22));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C0EFX
    public final void LIZIZ() {
        ((ValueAnimator) this.LJII.getValue()).cancel();
        ((ValueAnimator) this.LJIIIIZZ.getValue()).start();
    }

    @Override // X.C0EFX
    public final void LIZJ() {
        ((ValueAnimator) this.LJIIIIZZ.getValue()).cancel();
        ((ValueAnimator) this.LJII.getValue()).start();
    }

    @Override // X.C0EFX
    public final void LJJIJIIJIL() {
        InterfaceC360800ECo interfaceC360800ECo = this.LIZIZ;
        if (interfaceC360800ECo != null) {
            interfaceC360800ECo.b5(EnumC373600Eko.PAUSE);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.34f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 25));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0100000_5(this, 23));
        valueAnimatorOfFloat.start();
    }

    public C383920F3m(ViewGroup viewGroup, InterfaceC360800ECo interfaceC360800ECo, View view, C0E5S c0e5s, C0E48 c0e48) {
        this.LIZ = viewGroup;
        this.LIZIZ = interfaceC360800ECo;
        this.LIZJ = view;
        this.LIZLLL = c0e5s;
        this.LJ = c0e48;
    }
}
