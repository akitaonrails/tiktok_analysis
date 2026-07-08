package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eVB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091190eVB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1091210eVD LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1091190eVB(C1091210eVD c1091210eVD, int i, String str) {
        super(0);
        this.LL = c1091210eVD;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1091090eV1 c1091090eV1;
        C1091210eVD c1091210eVD = this.LL;
        DataChannel dataChannel = c1091210eVD.LL;
        String str = c1091210eVD.LLJILJILJ;
        C1091150eV7 c1091150eV7 = c1091210eVD.LLJJ;
        C255500yn.LIZIZ(this.LLILLJJLI, dataChannel, str, c1091210eVD.LLJILLL, this.LLILLL, (c1091150eV7 == null || (c1091090eV1 = c1091150eV7.LIZLLL) == null) ? false : c1091090eV1.LIZIZ);
        this.LL.LIZJ(true);
        C1091210eVD c1091210eVD2 = this.LL;
        InterfaceC1091200eVC interfaceC1091200eVC = c1091210eVD2.LLILLJJLI;
        if (interfaceC1091200eVC != null) {
            C1091150eV7 c1091150eV72 = c1091210eVD2.LLJJ;
            interfaceC1091200eVC.LIZJ(c1091150eV72 != null ? c1091150eV72.LIZJ : null, Long.valueOf(c1091210eVD2.LLJIJIL));
        }
        return Unit.LIZ;
    }
}
