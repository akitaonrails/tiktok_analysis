package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.090I, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C090I {
    public final ImageSynthesisResult LIZ;
    public final ImageSynthesisResult LIZIZ;
    public final ImageSynthesisResult LIZJ;
    public final ImageSynthesisResult LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C090I)) {
            return false;
        }
        C090I c090i = (C090I) obj;
        return Intrinsics.LJFF(this.LIZ, c090i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c090i.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c090i.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c090i.LIZLLL);
    }

    public final int hashCode() {
        ImageSynthesisResult imageSynthesisResult = this.LIZ;
        int iHashCode = (imageSynthesisResult == null ? 0 : imageSynthesisResult.hashCode()) * 31;
        ImageSynthesisResult imageSynthesisResult2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (imageSynthesisResult2 == null ? 0 : imageSynthesisResult2.hashCode())) * 31;
        ImageSynthesisResult imageSynthesisResult3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (imageSynthesisResult3 == null ? 0 : imageSynthesisResult3.hashCode())) * 31;
        ImageSynthesisResult imageSynthesisResult4 = this.LIZLLL;
        return iHashCode3 + (imageSynthesisResult4 != null ? imageSynthesisResult4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealSynthesisResult(blurredImage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", combinedImage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", frontImage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", backImage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C090I(ImageSynthesisResult imageSynthesisResult, ImageSynthesisResult imageSynthesisResult2, int i) {
        this(imageSynthesisResult, (i & 2) != 0 ? null : imageSynthesisResult2, null, null);
    }

    public C090I(ImageSynthesisResult imageSynthesisResult, ImageSynthesisResult imageSynthesisResult2, ImageSynthesisResult imageSynthesisResult3, ImageSynthesisResult imageSynthesisResult4) {
        this.LIZ = imageSynthesisResult;
        this.LIZIZ = imageSynthesisResult2;
        this.LIZJ = imageSynthesisResult3;
        this.LIZLLL = imageSynthesisResult4;
    }
}
