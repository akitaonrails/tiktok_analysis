package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0kgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329150kgz implements InterfaceC1330460kj6 {
    public final InterfaceC1329990kiL LIZ = new InterfaceC1329990kiL() { // from class: X.0khB
        @Override // X.InterfaceC1329990kiL
        public final void LIZIZ() {
        }

        @Override // X.InterfaceC1329990kiL
        public final List<Integer> LIZ() {
            return Collections.EMPTY_LIST;
        }
    };

    @Override // X.InterfaceC1330460kj6
    public final int LIZ(int i) {
        List<Integer> listLIZ = this.LIZ.LIZ();
        if (listLIZ != null && !listLIZ.isEmpty()) {
            for (int i2 = 0; i2 < listLIZ.size(); i2++) {
                if (listLIZ.get(i2).intValue() > i) {
                    return listLIZ.get(i2).intValue();
                }
            }
            return Integer.MAX_VALUE;
        }
        return i + 1;
    }

    @Override // X.InterfaceC1330460kj6
    public final C1328060kfE LIZIZ(int i) {
        boolean z;
        this.LIZ.LIZIZ();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        return new C1328060kfE(i, z, false);
    }
}
