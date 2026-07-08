package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.11ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19529711ax implements InterfaceC19526511aR {
    public final Context LIZ;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public C09AE LJIIIIZZ;
    public final LifecycleOwner LIZIZ = null;
    public final CopyOnWriteArrayList<InterfaceC19526611aS> LIZJ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArraySet<InterfaceC19524311a5> LIZLLL = new CopyOnWriteArraySet<>();
    public final ConcurrentHashMap<InterfaceC19524311a5, Set<InterfaceC19526611aS>> LJ = new ConcurrentHashMap<>();
    public final C19527011aW LJFF = new C19527011aW();
    public final List<C09AE> LJIIIZ = new ArrayList();

    @Override // X.InterfaceC19526511aR
    public final void LIZLLL() {
        this.LJII = true;
        for (C09AE c09ae : (ArrayList) this.LJIIIZ) {
            if (c09ae != null && c09ae.isActive()) {
                c09ae.LIZIZ(null);
            }
        }
        C09AE c09ae2 = this.LJIIIIZZ;
        if (c09ae2 == null || !c09ae2.isActive()) {
            return;
        }
        C19529611aw.LIZ();
        C09AE c09ae3 = this.LJIIIIZZ;
        if (c09ae3 != null) {
            c09ae3.LIZIZ(null);
        }
    }

    @Override // X.InterfaceC19526511aR
    public final void LJFF() {
        this.LJFF.LIZ = null;
    }

    @Override // X.InterfaceC19526511aR
    public final List<InterfaceC19524311a5> LJ() {
        List<InterfaceC19524311a5> listLLIIII = C13LP.LLIIII(this.LIZLLL);
        this.LIZLLL.clear();
        return listLLIIII;
    }

    @Override // X.InterfaceC19526511aR
    public final List<InterfaceC19526611aS> LLILIL() {
        return C13LP.LLIIII(this.LIZJ);
    }

    @Override // X.InterfaceC19526511aR
    public final boolean LIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC19526511aR
    public final C19527011aW LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC19526511aR
    public final boolean LJJIJIIJIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC19526511aR
    public final Context getContext() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19526511aR
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZIZ;
    }

    public C19529711ax(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC19526511aR
    public final Set<InterfaceC19526611aS> LIZIZ(InterfaceC19524311a5 interfaceC19524311a5) {
        Set<InterfaceC19526611aS> linkedHashSet;
        synchronized (this) {
            try {
                linkedHashSet = this.LJ.get(interfaceC19524311a5);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet<>();
                    this.LJ.put(interfaceC19524311a5, linkedHashSet);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return linkedHashSet;
    }

    @Override // X.InterfaceC19526511aR
    public final void LJI(InterfaceC19524311a5 interfaceC19524311a5) {
        this.LIZLLL.add(interfaceC19524311a5);
    }

    @Override // X.InterfaceC19526511aR
    public final void LJII(C19529911az c19529911az) {
        this.LIZJ.add(c19529911az);
    }

    @Override // X.InterfaceC19526511aR
    public final void LJIIIIZZ(AnonymousClass0956 anonymousClass0956) {
        ((ArrayList) this.LJIIIZ).add(anonymousClass0956);
    }
}
