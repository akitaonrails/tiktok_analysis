package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yi5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1867990yi5 {
    public final Text LIZ;
    public final String LIZIZ;

    public C1867990yi5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867990yi5)) {
            return false;
        }
        C1867990yi5 c1867990yi5 = (C1867990yi5) obj;
        return Intrinsics.LJFF(this.LIZ, c1867990yi5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1867990yi5.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountDownText(spannableText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", normalText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1867990yi5(int i) {
        this(null, "");
    }

    public C1867990yi5(Text text, String str) {
        this.LIZ = text;
        this.LIZIZ = str;
    }
}
