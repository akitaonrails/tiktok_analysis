package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.model.RegisteredContactUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074750e4f extends C1074850e4p {
    public final User LLILZ;
    public final int LLILZIL;
    public final C1074630e4T LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074750e4f)) {
            return false;
        }
        C1074750e4f c1074750e4f = (C1074750e4f) obj;
        return Intrinsics.LJFF(this.LLILZ, c1074750e4f.LLILZ) && this.LLILZIL == c1074750e4f.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1074750e4f.LLILZLL);
    }

    public final int hashCode() {
        return (((this.LLILZ.hashCode() * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContactMaFItem(user=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1074850e4p
    public final int LIZ() {
        return this.LLILZIL;
    }

    @Override // X.C1074850e4p
    public final User LIZIZ() {
        return this.LLILZ;
    }

    public C1074750e4f(RegisteredContactUser registeredContactUser, int i, C1074630e4T c1074630e4T) {
        super(registeredContactUser, i, c1074630e4T.LIZJ);
        this.LLILZ = registeredContactUser;
        this.LLILZIL = i;
        this.LLILZLL = c1074630e4T;
    }
}
