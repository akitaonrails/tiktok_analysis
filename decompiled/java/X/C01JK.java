package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsResp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01JK, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01JK extends C01JL {
    public final String LIZ;
    public final List<SuggestGuestsResp.ResponseData.SuggestUser> LIZIZ;
    public final List<SuggestGuestsResp.ResponseData.SuggestUser> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01JK)) {
            return false;
        }
        C01JK c01jk = (C01JK) obj;
        return Intrinsics.LJFF(this.LIZ, c01jk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c01jk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c01jk.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SuggestedUsersLoadSuccess(reqFrom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", suggestedFriends=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", suggestedUsers=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01JK(String str, List<SuggestGuestsResp.ResponseData.SuggestUser> list, List<SuggestGuestsResp.ResponseData.SuggestUser> list2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = list2;
    }
}
