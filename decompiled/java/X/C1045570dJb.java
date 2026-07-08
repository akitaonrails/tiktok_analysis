package X;

/* JADX INFO: renamed from: X.0dJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045570dJb {
    public final C1045610dJf LIZ;

    public C1045570dJb(C1045610dJf c1045610dJf) {
        this.LIZ = c1045610dJf;
    }

    public static C1045570dJb LIZ(AbstractC1045600dJe abstractC1045600dJe) {
        C1045610dJf c1045610dJf = (C1045610dJf) abstractC1045600dJe;
        if (!c1045610dJf.LIZLLL) {
            if (!c1045610dJf.LJ) {
                return new C1045570dJb(c1045610dJf);
            }
            throw new IllegalStateException("Viewability session should not be finished");
        }
        throw new IllegalStateException("Viewability session should not be started");
    }
}
