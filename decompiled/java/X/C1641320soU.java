package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0soU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641320soU {
    public final int LIZ;
    public int LIZIZ;
    public final List<View> LIZJ = new ArrayList();
    public int LIZLLL;
    public final /* synthetic */ ViewOnClickListenerC1641310soT LJ;

    public final boolean LIZ(View view) {
        if (this.LIZIZ <= 0) {
            return false;
        }
        int measuredWidth = view.getMeasuredWidth();
        if (measuredWidth <= this.LIZIZ) {
            ((ArrayList) this.LIZJ).add(view);
            this.LIZIZ -= measuredWidth;
            return true;
        }
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            return false;
        }
        this.LIZIZ = 0;
        ((ArrayList) this.LIZJ).add(view);
        return true;
    }

    public C1641320soU(ViewOnClickListenerC1641310soT viewOnClickListenerC1641310soT, int i) {
        this.LJ = viewOnClickListenerC1641310soT;
        this.LIZ = i;
        this.LIZIZ = i;
    }

    public final void LIZIZ(int i, int i2) {
        if (C426750GoL.LIZLLL(this.LJ.LL)) {
            Collections.reverse(this.LIZJ);
        }
        for (View view : (ArrayList) this.LIZJ) {
            int measuredHeight = ((this.LIZLLL - view.getMeasuredHeight()) >> 1) + i;
            view.layout(i2, measuredHeight, view.getMeasuredWidth() + i2, view.getMeasuredHeight() + measuredHeight);
            i2 = view.getRight();
        }
    }
}
