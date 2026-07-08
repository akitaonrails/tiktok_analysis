package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332550D1x implements Serializable {
    public final String bgColor;
    public final String text;
    public final String textColor;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332550D1x)) {
            return false;
        }
        C332550D1x c332550D1x = (C332550D1x) obj;
        return Intrinsics.LJFF(this.text, c332550D1x.text) && Intrinsics.LJFF(this.bgColor, c332550D1x.bgColor) && Intrinsics.LJFF(this.textColor, c332550D1x.textColor);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.bgColor.hashCode()) * 31) + this.textColor.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiTagState(text=");
        sbLIZ.append(this.text);
        sbLIZ.append(", bgColor=");
        sbLIZ.append(this.bgColor);
        sbLIZ.append(", textColor=");
        sbLIZ.append(this.textColor);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332550D1x(String str, String str2, String str3) {
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
    }
}
