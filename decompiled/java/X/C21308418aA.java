package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.18aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21308418aA<CHILD> {
    public final Class<CHILD> LIZ;
    public final String LIZIZ;
    public final /* synthetic */ C1DRF LIZJ;

    public final void LIZ(Class... clsArr) {
        for (Class cls : clsArr) {
            C1DRF c1drf = this.LIZJ;
            final Class<CHILD> cls2 = this.LIZ;
            final String str = this.LIZIZ;
            c1drf.getClass();
            AbstractC20611515l3<Object> abstractC20611515l3 = new AbstractC20611515l3<Object>() { // from class: X.0Ki3
                @Override // X.AbstractC20611515l3
                public final Object LIZIZ(C1DRG c1drg) {
                    return c1drg.LJII(cls2, str);
                }
            };
            Object obj = ((LinkedHashMap) c1drf.LIZJ).get(new C1287930jcV(str, cls2));
            if (obj != null) {
                if (obj instanceof C20611615l4) {
                    c1drf.LJFF(cls, str, abstractC20611515l3);
                } else {
                    c1drf.LIZJ(cls, str, abstractC20611515l3);
                }
            } else {
                throw new IllegalStateException("isSrcSingleton can't find src provider");
            }
        }
    }

    public C21308418aA(C1DRF c1drf, Class<CHILD> cls, String str) {
        this.LIZJ = c1drf;
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
