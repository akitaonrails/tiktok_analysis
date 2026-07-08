package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360590EBt extends C0EB6 {
    public static final int LLILZLL = 8;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final MutableLiveData<String> LLILZ = new MutableLiveData<>();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 805));

    private final C0E48 LJIILJJIL() {
        return (C0E48) this.LLILZIL.getValue();
    }

    @Override // X.C0EB6
    public boolean LIZIZ() {
        NavigationScene navigationScene;
        Scene sceneLLLLIIIILLL;
        if (this.LLILZ.getValue() == null || (navigationScene = (NavigationScene) this.LLILLJJLI.findSceneByTag("EditorProPanelNavigationScene")) == null || (sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL()) == null || !(sceneLLLLIIIILLL instanceof AbstractC364960ESo)) {
            return false;
        }
        return ((AbstractC364960ESo) sceneLLLLIIIILLL).LLLLIIIILLL();
    }

    @Override // X.C0EB6
    public C19A3 LIZJ() {
        NavigationScene navigationScene = (NavigationScene) this.LLILLJJLI.findSceneByTag("EditorProPanelNavigationScene");
        if (navigationScene == null) {
            return null;
        }
        Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
        if (sceneLLLLIIIILLL instanceof C19A3) {
            return (C19A3) sceneLLLLIIIILLL;
        }
        return null;
    }

    @Override // X.C0EB6
    public boolean LJIIIIZZ() {
        NavigationScene navigationScene;
        Scene sceneLLLLIIIILLL;
        if (this.LLILZ.getValue() == null || (navigationScene = (NavigationScene) this.LLILLJJLI.findSceneByTag("EditorProPanelNavigationScene")) == null || (sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL()) == null) {
            return false;
        }
        return sceneLLLLIIIILLL instanceof AbstractC364960ESo;
    }

    @Override // X.C0EB6
    public LiveData<C0E2C> LJFF() {
        C0E48 c0e48LJIILJJIL = LJIILJJIL();
        if (c0e48LJIILJJIL != null) {
            return c0e48LJIILJJIL.S7().LIZ("panel_bounce_event");
        }
        return null;
    }

    @Override // X.C0EB6
    public LiveData<Boolean> LJI() {
        C0E48 c0e48LJIILJJIL = LJIILJJIL();
        if (c0e48LJIILJJIL != null) {
            return c0e48LJIILJJIL.S7().LIZ("is_bottom_panel_showing");
        }
        return null;
    }

    @Override // X.C0EB6
    public LiveData<String> LJII() {
        return this.LLILZ;
    }

    @Override // X.C0EB6
    public void LJIIIZ(C0E2C c0e2c) {
        C0E48 c0e48LJIILJJIL = LJIILJJIL();
        if (c0e48LJIILJJIL != null) {
            C350870DpF.LJIIIZ(c0e48LJIILJJIL, "panel_bounce_event", c0e2c);
        }
    }

    @Override // X.C0EB6
    public void LJIIJJI(boolean z) {
        C0E48 c0e48LJIILJJIL = LJIILJJIL();
        if (c0e48LJIILJJIL != null) {
            C350870DpF.LJIIIZ(c0e48LJIILJJIL, "is_bottom_panel_showing", Boolean.valueOf(z));
        }
    }

    @Override // X.C0EB6
    public void LJIILIIL(String str) {
        this.LLILZ.setValue(str);
    }

    public C360590EBt(C19A3 c19a3, C1DRG c1drg) {
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
    }
}
