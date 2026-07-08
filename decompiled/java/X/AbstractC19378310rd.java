package X;

import java.util.Map;

/* JADX INFO: renamed from: X.10rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19378310rd<CACHE> implements InterfaceC19362510p5 {
    public final Map<String, ? extends AbstractC19378310rd<CACHE>> LIZ;
    public final String LIZIZ;
    public final CACHE LIZJ;
    public final long LIZLLL;
    public long LJ = System.currentTimeMillis();
    public long LJFF;
    public boolean LJI;

    public final void LIZIZ() {
        this.LJ = System.currentTimeMillis();
        this.LJFF++;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveGiftCacheBaseModel(key='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("', lastUseTimestamp=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", reuseCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC19362510p5
    public final long LIZ() {
        return this.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC19378310rd(long j, Object obj, String str, Map map) {
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = obj;
        this.LIZLLL = j;
        LIZIZ();
    }
}
