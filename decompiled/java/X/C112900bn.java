package X;

import com.bytedance.android.livesdk.model.Gift;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C112900bn {
    public final Map<Long, Gift.GiftSponsorInfo> LIZ;
    public final Set<Long> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112900bn)) {
            return false;
        }
        C112900bn c112900bn = (C112900bn) obj;
        return Intrinsics.LJFF(this.LIZ, c112900bn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c112900bn.LIZIZ);
    }

    public final int hashCode() {
        Map<Long, Gift.GiftSponsorInfo> map = this.LIZ;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegacyPanelMetadata(galleryGifts=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newUnlockGiftIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C112900bn(Map<Long, Gift.GiftSponsorInfo> map, Set<Long> set) {
        this.LIZ = map;
        this.LIZIZ = set;
    }
}
