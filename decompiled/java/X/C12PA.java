package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12PA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12PA extends AbstractC1664490tPr<C12PE, C12PF> {
    public View LLJJJIL;
    public View LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public TuxIconView LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = requireViewById(R.id.tv_save);
        this.LLJJJJ = requireViewById(R.id.zbp);
        this.LLJJJJJIL = (TuxTextView) requireViewById(R.id.tv_processing);
        FrameLayout frameLayout = (FrameLayout) requireViewById(R.id.tv_processing_group);
        this.LLJJJJLIIL = frameLayout;
        TuxIconView tuxIconView = null;
        if (frameLayout == null) {
            frameLayout = null;
        }
        C12P5 c12p5 = new C12P5();
        c12p5.LIZLLL = Integer.valueOf(R.attr.z_);
        c12p5.LJI = C12KQ.VERTICAL;
        c12p5.LJII = EnumC197015126j.EASE_IN_OUT;
        c12p5.LJ = Float.valueOf(0.0f);
        c12p5.LJFF = Float.valueOf(0.75f);
        FrameLayout frameLayout2 = this.LLJJJJLIIL;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        frameLayout.setBackground(c12p5.LIZ(frameLayout2.getContext()));
        View view2 = this.LLJJJIL;
        if (view2 == null) {
            view2 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 11), view2);
        View view3 = this.LLJJJJ;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 12), view3);
        TuxIconView tuxIconView2 = (TuxIconView) requireViewById(R.id.lr1);
        this.LLJJL = tuxIconView2;
        if (tuxIconView2 == null) {
            tuxIconView2 = null;
        }
        FrameLayout frameLayout3 = this.LLJJJJLIIL;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        C786410Ut5.x3(tuxIconView2.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC512901zD(tuxIconView2, frameLayout3, 0));
        TuxIconView tuxIconView3 = this.LLJJL;
        if (tuxIconView3 != null) {
            tuxIconView = tuxIconView3;
        }
        C786410Ut5.I7(new AkS95S0100000_29(this, 13), tuxIconView);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12PC
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12PE) obj).LIZ;
            }
        }, new AwS608S0100000_29(this, 155));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12PB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12PE) obj).LIZJ;
            }
        }, new AwS608S0100000_29(this, 156));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.12PD
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C12PE) obj).LIZIZ;
            }
        }, new AwS608S0100000_29(this, 154));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.ens, viewGroup, false);
    }
}
