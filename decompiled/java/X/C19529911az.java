package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.11az, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19529911az implements InterfaceC19526611aS {
    public final String LIZ;
    public C19525911aL LJFF;
    public volatile boolean LJII;
    public final ConcurrentMap<String, Object> LIZIZ = new ConcurrentHashMap();
    public final CopyOnWriteArrayList<C19525911aL> LIZJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<String> LIZLLL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<String> LJ = new CopyOnWriteArrayList<>();
    public volatile boolean LJI = true;

    @Override // X.InterfaceC19526611aS
    public final synchronized List<C19525911aL> LJIILJJIL() {
        return C13LP.LLIIII(this.LIZJ);
    }

    @Override // X.InterfaceC19526611aS
    public final void LJIILL() {
        this.LJI = false;
    }

    @Override // X.InterfaceC19526611aS
    public final void LJIILLIIL() {
        this.LJII = true;
    }

    @Override // X.InterfaceC19526611aS
    public final synchronized List<String> LJIJ() {
        return C13LP.LLIIII(this.LJ);
    }

    @Override // X.InterfaceC19526611aS
    public final synchronized List<String> LJIL() {
        return C13LP.LLIIII(this.LIZLLL);
    }

    @Override // X.InterfaceC19526611aS
    public final C19525911aL LJIJI() {
        C19525911aL c19525911aL = this.LJFF;
        if (c19525911aL != null) {
            return c19525911aL.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC19526611aS
    public final String LJJ() {
        String str = this.LIZ;
        return str == null ? "unknown" : str;
    }

    @Override // X.InterfaceC19526611aS
    public final boolean LJIILIIL() {
        return this.LJII;
    }

    @Override // X.InterfaceC19526611aS
    public final boolean LJJI() {
        return this.LJI;
    }

    public C19529911az(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC19526611aS
    public final synchronized <T> T LJIIL(String str) {
        T t;
        t = (T) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (t == null) {
            t = null;
        }
        return t;
    }

    @Override // X.InterfaceC19526611aS
    public final void LJIIZILJ(C19525911aL c19525911aL) {
        this.LJFF = c19525911aL;
    }

    @Override // X.InterfaceC19526611aS
    public final synchronized void LJIJJ(InterfaceC19524311a5 interfaceC19524311a5) {
        this.LJ.add(interfaceC19524311a5.toString());
    }

    @Override // X.InterfaceC19526611aS
    public final synchronized void LJIJJLI(C19525911aL c19525911aL) {
        this.LIZJ.add(c19525911aL);
        this.LIZLLL.add(c19525911aL.LIZIZ);
        this.LJ.remove(c19525911aL.LIZIZ);
    }

    @Override // X.InterfaceC19526611aS
    public final synchronized void LJJIFFI(Object obj, String str) {
        if (obj == null) {
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        } else {
            ((ConcurrentHashMap) this.LIZIZ).put(str, obj);
        }
    }
}
