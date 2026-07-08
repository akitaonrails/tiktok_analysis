package X;

import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: renamed from: X.08JW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JW extends Writer {
    public char[] LL;
    public int LLILLJJLI;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return new String(this.LL, 0, this.LLILLJJLI);
    }

    public C08JW(int i) {
        if (i >= 0) {
            this.LL = new char[i];
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Negative initial size: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        String string;
        if (charSequence == null) {
            string = "null";
        } else {
            string = charSequence.toString();
        }
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        int i2 = this.LLILLJJLI + 1;
        char[] cArr = this.LL;
        if (i2 > cArr.length) {
            this.LL = Arrays.copyOf(cArr, Math.max(cArr.length << 1, i2));
        }
        this.LL[this.LLILLJJLI] = (char) i;
        this.LLILLJJLI = i2;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        String string;
        if (charSequence == null) {
            string = "null";
        } else {
            string = charSequence.toString();
        }
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(char c) {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i, i2).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= cArr.length && i2 >= 0 && (i3 = i + i2) <= cArr.length && i3 >= 0) {
            if (i2 == 0) {
                return;
            }
            int i4 = this.LLILLJJLI + i2;
            char[] cArr2 = this.LL;
            if (i4 > cArr2.length) {
                this.LL = Arrays.copyOf(cArr2, Math.max(cArr2.length << 1, i4));
            }
            System.arraycopy(cArr, i, this.LL, this.LLILLJJLI, i2);
            this.LLILLJJLI = i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i, i2).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        int i3 = this.LLILLJJLI + i2;
        char[] cArr = this.LL;
        if (i3 > cArr.length) {
            this.LL = Arrays.copyOf(cArr, Math.max(cArr.length << 1, i3));
        }
        str.getChars(i, i2 + i, this.LL, this.LLILLJJLI);
        this.LLILLJJLI = i3;
    }
}
