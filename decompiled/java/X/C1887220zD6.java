package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887220zD6 {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Long LJ;
    public final String LJFF;
    public final Long LJI;
    public final String LJII;
    public final Function0<Unit> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1887220zD6)) {
            return false;
        }
        C1887220zD6 c1887220zD6 = (C1887220zD6) obj;
        return Intrinsics.LJFF(this.LIZ, c1887220zD6.LIZ) && this.LIZIZ == c1887220zD6.LIZIZ && this.LIZJ == c1887220zD6.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1887220zD6.LIZLLL) && Intrinsics.LJFF(this.LJ, c1887220zD6.LJ) && Intrinsics.LJFF(this.LJFF, c1887220zD6.LJFF) && Intrinsics.LJFF(this.LJI, c1887220zD6.LJI) && Intrinsics.LJFF(this.LJII, c1887220zD6.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1887220zD6.LJIIIIZZ);
    }

    public C1887220zD6(String str, int i, boolean z, String str2, Long l, String str3, Long l2, String str4, AwS429S0200000_28 awS429S0200000_28) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = l;
        this.LJFF = str3;
        this.LJI = l2;
        this.LJII = str4;
        this.LJIIIIZZ = awS429S0200000_28;
    }
}
