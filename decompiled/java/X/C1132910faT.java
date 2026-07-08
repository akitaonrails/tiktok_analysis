package X;

import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0faT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132910faT {
    public final long LIZ;
    public final String LIZIZ;
    public final Gift LIZJ;
    public final GiftMessage LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132910faT)) {
            return false;
        }
        C1132910faT c1132910faT = (C1132910faT) obj;
        return this.LIZ == c1132910faT.LIZ && Intrinsics.LJFF(this.LIZIZ, c1132910faT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1132910faT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1132910faT.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Record(giftId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uniqueId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", gift=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1132910faT(long j, String str, Gift gift, GiftMessage giftMessage) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = gift;
        this.LIZLLL = giftMessage;
    }
}
