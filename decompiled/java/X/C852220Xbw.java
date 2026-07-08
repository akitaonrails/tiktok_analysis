package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Xbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852220Xbw {
    public final InterfaceC852200Xbu LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final Bundle LIZ() {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("platform", Intrinsics.LJFF(this.LIZJ, "mobile") ? "phone" : "email", bundle);
        C786410Ut5.LJJJI("enter_from", "force_update", bundle);
        C786410Ut5.LJJJI("conditional_login_ticket", this.LIZIZ, bundle);
        C786410Ut5.LJJJI("otp_type", this.LIZJ, bundle);
        if (Intrinsics.LJFF(this.LIZJ, "mobile")) {
            C786410Ut5.LJJJI("args_string_phone_number", this.LJ, bundle);
        } else {
            C786410Ut5.LJJJI("args_email", this.LJFF, bundle);
        }
        C786410Ut5.LJJJI("page", "login_force_reset_password", bundle);
        C786410Ut5.LJJJI("login_panel_type", this.LIZ.bt(), bundle);
        return bundle;
    }

    public final EnumC852910Xd3 LIZIZ() {
        return Intrinsics.LJFF(this.LIZJ, "mobile") ? EnumC852910Xd3.PHONE_SMS_CHANGE_PASSWORD : EnumC852910Xd3.EMAIL_SMS_CHANGE_PASSWORD;
    }

    public C852220Xbw(JSONObject jSONObject, InterfaceC852200Xbu interfaceC852200Xbu) {
        String strOptString;
        String strOptString2;
        String strOptString3;
        boolean z;
        boolean z2;
        this.LIZ = interfaceC852200Xbu;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("mobile", "");
        } else {
            strOptString = null;
        }
        this.LJ = strOptString;
        if (jSONObject != null) {
            strOptString2 = jSONObject.optString("email", "");
        } else {
            strOptString2 = null;
        }
        this.LJFF = strOptString2;
        if (jSONObject != null) {
            strOptString3 = jSONObject.optString("conditional_login_ticket");
        } else {
            strOptString3 = null;
        }
        this.LIZIZ = strOptString3;
        String strOptString4 = jSONObject != null ? jSONObject.optString("otp_type") : null;
        this.LIZJ = strOptString4;
        if (strOptString3 != null && strOptString3.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (strOptString4 != null && strOptString4.length() > 0 && (Intrinsics.LJFF(strOptString4, "email") || Intrinsics.LJFF(strOptString4, "mobile"))) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZLLL = z && z2;
    }
}
