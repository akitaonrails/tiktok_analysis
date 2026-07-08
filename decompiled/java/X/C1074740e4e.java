package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074740e4e extends C1074850e4p {
    public final C1074450e4B LLILZ;
    public final User LLILZIL;
    public final int LLILZLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074740e4e)) {
            return false;
        }
        C1074740e4e c1074740e4e = (C1074740e4e) obj;
        return Intrinsics.LJFF(this.LLILZ, c1074740e4e.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1074740e4e.LLILZIL) && this.LLILZLL == c1074740e4e.LLILZLL;
    }

    public final int hashCode() {
        return (((this.LLILZ.hashCode() * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FacebookMaFItem(config=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", order=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C1074850e4p
    public final int LIZ() {
        return this.LLILZLL;
    }

    @Override // X.C1074850e4p
    public final User LIZIZ() {
        return this.LLILZIL;
    }

    public C1074740e4e(C1074450e4B c1074450e4B, User user, int i) {
        super(user, i, c1074450e4B.LIZJ);
        this.LLILZ = c1074450e4B;
        this.LLILZIL = user;
        this.LLILZLL = i;
    }
}
