package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525890Kjr implements InterfaceC525940Kjw {
    public final List<TikTokMediaModel> LIZ;
    public final List<TikTokMediaModel> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525890Kjr)) {
            return false;
        }
        C525890Kjr c525890Kjr = (C525890Kjr) obj;
        return Intrinsics.LJFF(this.LIZ, c525890Kjr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c525890Kjr.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BatchSelected(models=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fullList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C525890Kjr(List<? extends TikTokMediaModel> list, List<? extends TikTokMediaModel> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
