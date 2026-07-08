package X;

import Y.AComparatorS32S0000000_13;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793800VBy {
    public final File LIZ;
    public final ByteBuffer LIZIZ;
    public long LIZJ;
    public long LIZLLL;

    public final synchronized void LIZ() {
        boolean z = false;
        int i = this.LIZIZ.getInt(0);
        this.LIZIZ.getInt(4);
        int i2 = this.LIZIZ.getInt(8);
        int i3 = this.LIZIZ.getInt(12);
        if (i != 1095781686 || i3 <= 0 || i2 <= 0) {
            LJFF();
            return;
        }
        System.nanoTime();
        FileChannel channel = null;
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(System.currentTimeMillis());
            sbLIZ.append("_");
            sbLIZ.append(UUID.randomUUID().toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                if (!this.LIZ.exists()) {
                    File parentFile = this.LIZ.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.LIZ.mkdirs();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C0VCY.LIZIZ("flushDir create error.", th);
            }
            C0VSJ c0vsj = new C0VSJ(this.LIZ, strLIZIZ + ".tmp");
            if (c0vsj.exists()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("file is exist:");
                sbLIZ2.append(c0vsj.getName());
                C0VCY.LIZ("APM-SDK", C2188811AlT.LIZIZ(sbLIZ2));
            }
            channel = new C0VSV((File) c0vsj, false).getChannel();
            this.LIZIZ.position(i3 + 16);
            this.LIZIZ.flip();
            channel.write(this.LIZIZ);
            File file = this.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(".log");
            if (c0vsj.renameTo(new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ3)))) {
                z = true;
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("rename error");
                sbLIZ4.append(c0vsj.getAbsolutePath());
                C0VCY.LIZ("APM-SDK", C2188811AlT.LIZIZ(sbLIZ4));
            }
        } finally {
            try {
            } catch (Throwable th2) {
            }
        }
        C2105408Mq.LIZ(channel);
        if (!z) {
            LIZIZ();
        }
        LJFF();
    }

    public final synchronized List<File> LIZLLL() {
        File file = this.LIZ;
        if (file == null) {
            return null;
        }
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: X.0VCK
            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.io.FileFilter
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean accept(java.io.File r9) {
                /*
                    r8 = this;
                    java.lang.String r6 = r9.getName()
                    X.0VBy r0 = r8.LIZ
                    r0.getClass()
                    java.lang.String r2 = r9.getName()
                    r7 = 1
                    r5 = 0
                    java.lang.String r0 = "_"
                    int r1 = r2.indexOf(r0)     // Catch: java.lang.Exception -> L2e
                    r0 = -1
                    if (r1 == r0) goto L34
                    long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2e
                    java.lang.String r0 = r2.substring(r5, r1)     // Catch: java.lang.Exception -> L2e
                    long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L2e
                    long r3 = r3 - r0
                    r1 = 604800000(0x240c8400, double:2.988109026E-315)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 < 0) goto L34
                    r1 = 1
                    goto L35
                L2e:
                    r0 = move-exception
                    r1 = 0
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    goto L35
                L34:
                    r1 = 0
                L35:
                    if (r1 == 0) goto L3b
                    X.C2404609bY.LIZ(r9)
                    return r5
                L3b:
                    java.lang.String r0 = ".log"
                    boolean r0 = r6.endsWith(r0)
                    if (r0 == 0) goto L44
                    return r7
                L44:
                    java.lang.String r0 = ".tmp"
                    r6.endsWith(r0)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0VCK.accept(java.io.File):boolean");
            }
        });
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            arrayList.add(file2.getName());
        }
        Collections.sort(arrayList, new AComparatorS32S0000000_13(19));
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(new C0VSJ(this.LIZ, (String) ListProtector.get(arrayList, i)));
        }
        return arrayList2;
    }

    public final void LIZIZ() {
        this.LIZIZ.position(this.LIZIZ.getInt(12) + 16);
        this.LIZIZ.flip();
        C0VCA c0vcaLIZ = C0VCA.LIZ(this.LIZIZ);
        C0VC3 c0vc3 = C793880VCg.LIZ;
        if (c0vcaLIZ == null) {
            c0vc3.getClass();
        } else {
            c0vc3.LIZIZ.LIZJ(c0vcaLIZ);
        }
    }

    public final void LJFF() {
        this.LIZIZ.clear();
        this.LIZIZ.putInt(1095781686);
        this.LIZIZ.putInt(1);
        this.LIZIZ.putInt(0);
        this.LIZIZ.putInt(0);
    }

    public final C793730VBr LIZJ(JSONObject jSONObject) {
        boolean z;
        if (C0VC5.LIZJ()) {
            int i = C0VC5.LJ.LIZIZ;
            if (i > 0) {
                z = true;
            } else {
                z = false;
                long j = this.LIZLLL;
                if (j > 10) {
                    i = (int) (this.LIZJ / j);
                } else {
                    i = 256;
                }
            }
            C08SI c08si = new C08SI(new C793720VBq(i));
            try {
                c08si.LJI(jSONObject);
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (!z) {
                this.LIZJ += (long) c08si.LIZ.LLILLJJLI;
                this.LIZLLL++;
            }
            C793720VBq c793720VBq = c08si.LIZ;
            return new C793730VBr(c793720VBq.LL, c793720VBq.LLILLJJLI);
        }
        return new C793730VBr(C786410Ut5.J3(jSONObject).getBytes());
    }

    public C793800VBy(File file, File file2) {
        this.LIZ = file2;
        try {
            this.LIZIZ = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 262160L);
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VCY.LIZIZ("create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = ByteBuffer.allocate(262160);
        }
        LJFF();
    }

    public final synchronized void LJ(JSONObject jSONObject, long j, long j2) {
        if (jSONObject == null) {
            return;
        }
        C793730VBr c793730VBrLIZJ = LIZJ(jSONObject);
        int i = c793730VBrLIZJ.LIZIZ + 4 + 16;
        if (i > 262144) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LogItem ");
            sbLIZ.append(jSONObject);
            sbLIZ.append(" is too large. please check it.");
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC792920V8o interfaceC792920V8o = C0VCY.LIZ;
            if (interfaceC792920V8o != null) {
                interfaceC792920V8o.w();
            }
            return;
        }
        if (i > this.LIZIZ.remaining()) {
            LIZ();
        }
        this.LIZIZ.putInt(c793730VBrLIZJ.LIZIZ);
        this.LIZIZ.putLong(j);
        this.LIZIZ.putLong(j2);
        this.LIZIZ.put(c793730VBrLIZJ.LIZ, 0, c793730VBrLIZJ.LIZIZ);
        this.LIZIZ.putInt(8, this.LIZIZ.getInt(8) + 1);
        this.LIZIZ.putInt(12, this.LIZIZ.getInt(12) + i);
        if (this.LIZIZ.position() >= 131072 || this.LIZIZ.getInt(8) >= 100) {
            LIZ();
        }
    }
}
