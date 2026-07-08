package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07si, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2001407si extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return "show_find_friends_page";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2001407si)) {
            return false;
        }
        C2001407si c2001407si = (C2001407si) obj;
        return Intrinsics.LJFF(this.LIZIZ, c2001407si.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2001407si.LIZJ) && this.LIZLLL == c2001407si.LIZLLL;
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowFindFriendTrack(pageType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", newSuggestedAccount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZJ);
        c2344009Gk.LIZJ(this.LIZLLL, "new_suggested_cnt");
        c2344009Gk.LJIIIIZZ("page_type", this.LIZIZ);
        return c2344009Gk.LIZ;
    }

    public C2001407si(String str, String str2, int i) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
    }
}
