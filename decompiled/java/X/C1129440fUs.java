package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129440fUs {
    public final List<GiftPage> LIZ;
    public final C157100iv LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129440fUs)) {
            return false;
        }
        C1129440fUs c1129440fUs = (C1129440fUs) obj;
        return Intrinsics.LJFF(this.LIZ, c1129440fUs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1129440fUs.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterGiftsResult(pages=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceTagIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1129440fUs(List<? extends GiftPage> list, C157100iv c157100iv) {
        this.LIZ = list;
        this.LIZIZ = c157100iv;
    }
}
