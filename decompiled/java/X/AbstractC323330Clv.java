package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Clv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC1294060jmO
public abstract class AbstractC323330Clv<T> {
    public static final /* synthetic */ int LIZ = 0;

    public final List<T> LIZ() {
        if (this instanceof C323350Clx) {
            return ((C323350Clx) this).LIZJ;
        }
        if (this instanceof C323320Clu) {
            return ((C323320Clu) this).LIZIZ;
        }
        if (this instanceof C323310Clt) {
            return null;
        }
        throw new C1954807lC();
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadResult -> ");
        if (this instanceof C323350Clx) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Success, hasMore: true, data size: ");
            sbLIZ2.append(((C323350Clx) this).LIZJ.size());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (this instanceof C323310Clt) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Fail, exception message: ");
            sbLIZ3.append(((C323310Clt) this).LIZIZ.getMessage());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            if (!(this instanceof C323320Clu)) {
                throw new C1954807lC();
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Complete, data size: ");
            sbLIZ4.append(((C323320Clu) this).LIZIZ.size());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
