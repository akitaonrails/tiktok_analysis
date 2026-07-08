package X;

import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0rhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598800rhu {
    public final C1600450rkZ LIZ;
    public EnumC1599390rir LIZIZ = EnumC1599390rir.NONE;
    public ViewGroup LIZJ;

    public C1598800rhu(C1600450rkZ c1600450rkZ) {
        this.LIZ = c1600450rkZ;
    }

    public final void LIZ(EnumC1599390rir enumC1599390rir, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ViewGroup viewGroup2;
        if (enumC1599390rir == EnumC1599390rir.NONE) {
            return;
        }
        if (this.LIZIZ == enumC1599390rir && this.LIZJ == viewGroup && this.LIZ.getParent() == viewGroup) {
            C786410Ut5.s7(this.LIZ, layoutParams);
            return;
        }
        ViewParent parent = this.LIZ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LIZ, viewGroup2);
        }
        C786410Ut5.s7(this.LIZ, layoutParams);
        viewGroup.addView(this.LIZ);
        this.LIZJ = viewGroup;
        this.LIZIZ = enumC1599390rir;
    }
}
