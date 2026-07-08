package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aFs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927940aFs implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final User LLILLL;

    public /* synthetic */ C927940aFs() {
        this(null, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C927940aFs)) {
            return false;
        }
        C927940aFs c927940aFs = (C927940aFs) obj;
        return Intrinsics.LJFF(this.LL, c927940aFs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c927940aFs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c927940aFs.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        User user = this.LLILLL;
        return iHashCode + (user == null ? 0 : user.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyGuideState(triggerSource=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", multiRequestId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C927940aFs(User user, String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = user;
    }
}
