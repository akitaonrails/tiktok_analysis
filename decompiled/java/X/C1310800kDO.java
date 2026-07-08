package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0kDO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1310800kDO {
    public final String LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public final HashMap<String, Object> LIZLLL;

    public C1310800kDO(HashMap<String, Object> map) {
        this.LIZ = C1310750kDJ.LIZLLL("name", map);
        this.LIZIZ = C1310750kDJ.LIZLLL("entryType", map);
        this.LIZJ = C1310750kDJ.LIZ(map, "typeResolved", Boolean.TRUE).booleanValue();
        this.LIZLLL = map;
    }
}
