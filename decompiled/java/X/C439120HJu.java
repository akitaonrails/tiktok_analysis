package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HJu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439120HJu {
    public final List<StickerItem> LIZ;
    public final IMStickerSetMetaData LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C439120HJu)) {
            return false;
        }
        C439120HJu c439120HJu = (C439120HJu) obj;
        return Intrinsics.LJFF(this.LIZ, c439120HJu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c439120HJu.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMStickerSetData(stickers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C439120HJu(IMStickerSetMetaData iMStickerSetMetaData, List list) {
        this.LIZ = list;
        this.LIZIZ = iMStickerSetMetaData;
    }
}
