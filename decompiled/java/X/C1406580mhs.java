package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406580mhs extends AbstractC1406870miL {
    public final String LIZ;
    public final List<Image> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406580mhs)) {
            return false;
        }
        C1406580mhs c1406580mhs = (C1406580mhs) obj;
        return Intrinsics.LJFF(this.LIZ, c1406580mhs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406580mhs.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescriptionDataReady(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", images=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406580mhs(String str, List<Image> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
