package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D8E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D8E {
    public final Context LIZ;
    public final String LIZIZ;
    public final Aweme LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D8E)) {
            return false;
        }
        C0D8E c0d8e = (C0D8E) obj;
        return Intrinsics.LJFF(this.LIZ, c0d8e.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d8e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d8e.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Aweme aweme = this.LIZJ;
        return iHashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckoutFallbackRequest(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", continueUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D8E(Context context, Aweme aweme, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = aweme;
    }
}
