package X;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: X.0p1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1495590p1R extends Closeable, Flushable {
    void LLFF(C1496690p3D c1496690p3D, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    C1496250p2V timeout();
}
