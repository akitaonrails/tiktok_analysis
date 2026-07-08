package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2000307sX extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final String LIZJ = "invite_friend_click";
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2000307sX) && Intrinsics.LJFF(this.LIZIZ, ((C2000307sX) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteFriendsClickTrack(enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LIZLLL;
    }

    public C2000307sX(String str) {
        this.LIZIZ = str;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        this.LIZLLL = c2344009Gk.LIZ;
    }
}
