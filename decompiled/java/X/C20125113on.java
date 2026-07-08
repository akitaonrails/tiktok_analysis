package X;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.13on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20125113on {
    public static C20125113on LIZ;
    public static final List<InterfaceC20124913ol> LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJFF;

    static {
        new WeakReference(new C20125013om(0));
        LIZIZ = new CopyOnWriteArrayList();
        LIZLLL = 0L;
        LJ = Long.MAX_VALUE;
        LJFF = 0L;
    }

    public static synchronized C20125113on LIZIZ() {
        if (LIZ == null) {
            LIZ = new C20125113on();
        }
        return LIZ;
    }

    public static void LIZ(InterfaceC20124913ol interfaceC20124913ol) {
        if (interfaceC20124913ol != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) LIZIZ;
            if (!copyOnWriteArrayList.contains(interfaceC20124913ol)) {
                copyOnWriteArrayList.add(interfaceC20124913ol);
            }
        }
    }
}
