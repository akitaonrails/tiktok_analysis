package X;

import Y.ACListenerS161S0100000_27;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import nv7.c0;

/* JADX INFO: renamed from: X.0y4N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1843370y4N extends AbstractC1664490tPr<C1843410y4R, C1843430y4T> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1218));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1219));

    public final LinearLayout LLLLLJIL() {
        return (LinearLayout) this.LLJJJIL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        int iLIZIZ;
        super.onViewCreated(this.mView, bundle);
        if (C1462920oAk.LIZLLL()) {
            c0.LIZ.getClass();
            C1660590tJZ c1660590tJZ = c0.LJFF;
            if (c1660590tJZ != null) {
                iLIZIZ = c1660590tJZ.LIZIZ();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            }
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        }
        LinearLayout linearLayoutLLLLLJIL = LLLLLJIL();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        if (iLIZIZ < iLIZIZ2) {
            iLIZIZ = iLIZIZ2;
        }
        C426750GoL.LJIIIZ(linearLayoutLLLLLJIL, null, null, null, Integer.valueOf(iLIZIZ), false, 23);
        C786410Ut5.R7(LLLLLJIL(), new ACListenerS161S0100000_27(this, 153));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0y4O
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1843410y4R) obj).LIZIZ;
            }
        }, new AwS606S0100000_27(this, 415));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0y4P
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1843410y4R) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, AFwS269S0000000_27.get$arr$(393));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0y4M
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1843410y4R) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS606S0100000_27(this, 422));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0y4Q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1843410y4R) obj).LIZJ;
            }
        }, new AwS606S0100000_27(this, 426));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.mr, viewGroup, false);
    }
}
