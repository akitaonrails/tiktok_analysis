package X;

import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6S implements C0I6V {
    public final StickerTemplate LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I6S) && Intrinsics.LJFF(this.LIZ, ((C0I6S) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Aimoji(stickerTemplate=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I6S(StickerTemplate stickerTemplate) {
        this.LIZ = stickerTemplate;
    }
}
