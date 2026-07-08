package X;

import Y.ACallableS412S0100000_4;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.keva.ext.KevaMultiProcessCache;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0C6V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public class C0C6V implements InterfaceC307780C4q {
    public final Set<Object> LIZ = new CopyOnWriteArraySet();
    public C308110C5x LIZIZ;
    public C308110C5x LIZJ;
    public C308110C5x LIZLLL;
    public C308110C5x LJ;
    public C308110C5x LJFF;
    public C308110C5x LJI;
    public C308110C5x LJII;
    public C308110C5x LJIIIIZZ;
    public C308110C5x LJIIIZ;

    @Override // X.InterfaceC307780C4q
    public final C308110C5x LIZ() {
        C308110C5x c308110C5x = this.LJIIIIZZ;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("cdnConfig", new ACallableS412S0100000_4(this, 20));
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LIZIZ() {
        C308110C5x c308110C5x = this.LIZIZ;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("CenterConfig", new ACallableS412S0100000_4(this, 24));
        return this.LIZIZ;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LIZJ() {
        C308110C5x c308110C5x = this.LJFF;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("metaConfig", new ACallableS412S0100000_4(this, 18));
        return this.LJFF;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LJ() {
        C308110C5x c308110C5x = this.LIZJ;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("libraConfig", new ACallableS412S0100000_4(this, 17));
        return this.LIZJ;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LJFF() {
        C308110C5x c308110C5x = this.LJI;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("launchConfig", new ACallableS412S0100000_4(this, 21));
        return this.LJI;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LJI() {
        C308110C5x c308110C5x = this.LJII;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("hybridConfig", new ACallableS412S0100000_4(this, 23));
        return this.LJII;
    }

    @Override // X.InterfaceC307780C4q
    public final C308110C5x LJII() {
        C308110C5x c308110C5x = this.LJIIIZ;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("cdnRowConfig", new ACallableS412S0100000_4(this, 16));
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LJIIIIZZ() {
        C308110C5x c308110C5x = this.LJ;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("preciseExposureConfig", new ACallableS412S0100000_4(this, 22));
        return this.LJ;
    }

    @Override // X.InterfaceC307780C4q
    public InterfaceC307670C4f LJIIIZ() {
        C308110C5x c308110C5x = this.LIZLLL;
        if (c308110C5x != null) {
            return c308110C5x;
        }
        C0C46.LIZ().LIZLLL("unRegisterConfig", new ACallableS412S0100000_4(this, 19));
        return this.LIZLLL;
    }

    public static Keva LJIIJ(String str) {
        C0C5A.LIZJ();
        Keva repoSync = KevaImpl.getRepoSync(str, 1);
        if (Keva.isOpenMultiProcessHashOptimized() && repoSync.isUserEnableHashIndex()) {
            return repoSync;
        }
        return KevaMultiProcessCache.getRepoSync(str);
    }

    @Override // X.InterfaceC307780C4q
    public void LIZLLL(C2115308Ql c2115308Ql) {
        ((CopyOnWriteArraySet) this.LIZ).add(c2115308Ql);
    }
}
