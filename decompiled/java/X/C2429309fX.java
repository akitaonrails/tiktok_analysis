package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLEncoder;

/* JADX INFO: renamed from: X.09fX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2429309fX {
    public static final boolean LIZ(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("https://api.whatsapp.com/send?phone=");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (C123100dR.LIZ(str2)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("&text=");
                sbLIZ2.append(URLEncoder.encode(str2, "UTF-8"));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            intent.setPackage("com.whatsapp");
            intent.setData(UriProtector.parse(strLIZIZ));
            if (intent.resolveActivity(packageManager) != null) {
                C2429209fW.LIZ().appendDataFlowId(intent, 1207960322);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, context);
                C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmZZPb2TzaSm6ItPsk1vIiKahyiP6OhAurIPQT2gRDgJJdA9fyH6fWzoFUxaI2123Q3lq91XZKWXoBn/JY5hWyvS65vCM=", null));
                return true;
            }
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
