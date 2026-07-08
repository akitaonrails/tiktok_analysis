package X;

import Y.ARunnableS36S1100000_32;
import com.bytedance.android.bcm.impl.config.BcmConfigModel;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS572S0100000_28;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18A2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18A2 {
    public static BcmConfigModel LIZ = new BcmConfigModel();
    public static String LIZIZ = "";
    public static final AtomicInteger LIZJ = new AtomicInteger(0);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C189O());

    public static void LIZ() {
        String strLIZIZ;
        List<String> list;
        JSONObject jSONObject;
        AtomicInteger atomicInteger = LIZJ;
        if (atomicInteger.compareAndSet(0, 1)) {
            C18CK.LIZ("BcmConfig", new C18A4(), false);
            if (atomicInteger.compareAndSet(1, 2)) {
                try {
                    Gson gsonLIZ = C18CS.LIZ();
                    C01GW c01gw = LIZLLL;
                    C18G6 c18g6 = (C18G6) c01gw.getValue();
                    Object objOpt = null;
                    String str = "";
                    BcmConfigModel bcmConfigModel = (BcmConfigModel) gsonLIZ.LJII(c18g6 != null ? c18g6.LIZIZ("BcmConfig", "") : null, BcmConfigModel.class);
                    if (bcmConfigModel == null) {
                        bcmConfigModel = new BcmConfigModel();
                        C18B2 c18b2 = C18B2.LIZ;
                        c18b2.getClass();
                        C18A3 c18a3 = (C18A3) C18B2.LIZLLL.getValue(c18b2, C18B2.LIZIZ[1]);
                        if (c18a3 != null && (jSONObject = c18a3.getDefault()) != null) {
                            objOpt = jSONObject.opt("bcm_in_chain");
                        }
                        if ((objOpt instanceof List) && (list = (List) objOpt) != null) {
                            bcmConfigModel.bcmInChain = list;
                        }
                        C18CK.LIZ("BcmConfig", new C18A7(), false);
                    }
                    LIZ = bcmConfigModel;
                    C18G6 c18g62 = (C18G6) c01gw.getValue();
                    if (c18g62 != null && (strLIZIZ = c18g62.LIZIZ("version", "")) != null) {
                        str = strLIZIZ;
                    }
                    LIZIZ = str;
                    C18CK.LIZ("BcmConfig", new C189N(), false);
                    atomicInteger.set(2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C18CK.LIZ("BcmConfig", new C5182020e(th, 635), false);
                }
            }
            C18B2 c18b22 = C18B2.LIZ;
            c18b22.getClass();
            C18A3 c18a32 = (C18A3) C18B2.LIZLLL.getValue(c18b22, C18B2.LIZIZ[1]);
            if (c18a32 != null) {
                c18a32.LIZ(new InterfaceC1530410pvb() { // from class: X.18A5
                    @Override // X.InterfaceC1530410pvb
                    public final void LIZ(InputStream inputStream, String str2) {
                        C18CK.LIZ("BcmConfig", new AwS572S0100000_28(inputStream, 1093), false);
                        if (inputStream == null) {
                            return;
                        }
                        BtmSDK.INSTANCE.getThreadExecutor().LIZ(new ARunnableS36S1100000_32(inputStream, str2, 8), true);
                    }
                });
            }
        }
    }
}
