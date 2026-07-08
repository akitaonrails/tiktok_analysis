package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0DHv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336690DHv extends C336680DHu {
    public View LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public ConstraintLayout LLJILLL;
    public ConstraintLayout LLJJ;
    public ConstraintLayout LLJJI;
    public ConstraintLayout LLJJIII;
    public TuxTextView LLJJIJI;
    public ConstraintLayout LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public ConstraintLayout LLJJJ;
    public View LLJJJIL;
    public C1322110kVd LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public InterfaceC376660Epk LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public C054G LLJJLIIIJLLLLLLLZ;

    @Override // X.C336680DHu, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        CoroutineContext coroutineContext;
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJL = null;
        C054G c054g = this.LLJJLIIIJLLLLLLLZ;
        if (c054g != null && (coroutineContext = c054g.LL) != null) {
            C23118094a.LJ(coroutineContext);
        }
        this.LLJJLIIIJLLLLLLLZ = null;
        super.onDetachedFromWindow();
    }

    @Override // X.C336680DHu
    public final void LIZIZ() {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.c4n, this, true);
        this.LLJIJIL = viewTd;
        this.LLJJIII = viewTd != null ? (ConstraintLayout) viewTd.findViewById(R.id.h_s) : null;
        View view = this.LLJIJIL;
        this.LLJJJ = view != null ? (ConstraintLayout) view.findViewById(R.id.h_h) : null;
        View view2 = this.LLJIJIL;
        this.LLJILJIL = view2 != null ? (ConstraintLayout) view2.findViewById(R.id.ha4) : null;
        View view3 = this.LLJIJIL;
        this.LLJILJILJ = view3 != null ? (TuxTextView) view3.findViewById(R.id.had) : null;
        View view4 = this.LLJIJIL;
        this.LLJJIJIIJIL = view4 != null ? (ConstraintLayout) view4.findViewById(R.id.h_f) : null;
        View view5 = this.LLJIJIL;
        this.LLJILLL = view5 != null ? (ConstraintLayout) view5.findViewById(R.id.h_x) : null;
        View view6 = this.LLJIJIL;
        this.LLJJ = view6 != null ? (ConstraintLayout) view6.findViewById(R.id.h_q) : null;
        View view7 = this.LLJIJIL;
        this.LLJJIJIL = view7 != null ? (ConstraintLayout) view7.findViewById(R.id.h_g) : null;
        View view8 = this.LLJIJIL;
        this.LLJJI = view8 != null ? (ConstraintLayout) view8.findViewById(R.id.h_n) : null;
        View view9 = this.LLJIJIL;
        this.LLJJJIL = view9 != null ? view9.findViewById(R.id.h_e) : null;
        View view10 = this.LLJIJIL;
        this.LLJJJJ = view10 != null ? (C1322110kVd) view10.findViewById(R.id.h_5) : null;
        View view11 = this.LLJIJIL;
        this.LLJJJJJIL = view11 != null ? (TuxTextView) view11.findViewById(R.id.h_r) : null;
        View view12 = this.LLJIJIL;
        this.LLJJIJI = view12 != null ? (TuxTextView) view12.findViewById(R.id.h_z) : null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C054G c054gLIZ = this.LLJJLIIIJLLLLLLLZ;
        if (c054gLIZ == null) {
            C23119094b c23119094bLIZ = C2296908zH.LIZ();
            C1DFH c1dfh = C0PEM.LIZ;
            c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
            this.LLJJLIIIJLLLLLLLZ = c054gLIZ;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        this.LLJJL = C23250099c.LIZLLL(c054gLIZ, C2107308Nj.LIZ.LLIILII(), null, new C319720Cg6(this, null), 2);
    }

    public C336690DHv(Context context) {
        super(context, null, 4);
    }

    @Override // X.C336680DHu, X.InterfaceC1436400nTy
    public final void LJIIJ(String str) {
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            tuxTextView.setText(LIZ(0));
        }
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.SAVING);
    }

    @Override // X.C336680DHu, X.InterfaceC1436400nTy
    public final void e4(Integer num, String str) {
        int iIntValue;
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.SAVING);
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            tuxTextView.setText(LIZ(iIntValue));
        }
    }

    @Override // X.C336680DHu, X.InterfaceC1436400nTy
    public final void z8(int i, String str) {
        getSaveToLocalStateFlow().setValue(EnumC319700Cg4.SAVING);
        TuxTextView tuxTextView = this.LLJJIJI;
        if (tuxTextView != null) {
            tuxTextView.setText(LIZ(i));
        }
    }
}
