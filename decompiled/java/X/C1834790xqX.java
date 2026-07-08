package X;

import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xqX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834790xqX {
    public final long LIZ;
    public final TextStickerConfig LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834790xqX)) {
            return false;
        }
        C1834790xqX c1834790xqX = (C1834790xqX) obj;
        return this.LIZ == c1834790xqX.LIZ && Intrinsics.LJFF(this.LIZIZ, c1834790xqX.LIZIZ) && this.LIZJ == c1834790xqX.LIZJ;
    }

    public final int hashCode() {
        int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
        TextStickerConfig textStickerConfig = this.LIZIZ;
        return ((iY2 + (textStickerConfig == null ? 0 : textStickerConfig.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextStickerStatus(fragmentId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1834790xqX(long j, TextStickerConfig textStickerConfig, boolean z) {
        this.LIZ = j;
        this.LIZIZ = textStickerConfig;
        this.LIZJ = z;
    }
}
