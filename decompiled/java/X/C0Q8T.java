package X;

/* JADX INFO: renamed from: X.0Q8T, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q8T implements C0PWT {
    public final long LL;

    public C0Q8T() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Q8T) && this.LL == ((C0Q8T) obj).LL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchUpdateSessionAction(currentSearchSession=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().ak0().LIZIZ(C13LE.LIZ(C0Q8T.class), new C0Q8U());
        C0Q3E.LJFF().uF().LIZIZ(C13LE.LIZ(C0Q8T.class), new C0Q8V());
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public /* synthetic */ C0Q8T(int i) {
        this(0L);
    }

    public C0Q8T(long j) {
        this.LL = j;
    }
}
