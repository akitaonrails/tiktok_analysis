package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NsZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607730NsZ extends C607770Nsd {
    public final Aweme LLILLJJLI;

    @Override // X.C607770Nsd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C607730NsZ) && Intrinsics.LJFF(this.LLILLJJLI, ((C607730NsZ) obj).LLILLJJLI);
    }

    @Override // X.C607770Nsd
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowInnerFeedItem(aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C607770Nsd
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    public C607730NsZ(Aweme aweme) {
        super(aweme);
        this.LLILLJJLI = aweme;
    }
}
