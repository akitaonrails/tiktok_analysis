package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* JADX INFO: renamed from: X.0pAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501500pAy extends AbstractC1501440pAs {
    public static final C1501500pAy LIZ = new C1501500pAy();

    @Override // X.AbstractC1501440pAs
    public final InterfaceC1501650pBD<AbstractC842510X3h, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C1501450pAt c1501450pAt) {
        if (C1502190pC5.LJFF(type) != Optional.class) {
            return null;
        }
        final InterfaceC1501650pBD interfaceC1501650pBDLJ = c1501450pAt.LJ(C1502190pC5.LJ(0, (ParameterizedType) type), annotationArr);
        return new InterfaceC1501650pBD<AbstractC842510X3h, Optional<T>>(interfaceC1501650pBDLJ) { // from class: X.0pAz
            public final InterfaceC1501650pBD<AbstractC842510X3h, T> LIZ;

            {
                this.LIZ = interfaceC1501650pBDLJ;
            }

            @Override // X.InterfaceC1501650pBD
            public final Object LIZ(AbstractC842510X3h abstractC842510X3h) {
                return Optional.ofNullable(this.LIZ.LIZ(abstractC842510X3h));
            }
        };
    }
}
