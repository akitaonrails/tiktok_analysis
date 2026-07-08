package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517530KRj extends C517540KRk {
    public final String LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final long LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C517530KRj(int i, int i2, long j, String str, Map map) {
        String str2;
        Map map2 = map;
        if ((i2 & 8) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(i, 0, j, str, str2, (i2 & 32) != 0 ? new LinkedHashMap() : map2);
    }

    public C517530KRj(int i, int i2, long j, String str, String str2, Map map) {
        super(i, map);
        this.LIZLLL = str;
        this.LJ = i2;
        this.LJFF = str2;
        this.LJI = j;
    }
}
