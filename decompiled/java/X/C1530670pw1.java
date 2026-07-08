package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530670pw1 {
    public static final C1530670pw1 LIZ = new C1530670pw1();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public static volatile InterfaceC830890Wid LJFF;
    public static volatile C1530690pw3 LJI;

    public static void LIZ() {
        if (LJFF != null) {
            return;
        }
        if (!(LIZLLL.get() && LJ.get() >= 1)) {
            if (LIZIZ.compareAndSet(false, true)) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("pipo_ssp_prewarm_android", null, null, new AbstractC830880Wic() { // from class: X.0pw0
                    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
                    @Override // X.AbstractC830880Wic
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.InterfaceC805220ViK r18, X.InterfaceC830890Wid r19) throws org.json.JSONException {
                        /*
                            Method dump skipped, instruction units count: 545
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1530660pw0.LIZ(X.0ViK, X.0Wid):void");
                    }

                    @Override // X.AbstractC830880Wic
                    public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                        C1530690pw3 c1530690pw3;
                        C1530670pw1.LIZIZ.set(false);
                        if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                            C1530670pw1.LJFF = interfaceC830890Wid;
                            C1530670pw1.LIZJ.set(false);
                            C1530670pw1.LJ.set(0);
                            C1530690pw3 c1530690pw32 = C1530670pw1.LJI;
                            if (c1530690pw32 != null) {
                                TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1530690pw32);
                                C1530670pw1.LJI = null;
                                return;
                            }
                            return;
                        }
                        C1530670pw1.LIZJ.set(false);
                        if (!C1530670pw1.LIZLLL.get() || C1530670pw1.LJ.incrementAndGet() < 1 || (c1530690pw3 = C1530670pw1.LJI) == null) {
                            return;
                        }
                        TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1530690pw3);
                        C1530670pw1.LJI = null;
                    }
                });
                return;
            } else {
                LIZJ.set(true);
                return;
            }
        }
        C1530690pw3 c1530690pw3 = LJI;
        if (c1530690pw3 != null) {
            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(c1530690pw3);
            LJI = null;
        }
    }

    public static C1530640pvy LIZJ(JSONObject jSONObject) {
        String string = a0.LJLIIIL(jSONObject.optString("url")).toString();
        if (!(!a0.LJJJIL(string)) || string == null) {
            return null;
        }
        String string2 = a0.LJLIIIL(jSONObject.optString("biz_id")).toString();
        if (!(!a0.LJJJIL(string2)) || string2 == null) {
            return null;
        }
        return new C1530640pvy(string, string2);
    }

    public static String LIZIZ(String str, Map map) {
        Object obj = map.get(str);
        if (obj == null) {
            return null;
        }
        String string = a0.LJLIIIL(obj.toString()).toString();
        if (!(!a0.LJJJIL(string)) || Intrinsics.LJFF(string, "null")) {
            return null;
        }
        return string;
    }
}
