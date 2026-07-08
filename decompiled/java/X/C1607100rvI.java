package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0rvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607100rvI extends AbstractC1608790ry1<C735590StJ, C735620StM> {
    public final C735620StM LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(485));
    public RelationButton LJFF;

    public final String LJFF() {
        C735620StM c735620StM = this.LIZLLL;
        if ((c735620StM != null ? c735620StM.LIZ : null) == EnumC1606080rte.INBOX) {
            return "notification_page";
        }
        if ((c735620StM != null ? c735620StM.LIZ : null) == EnumC1606080rte.FYP_SKYLIGHT) {
            return "homepage_hot";
        }
        return (c735620StM != null ? c735620StM.LIZ : null) == EnumC1606080rte.FRIENDS_SKYLIGHT ? "homepage_friends" : "undefine";
    }

    @Override // X.AbstractC1608790ry1
    public final /* bridge */ /* synthetic */ InterfaceC426680GoE LJ() {
        return this.LIZLLL;
    }

    public C1607100rvI(C735620StM c735620StM) {
        this.LIZLLL = c735620StM;
    }

    @Override // X.AbstractC1608790ry1
    public final C1606960rv4 LIZ(InterfaceC1606880ruw interfaceC1606880ruw) {
        String uid;
        C735590StJ c735590StJ = (C735590StJ) interfaceC1606880ruw;
        RelationButton relationButton = this.LJFF;
        if (relationButton != null) {
            User user = c735590StJ.LL;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            relationButton.setTag(86573056, uid);
        }
        if (!C10EU.LJIILJJIL(c735590StJ.LL)) {
            return null;
        }
        return new C1606960rv4(new C1606970rv5(new C1609250ryl(new C1557920qdy(81, new AwS603S0100000_24(this, 654), 4), new C1608470rxV(new AwS603S0100000_24(this, 655), new AwS603S0100000_24(this, 656), 4), null, new AwS585S0100000_6(this, 384), new AwS590S0100000_11(c735590StJ, 553), new AwS377S0200000_11(c735590StJ, this, 150), false, false, null, null, 3980)));
    }
}
