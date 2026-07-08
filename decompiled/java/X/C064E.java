package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS35S0300000_2;
import Y.ARunnableS71S0200000_2;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.account.popup.popuphelper.PasskeyPopUpHelper;
import com.ss.android.ugc.aweme.ecommercebase.preload.ECAsyncInflaterV2;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.064E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C064E implements InterfaceC20325014fw {
    public DialogC1389620mGW LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ PasskeyPopUpHelper LIZJ;
    public final /* synthetic */ C064F LIZLLL;

    @Override // X.InterfaceC20325014fw
    public final void LJ() {
        Activity activity = this.LIZIZ;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS71S0200000_2(this, activity, 9));
        }
    }

    @Override // X.InterfaceC20325014fw
    public final void onSuccess(String str) {
        Activity activity = this.LIZIZ;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS35S0300000_2((Object) this, (Activity) this.LIZJ, (C259800zU<ECAsyncInflaterV2>) activity, (Lifecycle) 3));
        }
    }

    public C064E(C19EG c19eg, PasskeyPopUpHelper passkeyPopUpHelper, C064F c064f) {
        this.LIZIZ = c19eg;
        this.LIZJ = passkeyPopUpHelper;
        this.LIZLLL = c064f;
    }

    @Override // X.InterfaceC20325014fw
    public final void LIZ(Throwable th, boolean z, boolean z2) {
        Activity activity = this.LIZIZ;
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS102S0100000_2(this, 43));
        }
        Activity activity2 = this.LIZIZ;
        C064F c064f = this.LIZLLL;
        C20431614x8 c20431614x8 = C20431614x8.LIZ;
        Boolean boolValueOf = Boolean.valueOf(z2);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c064f, 962);
        c20431614x8.getClass();
        C20431614x8.LJII(activity2, th, true, z, boolValueOf, awS546S0100000_2);
    }
}
