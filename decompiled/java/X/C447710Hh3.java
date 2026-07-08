package X;

import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447710Hh3 implements InterfaceC447720Hh4 {
    public final String LIZ;
    public final VideoSticker LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C447710Hh3)) {
            return false;
        }
        C447710Hh3 c447710Hh3 = (C447710Hh3) obj;
        return Intrinsics.LJFF(this.LIZ, c447710Hh3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c447710Hh3.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        VideoSticker videoSticker = this.LIZIZ;
        return iHashCode + (videoSticker == null ? 0 : videoSticker.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Saved(stickerId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoSticker=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C447710Hh3(VideoSticker videoSticker, String str) {
        this.LIZ = str;
        this.LIZIZ = videoSticker;
    }
}
