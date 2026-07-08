package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ab.EcomSlardarReportWhiteList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05D3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05D3 extends C09AY implements Function0<Map<String, ? extends EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem>> {
    public C05D3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem> invoke() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[] ecomSlardarReportWhiteItemArr = EcomSlardarReportWhiteList.LIZ;
        EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[] ecomSlardarReportWhiteItemArr2 = (EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[]) settingsManagerLIZLLL.LJIIIIZZ("ec_slardar_report_whitelist", EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem[].class, ecomSlardarReportWhiteItemArr);
        if (ecomSlardarReportWhiteItemArr2 != null) {
            ecomSlardarReportWhiteItemArr = ecomSlardarReportWhiteItemArr2;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(ecomSlardarReportWhiteItemArr.length);
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (EcomSlardarReportWhiteList.EcomSlardarReportWhiteItem ecomSlardarReportWhiteItem : ecomSlardarReportWhiteItemArr) {
            linkedHashMap.put(ecomSlardarReportWhiteItem.name, ecomSlardarReportWhiteItem);
        }
        return linkedHashMap;
    }
}
