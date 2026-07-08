package X;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.ui.state.LiveState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS58S0500000_25;

/* JADX INFO: renamed from: X.0tV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667710tV3 {
    public static final C05P0 LIZIZ(C1664690tQB c1664690tQB, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        interfaceC1680500tpg.LJJIJIIJIL(-930981894);
        Lifecycle.State state = Lifecycle.State.STARTED;
        LiveState<STATE> liveState = c1664690tQB.LJI;
        interfaceC1680500tpg.LJJIJIIJIL(-965897311);
        C05P0 c05p0LIZ = LIZ(liveState, state, AFwS266S0000000_25.get$arr$(446), interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIJLIJ();
        interfaceC1680500tpg.LJJIJLIJ();
        return c05p0LIZ;
    }

    public static final C05P0 LIZ(LiveState liveState, Lifecycle.State state, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIJIIJIL(1928933230);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        interfaceC1680500tpg.LJJIJIIJIL(-492369756);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = C20028913Yh.LJI(function1.invoke(liveState.LIZJ()));
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        C05P0 c05p0 = (C05P0) objLJJ;
        C1680540tpk.LIZ(liveState, lifecycleOwner, new AwS58S0500000_25(liveState, (LiveState<Object>) lifecycleOwner, (LifecycleOwner) state, (Lifecycle.State) c05p0, (C05P0<Object>) function1, (Function1<Object, Object>) 8), interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIJLIJ();
        return c05p0;
    }

    public static final C05P0 LIZJ(C1664690tQB c1664690tQB, Function1 function1, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        interfaceC1680500tpg.LJJIJIIJIL(-932505465);
        C05P0 c05p0LIZ = LIZ(c1664690tQB.LJI, Lifecycle.State.STARTED, function1, interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIJLIJ();
        return c05p0LIZ;
    }
}
