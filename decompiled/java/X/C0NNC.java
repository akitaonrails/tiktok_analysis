package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NNC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNC extends C0NNE {
    public final long LIZLLL;
    public final AddYoursStickerStruct LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NNC)) {
            return false;
        }
        C0NNC c0nnc = (C0NNC) obj;
        return this.LIZLLL == c0nnc.LIZLLL && Intrinsics.LJFF(this.LJ, c0nnc.LJ) && Intrinsics.LJFF(this.LJFF, c0nnc.LJFF);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        return iY2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursSticker(tId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", addYoursSticker=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NNC(long j, AddYoursStickerStruct addYoursStickerStruct, String str) {
        super(j, str, 1);
        this.LIZLLL = j;
        this.LJ = addYoursStickerStruct;
        this.LJFF = str;
    }
}
