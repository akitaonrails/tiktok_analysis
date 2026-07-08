package X;

import Y.ARunnableS106S0100000_6;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS129S0110000_11;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724750Sbp {
    public static final C452070Ho5 LIZLLL() {
        return new C452070Ho5();
    }

    public static final C1622206Wu LJI(LifecycleOwner lifecycleOwner) {
        return new C1622206Wu(lifecycleOwner, true);
    }

    public static C1622206Wu LJII(LifecycleOwner lifecycleOwner) {
        return new C1622206Wu(lifecycleOwner, false);
    }

    public static final C338490DOt LJIIIIZZ(ViewModelStoreOwner viewModelStoreOwner) {
        return new C338490DOt(viewModelStoreOwner, true);
    }

    public static C338490DOt LJIIIZ(ViewModelStoreOwner viewModelStoreOwner) {
        return new C338490DOt(viewModelStoreOwner, false);
    }

    public static final InterfaceC719640SKs LJIIJJI(AbstractC738140SxQ abstractC738140SxQ) {
        InterfaceC719640SKs interfaceC719640SKsLIZIZ = C724240Sb0.LIZIZ(abstractC738140SxQ);
        if (interfaceC719640SKsLIZIZ != null) {
            return interfaceC719640SKsLIZIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final C451620HnM LIZJ(Fragment fragment, boolean z) {
        return new C451620HnM(fragment, z);
    }

    public static final C451460Hn6 LJ(Fragment fragment, boolean z) {
        return new C451460Hn6(fragment, z);
    }

    public static final C987103tV LJFF(Fragment fragment, boolean z) {
        return new C987103tV(fragment, z);
    }

    public static final <T extends AssemViewModel<?>> Function0<C13IQ<T>> LJIIJ(LifecycleOwner lifecycleOwner, C13IQ<T> c13iq) {
        if (lifecycleOwner instanceof AbstractC738140SxQ) {
            return new C615310OBl(lifecycleOwner, c13iq);
        }
        return new C0JF6(c13iq);
    }

    public static final void LIZIZ(AbstractC738140SxQ abstractC738140SxQ, final Function0<? extends C13IQ<?>> function0, final AssemVMLazy<?, ?> assemVMLazy) {
        abstractC738140SxQ.addonParentAttachTasks$assem_release(new Runnable() { // from class: X.06Wo
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VMExtKt@263d.createVMImmediatelyIfProvideAbility$1");
                try {
                    if (InterfaceC737790Swr.class.isAssignableFrom(C09R7.LIZ(function0.invoke()))) {
                        assemVMLazy.getValue();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VMExtKt@263d.createVMImmediatelyIfProvideAbility$1");
            }
        });
    }

    public static final <S extends InterfaceC0148002o, VM extends AssemViewModel<S>> AssemVMLazy<S, VM> LIZ(AbstractC738140SxQ abstractC738140SxQ, Function0<? extends C13IQ<VM>> function0, InterfaceC724760Sbq interfaceC724760Sbq, C1637906bB c1637906bB, Function0<String> function02, Function1<? super S, ? extends S> function1, Function0<? extends ViewModelProvider.Factory> function03, boolean z) {
        AssemVMLazy<S, VM> assemVMLazy;
        Function0<? extends ViewModelProvider.Factory> c724770Sbr = function03;
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            C452070Ho5 c452070Ho5 = new C452070Ho5();
            C441701nj c441701nj = new C441701nj(abstractC738140SxQ, true);
            C1009603x8 c1009603x8 = new C1009603x8(abstractC738140SxQ, true);
            if (c724770Sbr == null) {
                c724770Sbr = new C724770Sbr(abstractC738140SxQ);
            }
            assemVMLazy = new AssemVMLazy<>(function0, function02, c452070Ho5, c441701nj, c1009603x8, c724770Sbr, function1, new C451470Hn7(abstractC738140SxQ, true), new C451610HnL(abstractC738140SxQ, true, false), new C1009503x7(abstractC738140SxQ, true));
        } else {
            if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
                if (c724770Sbr == null) {
                    c724770Sbr = new AwS550S0100000_6(abstractC738140SxQ, 1270);
                }
                return C451650HnP.LIZ(abstractC738140SxQ, (InterfaceC451590HnJ) interfaceC724760Sbq, function0, function02, c724770Sbr, function1, null, null, null);
            }
            if (Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                C452070Ho5 c452070Ho52 = new C452070Ho5();
                C441701nj c441701nj2 = new C441701nj(abstractC738140SxQ, false);
                C1009603x8 c1009603x82 = new C1009603x8(abstractC738140SxQ, false);
                if (c724770Sbr == null) {
                    c724770Sbr = new C724770Sbr(abstractC738140SxQ);
                }
                assemVMLazy = new AssemVMLazy<>(function0, function02, c452070Ho52, c441701nj2, c1009603x82, c724770Sbr, function1, new C451470Hn7(abstractC738140SxQ, false), new C451610HnL(abstractC738140SxQ, false, false), new C1009503x7(abstractC738140SxQ, false));
            } else if (Intrinsics.LJFF(interfaceC724760Sbq, C683100Qqq.LIZ)) {
                C452070Ho5 c452070Ho53 = new C452070Ho5();
                AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(abstractC738140SxQ, 1514);
                AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11(abstractC738140SxQ, 1515);
                if (c724770Sbr == null) {
                    c724770Sbr = new C724770Sbr(abstractC738140SxQ);
                }
                assemVMLazy = new AssemVMLazy<>(function0, function02, c452070Ho53, awS555S0100000_11, awS555S0100000_112, c724770Sbr, function1, new AwS129S0110000_11(abstractC738140SxQ, z, 4), new AwS129S0110000_11(abstractC738140SxQ, z, 5), new AwS555S0100000_11(abstractC738140SxQ, 1516));
            } else {
                if (interfaceC724760Sbq != null && !Intrinsics.LJFF(interfaceC724760Sbq, C03IJ.LIZ)) {
                    throw new IllegalArgumentException("Don't support this VMScope here.");
                }
                C452070Ho5 c452070Ho54 = new C452070Ho5();
                C1622206Wu c1622206WuLJII = LJII(abstractC738140SxQ);
                C338490DOt c338490DOtLJIIIZ = LJIIIZ(abstractC738140SxQ);
                if (c724770Sbr == null) {
                    c724770Sbr = new C724770Sbr(abstractC738140SxQ);
                }
                assemVMLazy = new AssemVMLazy<>(function0, function02, c452070Ho54, c1622206WuLJII, c338490DOtLJIIIZ, c724770Sbr, function1, new AwS546S0100000_2(abstractC738140SxQ, 1111), new C723690Sa7(abstractC738140SxQ), new C723700Sa8(abstractC738140SxQ));
            }
        }
        if (Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ) && c1637906bB.LIZ) {
            abstractC738140SxQ.addonParentAttachTasks$assem_release(new ARunnableS106S0100000_6(assemVMLazy, 237));
        }
        LIZIZ(abstractC738140SxQ, function0, assemVMLazy);
        return assemVMLazy;
    }
}
