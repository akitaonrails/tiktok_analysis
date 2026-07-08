package X;

import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248950ibd implements InterfaceC111300bX {
    public final int LL;
    public ProfileComponents LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1248950ibd)) {
            return false;
        }
        C1248950ibd c1248950ibd = (C1248950ibd) obj;
        return this.LL == c1248950ibd.LL && Intrinsics.LJFF(this.LLILLJJLI, c1248950ibd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1248950ibd.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileComponentData(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", assemTag=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1248950ibd(int i, ProfileComponents profileComponents, String str) {
        this.LL = i;
        this.LLILLJJLI = profileComponents;
        this.LLILLL = str;
    }
}
