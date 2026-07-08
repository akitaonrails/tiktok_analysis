package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pnq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class RunnableC1525600pnq implements Runnable {
    public final /* synthetic */ C0WYW LL;
    public final /* synthetic */ C1525590pnp LLILLJJLI;
    public final /* synthetic */ C1525630pnt LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Object[] LLILZIL;

    public /* synthetic */ RunnableC1525600pnq(C0WYW c0wyw, C1525590pnp c1525590pnp, C1525630pnt c1525630pnt, int i, Object[] objArr) {
        this.LL = c0wyw;
        this.LLILLJJLI = c1525590pnp;
        this.LLILLL = c1525630pnt;
        this.LLILZ = i;
        this.LLILZIL = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        C0WYW c0wyw = this.LL;
        C1525590pnp c1525590pnp = this.LLILLJJLI;
        C1525630pnt c1525630pnt = this.LLILLL;
        int i = this.LLILZ;
        Object[] objArr = this.LLILZIL;
        C1C7U.LIZ("MsgNotifierV4@3e15.asyncNotify$1L");
        if (c0wyw == null) {
            c1525590pnp.getClass();
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI("asyncNotify syncLog is null !!!", "[MsgNotifierV4] "));
        } else {
            long j = c0wyw.LJI;
            c1525590pnp.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_consuming", System.currentTimeMillis() - c1525630pnt.LIZJ);
            jSONObject.put("submit_cnt", i);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("business", j);
            jSONObject2.put("pipeline", "submit");
            C1526300poy.LIZ("sync_sdk_pipeline", jSONObject2, jSONObject, null);
            int i2 = 0;
            C1525590pnp.LIZLLL(0, Collections.singletonList(c0wyw));
            long j2 = c0wyw.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[MsgNotifierV4] ");
            sbLIZ.append("notify ->>>>>> business=");
            sbLIZ.append(j2);
            sbLIZ.append(", data=");
            sbLIZ.append(c1525630pnt);
            sbLIZ.append(" to ");
            sbLIZ.append(objArr);
            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            int length = objArr.length;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                try {
                    ((InterfaceC596980NbE) obj).LJ(c1525630pnt);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c1525590pnp.LL.getClass();
                    InterfaceC1526950pq1 interfaceC1526950pq1LIZJ = C1526710ppd.LIZJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("crash when dispatch to business ");
                    sbLIZ2.append(j2);
                    sbLIZ2.append(", listener = ");
                    sbLIZ2.append(obj);
                    interfaceC1526950pq1LIZJ.ensureNotReachHere(th, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
        C1C7U.LIZIZ("MsgNotifierV4@3e15.asyncNotify$1L");
    }
}
