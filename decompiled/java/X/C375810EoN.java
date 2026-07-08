package X;

import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.0EoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375810EoN extends C375790EoL<InterfaceC375970Eod> implements InterfaceC375970Eod {
    public static final int LLJILJIL = 8;
    public final String LLJIJIL;

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void Db0(Object obj) {
    }

    public InterfaceC375970Eod H2() {
        return this;
    }

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void lt1() {
        C0EB6 c0eb6O2 = o2();
        if (c0eb6O2 != null) {
            c0eb6O2.LJIIJJI(true);
        }
        C0EB6 c0eb6O22 = o2();
        if (c0eb6O22 != null) {
            c0eb6O22.LJIIIZ(new C0E2C(0.0f, getPanelName(), true));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        lt1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        sr0();
    }

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void sr0() {
        C0EB6 c0eb6O2 = o2();
        if (c0eb6O2 != null) {
            c0eb6O2.LJIIJJI(false);
        }
        C0EB6 c0eb6O22 = o2();
        if (c0eb6O22 != null) {
            c0eb6O22.LJIIIZ(new C0E2C(0.0f, getPanelName(), false));
        }
    }

    @Override // X.C375790EoL
    public /* bridge */ /* synthetic */ InterfaceC373200EkA X1() {
        H2();
        return this;
    }

    @Override // X.C375790EoL, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        H2();
        return this;
    }

    @Override // X.C375790EoL
    public String getPanelName() {
        return this.LLJIJIL;
    }

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void exit(boolean z) {
        Scene scene;
        if (!C373230EkD.LIZ(this) && (scene = this.LLILZIL) != null) {
            C375850EoR.LIZ(scene);
        }
    }

    public C375810EoN(C1DRG c1drg, NavigationScene navigationScene, Scene scene, String str) {
        super(c1drg, navigationScene, scene, "");
        this.LLJIJIL = str;
    }
}
