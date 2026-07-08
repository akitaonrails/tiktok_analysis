package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import xlp.c;

/* JADX INFO: renamed from: X.0X0X, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0X extends AbstractC842530X3j {
    public static final C0X0P LIZJ = C0X0P.LIZIZ("application/x-www-form-urlencoded");
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    @Override // X.AbstractC842530X3j
    public final long LIZ() {
        return LJII(null, true);
    }

    public final int LJI() {
        return this.LIZ.size();
    }

    @Override // X.AbstractC842530X3j
    public final C0X0P LIZIZ() {
        return LIZJ;
    }

    @Override // X.AbstractC842530X3j
    public final void LJ(InterfaceC1496780p3M interfaceC1496780p3M) {
        LJII(interfaceC1496780p3M, false);
    }

    public final String LJFF(int i) {
        return (String) ListProtector.get(this.LIZ, i);
    }

    public C0X0X(List<String> list, List<String> list2) {
        this.LIZ = c.LJIILIIL(list);
        this.LIZIZ = c.LJIILIIL(list2);
    }

    public final long LJII(InterfaceC1496780p3M interfaceC1496780p3M, boolean z) {
        C1496690p3D c1496690p3DBuffer;
        if (z) {
            c1496690p3DBuffer = new C1496690p3D();
        } else {
            c1496690p3DBuffer = interfaceC1496780p3M.buffer();
        }
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                c1496690p3DBuffer.LJJJZ(38);
            }
            c1496690p3DBuffer.LJLJJLL((String) ListProtector.get(this.LIZ, i));
            c1496690p3DBuffer.LJJJZ(61);
            c1496690p3DBuffer.LJLJJLL((String) ListProtector.get(this.LIZIZ, i));
        }
        if (z) {
            long j = c1496690p3DBuffer.LLILLJJLI;
            c1496690p3DBuffer.LIZ();
            return j;
        }
        return 0L;
    }
}
