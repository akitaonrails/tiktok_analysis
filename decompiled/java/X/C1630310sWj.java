package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630310sWj extends AbstractC1664490tPr<C1627590sSL, C1627610sSN> {
    public static final C01GW<Boolean> LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2297));
    public ViewGroup LLJJJIL;
    public ViewGroup LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public int LLJJJJLIIL;
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 721));

    public final LinearLayout LLLLLJLJLL() {
        return (LinearLayout) this.LLJJL.getValue();
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C013C c013c = new C013C();
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1627590sSL) obj).LIZ;
            }
        }, new AwS595S0100000_16(this, 167));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0sWi
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1627590sSL) obj).LIZIZ;
            }
        }, new AwS391S0200000_25(c013c, this, 178));
    }

    public final void LLLLLJIL(View view, boolean z) {
        ViewGroup viewGroupLLLLLJLJLL;
        int i;
        ViewGroup viewGroup;
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        if (z) {
            viewGroupLLLLLJLJLL = LLLLLJLJLL();
        } else {
            viewGroupLLLLLJLJLL = this.LLJJJIL;
        }
        if (Intrinsics.LJFF(parent, viewGroupLLLLLJLJLL)) {
            return;
        }
        if (viewGroupLLLLLJLJLL != null) {
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            if (z) {
                i = -2;
            } else {
                i = -1;
            }
            viewGroupLLLLLJLJLL.addView(view, new FrameLayout.LayoutParams(i, -2));
        }
        if (!z) {
            LLLLIL().LIZ.invoke();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.acz, viewGroup, false);
    }
}
