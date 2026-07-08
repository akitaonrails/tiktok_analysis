package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Add missing generic type declarations: [VM] */
/* JADX INFO: renamed from: X.046D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C046D<VM> extends C09AY implements Function0<VM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ BaseSkuFragment<VM> LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(BaseSkuFragment.class, "assemVM", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C046D(BaseSkuFragment<VM> baseSkuFragment) {
        super(0);
        this.LL = baseSkuFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AssemVMLazy assemVMLazy;
        BaseSkuFragment<VM> baseSkuFragment = this.LL;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((BaseSkuFragment) baseSkuFragment, 1396);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SkuPanelAssemVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 339);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(660);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(baseSkuFragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(baseSkuFragment, true), new C338490DOt(baseSkuFragment, true), awS545S0100000_1, aFwS228S0000000_1, new C451460Hn6(baseSkuFragment, true), new C451620HnM(baseSkuFragment, true), new C987103tV(baseSkuFragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(baseSkuFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(baseSkuFragment, c19719912DlLIZ), c5182020e, awS545S0100000_1, aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(baseSkuFragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(baseSkuFragment), C724750Sbp.LJIIIZ(baseSkuFragment), awS545S0100000_1, aFwS228S0000000_1, new C451460Hn6(baseSkuFragment, false), new C451620HnM(baseSkuFragment, false), new C987103tV(baseSkuFragment, false));
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return assemVMLazy.getValue();
    }
}
