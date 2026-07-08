package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NAA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAA {
    public C0NA8 LIZ;
    public C0NA4 LIZIZ;
    public final Map<String, C0NAB> LIZJ = new LinkedHashMap();
    public final Map<String, C0NAJ> LIZLLL = new LinkedHashMap();
    public boolean LJ;

    public final void LIZIZ() {
        C0NA4 c0na4 = this.LIZIZ;
        if (c0na4 == null) {
            if (((LinkedHashMap) this.LIZJ).get("main") == null) {
                this.LIZJ.put("main", new C0NAB("main"));
                C0NAB c0nab = (C0NAB) ((LinkedHashMap) this.LIZJ).get("main");
                if (c0nab != null) {
                    c0nab.LIZIZ();
                }
                this.LIZLLL.put("main", LIZ("main"));
                return;
            }
            return;
        }
        if (this.LJ) {
            return;
        }
        for (String str : c0na4.LJ) {
            C0NAB c0nab2 = (C0NAB) ((LinkedHashMap) this.LIZJ).get(str);
            if (c0nab2 != null) {
                c0nab2.LIZIZ();
            }
            this.LIZLLL.put(str, LIZ(str));
        }
        this.LJ = true;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0NAD] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.00CZ] */
    public final C0NAD LIZ(final String str) {
        final float f = ((C0NAB) ((LinkedHashMap) this.LIZJ).get(str)).LIZ;
        final float f2 = ((C0NAB) ((LinkedHashMap) this.LIZJ).get(str)).LIZIZ;
        final float f3 = ((C0NAB) ((LinkedHashMap) this.LIZJ).get(str)).LIZJ;
        final float f4 = ((C0NAB) ((LinkedHashMap) this.LIZJ).get(str)).LIZLLL;
        final ?? r1 = new InterfaceC1510350pPF(f, f2, f3, f4, str) { // from class: X.00CZ
            public final float LIZ;
            public final float LIZIZ;
            public final float LIZJ;
            public final float LIZLLL;
            public final String LJ;

            public final int hashCode() {
                int iFloatToIntBits = ((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31;
                String str2 = this.LJ;
                return iFloatToIntBits + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PerfLevelImpl(instantValue=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", recentValue=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", stableValue=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", standardDeviation=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", scene=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(")");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1510350pPF
            public final float LIZ() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1510350pPF
            public final float LIZIZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1510350pPF
            public final float LIZJ() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1510350pPF
            public final float LIZLLL() {
                return this.LIZJ;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C00CZ) {
                        C00CZ c00cz = (C00CZ) obj;
                        if (Float.compare(this.LIZ, c00cz.LIZ) == 0 && Float.compare(this.LIZIZ, c00cz.LIZIZ) == 0 && Float.compare(this.LIZJ, c00cz.LIZJ) == 0 && Float.compare(this.LIZLLL, c00cz.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c00cz.LJ)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            }

            {
                this.LIZ = f;
                this.LIZIZ = f2;
                this.LIZJ = f3;
                this.LIZLLL = f4;
                this.LJ = str;
            }
        };
        return new C0NAJ(r1) { // from class: X.0NAD
            public final InterfaceC1510350pPF LIZ;
            public final InterfaceC1510350pPF LIZIZ = null;
            public final InterfaceC1510350pPF LIZJ = null;
            public final InterfaceC1510350pPF LIZLLL = null;
            public final InterfaceC1510350pPF LJ = null;

            public final int hashCode() {
                InterfaceC1510350pPF interfaceC1510350pPF = this.LIZ;
                int iHashCode = (interfaceC1510350pPF != null ? interfaceC1510350pPF.hashCode() : 0) * 31;
                InterfaceC1510350pPF interfaceC1510350pPF2 = this.LIZIZ;
                int iHashCode2 = (iHashCode + (interfaceC1510350pPF2 != null ? interfaceC1510350pPF2.hashCode() : 0)) * 31;
                InterfaceC1510350pPF interfaceC1510350pPF3 = this.LIZJ;
                int iHashCode3 = (iHashCode2 + (interfaceC1510350pPF3 != null ? interfaceC1510350pPF3.hashCode() : 0)) * 31;
                InterfaceC1510350pPF interfaceC1510350pPF4 = this.LIZLLL;
                int iHashCode4 = (iHashCode3 + (interfaceC1510350pPF4 != null ? interfaceC1510350pPF4.hashCode() : 0)) * 31;
                InterfaceC1510350pPF interfaceC1510350pPF5 = this.LJ;
                return iHashCode4 + (interfaceC1510350pPF5 != null ? interfaceC1510350pPF5.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PerfProfileImpl(main=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", compute=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", memory=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", network=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", power=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(")");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.C0NAJ
            public final InterfaceC1510350pPF LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = r1;
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0NAD) {
                        C0NAD c0nad = (C0NAD) obj;
                        if (Intrinsics.LJFF(this.LIZ, c0nad.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0nad.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0nad.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0nad.LIZLLL) && Intrinsics.LJFF(this.LJ, c0nad.LJ)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return true;
            }
        };
    }
}
