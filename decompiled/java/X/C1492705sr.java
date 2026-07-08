package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1492705sr extends AbstractC1492605sq {
    public final Integer LJ;

    public C1492705sr() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1492705sr) && Intrinsics.LJFF(this.LJ, ((C1492705sr) obj).LJ);
    }

    public final int hashCode() {
        Integer num = this.LJ;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @Override // X.AbstractC1492605sq
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterVideoStickerPageEventKey(type=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1492705sr(Integer num) {
        super("im_enter_video_sticker_page_performance", String.valueOf(num), (EnumC1492905st) null, 12);
        this.LJ = num;
    }
}
