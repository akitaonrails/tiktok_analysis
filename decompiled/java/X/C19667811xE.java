package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11xE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19667811xE extends AbstractC1664490tPr<C19668111xH, C19668311xJ> {
    public TuxIconView LLJJJIL;
    public boolean LLJJJJ;
    public TuxTextView LLJJJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = (TuxIconView) requireViewById(R.id.lr1);
        TuxTextView tuxTextView = (TuxTextView) requireViewById(R.id.tv_processing);
        this.LLJJJJJIL = tuxTextView;
        TuxIconView tuxIconView = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C12P5 c12p5 = new C12P5();
        c12p5.LIZLLL = Integer.valueOf(R.attr.z_);
        c12p5.LJI = C12KQ.VERTICAL;
        c12p5.LJII = EnumC197015126j.EASE_IN_OUT;
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJFF = Float.valueOf(0.75f);
        TuxTextView tuxTextView2 = this.LLJJJJJIL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView.setBackground(c12p5.LIZ(tuxTextView2.getContext()));
        TuxTextView tuxTextView3 = this.LLJJJJJIL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        int iIntValue = LLLLILI().LIZ.LIZJ.LIZ.getFirst().intValue();
        if (iIntValue != 0) {
            ViewGroup.LayoutParams layoutParams = tuxTextView3.getLayoutParams();
            layoutParams.width = iIntValue;
            C786410Ut5.R6(tuxTextView3, layoutParams);
        } else {
            AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11xI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C19668111xH) obj).LIZJ;
                }
            }, new AwS584S0100000_5(tuxTextView3, 42));
        }
        TuxIconView tuxIconView2 = this.LLJJJIL;
        if (tuxIconView2 != null) {
            tuxIconView = tuxIconView2;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 18), tuxIconView);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11xF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19668111xH) obj).LIZ;
            }
        }, new AwS608S0100000_29(this, 166));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.11xG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C19668111xH) obj).LIZIZ;
            }
        }, new AwS608S0100000_29(this, 167));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.es5, viewGroup, false);
    }
}
