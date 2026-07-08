package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00j5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C158100j5 extends AbstractC1493005su {
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C158100j5) && Intrinsics.LJFF(this.LIZLLL, ((C158100j5) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterVideoStickerPageEventBody(videoStickerTab=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C158100j5(String str) {
        super(C2097908Jt.LIZJ(new Pair("video_sticker_tab", str)), null, null, 6);
        this.LIZLLL = str;
    }
}
