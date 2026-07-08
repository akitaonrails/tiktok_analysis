package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607780Nse extends C607770Nsd {
    public final Aweme LLILLJJLI;

    @Override // X.C607770Nsd
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C607780Nse) && Intrinsics.LJFF(this.LLILLJJLI, ((C607780Nse) obj).LLILLJJLI);
    }

    @Override // X.C607770Nsd
    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeDetailVideoItem(aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C607770Nsd
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    public C607780Nse(Aweme aweme) {
        super(aweme);
        this.LLILLJJLI = aweme;
    }
}
