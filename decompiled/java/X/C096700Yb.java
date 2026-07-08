package X;

import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C096700Yb {
    public final C096600Ya LIZ;
    public final GiftListByCreatorResponse.Data LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096700Yb)) {
            return false;
        }
        C096700Yb c096700Yb = (C096700Yb) obj;
        return Intrinsics.LJFF(this.LIZ, c096700Yb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c096700Yb.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorGiftListCacheEntry(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C096700Yb(C096600Ya c096600Ya, GiftListByCreatorResponse.Data data) {
        this.LIZ = c096600Ya;
        this.LIZIZ = data;
    }
}
