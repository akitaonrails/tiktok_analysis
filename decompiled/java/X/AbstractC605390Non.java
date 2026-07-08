package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0Non, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC605390Non {
    public final String LIZ;
    public final long LIZIZ;
    public final AbstractC605420Noq LIZJ;

    public InterfaceC346201Wa<Boolean> LIZ(InterfaceC605380Nom interfaceC605380Nom) {
        return null;
    }

    public abstract Object LIZIZ(C605550Np3 c605550Np3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public boolean LJ() {
        return false;
    }

    public final String LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(":done");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(":fail");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC605390Non(String str, long j, AbstractC605420Noq abstractC605420Noq) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = abstractC605420Noq;
    }
}
