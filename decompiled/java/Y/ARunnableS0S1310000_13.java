package Y;

import X.C1C7U;
import X.C2187451AjH;
import X.C2188811AlT;
import X.InterfaceC823540WSi;
import android.app.Activity;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.PushPermissionPopupGuideExp;
import com.ss.android.ugc.awemepushlib.manager.PushPermissionPopupManager;
import com.tiktok.pns.ldp.lib.LDPManager;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S1310000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showExplainBeforePermission(isNUJ(useCtx): ");
        sbLIZ.append(this.z4);
        sbLIZ.append(", popupPage: ");
        sbLIZ.append(this.s0);
        sbLIZ.append(", ctx: ");
        Activity activity = (Activity) this.l1;
        sbLIZ.append(activity != null ? activity.getLocalClassName() : null);
        sbLIZ.append(", current: ");
        sbLIZ.append(((Activity) this.l2).getLocalClassName());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        ((PushPermissionPopupManager) this.l3).LJJIII((Activity) this.l2, !PushPermissionPopupGuideExp.INSTANCE.withGuideAndMask());
    }

    public static final void run$0(ARunnableS0S1310000_13 aRunnableS0S1310000_13) {
        boolean zLIZ;
        C1C7U.LIZ("PushPermissionPopupManager@8bac.doShowCombinedPushPermissionPopup$1$1$intercept$2");
        try {
            aRunnableS0S1310000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PushPermissionPopupManager@8bac.doShowCombinedPushPermissionPopup$1$1$intercept$2");
    }

    public static final void run$1(ARunnableS0S1310000_13 aRunnableS0S1310000_13) throws JSONException {
        boolean z = aRunnableS0S1310000_13.z4;
        Set<String> set = (Set) aRunnableS0S1310000_13.l1;
        String str = aRunnableS0S1310000_13.s0;
        InterfaceC823540WSi interfaceC823540WSi = (InterfaceC823540WSi) aRunnableS0S1310000_13.l2;
        LDPManager lDPManager = (LDPManager) aRunnableS0S1310000_13.l3;
        C1C7U.LIZ("LDPManager$uploadPrivatisedList$1$1$networkCallback$1@d05.onResp$1L");
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (z) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                interfaceC823540WSi.LIZ((String) it2.next());
            }
            jSONObject.put("is_success", true);
        } else if (set.size() > 500) {
            int i = 0;
            int i2 = 0;
            for (String str2 : set) {
                if (i2 <= 100) {
                    interfaceC823540WSi.LIZ(str2);
                    i2++;
                    if (u.LJIIZILJ(str2, lDPManager.LJIIIZ, false)) {
                        i++;
                    }
                }
            }
            jSONObject2.put("privatised_data_removed_count", i);
            jSONObject.put("is_success", z);
            jSONObject.put("is_storage_oversize", true);
            jSONObject.put("reason", str);
        } else {
            jSONObject.put("is_success", false);
            jSONObject.put("reason", str);
        }
        interfaceC823540WSi.LJII(jSONObject, jSONObject2);
        Set<String> set2 = lDPManager.LJIIIIZZ;
        if (set2 != null) {
            set2.removeAll(set);
        }
        C1C7U.LIZIZ("LDPManager$uploadPrivatisedList$1$1$networkCallback$1@d05.onResp$1L");
    }

    public ARunnableS0S1310000_13(boolean z, String str, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.z4 = z;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
