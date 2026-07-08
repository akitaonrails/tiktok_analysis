package X;

import X.C05YF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.dsl.OCAdapterViewModel;
import com.bytedance.scene.Scene;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS22S0202000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664840tQQ<T extends C05YF> extends AbstractC2255721DQs<T> implements C05YF, InterfaceC379610EuV, InterfaceC1664530tPv {
    public static final int LLJI = 8;
    public final int LL;
    public final C19A3 LLILLJJLI;
    public final C1DRG LLILLL;
    public final T LLILZ = this;
    public final String LLILZIL;
    public final C05P0<Boolean> LLILZLL;
    public C19A3 LLIZ;
    public boolean LLIZLLLIL;
    public final C1664930tQZ LLJ;

    public static /* synthetic */ void c3() {
    }

    public abstract void W1(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i);

    public abstract void w2(C19A3 c19a3);

    public final C19A3 W2() {
        C19A3 c19a3 = this.LLIZ;
        if (c19a3 != null) {
            return c19a3;
        }
        return null;
    }

    public final C1DRG T2() {
        C1DRG c1drgLJFF = C1664600tQ2.LJ(W2()).LJFF();
        if (c1drgLJFF != null) {
            return c1drgLJFF;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (this.LLILLJJLI.findSceneByTag(this.LLILZIL) != null) {
            C1658150tFd.LIZJ(this.LLILLJJLI, this.LLILZIL);
        }
        if (this.LLIZ == null) {
            i3(new C19A3() { // from class: X.0tQa
                @Override // X.C19A3, com.bytedance.scene.Scene
                public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                    return new FrameLayout(layoutInflater.getContext());
                }

                @Override // X.C19A3, com.bytedance.scene.Scene
                public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                    return onCreateView(layoutInflater, viewGroup, bundle);
                }
            });
        }
        if (this.LLILLJJLI.findSceneByTag(this.LLILZIL) != null) {
            C1658150tFd.LIZJ(this.LLILLJJLI, this.LLILZIL);
        }
        this.LLILLJJLI.disableSupportRestore();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (this.LLIZLLLIL) {
            this.LLILLJJLI.unregisterChildSceneLifecycleCallbacks(this.LLJ);
            this.LLIZLLLIL = false;
        }
    }

    @Override // X.AbstractC2255721DQs
    public T getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILLL;
    }

    public final void i3(C19A3 c19a3) {
        this.LLIZ = c19a3;
    }

    public final C1DRG G2(String str, Function1<? super C1DRF, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" UIGroupLogicComponent data{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        OCAdapterViewModel oCAdapterViewModelLJI = C1664590tQ1.LJI(str, W2(), false, this.LLILLL, 4);
        function1.invoke(oCAdapterViewModelLJI.LLILLL);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" UIGroupLogicComponent data{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return oCAdapterViewModelLJI.vQ2();
    }

    public final C539960LFq Z1(String str, Function1<? super C539960LFq, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this);
        sbLIZ.append(" UIGroupLogicComponent attach{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C539960LFq c539960LFq = new C539960LFq(C1664600tQ2.LJIIL(str, W2(), null));
        function1.invoke(c539960LFq);
        c539960LFq.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this);
        sbLIZ2.append(" UIGroupLogicComponent attach{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return c539960LFq;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0tQZ] */
    public AbstractC1664840tQQ(int i, C19A3 c19a3, C1DRG c1drg) {
        this.LL = i;
        this.LLILLJJLI = c19a3;
        this.LLILLL = c1drg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposeGroupComponent#");
        sbLIZ.append(getClass().getName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL = C20028913Yh.LJI(Boolean.FALSE);
        this.LLJ = new C0Y8U(this) { // from class: X.0tQZ
            public final /* synthetic */ AbstractC1664840tQQ<T> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.C0Y8U, X.C19AH
            public final void LJJIIZI(Scene scene) {
                if (Intrinsics.LJFF(scene, this.LIZ.W2())) {
                    this.LIZ.LLILLJJLI.unregisterChildSceneLifecycleCallbacks(this);
                    AbstractC1664840tQQ<T> abstractC1664840tQQ = this.LIZ;
                    abstractC1664840tQQ.LLIZLLLIL = false;
                    abstractC1664840tQQ.w2(abstractC1664840tQQ.W2());
                    this.LIZ.LLILZLL.setValue(Boolean.TRUE);
                }
            }
        };
    }

    public final void X1(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1824491279);
        if ((i2 & 1) != 0) {
            interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
        }
        C20084413iE.LIZ(0, 6, c13zcLJIIJ, null, new AwS604S0100000_25(this, 556), null);
        C1680540tpk.LJFF(Boolean.TRUE, new C1664870tQT(this, null), c13zcLJIIJ);
        if (this.LLILZLL.getValue().booleanValue()) {
            W1(interfaceC1685750ty92, c13zcLJIIJ, (i & 14) | 64);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS22S0202000_25((AbstractC1664840tQQ) this, interfaceC1685750ty92, (InterfaceC1685750ty9) i, i2, 5);
        }
    }
}
