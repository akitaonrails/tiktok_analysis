package X;

import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: renamed from: X.08Jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2096108Jb extends Writer implements Serializable {
    public final StringBuilder LL;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.LL.toString();
    }

    public C2096108Jb() {
        this.LL = new StringBuilder();
    }

    public StringBuilder getBuilder() {
        return this.LL;
    }

    public C2096108Jb(StringBuilder sb) {
        this.LL = sb == null ? new StringBuilder() : sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) {
        this.LL.append(c);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.LL.append(str);
        }
    }

    public C2096108Jb(int i) {
        this.LL = new StringBuilder(i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.LL.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) {
        append(c);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        this.LL.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.LL.append(cArr, i, i2);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        append(charSequence, i, i2);
        return this;
    }
}
