package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PHX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHX extends C0PHY<C0PHX> {
    public C0PHT LIZ;
    public final C642440PHu LIZIZ;
    public boolean LIZJ;
    public C0PHX LIZLLL;
    public C0PHX LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public C642240PHa LJIIJ;
    public int LJIIIIZZ = -1;
    public String LJIIIZ = "";
    public final List<C0PHW> LJIIJJI = new ArrayList();

    public final synchronized void LJ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        this.LIZIZ.LIZ(this, this.LIZ);
    }

    public final C0PHX LJFF() {
        C0PHX c0phx = this.LJ;
        if (c0phx != null) {
            c0phx.LIZLLL = this.LIZLLL;
        }
        C0PHX c0phx2 = this.LIZLLL;
        if (c0phx2 != null) {
            c0phx2.LJ = c0phx;
        }
        return c0phx2;
    }

    public final C0PHX LJII() {
        C0PHX c0phx = this.LIZLLL;
        return c0phx != null ? c0phx.LJII() : this;
    }

    public final C0PHX LIZLLL() {
        ArrayList arrayList;
        ArrayList arrayList2;
        LJ();
        LJ();
        C0PHX c0phx = new C0PHX(this.LIZ, this.LJIIJ, this.LIZIZ, this.LIZJ);
        LJ();
        c0phx.LJIIIZ = this.LJIIIZ;
        c0phx.LJI = this.LJI;
        c0phx.LJII = this.LJII;
        c0phx.LJ();
        List<C0PHW> list = c0phx.LJIIJJI;
        C0PHW c0phw = null;
        if ((list instanceof ArrayList) && (arrayList2 = (ArrayList) list) != null) {
            arrayList2.clear();
        }
        LJ();
        Iterator<C0PHW> it2 = this.LJIIJJI.iterator();
        while (it2.hasNext()) {
            C0PHW c0phw2 = new C0PHW(it2.next().LIZ, this.LIZ, c0phx);
            if (c0phw != null) {
                c0phw.LIZLLL = c0phw2;
                c0phw2.LJ = c0phw;
            }
            c0phx.LJ();
            List<C0PHW> list2 = c0phx.LJIIJJI;
            if ((list2 instanceof ArrayList) && (arrayList = (ArrayList) list2) != null) {
                arrayList.add(c0phw2);
            }
            c0phw = c0phw2;
        }
        return c0phx;
    }

    @Override // X.C0PHY
    public final /* bridge */ /* synthetic */ C0PHY LIZ() {
        return this.LIZLLL;
    }

    @Override // X.C0PHY
    public final /* bridge */ /* synthetic */ C0PHY LIZIZ() {
        return this.LJ;
    }

    public final C0PHX LIZJ(C0PHX c0phx) {
        C0PHX c0phxLIZLLL;
        if (c0phx != null) {
            c0phxLIZLLL = c0phx.LIZLLL();
        } else {
            c0phxLIZLLL = null;
        }
        if (Intrinsics.LJFF(this.LIZ.LIZ, this)) {
            this.LIZ.LIZ = c0phxLIZLLL;
        }
        if (Intrinsics.LJFF(this.LIZ.LIZIZ, this)) {
            this.LIZ.LIZIZ = c0phxLIZLLL;
        }
        if (c0phxLIZLLL != null) {
            c0phxLIZLLL.LJ = this.LJ;
            c0phxLIZLLL.LIZLLL = this.LIZLLL;
        }
        C0PHX c0phx2 = this.LJ;
        if (c0phx2 != null) {
            c0phx2.LIZLLL = c0phxLIZLLL;
        }
        C0PHX c0phx3 = this.LIZLLL;
        if (c0phx3 != null) {
            c0phx3.LJ = c0phxLIZLLL;
        }
        return c0phxLIZLLL;
    }

    public final void LJI(C0PHX c0phx) {
        C0PHX c0phx2 = this.LIZLLL;
        this.LIZLLL = c0phx.LIZLLL;
        c0phx.LIZLLL = c0phx2;
        C0PHX c0phx3 = this.LIZLLL;
        if (c0phx3 != null) {
            c0phx3.LJ = this;
        }
        if (c0phx2 != null) {
            c0phx2.LJ = c0phx;
        }
        C0PHX c0phx4 = this.LJ;
        this.LJ = c0phx.LJ;
        c0phx.LJ = c0phx4;
        C0PHX c0phx5 = this.LJ;
        if (c0phx5 != null) {
            c0phx5.LIZLLL = this;
        }
        if (c0phx4 != null) {
            c0phx4.LIZLLL = c0phx;
        }
    }

    public C0PHX(C0PHT c0pht, C642240PHa c642240PHa, C642440PHu c642440PHu, boolean z) {
        this.LIZ = c0pht;
        this.LIZIZ = c642440PHu;
        this.LIZJ = z;
        this.LJIIJ = c642240PHa;
    }
}
