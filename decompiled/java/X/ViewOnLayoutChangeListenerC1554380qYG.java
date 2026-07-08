package X;

import android.view.View;

/* JADX INFO: renamed from: X.0qYG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ViewOnLayoutChangeListenerC1554380qYG implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1554380qYG(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1554380qYG viewOnLayoutChangeListenerC1554380qYG, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iLJJLJ;
        int iLJJLIIIJLLLLLLLZ;
        int i9 = i4 - i2;
        if (i3 - i != i7 - i5 || i9 != i8 - i6) {
            if (((C21305518Zh) viewOnLayoutChangeListenerC1554380qYG.l0).LLLLLJIL().LJJLJ() > 0) {
                iLJJLJ = ((C21305518Zh) viewOnLayoutChangeListenerC1554380qYG.l0).LLLLLJIL().LJJLJ();
            } else {
                iLJJLJ = 9;
            }
            if (((C21305518Zh) viewOnLayoutChangeListenerC1554380qYG.l0).LLLLLJIL().LJJLIIIJLLLLLLLZ() > 0) {
                iLJJLIIIJLLLLLLLZ = ((C21305518Zh) viewOnLayoutChangeListenerC1554380qYG.l0).LLLLLJIL().LJJLIIIJLLLLLLLZ();
            } else {
                iLJJLIIIJLLLLLLLZ = 16;
            }
            ((C21305518Zh) viewOnLayoutChangeListenerC1554380qYG.l0).LLLLLL(iLJJLJ, iLJJLIIIJLLLLLLLZ);
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1554380qYG viewOnLayoutChangeListenerC1554380qYG, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1541970qEF) viewOnLayoutChangeListenerC1554380qYG.l0).LIZIZ();
    }
}
