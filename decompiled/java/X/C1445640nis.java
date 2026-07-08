package X;

/* JADX INFO: renamed from: X.0nis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445640nis {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public C1445640nis() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1445640nis)) {
            return false;
        }
        C1445640nis c1445640nis = (C1445640nis) obj;
        return this.LIZ == c1445640nis.LIZ && this.LIZIZ == c1445640nis.LIZIZ && this.LIZJ == c1445640nis.LIZJ && this.LIZLLL == c1445640nis.LIZLLL && this.LJ == c1445640nis.LJ && this.LJFF == c1445640nis.LJFF && this.LJI == c1445640nis.LJI && this.LJII == c1445640nis.LJII && this.LJIIIIZZ == c1445640nis.LJIIIIZZ && this.LJIIIZ == c1445640nis.LJIIIZ && this.LJIIJ == c1445640nis.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ) * 31) + this.LJIIJ;
    }

    public final String toString() {
        return "RepublishEditMobParams(isEditTakeEffect=" + this.LIZ + ", isTitleEdited=" + this.LIZIZ + ", isDescriptionEdited=" + this.LIZJ + ", isPhotoDeleted=" + this.LIZLLL + ", isPhotoReordered=" + this.LJ + ", isPhotoEdited=" + this.LJFF + ", isCoverChanged=" + this.LJI + ", isPhotoModifyAdded=" + this.LJII + ", isPhotoTextAdded=" + this.LJIIIIZZ + ", isPhotoTemplateAdded=" + this.LJIIIZ + ", isPhotoStickerAdded=" + this.LJIIJ + ')';
    }

    public C1445640nis(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = i5;
        this.LJFF = i6;
        this.LJI = i7;
        this.LJII = i8;
        this.LJIIIIZZ = i9;
        this.LJIIIZ = i10;
        this.LJIIJ = i11;
    }
}
