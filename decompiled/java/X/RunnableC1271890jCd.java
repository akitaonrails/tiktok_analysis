package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jCd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1271890jCd implements Runnable {
    public final /* synthetic */ int[] LL;
    public final /* synthetic */ ByteBuffer LLILLJJLI;
    public final /* synthetic */ C1271900jCe[] LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int[] LLILZLL;
    public final /* synthetic */ ByteBuffer LLIZ;
    public final /* synthetic */ ByteBuffer LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ C1270350jA9 LLJIJIL;

    public final void LIZ() {
        C1270350jA9 c1270350jA9 = this.LLJIJIL;
        if (c1270350jA9.LLJ != 1) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mStatus ");
                sbLIZ.append(this.LLJIJIL.LLJ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ExternalVideoCapturer drop frame: ");
                sbLIZ2.append(strLIZIZ);
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", C2188811AlT.LIZIZ(sbLIZ2), null, 4, 10000);
            }
            this.LL[0] = -1;
            return;
        }
        if (!c1270350jA9.LLJJ && this.LLJIJIL.LLJI) {
            if (AVLog.enableLogToIODevice2()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("!mBufferAlreadyReturn ");
                sbLIZ3.append(!this.LLJIJIL.LLJJ);
                sbLIZ3.append(", mSigBufferMode ");
                sbLIZ3.append(this.LLJIJIL.LLJI);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ExternalVideoCapturer drop frame: ");
                sbLIZ4.append(strLIZIZ2);
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", C2188811AlT.LIZIZ(sbLIZ4), null, 5, 10000);
            }
            this.LL[0] = -2;
            return;
        }
        if (this.LLILLJJLI.isDirect()) {
            ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 236);
            C1271880jCc c1271880jCc = this.LLJIJIL.LLILZIL;
            if (c1271880jCc != null) {
                C1271900jCe[] c1271900jCeArr = this.LLILLL;
                int i = this.LLILZ;
                int i2 = this.LLILZIL;
                ByteBuffer byteBuffer = this.LLILLJJLI;
                int[] iArr = this.LLILZLL;
                int i3 = iArr[0];
                ByteBuffer byteBuffer2 = this.LLIZ;
                int i4 = iArr[1];
                ByteBuffer byteBuffer3 = this.LLIZLLLIL;
                int i5 = iArr[2];
                long j = this.LLJ;
                C1271900jCe c1271900jCeLIZLLL = c1271880jCc.LIZLLL(i, i2, byteBuffer, i3, byteBuffer2, i4, byteBuffer3, i5, aRunnableS120S0100000_20, 0);
                if (c1271900jCeLIZLLL != null) {
                    c1271900jCeLIZLLL.LJIIL = j;
                    c1271900jCeLIZLLL.LJIILIIL = 0L;
                    c1271900jCeLIZLLL.LJIILJJIL = 0L;
                } else {
                    c1271900jCeLIZLLL = null;
                }
                c1271900jCeArr[0] = c1271900jCeLIZLLL;
                if (this.LLILLL[0] == null) {
                    aRunnableS120S0100000_20.run();
                }
            } else {
                C1271900jCe[] c1271900jCeArr2 = this.LLILLL;
                int i6 = this.LLILZ;
                int i7 = this.LLILZIL;
                ByteBuffer byteBuffer4 = this.LLILLJJLI;
                int[] iArr2 = this.LLILZLL;
                c1271900jCeArr2[0] = C1271900jCe.LIZJ(i6, i7, byteBuffer4, iArr2[0], this.LLIZ, iArr2[1], this.LLIZLLLIL, iArr2[2], this.LLJ, aRunnableS120S0100000_20, 0L, 0L);
            }
        } else {
            ARunnableS120S0100000_20 aRunnableS120S0100000_202 = new ARunnableS120S0100000_20(this, 237);
            C1271880jCc c1271880jCc2 = this.LLJIJIL.LLILZIL;
            if (c1271880jCc2 != null) {
                C1271900jCe[] c1271900jCeArr3 = this.LLILLL;
                int i8 = this.LLILZ;
                int i9 = this.LLILZIL;
                C1271900jCe c1271900jCeLIZ = c1271880jCc2.LIZ();
                if (c1271900jCeLIZ != null) {
                    int i10 = (i9 + 1) / 2;
                    int i11 = (i8 + 1) / 2;
                    int i12 = i8 * i9;
                    int i13 = i11 * i10;
                    int i14 = i12 + i13;
                    ByteBuffer byteBufferNativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer((i11 * 2 * i10) + i12);
                    byteBufferNativeAllocateByteBuffer.position(0);
                    byteBufferNativeAllocateByteBuffer.limit(i12);
                    ByteBuffer byteBufferSlice = byteBufferNativeAllocateByteBuffer.slice();
                    byteBufferNativeAllocateByteBuffer.position(i12);
                    byteBufferNativeAllocateByteBuffer.limit(i14);
                    ByteBuffer byteBufferSlice2 = byteBufferNativeAllocateByteBuffer.slice();
                    byteBufferNativeAllocateByteBuffer.position(i14);
                    byteBufferNativeAllocateByteBuffer.limit(i14 + i13);
                    c1271900jCeLIZ.LIZIZ(i8, i9, byteBufferSlice, i8, byteBufferSlice2, i11, byteBufferNativeAllocateByteBuffer.slice(), i11, new ARunnableS89S0200000_20(aRunnableS120S0100000_202, byteBufferNativeAllocateByteBuffer, 128), 0);
                    c1271900jCeLIZ.reuseBuffer();
                    c1271900jCeLIZ.LJIIJ = null;
                    c1271900jCeLIZ.LJIILIIL = 0L;
                    c1271900jCeLIZ.LJIILJJIL = 0L;
                    c1271900jCeLIZ.LJIILLIIL = 0;
                } else {
                    c1271900jCeLIZ = null;
                }
                c1271900jCeArr3[0] = c1271900jCeLIZ;
                if (this.LLILLL[0] == null) {
                    aRunnableS120S0100000_202.run();
                }
            } else {
                this.LLILLL[0] = C1271900jCe.LIZ(this.LLILZ, this.LLILZIL, aRunnableS120S0100000_202);
                this.LLILLL[0].getDataY().put(this.LLILLJJLI);
                this.LLILLL[0].getDataU().put(this.LLIZ);
                this.LLILLL[0].getDataV().put(this.LLIZLLLIL);
                this.LLILLL[0].LJIIL = this.LLJ;
            }
        }
        if (this.LLILLL[0] == null) {
            if (AVLog.enableLogToIODevice2()) {
                AVLog.logToIODevice2(5, "ExternalVideoCapturer", "ExternalVideoCapturer drop frame: buffer is null", null, 6, 10000);
            }
            this.LL[0] = -3;
        } else {
            this.LLJIJIL.LLJJ = false;
            this.LL[0] = this.LLJIJIL.LLJ(this.LLILLL[0], this.LLILZ, this.LLILZIL, 0, this.LLJI);
            this.LLILLL[0].release();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ExternalVideoCapturer@358d.pushVideoFrame$3");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExternalVideoCapturer@358d.pushVideoFrame$3");
    }

    public RunnableC1271890jCd(C1270350jA9 c1270350jA9, int[] iArr, ByteBuffer byteBuffer, C1271900jCe[] c1271900jCeArr, int i, int i2, int[] iArr2, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, long j, long j2) {
        this.LLJIJIL = c1270350jA9;
        this.LL = iArr;
        this.LLILLJJLI = byteBuffer;
        this.LLILLL = c1271900jCeArr;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = iArr2;
        this.LLIZ = byteBuffer2;
        this.LLIZLLLIL = byteBuffer3;
        this.LLJ = j;
        this.LLJI = j2;
    }
}
