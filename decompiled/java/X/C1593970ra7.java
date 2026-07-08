package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ra7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593970ra7 {
    public static final C1593970ra7 LIZ = new C1593970ra7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(24));

    static {
        C0S78.LIZJ(AFwS213S0000000_24.get$arr$(23), true);
        if (C297270Bkz.LIZ()) {
            C817503Hh c817503Hh = C817503Hh.LL;
            IPNSProtectionDataLayerServiceFactory iPNSProtectionDataLayerServiceFactory = (IPNSProtectionDataLayerServiceFactory) PluggableExtentionKt.pluggableSpi$default(IPNSProtectionDataLayerServiceFactory.class, false, false, false, 14, null);
            C23250099c.LIZLLL(c817503Hh, C2107508Nl.LIZ, null, new C1600060rjw(iPNSProtectionDataLayerServiceFactory != null ? iPNSProtectionDataLayerServiceFactory.LIZJ() : null, null), 2);
        }
    }

    public static boolean LIZ() {
        return ((Keva) LIZIZ.getValue()).getBoolean(LIZJ("algo_refresh_status"), false);
    }

    public static EnumC1567080qsk LIZIZ() {
        EnumC1567080qsk enumC1567080qsk;
        Keva keva = (Keva) LIZIZ.getValue();
        String strLIZJ = LIZJ("algo_refresh_toast_status");
        EnumC1567080qsk enumC1567080qsk2 = EnumC1567080qsk.DEFAULT;
        int i = keva.getInt(strLIZJ, enumC1567080qsk2.ordinal());
        EnumC1567080qsk[] enumC1567080qskArr = (EnumC1567080qsk[]) EnumC1567080qsk.getEntries().toArray(new EnumC1567080qsk[0]);
        return (i < 0 || i >= enumC1567080qskArr.length || (enumC1567080qsk = enumC1567080qskArr[i]) == null) ? enumC1567080qsk2 : enumC1567080qsk;
    }

    public static String LIZJ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId != null && curUserId.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append('_');
            sbLIZ.append(curUserId);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    public static void LIZLLL(boolean z) {
        EnumC1567080qsk enumC1567080qsk;
        C696580RUa.LIZ.getClass();
        if (C696580RUa.LIZ() != 0) {
            boolean zLIZ = LIZ();
            if (z) {
                if (zLIZ) {
                    enumC1567080qsk = EnumC1567080qsk.REFRESHING_CONSECUTIVE;
                } else {
                    enumC1567080qsk = EnumC1567080qsk.REFRESHING;
                }
            } else if (zLIZ) {
                enumC1567080qsk = EnumC1567080qsk.REFRESHED;
            } else {
                enumC1567080qsk = EnumC1567080qsk.DEFAULT;
            }
            LJ(enumC1567080qsk);
        }
        ((Keva) LIZIZ.getValue()).storeBoolean(LIZJ("algo_refresh_status"), z);
    }

    public static void LJ(EnumC1567080qsk enumC1567080qsk) {
        if (LIZIZ() == EnumC1567080qsk.DEFAULT && enumC1567080qsk == EnumC1567080qsk.REFRESHED) {
            return;
        }
        ((Keva) LIZIZ.getValue()).storeInt(LIZJ("algo_refresh_toast_status"), enumC1567080qsk.ordinal());
    }

    @C14EU
    public final void onAlgoRefreshCancelled(C484220Iyq c484220Iyq) {
        if (Intrinsics.LJFF(c484220Iyq.LIZ.get("eventName"), "bc_algo_reset_cancelled")) {
            LIZLLL(false);
            LJ(EnumC1567080qsk.DEFAULT);
        }
    }

    @C14EU
    public final void onAlgoRefreshed(C484220Iyq c484220Iyq) throws JSONException {
        JSONObject jSONObject;
        Object obj = c484220Iyq.LIZ.get("data");
        Object obj2 = null;
        if ((obj instanceof JSONObject) && (jSONObject = (JSONObject) obj) != null) {
            obj2 = jSONObject.get("enter_from");
        }
        if (Intrinsics.LJFF(c484220Iyq.LIZ.get("eventName"), "bc_algo_reset")) {
            LIZLLL(true);
            if (Intrinsics.LJFF(obj2, "content_preference")) {
                C1440005kM.LIZ(new C1588880rRu("algo_refresh", false));
            }
        }
    }
}
