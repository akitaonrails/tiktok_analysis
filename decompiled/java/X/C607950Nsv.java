package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607950Nsv extends C607770Nsd {
    public final Aweme LLILLJJLI;

    @Override // X.C607770Nsd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C607950Nsv) && Intrinsics.LJFF(this.LLILLJJLI, ((C607950Nsv) obj).LLILLJJLI);
    }

    @Override // X.C607770Nsd
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailVideoItem(aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C607770Nsd
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    public C607950Nsv(Aweme aweme) {
        super(aweme);
        this.LLILLJJLI = aweme;
    }
}
