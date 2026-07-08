package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13IU, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13IU {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C13IU(C19988913Ix c19988913Ix) {
        boolean z;
        this.LIZ = c19988913Ix.LJIIIZ;
        this.LIZIZ = c19988913Ix.LJIIIIZZ;
        if (c19988913Ix.LJIILL != EnumC1779370wP9.NONE) {
            z = true;
        } else {
            z = false;
        }
        this.LIZJ = z;
    }

    public final void LIZ(C13IQ c13iq, C13HG c13hg) {
        InterfaceC19983313Gt descriptor = c13hg.getDescriptor();
        C13GW c13gwLIZIZ = descriptor.LIZIZ();
        if (!(c13gwLIZIZ instanceof C13GL) && !Intrinsics.LJFF(c13gwLIZIZ, C13GV.LIZ)) {
            if (this.LIZIZ || !this.LIZJ || (!Intrinsics.LJFF(c13gwLIZIZ, C19982613Gm.LIZ) && !Intrinsics.LJFF(c13gwLIZIZ, C19982713Gn.LIZ) && !(c13gwLIZIZ instanceof C13HJ) && !(c13gwLIZIZ instanceof C13GS))) {
                if (!this.LIZIZ && this.LIZJ) {
                    int iLJ = descriptor.LJ();
                    for (int i = 0; i < iLJ; i++) {
                        String strLIZJ = descriptor.LIZJ(i);
                        if (Intrinsics.LJFF(strLIZJ, this.LIZ)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Polymorphic serializer for ");
                            sbLIZ.append(c13iq);
                            sbLIZ.append(" has property '");
                            sbLIZ.append(strLIZJ);
                            sbLIZ.append("' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Serializer for ");
            sbLIZ2.append(c13iq.LJI());
            sbLIZ2.append(" of kind ");
            sbLIZ2.append(c13gwLIZIZ);
            sbLIZ2.append(" cannot be serialized polymorphically with class discriminator.");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Serializer for ");
        sbLIZ3.append(c13iq.LJI());
        sbLIZ3.append(" can't be registered as a subclass for polymorphic serialization because its kind ");
        sbLIZ3.append(c13gwLIZIZ);
        sbLIZ3.append(" is not concrete. To work with multiple hierarchies, register it as a base class.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
