package X;

import java.util.Map;

/* JADX INFO: renamed from: X.1Add, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183951Add {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public double LJI;
    public double LJII;
    public double LJIIIIZZ;
    public double LJIIIZ;

    public C2183951Add(Map<String, Double> map) {
        double dDoubleValue;
        double dDoubleValue2;
        double dDoubleValue3;
        double dDoubleValue4;
        double dDoubleValue5;
        Double d = map.get("rate");
        if (d != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.01d;
        }
        this.LIZ = dDoubleValue < 0.0d ? 0.0d : dDoubleValue;
        Double d2 = map.get("probe.threshold");
        if (d2 != null) {
            dDoubleValue2 = d2.doubleValue();
            if (dDoubleValue2 < 0.0d) {
                dDoubleValue2 = 0.0d;
            }
        } else {
            dDoubleValue2 = 0.0d;
        }
        this.LIZIZ = dDoubleValue2;
        Double d3 = map.get("probe.speed");
        if (d3 != null) {
            dDoubleValue3 = d3.doubleValue();
            if (dDoubleValue3 < 0.0d) {
                dDoubleValue3 = 0.0d;
            }
        } else {
            dDoubleValue3 = 0.0d;
        }
        this.LIZJ = dDoubleValue3;
        Double d4 = map.get("rush.trigger.actual");
        if (d4 != null) {
            dDoubleValue4 = d4.doubleValue();
        } else {
            dDoubleValue4 = 1.0d;
        }
        this.LIZLLL = dDoubleValue4;
        Double d5 = map.get("rush.trigger.displayed");
        this.LJ = d5 != null ? d5.doubleValue() : 0.0d;
        Double d6 = map.get("rush.rate");
        if (d6 != null) {
            dDoubleValue5 = d6.doubleValue();
        } else {
            dDoubleValue5 = 0.5d;
        }
        this.LJFF = dDoubleValue5;
    }
}
