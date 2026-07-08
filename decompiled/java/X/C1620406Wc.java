package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1620406Wc extends C06OO {
    public final String LIZJ;
    public final List<StickerItem> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1620406Wc)) {
            return false;
        }
        C1620406Wc c1620406Wc = (C1620406Wc) obj;
        return Intrinsics.LJFF(this.LIZJ, c1620406Wc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1620406Wc.LIZLLL);
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoCommentStickerRecommendationMessageTask(awemeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1620406Wc(String str, List<StickerItem> list) {
        super(EnumC1596306Mv.PHOTO_COMMENT_STICKER_RECOMMENDATION_MESSAGE);
        this.LIZJ = str;
        this.LIZLLL = list;
    }
}
