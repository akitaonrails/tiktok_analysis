package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleTextModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ORw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619580ORw extends AbstractC619610ORz {
    public final String LL;
    public final String LLILLJJLI;
    public BulletinStyleTextModel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C619580ORw)) {
            return false;
        }
        C619580ORw c619580ORw = (C619580ORw) obj;
        return Intrinsics.LJFF(this.LL, c619580ORw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c619580ORw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c619580ORw.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BulletinStyleTextModel bulletinStyleTextModel = this.LLILLL;
        return iHashCode2 + (bulletinStyleTextModel != null ? bulletinStyleTextModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinCommentAddItem(avatar=");
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

    public C619580ORw(String str, String str2, BulletinStyleTextModel bulletinStyleTextModel) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bulletinStyleTextModel;
    }
}
