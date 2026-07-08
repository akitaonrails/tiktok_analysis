package X;

import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsAuthCell;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsConnectNowCell;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsInviteCell;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsQRCell;
import com.ss.android.ugc.aweme.relation.ffp.ui.cell.RecFriendsSchoolCell;
import java.util.List;

/* JADX INFO: renamed from: X.0dwe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1069780dwe extends AbstractC1906720ziY {
    public List<? extends InterfaceC1891350zJl> LLIZLLLIL;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        C1697830uHd.LIZ.getClass();
        if (C1697830uHd.LIZIZ() && C1697830uHd.LIZJ(getContext()) && C286420BKm.LIZIZ) {
            LJIILIIL(RecFriendsAuthCell.class, RecFriendsConnectNowCell.class, RecFriendsInviteCell.class, RecFriendsQRCell.class, RecFriendsSchoolCell.class);
        } else {
            LJIILIIL(RecFriendsAuthCell.class, RecFriendsInviteCell.class, RecFriendsQRCell.class, RecFriendsSchoolCell.class);
        }
        List<? extends InterfaceC1891350zJl> list = this.LLIZLLLIL;
        if (list != null) {
            this.LLILZLL.LJIILL(list, null);
            this.LLIZLLLIL = null;
        }
    }
}
