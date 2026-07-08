package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00CR, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CR {
    public final C00CQ LIZ;
    public final List<StickerItem> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00CR)) {
            return false;
        }
        C00CR c00cr = (C00CR) obj;
        return this.LIZ == c00cr.LIZ && Intrinsics.LJFF(this.LIZIZ, c00cr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00cr.LIZJ);
    }

    public C00CR(C00CQ c00cq, List<StickerItem> list, String str) {
        this.LIZ = c00cq;
        this.LIZIZ = list;
        this.LIZJ = str;
    }
}
