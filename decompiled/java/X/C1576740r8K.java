package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.BitSet;

/* JADX INFO: renamed from: X.0r8K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576740r8K {
    public static C1576740r8K LJIIIIZZ;
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final BitSet LJ = new BitSet();
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public final boolean LIZIZ(int i) {
        return this.LJ.get(i);
    }

    public final void LIZJ(boolean z) {
        if (z == this.LIZ) {
            return;
        }
        this.LIZ = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0SGp
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        String strValueOf = String.valueOf(z);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsEnable");
        sbLIZ.append(": ");
        sbLIZ.append(strValueOf);
        C1720106oR.LJI("CleanModeManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZLLL(boolean z) {
        if (this.LIZIZ == z) {
            return;
        }
        this.LIZIZ = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0r8L
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void LJ(boolean z) {
        if (this.LIZJ == z) {
            return;
        }
        this.LIZJ = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0r8M
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void LJFF(boolean z) {
        if (this.LIZLLL == z) {
            return;
        }
        this.LIZLLL = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0SGq
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        String strValueOf = String.valueOf(z);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setIsRecommendEnable");
        sbLIZ.append(": ");
        sbLIZ.append(strValueOf);
        C1720106oR.LJI("CleanModeManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJI(boolean z) {
        if (z == this.LJII) {
            return;
        }
        this.LJII = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0r8N
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void LJII(boolean z) {
        if (this.LJI == z) {
            return;
        }
        this.LJI = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0qu0
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void LJIIIIZZ(boolean z) {
        if (z == this.LJFF) {
            return;
        }
        this.LJFF = z;
        C1440005kM.LIZ(new IEvent() { // from class: X.0r8G
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
    }

    public final void LJIIIZ(int i, boolean z) {
        if (z) {
            this.LJ.set(i);
        } else {
            this.LJ.clear(i);
        }
        C1440005kM.LIZ(new C1576720r8I(i));
    }
}
