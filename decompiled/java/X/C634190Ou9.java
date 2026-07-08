package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS240S0000000_9;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: renamed from: X.0Ou9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634190Ou9 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final /* synthetic */ UiComposableAssem<InterfaceC0148002o> LL;
    public final /* synthetic */ C13IQ<AssemViewModel<InterfaceC0148002o>> LLILLJJLI;
    public final /* synthetic */ Function0<C636460Oxo> LLILLL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(UiComposableAssem.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634190Ou9(UiComposableAssem<InterfaceC0148002o> uiComposableAssem, C13IQ<AssemViewModel<InterfaceC0148002o>> c13iq, Function0<C636460Oxo> function0) {
        super(2);
        this.LL = uiComposableAssem;
        this.LLILLJJLI = c13iq;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            UiComposableAssem<InterfaceC0148002o> uiComposableAssem = this.LL;
            C13IQ<AssemViewModel<InterfaceC0148002o>> c13iq = this.LLILLJJLI;
            InterfaceC724760Sbq interfaceC724760Sbq = uiComposableAssem.LLIZLLLIL;
            Function0<C636460Oxo> function0 = this.LLILLL;
            AssemVMLazy assemVMLazyLIZ = C724750Sbp.LIZ(uiComposableAssem, C724750Sbp.LJIIJ(uiComposableAssem, c13iq), interfaceC724760Sbq, C1637806bA.LIZ, new C5182020e((C13IQ) c13iq, 4), AFwS240S0000000_9.get$arr$(16), function0, true);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
            this.LL.Co((InterfaceC0148002o) C1244280iU6.LIZ(assemVMLazyLIZ.getValue(), null, interfaceC1680500tpg2, 0, 7).getValue(), interfaceC1680500tpg2, 0);
        }
        return Unit.LIZ;
    }
}
