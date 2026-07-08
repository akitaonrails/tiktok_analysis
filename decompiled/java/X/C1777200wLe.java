package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777200wLe {
    public static InterfaceC1785530wZ5 LIZ(InterfaceC1777220wLg interfaceC1777220wLg) {
        if (interfaceC1777220wLg instanceof C1556340qbQ) {
            C1556340qbQ c1556340qbQ = (C1556340qbQ) interfaceC1777220wLg;
            return new C1556360qbS(c1556340qbQ.LIZ, c1556340qbQ.LIZIZ, false);
        }
        if (interfaceC1777220wLg instanceof C1777190wLd) {
            C1777190wLd c1777190wLd = (C1777190wLd) interfaceC1777220wLg;
            return new C1777180wLc(c1777190wLd.LIZ, c1777190wLd.LIZIZ, c1777190wLd.LIZJ, c1777190wLd.LIZLLL, c1777190wLd.LJ);
        }
        if (interfaceC1777220wLg instanceof C1777160wLa) {
            C1777160wLa c1777160wLa = (C1777160wLa) interfaceC1777220wLg;
            return new C1777170wLb(c1777160wLa.LIZIZ, c1777160wLa.LIZJ, c1777160wLa.LIZ);
        }
        if (interfaceC1777220wLg instanceof C1777210wLf) {
            C1777210wLf c1777210wLf = (C1777210wLf) interfaceC1777220wLg;
            return new C1777230wLh(c1777210wLf.LIZ, c1777210wLf.LIZIZ, c1777210wLf.LIZJ, c1777210wLf.LIZLLL, c1777210wLf.LJ, null);
        }
        if (interfaceC1777220wLg instanceof C1777150wLZ) {
            final User user = ((C1777150wLZ) interfaceC1777220wLg).LIZ;
            return new InterfaceC1785530wZ5(user) { // from class: X.0wLY
                public final User LIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1777140wLY) && Intrinsics.LJFF(this.LIZ, ((C1777140wLY) obj).LIZ);
                }

                public final int hashCode() {
                    return this.LIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ShowGiftPopup(user=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = user;
                }
            };
        }
        throw new C1954807lC();
    }
}
