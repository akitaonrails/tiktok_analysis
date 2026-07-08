package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.stripe.android.pushProvisioning.PushProvisioningActivity;
import com.stripe.android.pushProvisioning.b;
import com.stripe.android.pushProvisioning.c;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836600Wrq implements InterfaceC834570WoZ {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ PushProvisioningActivity LIZJ;

    public C836600Wrq(PushProvisioningActivity pushProvisioningActivity, String str, String str2) {
        this.LIZJ = pushProvisioningActivity;
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public final void LIZ(String str) throws Throwable {
        try {
            c cVarLIZ = b.LIZ(new JSONObject(str), new c.b());
            getClass();
            PushProvisioningActivity.LLLLZLL(this.LIZJ, this.LIZ, this.LIZIZ, cVarLIZ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            PushProvisioningActivity pushProvisioningActivity = this.LIZJ;
            EnumC836640Wru enumC836640Wru = EnumC836640Wru.EPHEMERAL_KEY_ERROR;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Ephemeral key could not be parse - JSONException - ");
            sbLIZ.append(e);
            pushProvisioningActivity.LLLLZIL(enumC836640Wru, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZIZ(String str) throws Throwable {
        PushProvisioningActivity pushProvisioningActivity = this.LIZJ;
        EnumC836640Wru enumC836640Wru = EnumC836640Wru.EPHEMERAL_KEY_ERROR;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ephemeral key could not be retrieved - ");
        sbLIZ.append(0);
        sbLIZ.append(" - ");
        sbLIZ.append(str);
        pushProvisioningActivity.LLLLZIL(enumC836640Wru, C2188811AlT.LIZIZ(sbLIZ));
    }
}
