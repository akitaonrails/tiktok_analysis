package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0V9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC793120V9i implements InterfaceC793220V9s {
    public final C793100V9g LIZ;

    @Override // X.InterfaceC793220V9s
    public void LIZLLL() {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stop detect when state is : ");
            sbLIZ.append(LIZIZ());
            C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public AbstractC793120V9i(C793100V9g c793100V9g) {
        this.LIZ = c793100V9g;
    }

    @Override // X.InterfaceC793220V9s
    public void LIZJ(boolean z) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLifeCycleChange when state is : ");
            sbLIZ.append(LIZIZ());
            C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJ(String str) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(LIZIZ());
            sbLIZ.append("]: ");
            sbLIZ.append(str);
            C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC793220V9s
    public void LIZ(C0V9K c0v9k, boolean z) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enter : ");
            sbLIZ.append(LIZIZ());
            C792910V8n.LIZLLL("APM-CPU", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
