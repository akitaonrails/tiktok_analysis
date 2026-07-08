package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LwF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559050LwF {
    public final String LIZ;
    public final EnumC558870Lvx LIZIZ;
    public final EnumC558870Lvx LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final int LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C559050LwF)) {
            return false;
        }
        C559050LwF c559050LwF = (C559050LwF) obj;
        return Intrinsics.LJFF(this.LIZ, c559050LwF.LIZ) && this.LIZIZ == c559050LwF.LIZIZ && this.LIZJ == c559050LwF.LIZJ && this.LIZLLL == c559050LwF.LIZLLL && this.LJ == c559050LwF.LJ && this.LJFF == c559050LwF.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAITaskGroup(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aiCreateI2IStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", magicI2IStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasAICreateI2I=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", hasMagicI2I=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", fakeProgress=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        ArrayList arrayList = new ArrayList();
        if (this.LIZLLL) {
            arrayList.add(this.LIZIZ);
        }
        if (this.LJ) {
            arrayList.add(this.LIZJ);
        }
        if (!(!arrayList.isEmpty()) || arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (it2.next() == EnumC558870Lvx.FAILED) {
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ() {
        ArrayList arrayList = new ArrayList();
        if (this.LIZLLL) {
            arrayList.add(this.LIZIZ);
        }
        if (this.LJ) {
            arrayList.add(this.LIZJ);
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.isEmpty()) {
                return true;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (it2.next() == EnumC558870Lvx.COMPLETED) {
                }
            }
            return true;
        }
        return false;
    }

    public static C559050LwF LIZ(C559050LwF c559050LwF, EnumC558870Lvx enumC558870Lvx, EnumC558870Lvx enumC558870Lvx2, int i, int i2) {
        String str;
        boolean z;
        boolean z2;
        int i3 = i;
        EnumC558870Lvx enumC558870Lvx3 = enumC558870Lvx2;
        EnumC558870Lvx enumC558870Lvx4 = enumC558870Lvx;
        if ((i2 & 1) != 0) {
            str = c559050LwF.LIZ;
        } else {
            str = null;
        }
        if ((i2 & 2) != 0) {
            enumC558870Lvx4 = c559050LwF.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            enumC558870Lvx3 = c559050LwF.LIZJ;
        }
        if ((i2 & 8) != 0) {
            z = c559050LwF.LIZLLL;
        } else {
            z = false;
        }
        if ((i2 & 16) != 0) {
            z2 = c559050LwF.LJ;
        } else {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            i3 = c559050LwF.LJFF;
        }
        c559050LwF.getClass();
        return new C559050LwF(str, enumC558870Lvx4, enumC558870Lvx3, z, z2, i3);
    }

    public C559050LwF(String str, EnumC558870Lvx enumC558870Lvx, EnumC558870Lvx enumC558870Lvx2, boolean z, boolean z2, int i) {
        this.LIZ = str;
        this.LIZIZ = enumC558870Lvx;
        this.LIZJ = enumC558870Lvx2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = i;
    }
}
