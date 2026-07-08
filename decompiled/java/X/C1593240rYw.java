package X;

/* JADX INFO: renamed from: X.0rYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593240rYw {
    public final EnumC1593230rYv LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1593240rYw)) {
            return false;
        }
        C1593240rYw c1593240rYw = (C1593240rYw) obj;
        return this.LIZ == c1593240rYw.LIZ && this.LIZIZ == c1593240rYw.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSwitchPointInfo(point=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeStampMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1593240rYw(EnumC1593230rYv enumC1593230rYv) {
        this(enumC1593230rYv, System.currentTimeMillis());
    }

    public C1593240rYw(EnumC1593230rYv enumC1593230rYv, long j) {
        this.LIZ = enumC1593230rYv;
        this.LIZIZ = j;
    }
}
