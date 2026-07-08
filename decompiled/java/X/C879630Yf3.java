package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yf3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879630Yf3 implements Serializable {
    public static final int $stable = 8;
    public final CharSequence content;
    public final boolean isCheckEmoji;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C879630Yf3)) {
            return false;
        }
        C879630Yf3 c879630Yf3 = (C879630Yf3) obj;
        return Intrinsics.LJFF(this.content, c879630Yf3.content) && this.isCheckEmoji == c879630Yf3.isCheckEmoji;
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + C786410Ut5.Z2(this.isCheckEmoji);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatListDecorationPreviewContent(content=");
        sbLIZ.append((Object) this.content);
        sbLIZ.append(", isCheckEmoji=");
        sbLIZ.append(this.isCheckEmoji);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isCheckEmoji() {
        return this.isCheckEmoji;
    }

    public C879630Yf3(CharSequence charSequence, boolean z) {
        this.content = charSequence;
        this.isCheckEmoji = z;
    }
}
