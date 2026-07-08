package X;

import Y.ACListenerS156S0100000_22;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0mwx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1415930mwx extends AbstractC1664490tPr<C1410160mne, C1410180mng> {
    public FrameLayout LLJJJIL;
    public LinearLayout LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public C428430Gr3 LLJJJJLIIL;
    public C428430Gr3 LLJJL;
    public C428430Gr3 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C428430Gr3 c428430Gr3 = this.LLJJLIIIJLLLLLLLZ;
        if (c428430Gr3 != null) {
            c428430Gr3.LL.clear();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        GradientDrawable gradientDrawable;
        super.onViewCreated(view, bundle);
        this.LLJJJIL = (FrameLayout) view.findViewById(R.id.dg5);
        this.LLJJJJJIL = (LinearLayout) view.findViewById(R.id.vwv);
        this.LLJJJJ = (LinearLayout) view.findViewById(R.id.h2c);
        this.LLJJLIIIJLLLLLLLZ = (C428430Gr3) view.findViewById(R.id.g5o);
        this.LLJJL = (C428430Gr3) view.findViewById(R.id.mju);
        this.LLJJJJLIIL = (C428430Gr3) view.findViewById(R.id.tl0);
        this.LLJL = (TuxTextView) view.findViewById(R.id.acg);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.g51);
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.g55);
        View viewFindViewById = view.findViewById(R.id.acf);
        C786410Ut5.I7(new ACListenerS156S0100000_22(this, 57), viewFindViewById);
        C1425580nCW.LIZIZ.getClass();
        if (!AbstractC1671300taq.LIZ) {
            Drawable background = viewFindViewById.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C282930B7b.LIZ.getValue()).intValue())));
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mnh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1410160mne) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 873));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mni
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1410160mne) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 874));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        setTheme(C1425580nCW.LIZIZ.LIZLLL());
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emi, viewGroup, false);
    }
}
