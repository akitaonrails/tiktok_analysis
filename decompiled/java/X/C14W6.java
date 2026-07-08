package X;

import Y.ARunnableS7S1101000_30;
import Y.ARunnableS99S0200000_30;
import android.app.Activity;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14W6, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14W6 extends AbstractC20277614Vy {
    public final /* synthetic */ C14W5 LLILZLL;

    @Override // X.InterfaceC20276114Vj
    public final void LIZIZ(JSONObject jSONObject) {
        Activity activityLIZ = C086J.LIZ(this.LLILZLL.LLILZ);
        if (activityLIZ != null) {
            activityLIZ.runOnUiThread(new ARunnableS99S0200000_30(jSONObject, this, 2));
        }
    }

    @Override // X.InterfaceC20276114Vj
    public final void LIZJ(JSONArray jSONArray) {
        Activity activityLIZ = C086J.LIZ(this.LLILZLL.LLILZ);
        if (activityLIZ != null) {
            activityLIZ.runOnUiThread(new ARunnableS99S0200000_30(jSONArray, this, 2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14W6(C14W5 c14w5, WeakReference weakReference) {
        super(weakReference);
        this.LLILZLL = c14w5;
    }

    @Override // X.InterfaceC20276114Vj
    public final void LIZ(int i, String str) {
        Activity activityLIZ = C086J.LIZ(this.LLILZLL.LLILZ);
        if (activityLIZ == null) {
            return;
        }
        activityLIZ.runOnUiThread(new ARunnableS7S1101000_30(this, i, str, 0));
    }
}
