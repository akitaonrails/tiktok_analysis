package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS585S0100000_6;
import nv7.c0;

/* JADX INFO: renamed from: X.0n2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419630n2v extends AbstractC1664490tPr<C0267007d, C003G> {
    public C427760Gpy LLJJJIL;
    public TuxTextView LLJJJJ;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iLIZIZ;
        super.onActivityCreated(bundle);
        C427760Gpy c427760Gpy = (C427760Gpy) requireViewById(R.id.vo7);
        c427760Gpy.setSize(EnumC428930Grr.MEDIUM);
        c427760Gpy.setMaxImageNum(3);
        c427760Gpy.setStacking(EnumC429060Gs4.LAST_ON_TOP);
        this.LLJJJIL = c427760Gpy;
        this.LLJJJJ = (TuxTextView) requireViewById(R.id.vo8);
        ViewGroup.LayoutParams layoutParams = requireView().getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (C1462920oAk.LIZLLL()) {
                c0.LIZ.getClass();
                C1660590tJZ c1660590tJZ = c0.LJFF;
                if (c1660590tJZ != null) {
                    iLIZIZ = c1660590tJZ.LIZIZ();
                } else {
                    iLIZIZ = 0;
                }
                marginLayoutParams.bottomMargin = iLIZIZ;
            } else {
                marginLayoutParams.bottomMargin = C0LEO.LIZIZ() - ((int) C12ES.LIZJ(49.0f, requireActivity()));
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.019C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0267007d) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 170));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0mFk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C0267007d) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS585S0100000_6(this, 171));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.f9u, viewGroup, false);
    }
}
