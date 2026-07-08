package X;

import X.C21339918fF;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.18fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21339818fE<T> implements InterfaceC21337718et<T> {
    public final C21339918fF<Long, Object, T> LIZ;

    public final void LIZIZ() {
        C21339918fF<Long, Object, T> c21339918fF = this.LIZ;
        ((HashMap) c21339918fF.LIZIZ).clear();
        C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG = c21339918fF.LIZJ;
        C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG2 = c21339918fF.LIZLLL;
        c21340018fG.LIZJ = c21340018fG2;
        c21340018fG2.LIZIZ = c21340018fG;
        c21339918fF.LJ = 0;
    }

    public C21339818fE(int i) {
        this.LIZ = new C21339918fF<>(i);
    }

    @Override // X.InterfaceC21337718et
    public final T LIZ(long j, Object obj) {
        LinkedList linkedList;
        C21339918fF.a aVar;
        Map map = (Map) ((HashMap) this.LIZ.LIZIZ).get(Long.valueOf(j));
        if (map == null || (linkedList = (LinkedList) map.get(obj)) == null || (aVar = (C21339918fF.a) linkedList.pollFirst()) == null) {
            return null;
        }
        C21340018fG<C21339918fF<K_1, K_2, V>.a> c21340018fG = aVar.LIZLLL;
        if (c21340018fG != null) {
            C21340018fG<C21339918fF<K_1, K_2, V>.a> c21340018fG2 = c21340018fG.LIZIZ;
            if (c21340018fG2 != null) {
                c21340018fG2.LIZJ = c21340018fG.LIZJ;
            }
            C21340018fG<C21339918fF<K_1, K_2, V>.a> c21340018fG3 = c21340018fG.LIZJ;
            if (c21340018fG3 != null) {
                c21340018fG3.LIZIZ = c21340018fG2;
            }
            aVar.LIZLLL = null;
            r5.LJ--;
        }
        return (T) aVar.LIZJ;
    }

    public void LIZJ(long j, Object obj, T t) {
        C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG;
        LinkedList linkedList;
        C21339918fF<Long, Object, T> c21339918fF = this.LIZ;
        Long lValueOf = Long.valueOf(j);
        c21339918fF.getClass();
        C21339918fF.a aVar = new C21339918fF.a(lValueOf, obj, t);
        HashMap map = (HashMap) c21339918fF.LIZIZ;
        Object map2 = map.get(lValueOf);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(lValueOf, map2);
        }
        Map map3 = (Map) map2;
        Object linkedList2 = map3.get(obj);
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            map3.put(obj, linkedList2);
        }
        ((LinkedList) linkedList2).add(aVar);
        C21340018fG c21340018fG2 = (C21340018fG<T>) new C21340018fG(aVar);
        C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG3 = c21339918fF.LIZLLL;
        c21340018fG2.LIZIZ = c21340018fG3.LIZIZ;
        c21340018fG2.LIZJ = c21340018fG3;
        C21340018fG<T> c21340018fG4 = c21340018fG3.LIZIZ;
        if (c21340018fG4 != null) {
            c21340018fG4.LIZJ = c21340018fG2;
        }
        c21340018fG3.LIZIZ = c21340018fG2;
        aVar.LIZLLL = c21340018fG2;
        c21339918fF.LJ++;
        while (c21339918fF.LJ > c21339918fF.LIZ && (c21340018fG = c21339918fF.LIZJ.LIZJ) != null) {
            C21339918fF<Long, Object, T>.a aVar2 = c21340018fG.LIZ;
            Map map4 = (Map) ((HashMap) c21339918fF.LIZIZ).get(aVar2.LIZ);
            if (map4 != null && (linkedList = (LinkedList) map4.get(aVar2.LIZIZ)) != null) {
                linkedList.remove(aVar2);
                C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG5 = aVar2.LIZLLL;
                if (c21340018fG5 != null) {
                    C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG6 = c21340018fG5.LIZIZ;
                    if (c21340018fG6 != null) {
                        c21340018fG6.LIZJ = c21340018fG5.LIZJ;
                    }
                    C21340018fG<C21339918fF<Long, Object, T>.a> c21340018fG7 = c21340018fG5.LIZJ;
                    if (c21340018fG7 != null) {
                        c21340018fG7.LIZIZ = c21340018fG6;
                    }
                    aVar2.LIZLLL = null;
                    c21339918fF.LJ--;
                }
            }
        }
    }
}
