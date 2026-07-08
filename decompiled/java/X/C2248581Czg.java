package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Czg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248581Czg {
    public final String LIZ;
    public final EnumC592410NLj LIZIZ;
    public final AbstractC2248601Czi LIZJ;
    public final EnumC1584360rKc LIZLLL;
    public final String LJ;
    public final String LJFF;
    public EnumC1250000idK LJI;
    public InterfaceC2248631Czl LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2248581Czg)) {
            return false;
        }
        C2248581Czg c2248581Czg = (C2248581Czg) obj;
        return Intrinsics.LJFF(this.LIZ, c2248581Czg.LIZ) && this.LIZIZ == c2248581Czg.LIZIZ && Intrinsics.LJFF(this.LIZJ, c2248581Czg.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public C2248581Czg(String str, EnumC592410NLj enumC592410NLj, AbstractC2248601Czi abstractC2248601Czi) {
        this.LIZ = str;
        this.LIZIZ = enumC592410NLj;
        this.LIZJ = abstractC2248601Czi;
        EnumC1584360rKc enumC1584360rKc = abstractC2248601Czi.LIZ;
        this.LIZLLL = enumC1584360rKc;
        C1584320rKY.LIZ.getClass();
        this.LJ = C1584320rKY.LJIIJ(enumC1584360rKc);
        this.LJFF = C1584320rKY.LJIIIZ(abstractC2248601Czi.LIZ);
        this.LJII = C2248661Czo.LIZ;
    }
}
