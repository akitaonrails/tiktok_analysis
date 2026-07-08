package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushUserGuidePopupManager;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19208710Cv {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(715));

    public static final UnifiedAuthPopupConfig LIZ() {
        return (UnifiedAuthPopupConfig) LIZ.getValue();
    }

    public static final boolean LIZJ() {
        PopupInstanceConfig popupInstanceConfig;
        List<PopupInstanceConfig> list = LIZ().popupInstances;
        if (!(list == null || list.isEmpty()) && LIZ().currentIndex >= 0) {
            int i = LIZ().currentIndex;
            List<PopupInstanceConfig> list2 = LIZ().popupInstances;
            if (i < (list2 != null ? list2.size() : 0)) {
                List<PopupInstanceConfig> list3 = LIZ().popupInstances;
                if (list3 != null && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list3, LIZ().currentIndex)) != null) {
                    obj = popupInstanceConfig.panelId;
                }
                return Intrinsics.LJFF(obj, "inbox_tab_sms");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index out of index_out_of_boundaries. config.popupInstances.size: ");
        List<PopupInstanceConfig> list4 = LIZ().popupInstances;
        sbLIZ.append(list4 != null ? Integer.valueOf(list4.size()) : null);
        sbLIZ.append(", config.currentIndex: ");
        sbLIZ.append(LIZ().currentIndex);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    public static final boolean LIZLLL() {
        PopupInstanceConfig popupInstanceConfig;
        List<PopupInstanceConfig> list = LIZ().popupInstances;
        if (!(list == null || list.isEmpty()) && LIZ().currentIndex >= 0) {
            int i = LIZ().currentIndex;
            List<PopupInstanceConfig> list2 = LIZ().popupInstances;
            if (i < (list2 != null ? list2.size() : 0)) {
                List<PopupInstanceConfig> list3 = LIZ().popupInstances;
                if (list3 != null && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list3, LIZ().currentIndex)) != null) {
                    obj = popupInstanceConfig.panelId;
                }
                return Intrinsics.LJFF(obj, "inbox_tab_edm_subscribe");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index out of index_out_of_boundaries. config.popupInstances.size: ");
        List<PopupInstanceConfig> list4 = LIZ().popupInstances;
        sbLIZ.append(list4 != null ? Integer.valueOf(list4.size()) : null);
        sbLIZ.append(", config.currentIndex: ");
        sbLIZ.append(LIZ().currentIndex);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    public static final boolean LJ() {
        List<PopupInstanceConfig> list = LIZ().popupInstances;
        if (!(list == null || list.isEmpty()) && LIZ().currentIndex >= 0) {
            int i = LIZ().currentIndex;
            List<PopupInstanceConfig> list2 = LIZ().popupInstances;
            if (i < (list2 != null ? list2.size() : 0)) {
                List<PopupInstanceConfig> list3 = LIZ().popupInstances;
                if (list3 != null && (!list3.isEmpty()) && LIZ().currentIndex < list3.size() && ListProtector.get(list3, LIZ().currentIndex) != null) {
                    PushUserGuidePopupManager pushUserGuidePopupManager = PushUserGuidePopupManager.LIZ;
                    UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZ = LIZ();
                    pushUserGuidePopupManager.getClass();
                    if (!PushUserGuidePopupManager.LJIIJJI(unifiedAuthPopupConfigLIZ)) {
                        UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZ2 = LIZ();
                        unifiedAuthPopupConfigLIZ2.setCurrentIndex(unifiedAuthPopupConfigLIZ2.currentIndex + 1);
                        return LJ();
                    }
                }
                return true;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index out of index_out_of_boundaries. config.popupInstances.size: ");
        List<PopupInstanceConfig> list4 = LIZ().popupInstances;
        sbLIZ.append(list4 != null ? Integer.valueOf(list4.size()) : null);
        sbLIZ.append(", config.currentIndex: ");
        sbLIZ.append(LIZ().currentIndex);
        C2188811AlT.LIZIZ(sbLIZ);
        return false;
    }

    public static final boolean LIZIZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1115322549) {
            if (iHashCode != -1115308810) {
                if (iHashCode == 1517944150 && str.equals("inbox_tab_edm_subscribe")) {
                    return true;
                }
                return false;
            }
            if (str.equals("inbox_tab_sms")) {
                return true;
            }
            return false;
        }
        if (str.equals("inbox_tab_edm")) {
            return true;
        }
        return false;
    }
}
