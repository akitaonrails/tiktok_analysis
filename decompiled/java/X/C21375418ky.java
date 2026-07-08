package X;

import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18ky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21375418ky extends AbstractC1784370wXD {
    public final EnumC21376018l4 LIZ;
    public final Icon LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21375418ky)) {
            return false;
        }
        C21375418ky c21375418ky = (C21375418ky) obj;
        return this.LIZ == c21375418ky.LIZ && Intrinsics.LJFF(this.LIZIZ, c21375418ky.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TagIconData(labelSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21375418ky(EnumC21376018l4 enumC21376018l4, Icon icon) {
        int iLIZIZ;
        int i;
        int i2;
        this.LIZ = enumC21376018l4;
        this.LIZIZ = icon;
        int i3 = C21376118l5.LIZ[enumC21376018l4.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (C21375518kz.LIZIZ) {
                        i2 = 14;
                    } else {
                        i2 = 13;
                    }
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                } else {
                    throw new C1954807lC();
                }
            } else {
                if (C21375518kz.LIZIZ) {
                    i = 12;
                } else {
                    i = 11;
                }
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        this.LIZJ = iLIZIZ;
    }
}
