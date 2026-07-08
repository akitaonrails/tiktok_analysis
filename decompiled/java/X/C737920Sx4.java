package X;

import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS96S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sx4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737920Sx4 {
    public static InterfaceC1731706qJ LIZIZ(ReusedAssem reusedAssem, Function0 function0, AwS96S1000000_11 awS96S1000000_11, Function1 function1, int i) {
        C1637906bB c1637906bB;
        Function1 function12 = function1;
        C0HHT c0hht = C0HHT.LIZ;
        AwS96S1000000_11 awS96S1000000_112 = null;
        if ((i & 4) != 0) {
            c1637906bB = C1637806bA.LIZ;
        } else {
            c1637906bB = null;
        }
        if ((i & 8) == 0) {
            awS96S1000000_112 = awS96S1000000_11;
        }
        if ((i & 32) != 0) {
            function12 = AFwS243S0000000_11.get$arr$(596);
        }
        return LIZ(reusedAssem, function0, c0hht, c1637906bB, awS96S1000000_112, null, function12);
    }

    public static final <VM extends AssemViewModel<S>, S extends InterfaceC0148002o, T extends ReusedAssem<? extends C03H5>, ITEM> InterfaceC1731706qJ<Object, VM> LIZ(T t, Function0<? extends C13IQ<VM>> function0, InterfaceC724760Sbq interfaceC724760Sbq, C1637906bB c1637906bB, Function0<String> function02, Function0<? extends ViewModelProvider.Factory> function03, Function1<? super S, ? extends S> function1) {
        Function0<? extends ViewModelProvider.Factory> c738090SxL = function03;
        Function0<String> awS550S0100000_6 = function02;
        if (awS550S0100000_6 == null) {
            awS550S0100000_6 = new AwS550S0100000_6(function0, 1053);
        }
        if (!Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ) && !Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ) && !(interfaceC724760Sbq instanceof InterfaceC451590HnJ)) {
            C0RP1 c0rp1 = C0RP1.LIZ;
            if (!Intrinsics.LJFF(interfaceC724760Sbq, c0rp1) && !Intrinsics.LJFF(interfaceC724760Sbq, C0HHT.LIZ)) {
                throw new IllegalArgumentException("Don't support this VMScope here.");
            }
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            C452080Ho6 c452080Ho6 = new C452080Ho6();
            if (c738090SxL == null) {
                c738090SxL = new C738090SxL(t);
            }
            final C737950Sx7 c737950Sx7 = new C737950Sx7(interfaceC724760Sbq, t, function0, awS550S0100000_6, c452080Ho6, c738090SxL, function1, new C451660HnQ(t), new C723690Sa7(t), new C738100SxM(t));
            t.getClass();
            if (Intrinsics.LJFF(c737950Sx7.LIZJ(), c0rp1)) {
                t.LLJILJIL = true;
            }
            t.LLJIJIL.add(c737950Sx7);
            return new InterfaceC1731706qJ() { // from class: X.0Sx6
                @Override // X.InterfaceC1731706qJ
                public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                    return c737950Sx7.LIZ();
                }
            };
        }
        return new C462960IDm(C724750Sbp.LIZ(t, function0, interfaceC724760Sbq, c1637906bB, awS550S0100000_6, function1, c738090SxL, false), 6);
    }
}
