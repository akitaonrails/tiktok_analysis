package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2151308bn implements InterfaceC2753014t {
    public final AnonymousClass0957<C189200o6<Aweme>> LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2151308bn)) {
            return false;
        }
        C2151308bn c2151308bn = (C2151308bn) obj;
        return Intrinsics.LJFF(this.LL, c2151308bn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2151308bn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2151308bn.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgShortLongLinkAsyncInsertAwemeProperty(shareAweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2151308bn(C099G c099g, String str, String str2) {
        this.LL = c099g;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
