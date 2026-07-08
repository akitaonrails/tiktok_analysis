package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0kDF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310710kDF extends C1310800kDO {
    public final C1310810kDP LJ;

    public C1310710kDF(HashMap<String, Object> map) {
        C1310810kDP c1310810kDP;
        super(map);
        if (map.get("fsp") != null) {
            new C1310810kDP((HashMap) map.get("fsp"));
        } else {
            new C1310810kDP(new HashMap());
        }
        if (map.get("lynxFsp") != null) {
            c1310810kDP = new C1310810kDP((HashMap) map.get("lynxFsp"));
        } else {
            c1310810kDP = new C1310810kDP(new HashMap());
        }
        this.LJ = c1310810kDP;
        if (map.get("totalFsp") != null) {
            new C1310810kDP((HashMap) map.get("totalFsp"));
        } else {
            new C1310810kDP(new HashMap());
        }
        C1310750kDJ.LIZLLL("fspStatus", map);
        C1310750kDJ.LIZIZ(map, "contentFillPercentageX", Double.valueOf(-1.0d)).doubleValue();
        C1310750kDJ.LIZIZ(map, "contentFillPercentageY", Double.valueOf(-1.0d)).doubleValue();
        C1310750kDJ.LIZIZ(map, "contentFillPercentageTotalArea", Double.valueOf(-1.0d)).doubleValue();
        C1310750kDJ.LIZIZ(map, "containerFillPercentageContainerArea", Double.valueOf(-1.0d)).doubleValue();
    }
}
