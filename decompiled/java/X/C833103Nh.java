package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C833103Nh {
    public final C833003Ng LIZ;
    public final ECRichText LIZIZ;
    public final String LIZJ = "osp_tips";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C833103Nh)) {
            return false;
        }
        C833103Nh c833103Nh = (C833103Nh) obj;
        return Intrinsics.LJFF(this.LIZ, c833103Nh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c833103Nh.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c833103Nh.LIZJ);
    }

    public C833103Nh(C833003Ng c833003Ng, ECRichText eCRichText) {
        this.LIZ = c833003Ng;
        this.LIZIZ = eCRichText;
    }
}
