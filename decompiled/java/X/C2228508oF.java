package X;

import Y.ARunnableS1S0102000_3;
import android.media.AudioRecord;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08oF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2228508oF {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final Function1<Float, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<String, Unit> LIZJ;
    public AudioRecord LIZLLL;
    public RandomAccessFile LJ;
    public BPEAThread LJFF;
    public int LJIIIZ;
    public final AtomicBoolean LJI = new AtomicBoolean(false);
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final AtomicLong LJIIIIZZ = new AtomicLong(0);
    public volatile int LJIIJ = -1;

    public final long LIZ() {
        int i = this.LJIIJ;
        if (i > 0) {
            return (this.LJIIIIZZ.get() * 1000) / ((long) i);
        }
        return 0L;
    }

    public final void LIZIZ() {
        this.LJI.set(true);
        RandomAccessFile randomAccessFile = this.LJ;
        if (randomAccessFile != null) {
            long j = this.LJIIIIZZ.get() * ((long) 2);
            try {
                synchronized (randomAccessFile) {
                    try {
                        long filePointer = randomAccessFile.getFilePointer();
                        randomAccessFile.seek(4L);
                        LJII(randomAccessFile, (int) (((long) 36) + j));
                        randomAccessFile.seek(40L);
                        LJII(randomAccessFile, (int) j);
                        randomAccessFile.seek(filePointer);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("WAV flush header error: ");
                sbLIZ.append(e.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final void LJI() {
        this.LJII.set(false);
        try {
            BPEAThread bPEAThread = this.LJFF;
            if (bPEAThread != null) {
                ThreadMethodProxy.join(bPEAThread, 2000L);
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C786410Ut5.u3().interrupt();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BulletinAudioPcmRecorder.stop: recordThread.join interrupted: ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LJFF = null;
        try {
            AudioRecord audioRecord = this.LIZLLL;
            if (audioRecord != null) {
                C1300970jxX.LIZLLL(audioRecord, CertProviderManagerKt.findCert("bpea-bulletin_voice_startRecord", 1476788509));
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AudioRecord.stop error: ");
            sbLIZ2.append(e2.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        try {
            AudioRecord audioRecord2 = this.LIZLLL;
            if (audioRecord2 != null) {
                C2228608oG.LIZ(audioRecord2);
            }
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("AudioRecord.release error: ");
            sbLIZ3.append(e3.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        this.LIZLLL = null;
        RandomAccessFile randomAccessFile = this.LJ;
        if (randomAccessFile != null) {
            try {
                long j = this.LJIIIIZZ.get() * ((long) 2);
                randomAccessFile.seek(4L);
                LJII(randomAccessFile, (int) (((long) 36) + j));
                randomAccessFile.seek(40L);
                LJII(randomAccessFile, (int) j);
                randomAccessFile.close();
            } catch (Exception e4) {
                TryCatchGuardChecker.doCheck(e4);
                C0OPX.LJIIIIZZ("WAV finalize error: " + e4.getMessage());
            }
        }
        this.LJ = null;
        long jLIZ = LIZ();
        this.LJIIJ = -1;
        C0OPX.LJII("BulletinAudioPcmRecorder stopped, duration=" + jLIZ + "ms");
    }

    public static int LIZJ(RandomAccessFile randomAccessFile) {
        int i = randomAccessFile.read() & 255;
        int i2 = randomAccessFile.read() & 255;
        int i3 = randomAccessFile.read() & 255;
        return ((randomAccessFile.read() & 255) << 24) | i | (i2 << 8) | (i3 << 16);
    }

    public final void LJ(C0VSJ c0vsj) {
        int iLIZ = C2183808h2.LIZ();
        int i = iLIZ / 50;
        AudioRecord audioRecord = new AudioRecord(1, iLIZ, 16, 2, Math.max(Math.max(AudioRecord.getMinBufferSize(iLIZ, 16, 2), i * 2 * 2), ((iLIZ * 2) * 320) / LSPassThroughRecordSizeConfig.DEFAULT));
        if (audioRecord.getState() == 1) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(c0vsj, "rw");
                LJIIIZ(randomAccessFile, iLIZ);
                this.LIZLLL = audioRecord;
                this.LJ = randomAccessFile;
                this.LJIIJ = iLIZ;
                this.LJIIIIZZ.set(0L);
                this.LJI.set(false);
                this.LJII.set(true);
                C1300970jxX.LIZJ(audioRecord, CertProviderManagerKt.findCert("bpea-bulletin_voice_startRecord", 1476788509));
                BPEAThread bPEAThread = new BPEAThread(new ARunnableS1S0102000_3(this, iLIZ, i, 1), "BB-VoicePcmRecorder");
                bPEAThread.start();
                this.LJFF = bPEAThread;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinAudioPcmRecorder started -> ");
                sbLIZ.append(c0vsj.getAbsolutePath());
                sbLIZ.append(", sampleRate=");
                sbLIZ.append(iLIZ);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    C2228608oG.LIZ(audioRecord);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C0OPX.LJIIIIZZ("BulletinAudioPcmRecorder.start: open/header failed for " + c0vsj.getAbsolutePath() + ": " + e.getMessage());
                throw new IllegalStateException("WAV file open/header failed: " + e.getMessage(), e);
            }
        }
        C2228608oG.LIZ(audioRecord);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AudioRecord init failed, state=");
        sbLIZ2.append(audioRecord.getState());
        sbLIZ2.append(", sampleRate=");
        sbLIZ2.append(iLIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJFF(File file) {
        int iLIZ = C2183808h2.LIZ();
        int i = iLIZ / 50;
        AudioRecord audioRecord = new AudioRecord(1, iLIZ, 16, 2, Math.max(Math.max(AudioRecord.getMinBufferSize(iLIZ, 16, 2), i * 2 * 2), ((iLIZ * 2) * 320) / LSPassThroughRecordSizeConfig.DEFAULT));
        if (audioRecord.getState() == 1) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                randomAccessFile.seek(24L);
                int iLIZJ = LIZJ(randomAccessFile);
                if (iLIZJ == iLIZ) {
                    randomAccessFile.seek(40L);
                    long jLIZJ = LIZJ(randomAccessFile);
                    if (jLIZJ < 0) {
                        jLIZJ = 0;
                    }
                    randomAccessFile.seek(44 + jLIZJ);
                    long j = jLIZJ / ((long) 2);
                    this.LIZLLL = audioRecord;
                    this.LJ = randomAccessFile;
                    this.LJIIJ = iLIZ;
                    this.LJIIIIZZ.set(j);
                    this.LJI.set(false);
                    this.LJII.set(true);
                    C1300970jxX.LIZJ(audioRecord, CertProviderManagerKt.findCert("bpea-bulletin_voice_startRecord", 1476788509));
                    BPEAThread bPEAThread = new BPEAThread(new ARunnableS1S0102000_3(this, iLIZ, i, 0), "BB-VoicePcmRecorder");
                    bPEAThread.start();
                    this.LJFF = bPEAThread;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BulletinAudioPcmRecorder startAppend -> ");
                    sbLIZ.append(file.getAbsolutePath());
                    sbLIZ.append(", existing=");
                    sbLIZ.append(j);
                    sbLIZ.append(" samples, sampleRate=");
                    sbLIZ.append(iLIZ);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                try {
                    randomAccessFile.close();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C2228608oG.LIZ(audioRecord);
                throw new IllegalStateException("WAV sample-rate mismatch: header=" + iLIZJ + ", current=" + iLIZ + ". Refusing to append.");
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                try {
                    C2228608oG.LIZ(audioRecord);
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                C0OPX.LJIIIIZZ("BulletinAudioPcmRecorder.startAppend: open/seek failed for " + file.getAbsolutePath() + ": " + e3.getMessage());
                throw new IllegalStateException("WAV file open/seek failed: " + e3.getMessage(), e3);
            }
        }
        C2228608oG.LIZ(audioRecord);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AudioRecord init failed, state=");
        sbLIZ2.append(audioRecord.getState());
        sbLIZ2.append(", sampleRate=");
        sbLIZ2.append(iLIZ);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void LJII(RandomAccessFile randomAccessFile, int i) throws IOException {
        randomAccessFile.write(i & 255);
        randomAccessFile.write((i >> 8) & 255);
        randomAccessFile.write((i >> 16) & 255);
        randomAccessFile.write((i >> 24) & 255);
    }

    public static void LJIIIIZZ(RandomAccessFile randomAccessFile, int i) throws IOException {
        randomAccessFile.write(i & 255);
        randomAccessFile.write((i >> 8) & 255);
    }

    public static void LJIIIZ(RandomAccessFile randomAccessFile, int i) throws IOException {
        randomAccessFile.seek(0L);
        randomAccessFile.writeBytes("RIFF");
        LJII(randomAccessFile, (int) (((long) 36) + 0));
        randomAccessFile.writeBytes("WAVE");
        randomAccessFile.writeBytes("fmt ");
        LJII(randomAccessFile, 16);
        LJIIIIZZ(randomAccessFile, 1);
        LJIIIIZZ(randomAccessFile, 1);
        LJII(randomAccessFile, i);
        LJII(randomAccessFile, i * 2);
        LJIIIIZZ(randomAccessFile, 2);
        LJIIIIZZ(randomAccessFile, 16);
        randomAccessFile.writeBytes("data");
        LJII(randomAccessFile, (int) 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0160, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0161, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r8);
        r23.LJIIIZ++;
        X.C0OPX.LJIIIIZZ("WAV write error #" + r23.LJIIIZ + ": " + r8.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018b, code lost:
    
        if (r23.LJIIIZ >= r9) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018d, code lost:
    
        r23.LJII.set(false);
        r23.LIZJ.invoke("WAV write failed 3 times: " + r8.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2228508oF.LIZLLL(int, int):void");
    }

    public C2228508oF(Function0 function0, Function1 function1, Function1 function12) {
        this.LIZ = function1;
        this.LIZIZ = function0;
        this.LIZJ = function12;
    }
}
