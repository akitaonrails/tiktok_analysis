package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Q3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664290Q3v {
    public static final ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> LIZ = new ConcurrentLinkedDeque<>();

    public static InterfaceC649890PeN LIZ() {
        Pair<Integer, InterfaceC649890PeN> pairPeekFirst = LIZ.peekFirst();
        if (pairPeekFirst == null || pairPeekFirst.getSecond() == null) {
            return null;
        }
        return pairPeekFirst.getSecond();
    }

    public static InterfaceC649890PeN LIZIZ(int i) {
        ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = LIZ;
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, InterfaceC649890PeN> pair : concurrentLinkedDeque) {
            Pair<Integer, InterfaceC649890PeN> pair2 = pair;
            if (pair2 != null && i == pair2.getFirst().intValue() && pair2.getSecond() != null) {
                arrayList.add(pair);
            }
        }
        Pair pair3 = (Pair) C13LP.LJJJLL(arrayList);
        if (pair3 != null) {
            return (InterfaceC649890PeN) pair3.getSecond();
        }
        return null;
    }

    public static void LIZJ(int i) {
        ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = LIZ;
        ArrayList<Pair> arrayList = new ArrayList();
        for (Pair<Integer, InterfaceC649890PeN> pair : concurrentLinkedDeque) {
            Pair<Integer, InterfaceC649890PeN> pair2 = pair;
            if (pair2 != null && i == pair2.getFirst().intValue() && pair2.getSecond() != null) {
                arrayList.add(pair);
            }
        }
        for (Pair pair3 : arrayList) {
            LIZ.remove(pair3);
            ((InterfaceC649890PeN) pair3.getSecond()).LJFF();
        }
    }

    public static void LIZLLL(int i, C1278704zR c1278704zR) {
        ConcurrentLinkedDeque<Pair<Integer, InterfaceC649890PeN>> concurrentLinkedDeque = LIZ;
        Pair<Integer, InterfaceC649890PeN> pairPeekFirst = concurrentLinkedDeque.peekFirst();
        if (pairPeekFirst != null && i == pairPeekFirst.getFirst().intValue() && pairPeekFirst.getSecond() != null) {
            concurrentLinkedDeque.removeFirst();
        }
        concurrentLinkedDeque.addFirst(new Pair<>(Integer.valueOf(i), c1278704zR));
    }
}
