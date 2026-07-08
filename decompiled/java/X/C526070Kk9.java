package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526070Kk9 implements InterfaceC526090KkB {
    public final TikTokMediaModel LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C526070Kk9)) {
            return false;
        }
        C526070Kk9 c526070Kk9 = (C526070Kk9) obj;
        return Intrinsics.LJFF(this.LIZ, c526070Kk9.LIZ) && Intrinsics.LJFF(this.LIZIZ, c526070Kk9.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        View view = this.LIZIZ;
        return iHashCode + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Click(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C526070Kk9(TikTokMediaModel tikTokMediaModel, View view) {
        this.LIZ = tikTokMediaModel;
        this.LIZIZ = view;
    }
}
