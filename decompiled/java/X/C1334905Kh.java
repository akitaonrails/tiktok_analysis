package X;

/* JADX INFO: renamed from: X.05Kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1334905Kh {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public C1334905Kh() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1334905Kh)) {
            return false;
        }
        C1334905Kh c1334905Kh = (C1334905Kh) obj;
        return this.LIZ == c1334905Kh.LIZ && this.LIZIZ == c1334905Kh.LIZIZ && this.LIZJ == c1334905Kh.LIZJ && this.LIZLLL == c1334905Kh.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMessagePreloadConfig(maxConcurrentTasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", messageCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1334905Kh(int i) {
        this.LIZ = 1;
        this.LIZIZ = 30000L;
        this.LIZJ = 2;
        this.LIZLLL = 5;
    }
}
