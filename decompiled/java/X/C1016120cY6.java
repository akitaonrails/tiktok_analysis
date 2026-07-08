package X;

/* JADX INFO: renamed from: X.0cY6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016120cY6 extends AbstractC1016110cY5 {
    public final boolean LL;

    public final C1016120cY6 copy(boolean z) {
        return new C1016120cY6(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1016120cY6) && this.LL == ((C1016120cY6) obj).LL;
    }

    public int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardTaskCompleted(isSuccess=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isSuccess() {
        return this.LL;
    }

    public C1016120cY6(boolean z) {
        this.LL = z;
    }
}
