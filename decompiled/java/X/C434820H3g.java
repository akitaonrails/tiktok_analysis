package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H3g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434820H3g {
    public final SearchKeyFramePoint LIZ;
    public final AnonymousClass0957<Bitmap> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434820H3g)) {
            return false;
        }
        C434820H3g c434820H3g = (C434820H3g) obj;
        return Intrinsics.LJFF(this.LIZ, c434820H3g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c434820H3g.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        AnonymousClass0957<Bitmap> anonymousClass0957 = this.LIZIZ;
        return iHashCode + (anonymousClass0957 == null ? 0 : anonymousClass0957.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchKeyframeOptDir3PanelItem(keyPoint=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageDeferJob=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C434820H3g(SearchKeyFramePoint searchKeyFramePoint, AnonymousClass0957<Bitmap> anonymousClass0957) {
        this.LIZ = searchKeyFramePoint;
        this.LIZIZ = anonymousClass0957;
    }
}
