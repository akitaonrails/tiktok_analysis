package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435610H6h implements InterfaceC440090HNn {
    public final Emoji LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C435610H6h)) {
            return false;
        }
        C435610H6h c435610H6h = (C435610H6h) obj;
        return Intrinsics.LJFF(this.LIZ, c435610H6h.LIZ) && this.LIZIZ == c435610H6h.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmojiElement(emoji=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", idType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C435610H6h(Emoji emoji, int i) {
        this.LIZ = emoji;
        this.LIZIZ = i;
    }
}
