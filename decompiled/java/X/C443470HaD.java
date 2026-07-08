package X;

/* JADX INFO: renamed from: X.0HaD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443470HaD {
    public final C443490HaF LIZ;
    public final C443450HaB LIZIZ;
    public final C443450HaB LIZJ;
    public final C443450HaB LIZLLL;

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C443450HaB c443450HaB = this.LIZLLL;
        return iHashCode + (c443450HaB == null ? 0 : c443450HaB.hashCode());
    }

    public C443470HaD(C443490HaF c443490HaF, C443450HaB c443450HaB, C443450HaB c443450HaB2, C443450HaB c443450HaB3) {
        this.LIZ = c443490HaF;
        this.LIZIZ = c443450HaB;
        this.LIZJ = c443450HaB2;
        this.LIZLLL = c443450HaB3;
    }
}
