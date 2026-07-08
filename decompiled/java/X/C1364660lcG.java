package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364660lcG {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(541));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(540));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(542));

    public final LinkedHashSet<IMContact> LIZ() {
        return (LinkedHashSet) this.LIZIZ.getValue();
    }

    public final Set<IMContact> LIZIZ() {
        return (Set) this.LIZJ.getValue();
    }

    public final boolean LIZLLL() {
        return (((Set) this.LIZ.getValue()).size() + LIZ().size()) + LIZIZ().size() < 2;
    }

    public final void LIZJ(IMContact iMContact, boolean z) {
        IMConversation iMConversation;
        if (iMContact instanceof IMConversation) {
            iMConversation = (IMConversation) iMContact;
        } else {
            iMConversation = null;
        }
        if (iMConversation != null && AbstractC1711506n3.LIZIZ == iMConversation.getConversationType()) {
            Set set = (Set) this.LIZ.getValue();
            if (z) {
                set.add(iMContact);
                return;
            } else {
                set.remove(iMContact);
                return;
            }
        }
        if ((iMContact instanceof IMUser) && ((IMUser) iMContact).getFollowStatus() == 2) {
            C2201941BFw c2201941BFw = IMUser.Companion;
            String uid = iMContact.getUid();
            c2201941BFw.getClass();
            if (C2201941BFw.LJFF(uid)) {
                return;
            }
            LinkedHashSet<IMContact> linkedHashSetLIZ = LIZ();
            if (z) {
                linkedHashSetLIZ.add(iMContact);
                return;
            } else {
                linkedHashSetLIZ.remove(iMContact);
                return;
            }
        }
        Set<IMContact> setLIZIZ = LIZIZ();
        if (z) {
            setLIZIZ.add(iMContact);
        } else {
            setLIZIZ.remove(iMContact);
        }
    }
}
