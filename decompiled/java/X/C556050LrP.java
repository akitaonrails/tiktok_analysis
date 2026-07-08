package X;

import kotlin.jvm.internal.AwS401S0200000_35;

/* JADX INFO: renamed from: X.0LrP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C556050LrP {
    public final /* synthetic */ C556030LrN LIZ;

    public final void LIZIZ() {
        C1D80 c1d80 = this.LIZ.LIZJ;
        c1d80.getClass();
        c1d80.LJFF(new AwS401S0200000_35(c1d80, (Object) null, 12));
    }

    public final void LIZJ() {
        C1D80 c1d80 = this.LIZ.LIZJ;
        c1d80.getClass();
        c1d80.LJFF(new AwS401S0200000_35(c1d80, (Object) null, 13));
    }

    public final void LIZLLL() {
        this.LIZ.LIZJ.LJII();
    }

    public C556050LrP(C556030LrN c556030LrN) {
        this.LIZ = c556030LrN;
    }

    public final void LIZ(EnumC2398509aZ enumC2398509aZ) {
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runtime.cancel called, workflowId=");
        sbLIZ.append(this.LIZ.LIZ.LIZ);
        sbLIZ.append(", reason=");
        sbLIZ.append(enumC2398509aZ);
        C201955140j.LIZLLL(c0lx3, "AIGCWorkflowSessionImpl", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LIZJ.LIZIZ(enumC2398509aZ);
    }
}
