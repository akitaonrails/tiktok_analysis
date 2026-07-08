package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Set;

/* JADX INFO: renamed from: X.0Ylg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883740Ylg extends AbstractC883730Ylf {
    public final String LJIIL = "ProfessionalInboxChatListBridge";

    @Override // X.AbstractC883730Ylf
    public final InterfaceC1517505wr LJIILIIL() {
        return C1517305wp.LIZ;
    }

    @Override // X.AbstractC883730Ylf
    public final String LJIJ() {
        return this.LJIIL;
    }

    @Override // X.AbstractC883730Ylf
    public final void LJJ(FilterTabType filterTabType, Set<? extends EnumC880480YgQ> set) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notifySelectionChange, tabType: ");
        sbLIZ.append(filterTabType);
        sbLIZ.append(", filterTypes: ");
        sbLIZ.append(set);
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        if (C880900Yh6.LIZ()) {
            LJJII(filterTabType, set);
        } else {
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C877280YbG(this, filterTabType, set, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(com.ss.android.ugc.aweme.inbox.filter.FilterTabType r14, java.util.Set<? extends X.EnumC880480YgQ> r15) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C883740Ylg.LJJII(com.ss.android.ugc.aweme.inbox.filter.FilterTabType, java.util.Set):void");
    }
}
