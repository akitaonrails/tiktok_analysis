package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085970eMl {
    public final GiftMessage LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1085970eMl)) {
            return false;
        }
        C1085970eMl c1085970eMl = (C1085970eMl) obj;
        return Intrinsics.LJFF(this.LIZ, c1085970eMl.LIZ) && this.LIZIZ == c1085970eMl.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftMessageInterceptorChainData(input=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", disableNonSelfGift=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1085970eMl(GiftMessage giftMessage, boolean z) {
        this.LIZ = giftMessage;
        this.LIZIZ = z;
    }
}
