package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ElJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373910ElJ {
    public final Pair<Integer, Boolean> LIZ;
    public final EnumC373860ElE LIZIZ;
    public final boolean LIZJ;
    public final List<Pair<EnumC373860ElE, Boolean>> LIZLLL;
    public final boolean LJ;
    public final List<ResourceItem> LJFF;
    public final EnumC373900ElI LJI;

    public C373910ElJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C373910ElJ)) {
            return false;
        }
        C373910ElJ c373910ElJ = (C373910ElJ) obj;
        return Intrinsics.LJFF(this.LIZ, c373910ElJ.LIZ) && this.LIZIZ == c373910ElJ.LIZIZ && this.LIZJ == c373910ElJ.LIZJ && Intrinsics.LJFF(this.LIZLLL, c373910ElJ.LIZLLL) && this.LJ == c373910ElJ.LJ && Intrinsics.LJFF(this.LJFF, c373910ElJ.LJFF) && this.LJI == c373910ElJ.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutPanelState(brushSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", curPenStyle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", autoCutoutSelected=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableBrushes=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enableBrushSize=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", resources=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fetchResourcesState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C373910ElJ(int i) {
        Boolean bool = Boolean.FALSE;
        this(new Pair(20, bool), EnumC373860ElE.NULL, false, C1697810uHb.LJIIJJI(new Pair(EnumC373860ElE.QUICK_BRUSH, bool), new Pair(EnumC373860ElE.NORMAL_BRUSH, bool), new Pair(EnumC373860ElE.ERASER, bool)), false, C13BV.INSTANCE, EnumC373900ElI.NONE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C373910ElJ(Pair<Integer, Boolean> pair, EnumC373860ElE enumC373860ElE, boolean z, List<? extends Pair<? extends EnumC373860ElE, Boolean>> list, boolean z2, List<? extends ResourceItem> list2, EnumC373900ElI enumC373900ElI) {
        this.LIZ = pair;
        this.LIZIZ = enumC373860ElE;
        this.LIZJ = z;
        this.LIZLLL = list;
        this.LJ = z2;
        this.LJFF = list2;
        this.LJI = enumC373900ElI;
    }

    public static C373910ElJ LIZ(C373910ElJ c373910ElJ, Pair pair, EnumC373860ElE enumC373860ElE, boolean z, List list, boolean z2, int i) {
        List<ResourceItem> list2;
        boolean z3 = z2;
        List list3 = list;
        boolean z4 = z;
        EnumC373860ElE enumC373860ElE2 = enumC373860ElE;
        Pair pair2 = pair;
        if ((i & 1) != 0) {
            pair2 = c373910ElJ.LIZ;
        }
        if ((i & 2) != 0) {
            enumC373860ElE2 = c373910ElJ.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c373910ElJ.LIZJ;
        }
        if ((i & 8) != 0) {
            list3 = c373910ElJ.LIZLLL;
        }
        if ((i & 16) != 0) {
            z3 = c373910ElJ.LJ;
        }
        EnumC373900ElI enumC373900ElI = null;
        if ((i & 32) != 0) {
            list2 = c373910ElJ.LJFF;
        } else {
            list2 = null;
        }
        if ((i & 64) != 0) {
            enumC373900ElI = c373910ElJ.LJI;
        }
        c373910ElJ.getClass();
        return new C373910ElJ(pair2, enumC373860ElE2, z4, list3, z3, list2, enumC373900ElI);
    }
}
