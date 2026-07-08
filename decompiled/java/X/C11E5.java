package X;

import X.C004I;
import Y.AfS198S0100000_29;
import Y.AkS490S0100000_29;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS46S0310000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11E5, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public class C11E5<S extends C004I, PROP extends C004I> {
    public C11NJ LL;
    public JediViewModel<S> LLILLJJLI;
    public InterfaceC2217241BqE<S, ? extends PROP> LLILLL;
    public Function2<? super S, ? super PROP, ? extends S> LLILZ;

    public final InterfaceC2217241BqE<S, PROP> LIZJ() {
        InterfaceC2217241BqE<S, ? extends PROP> interfaceC2217241BqE = this.LLILLL;
        if (interfaceC2217241BqE != null) {
            return interfaceC2217241BqE;
        }
        return null;
    }

    public final JediViewModel<S> LIZLLL() {
        JediViewModel<S> jediViewModel = this.LLILLJJLI;
        if (jediViewModel != null) {
            return jediViewModel;
        }
        return null;
    }

    public final <T> InterfaceC420801kM LIZIZ(C11NZ<T> c11nz, Function2<? super PROP, ? super AbstractC1252750ihl<? extends T>, ? extends PROP> function2) {
        AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(341);
        LIZLLL().dR2(new AwS395S0200000_29(this, (C11E5<C004I, C004I>) new AwS608S0100000_29(function2, 640), (Function1<C004I, C004I>) 83));
        InterfaceC420801kM interfaceC420801kMLJJLJLI = c11nz.LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29(aFwS273S0000000_29, 641), 16)).LJJLIIIIJ(new AkS490S0100000_29(AFwS273S0000000_29.get$arr$(342), 17)).LJJLJLI(new AfS198S0100000_29(new AwS46S0310000_29((ListMiddleware) this, function2, 1), 44));
        C11NJ c11nj = this.LL;
        if (c11nj == null) {
            c11nj = null;
        }
        c11nj.LIZ(interfaceC420801kMLJJLJLI);
        return interfaceC420801kMLJJLJLI;
    }

    public final void LJ(C11E9 c11e9, C2217381BqS c2217381BqS, boolean z, boolean z2, Function2 function2) {
        C11DL receiverHolder = c11e9.getReceiverHolder();
        JediViewModel<S> jediViewModelLIZLLL = LIZLLL();
        JediViewModel.QQ2(jediViewModelLIZLLL, jediViewModelLIZLLL.IQ2().LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29((InterfaceC2217241BqE) LIZJ(), 685), 23)).LJJIFFI().LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29((InterfaceC2217241BqE) c2217381BqS, 686), 22)).LJJIFFI(), c11e9.getLifecycleOwnerHolder().getLifecycleOwner(), z, z2, null, new AwS608S0100000_29(new AwS395S0200000_29(receiverHolder, (C11DL<Object>) function2, (Function2<Object, ? super Throwable, Unit>) 82), 687), 16, null);
    }

    public final void LIZ(C11E9 c11e9, C2217381BqS c2217381BqS, boolean z, boolean z2, Function2 function2, Function1 function1, Function2 function22) {
        C11DL receiverHolder = c11e9.getReceiverHolder();
        JediViewModel<S> jediViewModelLIZLLL = LIZLLL();
        LifecycleOwner lifecycleOwner = c11e9.getLifecycleOwnerHolder().getLifecycleOwner();
        InterfaceC2217241BqE<S, PROP> interfaceC2217241BqELIZJ = LIZJ();
        AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(receiverHolder, (C11DL<Object>) function2, (Function2<Object, ? super Throwable, Unit>) 77);
        AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(receiverHolder, (C11DL<Object>) function1, (Function1<Object, Unit>) 93);
        JediViewModel.QQ2(jediViewModelLIZLLL, jediViewModelLIZLLL.IQ2().LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29((InterfaceC2217241BqE) interfaceC2217241BqELIZJ, 685), 23)).LJJIFFI().LJJJJZI(new AkS490S0100000_29(new AwS608S0100000_29((InterfaceC2217241BqE) c2217381BqS, 684), 22)).LJJIFFI(), lifecycleOwner, z, z2, null, new AwS238S0300000_29(new AwS395S0200000_29(receiverHolder, (C11DL<Object>) function22, (Function2<Object, ? super Throwable, Unit>) 78), awS395S0200000_29, awS430S0200000_29, 31), 16, null);
    }
}
