package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C978303s5 {
    public final LinkRichText LIZ;
    public final boolean LIZIZ;

    public C978303s5() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C978303s5)) {
            return false;
        }
        C978303s5 c978303s5 = (C978303s5) obj;
        return Intrinsics.LJFF(this.LIZ, c978303s5.LIZ) && this.LIZIZ == c978303s5.LIZIZ;
    }

    public C978303s5(LinkRichText linkRichText, boolean z) {
        this.LIZ = linkRichText;
        this.LIZIZ = z;
    }
}
