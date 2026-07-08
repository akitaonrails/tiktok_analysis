package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655410PnH extends AbstractC655400PnG {
    public final Aweme LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655410PnH)) {
            return false;
        }
        C655410PnH c655410PnH = (C655410PnH) obj;
        return Intrinsics.LJFF(this.LIZ, c655410PnH.LIZ) && Intrinsics.LJFF(this.LIZIZ, c655410PnH.LIZIZ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleAd(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", moduleKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C655410PnH(Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = str;
    }
}
