package X;

import kotlin.jvm.internal.Intrinsics;
import p2.h1;
import p2.j1;

/* JADX INFO: renamed from: X.13dW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20055213dW {
    public AbstractC20055413dY LIZ;
    public int LIZIZ;
    public C19968013Aw<InterfaceC1672410tcd> LIZJ;
    public C19968013Aw<InterfaceC1672410tcd> LIZLLL;
    public boolean LJ;
    public final /* synthetic */ C20054913dT LJFF;

    public final void LIZJ() {
        AbstractC20055413dY abstractC20055413dY = this.LIZ.LLILZLL;
        this.LJFF.getClass();
        if ((abstractC20055413dY.LLILLL & 2) != 0) {
            j1 j1Var = abstractC20055413dY.LLIZLLLIL;
            j1 j1Var2 = j1Var.LLJJIII;
            j1 j1Var3 = j1Var.LLJJI;
            if (j1Var2 != null) {
                j1Var2.LLJJI = j1Var3;
            }
            j1Var3.LLJJIII = j1Var2;
            C20054913dT.LIZ(this.LJFF, this.LIZ, j1Var3);
        }
        this.LJFF.getClass();
        this.LIZ = C20054913dT.LIZJ(abstractC20055413dY);
    }

    public final void LIZIZ(int i) {
        int i2 = this.LIZIZ + i;
        AbstractC20055413dY abstractC20055413dY = this.LIZ;
        C20054913dT c20054913dT = this.LJFF;
        InterfaceC1672410tcd interfaceC1672410tcd = this.LIZLLL.LL[i2];
        c20054913dT.getClass();
        this.LIZ = C20054913dT.LIZIZ(interfaceC1672410tcd, abstractC20055413dY);
        this.LJFF.getClass();
        if (this.LJ) {
            AbstractC20055413dY abstractC20055413dY2 = this.LIZ;
            j1 j1Var = abstractC20055413dY2.LLILZLL.LLIZLLLIL;
            InterfaceC20052813d8 interfaceC20052813d8LIZJ = C20052513d5.LIZJ(abstractC20055413dY2);
            if (interfaceC20052813d8LIZJ != null) {
                C20052713d7 c20052713d7 = new C20052713d7(this.LJFF.LIZ, interfaceC20052813d8LIZJ);
                this.LIZ.LLJILLL(c20052713d7);
                C20054913dT.LIZ(this.LJFF, this.LIZ, c20052713d7);
                c20052713d7.LLJJIII = j1Var.LLJJIII;
                c20052713d7.LLJJI = j1Var;
                j1Var.LLJJIII = c20052713d7;
            } else {
                this.LIZ.LLJILLL(j1Var);
            }
            this.LIZ.LLILLL();
            this.LIZ.LLJIJIL();
            AbstractC20055413dY abstractC20055413dY3 = this.LIZ;
            C20028313Yb<Object> c20028313Yb = C20054813dS.LIZ;
            if (!abstractC20055413dY3.LLJILLL) {
                C1696250uF5.LIZIZ("autoInvalidateInsertedNode called on unattached node");
            }
            C20054813dS.LIZ(abstractC20055413dY3, -1, 1);
            return;
        }
        this.LIZ.LLJ = true;
    }

    public final boolean LIZ(int i, int i2) {
        C19968013Aw<InterfaceC1672410tcd> c19968013Aw = this.LIZJ;
        int i3 = this.LIZIZ;
        InterfaceC1672410tcd interfaceC1672410tcd = c19968013Aw.LL[i + i3];
        InterfaceC1672410tcd interfaceC1672410tcd2 = this.LIZLLL.LL[i3 + i2];
        C20057113dp c20057113dp = h1.LIZ;
        if (Intrinsics.LJFF(interfaceC1672410tcd, interfaceC1672410tcd2) || C20051013cq.LIZ(interfaceC1672410tcd, interfaceC1672410tcd2)) {
            return true;
        }
        return false;
    }

    public final void LIZLLL(int i, int i2) {
        this.LIZ = this.LIZ.LLILZLL;
        C19968013Aw<InterfaceC1672410tcd> c19968013Aw = this.LIZJ;
        int i3 = this.LIZIZ;
        InterfaceC1672410tcd interfaceC1672410tcd = c19968013Aw.LL[i + i3];
        InterfaceC1672410tcd interfaceC1672410tcd2 = this.LIZLLL.LL[i3 + i2];
        if (!Intrinsics.LJFF(interfaceC1672410tcd, interfaceC1672410tcd2)) {
            C20054913dT c20054913dT = this.LJFF;
            AbstractC20055413dY abstractC20055413dY = this.LIZ;
            c20054913dT.getClass();
            C20054913dT.LJIIIIZZ(interfaceC1672410tcd, interfaceC1672410tcd2, abstractC20055413dY);
            this.LJFF.getClass();
            return;
        }
        this.LJFF.getClass();
    }

    public C20055213dW(C20054913dT c20054913dT, AbstractC20055413dY abstractC20055413dY, int i, C19968013Aw<InterfaceC1672410tcd> c19968013Aw, C19968013Aw<InterfaceC1672410tcd> c19968013Aw2, boolean z) {
        this.LJFF = c20054913dT;
        this.LIZ = abstractC20055413dY;
        this.LIZIZ = i;
        this.LIZJ = c19968013Aw;
        this.LIZLLL = c19968013Aw2;
        this.LJ = z;
    }
}
