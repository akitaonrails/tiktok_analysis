package X;

import Y.AComparatorS32S0000000_13;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: X.0VBK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VBK implements C0VB7 {
    public volatile C793760VBu LIZLLL;
    public volatile C793750VBt LJ;
    public volatile AbstractRunnableC792500V6y LJFF;
    public volatile long LIZ = 60000;
    public volatile long LIZIZ = 1048576;
    public final C0V6Z<C0VBZ> LIZJ = new C0V6Z<>(40);
    public volatile boolean LJI = false;

    public final synchronized void LIZJ() {
        final long j = this.LIZ;
        this.LJFF = new AbstractRunnableC792500V6y(j) { // from class: X.0VBM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LogReporter@3f77.init$1");
                try {
                    this.LLILZ.LIZLLL();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LogReporter@3f77.init$1");
            }
        };
        EnumC792970V8t enumC792970V8t = EnumC792970V8t.IO;
        C792490V6x.LIZ(enumC792970V8t).LIZJ(this.LJFF);
        if (C792420V6q.LJIILJJIL()) {
            C792490V6x.LIZ(enumC792970V8t).LIZJ(new AbstractRunnableC792500V6y() { // from class: X.0VBc
                public final void LIZ() {
                    File[] fileArrListFiles;
                    this.LLILZ.getClass();
                    C0VSJ c0vsj = new C0VSJ(C793630VBh.LIZLLL(), "child_process_persistent");
                    if (!c0vsj.exists() || (fileArrListFiles = c0vsj.listFiles()) == null) {
                        return;
                    }
                    for (File file : fileArrListFiles) {
                        if (file != null && file.exists() && file.length() > 0) {
                            try {
                                if (CastLongProtector.parseLong(file.getName().split("_")[0]) < C792420V6q.LJI()) {
                                    FileChannel channel = null;
                                    try {
                                        channel = new RandomAccessFile(file, "rw").getChannel();
                                        FileLock fileLockTryLock = channel.tryLock(0L, Long.MAX_VALUE, false);
                                        if (fileLockTryLock != null && fileLockTryLock.isValid()) {
                                            File fileLIZ = C793630VBh.LIZ();
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(System.currentTimeMillis());
                                            sbLIZ.append("_");
                                            sbLIZ.append(UUID.randomUUID().toString());
                                            sbLIZ.append(".log");
                                            C0VSJ c0vsj2 = new C0VSJ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ));
                                            String absolutePath = file.getAbsolutePath();
                                            String absolutePath2 = c0vsj2.getAbsolutePath();
                                            C0VSJ c0vsj3 = new C0VSJ(absolutePath);
                                            boolean zRenameTo = !c0vsj3.exists() ? false : c0vsj3.renameTo(new C0VSJ(absolutePath2));
                                            if (C792190V5t.LIZ()) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("moveInactiveSubProcessData: src:");
                                                sbLIZ2.append(file.getAbsolutePath());
                                                sbLIZ2.append(" dst:");
                                                sbLIZ2.append(c0vsj2.getAbsolutePath());
                                                sbLIZ2.append(" isSuccess:");
                                                sbLIZ2.append(zRenameTo);
                                                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
                                            }
                                            fileLockTryLock.release();
                                        } else if (C792190V5t.LIZ()) {
                                            C792910V8n.LIZ("APM-Slardar", "moveInactiveSubProcessData isValid is not true ");
                                        }
                                    } finally {
                                        try {
                                        } catch (Throwable th) {
                                        }
                                    }
                                    C2105408Mq.LIZ(channel);
                                } else {
                                    continue;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LogReporter@3f77.init$2");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LogReporter@3f77.init$2");
                }

                {
                    super(10000L);
                }
            });
        }
    }

    @Override // X.C0VB7
    public final String getName() {
        return "first_log_dir";
    }

    public final void LIZIZ() {
        try {
            if (this.LJ != null) {
                this.LJ.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "flushMemoryBuffer", th);
        }
    }

    public final void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.LIZLLL != null) {
                this.LIZLLL.LIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "flushPersistentBuffer", th);
        }
        LIZIZ();
        LJ();
        if (C792420V6q.LJIILJJIL()) {
            if (this.LIZLLL != null) {
                String[] strArrLIZLLL = this.LIZLLL.LIZLLL();
                if (strArrLIZLLL != null && strArrLIZLLL.length != 0) {
                    C0VBV.LIZJ = System.currentTimeMillis();
                    C0VBV.LIZLLL = 0L;
                    List listAsList = Arrays.asList(strArrLIZLLL);
                    Collections.sort(listAsList, new AComparatorS32S0000000_13(1));
                    if (C792190V5t.LIZ()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("reportFile: parsing ");
                        sbLIZ.append(listAsList.size());
                        sbLIZ.append(" files. fileNameList");
                        sbLIZ.append(listAsList);
                        C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= listAsList.size()) {
                            C0VBA.LIZ.LJ(0, arrayList);
                            C0VBV.LIZLLL = System.currentTimeMillis();
                            break;
                        }
                        C0VSJ c0vsj = new C0VSJ(C793630VBh.LIZ(), (String) ListProtector.get(listAsList, i));
                        if (c0vsj.exists()) {
                            try {
                                byte[] bArrLIZIZ = C2404609bY.LIZIZ(c0vsj);
                                if (bArrLIZIZ != null) {
                                    C0VBZ c0vbzLIZ = C0VBZ.LIZ(ByteBuffer.wrap(bArrLIZIZ));
                                    if (c0vbzLIZ != null) {
                                        c0vbzLIZ.LIZLLL = c0vsj;
                                        int i3 = c0vbzLIZ.LIZJ;
                                        if (i2 != 0 && i2 + i3 >= this.LIZIZ) {
                                            C0VBA.LIZ.LJ(listAsList.size() - arrayList.size(), arrayList);
                                            C0VBV.LIZLLL = System.currentTimeMillis();
                                            break;
                                        } else {
                                            i2 += i3;
                                            arrayList.add(c0vbzLIZ);
                                        }
                                    } else {
                                        C792910V8n.LIZIZ("APM-Slardar", "fromMemory bytes is null");
                                    }
                                } else {
                                    C792910V8n.LIZIZ("APM-Slardar", "fromFile bytes is null");
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C792910V8n.LIZJ("APM-Slardar", "fromFile", th2);
                            }
                            if (C792190V5t.LIZ()) {
                                C792910V8n.LIZ("APM-Slardar", "logFile invalid. delete now.");
                            }
                            c0vsj.delete();
                        }
                        i++;
                    }
                }
            } else {
                C792910V8n.LIZIZ("APM-Slardar", "persistentBuffer is null");
            }
        }
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LogReporter One Loop Cost:");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LJ() {
        if (this.LIZJ.LIZ()) {
            return;
        }
        C0VBV.LIZ = System.currentTimeMillis();
        C0VBV.LIZIZ = 0L;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (!this.LIZJ.LIZ()) {
            arrayList.add(this.LIZJ.LIZIZ());
            C0VBZ c0vbzLIZIZ = this.LIZJ.LIZIZ();
            if (c0vbzLIZIZ != null) {
                int i2 = c0vbzLIZIZ.LIZJ;
                if (i == 0 || i + i2 < this.LIZIZ) {
                    i += i2;
                    arrayList.add(c0vbzLIZIZ);
                } else {
                    C0VBA.LIZ.LJ(0, arrayList);
                    arrayList.clear();
                    arrayList.add(c0vbzLIZIZ);
                    i = i2;
                }
            }
        }
        C0VBA.LIZ.LJ(0, arrayList);
        C0VBV.LIZIZ = System.currentTimeMillis();
    }

    @Override // X.C0VB7
    public final long getSize() {
        String[] strArrLIZLLL = this.LIZLLL.LIZLLL();
        long length = 0;
        if (strArrLIZLLL != null && strArrLIZLLL.length != 0) {
            for (String str : strArrLIZLLL) {
                length += new C0VSJ(C793630VBh.LIZ(), str).length();
            }
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // X.C0VB7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(long r11) {
        /*
            r10 = this;
            X.0VBu r0 = r10.LIZLLL
            if (r0 != 0) goto L5
            return
        L5:
            X.0VBu r0 = r10.LIZLLL
            java.lang.String[] r9 = r0.LIZLLL()
            if (r9 == 0) goto L4e
            int r0 = r9.length
            if (r0 == 0) goto L4e
            int r8 = r9.length
            r7 = 0
            r6 = 0
        L13:
            if (r6 >= r8) goto L4e
            r1 = r9[r6]
            X.0VSJ r5 = new X.0VSJ
            java.io.File r0 = X.C793630VBh.LIZ()
            r5.<init>(r0, r1)
            java.lang.String r2 = r5.getName()
            java.lang.String r0 = "_"
            int r1 = r2.indexOf(r0)
            r0 = -1
            r3 = -1
            if (r1 == r0) goto L40
            java.lang.String r0 = r2.substring(r7, r1)     // Catch: java.lang.Exception -> L3c
            long r1 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L3c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L40
            goto L44
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            X.C2404609bY.LIZ(r5)
            goto L4b
        L44:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L4b
            X.C2404609bY.LIZ(r5)
        L4b:
            int r6 = r6 + 1
            goto L13
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VBK.LIZ(long):void");
    }

    public final synchronized void LJFF(long j) {
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setLoopInterval:");
            sbLIZ.append(this.LIZ);
            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (j > 0 && this.LIZ != j) {
            this.LIZ = j;
            if (this.LJFF == null) {
                return;
            }
            EnumC792970V8t enumC792970V8t = EnumC792970V8t.IO;
            C792490V6x.LIZ(enumC792970V8t).LIZIZ(this.LJFF);
            final long j2 = this.LIZ;
            final long j3 = this.LIZ;
            this.LJFF = new AbstractRunnableC792500V6y(j2, j3) { // from class: X.0VBL
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LogReporter@3f77.setLoopInterval$1");
                    try {
                        this.LLILZ.LIZLLL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LogReporter@3f77.setLoopInterval$1");
                }
            };
            C792490V6x.LIZ(enumC792970V8t).LIZJ(this.LJFF);
        }
    }
}
