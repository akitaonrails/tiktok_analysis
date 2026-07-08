package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xXH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822850xXH extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822850xXH(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(1);
        this.LL = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        Context context = this.LL.getContext();
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this.LL, null);
        C1823210xXr c1823210xXr = new C1823210xXr(context, interfaceC665370Q7zLJFF);
        PcsServiceBioFragmentV2 pcsServiceBioFragmentV2 = this.LL;
        if (c1823210xXr.LIZJ == null) {
            c1823210xXr.LIZJ = new C1823230xXt(new C1822490xWh());
        }
        C1822330xWR c1822330xWRNR = pcsServiceBioFragmentV2.NR();
        if ((c1822330xWRNR == null || !c1822330xWRNR.LLILZ) && c1823210xXr.LIZIZ == null) {
            c1823210xXr.LIZIZ = new C1825780xc0(context, interfaceC665370Q7zLJFF);
        }
        c062p2.LIZ = new C1823290xXz(c1823210xXr);
        return Unit.LIZ;
    }
}
