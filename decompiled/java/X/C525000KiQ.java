package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525000KiQ {
    public final ArrayList<TikTokMediaModel> LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525000KiQ)) {
            return false;
        }
        C525000KiQ c525000KiQ = (C525000KiQ) obj;
        return Intrinsics.LJFF(this.LIZ, c525000KiQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c525000KiQ.LIZIZ) && this.LIZJ == c525000KiQ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickTransferSnapshot(medias=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", updatedAtMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C525000KiQ(String str, long j, ArrayList arrayList) {
        this.LIZ = arrayList;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
