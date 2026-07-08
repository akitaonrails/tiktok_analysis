package X;

import com.ss.android.ugc.aweme.editorpro.recordtab.EditorTabViewModel;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS35S0001000_22;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mnf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1410170mnf extends i<InterfaceC1410210mnj, C1415930mwx, C1410160mne, C1410180mng> implements InterfaceC1410210mnj, InterfaceC379610EuV {
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final EditorTabViewModel LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public int LLJJIJI;
    public C19A3 LLJJIJIIJIL;
    public C09AE LLJJIJIL;
    public final C01GW LLJJJ;

    private final C560860LzA H4() {
        return (C560860LzA) this.LLJJIII.getValue();
    }

    private final InterfaceC497601wk P4() {
        return (InterfaceC497601wk) this.LLJJJ.getValue();
    }

    @Override // ge.i
    public Function0<C1415930mwx> E3() {
        return new AwS566S0100000_22(this, 1082);
    }

    public final IAVDraftService K4() {
        return (IAVDraftService) this.LLJJI.getValue();
    }

    @Override // X.InterfaceC1410210mnj
    public void Pz2() {
        int i = this.LLJJIJI;
        this.LLJJIJI = i + 1;
        i3(new AwS35S0001000_22(i, 33));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1410160mne> o2() {
        return AFwS210S0000000_22.get$arr$(493);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1410180mng> w2() {
        return new AwS566S0100000_22(this, 1081);
    }

    private final int O4() {
        return C0C04.LIZ() ? 1 : 2;
    }

    private final void T4() {
        int iO4;
        if (C0CHQ.LIZ().getAccountService().isLogin() && (iO4 = O4()) > 0) {
            this.LLJJIJIL = C23250099c.LIZLLL(P4(), C0PEM.LIZJ, null, new C1410100mnY(this, iO4, null), 2);
        }
    }

    public final void Z4() {
        C560860LzA c560860LzAH4 = H4();
        IAVDraftService iAVDraftServiceK4 = K4();
        T2();
        c560860LzAH4.LIZ(iAVDraftServiceK4, this.LLJJ.LLILZIL);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LLJJ.LLILZLL) {
            i3(new AwS601S0100000_22(this, 872));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C09AE c09ae = this.LLJJIJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        T4();
    }

    public final int F4() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final void d5(int i) {
        this.LLJJIJI = i;
    }

    public C1410170mnf(C19A3 c19a3, C1DRG c1drg, EditorTabViewModel editorTabViewModel) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = editorTabViewModel;
        this.LLJJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(603));
        this.LLJJIII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1095));
        this.LLJJJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(604));
    }
}
