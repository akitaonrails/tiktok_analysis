package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S0200002_35;

/* JADX INFO: renamed from: X.1Dp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2267451Dp1 {
    public final List<Function1<C2267041DoM, Unit>> LIZ;
    public final int LIZIZ;

    public AbstractC2267451Dp1(List<Function1<C2267041DoM, Unit>> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }

    public final void LIZ(C1557270qcv c1557270qcv, float f, float f2) {
        this.LIZ.add(new AwS3S0200002_35(this, c1557270qcv, f, f2, 1));
    }
}
