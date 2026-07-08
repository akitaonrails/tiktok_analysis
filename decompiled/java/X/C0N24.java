package X;

import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.AwS94S1200000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N24, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N24 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0N26] */
    public static void LIZIZ(C0N27 c0n27, Aweme aweme, final String str) {
        C0N22 c0n22 = new C0N22();
        if (c0n22.LIZLLL(aweme)) {
            AwemeRawAd awemeRawAdLIZIZ = C587350N1x.LIZIZ(aweme);
            if (awemeRawAdLIZIZ != null) {
                awemeRawAdLIZIZ.setFetchFrom(str);
            }
            C2264471DkD c2264471DkD = C2264471DkD.LIZ;
            c0n22.LJFF(aweme);
            C0N23 c0n23LIZ = c0n22.LIZ(aweme);
            if (c0n23LIZ != null) {
                MeasurementContext.LIZ.getClass();
                C584230Mvl.LIZ().LJIIJ().LIZ("m_target_build", c0n23LIZ, new AwS94S1200000_9(c0n23LIZ, aweme, str, 9));
                c0n27.LIZ(new C0N28(str) { // from class: X.0N26
                    public final String LIZ;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C0N26) && Intrinsics.LJFF(this.LIZ, ((C0N26) obj).LIZ);
                    }

                    public final int hashCode() {
                        return this.LIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("MeasurementSceneFeedFlow(flowType=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    {
                        this.LIZ = str;
                    }
                }, c0n23LIZ);
            }
        }
    }

    public static final void LIZ(C0N27 c0n27, List<? extends Aweme> list, String str, String str2) {
        String str3;
        if (list != null) {
            for (Aweme aweme : list) {
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                LIZIZ(c0n27, aweme, str3);
            }
        }
    }
}
