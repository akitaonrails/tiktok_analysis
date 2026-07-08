package X;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0kdc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1327060kdc extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    ByteBuffer getByteBuffer();

    long getNativePtr();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int size();
}
