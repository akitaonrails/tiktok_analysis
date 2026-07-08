package X;

import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04k9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1183904k9 implements InterfaceC1184004kA {
    public final View LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1183904k9) && Intrinsics.LJFF(this.LIZ, ((C1183904k9) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Custom(iconView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183904k9(SmartImageView smartImageView) {
        this.LIZ = smartImageView;
    }
}
