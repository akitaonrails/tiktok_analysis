package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NND, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NND extends C0NNE {
    public final long LIZLLL;
    public final QaStruct LJ;
    public final AddYoursStickerStruct LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NND)) {
            return false;
        }
        C0NND c0nnd = (C0NND) obj;
        return this.LIZLLL == c0nnd.LIZLLL && Intrinsics.LJFF(this.LJ, c0nnd.LJ) && Intrinsics.LJFF(this.LJFF, c0nnd.LJFF) && Intrinsics.LJFF(this.LJI, c0nnd.LJI);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        AddYoursStickerStruct addYoursStickerStruct = this.LJFF;
        int iHashCode = (iY2 + (addYoursStickerStruct == null ? 0 : addYoursStickerStruct.hashCode())) * 31;
        String str = this.LJI;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QnaSticker(questionId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", qaSticker=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", addYoursSticker=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NND(long j, QaStruct qaStruct, String str) {
        super(j, str, 2);
        this.LIZLLL = j;
        this.LJ = qaStruct;
        this.LJFF = null;
        this.LJI = str;
    }
}
