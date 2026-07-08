package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00jG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C159200jG {
    public final List<GiftPage> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C159200jG)) {
            return false;
        }
        C159200jG c159200jG = (C159200jG) obj;
        return Intrinsics.LJFF(this.LIZ, c159200jG.LIZ) && this.LIZIZ == c159200jG.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadGiftPagesResult(pages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C159200jG(List<? extends GiftPage> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
