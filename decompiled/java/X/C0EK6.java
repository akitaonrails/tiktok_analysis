package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EK6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EK6 {
    public final TextStickerModel LIZ;
    public final TextStickerModel LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EK6)) {
            return false;
        }
        C0EK6 c0ek6 = (C0EK6) obj;
        return Intrinsics.LJFF(this.LIZ, c0ek6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ek6.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WriteTextStickerModel(sourceModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", writeModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EK6(TextStickerModel textStickerModel, TextStickerModel textStickerModel2) {
        this.LIZ = textStickerModel;
        this.LIZIZ = textStickerModel2;
    }
}
