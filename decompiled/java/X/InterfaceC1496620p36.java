package X;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1496620p36 extends InterfaceC842570X3n, ReadableByteChannel {
    C1496690p3D LJIIIZ();

    long LJIIJ();

    int LJJIFFI();

    String LJJIIJ(long j);

    byte[] LJJIJ(long j);

    InputStream LJJIJIIJIL();

    long LJJJIL();

    long LJJJJL(InterfaceC1495590p1R interfaceC1495590p1R);

    void LJJJJLI(C1496690p3D c1496690p3D, long j);

    boolean LJJJJLL();

    int LJJJJZ(C1496870p3V c1496870p3V);

    String LJJLIIIJILLIZJL(Charset charset);

    long LJLIIL(ByteString byteString);

    ByteString LJLILLLLZI(long j);

    String LJLJLLL(long j);

    String LJLLJ();

    String LJZ();

    byte[] LJZL();

    boolean LLF(ByteString byteString);

    void LLIIII(long j);

    @InterfaceC1294060jmO
    C1496690p3D buffer();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    void skip(long j);
}
