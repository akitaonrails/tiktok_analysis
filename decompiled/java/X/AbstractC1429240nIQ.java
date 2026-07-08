package X;

/* JADX INFO: renamed from: X.0nIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1429240nIQ implements InterfaceC1429290nIV {
    public EnumC1429260nIS LIZ = EnumC1429260nIS.NONE;

    public abstract void LIZJ(InterfaceC1429300nIW interfaceC1429300nIW);

    @Override // X.InterfaceC1429290nIV
    public void cancel() {
        this.LIZ = EnumC1429260nIS.CANCELED;
    }

    @Override // X.InterfaceC1429290nIV
    public final EnumC1429260nIS getTaskStatus() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1429290nIV
    public final void LIZ(InterfaceC1429300nIW interfaceC1429300nIW) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeTask: ");
        sbLIZ.append(getTaskType());
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ != EnumC1429260nIS.NONE) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("executeTask: ");
            sbLIZ2.append(getTaskType());
            sbLIZ2.append(" already execute");
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (interfaceC1429300nIW != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("executeTask: onTaskStart: ");
            sbLIZ3.append(getTaskType());
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZ = EnumC1429260nIS.EXECUTING;
            interfaceC1429300nIW.LIZIZ(getTaskType());
        }
        if (LIZIZ()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("executeTask: ");
            sbLIZ4.append(getTaskType());
            sbLIZ4.append(" skip");
            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ4));
            if (interfaceC1429300nIW != null) {
                LJFF(interfaceC1429300nIW);
                return;
            }
            return;
        }
        LIZJ(interfaceC1429300nIW);
    }

    public final void LJFF(InterfaceC1429300nIW interfaceC1429300nIW) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeTask: onTaskSuccess: ");
        sbLIZ.append(getTaskType());
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ == EnumC1429260nIS.CANCELED) {
            return;
        }
        this.LIZ = EnumC1429260nIS.SUCCESS;
        interfaceC1429300nIW.LIZJ(getTaskType());
    }

    public final void LIZLLL(InterfaceC1429300nIW interfaceC1429300nIW, boolean z) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeTask: onTaskFailure: ");
        sbLIZ.append(getTaskType());
        sbLIZ.append(", necessary: ");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ == EnumC1429260nIS.CANCELED) {
            return;
        }
        this.LIZ = EnumC1429260nIS.FAILED;
        interfaceC1429300nIW.LIZ(getTaskType(), z);
    }
}
