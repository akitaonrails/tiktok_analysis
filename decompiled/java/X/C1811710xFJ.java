package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xFJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811710xFJ implements InterfaceC1811770xFP {
    public final View LIZ;
    public final View LIZIZ;
    public boolean LIZJ;
    public ViewOnLayoutChangeListenerC1864650ych LIZLLL;
    public final int[] LJ = new int[2];
    public final int[] LJFF = new int[2];

    @Override // X.InterfaceC1811720xFK
    public final void LIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg, C19MB c19mb) {
    }

    @Override // X.InterfaceC1811770xFP
    public final void reset() {
        ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych = this.LIZLLL;
        if (viewOnLayoutChangeListenerC1864650ych != null) {
            this.LIZIZ.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
        }
        this.LIZLLL = null;
        this.LIZJ = false;
    }

    public C1811710xFJ(View view, View view2) {
        this.LIZ = view;
        this.LIZIZ = view2;
    }

    @Override // X.InterfaceC1811720xFK
    public final void LIZIZ(AbstractC1811580xF6 abstractC1811580xF6, C124600dg c124600dg) {
        if (Intrinsics.LJFF(abstractC1811580xF6, C1811670xFF.LIZ)) {
            if (this.LIZLLL == null) {
                ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych = new ViewOnLayoutChangeListenerC1864650ych(this, 8);
                this.LIZIZ.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych);
                this.LIZLLL = viewOnLayoutChangeListenerC1864650ych;
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(abstractC1811580xF6, C1811660xFE.LIZ) && !(abstractC1811580xF6 instanceof C1811530xF1)) {
            throw new C1954807lC();
        }
        ViewOnLayoutChangeListenerC1864650ych viewOnLayoutChangeListenerC1864650ych2 = this.LIZLLL;
        if (viewOnLayoutChangeListenerC1864650ych2 != null) {
            this.LIZIZ.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1864650ych2);
        }
        this.LIZLLL = null;
        this.LIZJ = false;
        View view = this.LIZ;
        C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
        Float fValueOf = Float.valueOf(0.0f);
        c1546210qL5.getClass();
        C500260Jjc.LJJZ(C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf)), view);
    }
}
