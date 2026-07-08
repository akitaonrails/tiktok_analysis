package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.lego.NetworkRestrictInfoTask;

/* JADX INFO: renamed from: X.0Uvk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788060Uvk {
    public static void LIZ(Context context) {
        String string;
        ConnectivityManager connectivityManager;
        String str;
        Object objH2 = null;
        if (context != null) {
            try {
                objH2 = C786410Ut5.H2(context, "connectivity");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = "-1";
            }
        }
        if ((objH2 instanceof ConnectivityManager) && (connectivityManager = (ConnectivityManager) objH2) != null) {
            StringBuilder sb = new StringBuilder();
            if (connectivityManager.isActiveNetworkMetered()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            sb.append(str);
            if (Build.VERSION.SDK_INT >= 24) {
                sb.append("1");
                sb.append(String.valueOf(connectivityManager.getRestrictBackgroundStatus()));
            } else {
                sb.append("00");
            }
            string = sb.toString();
            NetworkRestrictInfoTask.LLILLJJLI = string;
            NetworkRestrictInfoTask.LL.getValue().storeString("NetworkRestrictInfo", NetworkRestrictInfoTask.LLILLJJLI);
        }
    }
}
