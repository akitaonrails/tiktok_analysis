package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359700E8i {
    public final float LIZ;
    public final Integer LIZIZ;
    public final ArrayList<Pair<Long, Long>> LIZJ;
    public final int LIZLLL;

    public C359700E8i() {
        this(0.0f, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C359700E8i)) {
            return false;
        }
        C359700E8i c359700E8i = (C359700E8i) obj;
        return Float.compare(this.LIZ, c359700E8i.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c359700E8i.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c359700E8i.LIZJ) && this.LIZLLL == c359700E8i.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SmartTrimStates(minScaleRatio=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tipMessageResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scrollPos=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
        Integer num = this.LIZIZ;
        return ((((iFloatToIntBits + (num == null ? 0 : num.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public /* synthetic */ C359700E8i(float f, int i) {
        ArrayList arrayList;
        int i2;
        f = (i & 1) != 0 ? 0.0f : f;
        if ((i & 4) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        this(f, null, arrayList, i2);
    }

    public C359700E8i(float f, Integer num, ArrayList<Pair<Long, Long>> arrayList, int i) {
        this.LIZ = f;
        this.LIZIZ = num;
        this.LIZJ = arrayList;
        this.LIZLLL = i;
    }

    public static C359700E8i LIZ(C359700E8i c359700E8i, float f, Integer num, ArrayList arrayList, int i, int i2) {
        if ((i2 & 1) != 0) {
            f = c359700E8i.LIZ;
        }
        if ((i2 & 2) != 0) {
            num = c359700E8i.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            arrayList = c359700E8i.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i = c359700E8i.LIZLLL;
        }
        c359700E8i.getClass();
        return new C359700E8i(f, num, arrayList, i);
    }
}
