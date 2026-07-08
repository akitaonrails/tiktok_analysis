package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import fyo.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1475760oVS {
    public String LIZ;
    public long LIZIZ;
    public long LIZJ;
    public List<C1475800oVW> LIZLLL;
    public String LJ;
    public e LJFF;

    public final boolean LIZ() {
        long j = this.LIZJ;
        long jMin = j > 0 ? Math.min(j, this.LIZIZ) : this.LIZIZ;
        List<C1475800oVW> list = this.LIZLLL;
        C1475800oVW c1475800oVW = list != null ? (C1475800oVW) ListProtector.get(list, ((ArrayList) list).size() - 1) : null;
        if (this.LJFF == null) {
            return c1475800oVW != null && this.LIZIZ > 0 && 0 + c1475800oVW.LIZ >= jMin;
        }
        return true;
    }

    public final long LIZIZ() {
        List<C1475800oVW> list = this.LIZLLL;
        if (list == null || ((ArrayList) list).size() <= 0) {
            return 0L;
        }
        return ((C1475800oVW) ListProtector.get(this.LIZLLL, ((ArrayList) r1).size() - 1)).LIZ;
    }
}
