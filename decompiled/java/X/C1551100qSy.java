package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.settings.IGeckoRegister;
import java.util.Map;

/* JADX INFO: renamed from: X.0qSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551100qSy {
    public static Pair<String, Boolean> LIZ(Context context, GeckoGlobalConfig.ENVType eNVType, IGeckoRegister iGeckoRegister) {
        boolean zContainsKey;
        InterfaceC1551110qSz interfaceC1551110qSz = (InterfaceC1551110qSz) iGeckoRegister.getClass().getAnnotation(InterfaceC1551110qSz.class);
        if (interfaceC1551110qSz == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("gecko register failed,reason:GeckoRegister is invalid.env is ");
            sbLIZ.append(eNVType.name());
            sbLIZ.append(",register class is ");
            sbLIZ.append(iGeckoRegister.getClass().getName());
            C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        String strTestAccessKey = interfaceC1551110qSz.testAccessKey();
        String strBoeAccessKey = interfaceC1551110qSz.boeAccessKey();
        String strProdAccessKey = interfaceC1551110qSz.prodAccessKey();
        int i = C1551090qSx.LIZ[eNVType.ordinal()];
        if (i != 2) {
            if (i == 3) {
                strTestAccessKey = strBoeAccessKey;
            }
        } else {
            strTestAccessKey = strProdAccessKey;
        }
        if (TextUtils.isEmpty(strTestAccessKey)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("gecko register failed,reason:access key is empty.env is ");
            sbLIZ2.append(eNVType.name());
            sbLIZ2.append(",register class is ");
            sbLIZ2.append(iGeckoRegister.getClass().getName());
            C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        Map<String, OptionCheckUpdateParams.CustomValue> mapRegisterCustomParams = iGeckoRegister.registerCustomParams();
        if (mapRegisterCustomParams != null && !mapRegisterCustomParams.isEmpty()) {
            zContainsKey = mapRegisterCustomParams.containsKey("business_version");
            C797990VSb.LIZ.LJIIJ(strTestAccessKey, mapRegisterCustomParams);
        } else {
            zContainsKey = false;
        }
        if (TextUtils.isEmpty(iGeckoRegister.registerRootDir(context))) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("gecko register failed,reason:root dir is empty.env is ");
            sbLIZ3.append(eNVType.name());
            sbLIZ3.append(",register class is ");
            sbLIZ3.append(iGeckoRegister.getClass().getName());
            C1553130qWF.LIZLLL("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            C797990VSb.LIZ.getClass();
        }
        return new Pair<>(strTestAccessKey, Boolean.valueOf(zContainsKey));
    }
}
