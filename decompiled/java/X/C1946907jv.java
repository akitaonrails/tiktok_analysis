package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.07jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1946907jv implements Iterator<String>, C03W4 {
    public final CharSequence LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.LLILLJJLI;
        if (i != 0) {
            return i == 1;
        }
        int i2 = 2;
        if (this.LLILZIL < 0) {
            this.LLILLJJLI = 2;
            return false;
        }
        int length = this.LL.length();
        int length2 = this.LL.length();
        for (int i3 = this.LLILLL; i3 < length2; i3++) {
            char cCharAt = this.LL.charAt(i3);
            if (cCharAt != '\n') {
                if (cCharAt == '\r') {
                    int i4 = i3 + 1;
                    if (i4 >= this.LL.length() || this.LL.charAt(i4) != '\n') {
                    }
                    length = i3;
                    break;
                }
            }
            i2 = 1;
            length = i3;
            break;
        }
        i2 = -1;
        this.LLILLJJLI = 1;
        this.LLILZIL = i2;
        this.LLILZ = length;
        return true;
    }

    @Override // java.util.Iterator
    public final String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.LLILLJJLI = 0;
        int i = this.LLILZ;
        int i2 = this.LLILLL;
        this.LLILLL = this.LLILZIL + i;
        return this.LL.subSequence(i2, i).toString();
    }

    public C1946907jv(CharSequence charSequence) {
        this.LL = charSequence;
    }
}
