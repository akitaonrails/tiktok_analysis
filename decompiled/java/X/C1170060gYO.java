package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS632S0100000_18;

/* JADX INFO: renamed from: X.0gYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170060gYO {
    public static <VM1 extends JediViewModel<S1>, S1 extends C004I> S1 LIZ(InterfaceC1166920gTK interfaceC1166920gTK, VM1 vm1) {
        C259800zU c259800zU = new C259800zU();
        interfaceC1166920gTK.withState(vm1, new AwS597S0100000_18(c259800zU, (C259800zU<List<Aweme>>) 806));
        return (S1) c259800zU.element;
    }

    public static <S extends C004I, A> void LIZIZ(InterfaceC1166920gTK interfaceC1166920gTK, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        interfaceC1166920gTK.selectSubscribe(jediViewModel, interfaceC2217241BqE, c1765020w20, new AwS632S0100000_18(function2, 247));
    }

    public static <S extends C004I, A> void LIZLLL(InterfaceC1166920gTK interfaceC1166920gTK, JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        interfaceC1166920gTK.selectNonNullSubscribe(jediViewModel, interfaceC2217241BqE, c1765020w20, new AwS632S0100000_18(function2, 248));
    }
}
