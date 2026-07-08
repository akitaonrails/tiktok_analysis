package X;

import Y.ALAdapterS12S0200000_17;
import android.animation.Animator;

/* JADX INFO: renamed from: X.0g4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151800g4w implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Animator.AnimatorListener> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C1151800g4w c1151800g4w, InterfaceC2329309At interfaceC2329309At) {
        ((C1295960jpS) c1151800g4w.l0).addAnimatorListener((ALAdapterS12S0200000_17) c1151800g4w.l1);
    }

    public static final void subscribe$1(C1151800g4w c1151800g4w, InterfaceC2329309At interfaceC2329309At) {
        ((C1295960jpS) c1151800g4w.l0).addAnimatorListener((ALAdapterS12S0200000_17) c1151800g4w.l1);
    }

    public C1151800g4w(C1295960jpS c1295960jpS, ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, int i) {
        this.$t = i;
        this.l0 = c1295960jpS;
        this.l1 = aLAdapterS12S0200000_17;
    }
}
