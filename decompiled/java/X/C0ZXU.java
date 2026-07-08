package X;

import android.content.Context;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZXU, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZXU implements C0ZXL {
    public final MessageBubbleStyle LIZ;
    public final C0ZXS LIZIZ;

    @Override // X.C0ZXL
    public final int LIZ(Context context) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZXU)) {
            return false;
        }
        C0ZXU c0zxu = (C0ZXU) obj;
        return Intrinsics.LJFF(this.LIZ, c0zxu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zxu.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Customize(bubbleStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZXU(MessageBubbleStyle messageBubbleStyle, C0ZXS c0zxs) {
        this.LIZ = messageBubbleStyle;
        this.LIZIZ = c0zxs;
    }
}
