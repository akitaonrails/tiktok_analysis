package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183090gtP implements Serializable {
    public static final C1183140gtU Companion = new Object() { // from class: X.0gtU
    };
    public final String cursor;
    public final String dataVersion;
    public final boolean hasMore;

    public C1183090gtP() {
        this(CardStruct.IStatusCode.DEFAULT, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183090gtP)) {
            return false;
        }
        C1183090gtP c1183090gtP = (C1183090gtP) obj;
        return Intrinsics.LJFF(this.cursor, c1183090gtP.cursor) && Intrinsics.LJFF(this.dataVersion, c1183090gtP.dataVersion) && this.hasMore == c1183090gtP.hasMore;
    }

    public int hashCode() {
        int iHashCode = this.cursor.hashCode() * 31;
        String str = this.dataVersion;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailCursor(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", dataVersion=");
        sbLIZ.append(this.dataVersion);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1183090gtP(String str, String str2, boolean z) {
        this.cursor = str;
        this.dataVersion = str2;
        this.hasMore = z;
    }
}
