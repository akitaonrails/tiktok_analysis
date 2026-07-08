package X;

import Y.AObjectS396S0100000_22;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1Bwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221281Bwk implements InterfaceC1435810nT1 {
    public final Lock LIZ;
    public final Condition LIZIZ;
    public final Lock LIZJ;
    public final Condition LIZLLL;
    public final C2221321Bwo LJ;
    public C133L LJFF;
    public volatile long LJI;
    public volatile boolean LJII;
    public volatile EnumC19359610oc LJIIIIZZ;
    public InterfaceC1436020nTM LJIIIZ;
    public int LJIIJ;
    public InterfaceC2221271Bwj LJIIJJI;
    public final LinkedList<C2221381Bwu> LJIIL;
    public final String LJIILIIL;
    public final C0VSJ LJIILJJIL;
    public final C136X<Long> LJIILL;
    public int LJIILLIIL;
    public final String LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public C19508811Ug LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final C1435720nSs LJJ;

    @Override // X.InterfaceC1435810nT1
    public final void LJ() {
        this.LJIJJLI = true;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [X.133L] */
    @Override // X.InterfaceC1435810nT1
    public final synchronized void LJFF() {
        if (this.LJIJ) {
            return;
        }
        try {
            String parent = this.LJIILJJIL.getParent();
            Objects.requireNonNull(parent);
            boolean zMkdirs = new C0VSJ(parent).mkdirs();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create parent dir, result: ");
            sbLIZ.append(zMkdirs);
            LJII(true, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            C2301108zx.LIZ(this.LJIILJJIL.getParent());
            C2301108zx.LIZ.add(this.LJIILJJIL.getPath());
            if (this.LJIILJJIL.exists()) {
                this.LJIILJJIL.delete();
            }
            C570490MZb.LJI(this.LJIILJJIL);
            this.LJFF = new RandomAccessFile(this.LJIILJJIL) { // from class: X.133L
            };
            LJII(false, "createFile,filePath:%s", this.LJIILJJIL.getAbsolutePath());
            C0CHQ.LIZ().getPublishService().LJJIIZI().getClass();
            C1436930nUp.LIZ();
            this.LJIJ = true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ConcurrentUploadByFile, init output file failed, filePath: ");
            sbLIZ2.append(this.LJIILIIL);
            LJII(true, C2188811AlT.LIZIZ(sbLIZ2), new Object[0]);
            C2221371Bwt c2221371Bwt = new C2221371Bwt();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("init output file failed, filePath: ");
            sbLIZ3.append(this.LJIILIIL);
            c2221371Bwt.LIZ = C2188811AlT.LIZIZ(sbLIZ3);
            c2221371Bwt.LIZIZ = e;
            c2221371Bwt.LIZJ = 88880000;
            C1431180nLY c1431180nLY = new C1431180nLY(c2221371Bwt.LIZ, c2221371Bwt.LIZIZ);
            c1431180nLY.setErrorCode(c2221371Bwt.LIZJ);
            throw c1431180nLY;
        }
    }

    @Override // X.InterfaceC1435810nT1
    public final long getHeaderSize() {
        boolean zAwait;
        long j;
        LJII(false, "StartGetHeaderSize", new Object[0]);
        int iLJI = LJI();
        if (iLJI < 0) {
            j = iLJI;
        } else {
            if (this.LJI <= 0) {
                C2221331Bwp c2221331Bwp = new C2221331Bwp(this);
                ((ReentrantLock) this.LIZJ).lock();
                while (true) {
                    try {
                        try {
                            this.LJ.LIZ(c2221331Bwp);
                            boolean z = this.LJIJJLI;
                            do {
                                zAwait = this.LIZLLL.await(30L, TimeUnit.SECONDS);
                            } while (c2221331Bwp.LIZ == null);
                            if (!zAwait && z) {
                                this.LJIILLIIL = -1;
                                throw new C2216101BoO("upload timeout");
                            }
                            int iLJI2 = LJI();
                            if (iLJI2 < 0) {
                                j = iLJI2;
                                ((ReentrantLock) this.LIZJ).unlock();
                                break;
                            }
                            if (c2221331Bwp.LIZ != EnumC994220bym.GET_HEADER_SIZE_WAIT) {
                                ((ReentrantLock) this.LIZJ).unlock();
                                j = this.LJI <= 0 ? -1L : this.LJI;
                            }
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new C2216101BoO(e);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        ((ReentrantLock) this.LIZJ).unlock();
                        throw th;
                    }
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantLock) this.LIZJ).unlock();
                    throw th;
                }
            }
            j = this.LJI;
        }
        LJII(false, "EndGetHeaderSize result:%d", Long.valueOf(j));
        return j;
    }

    public final int LJI() {
        if (EnumC19359610oc.UPLOAD_FINISH.equals(this.LJIIIIZZ)) {
            return -1;
        }
        return EnumC19359610oc.UPLOAD_CANCEL.equals(this.LJIIIIZZ) ? -2 : 1;
    }

    public final void LJIIIZ() {
        if (this.LJIL) {
            return;
        }
        if (!this.LJIILJJIL.exists() || this.LJIILJJIL.length() <= 0) {
            this.LJIL = true;
            long length = this.LJIILJJIL.exists() ? this.LJIILJJIL.length() : -10086L;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[TikTok-Publish]file not found when consume, len=");
            sbLIZ.append(length);
            LJII(true, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[TikTok-Publish]file not found when consume, len=");
            sbLIZ2.append(length);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJIIJ() {
        this.LJIIIIZZ = EnumC19359610oc.UPLOADING;
        this.LJIIL.clear();
        this.LJIILLIIL = 0;
        this.LJIIIZ = null;
        C136X<Long> c136x = this.LJIILL;
        Long l = -1L;
        if (l.compareTo(c136x.LIZ) > 0) {
            c136x.LIZ = l;
        }
        this.LJIJI = false;
        this.LJIL = false;
    }

    @Override // X.InterfaceC1435810nT1
    public final void cancelUpload() {
        if (!this.LJIJ) {
            LJII(true, "cancelUpload on not init OutputFile finish", new Object[0]);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop cancelUpload, currentStatus:");
        sbLIZ.append(this.LJIIIIZZ);
        LJII(true, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
        if (this.LJIIIIZZ != EnumC19359610oc.UPLOADING) {
            return;
        }
        this.LJIIIIZZ = EnumC19359610oc.UPLOAD_CANCEL;
        try {
            C2301108zx.LIZ.remove(this.LJIILJJIL.getPath());
            this.LJ.LIZ(new C2221301Bwm(this, EnumC1288180jcu.CANCEL));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC1435810nT1
    public final void LIZLLL() {
        LJIIJ();
        this.LJII = false;
        this.LJI = 0L;
        this.LJIJJLI = false;
        this.LJIIJ = 0;
        this.LJIIJJI = null;
        this.LJIJ = false;
        this.LJIL = false;
        if (((Number) C280570Az9.LIZ.getValue()).intValue() > 0) {
            this.LJIJJ = new C19508811Ug(new C2221361Bws(this));
        }
        try {
            C0VSJ c0vsj = this.LJIILJJIL;
            if (c0vsj != null && c0vsj.exists()) {
                this.LJIILJJIL.delete();
            }
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1435720nSs c1435720nSs = this.LJJ;
        c1435720nSs.LIZJ = "";
        c1435720nSs.LIZIZ.clear();
    }

    @Override // X.InterfaceC1435810nT1
    public final int LIZIZ() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1435810nT1
    public final boolean isProduceFinish() {
        return this.LJII;
    }

    @Override // X.InterfaceC1435810nT1
    public final void disableDeleteCacheWhenEnd(boolean z) {
        this.LJIJI = z;
    }

    @Override // X.InterfaceC1435810nT1
    public final void stopUpload(boolean z) {
        EnumC1288180jcu enumC1288180jcu;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop stopUpload, currentStatus:");
        sbLIZ.append(this.LJIIIIZZ);
        LJII(true, C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
        if (this.LJIIIIZZ != EnumC19359610oc.UPLOADING) {
            return;
        }
        this.LJIIIIZZ = EnumC19359610oc.UPLOAD_FINISH;
        try {
            C2301108zx.LIZ.remove(this.LJIILJJIL.getPath());
            C2221321Bwo c2221321Bwo = this.LJ;
            if (z) {
                enumC1288180jcu = EnumC1288180jcu.SUCCESS;
            } else {
                enumC1288180jcu = EnumC1288180jcu.FAILED;
            }
            c2221321Bwo.LIZ(new C2221301Bwm(this, enumC1288180jcu));
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public C2221281Bwk(String str, String str2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LIZ = reentrantLock;
        this.LIZIZ = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.LIZJ = reentrantLock2;
        this.LIZLLL = reentrantLock2.newCondition();
        this.LJI = 0L;
        this.LJIIJ = 0;
        this.LJIIJJI = null;
        this.LJIIL = new LinkedList<>();
        this.LJIILL = new C136X<>(-1L);
        this.LJIILLIIL = 0;
        this.LJIJ = false;
        this.LJIJI = false;
        this.LJIJJ = new C19508811Ug(new C2221361Bws(this));
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = new C1435720nSs(new AObjectS396S0100000_22(this, 10));
        this.LJ = new C2221321Bwo();
        this.LJIILIIL = str;
        this.LJIILJJIL = new C0VSJ(str);
        this.LJIIZILJ = str2;
        this.LJIIIIZZ = EnumC19359610oc.UPLOADING;
    }

    @Override // X.InterfaceC1435810nT1
    public final long getCrc32ByOffset(long j, long j2) throws Throwable {
        long value;
        RandomAccessFile randomAccessFile;
        int iLJI = LJI();
        if (iLJI < 0) {
            value = iLJI;
        } else {
            value = -1;
            if (((int) this.LJIILJJIL.length()) >= j + j2) {
                CRC32 crc32 = new CRC32();
                RandomAccessFile randomAccessFile2 = null;
                try {
                    try {
                        try {
                            randomAccessFile = new RandomAccessFile(this.LJIILJJIL, "r");
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    randomAccessFile.seek(j);
                    byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
                    long j3 = 0;
                    while (j3 < j2) {
                        randomAccessFile.read(bArr);
                        j3 += 2048;
                        crc32.update(bArr, 0, 2048 - ((int) Math.max(0L, j3 - j2)));
                    }
                    value = crc32.getValue();
                    randomAccessFile.close();
                } catch (IOException e3) {
                    e = e3;
                    randomAccessFile2 = randomAccessFile;
                    TryCatchGuardChecker.doCheck(e);
                    if (randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    LJII(false, "GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(value));
                    return value;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    TryCatchGuardChecker.doCheck(th);
                    if (randomAccessFile2 != null) {
                        try {
                            randomAccessFile2.close();
                            throw th;
                        } catch (IOException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
        }
        LJII(false, "GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(value));
        return value;
    }

    @Override // X.InterfaceC1435810nT1
    public final long getNoConsumeBufferSize(long j, int i) {
        if (i > 0) {
            return (this.LJIILJJIL.length() - j) - ((long) i);
        }
        if (i == 0) {
            return 0L;
        }
        return -1L;
    }

    @Override // X.InterfaceC1435810nT1
    public final boolean LIZJ(int i, long j, boolean z) {
        C01GW c01gw = C280570Az9.LIZ;
        if (((Number) c01gw.getValue()).intValue() <= 0) {
            return false;
        }
        C19508811Ug c19508811Ug = this.LJIJJ;
        int i2 = c19508811Ug.LJ + i;
        c19508811Ug.LJ = i2;
        if (j <= 0 || z || i2 > ((Number) c01gw.getValue()).intValue()) {
            return true;
        }
        return false;
    }

    public final void LJII(boolean z, String str, Object... objArr) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.k4(Locale.US, str, objArr));
        sbLIZ.append(" hash:");
        sbLIZ.append(hashCode());
        sbLIZ.append(",publishId:");
        sbLIZ.append(this.LJIIZILJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ConcurrentUploadByFile:");
            sbLIZ2.append(strLIZIZ);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC1435810nT1
    public final int consume(int i, byte[] bArr, int i2) {
        boolean zAwait;
        LJII(true, "StartSliceConsume sliceId:%d size:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (this.LJIIL.isEmpty()) {
            C136X<Long> c136x = this.LJIILL;
            Long l = 0L;
            if (l.compareTo(c136x.LIZ) > 0) {
                c136x.LIZ = l;
            }
        } else {
            C136X<Long> c136x2 = this.LJIILL;
            C2221381Bwu last = this.LJIIL.getLast();
            Long lValueOf = Long.valueOf(last.LIZIZ + ((long) last.LIZJ));
            if (lValueOf.compareTo(c136x2.LIZ) > 0) {
                c136x2.LIZ = lValueOf;
            }
        }
        int iLJI = LJI();
        if (iLJI >= 0) {
            C2221291Bwl c2221291Bwl = new C2221291Bwl(this, i, bArr, i2);
            ((ReentrantLock) this.LIZJ).lock();
            while (true) {
                try {
                    try {
                        c2221291Bwl.LJFF = null;
                        this.LJ.LIZ(c2221291Bwl);
                        boolean z = this.LJIJJLI;
                        do {
                            zAwait = this.LIZLLL.await(30L, TimeUnit.SECONDS);
                        } while (c2221291Bwl.LJFF == null);
                        if (zAwait || !z) {
                            iLJI = LJI();
                            if (iLJI >= 0) {
                                if (c2221291Bwl.LJFF != EnumC2221351Bwr.CONSUME_WAIT_DATA) {
                                    ((ReentrantLock) this.LIZJ).unlock();
                                    int i3 = C2221341Bwq.LIZ[c2221291Bwl.LJFF.ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            iLJI = c2221291Bwl.LIZJ;
                                        } else {
                                            LJIIIZ();
                                            iLJI = 0;
                                        }
                                    } else {
                                        throw new C2216101BoO(c2221291Bwl.LIZLLL);
                                    }
                                }
                            } else {
                                ((ReentrantLock) this.LIZJ).unlock();
                                break;
                            }
                        } else {
                            this.LJIILLIIL = -1;
                            throw new C2216101BoO("upload timeout");
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new C2216101BoO(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantLock) this.LIZJ).unlock();
                    throw th;
                }
            }
        }
        LJII(true, "EndSliceConsume sliceId:%d size:%d result:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(iLJI));
        return iLJI;
    }

    @Override // X.InterfaceC1435810nT1
    public final void LIZ(InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i, boolean z) {
        LJII(false, "produce offset:%d size:%d isFinish:%b", Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
        if (LJI() < 0) {
            return;
        }
        C1435720nSs c1435720nSs = this.LJJ;
        if (c1435720nSs.LIZ.invoke().booleanValue()) {
            c1435720nSs.LIZ("produce_raw_after_finish");
        }
        C01GW c01gw = C280570Az9.LIZ;
        if (((Number) c01gw.getValue()).intValue() > 0 && (interfaceC2221271Bwj instanceof C199555136b)) {
            C19508811Ug c19508811Ug = this.LJIJJ;
            byte[] bArr = ((C199555136b) interfaceC2221271Bwj).LIZ;
            if (c19508811Ug.LIZIZ.isEmpty()) {
                c19508811Ug.LIZJ = j;
            }
            long j2 = c19508811Ug.LIZJ;
            int i2 = c19508811Ug.LIZLLL;
            if (((long) i2) + j2 == j) {
                c19508811Ug.LIZIZ.add(bArr);
                c19508811Ug.LIZLLL += i;
            } else {
                c19508811Ug.LIZ(i2, j2, false);
                c19508811Ug.LIZIZ.add(bArr);
                c19508811Ug.LIZJ = j;
                c19508811Ug.LIZLLL = i;
                c19508811Ug.LJ = i;
            }
            if (z || c19508811Ug.LIZLLL > ((Number) c01gw.getValue()).intValue()) {
                c19508811Ug.LIZ(c19508811Ug.LIZLLL, c19508811Ug.LIZJ, z);
                c19508811Ug.LIZLLL = 0;
                c19508811Ug.LJ = 0;
                return;
            }
            return;
        }
        LJIIIIZZ(interfaceC2221271Bwj, j, i, z);
    }

    public final Unit LJIIIIZZ(InterfaceC2221271Bwj interfaceC2221271Bwj, long j, int i, boolean z) {
        C1435720nSs c1435720nSs = this.LJJ;
        if (c1435720nSs.LIZ.invoke().booleanValue()) {
            c1435720nSs.LIZ("produce_core_after_finish");
        }
        C2221261Bwi c2221261Bwi = new C2221261Bwi(this, interfaceC2221271Bwj, j, i);
        ((ReentrantLock) this.LIZ).lock();
        try {
            try {
                this.LJ.LIZ(c2221261Bwi);
                this.LIZIZ.await();
                if (c2221261Bwi.LIZLLL == null) {
                    ((ReentrantLock) this.LIZ).unlock();
                    this.LJII = z;
                    ((ReentrantLock) this.LIZJ).lock();
                    this.LIZLLL.signalAll();
                    ((ReentrantLock) this.LIZJ).unlock();
                    return Unit.LIZ;
                }
                throw new C2216101BoO(c2221261Bwi.LIZLLL);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C2216101BoO(e);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            ((ReentrantLock) this.LIZ).unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC1435810nT1
    public final int streamConsume(long j, byte[] bArr, int i, int i2) {
        boolean zAwait;
        C1435720nSs c1435720nSs = this.LJJ;
        c1435720nSs.getClass();
        if (i <= 0 || i2 <= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stream_consume_size_zero: max=");
            sbLIZ.append(i);
            sbLIZ.append(", min=");
            sbLIZ.append(i2);
            c1435720nSs.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i % 16 != 0 || i2 % 16 != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("stream_consume_size_error: max=");
            sbLIZ2.append(i);
            sbLIZ2.append(", min=");
            sbLIZ2.append(i2);
            c1435720nSs.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LJII(false, "StartStreamConsume offset:%d maxSize:%d minSize:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2));
        C136X<Long> c136x = this.LJIILL;
        Long lValueOf = Long.valueOf(j);
        if (lValueOf.compareTo(c136x.LIZ) > 0) {
            c136x.LIZ = lValueOf;
        }
        int iLJI = LJI();
        if (iLJI >= 0) {
            C2221311Bwn c2221311Bwn = new C2221311Bwn(this, j, bArr, i, i2);
            ((ReentrantLock) this.LIZJ).lock();
            while (true) {
                try {
                    try {
                        c2221311Bwn.LJI = null;
                        this.LJ.LIZ(c2221311Bwn);
                        boolean z = this.LJIJJLI;
                        do {
                            zAwait = this.LIZLLL.await(30L, TimeUnit.SECONDS);
                        } while (c2221311Bwn.LJI == null);
                        if (zAwait || !z) {
                            iLJI = LJI();
                            if (iLJI >= 0) {
                                if (c2221311Bwn.LJI != EnumC2221351Bwr.CONSUME_WAIT_DATA) {
                                    ((ReentrantLock) this.LIZJ).unlock();
                                    int i3 = C2221341Bwq.LIZ[c2221311Bwn.LJI.ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            iLJI = c2221311Bwn.LJ;
                                        } else {
                                            LJIIIZ();
                                            iLJI = 0;
                                        }
                                    } else {
                                        throw new C2216101BoO(c2221311Bwn.LJFF);
                                    }
                                }
                            } else {
                                ((ReentrantLock) this.LIZJ).unlock();
                                break;
                            }
                        } else {
                            this.LJIILLIIL = -1;
                            throw new C2216101BoO("upload timeout");
                        }
                    } catch (InterruptedException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new C2216101BoO(e);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    ((ReentrantLock) this.LIZJ).unlock();
                    throw th;
                }
                TryCatchGuardChecker.doCheck(th);
                ((ReentrantLock) this.LIZJ).unlock();
                throw th;
            }
        }
        LJII(false, "EndStreamConsume offset:%d maxSize:%d minSize:%d result:%d", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(iLJI));
        return iLJI;
    }
}
