package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0YHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C871590YHd extends AbstractC866690XzH<InterfaceC871600YHe> implements InterfaceC871600YHe {
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public volatile InterfaceC871600YHe LLIZ;
    public volatile C0YED LLIZLLLIL;

    @Override // X.InterfaceC871600YHe
    public final void LJII() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("initMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJII();
        }
    }

    @Override // X.InterfaceC871600YHe
    public final List<C869590Y9l> LJIIIIZZ() {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessageListSync"));
        return c0yedLIZIZ != null ? LLLJ(c0yedLIZIZ).LJIIIIZZ() : arrayList;
    }

    @Override // X.InterfaceC871600YHe
    public final C869590Y9l LJIILJJIL() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLastShowSentMsg"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return LLLJ(c0yedLIZIZ).LJIILJJIL();
    }

    @Override // X.InterfaceC871600YHe
    public final boolean LJIJ() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isUptoOldest"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LJIJ();
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJIII() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("loadOlderMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJIII();
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJIZ() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("unregisterAll"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJIZ();
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJJI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("loadNewerMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJI();
        }
    }

    @Override // X.InterfaceC871600YHe
    public final boolean LJJJJI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isUpToNewest"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LJJJJI();
    }

    @Override // X.InterfaceC871600YHe
    public final int LJJJJIZL() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getPageLimit"));
        if (c0yedLIZIZ == null) {
            return 20;
        }
        return LLLJ(c0yedLIZIZ).LJJJJIZL();
    }

    @Override // X.InterfaceC871600YHe
    public final C869590Y9l LLLII() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLastShowMsgInDB"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return LLLJ(c0yedLIZIZ).LLLII();
    }

    @Override // X.InterfaceC871600YHe
    public final void resume() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("resume"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).resume();
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void stop() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("stop"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).stop();
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJIIJJI(int i) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("setPageLimit"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJIIJJI(i);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJJIL(InterfaceC868420Y4y interfaceC868420Y4y) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("register"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJIL(interfaceC868420Y4y);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJLLLL(long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("initMessageListAroundIndexFromRemote"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJLLLL(j);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LLILLL(long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("initMessageListByIndex"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLILLL(j);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LLJI(InterfaceC868420Y4y interfaceC868420Y4y) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("unregister"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLJI(interfaceC868420Y4y);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LLLILZ(C914150Ztd c914150Ztd) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("initMessageList"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLLILZ(c914150Ztd);
        } else {
            c914150Ztd.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LLLILZJ(boolean z) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("setPreviewMode"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLLILZJ(z);
        }
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC871600YHe LLLJ(C0YED c0yed) {
        InterfaceC871600YHe interfaceC871600YHe = this.LLIZ;
        if (interfaceC871600YHe != null && this.LLIZLLLIL == c0yed) {
            return interfaceC871600YHe;
        }
        InterfaceC871600YHe interfaceC871600YHeLJIIJ = c0yed.LJIJI().LJIIJ(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        if (this.LLILZLL) {
            interfaceC871600YHeLJIIJ.LLLILZJ(true);
        }
        this.LLIZ = interfaceC871600YHeLJIIJ;
        this.LLIZLLLIL = c0yed;
        return interfaceC871600YHeLJIIJ;
    }

    @Override // X.InterfaceC871600YHe
    public final void LLIIL(C0Y3I c0y3i, C869590Y9l c869590Y9l) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("addOrUpdateMessage"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LLIIL(c0y3i, c869590Y9l);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJJLZIJ(C0Y3I c0y3i, C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("addOrUpdateMessage"));
        if (c0yedLIZIZ != null) {
            LLLJ(c0yedLIZIZ).LJJJLZIJ(c0y3i, c869590Y9l, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    public C871590YHd(C0YEF c0yef, String str, boolean z, boolean z2, boolean z3) {
        super(c0yef, "MessageModelProxy");
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
    }
}
