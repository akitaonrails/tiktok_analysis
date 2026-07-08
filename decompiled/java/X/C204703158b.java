package X;

import com.bytedance.android.livesdk.model.message.AnchorPair;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.158b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204703158b {
    public final UUID LIZ;
    public final UUID LIZIZ;
    public final AnchorPair LIZJ;
    public final int LIZLLL;

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorPairEvent(matchItemId=");
        sbLIZ.append((Object) this.LIZ.toString());
        sbLIZ.append(", hammerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", anchorPair=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sourceAnchorIndex=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C204703158b)) {
            return false;
        }
        C204703158b c204703158b = (C204703158b) obj;
        if (Intrinsics.LJFF(this.LIZ, c204703158b.LIZ) && Intrinsics.LJFF(this.LIZIZ, c204703158b.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c204703158b.LIZJ) && this.LIZLLL == c204703158b.LIZLLL) {
            return true;
        }
        return false;
    }

    public C204703158b(UUID uuid, UUID uuid2, AnchorPair anchorPair, int i) {
        this.LIZ = uuid;
        this.LIZIZ = uuid2;
        this.LIZJ = anchorPair;
        this.LIZLLL = i;
    }
}
