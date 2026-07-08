package X;

import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.GetPreloadCartInfoRequest;
import defpackage.EcPdpPreloadCartInfoSettingModel;
import defpackage.o1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04F4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04F4 {
    public static final C10349042x LIZ;
    public static final C04F6 LIZIZ;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.042x] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.04F6] */
    static {
        C01GW c01gw = o1.LIZIZ;
        Integer num = ((EcPdpPreloadCartInfoSettingModel) c01gw.getValue()).cacheSize;
        LIZ = new C098K<String, C04F5>(num != null ? num.intValue() : 50) { // from class: X.042x
        };
        Integer num2 = ((EcPdpPreloadCartInfoSettingModel) c01gw.getValue()).cacheSize;
        final int iIntValue = num2 != null ? num2.intValue() : 50;
        LIZIZ = new C098K<String, C04F8>(iIntValue) { // from class: X.04F6
        };
    }

    public static void LIZ() {
        LIZ.LIZ();
        LIZIZ.LIZ();
    }

    public static GetPreloadCartInfoData LIZJ(String str) {
        C10349042x c10349042x = LIZ;
        C04F5 c04f5LIZIZ = c10349042x.LIZIZ(str);
        if (c04f5LIZIZ != null) {
            if (!c04f5LIZIZ.LIZ()) {
                return c04f5LIZIZ.LIZ;
            }
            c10349042x.LIZLLL(str);
            return null;
        }
        return null;
    }

    public static String LIZLLL(String str) {
        C04F8 c04f8LIZIZ = LIZIZ.LIZIZ(str);
        if (c04f8LIZIZ != null) {
            return c04f8LIZIZ.LIZ;
        }
        return null;
    }

    public static String LIZIZ(Integer num, String str) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(num);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }

    public static void LJ(String str, Integer num, Boolean bool, GetPreloadCartInfoRequest getPreloadCartInfoRequest, InterfaceC497601wk interfaceC497601wk) {
        String strLIZIZ;
        C01GW c01gw = o1.LIZIZ;
        Boolean bool2 = ((EcPdpPreloadCartInfoSettingModel) c01gw.getValue()).enableSwitch;
        int iIntValue = 0;
        if (bool2 == null || !bool2.booleanValue() || (strLIZIZ = LIZIZ(num, str)) == null) {
            return;
        }
        C10349042x c10349042x = LIZ;
        C04F5 c04f5LIZIZ = c10349042x.LIZIZ(strLIZIZ);
        if (c04f5LIZIZ != null) {
            if (!c04f5LIZIZ.LIZ()) {
                return;
            } else {
                c10349042x.LIZLLL(strLIZIZ);
            }
        }
        if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
            Integer num2 = ((EcPdpPreloadCartInfoSettingModel) c01gw.getValue()).singleSkuDelaySec;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 3;
            }
        } else {
            Integer num3 = ((EcPdpPreloadCartInfoSettingModel) c01gw.getValue()).multiSkuDelaySec;
            if (num3 != null) {
                iIntValue = num3.intValue();
            }
        }
        C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C04F3(((long) iIntValue) * 1000, getPreloadCartInfoRequest, strLIZIZ, null), 2);
    }
}
