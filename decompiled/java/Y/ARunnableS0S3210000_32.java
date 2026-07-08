package Y;

import X.C1701450uNT;
import X.C189200o6;
import X.C1C7U;
import X.C2188811AlT;
import X.C23260099m;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.IJsFunction;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS0S3210000_32 implements Runnable {
    public final int $t;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;
    public String s2;
    public boolean z5;

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

    public final void LIZ$0() {
        String strCheckRouteV2 = this.z5 ? ((IJsFunction) ((JsWorkerWrapper) this.l3).LIZ.getJavaScriptModule(IJsFunction.class)).checkRouteV2(this.s0, this.s1) : ((IJsFunction) ((JsWorkerWrapper) this.l3).LIZ.getJavaScriptModule(IJsFunction.class)).checkRoute(this.s0, this.s1);
        C1701450uNT c1701450uNT = C1701450uNT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("js func finished, newFlow=");
        sbLIZ.append(this.z5);
        sbLIZ.append(", scene:");
        sbLIZ.append(this.s2);
        sbLIZ.append(",result:");
        sbLIZ.append(strCheckRouteV2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1701450uNT.LIZ(c1701450uNT, "jsWorkerWrapper", 4);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) this.l4;
        C189200o6.m2constructorimpl(strCheckRouteV2);
        interfaceC1364105Vn.resumeWith(strCheckRouteV2);
    }

    public final void LIZ$1() {
        String strCheckApiV2 = this.z5 ? ((IJsFunction) ((JsWorkerWrapper) this.l3).LIZ.getJavaScriptModule(IJsFunction.class)).checkApiV2(this.s0, this.s1) : ((IJsFunction) ((JsWorkerWrapper) this.l3).LIZ.getJavaScriptModule(IJsFunction.class)).checkApi(this.s0, this.s1);
        C1701450uNT c1701450uNT = C1701450uNT.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("js func finished, newFlow=");
        sbLIZ.append(this.z5);
        sbLIZ.append(", scene:");
        sbLIZ.append(this.s2);
        sbLIZ.append(",result:");
        sbLIZ.append(strCheckApiV2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1701450uNT.LIZ(c1701450uNT, "jsWorkerWrapper", 4);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) this.l4;
        C189200o6.m2constructorimpl(strCheckApiV2);
        interfaceC1364105Vn.resumeWith(strCheckApiV2);
    }

    public static final void run$0(ARunnableS0S3210000_32 aRunnableS0S3210000_32) {
        boolean zLIZ;
        C1C7U.LIZ("JsWorkerWrapper@d23d.executeJavaScriptFunc$2$1");
        try {
            aRunnableS0S3210000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsWorkerWrapper@d23d.executeJavaScriptFunc$2$1");
    }

    public static final void run$1(ARunnableS0S3210000_32 aRunnableS0S3210000_32) {
        boolean zLIZ;
        C1C7U.LIZ("JsWorkerWrapper@d23d.executeJavaScriptFunc$2$2");
        try {
            aRunnableS0S3210000_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("JsWorkerWrapper@d23d.executeJavaScriptFunc$2$2");
    }

    public ARunnableS0S3210000_32(boolean z, JsWorkerWrapper jsWorkerWrapper, String str, String str2, String str3, C23260099m c23260099m, int i) {
        this.$t = i;
        this.z5 = z;
        this.l3 = jsWorkerWrapper;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.l4 = c23260099m;
    }
}
