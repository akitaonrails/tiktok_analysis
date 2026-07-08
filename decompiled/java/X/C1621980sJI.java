package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.sticker.senor.presenter.LandmarkARPresenter;

/* JADX INFO: renamed from: X.0sJI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1621980sJI implements C1AM5 {
    public final /* synthetic */ C1623050sL1 LIZ;
    public final /* synthetic */ C385670FAf<Boolean> LIZIZ;
    public final /* synthetic */ C19GS LIZJ;
    public final /* synthetic */ LifecycleOwner LIZLLL;
    public final /* synthetic */ InterfaceC1625060sOG LJ;

    public C1621980sJI(C19GS c19gs, Fragment fragment, h0 h0Var, C1623050sL1 c1623050sL1, InterfaceC1625060sOG interfaceC1625060sOG) {
        this.LIZ = c1623050sL1;
        this.LIZIZ = h0Var;
        this.LIZJ = c19gs;
        this.LIZLLL = fragment;
        this.LJ = interfaceC1625060sOG;
    }

    @Override // X.C1AM5
    public final void LIZ(boolean z) {
        boolean zBooleanValue;
        if (z && !(this.LIZ.LIZJ instanceof LandmarkARPresenter)) {
            Boolean boolLIZJ = this.LIZIZ.LIZJ();
            if (boolLIZJ != null) {
                zBooleanValue = boolLIZJ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            this.LIZ.LIZIZ(new LandmarkARPresenter(this.LIZJ, this.LIZLLL, zBooleanValue, new C1623860sMK(this.LJ)), true);
        }
    }
}
