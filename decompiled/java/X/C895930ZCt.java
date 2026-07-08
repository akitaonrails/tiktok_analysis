package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895930ZCt extends AbstractC895970ZCx {
    public final IMUser LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C895930ZCt) && Intrinsics.LJFF(this.LIZ, ((C895930ZCt) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewProfile(user=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C895930ZCt(IMUser iMUser) {
        this.LIZ = iMUser;
    }
}
