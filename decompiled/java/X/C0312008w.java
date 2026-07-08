package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.008w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0312008w {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC0311008v LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final List<EnumC1384070m7Z> LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0312008w)) {
            return false;
        }
        C0312008w c0312008w = (C0312008w) obj;
        return this.LIZ == c0312008w.LIZ && Intrinsics.LJFF(this.LIZIZ, c0312008w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0312008w.LIZJ) && this.LIZLLL == c0312008w.LIZLLL && Intrinsics.LJFF(this.LJ, c0312008w.LJ) && this.LJFF == c0312008w.LJFF && this.LJI == c0312008w.LJI && Intrinsics.LJFF(this.LJII, c0312008w.LJII) && this.LJIIIIZZ == c0312008w.LJIIIIZZ && this.LJIIIZ == c0312008w.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0312008w(long j, String str, String str2, EnumC0311008v enumC0311008v, String str3, boolean z, boolean z2, List<? extends EnumC1384070m7Z> list, boolean z3, boolean z4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = enumC0311008v;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = list;
        this.LJIIIIZZ = z3;
        this.LJIIIZ = z4;
    }
}
