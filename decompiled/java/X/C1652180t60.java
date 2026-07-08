package X;

import iyl.i3;
import java.util.List;

/* JADX INFO: renamed from: X.0t60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652180t60 extends AbstractC1651610t55 implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public final C1DRG LLILZIL;
    public final C1664740tQG LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1652180t60.class, "toolbarViewPool", "getToolbarViewPool()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1657840tF8
    public final InterfaceC1657880tFC LIZIZ(i3 i3Var) {
        if (i3Var.LLILLL.getType() == 1800) {
            return new C1659480tHm(this.LL, this.LLILZIL);
        }
        if (i3Var.LLILLL.getType() == 4) {
            return new C1396280mRG(this.LL, this.LLILZIL, (List) this.LLILZLL.getValue(this, LLIZ[0]));
        }
        if (i3Var.LLILLL.getType() == 21) {
            return new C907250ZiV(this.LL, this.LLILZIL, (List) this.LLILZLL.getValue(this, LLIZ[0]));
        }
        if (i3Var.LLILLL.getType() == 1801) {
            return new C1659240tHO(this.LL, this.LLILZIL);
        }
        return new C1659220tHM(this.LL, this.LLILZIL, (List) this.LLILZLL.getValue(this, LLIZ[0]));
    }

    public C1652180t60(C1459970o5z c1459970o5z, C1DRG c1drg) {
        super(c1459970o5z);
        this.LLILZIL = c1drg;
        this.LLILZLL = C1664770tQJ.LIZIZ(c1drg, List.class, "toolbar_view_pool");
    }
}
