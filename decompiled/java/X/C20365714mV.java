package X;

import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14mV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20365714mV {
    public final List<String> LIZ;
    public final File LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final Function1<InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>, Unit> LJ;
    public final String LJFF;
    public final String LJI;
    public final float LJII;

    public C20365714mV() {
        this(null, 0, 0.0f, null, null, null, 0.0f, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20365714mV)) {
            return false;
        }
        C20365714mV c20365714mV = (C20365714mV) obj;
        return Intrinsics.LJFF(this.LIZ, c20365714mV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20365714mV.LIZIZ) && this.LIZJ == c20365714mV.LIZJ && Float.compare(this.LIZLLL, c20365714mV.LIZLLL) == 0 && Intrinsics.LJFF(this.LJ, c20365714mV.LJ) && Intrinsics.LJFF(this.LJFF, c20365714mV.LJFF) && Intrinsics.LJFF(this.LJI, c20365714mV.LJI) && Float.compare(this.LJII, c20365714mV.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomIconImageModel(urlList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageFile=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", placeHolderColor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ratio=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", imageUrlsGetter=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", backupResourceId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", scale=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        List<String> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        File file = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (file == null ? 0 : file.hashCode())) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31;
        Function1<InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>, Unit> function1 = this.LJ;
        return ((((((iHashCode2 + (function1 != null ? function1.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C20365714mV(C0VSJ c0vsj, int i, float f, Function1 function1, String str, String str2, float f2, int i2) {
        c0vsj = (i2 & 2) != 0 ? null : c0vsj;
        i = (i2 & 4) != 0 ? 0 : i;
        f = (i2 & 8) != 0 ? 0.0f : f;
        function1 = (i2 & 16) != 0 ? null : function1;
        str = (i2 & 32) != 0 ? "" : str;
        str2 = (i2 & 64) != 0 ? "" : str2;
        f2 = (i2 & 128) != 0 ? 1.0f : f2;
        this.LIZ = null;
        this.LIZIZ = c0vsj;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = function1;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = f2;
    }
}
