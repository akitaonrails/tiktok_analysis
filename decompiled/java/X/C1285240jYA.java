package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.AJMediaCodec;

/* JADX INFO: renamed from: X.0jYA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285240jYA extends MediaCodec.Callback {
    public AbstractC1285310jYH LIZ;
    public C1285260jYC LIZIZ;

    public C1285240jYA(C1285260jYC c1285260jYC, C1285230jY9 c1285230jY9) {
        this.LIZIZ = c1285260jYC;
        this.LIZ = c1285230jY9;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        AbstractC1285310jYH abstractC1285310jYH = this.LIZ;
        if (abstractC1285310jYH != null) {
            C1285230jY9 c1285230jY9 = (C1285230jY9) abstractC1285310jYH;
            c1285230jY9.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ttmn: ");
            sbLIZ.append(codecException);
            C1285320jYI.LIZ(c1285230jY9, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (AJMediaCodec.LJJIJIIJIL) {
                try {
                    AJMediaCodec aJMediaCodec = c1285230jY9.LIZ;
                    if (aJMediaCodec.LJIILJJIL) {
                        return;
                    }
                    AJMediaCodec._onError(aJMediaCodec.LJIIJ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        AbstractC1285310jYH abstractC1285310jYH = this.LIZ;
        if (abstractC1285310jYH != null) {
            C1285230jY9 c1285230jY9 = (C1285230jY9) abstractC1285310jYH;
            if (this.LIZIZ == c1285230jY9.LIZ.LJJ) {
                synchronized (AJMediaCodec.LJJIJIIJIL) {
                    try {
                        AJMediaCodec aJMediaCodec = c1285230jY9.LIZ;
                        if (aJMediaCodec.LJIILJJIL) {
                            return;
                        }
                        AJMediaCodec._onEmptyBuffer(aJMediaCodec.LJIIJ, i);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        AbstractC1285310jYH abstractC1285310jYH = this.LIZ;
        if (abstractC1285310jYH != null) {
            C1285230jY9 c1285230jY9 = (C1285230jY9) abstractC1285310jYH;
            synchronized (AJMediaCodec.LJJIJIIJIL) {
                try {
                    if (c1285230jY9.LIZ.LJIILJJIL) {
                        return;
                    }
                    c1285230jY9.LIZ(mediaFormat);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        AbstractC1285310jYH abstractC1285310jYH = this.LIZ;
        if (abstractC1285310jYH != null) {
            C1285260jYC c1285260jYC = this.LIZIZ;
            C1285230jY9 c1285230jY9 = (C1285230jY9) abstractC1285310jYH;
            if (c1285260jYC == c1285230jY9.LIZ.LJJ) {
                synchronized (AJMediaCodec.LJJIJIIJIL) {
                    try {
                        AJMediaCodec aJMediaCodec = c1285230jY9.LIZ;
                        if (aJMediaCodec.LJIILJJIL) {
                            return;
                        }
                        try {
                            if (aJMediaCodec.LJFF == null) {
                                aJMediaCodec.LJFF = c1285260jYC.LIZLLL();
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("ttmn: ");
                            sbLIZ.append(e);
                            C1285320jYI.LIZ(c1285230jY9, "JAJMediaCodec", C2188811AlT.LIZIZ(sbLIZ));
                        }
                        AJMediaCodec._onFilledBuffer(c1285230jY9.LIZ.LJIIJ, i, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }
}
