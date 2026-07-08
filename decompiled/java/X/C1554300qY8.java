package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.container.SparkThirdActivity;
import com.bytedance.hybrid.spark.third.container.SparkThirdPopUp;
import com.bytedance.hybrid.spark.third.router.SeclinkConfig;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.router.monitor.RouterPageMonitor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qY8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1554300qY8 {
    public static C1BHO LIZ;

    public static C1BHX LIZ(Context context, SparkThirdContext sparkThirdContext) {
        int i;
        boolean z;
        ThirdPartyBizCert thirdPartyBizCert = sparkThirdContext.bizCert;
        int i2 = 0;
        if (thirdPartyBizCert != null) {
            i = thirdPartyBizCert.dataflowId;
        } else {
            i = 0;
        }
        String str = sparkThirdContext.url;
        EnumC822170WNb enumC822170WNb = EnumC822170WNb.SparkThird;
        C829960Wh8 c829960Wh8 = SeclinkConfig.Companion;
        SeclinkConfig seclinkConfig = sparkThirdContext.seclinkConfig;
        c829960Wh8.getClass();
        C821850WLv c821850WLvLIZIZ = C828340WeW.LIZIZ(i, str, enumC822170WNb, context, C829960Wh8.LIZ(seclinkConfig));
        C829960Wh8.LIZIZ(c821850WLvLIZIZ, sparkThirdContext);
        if (c821850WLvLIZIZ != null) {
            z = c821850WLvLIZIZ.LIZ;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        C1BHX c1bhx = new C1BHX(context, null, 6);
        ThirdPartyBizCert thirdPartyBizCert2 = sparkThirdContext.bizCert;
        if (thirdPartyBizCert2 != null) {
            i2 = thirdPartyBizCert2.dataflowId;
        }
        C828340WeW.LIZ(i2, sparkThirdContext.url, enumC822170WNb, context);
        return c1bhx;
    }

    public static void LIZIZ(Context context, SparkThirdContext sparkThirdContext) {
        int i;
        ThirdPartyBizCert thirdPartyBizCert = sparkThirdContext.bizCert;
        int i2 = 0;
        if (thirdPartyBizCert != null) {
            i = thirdPartyBizCert.dataflowId;
        } else {
            i = 0;
        }
        String str = sparkThirdContext.url;
        EnumC822170WNb enumC822170WNb = EnumC822170WNb.SparkThird;
        C829960Wh8 c829960Wh8 = SeclinkConfig.Companion;
        SeclinkConfig seclinkConfig = sparkThirdContext.seclinkConfig;
        c829960Wh8.getClass();
        C821850WLv c821850WLvLIZIZ = C828340WeW.LIZIZ(i, str, enumC822170WNb, context, C829960Wh8.LIZ(seclinkConfig));
        C829960Wh8.LIZIZ(c821850WLvLIZIZ, sparkThirdContext);
        if (c821850WLvLIZIZ != null && c821850WLvLIZIZ.LIZ) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) SparkThirdActivity.class);
        intent.putExtra("ContainerId", sparkThirdContext.containerId);
        intent.setFlags(268435456);
        C1052290dUR.LIZ.put(sparkThirdContext.containerId, sparkThirdContext);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mQCv9PFyHMkyqC1a3hXj4ApxeG90pTMAEche3QdU=", null));
        ThirdPartyBizCert thirdPartyBizCert2 = sparkThirdContext.bizCert;
        if (thirdPartyBizCert2 != null) {
            i2 = thirdPartyBizCert2.dataflowId;
        }
        C828340WeW.LIZ(i2, sparkThirdContext.url, enumC822170WNb, context);
    }

    public static void LIZJ(C19EG c19eg, SparkThirdContext sparkThirdContext) {
        int i;
        ThirdPartyBizCert thirdPartyBizCert = sparkThirdContext.bizCert;
        int i2 = 0;
        if (thirdPartyBizCert != null) {
            i = thirdPartyBizCert.dataflowId;
        } else {
            i = 0;
        }
        String str = sparkThirdContext.url;
        EnumC822170WNb enumC822170WNb = EnumC822170WNb.SparkThird;
        C829960Wh8 c829960Wh8 = SeclinkConfig.Companion;
        SeclinkConfig seclinkConfig = sparkThirdContext.seclinkConfig;
        c829960Wh8.getClass();
        C821850WLv c821850WLvLIZIZ = C828340WeW.LIZIZ(i, str, enumC822170WNb, c19eg, C829960Wh8.LIZ(seclinkConfig));
        C829960Wh8.LIZIZ(c821850WLvLIZIZ, sparkThirdContext);
        if (c821850WLvLIZIZ != null && c821850WLvLIZIZ.LIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkPopup#");
        sbLIZ.append(sparkThirdContext.containerId.hashCode());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Fragment fragmentLJJJJZI = c19eg.getSupportFragmentManager().LJJJJZI(strLIZIZ);
        if (fragmentLJJJJZI instanceof SparkThirdPopUp) {
            SparkThirdPopUp sparkThirdPopUp = (SparkThirdPopUp) fragmentLJJJJZI;
            Bundle arguments = sparkThirdPopUp.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            C1052290dUR.LIZ.put(sparkThirdContext.containerId, sparkThirdContext);
            C786410Ut5.LJJJI("ContainerId", sparkThirdContext.containerId, arguments);
            sparkThirdPopUp.setArguments(arguments);
            sparkThirdPopUp.refresh();
        } else {
            SparkThirdPopUp sparkThirdPopUp2 = new SparkThirdPopUp();
            sparkThirdPopUp2.LLJIJIL = sparkThirdContext;
            Bundle bundle = new Bundle();
            C1052290dUR.LIZ.put(sparkThirdContext.containerId, sparkThirdContext);
            C786410Ut5.LJJJI("ContainerId", sparkThirdContext.containerId, bundle);
            sparkThirdPopUp2.setArguments(bundle);
            sparkThirdPopUp2.show(c19eg.getSupportFragmentManager(), strLIZIZ);
        }
        ThirdPartyBizCert thirdPartyBizCert2 = sparkThirdContext.bizCert;
        if (thirdPartyBizCert2 != null) {
            i2 = thirdPartyBizCert2.dataflowId;
        }
        C828340WeW.LIZ(i2, sparkThirdContext.url, enumC822170WNb, c19eg);
    }

    public static void LIZLLL(Context context, String str, EnumC822170WNb enumC822170WNb, ThirdPartyBizCert thirdPartyBizCert, Function0 function0) {
        C821850WLv c821850WLvLIZIZ = C828340WeW.LIZIZ(thirdPartyBizCert.dataflowId, str, enumC822170WNb, context, null);
        if (c821850WLvLIZIZ != null && c821850WLvLIZIZ.LIZ) {
            return;
        }
        function0.invoke();
        C828340WeW.LIZ(thirdPartyBizCert.dataflowId, str, enumC822170WNb, context);
    }
}
