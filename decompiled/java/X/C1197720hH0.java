package X;

import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197720hH0 {
    public final String LIZ;
    public final Long LIZIZ;
    public Long LIZJ;
    public Long LIZLLL;
    public final int LJ;
    public final C1197690hGx LJFF;
    public PoiSearchApi.PoiSearchResultWrapper LJI;

    public C1197720hH0() {
        this(null, null, null, 127);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.LIZIZ;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        C1197720hH0 c1197720hH0;
        if (obj instanceof C1197720hH0) {
            c1197720hH0 = (C1197720hH0) obj;
        } else {
            c1197720hH0 = null;
        }
        if (c1197720hH0 == null || !Intrinsics.LJFF(this.LIZ, c1197720hH0.LIZ) || !Intrinsics.LJFF(this.LIZIZ, c1197720hH0.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C1197720hH0(String str, Long l, C1197690hGx c1197690hGx, int i) {
        int i2;
        str = (i & 1) != 0 ? null : str;
        l = (i & 2) != 0 ? null : l;
        if ((i & 16) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c1197690hGx = (i & 32) != 0 ? null : c1197690hGx;
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = i2;
        this.LJFF = c1197690hGx;
        this.LJI = null;
    }
}
