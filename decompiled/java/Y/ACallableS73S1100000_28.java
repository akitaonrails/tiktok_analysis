package Y;

import X.C15O7;
import X.C1619720sFe;
import X.C1897790zU9;
import X.C1911640zqU;
import X.C1C7U;
import X.C2188811AlT;
import X.C2344809Gs;
import X.DialogC1897810zUB;
import X.InterfaceC1201180hMa;
import X.InterfaceC1897260zTI;
import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.PopupReportModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.services.edit.PromoteReplaceMusicRequest;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public class ACallableS73S1100000_28 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS73S1100000_28 aCallableS73S1100000_28) throws Throwable {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS73S1100000_28.l1;
        String str = aCallableS73S1100000_28.s0;
        String str2 = ScanQRCodeActivityV2._pnsPageId;
        scanQRCodeActivityV2.getClass();
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.lambda$onChooseAvatarSuccess$9$1L");
        scanQRCodeActivityV2.LLLLZLLLI(str);
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.lambda$onChooseAvatarSuccess$9$1L");
        return null;
    }

    public static final Object call$1(ACallableS73S1100000_28 aCallableS73S1100000_28) throws Throwable {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) aCallableS73S1100000_28.l1;
        String str = aCallableS73S1100000_28.s0;
        String str2 = ScanQRCodeActivityV2._pnsPageId;
        scanQRCodeActivityV2.getClass();
        C1C7U.LIZ("ScanQRCodeActivityV2@7250.onChooseAvatarSuccess$1L");
        scanQRCodeActivityV2.LLLLZLLLI(str);
        C1C7U.LIZIZ("ScanQRCodeActivityV2@7250.onChooseAvatarSuccess$1L");
        return null;
    }

    public static final Object call$2(ACallableS73S1100000_28 aCallableS73S1100000_28) {
        DynamicDialog dynamicDialog;
        String str;
        String str2;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("SpecActPopupManager@5030.postClickEvent$1");
        String str3 = aCallableS73S1100000_28.s0;
        DynamicDialog dynamicDialog2 = (DynamicDialog) aCallableS73S1100000_28.l1;
        if (dynamicDialog2 == null) {
            dynamicDialog = C1897790zU9.LLIZ;
        } else {
            dynamicDialog = dynamicDialog2;
        }
        C15O7<Object> c15o7PostPopupEvent = null;
        if (dynamicDialog != null) {
            str = dynamicDialog.popId;
        } else {
            str = null;
        }
        if (dynamicDialog2 == null && (dynamicDialog2 = C1897790zU9.LLIZ) == null) {
            str2 = null;
        } else {
            str2 = dynamicDialog2.name;
        }
        PopupReportModel popupReportModel = new PopupReportModel(str3, str, str2);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            c15o7PostPopupEvent = iNetworkApiLIZJ.postPopupEvent(popupReportModel);
        }
        C1C7U.LIZIZ("SpecActPopupManager@5030.postClickEvent$1");
        return c15o7PostPopupEvent;
    }

    public static final Object call$3(ACallableS73S1100000_28 aCallableS73S1100000_28) {
        C15O7<Object> c15o7PostPopupEvent;
        INetworkApi iNetworkApiLIZJ;
        C1C7U.LIZ("SparkDialog@5f0e.postClickEvent$1");
        String str = aCallableS73S1100000_28.s0;
        DynamicDialog dynamicDialog = ((DialogC1897810zUB) aCallableS73S1100000_28.l1).LLJI;
        PopupReportModel popupReportModel = new PopupReportModel(str, dynamicDialog.popId, dynamicDialog.name);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
            c15o7PostPopupEvent = iNetworkApiLIZJ.postPopupEvent(popupReportModel);
        } else {
            c15o7PostPopupEvent = null;
        }
        C1C7U.LIZIZ("SparkDialog@5f0e.postClickEvent$1");
        return c15o7PostPopupEvent;
    }

    public static final Object call$4(ACallableS73S1100000_28 aCallableS73S1100000_28) {
        C1C7U.LIZ("PromoteReplaceMusicManager@8b4f.saveDataToLocal$1");
        try {
            Keva keva = C1911640zqU.LJFF;
            keva.storeString("promote_replace_music_map_key", InterfaceC1201180hMa.LJLLLL.LJIILLIIL((Map) aCallableS73S1100000_28.l1, new TypeToken<Map<String, PromoteReplaceMusicRequest>>() { // from class: X.0zqX
            }.getType()));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (aCallableS73S1100000_28.s0 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aCallableS73S1100000_28.s0);
                sbLIZ.append("_promote_replace_music_request_sava_time");
                keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" PromoteReplaceMusic saveData Exception: ");
            sbLIZ2.append(e);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            C2344809Gs.LJI(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PromoteReplaceMusicManager@8b4f.saveDataToLocal$1");
        return unit;
    }

    public ACallableS73S1100000_28(Object obj, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
    }
}
