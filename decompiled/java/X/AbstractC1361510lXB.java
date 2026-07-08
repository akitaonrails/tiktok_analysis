package X;

import X.C164B;

/* JADX INFO: renamed from: X.0lXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1361510lXB<ITEM, T extends C164B> {
    public boolean LIZ(C164B c164b, Object obj) {
        return true;
    }

    public abstract InterfaceC1361520lXC<T> LIZJ(ITEM item);

    public abstract String LJ(ITEM item);

    public String LIZIZ(ITEM item, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ(item));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public T LIZLLL(ITEM item, String str) {
        T t = LIZJ(item).get(LIZIZ(item, str));
        if (t != null && LIZ(t, item)) {
            return t;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF(C164B c164b, Object obj, String str) {
        LIZJ(obj).LIZIZ(LIZIZ(obj, str), c164b);
    }
}
