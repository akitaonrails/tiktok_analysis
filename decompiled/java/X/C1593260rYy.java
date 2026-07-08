package X;

import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593260rYy {
    public final String LIZ;
    public final AbstractC1593300rZ2 LIZIZ;
    public String LIZJ;
    public final Map<EnumC1593230rYv, C1593240rYw> LIZLLL;
    public final Map<String, Long> LJ;
    public final Map<String, Long> LJFF;
    public String LJI;
    public WeakReference<Fragment> LJII;
    public boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public C1593260rYy() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1593260rYy)) {
            return false;
        }
        C1593260rYy c1593260rYy = (C1593260rYy) obj;
        return Intrinsics.LJFF(this.LIZ, c1593260rYy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1593260rYy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1593260rYy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1593260rYy.LIZLLL) && Intrinsics.LJFF(this.LJ, c1593260rYy.LJ) && Intrinsics.LJFF(this.LJFF, c1593260rYy.LJFF) && Intrinsics.LJFF(this.LJI, c1593260rYy.LJI) && Intrinsics.LJFF(this.LJII, c1593260rYy.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31;
        String str2 = this.LJI;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WeakReference<Fragment> weakReference = this.LJII;
        return iHashCode3 + (weakReference != null ? weakReference.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabSwitchSession(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startParams=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromTab=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pointsByType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", sceneStartByName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", sceneDurationByName=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", targetTab=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", targetFragmentRef=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZ() {
        String str = this.LJI;
        if (str != null) {
            return str;
        }
        AbstractC1593300rZ2 abstractC1593300rZ2 = this.LIZIZ;
        if (abstractC1593300rZ2 instanceof C1593250rYx) {
            return ((C1593250rYx) abstractC1593300rZ2).LJ;
        }
        if (abstractC1593300rZ2 instanceof C1593310rZ3) {
            return ((C1593310rZ3) abstractC1593300rZ2).LJ;
        }
        if (abstractC1593300rZ2 instanceof C1593320rZ4) {
            return null;
        }
        throw new C1954807lC();
    }

    public C1593260rYy(String str, AbstractC1593300rZ2 abstractC1593300rZ2, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.LIZ = str;
        this.LIZIZ = abstractC1593300rZ2;
        this.LIZJ = str2;
        this.LIZLLL = linkedHashMap;
        this.LJ = linkedHashMap2;
        this.LJFF = linkedHashMap3;
        this.LJI = null;
        this.LJII = null;
    }
}
