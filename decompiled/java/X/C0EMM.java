package X;

import X.InterfaceC350240DoE;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0EMM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public abstract class C0EMM<T extends InterfaceC350240DoE, C> {
    public final Class<T> LIZ;
    public final List<T> LIZIZ = new ArrayList();

    public C0EMM(Class<T> cls) {
        this.LIZ = cls;
    }

    public final void LIZ(InterfaceC350240DoE interfaceC350240DoE) {
        if (!this.LIZ.isInstance(interfaceC350240DoE)) {
            return;
        }
        ((ArrayList) this.LIZIZ).add(interfaceC350240DoE);
        String simpleName = getClass().getSimpleName();
        String simpleName2 = interfaceC350240DoE.getClass().getSimpleName();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleName);
        sbLIZ.append(" register:");
        sbLIZ.append(simpleName2);
        C201955140j.LIZLLL(c563650M8t, "EPSyncTask", C2188811AlT.LIZIZ(sbLIZ));
    }
}
