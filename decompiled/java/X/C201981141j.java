package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.141j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201981141j {
    public static final void LIZ(Assembler assembler, ReusedUISlotAssem reusedUISlotAssem, Function1 function1) {
        C201982141k c201982141k = new C201982141k();
        function1.invoke(c201982141k);
        InterfaceC201984141m interfaceC201984141m = c201982141k.LIZJ;
        if (interfaceC201984141m == null) {
            interfaceC201984141m = null;
        }
        assembler.MQ2(reusedUISlotAssem, new AwS396S0200000_30(interfaceC201984141m, c201982141k, 34));
        C685070Qu1 config = interfaceC201984141m.getConfig();
        if (config != null) {
            assembler.EQ2(reusedUISlotAssem, new AwS597S0100000_18((InterfaceC111300bX) config, 742));
        }
    }
}
