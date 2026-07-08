package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.StylePrompt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EEF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EEF {
    public final StylePrompt LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EEF)) {
            return false;
        }
        C0EEF c0eef = (C0EEF) obj;
        return Intrinsics.LJFF(this.LIZ, c0eef.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0eef.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0eef.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0eef.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        Integer num = this.LIZLLL;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCStyle(stylePrompt=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", styleEffectId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", styleName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stylePosition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0EEF(StylePrompt stylePrompt, String str, String str2, Integer num) {
        this.LIZ = stylePrompt;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = num;
    }
}
