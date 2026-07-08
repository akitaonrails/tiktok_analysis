package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13LU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13LU implements Iterable<Character>, C03W4 {
    public static final C13LV LLILZ;
    public final char LL;
    public final char LLILLJJLI;
    public final int LLILLL = 1;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.13LV] */
    static {
        final DefaultConstructorMarker defaultConstructorMarker = null;
        LLILZ = new Object(defaultConstructorMarker) { // from class: X.13LV
        };
    }

    @Override // java.lang.Iterable
    public final Iterator<Character> iterator() {
        final char c = this.LL;
        final char c2 = this.LLILLJJLI;
        final int i = this.LLILLL;
        return new AbstractC1901807ce(c, c2, i) { // from class: X.07hc
            public final int LL;
            public final int LLILLJJLI;
            public boolean LLILLL;
            public int LLILZ;

            @Override // X.AbstractC1901807ce
            public final char LIZ() {
                int i2 = this.LLILZ;
                if (i2 != this.LLILLJJLI) {
                    this.LLILZ = this.LL + i2;
                } else {
                    if (!this.LLILLL) {
                        throw new NoSuchElementException();
                    }
                    this.LLILLL = false;
                }
                return (char) i2;
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.LLILLL;
            }

            {
                this.LL = i;
                this.LLILLJJLI = c2;
                boolean z = true;
                if (i <= 0 ? Intrinsics.LJI(c, c2) < 0 : Intrinsics.LJI(c, c2) > 0) {
                    z = false;
                }
                this.LLILLL = z;
                this.LLILZ = z ? c : c2;
            }
        };
    }

    public C13LU(char c, char c2) {
        this.LL = c;
        this.LLILLJJLI = (char) C0GYY.LIZ(c, c2, 1);
    }
}
