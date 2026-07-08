package X;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552220qUm extends AbstractC1552800qVi {
    public final List<AbstractC1552800qVi> LIZ;

    public C1552220qUm(AbstractC1552800qVi... abstractC1552800qViArr) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.LIZ = copyOnWriteArrayList;
        copyOnWriteArrayList.addAll(Arrays.asList(abstractC1552800qViArr));
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        for (AbstractC1552800qVi abstractC1552800qVi : (CopyOnWriteArrayList) this.LIZ) {
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LIZJ(c1552250qUp, abstractC1552240qUo);
            }
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LJ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        for (AbstractC1552800qVi abstractC1552800qVi : (CopyOnWriteArrayList) this.LIZ) {
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LJ(c1552250qUp, abstractC1552240qUo);
            }
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LJI(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo) {
        for (AbstractC1552800qVi abstractC1552800qVi : (CopyOnWriteArrayList) this.LIZ) {
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LJI(c1552250qUp, abstractC1552240qUo);
            }
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZ(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        for (AbstractC1552800qVi abstractC1552800qVi : (CopyOnWriteArrayList) this.LIZ) {
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LIZ(c1552250qUp, abstractC1552240qUo, th);
            }
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LIZLLL(C1552250qUp c1552250qUp, AbstractC1552240qUo abstractC1552240qUo, Throwable th) {
        for (AbstractC1552800qVi abstractC1552800qVi : (CopyOnWriteArrayList) this.LIZ) {
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LIZLLL(c1552250qUp, abstractC1552240qUo, th);
            }
        }
    }

    @Override // X.AbstractC1552800qVi
    public final void LJFF(C1552250qUp c1552250qUp, C1551760qU2 c1551760qU2, Throwable th) {
        for (AbstractC1552800qVi abstractC1552800qVi : (CopyOnWriteArrayList) this.LIZ) {
            if (abstractC1552800qVi != null) {
                abstractC1552800qVi.LJFF(c1552250qUp, c1551760qU2, th);
            }
        }
    }
}
