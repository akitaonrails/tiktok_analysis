package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525920Kju implements InterfaceC525940Kjw {
    public final TikTokMediaModel LIZ;
    public final List<TikTokMediaModel> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525920Kju)) {
            return false;
        }
        C525920Kju c525920Kju = (C525920Kju) obj;
        return Intrinsics.LJFF(this.LIZ, c525920Kju.LIZ) && Intrinsics.LJFF(this.LIZIZ, c525920Kju.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Selected(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", list=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C525920Kju(TikTokMediaModel tikTokMediaModel, List<? extends TikTokMediaModel> list) {
        this.LIZ = tikTokMediaModel;
        this.LIZIZ = list;
    }
}
