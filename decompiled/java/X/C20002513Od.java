package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.13Od, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20002513Od {
    public static final C01GW<Boolean> LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5431));
    public InterfaceExecutorC740550T3d LIZ;
    public int LIZIZ = 5;

    public final C20001113Np LIZ() {
        C741240T5u c13qj;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Init][TaskManager][MaxTaskSize:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(']');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("JKL", strLIZIZ);
        if (LIZJ.getValue().booleanValue()) {
            c13qj = C20001113Np.LJIIJ.getValue();
        } else {
            c13qj = this.LIZ;
            if (c13qj == null) {
                c13qj = new C13QJ();
            }
        }
        return new C20001113Np(this.LIZIZ, c13qj);
    }
}
