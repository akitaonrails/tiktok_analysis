package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0qF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542500qF6<T> implements InterfaceC1537230q6b {
    public static final C1542500qF6<T> LIZ = new C1542500qF6<>();

    @Override // X.InterfaceC1537230q6b
    public final Object create() {
        HashSet<C1BP1> hashSet = (HashSet) C1542450qF1.LIZ;
        for (C1BP1 c1bp1 : hashSet) {
            Set<C1BP1<?, ?>> set = C1542450qF1.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Provide method: ");
            sbLIZ.append(c1bp1.LIZ);
            C1542450qF1.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return hashSet;
    }

    @Override // X.InterfaceC1537230q6b
    public final Object LIZ(Object obj) {
        return create();
    }
}
