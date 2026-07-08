package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364800lcU extends AbstractC1364920lcg {
    public final IMContact LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1364800lcU) && Intrinsics.LJFF(this.LIZ, ((C1364800lcU) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickShareContactData(contact=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1364920lcg
    public final String LIZ() {
        IMContact iMContact = this.LIZ;
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            String strLIZJ = C1243240iSQ.LIZJ(C1243240iSQ.LIZ, iMUser, iMUser.getDisplayName());
            if (strLIZJ != null) {
                return strLIZJ;
            }
        } else {
            String displayName = iMContact.getDisplayName();
            if (displayName != null) {
                return displayName;
            }
        }
        return "";
    }

    public C1364800lcU(IMContact iMContact) {
        this.LIZ = iMContact;
    }
}
