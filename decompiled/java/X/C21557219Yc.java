package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21557219Yc extends C19YY {
    public InterfaceC21558219Ym LLLF;
    public int LLLFF;
    public int LLLFFI;

    @Override // X.C19YY
    public final void LIZIZ(InterfaceC21558219Ym interfaceC21558219Ym) {
        this.LLLF = interfaceC21558219Ym;
    }

    public C21557219Yc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLLFF = context.getResources().getColor(R.color.hh);
        this.LLLFFI = context.getResources().getColor(R.color.hi);
        setOverScrollMode(2);
        int i = this.LLLFFI;
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{this.LLLFF, i}));
        setSelectedTabIndicatorColor(this.LLLFF);
        setTabMargin(14);
        super.LIZIZ(new InterfaceC21558219Ym() { // from class: X.19Yh
            @Override // X.InterfaceC21558219Ym
            public final void LIZIZ(C21557119Yb c21557119Yb) {
                InterfaceC21558219Ym interfaceC21558219Ym = this.LIZ.LLLF;
                if (interfaceC21558219Ym != null) {
                    interfaceC21558219Ym.LIZIZ(c21557119Yb);
                }
            }

            @Override // X.InterfaceC21558219Ym
            public final void LIZJ(C21557119Yb c21557119Yb) {
                InterfaceC21558219Ym interfaceC21558219Ym = this.LIZ.LLLF;
                if (interfaceC21558219Ym != null) {
                    interfaceC21558219Ym.LIZJ(c21557119Yb);
                }
            }

            @Override // X.InterfaceC21558219Ym
            public final void LIZ(C21557119Yb c21557119Yb, boolean z) {
                InterfaceC21558219Ym interfaceC21558219Ym = this.LIZ.LLLF;
                if (interfaceC21558219Ym != null) {
                    interfaceC21558219Ym.LIZ(c21557119Yb, z);
                }
            }
        });
    }
}
