package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0ogk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482760ogk {
    public final List<Double> LIZ;
    public boolean[] LIZIZ;

    public final void LIZ() {
        List<Double> list = this.LIZ;
        if (list == null || list.size() == 0) {
            this.LIZIZ = null;
        } else {
            this.LIZIZ = new boolean[this.LIZ.size()];
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayProgressTrigger reset, target:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", record:");
        Object obj = this.LIZIZ;
        if (obj == null) {
            obj = "null";
        }
        sbLIZ.append(obj);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1482760ogk(List<Double> list) {
        this.LIZ = list;
    }

    public final boolean LIZIZ(long j) {
        boolean[] zArr = this.LIZIZ;
        if (zArr == null || zArr.length == 0 || zArr[zArr.length - 1]) {
            return false;
        }
        for (int length = zArr.length - 1; length >= 0; length--) {
            if (j > ((Double) ListProtector.get(this.LIZ, length)).doubleValue()) {
                boolean[] zArr2 = this.LIZIZ;
                if (!zArr2[length]) {
                    zArr2[length] = true;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PlayProgressTrigger shouldTrigger at progress:");
                    sbLIZ.append(j);
                    sbLIZ.append(", match target:");
                    sbLIZ.append(ListProtector.get(this.LIZ, length));
                    C2188811AlT.LIZIZ(sbLIZ);
                    return true;
                }
            }
        }
        return false;
    }
}
