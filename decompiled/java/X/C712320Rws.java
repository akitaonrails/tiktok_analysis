package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712320Rws implements InterfaceC0148002o {
    public final Pair<Integer, String> LL;
    public final Aweme LLILLJJLI;

    public C712320Rws() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C712320Rws)) {
            return false;
        }
        C712320Rws c712320Rws = (C712320Rws) obj;
        return Intrinsics.LJFF(this.LL, c712320Rws.LL) && Intrinsics.LJFF(this.LLILLJJLI, c712320Rws.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Aweme aweme = this.LLILLJJLI;
        return iHashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryToPostState(state=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C712320Rws(int i) {
        this(new Pair(0, null), null);
    }

    public C712320Rws(Pair<Integer, String> pair, Aweme aweme) {
        this.LL = pair;
        this.LLILLJJLI = aweme;
    }

    public static C712320Rws LIZ(C712320Rws c712320Rws, Pair pair) {
        Aweme aweme = c712320Rws.LLILLJJLI;
        c712320Rws.getClass();
        return new C712320Rws(pair, aweme);
    }
}
