package X;

import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model.Material;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gJD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160650gJD {
    public static final Pair<Double, Double> LIZ(Material material) {
        EnumC2005707tP enumC2005707tP = material.type;
        EnumC2005707tP enumC2005707tP2 = EnumC2005707tP.IMAGE;
        Double dValueOf = Double.valueOf(3.5d);
        Double dValueOf2 = Double.valueOf(1.5d);
        if (enumC2005707tP == enumC2005707tP2) {
            return new Pair<>(dValueOf2, dValueOf);
        }
        double d = material.duration;
        if (d < 2.5d) {
            return new Pair<>(dValueOf2, dValueOf);
        }
        double dMin = Math.min(10.0d, d);
        return new Pair<>(Double.valueOf(Math.max(2.5d, 0.6d * dMin)), Double.valueOf(dMin));
    }
}
