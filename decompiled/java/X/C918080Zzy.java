package X;

/* JADX INFO: renamed from: X.0Zzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918080Zzy {
    public final boolean LIZ;
    public final Runnable LIZIZ;
    public final Integer LIZJ;
    public final Integer LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C918080Zzy() {
        this(false, (Runnable) null, (Integer) (0 == true ? 1 : 0), 15);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CoHostInProgressChangedEvent(isInProgress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C918080Zzy(boolean z, Runnable runnable, Integer num, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : runnable, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? -1 : null);
    }

    public C918080Zzy(boolean z, Runnable runnable, Integer num, Integer num2) {
        this.LIZ = z;
        this.LIZIZ = runnable;
        this.LIZJ = num;
        this.LIZLLL = num2;
    }
}
