package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HhX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448010HhX {
    public final List<StickerItem> LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C448010HhX)) {
            return false;
        }
        C448010HhX c448010HhX = (C448010HhX) obj;
        return Intrinsics.LJFF(this.LIZ, c448010HhX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c448010HhX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c448010HhX.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypingRecommendationData(stickerList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", querySessionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", inputLanguage=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C448010HhX(List<StickerItem> list, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
