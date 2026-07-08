package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20522415Sc {
    public long LIZ;

    public final void LIZ(final Long l, final boolean z, final boolean z2) {
        if (this.LIZ == 0) {
            return;
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LIZ;
        C20532515Vz.LIZ(new C15W0(z, jElapsedRealtime, z2, l) { // from class: X.00HF
            public final boolean LIZIZ;
            public final long LIZJ;
            public final boolean LIZLLL;
            public final Long LJ;
            public final String LIZ = "homepage_explore";
            public final String LJFF = "prf_feed_loading_explore";

            @Override // X.C15W0
            public final Map<String, String> LIZ() {
                Pair[] pairArr = new Pair[5];
                String str = this.LIZ;
                if (str == null) {
                    str = "";
                }
                pairArr[0] = new Pair("enter_from", str);
                pairArr[1] = new Pair("is_success", this.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                pairArr[2] = new Pair("duration", String.valueOf(this.LIZJ));
                pairArr[3] = new Pair("topic_id", String.valueOf(this.LJ));
                pairArr[4] = new Pair("is_page_change", this.LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C00HF)) {
                    return false;
                }
                C00HF c00hf = (C00HF) obj;
                return Intrinsics.LJFF(this.LIZ, c00hf.LIZ) && this.LIZIZ == c00hf.LIZIZ && this.LIZJ == c00hf.LIZJ && this.LIZLLL == c00hf.LIZLLL && Intrinsics.LJFF(this.LJ, c00hf.LJ);
            }

            public final int hashCode() {
                int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
                Long l2 = this.LJ;
                return iHashCode + (l2 == null ? 0 : l2.hashCode());
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ExploreLoadMoreET(enterFrom=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", isSuccess=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", duration=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", isPageChange=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", topicId=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C15W0
            public final String getEventName() {
                return this.LJFF;
            }

            {
                this.LIZIZ = z;
                this.LIZJ = jElapsedRealtime;
                this.LIZLLL = z2;
                this.LJ = l;
            }
        });
        this.LIZ = 0L;
    }
}
