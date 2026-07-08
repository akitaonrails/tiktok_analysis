package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS18S1110000_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.AwS33S2200000_11;
import kotlin.jvm.internal.AwS54S2100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703900RjI {
    public String LIZIZ;
    public long LIZJ;
    public int LJI;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final LinkedHashMap<String, Boolean> LIZLLL = new LinkedHashMap<>();
    public final LinkedHashMap<String, ArrayDeque<C703910RjJ>> LJ = new LinkedHashMap<>();
    public final LinkedHashMap<String, Set<String>> LJFF = new LinkedHashMap<>();
    public final LinkedHashMap<String, Integer> LJII = new LinkedHashMap<>();

    public final void LIZ() {
        this.LIZIZ = null;
        this.LIZJ = 0L;
        this.LIZLLL.clear();
        this.LJ.clear();
        this.LJFF.clear();
        this.LJI = 0;
        this.LJII.clear();
    }

    public final void LIZJ() {
        Iterator<Map.Entry<String, ArrayDeque<C703910RjJ>>> it2 = this.LJ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, ArrayDeque<C703910RjJ>> next = it2.next();
            String key = next.getKey();
            ArrayDeque<C703910RjJ> value = next.getValue();
            Iterator<C703910RjJ> it3 = value.iterator();
            while (it3.hasNext()) {
                C703910RjJ next2 = it3.next();
                if (System.currentTimeMillis() - next2.LIZIZ > 30000) {
                    it3.remove();
                    this.LJI--;
                    LJ("ttl");
                    new AwS127S1200000_11(this, key, next2, 8);
                    C0T6L.LIZLLL();
                }
            }
            if (value.isEmpty()) {
                it2.remove();
            }
        }
        if (this.LJI < 0) {
            this.LJI = 0;
        }
    }

    public final void LJ(String str) {
        int iIntValue;
        LinkedHashMap<String, Integer> linkedHashMap = this.LJII;
        Integer num = linkedHashMap.get(str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put(str, Integer.valueOf(iIntValue + 1));
    }

    public final void LIZLLL(long j, boolean z) {
        Iterator<Map.Entry<String, ArrayDeque<C703910RjJ>>> it2 = this.LJ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, ArrayDeque<C703910RjJ>> next = it2.next();
            String key = next.getKey();
            ArrayDeque<C703910RjJ> value = next.getValue();
            Iterator<C703910RjJ> it3 = value.iterator();
            while (it3.hasNext()) {
                C703910RjJ next2 = it3.next();
                if (z) {
                    if (next2.LIZ != j) {
                        it3.remove();
                        this.LJI--;
                        LJ("stale_generation");
                        new AwS2S1210100_11(this, key, next2, j, z, 17);
                        C0T6L.LIZLLL();
                    }
                } else if (next2.LIZ == j) {
                    it3.remove();
                    this.LJI--;
                    LJ("stale_generation");
                    new AwS2S1210100_11(this, key, next2, j, z, 17);
                    C0T6L.LIZLLL();
                }
            }
            if (value.isEmpty()) {
                it2.remove();
            }
        }
        if (this.LJI < 0) {
            this.LJI = 0;
        }
    }

    public final void LJFF(String str, boolean z) {
        ArrayDeque<C703910RjJ> arrayDequeRemove;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(str);
        while (!arrayDeque.isEmpty()) {
            String str2 = (String) arrayDeque.removeFirst();
            this.LIZLLL.put(str2, Boolean.valueOf(z));
            new AwS18S1110000_11(this, str2, z, 2);
            C0T6L.LIZLLL();
            if (z && (arrayDequeRemove = this.LJ.remove(str2)) != null) {
                new AwS127S1200000_11(this, (C703900RjI) str2, (String) arrayDequeRemove, (ArrayDeque<C703910RjJ>) 9);
                C0T6L.LIZLLL();
                while (!arrayDequeRemove.isEmpty()) {
                    C703910RjJ c703910RjJRemoveFirst = arrayDequeRemove.removeFirst();
                    this.LJI--;
                    if (c703910RjJRemoveFirst.LIZ != this.LIZJ) {
                        LJ("stale_generation");
                        new AwS127S1200000_11(this, str2, c703910RjJRemoveFirst, 10);
                        C0T6L.LIZLLL();
                    } else if (System.currentTimeMillis() - c703910RjJRemoveFirst.LIZIZ > 30000) {
                        LJ("ttl");
                        new AwS127S1200000_11(this, str2, c703910RjJRemoveFirst, 11);
                        C0T6L.LIZLLL();
                    } else {
                        new AwS127S1200000_11(this, str2, c703910RjJRemoveFirst, 12);
                        C0T6L.LIZLLL();
                        c703910RjJRemoveFirst.LIZLLL.invoke();
                    }
                }
                if (this.LJI < 0) {
                    this.LJI = 0;
                }
                new AwS160S1100000_11(this, str2, 9);
                C0T6L.LIZLLL();
            }
            Set<String> set = this.LJFF.get(str2);
            if (set != null) {
                Iterator<T> it2 = set.iterator();
                while (it2.hasNext()) {
                    arrayDeque.add(it2.next());
                }
            }
        }
    }

    public final void LIZIZ(String str, String str2, Function0 function0) {
        int i;
        LinkedHashMap<String, ArrayDeque<C703910RjJ>> linkedHashMap = this.LJ;
        ArrayDeque<C703910RjJ> arrayDeque = linkedHashMap.get(str);
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            linkedHashMap.put(str, arrayDeque);
        }
        ArrayDeque<C703910RjJ> arrayDeque2 = arrayDeque;
        if (str2 != null && str2.length() != 0) {
            if (arrayDeque2.isEmpty()) {
                i = 0;
            } else {
                Iterator<C703910RjJ> it2 = arrayDeque2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().LIZJ, str2)) {
                        it2.remove();
                        i++;
                    }
                }
            }
            this.LJI -= i;
            if (i > 0) {
                new C703920RjK(this, str, str2, i, arrayDeque2);
                C0T6L.LIZLLL();
            }
        }
        if (arrayDeque2.size() >= 30) {
            if (!arrayDeque2.isEmpty()) {
                arrayDeque2.removeFirst();
                this.LJI--;
            }
            LJ("capacity_per_slot");
            new AwS33S2200000_11(this, (C703900RjI) str, str2, (String) arrayDeque2, (ArrayDeque<C703910RjJ>) 3);
            C0T6L.LIZLLL();
        }
        loop1: while (this.LJI >= 300) {
            Iterator<Map.Entry<String, ArrayDeque<C703910RjJ>>> it3 = this.LJ.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<String, ArrayDeque<C703910RjJ>> next = it3.next();
                if ((!next.getValue().isEmpty()) && next.getValue().removeFirst() != null) {
                    this.LJI--;
                    if (next.getValue().isEmpty()) {
                        it3.remove();
                    }
                    LJ("capacity_total");
                    new AwS54S2100000_11(this, str, str2, 1);
                    C0T6L.LIZLLL();
                } else if (next.getValue().isEmpty()) {
                    it3.remove();
                }
            }
        }
        arrayDeque2.addLast(new C703910RjJ(this.LIZJ, System.currentTimeMillis(), str2, function0));
        this.LJI++;
        new AwS33S2200000_11(this, (C703900RjI) str, str2, (String) arrayDeque2, (ArrayDeque<C703910RjJ>) 4);
        C0T6L.LIZLLL();
    }
}
