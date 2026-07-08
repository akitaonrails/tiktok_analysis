package X;

/* JADX INFO: renamed from: X.05Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1334805Kg {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;

    public C1334805Kg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1334805Kg)) {
            return false;
        }
        C1334805Kg c1334805Kg = (C1334805Kg) obj;
        return this.LIZ == c1334805Kg.LIZ && this.LIZIZ == c1334805Kg.LIZIZ && this.LIZJ == c1334805Kg.LIZJ && this.LIZLLL == c1334805Kg.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMUserPreloadConfig(maxConcurrentTasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", batchIntervalMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1334805Kg(int i) {
        this.LIZ = 3;
        this.LIZIZ = 15000L;
        this.LIZJ = 2;
        this.LIZLLL = 500L;
    }
}
