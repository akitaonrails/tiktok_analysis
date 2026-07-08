package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526060Kk8 implements InterfaceC526090KkB {
    public final int LIZ;
    public final int LIZIZ;
    public final TikTokMediaModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C526060Kk8)) {
            return false;
        }
        C526060Kk8 c526060Kk8 = (C526060Kk8) obj;
        return this.LIZ == c526060Kk8.LIZ && this.LIZIZ == c526060Kk8.LIZIZ && Intrinsics.LJFF(this.LIZJ, c526060Kk8.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        TikTokMediaModel tikTokMediaModel = this.LIZJ;
        return i + (tikTokMediaModel == null ? 0 : tikTokMediaModel.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Swap(from=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", to=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromModel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C526060Kk8(int i, int i2, TikTokMediaModel tikTokMediaModel) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = tikTokMediaModel;
    }
}
