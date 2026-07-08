package X;

import com.ss.android.ugc.aweme.ecommerce.mix.base.BaseMixPostEvent;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;

/* JADX INFO: renamed from: X.0gPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164520gPS implements InterfaceC1165510gR3 {
    public final InterfaceC1164530gPT LIZ;
    public final IEventCenter LIZIZ = AnonymousClass0378.LIZ();

    public C1164520gPS(InterfaceC1164530gPT interfaceC1164530gPT) {
        this.LIZ = interfaceC1164530gPT;
    }

    @Override // X.InterfaceC1165510gR3
    public final void LIZ(String str) {
        this.LIZIZ.LIZLLL(str, this.LIZ);
    }

    @Override // X.InterfaceC1165510gR3
    public final void LIZIZ(String str) {
        this.LIZIZ.LIZJ(str, this.LIZ);
    }

    @Override // X.InterfaceC1165510gR3
    public final void LIZJ(BaseMixPostEvent baseMixPostEvent, String str) {
        if (C1163360gNa.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("publishEvent: eventName = ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(C1741890vQh.LJIIIIZZ(baseMixPostEvent));
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZIZ.LIZ(str, C1741890vQh.LJIIIIZZ(baseMixPostEvent));
    }
}
