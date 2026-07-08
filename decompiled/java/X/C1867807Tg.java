package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1867807Tg {
    public final String LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1867807Tg)) {
            return false;
        }
        C1867807Tg c1867807Tg = (C1867807Tg) obj;
        return Intrinsics.LJFF(this.LIZ, c1867807Tg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1867807Tg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskGeckoPreloadRequest(accessKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", channelList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1867807Tg(String str, List<String> list) {
        this.LIZ = str;
        this.LIZIZ = list;
    }
}
