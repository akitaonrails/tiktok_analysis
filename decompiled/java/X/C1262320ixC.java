package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0ixC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262320ixC {
    public int LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public int LIZLLL;
    public AbstractC1262510ixV LJ;
    public boolean LJFF;
    public final ConcurrentHashMap<Pair<String, String>, Boolean> LJI;

    public C1262320ixC() {
        this(0);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Integer num = this.LIZIZ;
        int iHashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LIZJ;
        return ((((((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public /* synthetic */ C1262320ixC(int i) {
        this(401, null, null, -1, new AbstractC1262510ixV() { // from class: X.0ixD
            {
                EnumC1070410dxf[] enumC1070410dxfArr = new EnumC1070410dxf[0];
                AFwS207S0000000_19.get$arr$(695);
            }
        }, false, new ConcurrentHashMap());
    }

    public C1262320ixC(int i, Integer num, Integer num2, int i2, AbstractC1262510ixV abstractC1262510ixV, boolean z, ConcurrentHashMap<Pair<String, String>, Boolean> concurrentHashMap) {
        this.LIZ = i;
        this.LIZIZ = num;
        this.LIZJ = num2;
        this.LIZLLL = i2;
        this.LJ = abstractC1262510ixV;
        this.LJFF = z;
        this.LJI = concurrentHashMap;
    }
}
