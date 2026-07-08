package X;

import com.ss.android.ugc.aweme.bridge.JSBAIMigrationMonetizationSettings;
import com.ss.android.ugc.aweme.i18n.abtest.JSBAIMigrationTCPSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0dgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1060000dgs {
    public static final C1060000dgs LIZ = new C1060000dgs();

    public static List LIZ() {
        ArrayList arrayList = new ArrayList();
        if (C1544000qHW.LJIIZILJ) {
            arrayList.add(C1065540dpo.class);
            arrayList.add(C1051040dSQ.class);
            arrayList.add(C09WP.class);
            arrayList.add(C836830WsD.class);
            arrayList.add(C1047390dMX.class);
            arrayList.add(C1060060dgy.class);
            arrayList.add(C1065440dpe.class);
            arrayList.add(C1062720dlG.class);
            arrayList.add(C1059940dgm.class);
            arrayList.add(C1020180cee.class);
            arrayList.add(C1020120ceY.class);
            arrayList.add(C1019680cdq.class);
            arrayList.add(C1062080dkE.class);
            arrayList.add(C1064100dnU.class);
            arrayList.add(C1060010dgt.class);
            arrayList.add(C1018840ccU.class);
        } else {
            JSBAIMigrationTCPSettings.JSBAIMigrationModel jSBAIMigrationModelLIZ = JSBAIMigrationTCPSettings.LIZ();
            if (jSBAIMigrationModelLIZ.enable) {
                if (jSBAIMigrationModelLIZ.openSchema) {
                    arrayList.add(C1065540dpo.class);
                }
                if (jSBAIMigrationModelLIZ.openBrowser) {
                    arrayList.add(C1051040dSQ.class);
                }
                if (jSBAIMigrationModelLIZ.darkMode) {
                    arrayList.add(C09WP.class);
                }
                if (jSBAIMigrationModelLIZ.monitorLog) {
                    arrayList.add(C836830WsD.class);
                }
                if (jSBAIMigrationModelLIZ.getContainerId) {
                    arrayList.add(C1047390dMX.class);
                }
                if (jSBAIMigrationModelLIZ.getNativeItem) {
                    arrayList.add(C1060060dgy.class);
                }
                if (jSBAIMigrationModelLIZ.getABTestParams) {
                    arrayList.add(C1065440dpe.class);
                }
                if (jSBAIMigrationModelLIZ.appSetting) {
                    arrayList.add(C1062720dlG.class);
                }
                if (jSBAIMigrationModelLIZ.openAweme) {
                    arrayList.add(C1059940dgm.class);
                }
            }
            JSBAIMigrationMonetizationSettings.JSBAIMigrationMonetizationModel jSBAIMigrationMonetizationModelLIZ = JSBAIMigrationMonetizationSettings.LIZ();
            if (jSBAIMigrationMonetizationModelLIZ.enable) {
                if (jSBAIMigrationMonetizationModelLIZ.sendThirdTrack) {
                    arrayList.add(C1020180cee.class);
                }
                if (jSBAIMigrationMonetizationModelLIZ.downloadAppClick) {
                    arrayList.add(C1020120ceY.class);
                }
                if (jSBAIMigrationMonetizationModelLIZ.sendAdLog) {
                    arrayList.add(C1019680cdq.class);
                }
                if (jSBAIMigrationMonetizationModelLIZ.sendEMailTo) {
                    arrayList.add(C1062080dkE.class);
                }
                if (jSBAIMigrationMonetizationModelLIZ.launchChat) {
                    arrayList.add(C1064100dnU.class);
                }
                if (jSBAIMigrationMonetizationModelLIZ.setScrollTop) {
                    arrayList.add(C1060010dgt.class);
                }
                if (jSBAIMigrationMonetizationModelLIZ.IBEGetViewSize) {
                    arrayList.add(C1018840ccU.class);
                }
            }
            arrayList.add(C0DPG.class);
        }
        arrayList.add(C632290Or5.class);
        return arrayList;
    }
}
