package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S0200002_35;

/* JADX INFO: renamed from: X.1Dp0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2267441Dp0 {
    public final List<Function1<C2267041DoM, Unit>> LIZ;
    public final int LIZIZ;

    public AbstractC2267441Dp0(List<Function1<C2267041DoM, Unit>> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }

    public final void LIZ(C1557260qcu c1557260qcu, float f, float f2) {
        this.LIZ.add(new AwS3S0200002_35(this, c1557260qcu, f, f2, 0));
    }
}
