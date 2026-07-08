package X;

import Y.ARunnableS50S0300000_17;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: X.0fqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142870fqX implements InterfaceC1142710fqH<String> {
    public final InterfaceC1142900fqa LIZ;
    public InterfaceC1142800fqQ<String> LIZIZ;
    public final InterfaceC1138850fk3 LIZJ;

    public final String LIZ(C1139230fkf c1139230fkf) {
        String strLIZ = C1142880fqY.LIZ(this.LIZJ.LIZIZ(c1139230fkf));
        C0VSJ c0vsj = new C0VSJ(strLIZ);
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mkdirs return false, dir=");
            sbLIZ.append(c0vsj);
            throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ);
        sbLIZ2.append(C08HI.LIZ(c1139230fkf.LIZJ[0]));
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C1142870fqX(C1142940fqe c1142940fqe, InterfaceC1138850fk3 interfaceC1138850fk3) {
        this.LIZ = c1142940fqe;
        this.LIZJ = interfaceC1138850fk3;
    }

    @Override // X.InterfaceC1142710fqH
    public final void LIZLLL(C1139230fkf c1139230fkf, InterfaceC1142800fqQ<String> interfaceC1142800fqQ) {
        this.LIZIZ = interfaceC1142800fqQ;
        C1142890fqZ c1142890fqZ = new C1142890fqZ(c1139230fkf.LIZJ[Math.min(c1139230fkf.LJII, c1139230fkf.LIZJ.length - 1)]);
        try {
            C0VSJ c0vsjLIZIZ = C1142880fqY.LIZIZ(LIZ(c1139230fkf));
            if (c0vsjLIZIZ.exists()) {
                c1142890fqZ.LIZIZ = c0vsjLIZIZ.length();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1142900fqa interfaceC1142900fqa = this.LIZ;
        C1142860fqW c1142860fqW = new C1142860fqW(this, c1139230fkf, c1142890fqZ);
        C1142940fqe c1142940fqe = (C1142940fqe) interfaceC1142900fqa;
        c1142940fqe.getClass();
        if (C1142910fqb.LIZ(c1142890fqZ.LIZ)) {
            c1142860fqW.LIZ(0, new IllegalArgumentException("request is not valid"));
        } else {
            c1142940fqe.LIZ.submit(new ARunnableS50S0300000_17(c1142890fqZ, c1142860fqW, c1142940fqe, 6));
        }
    }

    public final void LIZIZ(C1139230fkf c1139230fkf, InputStream inputStream, long j, C0VSJ c0vsj) {
        RandomAccessFile randomAccessFile;
        int iExp;
        try {
            randomAccessFile = new RandomAccessFile(c0vsj, "rw");
            try {
                long length = randomAccessFile.length();
                if (length > 0) {
                    randomAccessFile.seek(length);
                }
                byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
                long j2 = length + j;
                int i = 0;
                while (true) {
                    try {
                        int i2 = inputStream.read(bArr);
                        if (i2 >= 0) {
                            randomAccessFile.write(bArr, 0, i2);
                            length += (long) i2;
                            if (j2 > 0) {
                                iExp = (int) ((100 * length) / j2);
                            } else {
                                iExp = (int) ((1.0d - Math.exp((-length) / 50000.0d)) * 100.0d);
                            }
                            if (iExp != i) {
                                try {
                                    this.LIZIZ.LIZIZ(c1139230fkf, iExp);
                                    i = iExp;
                                } catch (Throwable th) {
                                    th = th;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            break;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                    if (randomAccessFile != null) {
                                        try {
                                            randomAccessFile.close();
                                            inputStream.close();
                                            throw th;
                                        } catch (IOException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            throw th;
                                        }
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            try {
                                randomAccessFile.close();
                                inputStream.close();
                                return;
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }
}
