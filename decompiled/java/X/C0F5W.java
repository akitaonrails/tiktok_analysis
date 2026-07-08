package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F5W, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5W {
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<TextStickerData> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F5W)) {
            return false;
        }
        C0F5W c0f5w = (C0F5W) obj;
        return this.LIZ == c0f5w.LIZ && Intrinsics.LJFF(this.LIZIZ, c0f5w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0f5w.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0f5w.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        List<TextStickerData> list = this.LIZLLL;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateResult(isEmpty=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", language=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", recognizedLanguage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", captionData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F5W(String str, String str2, List list, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = list;
    }
}
