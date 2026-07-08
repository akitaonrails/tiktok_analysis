package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0kDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310810kDP {
    public final double LIZ;

    public C1310810kDP(HashMap<String, Object> map) {
        C1310750kDJ.LIZLLL("name", map);
        Double dValueOf = Double.valueOf(-1.0d);
        C1310750kDJ.LIZIZ(map, "duration", dValueOf).doubleValue();
        C1310750kDJ.LIZLLL("startTimestampName", map);
        C1310750kDJ.LIZIZ(map, "startTimestamp", dValueOf).doubleValue();
        C1310750kDJ.LIZLLL("endTimestampName", map);
        this.LIZ = C1310750kDJ.LIZIZ(map, "endTimestamp", dValueOf).doubleValue();
    }
}
