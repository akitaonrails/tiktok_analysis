package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C452920HpS extends AbstractC453140Hpo {
    public final String LIZ;
    public final String LIZIZ;
    public final List<StickerItem> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C452920HpS)) {
            return false;
        }
        C452920HpS c452920HpS = (C452920HpS) obj;
        return Intrinsics.LJFF(this.LIZ, c452920HpS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c452920HpS.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c452920HpS.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecommendationReady(receivedMessageType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stickerList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C452920HpS(String str, String str2, List<StickerItem> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
    }
}
