package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0J3A, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J3A {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        Activity activityLJFF;
        C844470XAv.LIZ.getClass();
        if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (activityLJFF = C2214201BlK.LJFF()) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLJFF);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("IBE: ");
            sbLIZ.append(str);
            c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            c1389890mGx.LJIIJJI();
        }
    }

    public static Activity LIZJ(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextThemeWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return (Activity) contextWrapper.getBaseContext();
            }
        }
        return C2214201BlK.LJFF();
    }

    public static void LIZIZ(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, String str, Pair... pairArr) {
        InterfaceC1541990qEH kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
        if (kitView == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to send JSB ");
            sbLIZ.append(str);
            sbLIZ.append(" due to empty kit view");
            LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (pairArr.length == 0) {
            kitView.X0(str, null);
        } else {
            kitView.LIZ(str, new JSONObject(C2097608Jq.LJIIJ((Pair[]) Arrays.copyOf(pairArr, pairArr.length))));
        }
    }
}
