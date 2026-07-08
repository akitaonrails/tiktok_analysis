package X;

import android.content.Context;

/* JADX INFO: renamed from: X.18dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21327818dI extends AbstractC21332918e7 {
    public final C21339618fC LLIZLLLIL;
    public AbstractC21333318eB<?> LLJ;

    public final AbstractC21333318eB<?> getRootViewManager() {
        return this.LLJ;
    }

    public C21327818dI(Context context) {
        super(context, null);
        C21339618fC c21339618fCLJ = C21333518eD.LJ(this, false);
        c21339618fCLJ.setFlexDirection(C14QL.COLUMN);
        c21339618fCLJ.setAlignItems(C14QJ.STRETCH);
        c21339618fCLJ.setMeasureFunction(null);
        this.LLIZLLLIL = c21339618fCLJ;
        this.LL = c21339618fCLJ;
        C1168270gVV.LIZ.getClass();
        if (C1168270gVV.LJI()) {
            setClipChildren(false);
        }
    }

    public final void setRootViewManager(AbstractC21333318eB<?> abstractC21333318eB) {
        if (this.LLJ != null) {
            return;
        }
        C21326718d7 c21326718d7 = abstractC21333318eB.LL.LIZ;
        this.LLILLJJLI = c21326718d7.LJIL;
        this.LLILLL = c21326718d7.LJJI;
        this.LLJ = abstractC21333318eB;
        addChildAt(abstractC21333318eB.LLILZLL, 0);
        addView(abstractC21333318eB.getView(), 0);
    }
}
