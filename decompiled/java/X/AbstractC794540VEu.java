package X;

import android.os.Process;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC794540VEu {
    public long LIZ;
    public final C794620VFc LIZJ;
    public final Map<String, String> LIZIZ = new ConcurrentHashMap();
    public final List<String> LIZLLL = new CopyOnWriteArrayList();

    public abstract void LIZIZ(JSONObject jSONObject, String str, boolean z);

    public final void LIZ() {
        if (C792400V6o.LJIIIIZZ()) {
            for (String str : (CopyOnWriteArrayList) this.LIZLLL) {
                if (((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("span's tag key can't be same as trace's tag key: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Process.killProcess(Process.myPid());
                }
            }
        }
    }

    public AbstractC794540VEu(C794620VFc c794620VFc) {
        this.LIZJ = c794620VFc;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(org.json.JSONObject r6, boolean r7) throws org.json.JSONException {
        /*
            r5 = this;
            X.0VFc r0 = r5.LIZJ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "service"
            r6.put(r0, r1)
            X.0VFc r0 = r5.LIZJ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "trace_id"
            r6.put(r0, r1)
            X.0VFc r0 = r5.LIZJ
            boolean r0 = r0.LJFF
            r4 = 1
            if (r0 == 0) goto L2c
            r2 = 1
        L1b:
            X.0VFc r0 = r5.LIZJ
            boolean r1 = r0.LJFF
            java.lang.String r3 = "sample_rate"
            java.lang.String r0 = "hit_rules"
            if (r1 == 0) goto L39
            r6.put(r0, r2)
            r6.put(r3, r4)
            return
        L2c:
            X.0V7x r1 = X.C792750V7x.LIZIZ()
            X.0VFc r0 = r5.LIZJ
            java.lang.String r0 = r0.LIZ
            byte r2 = r1.LIZJ(r0, r7)
            goto L1b
        L39:
            r6.put(r0, r2)
            X.0V7x r2 = X.C792750V7x.LIZIZ()
            X.0VFc r0 = r5.LIZJ
            java.lang.String r1 = r0.LIZ
            org.json.JSONObject r0 = r2.LLILLL
            if (r0 == 0) goto L52
            double r1 = r0.optDouble(r1)
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L54
        L52:
            r1 = 0
        L54:
            r6.put(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC794540VEu.LIZJ(org.json.JSONObject, boolean):void");
    }
}
