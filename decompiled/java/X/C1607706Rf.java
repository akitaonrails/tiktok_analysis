package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.06Rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1607706Rf {
    public static final C1607706Rf LIZJ;
    public final EnumC1607606Re LIZ;
    public final EnumC1762306vF LIZIZ = null;

    static {
        new HashMap(4);
        LIZJ = new C1607706Rf(EnumC1607606Re.INTERNAL);
    }

    public final String toString() {
        String location = this.LIZ.getLocation();
        if (this.LIZIZ == null) {
            return location;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(location);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ.getValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1607706Rf(EnumC1607606Re enumC1607606Re) {
        this.LIZ = enumC1607606Re;
    }
}
