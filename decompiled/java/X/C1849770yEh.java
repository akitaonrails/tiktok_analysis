package X;

import Y.AfS182S0100000_13;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0yEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849770yEh {
    public static volatile boolean LIZ;

    public static void LIZ(Context context) {
        C11NZ<Boolean> c11nzLIZLLL;
        if (LIZ) {
            return;
        }
        LIZ = true;
        if (C1849840yEo.LIZIZ(context).length != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("widget_size", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("widget_kind", "IncentiveWidget");
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("launch_widget_subinfo", linkedHashMap);
            }
        }
        C1849780yEi c1849780yEi = (C1849780yEi) C1619720sFe.LIZ.LIZ(LSPassThroughRecordSizeConfig.DEFAULT);
        if (c1849780yEi != null && (c11nzLIZLLL = c1849780yEi.LIZLLL()) != null) {
            c11nzLIZLLL.LJJLJLI(new AfS182S0100000_13(context, 74));
        }
    }
}
