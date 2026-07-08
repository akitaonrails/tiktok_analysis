package X;

import kotlin.jvm.internal.Intrinsics;
import p2.j1;

/* JADX INFO: renamed from: X.13dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20055313dX extends AbstractC20055413dY {
    public final int LLJJ = C20054813dS.LJ(this);
    public AbstractC20055413dY LLJJI;

    @Override // X.AbstractC20055413dY
    public final void LLILZ() {
        for (AbstractC20055413dY abstractC20055413dY = this.LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLILZ();
        }
        super.LLILZ();
    }

    @Override // X.AbstractC20055413dY
    public final void LLJIJIL() {
        for (AbstractC20055413dY abstractC20055413dY = this.LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLJIJIL();
        }
        super.LLJIJIL();
    }

    @Override // X.AbstractC20055413dY
    public final void LLILLL() {
        super.LLILLL();
        for (AbstractC20055413dY abstractC20055413dY = this.LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLJILLL(this.LLIZLLLIL);
            if (!abstractC20055413dY.LLJILLL) {
                abstractC20055413dY.LLILLL();
            }
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLJI() {
        super.LLJI();
        for (AbstractC20055413dY abstractC20055413dY = this.LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLJI();
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLJILJIL() {
        super.LLJILJIL();
        for (AbstractC20055413dY abstractC20055413dY = this.LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLJILJIL();
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLJILJILJ(AbstractC20055413dY abstractC20055413dY) {
        this.LL = abstractC20055413dY;
        for (AbstractC20055413dY abstractC20055413dY2 = this.LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
            abstractC20055413dY2.LLJILJILJ(abstractC20055413dY);
        }
    }

    @Override // X.AbstractC20055413dY
    public final void LLJILLL(j1 j1Var) {
        this.LLIZLLLIL = j1Var;
        for (AbstractC20055413dY abstractC20055413dY = this.LLJJI; abstractC20055413dY != null; abstractC20055413dY = abstractC20055413dY.LLILZLL) {
            abstractC20055413dY.LLJILLL(j1Var);
        }
    }

    public final <T extends InterfaceC1691470u7N> T LLJJ(T t) {
        boolean z;
        AbstractC20055413dY abstractC20055413dY;
        AbstractC20055413dY abstractC20055413dYLJIJJ = t.LJIJJ();
        if (abstractC20055413dYLJIJJ != t) {
            z = true;
        } else {
            z = false;
        }
        AbstractC20055413dY abstractC20055413dY2 = null;
        if (z) {
            if ((t instanceof AbstractC20055413dY) && (abstractC20055413dY = (AbstractC20055413dY) t) != null) {
                abstractC20055413dY2 = abstractC20055413dY.LLILZIL;
            }
            if (abstractC20055413dYLJIJJ == this.LL && Intrinsics.LJFF(abstractC20055413dY2, this)) {
                return t;
            }
            "Cannot delegate to an already delegated node".toString();
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (!(!abstractC20055413dYLJIJJ.LLJILLL)) {
            C1696250uF5.LIZIZ("Cannot delegate to an already attached node");
        }
        abstractC20055413dYLJIJJ.LLJILJILJ(this.LL);
        int i = this.LLILLL;
        int iLJFF = C20054813dS.LJFF(abstractC20055413dYLJIJJ);
        abstractC20055413dYLJIJJ.LLILLL = iLJFF;
        int i2 = this.LLILLL;
        int i3 = iLJFF & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof InterfaceC20052813d8)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
            sbLIZ.append(this);
            sbLIZ.append("\nDelegate Node: ");
            sbLIZ.append(abstractC20055413dYLJIJJ);
            C1696250uF5.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        abstractC20055413dYLJIJJ.LLILZLL = this.LLJJI;
        this.LLJJI = abstractC20055413dYLJIJJ;
        abstractC20055413dYLJIJJ.LLILZIL = this;
        LLJJIII(iLJFF | this.LLILLL, false);
        if (this.LLJILLL) {
            if (i3 != 0 && (i & 2) == 0) {
                C20054913dT c20054913dT = C20052513d5.LJFF(this).LLJLLIL;
                this.LL.LLJILLL(null);
                c20054913dT.LJII();
            } else {
                LLJILLL(this.LLIZLLLIL);
            }
            abstractC20055413dYLJIJJ.LLILLL();
            abstractC20055413dYLJIJJ.LLJIJIL();
            if (!abstractC20055413dYLJIJJ.LLJILLL) {
                C1696250uF5.LIZIZ("autoInvalidateInsertedNode called on unattached node");
            }
            C20054813dS.LIZ(abstractC20055413dYLJIJJ, -1, 1);
        }
        return t;
    }

    public final void LLJJI(InterfaceC1691470u7N interfaceC1691470u7N) {
        AbstractC20055413dY abstractC20055413dY = null;
        for (AbstractC20055413dY abstractC20055413dY2 = this.LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
            if (abstractC20055413dY2 == interfaceC1691470u7N) {
                if (abstractC20055413dY2.LLJILLL) {
                    C20028313Yb<Object> c20028313Yb = C20054813dS.LIZ;
                    C20054813dS.LIZ(abstractC20055413dY2, -1, 2);
                    abstractC20055413dY2.LLJILJIL();
                    abstractC20055413dY2.LLILZ();
                }
                abstractC20055413dY2.LLJILJILJ(abstractC20055413dY2);
                abstractC20055413dY2.LLILZ = 0;
                if (abstractC20055413dY == null) {
                    this.LLJJI = abstractC20055413dY2.LLILZLL;
                } else {
                    abstractC20055413dY.LLILZLL = abstractC20055413dY2.LLILZLL;
                }
                abstractC20055413dY2.LLILZLL = null;
                abstractC20055413dY2.LLILZIL = null;
                int i = this.LLILLL;
                int iLJFF = C20054813dS.LJFF(this);
                LLJJIII(iLJFF, true);
                if (this.LLJILLL && (i & 2) != 0 && (iLJFF & 2) == 0) {
                    C20054913dT c20054913dT = C20052513d5.LJFF(this).LLJLLIL;
                    this.LL.LLJILLL(null);
                    c20054913dT.LJII();
                    return;
                }
                return;
            }
            abstractC20055413dY = abstractC20055413dY2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Could not find delegate: ");
        sbLIZ.append(interfaceC1691470u7N);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public final void LLJJIII(int i, boolean z) {
        int i2 = this.LLILLL;
        this.LLILLL = i;
        if (i2 != i) {
            int i3 = 0;
            if (LJIJJ() == this) {
                this.LLILZ = i;
            }
            if (this.LLJILLL) {
                AbstractC20055413dY abstractC20055413dY = this.LL;
                AbstractC20055413dY abstractC20055413dY2 = this;
                do {
                    i |= abstractC20055413dY2.LLILLL;
                    abstractC20055413dY2.LLILLL = i;
                    if (abstractC20055413dY2 == abstractC20055413dY) {
                        break;
                    } else {
                        abstractC20055413dY2 = abstractC20055413dY2.LLILZIL;
                    }
                } while (abstractC20055413dY2 != null);
                if (z && abstractC20055413dY2 == abstractC20055413dY) {
                    i = C20054813dS.LJFF(abstractC20055413dY);
                    abstractC20055413dY.LLILLL = i;
                }
                if (abstractC20055413dY2 != null) {
                    AbstractC20055413dY abstractC20055413dY3 = abstractC20055413dY2.LLILZLL;
                    if (abstractC20055413dY3 != null) {
                        i3 = abstractC20055413dY3.LLILZ;
                    }
                    int i4 = i | i3;
                    while (abstractC20055413dY2 != null) {
                        i4 |= abstractC20055413dY2.LLILLL;
                        abstractC20055413dY2.LLILZ = i4;
                        abstractC20055413dY2 = abstractC20055413dY2.LLILZIL;
                    }
                }
            }
        }
    }
}
