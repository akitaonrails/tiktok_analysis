package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0qDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541620qDg implements C0V1X {
    public final C1541610qDf LIZ;
    public final InterfaceC1541730qDr LIZIZ;
    public final ArrayList<C0V1Y> LIZJ;
    public final HashMap<Class, WeakReference<C0V1Y>> LIZLLL;
    public HashMap<Class<? extends AbstractC1541650qDj>, InterfaceC1541740qDs> LJ;
    public Map<String, TreeMap<Integer, AbstractC1541670qDl>> LJFF;

    static {
        new WeakReference(null);
    }

    public final void LIZ(Set<Class<? extends AbstractC1541650qDj>> set) {
        if (set != null) {
            for (Class<? extends AbstractC1541650qDj> cls : set) {
                if (!this.LIZLLL.containsKey(cls)) {
                    AbstractC1541650qDj abstractC1541650qDj = (AbstractC1541650qDj) C1541600qDe.LIZIZ(cls);
                    if (abstractC1541650qDj != null) {
                        LIZJ(cls, abstractC1541650qDj);
                        abstractC1541650qDj.LIZJ();
                        abstractC1541650qDj.LLILZIL = abstractC1541650qDj.LLILZ;
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("extension init fail: ");
                        sbLIZ.append(cls);
                        new Throwable(C2188811AlT.LIZIZ(sbLIZ));
                        C786950Utx.LIZ("ExtendableContext");
                        C1541610qDf.LJII.getClass();
                        throw null;
                    }
                }
            }
        }
    }

    public final void LIZIZ(LinkedHashSet<Class<? extends AbstractC1541650qDj>> linkedHashSet) {
        if (linkedHashSet != null) {
            for (Class<? extends AbstractC1541650qDj> cls : linkedHashSet) {
                AbstractC1541650qDj abstractC1541650qDj = (AbstractC1541650qDj) C1541600qDe.LIZIZ(cls);
                if (abstractC1541650qDj != null) {
                    LIZJ(cls, abstractC1541650qDj);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("extension init fail: ");
                    sbLIZ.append(cls);
                    throw new Error(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        for (C0V1Y c0v1y : new ArrayList(this.LIZJ)) {
            if (c0v1y instanceof AbstractC1541650qDj) {
                AbstractC1541650qDj abstractC1541650qDj2 = (AbstractC1541650qDj) c0v1y;
                abstractC1541650qDj2.LIZJ();
                abstractC1541650qDj2.LLILZIL = abstractC1541650qDj2.LLILZ;
            }
        }
    }

    public C1541620qDg(C1541610qDf c1541610qDf, InterfaceC1541730qDr interfaceC1541730qDr) {
        ArrayList<C0V1Y> arrayList = new ArrayList<>();
        this.LIZJ = arrayList;
        this.LIZLLL = new HashMap<>();
        this.LIZ = c1541610qDf;
        this.LIZIZ = interfaceC1541730qDr;
        if (interfaceC1541730qDr instanceof C0V1Y) {
            arrayList.add(interfaceC1541730qDr);
            return;
        }
        throw new Error("! extendable instanceof IContextItem");
    }

    public final void LIZJ(Class<? extends AbstractC1541650qDj> cls, AbstractC1541650qDj abstractC1541650qDj) {
        InterfaceC1541740qDs interfaceC1541740qDs;
        LinkedHashSet<InterfaceC1541740qDs> linkedHashSet;
        LinkedHashSet<InterfaceC1541740qDs> linkedHashSet2 = this.LIZ.LIZLLL;
        if (linkedHashSet2 != null) {
            Iterator<InterfaceC1541740qDs> it2 = linkedHashSet2.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(abstractC1541650qDj);
            }
        }
        HashMap<Class<? extends AbstractC1541650qDj>, LinkedHashSet<InterfaceC1541740qDs>> map = this.LIZ.LJ;
        if (map != null && (linkedHashSet = map.get(cls)) != null) {
            Iterator<InterfaceC1541740qDs> it3 = linkedHashSet.iterator();
            while (it3.hasNext()) {
                it3.next().LIZ(abstractC1541650qDj);
            }
        }
        HashMap<Class<? extends AbstractC1541650qDj>, InterfaceC1541740qDs> map2 = this.LJ;
        if (map2 != null && (interfaceC1541740qDs = map2.get(cls)) != null) {
            interfaceC1541740qDs.LIZ(abstractC1541650qDj);
        }
        this.LIZJ.add(abstractC1541650qDj);
        this.LIZLLL.put(cls, new WeakReference<>(abstractC1541650qDj));
        abstractC1541650qDj.LL = this;
    }
}
