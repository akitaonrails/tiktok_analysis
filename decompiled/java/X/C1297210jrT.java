package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okio.ByteString;

/* JADX INFO: renamed from: X.0jrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297210jrT extends AbstractC1501440pAs {
    public final C1297080jrG LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public static C1297210jrT LIZIZ() {
        return new C1297210jrT(new C1297080jrG(new C1297170jrP()), false, false, false);
    }

    public final C1297210jrT LIZ() {
        return new C1297210jrT(this.LIZ, true, this.LIZJ, this.LIZLLL);
    }

    public static Set<? extends Annotation> LIZJ(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(InterfaceC1297280jra.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        if (linkedHashSet != null) {
            return Collections.unmodifiableSet(linkedHashSet);
        }
        return Collections.emptySet();
    }

    @Override // X.AbstractC1501440pAs
    public final InterfaceC1501650pBD<AbstractC842510X3h, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C1501450pAt c1501450pAt) {
        final AbstractC1296960jr4 abstractC1296960jr4LIZ = this.LIZ.LIZ(type, LIZJ(annotationArr));
        if (this.LIZIZ) {
            abstractC1296960jr4LIZ = new C1296970jr5(abstractC1296960jr4LIZ);
        }
        if (this.LIZJ) {
            abstractC1296960jr4LIZ = new C1296950jr3(abstractC1296960jr4LIZ);
        }
        if (this.LIZLLL) {
            abstractC1296960jr4LIZ = new C1296980jr6(abstractC1296960jr4LIZ);
        }
        return new InterfaceC1501650pBD<AbstractC842510X3h, T>(abstractC1296960jr4LIZ) { // from class: X.0jrS
            public static final ByteString LIZIZ = ByteString.decodeHex("EFBBBF");
            public final AbstractC1296960jr4<T> LIZ;

            {
                this.LIZ = abstractC1296960jr4LIZ;
            }

            @Override // X.InterfaceC1501650pBD
            public final Object LIZ(AbstractC842510X3h abstractC842510X3h) {
                AbstractC842510X3h abstractC842510X3h2 = abstractC842510X3h;
                InterfaceC1496620p36 interfaceC1496620p36Source = abstractC842510X3h2.source();
                try {
                    if (interfaceC1496620p36Source.LLF(LIZIZ)) {
                        interfaceC1496620p36Source.skip(r1.size());
                    }
                    C1296390jq9 c1296390jq9 = new C1296390jq9(interfaceC1496620p36Source);
                    T tLIZ = this.LIZ.LIZ(c1296390jq9);
                    if (c1296390jq9.LJJIL() == EnumC1296400jqA.END_DOCUMENT) {
                        abstractC842510X3h2.close();
                        return tLIZ;
                    }
                    throw new C1296420jqC("JSON document was not fully consumed.");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    abstractC842510X3h2.close();
                    throw th;
                }
            }
        };
    }

    public C1297210jrT(C1297080jrG c1297080jrG, boolean z, boolean z2, boolean z3) {
        this.LIZ = c1297080jrG;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }

    @Override // X.AbstractC1501440pAs
    public final InterfaceC1501650pBD<?, AbstractC842530X3j> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C1501450pAt c1501450pAt) {
        final AbstractC1296960jr4 abstractC1296960jr4LIZ = this.LIZ.LIZ(type, LIZJ(annotationArr));
        if (this.LIZIZ) {
            abstractC1296960jr4LIZ = new C1296970jr5(abstractC1296960jr4LIZ);
        }
        if (this.LIZJ) {
            abstractC1296960jr4LIZ = new C1296950jr3(abstractC1296960jr4LIZ);
        }
        if (this.LIZLLL) {
            abstractC1296960jr4LIZ = new C1296980jr6(abstractC1296960jr4LIZ);
        }
        return new InterfaceC1501650pBD<T, AbstractC842530X3j>(abstractC1296960jr4LIZ) { // from class: X.0jrV
            public static final C0X0P LIZIZ = C0X0P.LIZJ("application/json; charset=UTF-8");
            public final AbstractC1296960jr4<T> LIZ;

            {
                this.LIZ = abstractC1296960jr4LIZ;
            }

            @Override // X.InterfaceC1501650pBD
            public final AbstractC842530X3j LIZ(Object obj) {
                C1496690p3D c1496690p3D = new C1496690p3D();
                this.LIZ.LIZIZ(new C1297030jrB(c1496690p3D), obj);
                return new C0X8G(LIZIZ, c1496690p3D.LJIJJ());
            }
        };
    }
}
