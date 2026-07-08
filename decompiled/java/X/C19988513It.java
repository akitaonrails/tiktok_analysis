package X;

import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13It, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19988513It {
    public Object[] LIZ = new Object[8];
    public int[] LIZIZ;
    public int LIZJ;

    public final String LIZ() {
        StringBuilder sb = new StringBuilder(e3.c);
        int i = this.LIZJ + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.LIZ[i2];
            if (obj instanceof InterfaceC19983313Gt) {
                InterfaceC19983313Gt interfaceC19983313Gt = (InterfaceC19983313Gt) obj;
                if (!Intrinsics.LJFF(interfaceC19983313Gt.LIZIZ(), C19982613Gm.LIZ)) {
                    int i3 = this.LIZIZ[i2];
                    if (i3 >= 0) {
                        sb.append(e3.d);
                        sb.append(interfaceC19983313Gt.LIZJ(i3));
                    }
                } else if (this.LIZIZ[i2] != -1) {
                    sb.append(e3.e);
                    sb.append(this.LIZIZ[i2]);
                    sb.append(e3.f);
                }
            } else if (obj != C13JP.LIZ) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public C19988513It() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.LIZIZ = iArr;
        this.LIZJ = -1;
    }

    public final String toString() {
        return LIZ();
    }
}
