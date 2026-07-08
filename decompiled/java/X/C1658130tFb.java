package X;

import Y.AObjectS306S0200000_25;
import Y.ARunnableS125S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0tFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658130tFb extends Scene implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public final int LLJI;
    public final C1DRG LLJIJIL;
    public final boolean LLJILJIL;
    public final Integer LLJILJILJ;
    public TuxTextView LLJILLL;
    public final ARunnableS125S0100000_25 LLJJ = new ARunnableS125S0100000_25(this, 62);
    public final C1664750tQH LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1658130tFb.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJIJIL;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.g1r);
        this.LLJILLL = tuxTextView;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        ((InterfaceC1647890sz5) this.LLJJI.getValue(this, LLJJIJIIJIL[0])).va().LIZ(this, new AObjectS306S0200000_25((Object) this, (Object) view, (InterfaceC1648570t0B) 20));
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num = this.LLJILJILJ;
        if (num != null && num.intValue() == 1) {
            return C786410Ut5.Td(layoutInflater, R.layout.er_, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.era, viewGroup, false);
    }

    public C1658130tFb(int i, C1DRG c1drg, boolean z, Integer num) {
        int iLIZ;
        int iLIZIZ;
        this.LLJI = i;
        this.LLJIJIL = c1drg;
        this.LLJILJIL = z;
        this.LLJILJILJ = num;
        this.LLJJI = C1664770tQJ.LIZ(c1drg, a.class, null);
        if (C1462920oAk.LIZLLL()) {
            iLIZ = C578130Mlv.LIZIZ();
        } else {
            iLIZ = C578130Mlv.LIZ();
        }
        this.LLJJIII = iLIZ;
        if (C1462920oAk.LIZLLL()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        }
        this.LLJJIJI = iLIZIZ;
    }
}
