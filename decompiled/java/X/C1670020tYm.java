package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0tYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670020tYm implements InterfaceC1670310tZF {
    public final int LIZ;

    public final int hashCode() {
        return -this.LIZ;
    }

    public C1670020tYm(int i) {
        this.LIZ = i;
        if (i <= 0) {
            C1691080u6k.LIZ("Provided count should be larger than zero");
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C1670020tYm) && this.LIZ == ((C1670020tYm) obj).LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1670310tZF
    public final List LIZ(int i, int i2) {
        int i3;
        int i4 = this.LIZ;
        int i5 = i - (i2 * (i4 - 1));
        int i6 = i5 / i4;
        int i7 = i5 % i4;
        ArrayList arrayList = new ArrayList(i4);
        for (int i8 = 0; i8 < i4; i8++) {
            if (i8 < i7) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            arrayList.add(Integer.valueOf(i3 + i6));
        }
        return arrayList;
    }
}
