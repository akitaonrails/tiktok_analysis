package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158150gFB implements Serializable {
    public static final C1158160gFC Companion = new Object() { // from class: X.0gFC
    };
    public final String cursor;
    public final boolean hasMore;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158150gFB)) {
            return false;
        }
        C1158150gFB c1158150gFB = (C1158150gFB) obj;
        return Intrinsics.LJFF(this.cursor, c1158150gFB.cursor) && this.hasMore == c1158150gFB.hasMore;
    }

    public int hashCode() {
        return (this.cursor.hashCode() * 31) + C786410Ut5.Z2(this.hasMore);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureListCursor(cursor=");
        sbLIZ.append(this.cursor);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.hasMore);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158150gFB() {
        this(CardStruct.IStatusCode.DEFAULT, false);
    }

    public C1158150gFB(String str, boolean z) {
        this.cursor = str;
        this.hasMore = z;
    }
}
