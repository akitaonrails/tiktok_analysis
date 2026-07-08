package Y;

import X.C14W5;
import X.C14W6;
import X.C1C7U;
import X.InterfaceC20273014Ue;
import com.bytedance.ies.xbridge.base.runtime.depend.IChooseMediaResultCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class ARunnableS7S1101000_30 implements Runnable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public final void LIZ$0() {
        C14W5 c14w5 = ((C14W6) this.l1).LLILZLL;
        int i = this.i2;
        String str = this.s0;
        c14w5.LL.LLILLJJLI.LIZ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            jSONObject.put("data", new JSONArray());
            c14w5.LLILLJJLI.LIZ(c14w5.LLILLL, jSONObject);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            c14w5.LLILLJJLI.LIZ(c14w5.LLILLL, null);
        }
    }

    public static final void run$0(ARunnableS7S1101000_30 aRunnableS7S1101000_30) {
        boolean zLIZ;
        C1C7U.LIZ("H5FileSelectionMethod@a3f9.<init>$1$onFailed$1");
        try {
            aRunnableS7S1101000_30.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("H5FileSelectionMethod@a3f9.<init>$1$onFailed$1");
    }

    public static final void run$1(ARunnableS7S1101000_30 aRunnableS7S1101000_30) {
        boolean zLIZ;
        C1C7U.LIZ("XHostMediaDependImpl@223b.handleJsInvoke$1$onFailed$1");
        try {
            ((IChooseMediaResultCallback) aRunnableS7S1101000_30.l1).onFailure(aRunnableS7S1101000_30.i2, aRunnableS7S1101000_30.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XHostMediaDependImpl@223b.handleJsInvoke$1$onFailed$1");
    }

    public static final void run$2(ARunnableS7S1101000_30 aRunnableS7S1101000_30) {
        boolean zLIZ;
        C1C7U.LIZ("BDXHostMediaDependImpl@474.handleJsInvoke$1$onFailed$1");
        try {
            ((InterfaceC20273014Ue) aRunnableS7S1101000_30.l1).onFailure(aRunnableS7S1101000_30.i2, aRunnableS7S1101000_30.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BDXHostMediaDependImpl@474.handleJsInvoke$1$onFailed$1");
    }

    public ARunnableS7S1101000_30(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
