package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C799703Al {
    public final ECRichText LIZ;

    public C799703Al() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C799703Al) && Intrinsics.LJFF(this.LIZ, ((C799703Al) obj).LIZ);
    }

    public C799703Al(ECRichText eCRichText) {
        this.LIZ = eCRichText;
    }
}
