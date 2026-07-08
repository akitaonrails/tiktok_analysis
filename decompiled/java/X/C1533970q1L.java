package X;

import com.bytedance.forest.experiments.ForestExperiment;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS232S0300000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q1L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533970q1L {
    public final C1535040q34 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public C1533790q13 LJ;
    public final boolean LJFF;
    public final AtomicInteger LJI;
    public volatile boolean LJII;

    public final boolean LIZ() {
        String str;
        C1533790q13 c1533790q13;
        C1534360q1y<?> c1534360q1y;
        if (!ForestExperiment.INSTANCE.getFetchIfDestroyed() && (c1533790q13 = this.LJ) != null && (c1534360q1y = c1533790q13.LJJIIJZLJL) != null) {
            c1534360q1y.LIZIZ();
        }
        this.LJI.decrementAndGet();
        boolean zCancel = this.LIZ.cancel();
        if (zCancel && (str = this.LIZIZ) != null) {
            C1533900q1E.LJIJ.remove(str, this);
        }
        return zCancel;
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public /* synthetic */ C1533970q1L(C1535040q34 c1535040q34) {
        this(c1535040q34, null, "", false, null);
    }

    public final boolean LIZIZ(C1533790q13 c1533790q13, C1533970q1L c1533970q1L, boolean z, Function1<? super C1533790q13, Unit> function1) {
        EnumC1534440q26 enumC1534440q26;
        C1533490q0Z c1533490q0Z;
        C1533910q1F c1533910q1F;
        this.LJI.incrementAndGet();
        if (!Intrinsics.LJFF(this.LIZJ, c1533970q1L.LIZJ)) {
            this.LIZ.LJIIIZ.LIZIZ = true;
            this.LJII = true;
            c1533970q1L.LIZ.LJIIIZ.LIZIZ = true;
            c1533970q1L.LJII = true;
        }
        C1533790q13 c1533790q132 = this.LJ;
        if (c1533790q132 != null && (c1533490q0Z = c1533790q132.LIZ) != null && (c1533910q1F = c1533490q0Z.LJJJLZIJ) != null) {
            enumC1534440q26 = c1533910q1F.LJIIIIZZ;
        } else {
            enumC1534440q26 = null;
        }
        c1533790q13.LJJIJIL = enumC1534440q26;
        C1535040q34 c1535040q34 = this.LIZ;
        C1535040q34 c1535040q342 = c1533970q1L.LIZ;
        c1535040q34.getClass();
        boolean zLJIILJJIL = c1535040q34.LJIILJJIL(c1535040q342, c1533790q13, c1533790q13.LIZ.LJ, c1535040q342.LIZJ, new AwS232S0300000_23(c1535040q342, (C1535040q34) c1533790q13, (C1533790q13) function1, (Function1<? super C1533790q13, Unit>) 0), z);
        if (!zLJIILJJIL) {
            c1535040q342.LJIIIZ.LIZLLL(0, false);
            c1535040q342.LIZLLL = null;
        }
        return zLJIILJJIL;
    }

    public C1533970q1L(C1535040q34 c1535040q34, String str, String str2, boolean z, C1533790q13 c1533790q13) {
        C1533490q0Z c1533490q0Z;
        this.LIZ = c1535040q34;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = c1533790q13;
        boolean z2 = false;
        if (c1533790q13 != null && (c1533490q0Z = c1533790q13.LIZ) != null && (c1533490q0Z.LJJIJL || c1533490q0Z.LJIIIZ || c1533490q0Z.LJIIIIZZ)) {
            z2 = true;
        }
        this.LJFF = z2;
        this.LJI = new AtomicInteger(1);
    }
}
