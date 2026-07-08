package X;

import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08IM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08IM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C08IM() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08IM)) {
            return false;
        }
        C08IM c08im = (C08IM) obj;
        return Intrinsics.LJFF(this.LIZ, c08im.LIZ) && Intrinsics.LJFF(this.LIZIZ, c08im.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c08im.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectCapturedPhotoPathGenerator(videoDir=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", segmentDir=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageFilePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        String strLIZIZ;
        if (TextUtils.isEmpty(this.LIZ)) {
            return "";
        }
        if (TextUtils.isEmpty(this.LIZIZ)) {
            strLIZIZ = this.LIZ;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZ);
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(File.separator);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C2286708xd.LJIIIZ(new C0VSJ(strLIZIZ));
        return C786410Ut5.k4(Locale.getDefault(), "%sIMG_%s.png", Arrays.copyOf(new Object[]{strLIZIZ, this.LIZJ}, 2));
    }

    public C08IM(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
