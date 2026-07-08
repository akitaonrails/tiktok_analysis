package X;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19s6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21674419s6 {
    public final C830530Wi3<RecyclerView.ViewHolder, C21675619sI> LIZ = new C830530Wi3<>();
    public final C20066713fN<RecyclerView.ViewHolder> LIZIZ = new C20066713fN<>();

    public final void LIZJ(RecyclerView.ViewHolder viewHolder) {
        C21675619sI c21675619sI = this.LIZ.get(viewHolder);
        if (c21675619sI == null) {
            return;
        }
        c21675619sI.LIZ &= -2;
    }

    public final void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        int iLJIIJJI = this.LIZIZ.LJIIJJI() - 1;
        while (true) {
            if (iLJIIJJI < 0) {
                break;
            }
            if (viewHolder == this.LIZIZ.LJIIL(iLJIIJJI)) {
                C20066713fN<RecyclerView.ViewHolder> c20066713fN = this.LIZIZ;
                Object[] objArr = c20066713fN.LLILLL;
                Object obj = objArr[iLJIIJJI];
                Object obj2 = C20067913fZ.LIZ;
                if (obj != obj2) {
                    objArr[iLJIIJJI] = obj2;
                    c20066713fN.LL = true;
                }
            } else {
                iLJIIJJI--;
            }
        }
        C21675619sI c21675619sIRemove = this.LIZ.remove(viewHolder);
        if (c21675619sIRemove != null) {
            c21675619sIRemove.LIZ = 0;
            c21675619sIRemove.LIZIZ = null;
            c21675619sIRemove.LIZJ = null;
            C21675619sI.LIZLLL.LIZ(c21675619sIRemove);
        }
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder, C21676319sP c21676319sP) {
        C21675619sI c21675619sILIZ = this.LIZ.get(viewHolder);
        if (c21675619sILIZ == null) {
            c21675619sILIZ = C21675619sI.LIZ();
            this.LIZ.put(viewHolder, c21675619sILIZ);
        }
        c21675619sILIZ.LIZJ = c21676319sP;
        c21675619sILIZ.LIZ |= 8;
    }

    public final C21676319sP LIZIZ(RecyclerView.ViewHolder viewHolder, int i) {
        C21675619sI c21675619sILJIIIIZZ;
        C21676319sP c21676319sP;
        int iLIZLLL = this.LIZ.LIZLLL(viewHolder);
        if (iLIZLLL >= 0 && (c21675619sILJIIIIZZ = this.LIZ.LJIIIIZZ(iLIZLLL)) != null) {
            int i2 = c21675619sILJIIIIZZ.LIZ;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                c21675619sILJIIIIZZ.LIZ = i3;
                if (i == 4) {
                    c21676319sP = c21675619sILJIIIIZZ.LIZIZ;
                } else if (i == 8) {
                    c21676319sP = c21675619sILJIIIIZZ.LIZJ;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.LIZ.LJI(iLIZLLL);
                    c21675619sILJIIIIZZ.LIZ = 0;
                    c21675619sILJIIIIZZ.LIZIZ = null;
                    c21675619sILJIIIIZZ.LIZJ = null;
                    C21675619sI.LIZLLL.LIZ(c21675619sILJIIIIZZ);
                }
                return c21676319sP;
            }
        }
        return null;
    }
}
