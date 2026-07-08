package X;

import java.util.List;

/* JADX INFO: renamed from: X.0NbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597130NbT {
    public final EnumC597140NbU LIZ;
    public final List<C0Y8T> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("action ");
        sbLIZ.append(this.LIZ.LL);
        sbLIZ.append(" raw conversation list size ");
        sbLIZ.append(this.LIZIZ.size());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C597130NbT(EnumC597140NbU enumC597140NbU, List<C0Y8T> list) {
        this.LIZ = enumC597140NbU;
        this.LIZIZ = list;
    }
}
