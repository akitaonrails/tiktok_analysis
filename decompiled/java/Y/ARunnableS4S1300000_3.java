package Y;

import X.C034Y;
import X.C098200Yq;
import X.C1502880pDC;
import X.C189200o6;
import X.C1C7U;
import X.C2124108Tv;
import X.C2124208Tw;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC2106908Nf;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.tts.oecverify.BdTuringConfig;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS120S1200000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS4S1300000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        WeakReference<LynxView> weakReference = C2124108Tv.LLILLL.get(this.s0);
        if (Intrinsics.LJFF(weakReference != null ? weakReference.get() : null, (LynxView) this.l1)) {
            new AwS120S1200000_3(this.s0, (String) this.l3, (C2124208Tw) this.l2, (Map<String, ? extends Object>) 1);
            C034Y.LIZ();
            ((LynxView) this.l1).updateData((Map<String, Object>) this.l2);
        }
    }

    public final void LIZ$1() {
        try {
            new JSONObject(new String(((BdTuringConfig) this.l1).getHttpClient().post(this.s0, (Map) this.l2, C786410Ut5.J3((JSONObject) this.l3).getBytes()), Charsets.UTF_8));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        throw null;
    }

    public final void LIZ$2() {
        InterfaceC2106908Nf interfaceC2106908Nf = (InterfaceC2106908Nf) this.l1;
        Integer num = (Integer) this.l2;
        Throwable th = (Throwable) this.l3;
        String str = this.s0;
        if (th == null) {
            try {
                th = new Throwable(str);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
                return;
            }
        }
        interfaceC2106908Nf.LIZ(num, th);
        C189200o6.m2constructorimpl(Unit.LIZ);
    }

    public final void LIZ$3() {
        String str;
        JSONObject jSONObjectPut;
        String str2 = this.s0;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.l1;
        InterfaceC2106908Nf interfaceC2106908Nf = (InterfaceC2106908Nf) this.l2;
        Integer num = (Integer) this.l3;
        Unit unit = null;
        try {
            try {
                jSONObjectPut = new JSONObject(str2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                JSONObject jSONObject = new JSONObject();
                C1502880pDC.LIZ.getClass();
                if (!linkedHashMap.containsKey("x-tt-logid") || (str = (String) linkedHashMap.get("x-tt-logid")) == null) {
                    str = "";
                }
                jSONObjectPut = jSONObject.put("_Header_RequestID", str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(th.getClass());
                sbLIZ.append(':');
                sbLIZ.append(th.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (strLIZIZ == null || strLIZIZ.length() <= 0) {
                    if (th == null) {
                        if (str2 != null) {
                            new Throwable(strLIZIZ);
                        }
                    }
                    interfaceC2106908Nf.LIZIZ();
                } else {
                    if (th == null) {
                        new Throwable(strLIZIZ);
                    }
                    interfaceC2106908Nf.LIZIZ();
                }
                C189200o6.m2constructorimpl(unit);
            }
            interfaceC2106908Nf.LIZJ(jSONObjectPut, num);
            unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public static final void run$0(ARunnableS4S1300000_3 aRunnableS4S1300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("EcomNativeMultiPrefetchInterceptor@43d9.updateLynxView$1");
        try {
            aRunnableS4S1300000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcomNativeMultiPrefetchInterceptor@43d9.updateLynxView$1");
    }

    public static final void run$1(ARunnableS4S1300000_3 aRunnableS4S1300000_3) {
        C1C7U.LIZ("SmsUtils@6898.checkCode$1");
        try {
            aRunnableS4S1300000_3.LIZ$1();
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C2179971ATj.LIZ(th)) {
                C1C7U.LIZIZ("SmsUtils@6898.checkCode$1");
                return;
            }
            throw th;
        }
    }

    public static final void run$2(ARunnableS4S1300000_3 aRunnableS4S1300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("XBridgeAPIRequestUtils@9ee4.handleError$1");
        try {
            aRunnableS4S1300000_3.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XBridgeAPIRequestUtils@9ee4.handleError$1");
    }

    public static final void run$3(ARunnableS4S1300000_3 aRunnableS4S1300000_3) {
        boolean zLIZ;
        C1C7U.LIZ("XBridgeAPIRequestUtils@9ee4.handleSuccess$1");
        try {
            aRunnableS4S1300000_3.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XBridgeAPIRequestUtils@9ee4.handleSuccess$1");
    }

    public ARunnableS4S1300000_3(Object obj, String str, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
    }

    public ARunnableS4S1300000_3(InterfaceC2106908Nf interfaceC2106908Nf, Integer num, Integer num2, String str, Throwable th, int i) {
        this.$t = i;
        this.l1 = interfaceC2106908Nf;
        this.l2 = num2;
        this.l3 = th;
        this.s0 = str;
    }

    public ARunnableS4S1300000_3(InterfaceC2106908Nf interfaceC2106908Nf, Integer num, Integer num2, String str, LinkedHashMap linkedHashMap, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = linkedHashMap;
        this.l2 = interfaceC2106908Nf;
        this.l3 = num2;
    }
}
