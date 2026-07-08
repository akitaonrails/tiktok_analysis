package X;

import android.media.MediaCodec;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0jTn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282530jTn {
    public long LIZJ;
    public long LIZLLL;
    public StringBuilder LJFF;
    public final /* synthetic */ C1282390jTZ LJI;
    public final ArrayList<Long> LIZ = new ArrayList<>();
    public final LinkedList<Long> LIZIZ = new LinkedList<>();
    public int LJ = -1;

    public C1282530jTn(C1282390jTZ c1282390jTZ) {
        this.LJI = c1282390jTZ;
    }

    public final synchronized long LIZJ(long j) {
        long j2 = this.LIZJ;
        this.LIZJ = j;
        if (j <= this.LIZLLL) {
            if (this.LJFF == null) {
                this.LJFF = new StringBuilder();
            }
            if (AVLog.enableLogToIODevice2()) {
                this.LJFF.setLength(0);
                StringBuilder sb = this.LJFF;
                sb.append("pts input is not monotonically increasing: last pts in queue ");
                sb.append(this.LIZLLL);
                sb.append(", last pts input ");
                sb.append(j2);
                sb.append(", current pts input ");
                sb.append(j);
                String string = this.LJFF.toString();
                int iLogToIODevice2 = AVLog.logToIODevice2(6, "HardwareVideoEncoder", string, null, 14, C538540LAe.LLJJJIL);
                if (iLogToIODevice2 > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("[repeat ");
                    sbLIZ.append(iLogToIODevice2);
                    sbLIZ.append(" times] ");
                    sbLIZ.append(string);
                    AVLog.logKibana(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), null);
                }
            }
            j = this.LIZLLL + 10000;
        }
        this.LIZLLL = j;
        LIZLLL(j);
        return j;
    }

    public void LIZLLL(long j) {
        if (this.LJ < 0) {
            this.LIZ.add(Long.valueOf(j));
        }
    }

    public final int LIZ(long j, boolean z) {
        String str;
        if (this.LJ < 0) {
            if (!z) {
                if (this.LIZIZ.isEmpty()) {
                    return this.LJ;
                }
                long jLongValue = this.LIZIZ.get(0).longValue();
                int iIndexOf = this.LIZ.indexOf(Long.valueOf(jLongValue));
                int iIndexOf2 = this.LIZ.indexOf(Long.valueOf(j));
                if (iIndexOf >= 0 && iIndexOf2 >= 0) {
                    int i = iIndexOf + 1;
                    if (iIndexOf2 > i) {
                        this.LJ = (iIndexOf2 - iIndexOf) - 1;
                        StringBuilder sb = new StringBuilder("Encoder output pts disorder. pts between I frame ");
                        sb.append(((Long) ListProtector.get(this.LIZ, iIndexOf)).longValue() / 1000);
                        sb.append("ms and P frame ");
                        sb.append(((Long) ListProtector.get(this.LIZ, iIndexOf2)).longValue() / 1000);
                        sb.append("ms: ");
                        while (i < iIndexOf2) {
                            sb.append(((Long) ListProtector.get(this.LIZ, i)).longValue() / 1000);
                            i++;
                            if (i >= iIndexOf2) {
                                str = "ms.";
                            } else {
                                str = "ms, ";
                            }
                            sb.append(str);
                        }
                        AVLog.logKibana(5, "HardwareVideoEncoder", sb.toString(), null);
                    } else {
                        this.LJ = 0;
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Can't find I frame pts ");
                    sbLIZ.append(jLongValue);
                    sbLIZ.append(" or P frame pts ");
                    sbLIZ.append(j);
                    sbLIZ.append(" in ptsInQueue.");
                    AVLog.logKibana(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), null);
                    this.LJ = 0;
                    return 0;
                }
            }
            this.LIZIZ.offer(Long.valueOf(j));
        }
        return this.LJ;
    }

    public synchronized void LIZIZ(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs;
        boolean z = true;
        if ((bufferInfo.flags & 1) == 0) {
            z = false;
        }
        LIZ(j, z);
        this.LJI.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j, j);
    }

    public void LJ(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        long j = bufferInfo.presentationTimeUs;
        boolean z = true;
        if ((bufferInfo.flags & 1) == 0) {
            z = false;
        }
        synchronized (this) {
            try {
                LIZ(j, z);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJI.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j, j);
    }
}
