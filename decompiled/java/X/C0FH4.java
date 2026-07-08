package X;

import Y.ACListenerS140S0100000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FH4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FH4 extends AbstractC1664490tPr<C387410FGx, C0FH1> {
    public View LLJJJIL;
    public C388810FMh LLJJJJ;
    public TuxIconView LLJJJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0FH2
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387410FGx) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 134));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0FH3
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C387410FGx) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 135));
        C388810FMh c388810FMh = this.LLJJJJ;
        if (c388810FMh != null) {
            c388810FMh.setColorChangeListener(new InterfaceC388860FMm() { // from class: X.0FH5
                @Override // X.InterfaceC388860FMm
                public final void LIZ(int i) {
                    this.LIZ.LLLLIL().LIZ.invoke(Integer.valueOf(i));
                }
            });
        }
        C388810FMh c388810FMh2 = this.LLJJJJ;
        if (c388810FMh2 != null) {
            c388810FMh2.setOnColorShowListener(new C0FHE() { // from class: X.0FH6
                @Override // X.C0FHE
                public final void LIZ(int i) {
                    this.LIZ.LLLLIL().LIZIZ.invoke(Integer.valueOf(i));
                }
            });
        }
        TuxIconView tuxIconView = this.LLJJJJJIL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS140S0100000_5(this, 8));
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxIconView tuxIconView;
        setTheme(R.style.y0);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.fai, viewGroup, false);
        C426750GoL.LJIIIZ(viewTd.findViewById(R.id.t1f), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-8))), null, null, false, 29);
        this.LLJJJIL = viewTd;
        this.LLJJJJ = (C388810FMh) viewTd.findViewById(R.id.e8b);
        View view = this.LLJJJIL;
        if (view != null) {
            tuxIconView = (TuxIconView) view.findViewById(R.id.e1g);
        } else {
            tuxIconView = null;
        }
        this.LLJJJJJIL = tuxIconView;
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
            tuxIconView.setBackground(c384050F3z.LIZ(viewGroup.getContext()));
        }
        return (ViewGroup) this.LLJJJIL;
    }
}
