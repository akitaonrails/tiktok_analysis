package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HK5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HK5 {
    public final IMStickerSetMetaData LIZ;
    public final List<StickerItem> LIZIZ;
    public final String LIZJ;

    public C0HK5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HK5)) {
            return false;
        }
        C0HK5 c0hk5 = (C0HK5) obj;
        return Intrinsics.LJFF(this.LIZ, c0hk5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hk5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0hk5.LIZJ);
    }

    public C0HK5(int i) {
        this(null, C13BV.INSTANCE, null);
    }

    public C0HK5(IMStickerSetMetaData iMStickerSetMetaData, List<StickerItem> list, String str) {
        this.LIZ = iMStickerSetMetaData;
        this.LIZIZ = list;
        this.LIZJ = str;
    }
}
