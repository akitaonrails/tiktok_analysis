package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: X.13Lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19994613Lc extends AbstractC19994813Le implements Serializable {
    public static final C19994713Ld LLIZ;
    public static final long serialVersionUID = 0;
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13Ld] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLIZ = new Object(defaultConstructorMarker) { // from class: X.13Ld
        };
    }

    @Override // X.AbstractC19994813Le
    public int nextInt() {
        int i = this.LL;
        int i2 = i ^ (i >>> 2);
        this.LL = this.LLILLJJLI;
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = this.LLILZ;
        int i3 = this.LLILZIL;
        this.LLILZ = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.LLILZIL = i4;
        int i5 = this.LLILZLL + 362437;
        this.LLILZLL = i5;
        return i4 + i5;
    }

    @Override // X.AbstractC19994813Le
    public int nextBits(int i) {
        return ((-i) >> 31) & (nextInt() >>> (32 - i));
    }

    public C19994613Lc(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }

    public C19994613Lc(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = i4;
        this.LLILZIL = i5;
        this.LLILZLL = i6;
        int i7 = 0;
        if ((i | i2 | i3 | i4 | i5) == 0) {
            "Initial state must have at least one non-zero element.".toString();
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
        do {
            nextInt();
            i7++;
        } while (i7 < 64);
    }
}
