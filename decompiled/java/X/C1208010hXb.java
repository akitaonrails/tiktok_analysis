package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.tiktok.location_api.service.experiment.LocationControllerSettingsModel;

/* JADX INFO: renamed from: X.0hXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208010hXb implements InterfaceC20660615sy {
    public final Cert LL;
    public final Activity LLILLJJLI;
    public final Fragment LLILLL;

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        C19FO c19fo;
        Lifecycle lifecycle;
        Lifecycle.State currentState;
        Boolean boolValueOf;
        Lifecycle lifecycle2;
        Lifecycle.State currentState2;
        Fragment fragment = this.LLILLL;
        if (fragment == null || (lifecycle2 = fragment.getLifecycle()) == null || (currentState2 = lifecycle2.getCurrentState()) == null || (boolValueOf = Boolean.valueOf(currentState2.isAtLeast(Lifecycle.State.CREATED))) == null) {
            Activity activity = this.LLILLJJLI;
            if (!(activity instanceof C19EG) || (c19fo = (C19FO) activity) == null || (lifecycle = c19fo.getLifecycle()) == null || (currentState = lifecycle.getCurrentState()) == null || (boolValueOf = Boolean.valueOf(currentState.isAtLeast(Lifecycle.State.CREATED))) == null) {
                return false;
            }
        }
        return boolValueOf.booleanValue();
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        C19FO c19fo;
        Context context;
        Fragment fragment = this.LLILLL;
        if (fragment != null && (context = fragment.getContext()) != null) {
            return new C688120Qyw(context, this.LLILLL, null);
        }
        Activity activity = this.LLILLJJLI;
        if (!(activity instanceof C19EG) || (c19fo = (C19FO) activity) == null) {
            return null;
        }
        return new C688120Qyw(c19fo, c19fo, null);
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return C634060Otw.LIZ(this);
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LocationControllerSettingsModel locationControllerSettingsModel = C1208020hXc.LIZ;
        LocationControllerSettingsModel locationControllerSettingsModel2 = (LocationControllerSettingsModel) c0c64LJIILLIIL.LJJII(LocationControllerSettingsModel.class, locationControllerSettingsModel, "location_controller_settings", true);
        if (locationControllerSettingsModel2 != null) {
            locationControllerSettingsModel = locationControllerSettingsModel2;
        }
        if (!locationControllerSettingsModel.forcePopupAllowed) {
            return true;
        }
        C1208440hYI.LIZ.getClass();
        C1208440hYI.LIZIZ.getClass();
        C1208160hXq c1208160hXq = C1208130hXn.LIZLLL.LIZIZ.get(this.LL.certToken());
        return (c1208160hXq != null ? c1208160hXq.LJ : null) != EnumC2192761Arq.Active;
    }

    public C1208010hXb(Cert cert, Activity activity, Fragment fragment) {
        this.LL = cert;
        this.LLILLJJLI = activity;
        this.LLILLL = fragment;
    }
}
