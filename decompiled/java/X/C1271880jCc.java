package X;

import Y.ARunnableS120S0100000_20;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271880jCc extends C1275940jJA<C1271900jCe> implements InterfaceC1272840jEA {
    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
    }

    public C1271880jCc(int i, InterfaceC1275950jJB interfaceC1275950jJB) {
        super(i, interfaceC1275950jJB, new InterfaceC1275740jIq<C1271900jCe>() { // from class: X.0jCb
            @Override // X.InterfaceC1275740jIq
            public final C1271900jCe LIZ(final C1275940jJA<C1271900jCe> c1275940jJA) {
                final C1271900jCe c1271900jCe = new C1271900jCe();
                c1271900jCe.setOnBufferReleaseListener(new InterfaceC1271760jCQ() { // from class: X.0jCa
                    @Override // X.InterfaceC1271760jCQ
                    public final void LIZ(VideoFrame.Buffer buffer) {
                        c1275940jJA.LIZJ(c1271900jCe);
                    }
                });
                return c1271900jCe;
            }
        });
    }

    public final C1271900jCe LIZLLL(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable, int i6) {
        boolean z;
        C1271900jCe c1271900jCeLIZ = LIZ();
        if (c1271900jCeLIZ == null) {
            return null;
        }
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer byteBufferSlice = byteBuffer.slice();
                ByteBuffer byteBufferSlice2 = byteBuffer2.slice();
                ByteBuffer byteBufferSlice3 = byteBuffer3.slice();
                int i7 = (i2 + 1) / 2;
                int i8 = i3 * i2;
                int i9 = i4 * i7;
                int i10 = i7 * i5;
                if (byteBufferSlice.capacity() >= i8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (byteBufferSlice2.capacity() >= i9) {
                        if (byteBufferSlice3.capacity() >= i10) {
                            c1271900jCeLIZ.LIZIZ(i, i2, byteBufferSlice, i3, byteBufferSlice2, i4, byteBufferSlice3, i5, runnable, i6);
                            c1271900jCeLIZ.reuseBuffer();
                            c1271900jCeLIZ.LJIIJ = null;
                            c1271900jCeLIZ.LJIILIIL = 0L;
                            c1271900jCeLIZ.LJIILJJIL = 0L;
                            c1271900jCeLIZ.LJIILLIIL = 0;
                            return c1271900jCeLIZ;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("V-buffer must be at least ");
                        sbLIZ.append(i10);
                        sbLIZ.append(" bytes.");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        strLIZIZ.toString();
                        throw new IllegalArgumentException(strLIZIZ);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("U-buffer must be at least ");
                    sbLIZ2.append(i9);
                    sbLIZ2.append(" bytes.");
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalArgumentException(strLIZIZ2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Y-buffer must be at least ");
                sbLIZ3.append(i8);
                sbLIZ3.append(" bytes.");
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                strLIZIZ3.toString();
                throw new IllegalArgumentException(strLIZIZ3);
            }
            "Data buffers must be direct byte buffers.".toString();
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        "Data buffers cannot be null.".toString();
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }

    public final C1271900jCe LJ(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, ARunnableS120S0100000_20 aRunnableS120S0100000_20) {
        C1271900jCe c1271900jCeLIZLLL = LIZLLL(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, aRunnableS120S0100000_20, i6);
        if (c1271900jCeLIZLLL != null) {
            c1271900jCeLIZLLL.LJIIL = 0L;
            return c1271900jCeLIZLLL;
        }
        return null;
    }
}
