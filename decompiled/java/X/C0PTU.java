package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.0PTU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTU<T> {
    public static final /* synthetic */ int LJFF = 0;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<Future<C645340PSy<T>>>> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Integer, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public final InterfaceC1631630sYr<? super Integer, ? super Integer, ? super Integer, ? super Boolean, Boolean> LIZJ;
    public final ExecutorService LIZLLL;
    public final String LJ;

    public C0PTU(C0PTX c0ptx) {
        this.LIZJ = c0ptx.LIZ;
        this.LIZLLL = c0ptx.LIZIZ;
        this.LJ = c0ptx.LIZJ;
    }

    public final CopyOnWriteArrayList<Future<C645340PSy<T>>> LIZ(int i) {
        CopyOnWriteArrayList<Future<C645340PSy<T>>> copyOnWriteArrayList = this.LIZ.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            CopyOnWriteArrayList<Future<C645340PSy<T>>> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
            this.LIZ.put(Integer.valueOf(i), copyOnWriteArrayList2);
            return copyOnWriteArrayList2;
        }
        return copyOnWriteArrayList;
    }
}
