package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1Bc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208451Bc3 {
    public C11JF LIZIZ;
    public AbstractC2208061BbQ LIZJ;
    public AbstractC2208541BcC LIZ = new AbstractC2208541BcC(this) { // from class: X.1BcM
        public final String toString() {
            return "New";
        }

        @Override // X.AbstractC2208541BcC
        public final void LJII() {
            this.LIZ.LJ();
        }

        {
            super(this);
        }
    };
    public final C1431640nMI LIZLLL = new C1431640nMI(C0C64.LJIILLIIL().LJIJ(31744, 300000, "upload_speed_probe_min_gap", true), false);

    public final void LJ() {
        LIZLLL(new AbstractC2208541BcC(this) { // from class: X.1Bc6
            public final String toString() {
                return "Running";
            }

            @Override // X.AbstractC2208541BcC
            public final void LIZ() {
                C2208451Bc3 c2208451Bc3 = this.LIZ;
                c2208451Bc3.getClass();
                c2208451Bc3.LIZLLL(new C2208581BcG(c2208451Bc3, null));
                AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(c2208451Bc3, 167);
                boolean zLJI = MethodIDManager.LJI(137715);
                C823050WQl.LJFF().execute(new ARunnableS112S0100000_12(awS578S0100000_34, (Function0<Unit>) 389));
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.AbstractC2208541BcC
            public final void LJ() {
                final C2208451Bc3 c2208451Bc3 = this.LIZ;
                c2208451Bc3.LIZLLL(new AbstractC2208601BcI(c2208451Bc3) { // from class: X.1BcO
                    public final String toString() {
                        return "Failed";
                    }
                });
            }

            @Override // X.AbstractC2208541BcC
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

            @Override // X.AbstractC2208541BcC
            public final void LIZLLL(C2208561BcE c2208561BcE) {
                C2208451Bc3 c2208451Bc3 = this.LIZ;
                C1431640nMI c1431640nMI = c2208451Bc3.LIZLLL;
                c1431640nMI.getClass();
                c1431640nMI.LIZJ = System.currentTimeMillis();
                c2208451Bc3.LIZLLL(c2208561BcE);
            }

            @Override // X.AbstractC2208541BcC
            public final void LJFF(C2208471Bc5 c2208471Bc5) {
                this.LIZ.LIZLLL(c2208471Bc5);
            }
        });
        AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(this, 166);
        boolean zLJI = MethodIDManager.LJI(137715);
        C823050WQl.LJFF().execute(new ARunnableS112S0100000_12(awS578S0100000_34, (Function0<Unit>) 389));
        if (zLJI) {
            MethodIDManager.LJ();
        }
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

    public final synchronized void LIZIZ(C2208561BcE c2208561BcE) {
        this.LIZ.LIZLLL(c2208561BcE);
    }

    public final void LIZLLL(AbstractC2208541BcC abstractC2208541BcC) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LIZIZ());
        sbLIZ.append(" change to ");
        sbLIZ.append(abstractC2208541BcC);
        LIZ(C2188811AlT.LIZIZ(sbLIZ), true);
        this.LIZ = abstractC2208541BcC;
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
