package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS21S0100001_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426750nEP extends AbstractC1664490tPr<C1426770nER, C1340770kzj> {
    public static final int LLJJJJ = C354870Dvh.LIZ(52);
    public C1426520nE2 LLJJJIL;

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        C385670FAf<Boolean> visible;
        super.onViewCreated(view, bundle);
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(310));
        C1664590tQ1.LIZLLL(this, "EffectSearchPanelScene", false, AFwS261S0000000_22.get$arr$(311), 2);
        C1664600tQ2.LIZ(this, "EffectSearchPanelScene", new AwS601S0100000_22(this, 746));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nES
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1426770nER) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 1008));
        C1426520nE2 c1426520nE2 = this.LLJJJIL;
        if (c1426520nE2 != null && (visible = c1426520nE2.getVisible()) != null) {
            LLLLJ(visible, AFwS229S0000000_2.get$arr$(776));
        }
        LLLLJ(LLLLIL().LIZLLL.invoke().LIZ, new AwS21S0100001_5(this, LLLLILI().LIZ.LIZJ - LLLLILI().LIZ.LIZLLL, 2));
        C1426520nE2 c1426520nE22 = this.LLJJJIL;
        if (c1426520nE22 != null) {
            c1426520nE22.Eb(new InterfaceC1426650nEF() { // from class: X.0nEQ
                @Override // X.InterfaceC1426650nEF
                public final boolean LIZJ(EffectModel effectModel) {
                    return this.LIZ.LLLLIL().LIZIZ.invoke(effectModel).booleanValue();
                }

                @Override // X.InterfaceC1426650nEF
                public final boolean LIZLLL(EffectModel effectModel, int i, boolean z) {
                    return this.LIZ.LLLLIL().LIZ.invoke(effectModel, Integer.valueOf(i), Boolean.valueOf(z)).booleanValue();
                }

                @Override // X.InterfaceC1426650nEF
                public final boolean LJ(EffectModel effectModel, int i, String str, boolean z, String str2, String str3) {
                    return this.LIZ.LLLLIL().LIZJ.invoke(effectModel, Integer.valueOf(i), str, Boolean.valueOf(z), str2, str3).booleanValue();
                }
            });
        }
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nEY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426770nER) obj).LJI;
            }
        }, new AwS601S0100000_22(this, 749));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.bya, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = LLLLILI().LIZ.LIZJ;
            C786410Ut5.W5(viewGroup2, layoutParams);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bn);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(12));
            viewGroup2.setBackground(c384050F3z.LIZ(requireSceneContext()));
            return viewGroup2;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
