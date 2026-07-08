package X;

import java.io.Writer;

/* JADX INFO: renamed from: X.08Ja, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096008Ja extends Writer {
    public final StringBuilder LL;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
    }

    public final String toString() {
        return this.LL.toString();
    }

    public C2096008Ja() {
        this.LL = new StringBuilder();
    }

    public C2096008Ja(int i) {
        if (i >= 0) {
            this.LL = new StringBuilder(i);
            return;
        }
        throw new IllegalArgumentException("Negative buffer size");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        write(String.valueOf(charSequence));
        return this;
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.LL.append((char) i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        write(String.valueOf(charSequence));
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str) {
        this.LL.append(str);
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
        write(String.valueOf(charSequence.subSequence(i, i2)));
        return this;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= cArr.length && i2 >= 0 && (i3 = i + i2) <= cArr.length && i3 >= 0) {
            if (i2 == 0) {
                return;
            }
            this.LL.append(cArr, i, i2);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        write(String.valueOf(charSequence.subSequence(i, i2)));
        return this;
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        this.LL.append((CharSequence) str, i, i2 + i);
    }
}
