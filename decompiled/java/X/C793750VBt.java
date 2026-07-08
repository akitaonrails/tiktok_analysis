package X;

import com.bytedance.apm.doctor.DoctorManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793750VBt {
    public final long LIZ;
    public final ByteBuffer LIZIZ = ByteBuffer.allocate(262162);
    public long LIZJ;
    public long LIZLLL;

    public final synchronized void LIZ() {
        short s = this.LIZIZ.getShort(0);
        long j = this.LIZIZ.getLong(2);
        int i = this.LIZIZ.getInt(10);
        int i2 = this.LIZIZ.getInt(14);
        if (s != 2082 || i2 <= 0 || i <= 0) {
            if (C792190V5t.LIZ()) {
                C792910V8n.LIZ("APM-Slardar", "flushing: Skipped. no data to flush. reset buffer now.");
            }
            LJ();
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
        LIZIZ();
        LJ();
        if (C792190V5t.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("flushToLimitedQueue cost=");
            sbLIZ2.append(System.nanoTime() - jNanoTime);
            C792910V8n.LIZ("APM-Slardar", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public final void LIZIZ() {
        this.LIZIZ.position(this.LIZIZ.getInt(14) + 18);
        this.LIZIZ.flip();
        C0VBZ c0vbzLIZ = C0VBZ.LIZ(this.LIZIZ);
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

    public final void LJ() {
        this.LIZIZ.clear();
        this.LIZIZ.putShort((short) 2082);
        this.LIZIZ.putLong(this.LIZ);
        this.LIZIZ.putInt(0);
        this.LIZIZ.putInt(0);
    }

    public C793750VBt(long j) {
        this.LIZ = j;
        LJ();
    }

    public final C793730VBr LIZJ(JSONObject jSONObject) {
        boolean z;
        if (C792420V6q.LJIILL()) {
            int i = C792420V6q.LJIILLIIL.LIZIZ;
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

    public final synchronized void LIZLLL(JSONObject jSONObject) {
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
        int i = c793730VBrLIZJ.LIZIZ + 4;
        if (i > 262144) {
            C0VBB.LIZ(new C0V6S() { // from class: X.0V6U
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
                        jSONObject3.put("type", "large_data");
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
        if (i > this.LIZIZ.remaining()) {
            LIZ();
        }
        this.LIZIZ.putInt(c793730VBrLIZJ.LIZIZ);
        this.LIZIZ.put(c793730VBrLIZJ.LIZ, 0, c793730VBrLIZJ.LIZIZ);
        this.LIZIZ.putInt(10, this.LIZIZ.getInt(10) + 1);
        this.LIZIZ.putInt(14, this.LIZIZ.getInt(14) + i);
        if (C792190V5t.LIZ()) {
            C792910V8n.LIZ("APM-Slardar", C786410Ut5.j4("push success: totalCount=%s, totalBytes=%s, logItem=%s", new Object[]{Integer.valueOf(this.LIZIZ.getInt(10)), Integer.valueOf(this.LIZIZ.getInt(14)), jSONObject}));
        }
        if (this.LIZIZ.position() >= 262134 || this.LIZIZ.getInt(10) >= 256) {
            LIZ();
        }
    }
}
