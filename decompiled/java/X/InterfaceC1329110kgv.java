package X;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0kgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1329110kgv {
    void close();

    void copy(int i, InterfaceC1329110kgv interfaceC1329110kgv, int i2, int i3);

    ByteBuffer getByteBuffer();

    long getNativePtr();

    int getSize();

    long getUniqueId();

    boolean isClosed();

    byte read(int i);

    int read(int i, byte[] bArr, int i2, int i3);

    int write(int i, byte[] bArr, int i2, int i3);
}
