package X;

import java.util.Iterator;

/* JADX INFO: renamed from: X.13Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19985413Ho<Element, Collection, Builder> implements C13HG<Collection> {
    public abstract Builder LIZ();

    public abstract int LIZIZ(Builder builder);

    public abstract Iterator<Element> LIZJ(Collection collection);

    public abstract int LIZLLL(Collection collection);

    public abstract void LJFF(InterfaceC19986313Hx interfaceC19986313Hx, int i, Builder builder, boolean z);

    public abstract Builder LJI(Collection collection);

    public abstract Collection LJII(Builder builder);

    public final Object LJ(C13HB c13hb) {
        Builder builderLIZ = LIZ();
        int iLIZIZ = LIZIZ(builderLIZ);
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(getDescriptor());
        interfaceC19986313HxLIZIZ.LJJII();
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(getDescriptor());
            if (iLJIJJ != -1) {
                LJFF(interfaceC19986313HxLIZIZ, iLJIJJ + iLIZIZ, builderLIZ, true);
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(getDescriptor());
                return LJII(builderLIZ);
            }
        }
    }

    public Collection deserialize(C13HB c13hb) {
        return (Collection) LJ(c13hb);
    }
}
