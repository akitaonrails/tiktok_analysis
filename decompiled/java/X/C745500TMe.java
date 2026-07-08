package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745500TMe extends AbstractC751690TeB {
    public final String LL;

    @Override // X.AbstractC751690TeB
    public final String LIZ() {
        return "Intention Info";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C745500TMe) && Intrinsics.LJFF(this.LL, ((C745500TMe) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentIntentionInfoData(aid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C745500TMe(String str) {
        this.LL = str;
    }
}
