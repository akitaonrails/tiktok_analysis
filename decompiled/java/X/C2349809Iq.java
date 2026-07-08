package X;

import java.io.Writer;

/* JADX INFO: renamed from: X.09Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349809Iq extends Writer {
    public final StringBuilder LL = new StringBuilder(128);

    public final void LIZ() {
        if (this.LL.length() > 0) {
            StringBuilder sb = this.LL;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZ();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        LIZ();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                LIZ();
            } else {
                this.LL.append(c);
            }
        }
    }
}
