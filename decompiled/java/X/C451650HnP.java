package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HnP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C451650HnP {
    public static final C451600HnK LIZJ(C01GW<C451600HnK> c01gw) {
        return c01gw.getValue();
    }

    public static final <S extends InterfaceC0148002o, VM extends AssemViewModel<S>> AssemVMLazy<S, VM> LIZ(LifecycleOwner lifecycleOwner, InterfaceC451590HnJ interfaceC451590HnJ, Function0<? extends C13IQ<VM>> function0, Function0<String> function02, Function0<? extends ViewModelProvider.Factory> function03, Function1<? super S, ? extends S> function1, Function0<C0RTY> function04, Function0<C724710Sbl> function05, Function0<? extends InterfaceC665370Q7z> function06) {
        Function0<? extends InterfaceC665370Q7z> awS550S0100000_6 = function06;
        Function0<C724710Sbl> awS550S0100000_62 = function05;
        Function0<C0RTY> awS550S0100000_63 = function04;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS407S0200000_6(interfaceC451590HnJ, lifecycleOwner, 55));
        AwS550S0100000_6 awS550S0100000_64 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1105);
        AwS550S0100000_6 awS550S0100000_65 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1108);
        if (awS550S0100000_63 == null) {
            awS550S0100000_63 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1104);
        }
        if (awS550S0100000_62 == null) {
            awS550S0100000_62 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1106);
        }
        if (awS550S0100000_6 == null) {
            awS550S0100000_6 = new AwS550S0100000_6(c01gwLIZIZ, (C01GW<C456970Hvz>) 1107);
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
        return new AssemVMLazy<>(function0, function02, new C452080Ho6(), awS550S0100000_64, awS550S0100000_65, function03, function1, awS550S0100000_63, awS550S0100000_62, awS550S0100000_6);
    }
}
