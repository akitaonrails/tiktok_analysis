package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bfk.b0;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t8L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653630t8L implements InterfaceC1653660t8O {
    public final Context LIZ;
    public final TabHost LIZIZ;
    public final h0<Boolean> LIZJ;
    public boolean LJ;
    public int LIZLLL = -1;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS569S0100000_25(this, 526));

    @Override // X.InterfaceC1653660t8O
    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        new C1351210lGZ(this.LIZ).LIZIZ(40, 20);
    }

    @Override // X.InterfaceC1653660t8O
    public final void LJI() {
        this.LIZJ.LJII(Boolean.TRUE);
        this.LIZLLL = this.LIZIZ.getCurrentIndex();
        this.LJ = false;
    }

    @Override // X.InterfaceC1653660t8O
    public final void LJII() {
        b0 b0Var;
        boolean z;
        int iIntValue;
        int iIntValue2;
        int i = this.LIZLLL;
        int childCount = ((ViewGroup) this.LJFF.getValue()).getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = ((ViewGroup) this.LJFF.getValue()).getChildAt(i2);
            if ((childAt instanceof b0) && (b0Var = (b0) childAt) != null) {
                if (Math.abs(((View) this.LJFF.getValue()).getPivotX() - C1428310nGv.LIZLLL(b0Var).centerX()) <= b0Var.getMeasuredWidth() / 2) {
                    z = true;
                    if (((Boolean) C0ADP.LIZ.getValue()).booleanValue()) {
                        iIntValue2 = this.LIZIZ.getSelectedColor();
                    } else {
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, b0Var.getContext());
                        iIntValue2 = numLIZJ != null ? numLIZJ.intValue() : -16777216;
                    }
                    b0Var.setTextColor(iIntValue2);
                    i = i2;
                } else {
                    z = false;
                    if (((Boolean) C0ADP.LIZ.getValue()).booleanValue()) {
                        iIntValue = this.LIZIZ.getUnselectedColor();
                    } else {
                        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.hp, b0Var.getContext());
                        iIntValue = numLIZJ2 != null ? numLIZJ2.intValue() : -1;
                    }
                    b0Var.setTextColor(iIntValue);
                }
                C1295960jpS lottieView = b0Var.getLottieView();
                if (lottieView != null && lottieView.getVisibility() == 0) {
                    C786410Ut5.f5(lottieView, z ? 1.0f : 0.8f);
                }
            }
        }
        if (this.LIZLLL != i) {
            this.LIZLLL = i;
            new C1351210lGZ(this.LIZ).LIZIZ(40, 20);
            this.LJ = true;
        }
    }

    @Override // X.InterfaceC1653660t8O
    public final void LJIIIIZZ() {
        this.LIZJ.LJII(Boolean.FALSE);
    }

    public C1653630t8L(Context context, TabHost tabHost, h0 h0Var) {
        this.LIZ = context;
        this.LIZIZ = tabHost;
        this.LIZJ = h0Var;
    }
}
