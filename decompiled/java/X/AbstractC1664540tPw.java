package X;

import X.InterfaceC1664580tQ0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@InterfaceC1294060jmO
public abstract class AbstractC1664540tPw<T extends InterfaceC1664580tQ0> extends AbstractC2255721DQs<T> implements InterfaceC1664580tQ0, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LL;
    public InterfaceC1655610tBX LLILZ;
    public C1664560tPy LLILZIL;
    public final T LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C19GS.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 65));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC1664540tPw.class, "activity", "getActivity()Landroidx/appcompat/app/AppCompatActivity;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public static /* synthetic */ void m3() {
    }

    public abstract void Z1();

    public abstract int v3();

    public final C19GS H2() {
        return (C19GS) this.LLILLL.getValue(this, LLIZ[0]);
    }

    public final C19A3 W2() {
        return (C19A3) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1664580tQ0
    public void close() {
        InterfaceC1655610tBX interfaceC1655610tBX = this.LLILZ;
        if (interfaceC1655610tBX != null) {
            interfaceC1655610tBX.LIZ();
        }
        this.LLILZ = null;
    }

    public final C1664560tPy i3() {
        C1664560tPy c1664560tPy = this.LLILZIL;
        if (c1664560tPy != null) {
            return c1664560tPy;
        }
        return null;
    }

    public final List<AbstractC2255721DQs<?>> o2() {
        NavigationScene navigationScene;
        List<Scene> sceneList;
        InterfaceC1655610tBX interfaceC1655610tBX = this.LLILZ;
        Scene scene = null;
        if (interfaceC1655610tBX != null && (navigationScene = interfaceC1655610tBX.getNavigationScene()) != null && (sceneList = navigationScene.getSceneList()) != null) {
            for (Scene scene2 : sceneList) {
                if (scene2 instanceof C1664560tPy) {
                    scene = scene2;
                }
            }
            if (scene != null) {
                return new ArrayList(C1664600tQ2.LJ((C19A3) scene).LJ());
            }
        }
        return new ArrayList();
    }

    @Override // X.InterfaceC1664580tQ0
    public boolean onBackPressed() {
        InterfaceC1655610tBX interfaceC1655610tBX = this.LLILZ;
        if (interfaceC1655610tBX != null) {
            return interfaceC1655610tBX.onBackPressed();
        }
        return false;
    }

    @Override // X.InterfaceC1664580tQ0
    public void open() {
        if (this.LLILZ != null) {
            return;
        }
        C214873197f c214873197fLIZ = C19CA.LIZ(H2(), C1664560tPy.class);
        c214873197fLIZ.LJII = new InterfaceC214877197j() { // from class: X.0tPz
            @Override // X.InterfaceC214877197j
            public final Scene LIZ(ClassLoader classLoader, String str, Bundle bundle) {
                return AbstractC1664540tPw.B3(this.LIZ, classLoader, str, bundle);
            }
        };
        c214873197fLIZ.LJIIIZ = false;
        c214873197fLIZ.LJI = false;
        InterfaceC1655610tBX interfaceC1655610tBXLIZ = c214873197fLIZ.LIZ();
        this.LLILZ = interfaceC1655610tBXLIZ;
        NavigationScene navigationScene = interfaceC1655610tBXLIZ.getNavigationScene();
        if (navigationScene != null) {
            navigationScene.registerChildSceneLifecycleCallbacks(new C0Y8U(this) { // from class: X.0tPx
                public final /* synthetic */ AbstractC1664540tPw<T> LIZ;

                {
                    this.LIZ = this;
                }

                @Override // X.C0Y8U, X.C19AH
                public final void LJJIIZI(Scene scene) {
                    NavigationScene navigationScene2;
                    if (scene instanceof C1664560tPy) {
                        InterfaceC1655610tBX interfaceC1655610tBX = this.LIZ.LLILZ;
                        if (interfaceC1655610tBX != null && (navigationScene2 = interfaceC1655610tBX.getNavigationScene()) != null) {
                            navigationScene2.unregisterChildSceneLifecycleCallbacks(this);
                        }
                        this.LIZ.Z1();
                    }
                }
            }, false);
        }
    }

    public T T2() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1655610tBX c3() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public AbstractC1664540tPw(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void E3(InterfaceC1655610tBX interfaceC1655610tBX) {
        this.LLILZ = interfaceC1655610tBX;
    }

    public final void H3(C1664560tPy c1664560tPy) {
        this.LLILZIL = c1664560tPy;
    }

    public final C539960LFq W1(AbstractC1664540tPw<T> abstractC1664540tPw, String str, Function1<? super C539960LFq, Unit> function1) {
        C539960LFq c539960LFq = new C539960LFq(C1664600tQ2.LJIIL(str, abstractC1664540tPw.i3(), null));
        function1.invoke(c539960LFq);
        c539960LFq.LIZIZ();
        return c539960LFq;
    }

    public final C1DRG w2(AbstractC1664540tPw<T> abstractC1664540tPw, String str, Function1<? super C1DRF, Unit> function1) {
        OCAdapterViewModel oCAdapterViewModelLJI = C1664590tQ1.LJI(str, abstractC1664540tPw.i3(), false, null, 28);
        C1DRF c1drf = oCAdapterViewModelLJI.LLILLL;
        c1drf.LJ(C19A3.class, null, abstractC1664540tPw.i3());
        function1.invoke(c1drf);
        return oCAdapterViewModelLJI.vQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0tPy, com.bytedance.scene.Scene] */
    public static final Scene B3(AbstractC1664540tPw abstractC1664540tPw, ClassLoader classLoader, String str, Bundle bundle) {
        ?? r3 = new C19A3() { // from class: X.0tPy
            @Override // com.bytedance.scene.Scene
            public final void onActivityCreated(Bundle bundle2) {
                super.onActivityCreated(bundle2);
            }

            @Override // X.C19A3, com.bytedance.scene.Scene
            public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
                return (ViewGroup) C786410Ut5.Td(layoutInflater, requireArguments().getInt("layoutId"), viewGroup, false);
            }

            @Override // X.C19A3, com.bytedance.scene.Scene
            public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle2) {
                return onCreateView(layoutInflater, viewGroup, bundle2);
            }
        };
        Bundle bundle2 = new Bundle();
        bundle2.putInt("layoutId", abstractC1664540tPw.v3());
        r3.mArguments = bundle2;
        abstractC1664540tPw.H3(r3);
        return abstractC1664540tPw.i3();
    }
}
