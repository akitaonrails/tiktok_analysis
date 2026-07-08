package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlaceOrderButtonStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubtextArea;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03MQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MQ {
    public final String LIZ;
    public final ECRichText LIZIZ;
    public final SubtextArea LIZJ;
    public final PlaceOrderButtonStyle LIZLLL;
    public final Integer LJ;

    public C03MQ() {
        this(null, null, null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03MQ)) {
            return false;
        }
        C03MQ c03mq = (C03MQ) obj;
        return Intrinsics.LJFF(this.LIZ, c03mq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03mq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03mq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c03mq.LIZLLL) && Intrinsics.LJFF(this.LJ, c03mq.LJ);
    }

    public C03MQ(String str, ECRichText eCRichText, SubtextArea subtextArea, PlaceOrderButtonStyle placeOrderButtonStyle, Integer num, int i) {
        str = (i & 1) != 0 ? "" : str;
        eCRichText = (i & 2) != 0 ? null : eCRichText;
        subtextArea = (i & 4) != 0 ? null : subtextArea;
        placeOrderButtonStyle = (i & 8) != 0 ? null : placeOrderButtonStyle;
        num = (i & 16) != 0 ? null : num;
        this.LIZ = str;
        this.LIZIZ = eCRichText;
        this.LIZJ = subtextArea;
        this.LIZLLL = placeOrderButtonStyle;
        this.LJ = num;
    }
}
