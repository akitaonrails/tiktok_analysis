package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345260DgC {
    public final List<TikTokMediaModel> LIZ;
    public final Intent LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C345260DgC)) {
            return false;
        }
        C345260DgC c345260DgC = (C345260DgC) obj;
        return Intrinsics.LJFF(this.LIZ, c345260DgC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c345260DgC.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumFinishResult(selectedList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", intent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C345260DgC(Intent intent, List list) {
        this.LIZ = list;
        this.LIZIZ = intent;
    }
}
