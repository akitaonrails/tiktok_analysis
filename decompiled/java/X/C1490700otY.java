package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0otY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490700otY {
    public static final /* synthetic */ int LJFF = 0;
    public final long LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final List<C1499050p71> LIZLLL;
    public final String LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WifiRule(countryId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", subdivisionId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cityId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keywordsList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", version=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ(long j, long j2, long j3) {
        if (this.LIZ != j || this.LIZIZ != j2 || this.LIZJ != j3 || this.LJ.length() <= 0 || Intrinsics.LJFF(this.LJ, CardStruct.IStatusCode.DEFAULT) || !(!this.LIZLLL.isEmpty())) {
            return false;
        }
        return true;
    }

    public C1490700otY(long j, long j2, long j3, List<C1499050p71> list, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = j3;
        this.LIZLLL = list;
        this.LJ = str;
    }
}
