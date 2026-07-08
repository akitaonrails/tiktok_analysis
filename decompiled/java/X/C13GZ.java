package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GZ implements Comparable<C13GZ>, Serializable {
    public static final C19981513Gb Companion = new C19981513Gb();
    public static final C13GZ NIL = new C13GZ(0, 0);
    public final long LL;
    public final long LLILLJJLI;

    public /* synthetic */ C13GZ(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private final Object writeReplace() {
        return new C19981413Ga(getMostSignificantBits(), getLeastSignificantBits());
    }

    public int hashCode() {
        return C786410Ut5.Y2(this.LL ^ this.LLILLJJLI);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        long j = this.LL;
        int i = 7;
        int i2 = 0;
        int i3 = 7;
        do {
            bArr[i2] = (byte) (j >> (i3 << 3));
            i3--;
            i2++;
        } while (-1 < i3);
        long j2 = this.LLILLJJLI;
        int i4 = 8;
        do {
            bArr[i4] = (byte) (j2 >> (i << 3));
            i--;
            i4++;
        } while (-1 < i);
        return bArr;
    }

    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        C13EC.LIZ(this.LL, bArr, 0, 0, 4);
        bArr[8] = 45;
        C13EC.LIZ(this.LL, bArr, 9, 4, 6);
        bArr[13] = 45;
        C13EC.LIZ(this.LL, bArr, 14, 6, 8);
        bArr[18] = 45;
        C13EC.LIZ(this.LLILLJJLI, bArr, 19, 0, 2);
        bArr[23] = 45;
        C13EC.LIZ(this.LLILLJJLI, bArr, 24, 2, 8);
        return u.LJIILL(bArr);
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        C13EC.LIZ(this.LL, bArr, 0, 0, 8);
        C13EC.LIZ(this.LLILLJJLI, bArr, 16, 0, 8);
        return u.LJIILL(bArr);
    }

    public String toString() {
        return toHexDashString();
    }

    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m95toUByteArrayTcUX1vc() {
        return toByteArray();
    }

    public final long getLeastSignificantBits() {
        return this.LLILLJJLI;
    }

    public final long getMostSignificantBits() {
        return this.LL;
    }

    @Override // java.lang.Comparable
    public int compareTo(C13GZ c13gz) {
        long j = this.LL;
        long j2 = c13gz.LL;
        if (j != j2) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
        }
        return Long.compare(this.LLILLJJLI ^ Long.MIN_VALUE, c13gz.LLILLJJLI ^ Long.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13GZ)) {
            return false;
        }
        C13GZ c13gz = (C13GZ) obj;
        if (this.LL == c13gz.LL && this.LLILLJJLI == c13gz.LLILLJJLI) {
            return true;
        }
        return false;
    }

    public C13GZ(long j, long j2) {
        this.LL = j;
        this.LLILLJJLI = j2;
    }
}
