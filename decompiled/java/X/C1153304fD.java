package X;

import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: X.04fD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1153304fD<T> implements InterfaceC1153404fE {
    public final Class<T> LIZ;
    public boolean LIZIZ;

    public C1153304fD(Class<T> cls) {
        this.LIZ = cls;
    }

    @Override // X.InterfaceC1153404fE
    public final void LIZ(List<? extends Type> list) {
        Class<?> cls;
        for (Type type : list) {
            if ((type instanceof Class) && (cls = (Class) type) != null && this.LIZ.isAssignableFrom(cls)) {
                if (!this.LIZIZ) {
                    this.LIZIZ = true;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Only allow register once for upper type ");
                    sbLIZ.append(this.LIZ);
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
    }
}
