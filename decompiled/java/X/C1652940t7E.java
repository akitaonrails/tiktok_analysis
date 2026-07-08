package X;

import Y.ACListenerS159S0100000_25;
import Y.AfS194S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0t7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1652940t7E extends AbstractC1664490tPr<C1652930t7D, C1652920t7C> {
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 583));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 582));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(289));

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        C11NJ c11nj = (C11NJ) this.LLJJJJJIL.getValue();
        if (!c11nj.LLILLJJLI) {
            c11nj.dispose();
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0t7F
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1652930t7D) obj).LIZIZ;
            }
        }, new AwS604S0100000_25(this, 369));
        C11NJ c11nj = (C11NJ) this.LLJJJJJIL.getValue();
        C11PQ selectOptionSubject = ((AbstractViewOnLayoutChangeListenerC1657530tEd) this.LLJJJIL.getValue()).getSelectOptionSubject();
        selectOptionSubject.getClass();
        c11nj.LIZ(new C19475711Hn(selectOptionSubject).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 54)));
        ((C11NJ) this.LLJJJJJIL.getValue()).LIZ(((AbstractViewOnLayoutChangeListenerC1657530tEd) this.LLJJJIL.getValue()).LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(this, 55)));
        C786410Ut5.O7((FrameLayout) this.LLJJJJ.getValue(), new ACListenerS159S0100000_25(this, 40));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.i9a, viewGroup, false);
    }
}
