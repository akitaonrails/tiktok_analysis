package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655460PnM implements C0PWT {
    public final String LL;
    public final String LLILLJJLI;

    public C655460PnM() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655460PnM)) {
            return false;
        }
        C655460PnM c655460PnM = (C655460PnM) obj;
        return Intrinsics.LJFF(this.LL, c655460PnM.LL) && Intrinsics.LJFF(this.LLILLJJLI, c655460PnM.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchAwemeCommentTypeAction(awemeCommentType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeCommentId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().Y30().LIZIZ(C13LE.LIZ(C655460PnM.class), AFwS293S0000000_10.get$arr$(150));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C655460PnM(String str, int i) {
        String str2;
        if ((i & 1) != 0) {
            str2 = "comment_external_exposure";
        } else {
            str2 = null;
        }
        str = (i & 2) != 0 ? "" : str;
        this.LL = str2;
        this.LLILLJJLI = str;
    }
}
