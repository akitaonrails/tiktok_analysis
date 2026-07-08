package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.inbox.bulletin.setting.VoiceRecordingConfiguration;
import java.io.File;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: X.08h2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2183808h2 {
    public static int LIZ() {
        boolean z = false;
        if (C2183908h3.LIZ().enableHwEncode && C2185908hN.LIZ.getValue() != null) {
            z = true;
        }
        VoiceRecordingConfiguration voiceRecordingConfigurationLIZ = C2183908h3.LIZ();
        return z ? voiceRecordingConfigurationLIZ.sampleRate : voiceRecordingConfigurationLIZ.sampleRateSw;
    }

    public static int LIZJ(File file) {
        if (file.exists() && file.length() >= 28) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                Throwable th = null;
                try {
                    randomAccessFile.seek(24L);
                    int i = (randomAccessFile.read() & 255) | ((randomAccessFile.read() & 255) << 8) | ((randomAccessFile.read() & 255) << 16) | ((randomAccessFile.read() & 255) << 24);
                    C2107108Nh.LIZ(randomAccessFile, null);
                    return i;
                } catch (Throwable th2) {
                    try {
                        TryCatchGuardChecker.doCheck(th2);
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(randomAccessFile, th);
                                    throw th;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("peekWavSampleRate failed for ");
                sbLIZ.append(file.getAbsolutePath());
                sbLIZ.append(": ");
                sbLIZ.append(e.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return -1;
    }

    public static long LIZIZ(int i, File file) throws Throwable {
        long j;
        if (!file.exists() || file.length() <= 44 || i <= 0) {
            return 0L;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            Throwable th = null;
            try {
                randomAccessFile.seek(40L);
                long j2 = (randomAccessFile.read() & 255) | ((randomAccessFile.read() & 255) << 8) | ((randomAccessFile.read() & 255) << 16) | ((randomAccessFile.read() & 255) << 24);
                if (j2 <= 0) {
                    j = 0;
                } else {
                    j = ((j2 / ((long) 2)) * 1000) / ((long) i);
                }
                C2107108Nh.LIZ(randomAccessFile, null);
                return j;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(randomAccessFile, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("peekWavDurationMs failed for ");
            sbLIZ.append(file.getAbsolutePath());
            sbLIZ.append(": ");
            sbLIZ.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            return 0L;
        }
    }
}
