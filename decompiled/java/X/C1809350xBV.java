package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xBV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809350xBV extends AbstractC1798780wuS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        String url;
        InterfaceC1798810wuV interfaceC1798810wuV = (InterfaceC1798810wuV) xBaseParamModel;
        String roomId = interfaceC1798810wuV.getRoomId();
        Number action = interfaceC1798810wuV.getAction();
        if (Intrinsics.LJFF(action, 1)) {
            C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
            Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
            mapLIZIZ.put(roomId, "");
            c20337914i1.LJFF(mapLIZIZ);
        } else if (Intrinsics.LJFF(action, 2)) {
            C20337914i1<Map<String, String>> c20337914i12 = InterfaceC1833600xoc.ya;
            Map<String, String> mapLIZIZ2 = c20337914i12.LIZIZ();
            mapLIZIZ2.remove(roomId);
            c20337914i12.LJFF(mapLIZIZ2);
        } else if (Intrinsics.LJFF(action, 3)) {
            C20337914i1<Map<String, String>> c20337914i13 = InterfaceC1833600xoc.ya;
            Map<String, String> mapLIZIZ3 = c20337914i13.LIZIZ();
            mapLIZIZ3.remove(roomId);
            c20337914i13.LJFF(mapLIZIZ3);
            C1834710xqP c1834710xqPLIZJ = C1834710xqP.LIZJ();
            String roomId2 = interfaceC1798810wuV.getRoomId();
            c1834710xqPLIZJ.getClass();
            C1836420xtA.LJFF().getClass();
            DownloadInfo downloadInfoLIZLLL = C1836420xtA.LIZLLL(roomId2);
            C1834710xqP c1834710xqPLIZJ2 = C1834710xqP.LIZJ();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                activityLIZLLL = interfaceC634840OvC.LIZLLL();
            } else {
                activityLIZLLL = null;
            }
            if (downloadInfoLIZLLL != null) {
                url = downloadInfoLIZLLL.getUrl();
            } else {
                url = null;
            }
            String roomId3 = interfaceC1798810wuV.getRoomId();
            c1834710xqPLIZJ2.getClass();
            C1834710xqP.LJI(activityLIZLLL, 1, url, roomId3, null);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1798790wuT.class, null), "");
    }
}
