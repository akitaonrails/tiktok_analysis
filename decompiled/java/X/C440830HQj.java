package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440830HQj {
    public final StickerItem LIZ;
    public final boolean LIZIZ;
    public final AbstractC440840HQk LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440830HQj)) {
            return false;
        }
        C440830HQj c440830HQj = (C440830HQj) obj;
        return Intrinsics.LJFF(this.LIZ, c440830HQj.LIZ) && this.LIZIZ == c440830HQj.LIZIZ && Intrinsics.LJFF(this.LIZJ, c440830HQj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c440830HQj.LIZLLL);
    }

    public C440830HQj(StickerItem stickerItem, boolean z, AbstractC440840HQk abstractC440840HQk, String str) {
        this.LIZ = stickerItem;
        this.LIZIZ = z;
        this.LIZJ = abstractC440840HQk;
        this.LIZLLL = str;
    }
}
