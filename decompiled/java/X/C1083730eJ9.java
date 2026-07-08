package X;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: X.0eJ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083730eJ9 implements Serializable {
    public final long LL;
    public final int LLILLJJLI;

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI));
    }

    public String toString() {
        return C786410Ut5.j4("Seconds: %d, Nanos: %d", new Object[]{Long.valueOf(this.LL), Integer.valueOf(this.LLILLJJLI)});
    }

    public int getNanos() {
        return this.LLILLJJLI;
    }

    public long getSeconds() {
        return this.LL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1083730eJ9.class != obj.getClass()) {
            return false;
        }
        C1083730eJ9 c1083730eJ9 = (C1083730eJ9) obj;
        if (this.LL == c1083730eJ9.LL && this.LLILLJJLI == c1083730eJ9.LLILLJJLI) {
            return true;
        }
        return false;
    }

    public C1083730eJ9(long j, int i) {
        this.LL = j;
        this.LLILLJJLI = i;
    }

    public static C1083730eJ9 ofSecondsAndNanos(long j, int i) {
        return new C1083730eJ9(j, i);
    }
}
