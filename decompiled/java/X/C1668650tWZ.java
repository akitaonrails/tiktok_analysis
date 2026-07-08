package X;

/* JADX INFO: renamed from: X.0tWZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668650tWZ implements Comparable<C1668650tWZ> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public final float LL;

    public static final boolean LIZJ(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LL);
    }

    public final String toString() {
        return LJFF(this.LL);
    }

    public /* synthetic */ C1668650tWZ(float f) {
        this.LL = f;
    }

    public static String LJFF(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(f);
        sbLIZ.append(".dp");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1668650tWZ c1668650tWZ) {
        return Float.compare(this.LL, c1668650tWZ.LL);
    }

    public final boolean equals(Object obj) {
        float f = this.LL;
        if (!(obj instanceof C1668650tWZ) || Float.compare(f, ((C1668650tWZ) obj).LL) != 0) {
            return false;
        }
        return true;
    }
}
