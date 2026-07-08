package Y;

import X.C013C;
import X.C0VSJ;
import X.C1491510our;
import X.C1491570oux;
import X.C1491760ovG;
import X.C1509850pOR;
import X.C1514490pVv;
import X.C1520380pfQ;
import X.C1520570pfj;
import X.C15442062u;
import X.C1553700qXA;
import X.C1C7U;
import X.EnumC1520990pgP;
import X.EnumC1521110pgb;
import com.bytedance.android.monitorV2.debug.MonitorDebugTool;
import com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeClient;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.request.meta.FlashFeatureSetConfig;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS18S0200100_23 implements Runnable {
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

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0ovH] */
    public final void LIZ$0() throws JSONException {
        C1520380pfQ c1520380pfQ = C1520380pfQ.LIZ;
        C1491510our c1491510our = (C1491510our) this.l0;
        c1520380pfQ.getClass();
        String str = c1491510our.LIZIZ;
        String str2 = c1491510our.LIZJ;
        EnumC1521110pgb.Companion.getClass();
        Set setLJIIIZ = C15442062u.LJIIIZ(EnumC1521110pgb.keys$delegate.getValue(), C1514490pVv.LJFF);
        String str3 = c1491510our.LJ;
        C1491510our c1491510our2 = new C1491510our(c1491510our.LJFF, str, str2, str3, setLJIIIZ, !MonitorDebugTool.isDebuggable(), c1491510our.LJI, MonitorDebugTool.isDebuggable());
        try {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            ?? r1 = new SparkTracingNativeClient() { // from class: X.0ovH
                @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeClient
                public final void onPropertyChanged(String str4, String str5, String str6) {
                }

                @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeClient
                public final double getSampleRatio(String str4) {
                    C1520380pfQ.LIZ.getClass();
                    InterfaceC1514780pWO interfaceC1514780pWO = C1520380pfQ.LJIIIZ;
                    if (interfaceC1514780pWO != null) {
                        return interfaceC1514780pWO.getSampleRatio(str4);
                    }
                    return 0.0d;
                }

                @Override // com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeClient
                public final void onEvent(int i, String str4, String str5) {
                    if (i == ((int) EnumC1491420oui.APP_LOG.getNativeValue())) {
                        try {
                            JSONObject jSONObject = new JSONObject(str5);
                            C12868051u.LJIIIZ(jSONObject, C12868051u.LIZJ);
                            InterfaceC1491780ovI interfaceC1491780ovI = C1520380pfQ.LJII;
                            if (interfaceC1491780ovI != null) {
                                interfaceC1491780ovI.LIZ(jSONObject);
                            }
                            C1520570pfj.LIZJ(str4, jSONObject);
                            MonitorDebugTool.pushLatestEvent(str4, jSONObject);
                            C189200o6.m2constructorimpl(null);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
            };
            C1491760ovG c1491760ovG = new C1491760ovG();
            c1491570oux.getClass();
            try {
                C1491570oux.LJIIJJI(c1491510our2, r1, c1491760ovG);
                ((C013C) this.l1).element = true;
                if (EnumC1520990pgP.SparkTracingStat.isEnabled()) {
                    JSONObject jSONObject = new JSONObject();
                    C013C c013c = (C013C) this.l1;
                    long j = this.j2;
                    jSONObject.putOpt("version", 2);
                    jSONObject.putOpt("load_finished", Boolean.valueOf(c013c.element));
                    jSONObject.putOpt("manifest_char_size", Integer.valueOf(str.length()));
                    jSONObject.putOpt("elapse_ms", Long.valueOf(System.currentTimeMillis() - j));
                    C0VSJ c0vsj = new C0VSJ(str3);
                    if (c0vsj.exists()) {
                        jSONObject.putOpt("db_size", Long.valueOf(c0vsj.length()));
                    } else {
                        jSONObject.putOpt("db_size", 0);
                    }
                    C1520570pfj.LIZJ("spark_tracing_load", jSONObject);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    ((C013C) this.l1).element = true;
                    if (EnumC1520990pgP.SparkTracingStat.isEnabled()) {
                        JSONObject jSONObject2 = new JSONObject();
                        C013C c013c2 = (C013C) this.l1;
                        long j2 = this.j2;
                        jSONObject2.putOpt("version", 2);
                        jSONObject2.putOpt("load_finished", Boolean.valueOf(c013c2.element));
                        jSONObject2.putOpt("manifest_char_size", Integer.valueOf(c1491510our2.LIZIZ.length()));
                        jSONObject2.putOpt("elapse_ms", Long.valueOf(System.currentTimeMillis() - j2));
                        C0VSJ c0vsj2 = new C0VSJ(c1491510our2.LJ);
                        if (c0vsj2.exists()) {
                            jSONObject2.putOpt("db_size", Long.valueOf(c0vsj2.length()));
                        } else {
                            jSONObject2.putOpt("db_size", 0);
                        }
                        C1520570pfj.LIZJ("spark_tracing_load", jSONObject2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    ((C013C) this.l1).element = true;
                    if (EnumC1520990pgP.SparkTracingStat.isEnabled()) {
                        JSONObject jSONObject3 = new JSONObject();
                        C013C c013c3 = (C013C) this.l1;
                        long j3 = this.j2;
                        jSONObject3.putOpt("version", 2);
                        jSONObject3.putOpt("load_finished", Boolean.valueOf(c013c3.element));
                        jSONObject3.putOpt("manifest_char_size", Integer.valueOf(c1491510our2.LIZIZ.length()));
                        jSONObject3.putOpt("elapse_ms", Long.valueOf(System.currentTimeMillis() - j3));
                        C0VSJ c0vsj3 = new C0VSJ(c1491510our2.LJ);
                        if (c0vsj3.exists()) {
                            jSONObject3.putOpt("db_size", Long.valueOf(c0vsj3.length()));
                        } else {
                            jSONObject3.putOpt("db_size", 0);
                        }
                        C1520570pfj.LIZJ("spark_tracing_load", jSONObject3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static final void run$0(ARunnableS18S0200100_23 aRunnableS18S0200100_23) {
        boolean zLIZ;
        C1C7U.LIZ("UIThreadGeckoUpdateListener@bac8.onUpdateSuccess$1");
        try {
            ((C1553700qXA) aRunnableS18S0200100_23.l1).LIZ.LJIL(aRunnableS18S0200100_23.j2, (UpdatePackage) aRunnableS18S0200100_23.l0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UIThreadGeckoUpdateListener@bac8.onUpdateSuccess$1");
    }

    public static final void run$1(ARunnableS18S0200100_23 aRunnableS18S0200100_23) {
        boolean zLIZ;
        C1C7U.LIZ("FlashFeatureManager@297e.getFeedPbFeaturesJson$2$1$1$3");
        try {
            C1509850pOR c1509850pOR = C1509850pOR.LIZ;
            FlashFeatureSetConfig flashFeatureSetConfig = (FlashFeatureSetConfig) aRunnableS18S0200100_23.l0;
            String str = flashFeatureSetConfig.paramsKey;
            String str2 = flashFeatureSetConfig.pbKey;
            JSONObject jSONObject = (JSONObject) aRunnableS18S0200100_23.l1;
            long j = aRunnableS18S0200100_23.j2;
            c1509850pOR.getClass();
            C1509850pOR.LIZLLL(str, str2, jSONObject, j);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FlashFeatureManager@297e.getFeedPbFeaturesJson$2$1$1$3");
    }

    public static final void run$2(ARunnableS18S0200100_23 aRunnableS18S0200100_23) {
        boolean zLIZ;
        C1C7U.LIZ("HybridMultiMonitor@a19f.initSparkTracing$1");
        try {
            aRunnableS18S0200100_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HybridMultiMonitor@a19f.initSparkTracing$1");
    }

    public ARunnableS18S0200100_23(Object obj, Object obj2, long j, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
        this.j2 = j;
    }
}
