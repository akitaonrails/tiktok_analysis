package Y;

import X.C0V19;
import X.C0VV8;
import X.C0VVA;
import X.C1C7U;
import X.C786410Ut5;
import android.content.Intent;
import com.bytedance.common.wschannel.client.AbsWsClientService;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS14S0200100_13 implements Runnable {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (C0VV8 c0vv8 : (LinkedList) this.l0) {
            j += c0vv8.LIZJ - c0vv8.LIZ;
            if (c0vv8.LJFF) {
                i++;
            }
            if (c0vv8.LJ) {
                i2++;
            }
            if (c0vv8.LIZLLL) {
                i3++;
            }
        }
        JSONObject jSONObject = new JSONObject();
        C0VVA c0vva = (C0VVA) this.l1;
        long j2 = this.j2;
        LinkedList linkedList = (LinkedList) this.l0;
        jSONObject.put(Scene.SCENE_SERVICE, c0vva.LIZ);
        jSONObject.put("duration", j2);
        jSONObject.put("block_count", linkedList.size());
        jSONObject.put("block_duration", j);
        jSONObject.put("block_count_on_frame", i);
        jSONObject.put("delay_doFrame_count", i2);
        jSONObject.put("delay_input_count", i3);
        C0VVA c0vva2 = (C0VVA) this.l1;
        synchronized (c0vva2) {
            try {
                LagDataCallback lagDataCallback = c0vva2.LJIIIIZZ;
                if (lagDataCallback != null) {
                    lagDataCallback.onDataAvailable(jSONObject);
                    return;
                }
                C0V19 c0v19LIZJ = C0V19.LIZJ();
                C786410Ut5.LJJZZIII(c0v19LIZJ.LIZLLL(), new ARunnableS113S0100000_13(jSONObject, 264));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void run$0(ARunnableS14S0200100_13 aRunnableS14S0200100_13) {
        boolean zLIZ;
        C1C7U.LIZ("AbsWsClientService@d58f.onStartCommand$1");
        try {
            ((AbsWsClientService) aRunnableS14S0200100_13.l1).handleIntent((Intent) aRunnableS14S0200100_13.l0, aRunnableS14S0200100_13.j2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsWsClientService@d58f.onStartCommand$1");
    }

    public static final void run$1(ARunnableS14S0200100_13 aRunnableS14S0200100_13) {
        boolean zLIZ;
        C1C7U.LIZ("AbsWsClientService@d58f.handleMsg$1");
        try {
            ((AbsWsClientService) aRunnableS14S0200100_13.l1).handleIntent((Intent) aRunnableS14S0200100_13.l0, aRunnableS14S0200100_13.j2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbsWsClientService@d58f.handleMsg$1");
    }

    public static final void run$2(ARunnableS14S0200100_13 aRunnableS14S0200100_13) {
        boolean zLIZ;
        C1C7U.LIZ("CreativeBlockMonitor@8b.handleBlockData$1");
        try {
            aRunnableS14S0200100_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreativeBlockMonitor@8b.handleBlockData$1");
    }

    public ARunnableS14S0200100_13(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.j2 = j;
    }
}
