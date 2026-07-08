package X;

/* JADX INFO: renamed from: X.0fFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119750fFF {
    public final /* synthetic */ C1119760fFG LIZ;

    public final void LIZ() {
        if (this.LIZ.LIZLLL.LIZIZ.isLaidOut()) {
            C1119700fFA.LIZJ(this.LIZ);
            return;
        }
        ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d = new ViewOnLayoutChangeListenerC1151610g4d(this, 21);
        C1119760fFG c1119760fFG = this.LIZ;
        c1119760fFG.LIZJ = viewOnLayoutChangeListenerC1151610g4d;
        c1119760fFG.LIZLLL.LIZIZ.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
    }

    public C1119750fFF(C1119760fFG c1119760fFG) {
        this.LIZ = c1119760fFG;
    }
}
