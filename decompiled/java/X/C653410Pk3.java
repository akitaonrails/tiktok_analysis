package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pk3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653410Pk3 implements InterfaceC653430Pk5 {
    public final /* synthetic */ C654980Pma LIZ;

    @Override // X.InterfaceC653430Pk5
    public final void LIZ() {
    }

    public C653410Pk3(C654980Pma c654980Pma) {
        this.LIZ = c654980Pma;
    }

    @Override // X.InterfaceC653430Pk5
    public final void LIZIZ(Aweme aweme) {
        InterfaceC648720PcU interfaceC648720PcU;
        C652630Pin c652630PinLIZIZ = C653830Pkj.LIZIZ(this.LIZ.LLJI);
        if (c652630PinLIZIZ != null) {
            interfaceC648720PcU = c652630PinLIZIZ.LL;
        } else {
            interfaceC648720PcU = null;
        }
        C654980Pma c654980Pma = this.LIZ;
        if (interfaceC648720PcU != null) {
            Intrinsics.LJFF(interfaceC648720PcU.isActive(), Boolean.TRUE);
        }
        c654980Pma.getClass();
        this.LIZ.LLJIJIL.LIZIZ();
        InterfaceC653430Pk5 interfaceC653430Pk5 = this.LIZ.LLJJIJI;
        if (interfaceC653430Pk5 != null) {
            interfaceC653430Pk5.LIZIZ(aweme);
        }
    }
}
