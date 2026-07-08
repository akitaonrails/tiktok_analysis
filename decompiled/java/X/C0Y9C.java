package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Y9C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9C implements InterfaceC870630YDl {
    public final C0YEM LL;
    public final EnumC871430YGn LLILLJJLI;
    public final InterfaceC864790XwD LLILLL;
    public final C0Y5R LLILZ;
    public final Map<String, C0Y8T> LLILZIL;
    public final ConcurrentHashMap<String, AtomicBoolean> LLILZLL;
    public final Set<C0Y9E> LLIZ;

    public final List<C0Y9G> LIZ() {
        return this.LLILLL.LIZLLL().LJI().LJIJI(this.LLILLJJLI);
    }

    @Override // X.InterfaceC870630YDl
    public final Pair<List<C0Y8T>, Boolean> LLLILZLLLI() {
        return new Pair<>(C13LP.LLIIII(((ConcurrentHashMap) this.LLILZIL).values()), Boolean.valueOf(((ConcurrentHashMap) this.LLILZIL).size() < LIZ().size()));
    }

    @Override // X.InterfaceC870630YDl
    public final void clear() {
        ((CopyOnWriteArraySet) this.LLIZ).clear();
        this.LLILLL.LIZLLL().LJI().LJIJ(this);
    }

    @Override // X.InterfaceC870630YDl
    public final boolean isLoading() {
        Collection<AtomicBoolean> collectionValues = this.LLILZLL.values();
        if (collectionValues.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            if (((AtomicBoolean) it2.next()).get()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC870630YDl
    public final List<String> LJJJLL() {
        List<C0Y9G> listLIZ = LIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        Iterator<C0Y9G> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        return arrayList;
    }

    @Override // X.InterfaceC870630YDl
    public final void LLJJ(List<String> list) {
        List<C0Y9G> listLIZ = LIZ();
        ArrayList<C0Y9G> arrayList = new ArrayList();
        for (C0Y9G c0y9g : listLIZ) {
            if (list.contains(c0y9g.LIZ)) {
                arrayList.add(c0y9g);
            }
        }
        if (!arrayList.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("batchDeleteById, type: ");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", handled size: ");
            sbLIZ.append(arrayList.size());
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ), 4);
            C865050Xwd c865050Xwd = new C865050Xwd(this.LL, null);
            Boolean bool = Boolean.TRUE;
            Boolean bool2 = Boolean.FALSE;
            ArrayList arrayList2 = new ArrayList();
            for (C0Y9G c0y9g2 : arrayList) {
                arrayList2.add(new C443120HZe(c0y9g2.LIZ, Long.valueOf(c0y9g2.LIZIZ), Integer.valueOf(c0y9g2.LIZJ)));
            }
            c865050Xwd.LJIIL(bool, bool2, arrayList2);
        }
    }

    @Override // X.InterfaceC870630YDl
    public final void LLJJJJ(C0Y9E c0y9e) {
        C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "MessageRequestConversationModel", "unregister", 4);
        ((CopyOnWriteArraySet) this.LLIZ).remove(c0y9e);
    }

    @Override // X.InterfaceC870630YDl
    public final void LLJLILLLLZIIL(C878600YdO c878600YdO) {
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register: observer = ");
        sbLIZ.append(c878600YdO);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ), 4);
        ((CopyOnWriteArraySet) this.LLIZ).add(c878600YdO);
    }

    public C0Y9C(C0YEM c0yem, EnumC871430YGn enumC871430YGn) {
        this.LL = c0yem;
        this.LLILLJJLI = enumC871430YGn;
        InterfaceC864790XwD interfaceC864790XwDLJIIZILJ = c0yem.LJIIZILJ();
        this.LLILLL = interfaceC864790XwDLJIIZILJ;
        this.LLILZ = interfaceC864790XwDLJIIZILJ.LIZIZ();
        this.LLILZIL = new ConcurrentHashMap();
        this.LLILZLL = new ConcurrentHashMap<>();
        this.LLIZ = new CopyOnWriteArraySet();
        interfaceC864790XwDLJIIZILJ.LIZLLL().LJI().LJIILL(this);
    }

    @Override // X.InterfaceC870630YDl
    public final Object LJJJ(List<String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("batchMarkRead, type: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", operated num: ");
        sbLIZ.append(list.size());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LL.LJIIZILJ().getDomain().LIZJ().LLJJLIIIJLLLLLLLZ(list, null);
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C2207108kn(this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC870630YDl
    public final void LJLJLJ(int i, C869380Y8q c869380Y8q) {
        String str = c869380Y8q.LIZ;
        AtomicBoolean atomicBoolean = this.LLILZLL.get(str);
        if (atomicBoolean == null) {
            synchronized (this.LLILZLL) {
                try {
                    atomicBoolean = this.LLILZLL.get(str);
                    if (atomicBoolean == null) {
                        atomicBoolean = new AtomicBoolean(false);
                        this.LLILZLL.put(str, atomicBoolean);
                    }
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        boolean z = true;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        try {
            List<C0Y8T> listLJJIII = this.LLILZ.LIZIZ().LJIIJJI().LJJIII(i + 1, this.LLILLJJLI, c869380Y8q);
            if (i > 0 && listLJJIII.size() > i) {
                listLJJIII = C13LP.LL(listLJJIII, i);
            } else {
                z = false;
            }
            Map<String, C0Y8T> map = this.LLILZIL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJIII, 10));
            for (C0Y8T c0y8t : listLJJIII) {
                arrayList.add(new Pair(c0y8t.getConversationId(), c0y8t));
            }
            C2097608Jq.LJIILJJIL(arrayList, map);
            C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load with query size is ");
            sbLIZ.append(listLJJIII.size());
            sbLIZ.append(", hasMore is ");
            sbLIZ.append(z);
            sbLIZ.append(", totalSize is ");
            sbLIZ.append(((ConcurrentHashMap) this.LLILZIL).size());
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageRequestConversationModel", C2188811AlT.LIZIZ(sbLIZ), 4);
            C0Y9D c0y9d = new C0Y9D(c869380Y8q.LIZIZ, z, listLJJIII);
            Iterator it2 = ((CopyOnWriteArraySet) this.LLIZ).iterator();
            while (it2.hasNext()) {
                ((C0Y9E) it2.next()).LJIIJ(c0y9d);
            }
            atomicBoolean.set(false);
        } catch (Throwable th) {
            atomicBoolean.set(false);
            throw th;
        }
    }

    @Override // X.InterfaceC870630YDl
    public final void LJLJLLL(String str, C873950YQf c873950YQf, Set<String> set) {
        List<C0Y9G> listLLIIII = C13LP.LLIIII(this.LLILZ.LIZIZ().LJIIJJI().LJIILLIIL(c873950YQf, set, this.LLILLJJLI).values());
        Iterator it2 = ((CopyOnWriteArraySet) this.LLIZ).iterator();
        while (it2.hasNext()) {
            ((C0Y9E) it2.next()).LJIILJJIL(str, listLLIIII);
        }
    }
}
