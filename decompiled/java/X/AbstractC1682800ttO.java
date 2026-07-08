package X;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ttO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1682800ttO extends AbstractC1668700tWe {
    public Shader LIZIZ;
    public long LIZJ = 9205357640488583168L;

    public abstract Shader LIZIZ(long j);

    @Override // X.AbstractC1668700tWe
    public final void LIZ(float f, long j, InterfaceC1695240uDS interfaceC1695240uDS) {
        Shader shaderLIZIZ = this.LIZIZ;
        if (shaderLIZIZ == null || !C1680770tq7.LIZ(this.LIZJ, j)) {
            if (C1680770tq7.LJ(j)) {
                shaderLIZIZ = null;
                this.LIZIZ = null;
                this.LIZJ = 9205357640488583168L;
            } else {
                shaderLIZIZ = LIZIZ(j);
                this.LIZIZ = shaderLIZIZ;
                this.LIZJ = j;
            }
        }
        long jLIZJ = interfaceC1695240uDS.LIZJ();
        long j2 = C1685910tyP.LIZIZ;
        if (!C1685910tyP.LJ(jLIZJ, j2)) {
            interfaceC1695240uDS.LJIIIZ(j2);
        }
        if (!Intrinsics.LJFF(interfaceC1695240uDS.LJIILJJIL(), shaderLIZIZ)) {
            interfaceC1695240uDS.LJIILL(shaderLIZIZ);
        }
        if (interfaceC1695240uDS.LIZ() != f) {
            interfaceC1695240uDS.setAlpha(f);
        }
    }
}
