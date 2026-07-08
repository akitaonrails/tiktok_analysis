package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555860qae<CURRENT_TYPE> implements InterfaceC1555820qaa<CURRENT_TYPE> {
    public final Class<?> LIZ;
    public final Class<CURRENT_TYPE> LIZIZ;
    public final List<C2216581BpA> LIZJ;

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZJ.hashCode();
    }

    @Override // X.InterfaceC1555820qaa
    public final Class<?> getSourceType() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C1555860qae.class, cls)) {
            return false;
        }
        C1555860qae c1555860qae = (C1555860qae) obj;
        if (Intrinsics.LJFF(this.LIZ, c1555860qae.LIZ) && Intrinsics.LJFF(this.LIZJ, c1555860qae.LIZJ)) {
            return true;
        }
        return false;
    }

    public C1555860qae(Class<?> cls, Class<CURRENT_TYPE> cls2) {
        this.LIZJ = new ArrayList();
        this.LIZ = cls;
        this.LIZIZ = cls2;
    }

    public C1555860qae(Class<?> cls, Class<CURRENT_TYPE> cls2, List<C2216581BpA> list) {
        this.LIZJ = list;
        this.LIZ = cls;
        this.LIZIZ = cls2;
    }
}
