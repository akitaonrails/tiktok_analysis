package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.18to, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21430218to {
    public AbstractC21430218to LIZ;
    public AbstractC21430218to LIZIZ;
    public AbstractC21430218to LIZJ;
    public AbstractC21430218to LIZLLL;
    public AbstractC21430218to LJ;

    public abstract void LIZ(InterfaceC21437318ux interfaceC21437318ux);

    public String LJ() {
        return "";
    }

    public final void LJFF() {
        AbstractC21430218to abstractC21430218to = this.LIZLLL;
        if (abstractC21430218to != null) {
            abstractC21430218to.LJ = this.LJ;
        } else {
            AbstractC21430218to abstractC21430218to2 = this.LIZ;
            if (abstractC21430218to2 != null) {
                abstractC21430218to2.LIZIZ = this.LJ;
            }
        }
        AbstractC21430218to abstractC21430218to3 = this.LJ;
        if (abstractC21430218to3 != null) {
            abstractC21430218to3.LIZLLL = abstractC21430218to;
        } else {
            AbstractC21430218to abstractC21430218to4 = this.LIZ;
            if (abstractC21430218to4 != null) {
                abstractC21430218to4.LIZJ = abstractC21430218to;
            }
        }
        this.LIZ = null;
        this.LJ = null;
        this.LIZLLL = null;
    }

    public AbstractC21430218to() {
        new HashMap();
    }

    public String toString() {
        return getClass().getSimpleName() + "{" + LJ() + "}";
    }

    public AbstractC21430218to LIZJ() {
        return this.LIZ;
    }

    public final void LIZIZ(AbstractC21430218to abstractC21430218to) {
        abstractC21430218to.LJFF();
        abstractC21430218to.LIZLLL(this);
        AbstractC21430218to abstractC21430218to2 = this.LIZJ;
        if (abstractC21430218to2 != null) {
            abstractC21430218to2.LJ = abstractC21430218to;
            abstractC21430218to.LIZLLL = abstractC21430218to2;
            this.LIZJ = abstractC21430218to;
        } else {
            this.LIZIZ = abstractC21430218to;
            this.LIZJ = abstractC21430218to;
        }
    }

    public void LIZLLL(AbstractC21430218to abstractC21430218to) {
        this.LIZ = abstractC21430218to;
    }
}
