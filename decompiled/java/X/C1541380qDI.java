package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541380qDI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541380qDI(String str, boolean z, int i) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        final int i = this.LLILLL;
        final String str = this.LL;
        C1537060q6K.LJIIJJI(c1537060q6K, this.LL, "pdp_integrate_lynx_air", null, new C1537070q6L() { // from class: X.0qDH
            @Override // X.C1537070q6L
            public final void LIZJ(String str2, String str3, C1537080q6M c1537080q6M) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PdpLynxPreloadHelper, onPreloadFailed, schema=");
                sbLIZ.append(str2);
                sbLIZ.append(", reason=");
                sbLIZ.append(c1537080q6M.LIZ);
                C1326490kch.LJI(C2188811AlT.LIZIZ(sbLIZ));
                C1546360qLK.LIZLLL(C1546360qLK.LIZ, "container_pre_create", 0, i, str, c1537080q6M.LIZ, 232);
            }

            @Override // X.C1537070q6L
            public final void LIZLLL(String str2, String str3, InterfaceC1105930esx interfaceC1105930esx) {
                C1546360qLK.LIZLLL(C1546360qLK.LIZ, "container_pre_create", 1, i, str, null, 488);
            }
        }, this.LLILLJJLI, null, 32);
        return Unit.LIZ;
    }
}
