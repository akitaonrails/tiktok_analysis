package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612550O0v {
    public final C1233510iCj LIZ;
    public final AbstractC1623806Xk<User> LIZIZ;

    public C612550O0v() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C612550O0v)) {
            return false;
        }
        C612550O0v c612550O0v = (C612550O0v) obj;
        return Intrinsics.LJFF(this.LIZ, c612550O0v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c612550O0v.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharerState(linkParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sharer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C612550O0v(int i) {
        this(null, C491101vh.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C612550O0v(C1233510iCj c1233510iCj, AbstractC1623806Xk<? extends User> abstractC1623806Xk) {
        this.LIZ = c1233510iCj;
        this.LIZIZ = abstractC1623806Xk;
    }
}
