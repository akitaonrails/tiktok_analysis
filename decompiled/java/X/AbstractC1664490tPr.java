package X;

import Y.AObjectS246S0100000_25;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664490tPr<STATE, ACTION> extends UserVisibleHintGroupScene {
    public C1664690tQB<STATE> LLJJIJIIJIL;
    public ACTION LLJJIJIL;
    public boolean LLJJJ;

    public void onHide() {
    }

    public void onShow() {
    }

    public final ACTION LLLLIL() {
        ACTION action = this.LLJJIJIL;
        return action != null ? action : (ACTION) Unit.LIZ;
    }

    public final C1664690tQB<STATE> LLLLILI() {
        C1664690tQB<STATE> c1664690tQB = this.LLJJIJIIJIL;
        if (c1664690tQB != null) {
            return c1664690tQB;
        }
        return null;
    }

    public AbstractC1664490tPr() {
        disableSceneRestore();
    }

    public final void LLLLIILL() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            onShow();
        } else {
            this.LLJJJ = true;
        }
    }

    @Override // com.bytedance.scene.Scene
    public void onResume() {
        super.onResume();
        if (this.LLJJJ) {
            this.LLJJJ = false;
            onShow();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Iterator it2 = C13LP.LLIIII(getSceneList()).iterator();
        while (it2.hasNext()) {
            remove((Scene) it2.next());
        }
    }

    public static void LLLLLIL(AbstractC1664490tPr abstractC1664490tPr, Function1 function1) {
        abstractC1664490tPr.LLLLILI().LJI.LJIIIZ(abstractC1664490tPr, Lifecycle.State.STARTED, new AwS597S0100000_18(function1, (Function1<? super InterfaceC1747020vYy, Unit>) 726));
    }

    public final <TYPE> void LLLLJ(C385670FAf<TYPE> c385670FAf, Function1<? super TYPE, Unit> function1) {
        c385670FAf.LIZ(this, new AObjectS246S0100000_25(function1, 691));
    }

    public static void LLLLLILLIL(AbstractC1664490tPr abstractC1664490tPr, C1664690tQB c1664690tQB, InterfaceC2217241BqE interfaceC2217241BqE, Function1 function1) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        abstractC1664490tPr.getClass();
        c1664690tQB.LIZ(interfaceC2217241BqE).LJIIIZ(abstractC1664490tPr, state, new AwS601S0100000_22(function1, (Function1<? super Map<Integer, String>, Unit>) 649));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <K, V> void LLLLJI(C1664690tQB<K> c1664690tQB, InterfaceC2217241BqE<K, ? extends V> interfaceC2217241BqE, Lifecycle.State state, Function1<? super V, Unit> function1) {
        c1664690tQB.LIZ(interfaceC2217241BqE).LJIIIZ(this, state, new AwS604S0100000_25((Function1) function1, (Function1<? super EnumC1678550tmX, Boolean>) 557));
    }
}
