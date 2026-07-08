package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297100jrI extends AbstractC1296960jr4<Object> {
    public static final C1297120jrK LIZJ = new InterfaceC1296930jr1() { // from class: X.0jrK
        @Override // X.InterfaceC1296930jr1
        public final AbstractC1296960jr4<?> LIZ(Type type, Set<? extends Annotation> set, C1297080jrG c1297080jrG) {
            Type componentType;
            if (type instanceof GenericArrayType) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                if (type instanceof Class) {
                    componentType = ((Class) type).getComponentType();
                }
                return null;
            }
            if (componentType == null || !set.isEmpty()) {
                return null;
            }
            Class<?> clsLJFF = C1297410jrn.LJFF(componentType);
            c1297080jrG.getClass();
            return new C1296940jr2(new C1297100jrI(clsLJFF, c1297080jrG.LIZ(componentType, C1297180jrQ.LIZ)));
        }
    };
    public final Class<?> LIZ;
    public final AbstractC1296960jr4<Object> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(".array()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1296960jr4
    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        ArrayList arrayList = new ArrayList();
        abstractC1296450jqF.LIZ();
        while (abstractC1296450jqF.LJII()) {
            arrayList.add(this.LIZIZ.LIZ(abstractC1296450jqF));
        }
        abstractC1296450jqF.LIZLLL();
        Object objNewInstance = Array.newInstance(this.LIZ, arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            Array.set(objNewInstance, i, ListProtector.get(arrayList, i));
        }
        return objNewInstance;
    }

    public C1297100jrI(Class<?> cls, AbstractC1296960jr4<Object> abstractC1296960jr4) {
        this.LIZ = cls;
        this.LIZIZ = abstractC1296960jr4;
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
        C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
        c1297030jrB.LJIJJ();
        c1297030jrB.LJIILL();
        c1297030jrB.LJFF(1);
        c1297030jrB.LLILZ[c1297030jrB.LL - 1] = 0;
        c1297030jrB.LLIZLLLIL.LJLLILLLL(e3.e);
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.LIZIZ.LIZIZ(abstractC1297000jr8, Array.get(obj, i));
        }
        ((C1297030jrB) abstractC1297000jr8).LJIILLIIL(1, 2, e3.f);
    }
}
