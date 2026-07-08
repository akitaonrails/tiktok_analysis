package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpBehavior;
import com.ss.android.ugc.aweme.landpage.popup.TuxAdLandingPagePopUpBehavior;
import com.ss.android.ugc.aweme.log.AdLandingPageResizeLogger;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0e8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class DialogInterfaceOnCancelListenerC1077270e8j implements DialogInterface.OnCancelListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) throws JSONException {
        switch (this.$t) {
            case 0:
                onCancel$0(this, dialogInterface);
                break;
            case 1:
                onCancel$1(this, dialogInterface);
                break;
        }
    }

    public static final void onCancel$0(DialogInterfaceOnCancelListenerC1077270e8j dialogInterfaceOnCancelListenerC1077270e8j, DialogInterface dialogInterface) {
        BottomSheetBehavior bottomSheetBehavior;
        String str;
        String str2;
        TuxSheetBehavior tuxSheetBehavior;
        if (C299110Bnx.LIZ()) {
            if (TuxAdLandingPagePopUpBehavior.LJJJJLL) {
                return;
            }
        } else if (AdLandingPagePopUpBehavior.LJIILIIL) {
            return;
        }
        String str3 = TuxSheet._pnsPageId;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ((Fragment) dialogInterfaceOnCancelListenerC1077270e8j.l0);
        Integer numValueOf = null;
        if (C299110Bnx.LIZ()) {
            if ((c16bcLJIIIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJIIIZ) != null) {
                numValueOf = Integer.valueOf(tuxSheetBehavior.LJIJJ);
            }
        } else if ((c16bcLJIIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) != null) {
            numValueOf = Integer.valueOf(bottomSheetBehavior.getState());
        }
        Object[] objArr = new Object[1];
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_success", true);
        if (numValueOf != null) {
            if (numValueOf.intValue() == 3) {
                str = "1";
            } else {
                numValueOf.intValue();
                str = "0.7";
            }
        } else {
            str = "0.7";
        }
        C786410Ut5.LJJJI("before_size", str, bundle);
        if (Intrinsics.LJFF(C1391190mJ3.LJIIJ(dialogInterface), C343960De6.LIZ)) {
            str2 = "system_back";
        } else {
            str2 = "other";
        }
        C786410Ut5.LJJJI("action_resize", str2, bundle);
        C786410Ut5.LJJJI("screen_size", "0.2", bundle);
        objArr[0] = bundle;
        AdLandingPageResizeLogger adLandingPageResizeLogger = new AdLandingPageResizeLogger(objArr);
        C1029390ctV.LIZ.getClass();
        adLandingPageResizeLogger.logAd(C1029390ctV.LIZIZ, new AwS595S0100000_16((C1026310coX) dialogInterfaceOnCancelListenerC1077270e8j.l1, 103));
    }

    public static final void onCancel$1(DialogInterfaceOnCancelListenerC1077270e8j dialogInterfaceOnCancelListenerC1077270e8j, DialogInterface dialogInterface) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_code", 3);
        jSONObject.put("error_msg", "user cancel");
        ((C1389700mGe) dialogInterfaceOnCancelListenerC1077270e8j.l0).LJ((Number) dialogInterfaceOnCancelListenerC1077270e8j.l1, jSONObject);
    }

    public DialogInterfaceOnCancelListenerC1077270e8j(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
