package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E8f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C359670E8f extends AbstractC1664490tPr<C359700E8i, InterfaceC359660E8e> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(211));
    public C368870EdB LLJJJJ;
    public C368140Ec0 LLJJJJJIL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        C368880EdC c368880EdC;
        C370920EgU c370920EgU;
        super.onDestroyView();
        C368870EdB c368870EdB = this.LLJJJJ;
        if (c368870EdB != null) {
            C368930EdH c368930EdH = c368870EdB.LLILLL;
            if (c368930EdH != null && (c368880EdC = c368930EdH.LLJI) != null && (c370920EgU = c368880EdC.LLIZLLLIL) != null) {
                C23250099c.LIZLLL(c370920EgU, c370920EgU.LLJILJIL, null, new C358350E3d(c370920EgU, c368880EdC.LL, null), 2);
            }
            C368930EdH c368930EdH2 = c368870EdB.LLILLL;
            if (c368930EdH2 != null) {
                c368930EdH2.setScrollChangeListener(null);
            }
            c368870EdB.LLILZIL = null;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E8g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C359700E8i) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 663));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E8j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C359700E8i) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 664));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E8k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C359700E8i) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 665));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0E8h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C359700E8i) obj).LIZLLL);
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 666));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewLIZIZ = C21146717pB.LIZIZ(requireSceneContext(), R.layout.c28, viewGroup, false);
        this.LLJJJJJIL = (C368140Ec0) viewLIZIZ.findViewById(R.id.jo7);
        this.LLJJJJ = (C368870EdB) viewLIZIZ.findViewById(R.id.jo_);
        return (ViewGroup) viewLIZIZ;
    }
}
