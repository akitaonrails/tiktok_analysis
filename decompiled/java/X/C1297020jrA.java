package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: renamed from: X.0jrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1297020jrA<K, V> extends AbstractC1296960jr4<Map<K, V>> {
    public static final C1297110jrJ LIZJ = new InterfaceC1296930jr1() { // from class: X.0jrJ
        @Override // X.InterfaceC1296930jr1
        public final AbstractC1296960jr4<?> LIZ(Type type, Set<? extends Annotation> set, C1297080jrG c1297080jrG) {
            Class<?> clsLJFF;
            Type[] actualTypeArguments;
            if (!set.isEmpty() || (clsLJFF = C1297410jrn.LJFF(type)) != Map.class) {
                return null;
            }
            if (type == Properties.class) {
                actualTypeArguments = new Type[]{String.class, String.class};
            } else if (Map.class.isAssignableFrom(clsLJFF)) {
                Type typeLJI = C1297410jrn.LJI(type, clsLJFF, C1297410jrn.LJ(type, clsLJFF, Map.class));
                if (typeLJI instanceof ParameterizedType) {
                    actualTypeArguments = ((ParameterizedType) typeLJI).getActualTypeArguments();
                } else {
                    actualTypeArguments = new Type[]{Object.class, Object.class};
                }
            } else {
                throw new IllegalArgumentException();
            }
            return new C1296940jr2(new C1297020jrA(c1297080jrG, actualTypeArguments[0], actualTypeArguments[1]));
        }
    };
    public final AbstractC1296960jr4<K> LIZ;
    public final AbstractC1296960jr4<V> LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonAdapter(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1296960jr4
    public final Object LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        C13X5 c13x5 = new C13X5();
        abstractC1296450jqF.LIZIZ();
        while (abstractC1296450jqF.LJII()) {
            C1296390jq9 c1296390jq9 = (C1296390jq9) abstractC1296450jqF;
            if (c1296390jq9.LJII()) {
                c1296390jq9.LLJILJIL = c1296390jq9.LJIJJ();
                c1296390jq9.LLJ = 11;
            }
            K kLIZ = this.LIZ.LIZ(abstractC1296450jqF);
            V vLIZ = this.LIZIZ.LIZ(abstractC1296450jqF);
            Object objPut = c13x5.put(kLIZ, vLIZ);
            if (objPut != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Map key '");
                sbLIZ.append(kLIZ);
                sbLIZ.append("' has multiple values at path ");
                sbLIZ.append(abstractC1296450jqF.LJI());
                sbLIZ.append(": ");
                sbLIZ.append(objPut);
                sbLIZ.append(" and ");
                sbLIZ.append(vLIZ);
                throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        abstractC1296450jqF.LJFF();
        return c13x5;
    }

    @Override // X.AbstractC1296960jr4
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
        C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
        c1297030jrB.LJIJJ();
        c1297030jrB.LJIILL();
        c1297030jrB.LJFF(3);
        c1297030jrB.LLILZ[c1297030jrB.LL - 1] = 0;
        c1297030jrB.LLIZLLLIL.LJLLILLLL("{");
        for (Map.Entry<K, V> entry : ((Map) obj).entrySet()) {
            if (entry.getKey() != null) {
                int iLIZLLL = abstractC1297000jr8.LIZLLL();
                if (iLIZLLL != 5 && iLIZLLL != 3) {
                    throw new IllegalStateException("Nesting problem.");
                }
                abstractC1297000jr8.LLIZ = true;
                this.LIZ.LIZIZ(abstractC1297000jr8, entry.getKey());
                this.LIZIZ.LIZIZ(abstractC1297000jr8, entry.getValue());
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Map key is null at ");
                sbLIZ.append(C1888307aT.LIZ(abstractC1297000jr8.LL, abstractC1297000jr8.LLILLJJLI, abstractC1297000jr8.LLILZ, abstractC1297000jr8.LLILLL));
                throw new C1296420jqC(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        C1297030jrB c1297030jrB2 = (C1297030jrB) abstractC1297000jr8;
        c1297030jrB2.LLIZ = false;
        c1297030jrB2.LJIILLIIL(3, 5, "}");
    }

    public C1297020jrA(C1297080jrG c1297080jrG, Type type, Type type2) {
        c1297080jrG.getClass();
        Set<Annotation> set = C1297180jrQ.LIZ;
        this.LIZ = c1297080jrG.LIZ(type, set);
        this.LIZIZ = c1297080jrG.LIZ(type2, set);
    }
}
