package X;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p3M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1496780p3M extends InterfaceC1495590p1R, WritableByteChannel {
    C1496690p3D LJIIIZ();

    InterfaceC1496780p3M LJJIII(int i, byte[] bArr, int i2);

    InterfaceC1496780p3M LJJIJLIJ(long j);

    InterfaceC1496780p3M LJJJI(ByteString byteString);

    InterfaceC1496780p3M LJJJJZI(String str, Charset charset);

    InterfaceC1496780p3M LJJLIIIJJI(long j);

    InterfaceC1496780p3M LJJZZIII(int i, int i2, String str);

    InterfaceC1496780p3M LJLJLJ();

    InterfaceC1496780p3M LJLLILLLL(String str);

    InterfaceC1496780p3M LJLLLLLL(long j);

    InterfaceC1496780p3M LL(int i);

    InterfaceC1496780p3M LLFII();

    long LLIIJI(InterfaceC842570X3n interfaceC842570X3n);

    OutputStream LLIIL();

    @InterfaceC1294060jmO
    C1496690p3D buffer();

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    void flush();

    InterfaceC1496780p3M write(byte[] bArr);

    InterfaceC1496780p3M writeByte(int i);

    InterfaceC1496780p3M writeInt(int i);

    InterfaceC1496780p3M writeShort(int i);
}
