package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20477515Av {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final C15BE LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final List<InterfaceC20476615Am> LJ;
    public final Map<String, C15B1> LJFF;
    public C20477615Aw LJI;
    public Function1<? super Boolean, Unit> LJII;

    static {
        new C15BO();
    }

    public C20477515Av() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        C20477615Aw c20477615Aw = this.LJI;
        int iHashCode2 = (iHashCode + (c20477615Aw == null ? 0 : c20477615Aw.hashCode())) * 31;
        Function1<? super Boolean, Unit> function1 = this.LJII;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnimationGroup");
        sbLIZ.append(hashCode());
        sbLIZ.append("(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" animated:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(" parallel:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" geniusModels:");
        sbLIZ.append(this.LJ.size());
        sbLIZ.append(" geniusIdToAnimations:");
        sbLIZ.append(this.LJFF.size());
        sbLIZ.append(" beforeActionInfos:");
        C20477615Aw c20477615Aw = this.LJI;
        sbLIZ.append(c20477615Aw != null ? c20477615Aw.toString() : null);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20477515Av(C15BE c15be, boolean z, boolean z2, List list, Map map, Function1 function1, int i) {
        c15be = (i & 1) != 0 ? C15BE.NONE : c15be;
        z2 = (i & 4) != 0 ? false : z2;
        list = (i & 16) != 0 ? C13BV.INSTANCE : list;
        map = (i & 32) != 0 ? C2097608Jq.LJ() : map;
        function1 = (i & 128) != 0 ? null : function1;
        this.LIZ = c15be;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = false;
        this.LJ = list;
        this.LJFF = map;
        this.LJI = null;
        this.LJII = function1;
    }
}
