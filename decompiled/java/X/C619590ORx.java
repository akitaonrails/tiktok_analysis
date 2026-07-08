package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ORx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619590ORx extends AbstractC619610ORz {
    public final int LL;
    public final String LLILLJJLI;
    public BulletinStyleTextModel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C619590ORx)) {
            return false;
        }
        C619590ORx c619590ORx = (C619590ORx) obj;
        return this.LL == c619590ORx.LL && Intrinsics.LJFF(this.LLILLJJLI, c619590ORx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c619590ORx.LLILLL);
    }

    public final int hashCode() {
        int i = this.LL * 31;
        String str = this.LLILLJJLI;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        BulletinStyleTextModel bulletinStyleTextModel = this.LLILLL;
        return iHashCode + (bulletinStyleTextModel != null ? bulletinStyleTextModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentTotalItem(total=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", contentType=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", textModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC619610ORz
    public final String LIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC619610ORz
    public final void LIZIZ(BulletinStyleTextModel bulletinStyleTextModel) {
        this.LLILLL = bulletinStyleTextModel;
    }

    public C619590ORx(int i, String str, BulletinStyleTextModel bulletinStyleTextModel) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = bulletinStyleTextModel;
    }
}
