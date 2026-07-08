package Y;

import X.C1056730dbb;
import X.C1389690mGd;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS1S1310000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() throws org.json.JSONException {
        /*
            r4 = this;
            java.lang.Object r1 = r4.l1
            android.content.Context r1 = (android.content.Context) r1
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r4.l2
            com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod r0 = (com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod) r0
            X.19EG r1 = (X.C19EG) r1
            androidx.fragment.app.DialogFragment r2 = r0.hasOpenedDialogs(r1)
        L12:
            boolean r0 = r4.z4
            r3 = 1
            if (r0 != 0) goto L42
            if (r2 != 0) goto L6f
            java.lang.Object r0 = r4.l1
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r2 = X.C1388190mED.LIZ(r0)
            if (r2 == 0) goto L30
            java.lang.String r1 = r4.s0
            X.0mGx r0 = new X.0mGx
            r0.<init>(r2)
            r0.LJIIJ(r1)
            r0.LJIIJJI()
        L30:
            java.lang.Object r2 = r4.l3
            X.0ce6 r2 = (X.InterfaceC1019840ce6) r2
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "code"
            r1.put(r0, r3)
            r2.LIZIZ(r1)
            return
        L42:
            if (r2 != 0) goto L6f
            java.lang.Object r0 = r4.l1
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r2 = X.C1388190mED.LIZ(r0)
            if (r2 == 0) goto L30
            boolean r0 = r4.z4
            java.lang.String r1 = r4.s0
            if (r0 == 0) goto L63
            X.0mGx r0 = new X.0mGx
            r0.<init>(r2)
            r0.LJIIJ(r1)
            r0.LIZ(r3)
            r0.LJIIJJI()
            goto L30
        L63:
            X.0mGx r0 = new X.0mGx
            r0.<init>(r2)
            r0.LJIIJ(r1)
            r0.LJIIJJI()
            goto L30
        L6f:
            X.0mGx r1 = new X.0mGx
            r1.<init>(r2)
            java.lang.String r0 = r4.s0
            r1.LJIIJ(r0)
            r1.LJIIJJI()
            goto L30
        L7d:
            r2 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S1310000_16.LIZ$0():void");
    }

    public final void LIZ$1() throws JSONException {
        try {
            C1056730dbb.LIZ();
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW((Activity) this.l1);
            String str = this.s0;
            boolean z = this.z4;
            if (str.length() > 0) {
                dialogC1389620mGW.LJJLJLI(str);
            }
            dialogC1389620mGW.LJJLIIJ(z);
            dialogC1389620mGW.setCancelable(false);
            dialogC1389620mGW.setCanceledOnTouchOutside(false);
            dialogC1389620mGW.LJJLL(false);
            C1056730dbb.LIZIZ = dialogC1389620mGW;
            C786410Ut5.J4(dialogC1389620mGW);
            ((C1389690mGd) this.l2).LJFF((Number) this.l3, new JSONObject());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1056730dbb.LIZIZ("loading");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_code", 2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show loading failed: ");
            sbLIZ.append(e.getMessage());
            jSONObject.put("error_msg", C2188811AlT.LIZIZ(sbLIZ));
            ((C1389690mGd) this.l2).LJ((Number) this.l3, jSONObject);
        }
    }

    public static final void run$0(ARunnableS1S1310000_16 aRunnableS1S1310000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ShowToastMethod@7234.handle$1");
        try {
            aRunnableS1S1310000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowToastMethod@7234.handle$1");
    }

    public static final void run$1(ARunnableS1S1310000_16 aRunnableS1S1310000_16) {
        boolean zLIZ;
        C1C7U.LIZ("ShowLoadingMethodNative@70b0.handle$3");
        try {
            aRunnableS1S1310000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShowLoadingMethodNative@70b0.handle$3");
    }

    public ARunnableS1S1310000_16(Object obj, Object obj2, Object obj3, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.z4 = z;
    }
}
