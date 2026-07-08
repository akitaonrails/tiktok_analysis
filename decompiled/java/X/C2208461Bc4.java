package X;

import Y.ARunnableS112S0100000_12;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Bc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208461Bc4 {
    public C11JF LIZIZ;
    public AbstractC2208051BbP LIZJ;
    public AbstractC2208511Bc9 LIZ = new AbstractC2208511Bc9(this) { // from class: X.1BcL
        public final String toString() {
            return "New";
        }

        @Override // X.AbstractC2208511Bc9
        public final void LJII() {
            this.LIZ.LJ();
        }

        {
            super(this);
        }
    };
    public final C1431640nMI LIZLLL = new C1431640nMI(C0C64.LJIILLIIL().LJIJ(31744, 300000, "upload_speed_probe_min_gap", true), false);

    public final void LJ() {
        LIZLLL(new AbstractC2208511Bc9(this) { // from class: X.1Bc8
            public final String toString() {
                return "Running";
            }

            @Override // X.AbstractC2208511Bc9
            public final void LIZ() {
                C2208461Bc4 c2208461Bc4 = this.LIZ;
                c2208461Bc4.getClass();
                c2208461Bc4.LIZLLL(new C2208571BcF(c2208461Bc4, null));
                C823050WQl.LJFF().execute(new ARunnableS112S0100000_12(new AwS578S0100000_34(c2208461Bc4, 164), (Function0<Unit>) 388));
            }

            @Override // X.AbstractC2208511Bc9
            public final void LJ() {
                final C2208461Bc4 c2208461Bc4 = this.LIZ;
                c2208461Bc4.LIZLLL(new AbstractC2208591BcH(c2208461Bc4) { // from class: X.1BcN
                    public final String toString() {
                        return "Failed";
                    }
                });
            }

            @Override // X.AbstractC2208511Bc9
            public final void LIZJ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BDUploadSpeedProbe : ");
                sbLIZ.append("invalid on running");
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BDUploadSpeedProbe : ");
                sbLIZ2.append("invalid on running");
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            }

            {
                super(this);
            }

            @Override // X.AbstractC2208511Bc9
            public final void LIZLLL(C2208551BcD c2208551BcD) {
                C2208461Bc4 c2208461Bc4 = this.LIZ;
                C1431640nMI c1431640nMI = c2208461Bc4.LIZLLL;
                c1431640nMI.getClass();
                c1431640nMI.LIZJ = System.currentTimeMillis();
                c2208461Bc4.LIZLLL(c2208551BcD);
            }

            @Override // X.AbstractC2208511Bc9
            public final void LJFF(C2208491Bc7 c2208491Bc7) {
                this.LIZ.LIZLLL(c2208491Bc7);
            }
        });
        C823050WQl.LJFF().execute(new ARunnableS112S0100000_12(new AwS578S0100000_34(this, 163), (Function0<Unit>) 388));
    }

    public static void LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BDUploadSpeedProbe : ");
        sbLIZ.append(str);
        C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BDUploadSpeedProbe : ");
        sbLIZ2.append(str);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final synchronized void LIZIZ(C2208551BcD c2208551BcD) {
        this.LIZ.LIZLLL(c2208551BcD);
    }

    public final void LIZLLL(AbstractC2208511Bc9 abstractC2208511Bc9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LIZIZ());
        sbLIZ.append(" change to ");
        sbLIZ.append(abstractC2208511Bc9);
        LIZ(C2188811AlT.LIZIZ(sbLIZ), true);
        this.LIZ = abstractC2208511Bc9;
    }

    public static void LIZ(String str, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BDUploadSpeedProbe : ");
            sbLIZ.append(str);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
