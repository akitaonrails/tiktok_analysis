package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kjp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525870Kjp implements InterfaceC525940Kjw {
    public final List<TikTokMediaModel> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525870Kjp)) {
            return false;
        }
        C525870Kjp c525870Kjp = (C525870Kjp) obj;
        return Intrinsics.LJFF(this.LIZ, c525870Kjp.LIZ) && this.LIZIZ == c525870Kjp.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchUnselected(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isUnselectAll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C525870Kjp(List<? extends TikTokMediaModel> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
