package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeaderVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04GY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GY extends C09AY implements Function0<PdpHeaderVM> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
    public final /* synthetic */ PdpFragment LL;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(PdpFragment.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LLILLJJLI = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04GY(PdpFragment pdpFragment) {
        super(0);
        this.LL = pdpFragment;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.header.PdpHeaderVM] */
    @Override // kotlin.jvm.functions.Function0
    public final PdpHeaderVM invoke() {
        AssemVMLazy assemVMLazy;
        PdpFragment pdpFragment = this.LL;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(pdpFragment, 1384);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PdpHeaderVM.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 435);
        AFwS228S0000000_1 aFwS228S0000000_1 = AFwS228S0000000_1.get$arr$(714);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(pdpFragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), new C1622206Wu(pdpFragment, true), new C338490DOt(pdpFragment, true), awS545S0100000_1, aFwS228S0000000_1, new C451460Hn6(pdpFragment, true), new C451620HnM(pdpFragment, true), new C987103tV(pdpFragment, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(pdpFragment, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(pdpFragment, c19719912DlLIZ), c5182020e, awS545S0100000_1, aFwS228S0000000_1, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(pdpFragment, c19719912DlLIZ), c5182020e, new C452070Ho5(), C724750Sbp.LJII(pdpFragment), C724750Sbp.LJIIIZ(pdpFragment), awS545S0100000_1, aFwS228S0000000_1, new C451460Hn6(pdpFragment, false), new C451620HnM(pdpFragment, false), new C987103tV(pdpFragment, false));
        }
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLJJLI;
        return assemVMLazy.getValue();
    }
}
