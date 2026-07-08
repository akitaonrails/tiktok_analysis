package X;

import Y.ATListenerS456S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593010rYZ extends C1592940rYS {
    @Override // X.C1592940rYS
    public final void LJJJIL() {
        this.LL.setTouchListener(new ATListenerS456S0100000_24(this, 6));
    }

    @Override // X.C1592940rYS
    public final void LJJIJLIJ() {
        if (C1585030rLh.LJIIL() && Intrinsics.LJFF(this.LL.getIconData().LIZIZ, "PUBLISH")) {
            this.LL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1620720sHG(this, 4));
        }
    }

    public C1593010rYZ(C1592950rYT c1592950rYT) {
        super(c1592950rYT);
    }

    public final void LJJJJL(boolean z) {
        C1593140rYm c1593140rYmLJJIZ;
        boolean zLIZIZ = C960203pA.LIZIZ(this.LL.getContext());
        if (C290710BaP.LIZ() && zLIZIZ) {
            c1593140rYmLJJIZ = LJJJ(z);
        } else {
            c1593140rYmLJJIZ = LJJIZ(z);
        }
        C1592950rYT c1592950rYT = this.LL;
        LJJJJIZL(c1592950rYT, c1593140rYmLJJIZ, c1592950rYT.getContext());
    }
}
