package X;

/* JADX INFO: renamed from: X.0fvj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146090fvj {
    public final EnumC994430bz7 LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1146090fvj)) {
            return false;
        }
        C1146090fvj c1146090fvj = (C1146090fvj) obj;
        return this.LIZ == c1146090fvj.LIZ && this.LIZIZ == c1146090fvj.LIZIZ && this.LIZJ == c1146090fvj.LIZJ && this.LIZLLL == c1146090fvj.LIZLLL && this.LJ == c1146090fvj.LJ;
    }

    public static C1146090fvj LIZ(C1146090fvj c1146090fvj, boolean z, boolean z2) {
        EnumC994430bz7 enumC994430bz7 = c1146090fvj.LIZ;
        int i = c1146090fvj.LIZIZ;
        boolean z3 = c1146090fvj.LIZLLL;
        c1146090fvj.getClass();
        return new C1146090fvj(enumC994430bz7, i, z, z3, z2);
    }

    public C1146090fvj(EnumC994430bz7 enumC994430bz7, int i, boolean z, boolean z2, boolean z3) {
        this.LIZ = enumC994430bz7;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
