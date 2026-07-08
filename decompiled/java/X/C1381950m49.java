package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.0m49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381950m49 extends AbstractC1382150m4T<IMContact> {
    public static final /* synthetic */ int LIZIZ = 0;

    public C1381950m49(C1368260li4 c1368260li4) {
        super(c1368260li4);
    }

    public final boolean LIZ(IMContact iMContact) {
        C1368260li4 c1368260li4 = this.LIZ;
        if (c1368260li4.LIZ == 1 || c1368260li4.LJI) {
            boolean z = C1264680j10.LIZ;
            if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "follow_back_on_share_panel_type", true) == 2 || C0C64.LJIILLIIL().LJIJ(31744, 0, "follow_back_on_share_panel_type", true) == 3) && (iMContact instanceof IMUser) && !C10EU.LJIIJ(((IMUser) iMContact).getFollowStatus())) {
                return false;
            }
            if ((iMContact instanceof IMUser) && ((IMUser) iMContact).getShareStatus() == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("user has been filter ");
                sbLIZ.append(iMContact.getUid());
                sbLIZ.append(" shareStatus:");
                sbLIZ.append(((IMUser) iMContact).getShareStatus());
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            if ((iMContact instanceof IMConversation) && ((IMConversation) iMContact).getConversationMemberCount() == 0) {
                return false;
            }
        }
        return true;
    }
}
