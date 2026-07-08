package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AwS255S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156700gCq implements InterfaceC21327318dD {
    public volatile InterfaceC1156720gCs LIZ;

    @Override // X.InterfaceC21327318dD
    public final void LIZLLL() {
        LJI(new AbstractC1156680gCo() { // from class: X.0gCi
            public final String LIZ = "";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156620gCi) && Intrinsics.LJFF(this.LIZ, ((C1156620gCi) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LayoutChangeFinished(message=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
    }

    @Override // X.InterfaceC21327318dD
    public final void LJIJJLI() {
        LJI(new AbstractC1156680gCo() { // from class: X.0gCj
            public final String LIZ = "";

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156630gCj) && Intrinsics.LJFF(this.LIZ, ((C1156630gCj) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LoadCancelled(message=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        });
    }

    public C1156700gCq(C1160820gJU c1160820gJU) {
        this.LIZ = c1160820gJU;
    }

    @Override // X.InterfaceC21327318dD
    public final void LIZIZ(Map<String, ? extends Object> map) {
        final String string = map.toString();
        LJI(new AbstractC1156680gCo(string) { // from class: X.0gCk
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156640gCk) && Intrinsics.LJFF(this.LIZ, ((C1156640gCk) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BindDataSucceeded(message=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = string;
            }
        });
    }

    @Override // X.InterfaceC21327318dD
    public final void LIZJ(Map<String, ? extends Object> map) {
        final String string = map.toString();
        LJI(new AbstractC1156680gCo(string) { // from class: X.0gCn
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156670gCn) && Intrinsics.LJFF(this.LIZ, ((C1156670gCn) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("RenderSucceeded(message=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = string;
            }
        });
    }

    @Override // X.InterfaceC21327318dD
    public final void LJFF(String str) {
        LJI(new C1156690gCp(str));
    }

    public final void LJI(AbstractC1156680gCo abstractC1156680gCo) {
        InterfaceC1156720gCs interfaceC1156720gCs = this.LIZ;
        if (interfaceC1156720gCs == null) {
            return;
        }
        try {
            interfaceC1156720gCs.onEvent(abstractC1156680gCo);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1168400gVi.LIZIZ(new AwS255S0000000_18(th, 10));
        }
    }

    @Override // X.InterfaceC21327318dD
    public final void LIZ(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJI(new AbstractC1156680gCo(strLIZIZ) { // from class: X.0gCm
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156660gCm) && Intrinsics.LJFF(this.LIZ, ((C1156660gCm) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("LoadFailed(message=");
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(')');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            {
                this.LIZ = strLIZIZ;
            }
        });
    }

    @Override // X.InterfaceC21327318dD
    public final void LJLIIIL(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LJI(new AbstractC1156680gCo(strLIZIZ) { // from class: X.0gCr
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156710gCr) && Intrinsics.LJFF(this.LIZ, ((C1156710gCr) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RenderFailed(message=");
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(')');
                return C2188811AlT.LIZIZ(sbLIZ2);
            }

            {
                this.LIZ = strLIZIZ;
            }
        });
    }

    @Override // X.InterfaceC21327318dD
    public final void LJ(C21326518d5 c21326518d5, C21327518dF c21327518dF, final String str) {
        LJI(new AbstractC1156680gCo(str) { // from class: X.0gCl
            public final String LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1156650gCl) && Intrinsics.LJFF(this.LIZ, ((C1156650gCl) obj).LIZ);
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CreateMynaViewFinished(message=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
            }
        });
    }
}
