package X;

import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793760VBu {
    public final File LIZ;
    public final long LIZIZ;
    public final ByteBuffer LIZJ;
    public long LIZLLL;
    public long LJ;

    public final synchronized String[] LIZLLL() {
        File[] fileArrListFiles = C793630VBh.LIZ().listFiles(new FileFilter() { // from class: X.0VCU
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                String name = file.getName();
                if (name.endsWith(".log")) {
                    return true;
                }
                if (name.endsWith(".txt")) {
                    return false;
                }
                C2404609bY.LIZ(file);
                return false;
            }
        });
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            arrayList.add(file.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final synchronized void LIZ() {
        boolean z = false;
        short s = this.LIZJ.getShort(0);
        long j = this.LIZJ.getLong(2);
        int i = this.LIZJ.getInt(10);
        int i2 = this.LIZJ.getInt(14);
        if (s != 2082 || i2 <= 0 || i <= 0) {
            if (C792190V5t.LIZ()) {
                C792910V8n.LIZ("APM-Slardar", "flushing: Skipped. no data to flush. reset buffer now.");
            }
            LJFF();
            return;
        }
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("flushing: headerId=");
            sbLIZ.append(j);
            sbLIZ.append(" totalCount=");
            sbLIZ.append(i);
            sbLIZ.append(" totalBytes=");
            sbLIZ.append(i2);
            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
        }
        long jNanoTime = System.nanoTime();
        FileChannel channel = null;
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ2.append("_");
            sbLIZ2.append(UUID.randomUUID().toString());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
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
                C792910V8n.LIZJ("APM-Slardar", "flushDir create error.", th);
            }
            C0VSJ c0vsj = new C0VSJ(this.LIZ, strLIZIZ + ".txt");
            if (c0vsj.exists()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("file is exist:");
                sbLIZ3.append(c0vsj.getName());
                C792910V8n.LIZIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ3));
            }
            channel = new C0VSV((File) c0vsj, false).getChannel();
            this.LIZJ.position(i2 + 18);
            this.LIZJ.flip();
            channel.write(this.LIZJ);
            File file = this.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(".log");
            if (c0vsj.renameTo(new C0VSJ(file, C2188811AlT.LIZIZ(sbLIZ4)))) {
                z = true;
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("rename error");
                sbLIZ5.append(c0vsj.getAbsolutePath());
                C792910V8n.LIZIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ5));
            }
            if (C792190V5t.LIZ()) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("flush to file success. flushFile=");
                sbLIZ6.append(c0vsj.getAbsolutePath());
                C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ6));
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
        if (C792190V5t.LIZ()) {
            C792910V8n.LIZ("APM-Slardar", "flush cost=" + (System.nanoTime() - jNanoTime));
        }
    }

    public final void LIZIZ() {
        this.LIZJ.position(this.LIZJ.getInt(14) + 18);
        this.LIZJ.flip();
        C0VBZ c0vbzLIZ = C0VBZ.LIZ(this.LIZJ);
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("flush to memory success. logFile=");
            sbLIZ.append(c0vbzLIZ);
            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ));
        }
        C0VBK c0vbk = C0VBJ.LIZ;
        if (c0vbzLIZ == null) {
            c0vbk.getClass();
        } else {
            c0vbk.LIZJ.LIZJ(c0vbzLIZ);
        }
    }

    public final void LJFF() {
        this.LIZJ.clear();
        this.LIZJ.putShort((short) 2082);
        this.LIZJ.putLong(this.LIZIZ);
        this.LIZJ.putInt(0);
        this.LIZJ.putInt(0);
    }

    public final C793730VBr LIZJ(JSONObject jSONObject) {
        boolean z;
        if (C792420V6q.LJIILL()) {
            int i = C792420V6q.LJIILLIIL.LIZIZ;
            if (i > 0) {
                z = true;
            } else {
                z = false;
                long j = this.LJ;
                if (j > 10) {
                    i = (int) (this.LIZLLL / j);
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
                this.LIZLLL += (long) c08si.LIZ.LLILLJJLI;
                this.LJ++;
            }
            C793720VBq c793720VBq = c08si.LIZ;
            return new C793730VBr(c793720VBq.LL, c793720VBq.LLILLJJLI);
        }
        return new C793730VBr(C786410Ut5.J3(jSONObject).getBytes());
    }

    public final synchronized void LJ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        if (C792190V5t.LIZ()) {
            try {
                DoctorManager.getInstance().LIZ("DATA_SAVE_TO_DB", new JSONObject(C786410Ut5.J3(jSONObject)));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C793730VBr c793730VBrLIZJ = LIZJ(jSONObject);
        if (c793730VBrLIZJ.LIZ()) {
            final String str = "bytes_write_error";
            C0VBB.LIZ(new C0V6S() { // from class: X.0V6T
                @Override // X.C0VB5
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.C0VB5
                public final String getLogType() {
                    return "service_monitor";
                }

                @Override // X.C0VB5
                public final boolean isValid() {
                    return true;
                }

                @Override // X.C0VB5
                public final JSONObject LIZ() {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("log_type", "service_monitor");
                        jSONObject2.put("service", "apm_error");
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", str);
                        jSONObject2.put("category", jSONObject3);
                        return jSONObject2;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return null;
                    }
                }
            });
            return;
        }
        int i = c793730VBrLIZJ.LIZIZ + 4;
        if (i > 262144) {
            final String str2 = "large_data";
            C0VBB.LIZ(new C0V6S() { // from class: X.0V6T
                @Override // X.C0VB5
                public final boolean LIZIZ() {
                    return false;
                }

                @Override // X.C0VB5
                public final String getLogType() {
                    return "service_monitor";
                }

                @Override // X.C0VB5
                public final boolean isValid() {
                    return true;
                }

                @Override // X.C0VB5
                public final JSONObject LIZ() {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("log_type", "service_monitor");
                        jSONObject2.put("service", "apm_error");
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("type", str2);
                        jSONObject2.put("category", jSONObject3);
                        return jSONObject2;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return null;
                    }
                }
            });
            return;
        }
        if (i > this.LIZJ.remaining()) {
            LIZ();
        }
        this.LIZJ.putInt(c793730VBrLIZJ.LIZIZ);
        this.LIZJ.put(c793730VBrLIZJ.LIZ, 0, c793730VBrLIZJ.LIZIZ);
        this.LIZJ.putInt(10, this.LIZJ.getInt(10) + 1);
        this.LIZJ.putInt(14, this.LIZJ.getInt(14) + i);
        if (C792190V5t.LIZ()) {
            C792910V8n.LIZ("APM-Slardar", C786410Ut5.j4("push success: totalCount=%s, totalBytes=%s, logItem=%s", new Object[]{Integer.valueOf(this.LIZJ.getInt(10)), Integer.valueOf(this.LIZJ.getInt(14)), jSONObject}));
        }
        if (this.LIZJ.position() >= 262134 || this.LIZJ.getInt(10) >= 256) {
            LIZ();
        }
    }

    public C793760VBu(long j, File file, File file2) {
        this.LIZ = file2;
        this.LIZIZ = j;
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            channel.tryLock();
            this.LIZJ = channel.map(FileChannel.MapMode.READ_WRITE, 0L, 262162L);
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C792910V8n.LIZJ("APM-Slardar", "create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.LIZJ == null) {
            this.LIZJ = ByteBuffer.allocate(262162);
        }
        LJFF();
    }
}
