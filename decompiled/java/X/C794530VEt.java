package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794530VEt extends AbstractC794540VEu {
    public final List<JSONObject> LJ;
    public final List<String> LJFF;
    public final AtomicBoolean LJI;

    public C794530VEt(C794620VFc c794620VFc) {
        super(c794620VFc);
        this.LJ = new CopyOnWriteArrayList();
        this.LJFF = new CopyOnWriteArrayList();
        this.LJI = new AtomicBoolean(false);
    }

    @Override // X.AbstractC794540VEu
    public final void LIZIZ(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null) {
            return;
        }
        if (this.LJI.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(jSONObject);
            sbLIZ.append(" is end after Trace finish not Trace not being !!!!!, it will be ignore!!!!");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        try {
            C793550VAz c793550VAz = C793550VAz.LIZJ;
            C794620VFc c794620VFc = this.LIZJ;
            if (!c793550VAz.LIZ(c794620VFc.LIZ, c794620VFc.LJFF) && !this.LIZJ.LJFF && C792750V7x.LIZIZ().LL && C792750V7x.LIZIZ().LIZJ(this.LIZJ.LIZ, z) == 0) {
                return;
            }
            LIZJ(jSONObject, z);
            if (!((CopyOnWriteArrayList) this.LJFF).contains(str)) {
                ((CopyOnWriteArrayList) this.LJ).add(jSONObject);
                ((CopyOnWriteArrayList) this.LJFF).add(str);
            } else {
                ((CopyOnWriteArrayList) this.LJ).set(((CopyOnWriteArrayList) this.LJFF).indexOf(str), jSONObject);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
