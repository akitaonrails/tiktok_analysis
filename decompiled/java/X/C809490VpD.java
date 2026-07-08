package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809490VpD extends AbstractC809510VpF<InterfaceC809530VpH> implements InterfaceC809530VpH {
    public final int LIZIZ;
    public final String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public InterfaceC808910VoH LJFF;
    public final String LJI;
    public final C809540VpI LJII;

    @Override // X.AbstractC809510VpF
    public final C809490VpD LIZLLL() {
        if (!C2093608Ic.LJ(this.LIZJ)) {
            try {
                Object objNewInstance = Class.forName(this.LIZJ).newInstance();
                if (objNewInstance instanceof InterfaceC808910VoH) {
                    this.LJFF = (InterfaceC808910VoH) objNewInstance;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load IPushChannel success: ");
                sbLIZ.append(this.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
                return this;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("load IPushChannel ");
                sbLIZ2.append(this.LIZJ);
                sbLIZ2.append(" ERROR: ");
                sbLIZ2.append(th);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return this;
    }

    @Override // X.InterfaceC809530VpH
    public final boolean isSupport() {
        if (!this.LJ) {
            this.LIZLLL = this.LJII.LIZ(this.LJFF, this.LIZIZ);
            this.LJ = true;
        }
        InterfaceC808910VoH interfaceC808910VoH = this.LJFF;
        if (interfaceC808910VoH != null) {
            interfaceC808910VoH.getClass().toString();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PushChannel.isSupport(");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(": ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LIZLLL;
    }

    @Override // X.InterfaceC809530VpH
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC809530VpH
    public final InterfaceC808910VoH LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC809530VpH
    public final String LIZJ() {
        return this.LIZJ;
    }

    public C809490VpD(int i, String str, String str2, C809540VpI c809540VpI) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LJI = str2;
        this.LJII = c809540VpI;
    }
}
