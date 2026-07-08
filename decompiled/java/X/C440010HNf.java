package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440010HNf implements InterfaceC440050HNj {
    public final Emoji LIZ;
    public final int LIZIZ = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440010HNf)) {
            return false;
        }
        C440010HNf c440010HNf = (C440010HNf) obj;
        return Intrinsics.LJFF(this.LIZ, c440010HNf.LIZ) && this.LIZIZ == c440010HNf.LIZIZ;
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

    public C440010HNf(Emoji emoji) {
        this.LIZ = emoji;
    }
}
