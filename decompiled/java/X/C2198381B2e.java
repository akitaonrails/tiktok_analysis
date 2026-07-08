package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1B2e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2198381B2e implements InterfaceC2373609Ru {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ RunnableC2198371B2d LIZJ;

    public final void LIZ(String str) {
        Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("is_pet", Boolean.valueOf(this.LIZIZ))};
        HashMap map = new HashMap(1);
        Map.Entry entry = entryArr[0];
        Object key = entry.getKey();
        Objects.requireNonNull(key);
        Object value = entry.getValue();
        Objects.requireNonNull(value);
        if (map.put(key, value) == null) {
            C793770VBv.LJIIJ("seclink_verify_error_rate", 1, new JSONObject(Collections.unmodifiableMap(map)), null, null);
            this.LIZJ.getClass();
            AbstractC2198351B2b.LIZLLL(str);
        } else {
            throw new IllegalArgumentException("duplicate key: " + key);
        }
    }

    public final void LIZIZ(String str) {
        C1B2U c1b2uLJFF;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZ;
        RunnableC2198371B2d runnableC2198371B2d = this.LIZJ;
        boolean z = this.LIZIZ;
        runnableC2198371B2d.getClass();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("is_pet", z);
            jSONObject2.put("latency", jCurrentTimeMillis);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C793770VBv.LJII("seclink_latency_event", jSONObject, jSONObject2, null);
        try {
            if (this.LIZIZ) {
                this.LIZJ.getClass();
                c1b2uLJFF = AbstractC2198351B2b.LJ(str);
            } else {
                this.LIZJ.getClass();
                c1b2uLJFF = AbstractC2198351B2b.LJFF(str);
            }
            if (!C2198391B2f.LIZ().LIZIZ || !C2198391B2f.LIZ().LIZJ) {
                this.LIZJ.LJII(c1b2uLJFF);
            } else {
                if (this.LIZIZ) {
                    this.LIZJ.LLILZIL = true;
                    this.LIZJ.LLILLL = c1b2uLJFF;
                    this.LIZJ.LJII(c1b2uLJFF);
                } else {
                    this.LIZJ.LLILZ = true;
                    this.LIZJ.LLILLJJLI = c1b2uLJFF;
                }
                if (this.LIZJ.LLILZ && this.LIZJ.LLILZIL) {
                    RunnableC2198371B2d runnableC2198371B2d2 = this.LIZJ;
                    runnableC2198371B2d2.LIZ(runnableC2198371B2d2.LLILLJJLI, this.LIZJ.LLILLL);
                }
            }
            C793770VBv.LJIIJ("seclink_verify_error_rate", 0, new JSONObject(C2351109Jd.LIZ(Boolean.valueOf(this.LIZIZ))), null, null);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            Map.Entry[] entryArr = {new AbstractMap.SimpleEntry("is_pet", Boolean.valueOf(this.LIZIZ))};
            HashMap map = new HashMap(1);
            Map.Entry entry = entryArr[0];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) == null) {
                C793770VBv.LJIIJ("seclink_verify_error_rate", 1, new JSONObject(Collections.unmodifiableMap(map)), null, null);
                RunnableC2198371B2d runnableC2198371B2d3 = this.LIZJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("source:  ");
                sbLIZ.append(str);
                sbLIZ.append("  case : ");
                sbLIZ.append(e2.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                runnableC2198371B2d3.getClass();
                AbstractC2198351B2b.LIZLLL(strLIZIZ);
                return;
            }
            throw new IllegalArgumentException("duplicate key: " + key);
        }
    }

    public C2198381B2e(RunnableC2198371B2d runnableC2198371B2d, long j, boolean z) {
        this.LIZJ = runnableC2198371B2d;
        this.LIZ = j;
        this.LIZIZ = z;
    }
}
