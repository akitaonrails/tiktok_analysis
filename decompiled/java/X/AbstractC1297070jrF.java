package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jrF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1297070jrF<C extends Collection<T>, T> extends AbstractC1296960jr4<C> {
    public static final C1297130jrL LIZIZ = new InterfaceC1296930jr1() { // from class: X.0jrL
        @Override // X.InterfaceC1296930jr1
        public final AbstractC1296960jr4<?> LIZ(Type type, Set<? extends Annotation> set, C1297080jrG c1297080jrG) {
            Class<?> clsLJFF = C1297410jrn.LJFF(type);
            if (!set.isEmpty()) {
                return null;
            }
            if (clsLJFF != List.class && clsLJFF != Collection.class) {
                if (clsLJFF != Set.class) {
                    return null;
                }
                Type typeLIZJ = C1297410jrn.LIZJ(type, Collection.class);
                c1297080jrG.getClass();
                final AbstractC1296960jr4 abstractC1296960jr4LIZ = c1297080jrG.LIZ(typeLIZJ, C1297180jrQ.LIZ);
                return new C1296940jr2(new AbstractC1297070jrF<Set<Object>, Object>(abstractC1296960jr4LIZ) { // from class: X.0jrN
                    @Override // X.AbstractC1297070jrF
                    public final Collection LIZLLL() {
                        return new LinkedHashSet();
                    }

                    @Override // X.AbstractC1297070jrF, X.AbstractC1296960jr4
                    public final /* bridge */ /* synthetic */ void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, Object obj) {
                        LIZIZ(abstractC1297000jr8, (Collection) obj);
                    }
                });
            }
            Type typeLIZJ2 = C1297410jrn.LIZJ(type, Collection.class);
            c1297080jrG.getClass();
            final AbstractC1296960jr4 abstractC1296960jr4LIZ2 = c1297080jrG.LIZ(typeLIZJ2, C1297180jrQ.LIZ);
            return new C1296940jr2(new AbstractC1297070jrF<Collection<Object>, Object>(abstractC1296960jr4LIZ2) { // from class: X.0jrO
                @Override // X.AbstractC1297070jrF
                public final Collection<Object> LIZLLL() {
                    return new ArrayList();
                }
            });
        }
    };
    public final AbstractC1296960jr4<T> LIZ;

    public abstract C LIZLLL();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(".collection()");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AbstractC1297070jrF(AbstractC1296960jr4 abstractC1296960jr4) {
        this.LIZ = abstractC1296960jr4;
    }

    @Override // X.AbstractC1296960jr4
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C LIZ(AbstractC1296450jqF abstractC1296450jqF) {
        C c = (C) LIZLLL();
        abstractC1296450jqF.LIZ();
        while (abstractC1296450jqF.LJII()) {
            c.add(this.LIZ.LIZ(abstractC1296450jqF));
        }
        abstractC1296450jqF.LIZLLL();
        return c;
    }

    @Override // X.AbstractC1296960jr4
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(AbstractC1297000jr8 abstractC1297000jr8, C c) {
        C1297030jrB c1297030jrB = (C1297030jrB) abstractC1297000jr8;
        c1297030jrB.LJIJJ();
        c1297030jrB.LJIILL();
        c1297030jrB.LJFF(1);
        c1297030jrB.LLILZ[c1297030jrB.LL - 1] = 0;
        c1297030jrB.LLIZLLLIL.LJLLILLLL(e3.e);
        Iterator it2 = c.iterator();
        while (it2.hasNext()) {
            this.LIZ.LIZIZ(abstractC1297000jr8, (T) it2.next());
        }
        ((C1297030jrB) abstractC1297000jr8).LJIILLIIL(1, 2, e3.f);
    }
}
