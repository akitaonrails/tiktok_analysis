package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0PrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657850PrD {
    public static final void LIZ(Assembler assembler, ReusedUISlotAssem reusedUISlotAssem, Function1 function1) {
        C657800Pr8 c657800Pr8 = new C657800Pr8();
        function1.invoke(c657800Pr8);
        InterfaceC657860PrE interfaceC657860PrE = c657800Pr8.LIZJ;
        if (interfaceC657860PrE == null) {
            interfaceC657860PrE = null;
        }
        assembler.LQ2(reusedUISlotAssem, new AwS376S0200000_10(interfaceC657860PrE, c657800Pr8, 32));
        InterfaceC111300bX config = interfaceC657860PrE.getConfig();
        if (config != null) {
            assembler.EQ2(reusedUISlotAssem, new AwS589S0100000_10(config, 143));
        }
    }

    public static final <REUSED extends ReusedUIAssem<? extends C03H5>> void LIZIZ(Assembler assembler, REUSED reused, Function1<? super C657820PrA, Unit> function1) {
        C657820PrA c657820PrA = new C657820PrA();
        function1.invoke(c657820PrA);
        InterfaceC657870PrF interfaceC657870PrF = c657820PrA.LIZJ;
        if (interfaceC657870PrF == null) {
            interfaceC657870PrF = null;
        }
        assembler.MQ2(reused, new AwS376S0200000_10(interfaceC657870PrF, c657820PrA, 33));
        InterfaceC111300bX config = interfaceC657870PrF.getConfig();
        if (config != null) {
            assembler.EQ2(reused, new AwS585S0100000_6(config, 149));
        }
    }

    public static final void LIZJ(Assembler assembler, AmeBaseFragment ameBaseFragment, Function1 function1) {
        C657810Pr9 c657810Pr9 = new C657810Pr9();
        function1.invoke(c657810Pr9);
        InterfaceC657840PrC interfaceC657840PrC = c657810Pr9.LIZJ;
        if (interfaceC657840PrC == null) {
            interfaceC657840PrC = null;
        }
        assembler.QQ2(ameBaseFragment, new AwS376S0200000_10(interfaceC657840PrC, c657810Pr9, 35));
        InterfaceC111300bX config = interfaceC657840PrC.getConfig();
        if (config != null) {
            assembler.DQ2(ameBaseFragment, new AwS589S0100000_10(config, 145));
        }
    }
}
