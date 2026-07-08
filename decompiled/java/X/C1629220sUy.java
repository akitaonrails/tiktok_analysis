package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629220sUy {
    public final List<Effect> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final Map<String, String> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1629220sUy)) {
            return false;
        }
        C1629220sUy c1629220sUy = (C1629220sUy) obj;
        return Intrinsics.LJFF(this.LIZ, c1629220sUy.LIZ) && this.LIZIZ == c1629220sUy.LIZIZ && this.LIZJ == c1629220sUy.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1629220sUy.LIZLLL) && this.LJ == c1629220sUy.LJ && this.LJFF == c1629220sUy.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        Map<String, String> map = this.LIZLLL;
        return ((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public /* synthetic */ C1629220sUy(List list, int i, int i2, int i3) {
        this(list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, null, false, (i3 & 32) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1629220sUy(List<? extends Effect> list, int i, int i2, Map<String, String> map, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = map;
        this.LJ = z;
        this.LJFF = z2;
    }
}
