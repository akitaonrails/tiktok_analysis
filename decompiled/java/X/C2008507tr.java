package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07tr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2008507tr extends AbstractC1223210hw7 {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final Map<String, String> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2008507tr)) {
            return false;
        }
        C2008507tr c2008507tr = (C2008507tr) obj;
        return Intrinsics.LJFF(this.LIZIZ, c2008507tr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2008507tr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c2008507tr.LIZLLL) && this.LJ == c2008507tr.LJ && this.LJFF == c2008507tr.LJFF;
    }

    public final int hashCode() {
        return (((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthorizeBindFinishTracker(enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", platform=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fbTokenExpired=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1223210hw7
    public final String LIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC1223210hw7
    public final Map<String, String> LIZIZ() {
        return this.LJII;
    }

    public /* synthetic */ C2008507tr(String str, String str2, boolean z, String str3) {
        this(str, str2, str3, z, false);
    }

    public C2008507tr(String str, String str2, String str3, boolean z, boolean z2) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = "authorize_bind_result";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("platform", str3);
        c2344009Gk.LIZJ(z2 ? 1 : 0, "fb_token_expired");
        c2344009Gk.LIZJ(z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        this.LJII = c2344009Gk.LIZ;
    }
}
