package X;

import X.C05YF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664510tPt<T extends C05YF> extends AbstractC2255721DQs<T> implements C05YF, InterfaceC379610EuV, InterfaceC1664530tPv {
    public final C19A3 LL;
    public final C1DRG LLILLJJLI;
    public final T LLILLL = this;
    public final String LLILZ;
    public int LLILZIL;
    public EnumC371580EhY LLILZLL;
    public InterfaceC1655610tBX LLIZ;
    public C19A3 LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;
    public final C1664520tPu LLJIJIL;

    public static /* synthetic */ void i3() {
    }

    public void H3(C19A3 c19a3, View view) {
    }

    public abstract void o2(C19A3 c19a3);

    public abstract int q3();

    private final void G2() {
        if (this.LLIZLLLIL == null) {
            O3(H2());
        }
        if (this.LL.findSceneByTag(this.LLILZ) != null) {
            C1658150tFd.LIZJ(this.LL, this.LLILZ);
        }
        this.LL.disableSupportRestore();
        W1();
    }

    private final void W1() {
        if (!this.LLJ) {
            this.LL.registerChildSceneLifecycleCallbacks(this.LLJIJIL, false);
            this.LLJ = true;
        }
        this.LL.add(this.LLILZIL, c3(), this.LLILZ);
    }

    public C19A3 H2() {
        final int iQ3 = q3();
        return new C19A3(iQ3) { // from class: X.0tPs
            public final int LLJILLL;

            {
                this.LLJILLL = iQ3;
            }

            @Override // X.C19A3, com.bytedance.scene.Scene
            public final void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                Iterator it2 = C13LP.LLIIII(getSceneList()).iterator();
                while (it2.hasNext()) {
                    remove((Scene) it2.next());
                }
            }

            @Override // X.C19A3, com.bytedance.scene.Scene
            public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return (ViewGroup) C786410Ut5.Td(layoutInflater, this.LLJILLL, viewGroup, false);
            }

            @Override // X.C19A3, com.bytedance.scene.Scene
            public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                return onCreateView(layoutInflater, viewGroup, bundle);
            }
        };
    }

    public final C19A3 c3() {
        C19A3 c19a3 = this.LLIZLLLIL;
        if (c19a3 != null) {
            return c19a3;
        }
        return null;
    }

    public final void clear() {
        Scene sceneFindSceneByTag = this.LL.findSceneByTag(this.LLILZ);
        if (sceneFindSceneByTag != null) {
            int i = this.LLJI;
            if (i != 0) {
                this.LL.remove(sceneFindSceneByTag, i);
            } else {
                this.LL.remove(sceneFindSceneByTag);
            }
        }
        InterfaceC1655610tBX interfaceC1655610tBX = this.LLIZ;
        if (interfaceC1655610tBX != null) {
            interfaceC1655610tBX.LIZ();
        }
    }

    public final void hide() {
        if (this.LLIZLLLIL == null) {
            return;
        }
        this.LL.hide(c3());
    }

    public final EnumC371580EhY m3() {
        EnumC371580EhY enumC371580EhY = this.LLILZLL;
        if (enumC371580EhY != null) {
            return enumC371580EhY;
        }
        return null;
    }

    public final void show() {
        if (this.LLIZLLLIL == null) {
            G2();
        } else {
            if (this.LL.isShowing(c3())) {
                return;
            }
            if (this.LL.isAdded(c3())) {
                this.LL.show(c3());
            } else {
                W1();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LL.findSceneByTag(this.LLILZ) != null) {
            C1658150tFd.LIZJ(this.LL, this.LLILZ);
        }
        if (m3() == EnumC371580EhY.SHOW) {
            show();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (this.LLJ) {
            this.LL.unregisterChildSceneLifecycleCallbacks(this.LLJIJIL);
            this.LLJ = false;
        }
    }

    public final int B3() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public T getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    public int v3() {
        return this.LLJI;
    }

    public final void E3(Animation animation) {
        View view = c3().mView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.startViewTransition(view);
            }
            view.startAnimation(animation);
        }
        hide();
    }

    public final void O3(C19A3 c19a3) {
        this.LLIZLLLIL = c19a3;
    }

    public final void Q3(EnumC371580EhY enumC371580EhY) {
        this.LLILZLL = enumC371580EhY;
    }

    public final void e4(int i) {
        this.LLILZIL = i;
    }

    public final void o4(Animation animation) {
        show();
        View view = c3().mView;
        if (view != null) {
            view.startAnimation(animation);
        }
    }

    public final void w2(Function1<? super C1647230sy1, Unit> function1) {
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(c3(), AlsVMContainer.class);
        C1647230sy1 c1647230sy1 = new C1647230sy1(0);
        function1.invoke(c1647230sy1);
        alsVMContainer.LL = c1647230sy1;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0tPu] */
    public AbstractC1664510tPt(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c19a3;
        this.LLILLJJLI = c1drg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UIGroupLogicComponent#");
        sbLIZ.append(getClass().getName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        this.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZIL = -1;
        this.LLJIJIL = new C0Y8U(this) { // from class: X.0tPu
            public final /* synthetic */ AbstractC1664510tPt<T> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.C0Y8U, X.C19AH
            public final void LJJIIZI(Scene scene) {
                if (Intrinsics.LJFF(scene, this.LIZ.c3())) {
                    this.LIZ.LL.unregisterChildSceneLifecycleCallbacks(this);
                    AbstractC1664510tPt<T> abstractC1664510tPt = this.LIZ;
                    abstractC1664510tPt.LLJ = false;
                    abstractC1664510tPt.H3(abstractC1664510tPt.c3(), this.LIZ.c3().mView);
                    AbstractC1664510tPt<T> abstractC1664510tPt2 = this.LIZ;
                    abstractC1664510tPt2.o2(abstractC1664510tPt2.c3());
                }
            }
        };
    }

    public final C1DRG T2(String str, Function1<? super C1DRF, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" UIGroupLogicComponent data{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        OCAdapterViewModel oCAdapterViewModelLJI = C1664590tQ1.LJI(str, c3(), false, this.LLILLJJLI, 4);
        function1.invoke(oCAdapterViewModelLJI.LLILLL);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" UIGroupLogicComponent data{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return oCAdapterViewModelLJI.vQ2();
    }

    public final C539960LFq X1(String str, Function1<? super C539960LFq, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" UIGroupLogicComponent attach{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C539960LFq c539960LFq = new C539960LFq(C1664600tQ2.LJIIL(str, c3(), null));
        function1.invoke(c539960LFq);
        c539960LFq.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" UIGroupLogicComponent attach{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return c539960LFq;
    }
}
