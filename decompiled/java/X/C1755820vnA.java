package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS267S0000000_26;
import kotlin.jvm.internal.AwS38S0010000_26;

/* JADX INFO: renamed from: X.0vnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1755820vnA {
    public C1750410veR LIZIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C1755680vmw LIZ = new C1755680vmw();
    public boolean LIZJ = true;

    public static void LIZIZ(C1755820vnA c1755820vnA, boolean z) {
        boolean z2;
        c1755820vnA.LIZJ = z;
        C1755680vmw c1755680vmw = c1755820vnA.LIZ;
        if (z && !c1755820vnA.LIZLLL && !c1755820vnA.LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        c1755680vmw.getClass();
        c1755680vmw.LIZ(new AwS38S0010000_26(z2, 12));
    }

    public final void LIZ(ISeaPdpCommunicationService iSeaPdpCommunicationService, boolean z) {
        C1755680vmw c1755680vmw = this.LIZ;
        c1755680vmw.getClass();
        c1755680vmw.LIZ(new AwS267S0000000_26(z, 2));
        if (iSeaPdpCommunicationService != null) {
            iSeaPdpCommunicationService.kC2(iSeaPdpCommunicationService, "pdp_sea_scroll_state_change", C2097908Jt.LIZJ(new Pair("state", Integer.valueOf(z ? 1 : 0))), null, new C1757320vpa(null));
        }
    }
}
