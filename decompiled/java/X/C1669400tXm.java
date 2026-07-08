package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1669400tXm extends AbstractC1669390tXl {
    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoundedCornerShape(topStart = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", topEnd = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bottomEnd = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottomStart = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1669400tXm)) {
            return false;
        }
        AbstractC1669390tXl abstractC1669390tXl = (AbstractC1669390tXl) obj;
        if (Intrinsics.LJFF(this.LIZ, abstractC1669390tXl.LIZ) && Intrinsics.LJFF(this.LIZIZ, abstractC1669390tXl.LIZIZ) && Intrinsics.LJFF(this.LIZJ, abstractC1669390tXl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, abstractC1669390tXl.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C1669400tXm(InterfaceC1160240gIY interfaceC1160240gIY, InterfaceC1160240gIY interfaceC1160240gIY2, InterfaceC1160240gIY interfaceC1160240gIY3, InterfaceC1160240gIY interfaceC1160240gIY4) {
        super(interfaceC1160240gIY, interfaceC1160240gIY2, interfaceC1160240gIY3, interfaceC1160240gIY4);
    }

    @Override // X.AbstractC1669390tXl
    public final AbstractC1680810tqB LIZIZ(long j, float f, float f2, float f3, float f4, EnumC1671200tag enumC1671200tag) {
        float f5;
        float f6;
        if (f + f2 + f3 + f4 == 0.0f) {
            return new C1680780tq8(C1671580tbI.LIZJ(j));
        }
        C1683130ttv c1683130ttvLIZJ = C1671580tbI.LIZJ(j);
        EnumC1671200tag enumC1671200tag2 = EnumC1671200tag.Ltr;
        if (enumC1671200tag == enumC1671200tag2) {
            f5 = f;
        } else {
            f5 = f2;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (enumC1671200tag != enumC1671200tag2) {
            f2 = f;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        if (enumC1671200tag == enumC1671200tag2) {
            f6 = f3;
        } else {
            f6 = f4;
        }
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (enumC1671200tag != enumC1671200tag2) {
            f4 = f3;
        }
        return new C1680730tq3(new C1680760tq6(c1683130ttvLIZJ.LIZ, c1683130ttvLIZJ.LIZIZ, c1683130ttvLIZJ.LIZJ, c1683130ttvLIZJ.LIZLLL, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L)));
    }
}
