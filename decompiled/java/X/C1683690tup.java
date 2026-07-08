package X;

import android.graphics.Canvas;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1683690tup extends AbstractC1683020ttk implements InterfaceC20035313aJ {
    public final boolean LLILLJJLI;
    public final float LLILLL;
    public final C05P1<C1685910tyP> LLILZ;
    public final C05P1<C0NW6> LLILZIL;
    public final C1683700tuq LLILZLL;
    public final C05P0 LLIZ;
    public final C05P0 LLIZLLLIL;
    public long LLJ;
    public int LLJI;
    public final AwS569S0100000_25 LLJIJIL;

    public C1683690tup() {
        throw null;
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJFF() {
    }

    public final void LJII() {
        C1683700tuq c1683700tuq = this.LLILZLL;
        c1683700tuq.getClass();
        ((C13FE) this.LLIZ).setValue(null);
        C1696990uGH c1696990uGH = (C1696990uGH) ((LinkedHashMap) c1683700tuq.LLILZ.LIZ).get(this);
        if (c1696990uGH != null) {
            c1696990uGH.LIZIZ();
            C1683720tus c1683720tus = c1683700tuq.LLILZ;
            Object obj = ((LinkedHashMap) c1683720tus.LIZ).get(this);
            if (obj != null) {
                c1683720tus.LIZIZ.remove(obj);
            }
            c1683720tus.LIZ.remove(this);
            ((ArrayList) c1683700tuq.LLILLL).add(c1696990uGH);
        }
    }

    @Override // X.InterfaceC20035313aJ
    public final void LIZLLL() {
        LJII();
    }

    @Override // X.InterfaceC20035313aJ
    public final void LJ() {
        LJII();
    }

    @Override // X.InterfaceC1680330tpP
    public final void LIZ(InterfaceC1669010tX9 interfaceC1669010tX9) {
        int iLJLLJ;
        this.LLJ = interfaceC1669010tX9.LIZIZ();
        if (Float.isNaN(this.LLILLL)) {
            iLJLLJ = C814420VxA.LIZIZ(C1683580tue.LIZ(interfaceC1669010tX9, this.LLILLJJLI, interfaceC1669010tX9.LIZIZ()));
        } else {
            iLJLLJ = interfaceC1669010tX9.LJLLJ(this.LLILLL);
        }
        this.LLJI = iLJLLJ;
        long j = this.LLILZ.getValue().LIZ;
        float f = this.LLILZIL.getValue().LIZLLL;
        interfaceC1669010tX9.LLIIJLIL();
        LIZJ(this.LLILLL, j, interfaceC1669010tX9);
        InterfaceC1686290tz1 interfaceC1686290tz1LIZ = interfaceC1669010tX9.LJLJI().LIZ();
        ((Boolean) ((C13FE) this.LLIZLLLIL).getValue()).booleanValue();
        C1696990uGH c1696990uGH = (C1696990uGH) ((C13FE) this.LLIZ).getValue();
        if (c1696990uGH != null) {
            c1696990uGH.LJ(f, this.LLJI, interfaceC1669010tX9.LIZIZ(), j);
            Canvas canvas = C1296530jqN.LIZ;
            c1696990uGH.draw(((C1696880uG6) interfaceC1686290tz1LIZ).LIZ);
        }
    }

    @Override // X.AbstractC1683020ttk
    public final void LJI(C0NW2 c0nw2) {
        C1696990uGH c1696990uGH = (C1696990uGH) ((C13FE) this.LLIZ).getValue();
        if (c1696990uGH != null) {
            c1696990uGH.LIZLLL();
        }
    }

    @Override // X.AbstractC1683020ttk
    public final void LIZIZ(C0NW2 c0nw2, InterfaceC497601wk interfaceC497601wk) {
        C1683700tuq c1683700tuq = this.LLILZLL;
        C1696990uGH c1696990uGH = (C1696990uGH) ((LinkedHashMap) c1683700tuq.LLILZ.LIZ).get(this);
        if (c1696990uGH == null) {
            c1696990uGH = (C1696990uGH) C19719612Di.LJJIIZI(c1683700tuq.LLILLL);
            if (c1696990uGH == null) {
                if (c1683700tuq.LLILZIL > C1697810uHb.LJIIJ(c1683700tuq.LLILLJJLI)) {
                    c1696990uGH = new C1696990uGH(c1683700tuq.getContext());
                    c1683700tuq.addView(c1696990uGH);
                    ((ArrayList) c1683700tuq.LLILLJJLI).add(c1696990uGH);
                } else {
                    c1696990uGH = (C1696990uGH) ListProtector.get(c1683700tuq.LLILLJJLI, c1683700tuq.LLILZIL);
                    C1683690tup c1683690tup = (C1683690tup) ((LinkedHashMap) c1683700tuq.LLILZ.LIZIZ).get(c1696990uGH);
                    if (c1683690tup != null) {
                        ((C13FE) c1683690tup.LLIZ).setValue(null);
                        C1683720tus c1683720tus = c1683700tuq.LLILZ;
                        Object obj = ((LinkedHashMap) c1683720tus.LIZ).get(c1683690tup);
                        if (obj != null) {
                            c1683720tus.LIZIZ.remove(obj);
                        }
                        c1683720tus.LIZ.remove(c1683690tup);
                        c1696990uGH.LIZIZ();
                    }
                }
                int i = c1683700tuq.LLILZIL;
                if (i < c1683700tuq.LL - 1) {
                    c1683700tuq.LLILZIL = i + 1;
                } else {
                    c1683700tuq.LLILZIL = 0;
                }
            }
            C1683720tus c1683720tus2 = c1683700tuq.LLILZ;
            c1683720tus2.LIZ.put(this, c1696990uGH);
            c1683720tus2.LIZIZ.put(c1696990uGH, this);
        }
        c1696990uGH.LIZ(c0nw2, this.LLILLJJLI, this.LLJ, this.LLJI, this.LLILZ.getValue().LIZ, this.LLILZIL.getValue().LIZLLL, this.LLJIJIL);
        ((C13FE) this.LLIZ).setValue(c1696990uGH);
    }

    public C1683690tup(boolean z, float f, C05P0 c05p0, C05P0 c05p02, C1683700tuq c1683700tuq) {
        super(c05p02, z);
        this.LLILLJJLI = z;
        this.LLILLL = f;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c1683700tuq;
        this.LLIZ = C20028913Yh.LJI(null);
        this.LLIZLLLIL = C20028913Yh.LJI(Boolean.TRUE);
        this.LLJ = 0L;
        this.LLJI = -1;
        this.LLJIJIL = new AwS569S0100000_25(this, 754);
    }
}
