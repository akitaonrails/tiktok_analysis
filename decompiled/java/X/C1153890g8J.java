package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153890g8J implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153890g8J)) {
            return false;
        }
        C1153890g8J c1153890g8J = (C1153890g8J) obj;
        return Intrinsics.LJFF(this.LL, c1153890g8J.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1153890g8J.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileEditPronounsInitData(contentName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentValue=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153890g8J() {
        this("", "");
    }

    public C1153890g8J(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
