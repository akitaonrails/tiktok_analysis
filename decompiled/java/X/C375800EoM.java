package X;

import android.view.View;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.gamora.editorpro.framework.panel.logic.service.PanelServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375800EoM extends C375790EoL<C0ETQ> implements C0ETQ {
    public static final int LLJJIJIL = 8;
    public final C19A3 LLJIJIL;
    public final Scene LLJILJIL;
    public final View LLJILJILJ;
    public final C0EZ4 LLJILLL;
    public final C560530Lyd<Unit> LLJJ;
    public final C560530Lyd<Unit> LLJJI;
    public final C560530Lyd<Unit> LLJJIII;
    public Float LLJJIJI;
    public Function0<Boolean> LLJJIJIIJIL;

    public C0ETQ T2() {
        return this;
    }

    @Override // X.C0ETQ
    public boolean close() {
        NavigationScene navigationScene = this.LLILZ;
        if (!Intrinsics.LJFF(navigationScene != null ? navigationScene.LLLLIIIILLL() : null, this.LLJILJIL)) {
            this.LLJJ.LJIIJ(Unit.LIZ);
            return false;
        }
        this.LLJJ.LJIIJ(Unit.LIZ);
        NavigationScene navigationScene2 = this.LLILZ;
        if (navigationScene2 == null) {
            return true;
        }
        navigationScene2.LLLLLL();
        return true;
    }

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void lt1() {
        View view = this.LLJILJILJ;
        if (view != null) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(this, 8));
                return;
            }
            float height = view.getHeight();
            this.LLJJIJI = Float.valueOf(height);
            C0EB6 c0eb6O2 = o2();
            if (c0eb6O2 != null) {
                c0eb6O2.LJIIJJI(true);
            }
            C0EB6 c0eb6O22 = o2();
            if (c0eb6O22 != null) {
                c0eb6O22.LJIIIZ(new C0E2C(height, getPanelName(), true));
            }
            H2(true);
            this.LLJJI.LJIIJ(Unit.LIZ);
        }
    }

    @Override // X.C0ETQ
    public boolean onBackPressed() {
        NavigationScene navigationScene = this.LLILZ;
        if (!Intrinsics.LJFF(navigationScene != null ? navigationScene.LLLLIIIILLL() : null, this.LLJILJIL)) {
            return false;
        }
        Function0<Boolean> function0 = this.LLJJIJIIJIL;
        if (function0 != null && function0.invoke().booleanValue()) {
            return true;
        }
        this.LLJJIII.LJIIJ(Unit.LIZ);
        return close();
    }

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void sr0() {
        Float f = this.LLJJIJI;
        float fFloatValue = f != null ? f.floatValue() : Z1(C1664590tQ1.LJII(this));
        C0EB6 c0eb6O2 = o2();
        if (c0eb6O2 != null) {
            c0eb6O2.LJIIJJI(false);
        }
        C0EB6 c0eb6O22 = o2();
        if (c0eb6O22 != null) {
            c0eb6O22.LJIIIZ(new C0E2C(fFloatValue, getPanelName(), false));
        }
        H2(false);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        NavigationScene navigationScene = this.LLILZ;
        if (navigationScene == null || navigationScene.getSceneList().size() > 2) {
            return;
        }
        lt1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        NavigationScene navigationScene = this.LLILZ;
        if (navigationScene == null || navigationScene.getSceneList().size() > 2) {
            return;
        }
        sr0();
    }

    @Override // X.C0ETQ
    public LiveEvent<Unit> Gs1() {
        return this.LLJJ;
    }

    @Override // X.C0ETQ
    public LiveEvent<Unit> L72() {
        return this.LLJJI;
    }

    @Override // X.C375790EoL
    public /* bridge */ /* synthetic */ InterfaceC373200EkA X1() {
        T2();
        return this;
    }

    @Override // X.C375790EoL, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        T2();
        return this;
    }

    @Override // X.C0ETQ
    public LiveEvent<Unit> p70() {
        return this.LLJJIII;
    }

    public final void H2(boolean z) {
        Integer num;
        if (this.LLJILLL.LIZJ.invoke().booleanValue()) {
            if (z) {
                num = 1;
            } else {
                num = null;
            }
            C0E48 c0e48W1 = W1();
            if (c0e48W1 != null) {
                c0e48W1.S7().LIZIZ(new C358810E4x(num), "switch_track_style", false);
            }
        }
    }

    @Override // X.C375790EoL, X.InterfaceC373200EkA
    public void exit(boolean z) {
        C1524705y1.LIZJ(new AwS549S0100000_5(this, StrategyCenter.ENABLE_SMART_SERVICE));
    }

    @Override // X.C0ETQ
    public void fx1(Function0<Boolean> function0) {
        this.LLJJIJIIJIL = function0;
    }

    @Override // X.C0ETQ
    public <I, O> void IZ0(Class<Object> cls, I i, Function1<? super O, Unit> function1) {
        C0E48 c0e48W1;
        C19A3 c19a3 = this.LLJIJIL;
        if (c19a3 != null && (c0e48W1 = W1()) != null) {
            PanelServiceImpl.createIPanelServicebyMonsterPlugin(false).open(c19a3, c0e48W1, cls, i, function1);
        }
    }

    public C375800EoM(C1DRG c1drg, NavigationScene navigationScene, C19A3 c19a3, Scene scene, View view, C0EZ4 c0ez4, String str) {
        super(c1drg, navigationScene, scene, str);
        this.LLJIJIL = c19a3;
        this.LLJILJIL = scene;
        this.LLJILJILJ = view;
        this.LLJILLL = c0ez4;
        this.LLJJ = new C560530Lyd<>();
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = new C560530Lyd<>();
    }
}
