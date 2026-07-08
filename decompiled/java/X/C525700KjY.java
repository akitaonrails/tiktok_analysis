package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525700KjY {
    public final List<TikTokMediaModel> LIZ;
    public final C0L99 LIZIZ;
    public final boolean LIZJ;
    public final ShortVideoContext LIZLLL;
    public final Intent LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C525700KjY)) {
            return false;
        }
        C525700KjY c525700KjY = (C525700KjY) obj;
        return Intrinsics.LJFF(this.LIZ, c525700KjY.LIZ) && this.LIZIZ == c525700KjY.LIZIZ && this.LIZJ == c525700KjY.LIZJ && Intrinsics.LJFF(this.LIZLLL, c525700KjY.LIZLLL) && Intrinsics.LJFF(this.LJ, c525700KjY.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        ShortVideoContext shortVideoContext = this.LIZLLL;
        return ((iHashCode + (shortVideoContext == null ? 0 : shortVideoContext.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NextStepRequest(selectedList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromPreview=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shortVideoContext=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C525700KjY(List<? extends TikTokMediaModel> list, C0L99 c0l99, boolean z, ShortVideoContext shortVideoContext, Intent intent) {
        this.LIZ = list;
        this.LIZIZ = c0l99;
        this.LIZJ = z;
        this.LIZLLL = shortVideoContext;
        this.LJ = intent;
    }
}
