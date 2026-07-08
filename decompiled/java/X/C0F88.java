package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F88, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F88 {
    public final TextFontModel LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0F88)) {
            return false;
        }
        C0F88 c0f88 = (C0F88) obj;
        return Intrinsics.LJFF(this.LIZ, c0f88.LIZ) && this.LIZIZ == c0f88.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NleFontRestoreResult(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableMaskBlurColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0F88(TextFontModel textFontModel, boolean z) {
        this.LIZ = textFontModel;
        this.LIZIZ = z;
    }
}
