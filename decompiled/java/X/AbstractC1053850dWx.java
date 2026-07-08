package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0dWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1053850dWx {
    public final int LIZ;
    public final Set<String> LIZIZ;

    public abstract boolean LIZ(InterfaceC1053960dX8 interfaceC1053960dX8);

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append("(samplingRate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", samplingEventSet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1053850dWx(Set set, int i) {
        this.LIZ = i;
        this.LIZIZ = set;
    }
}
