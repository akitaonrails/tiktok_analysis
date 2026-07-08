package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.adjustfilter.ui.HorizontalCenterLayoutManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ENL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENL extends C0FC9<C0ENF, C0ENI> {
    public RecyclerView LLJJJJJIL;
    public final C01GW LLJJJJLIIL;

    public final RecyclerView LLLLLJLJLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.h_a);
            this.LLJJJJJIL = (RecyclerView) callbackFindViewById;
        }
        return (RecyclerView) callbackFindViewById;
    }

    public C0ENL(C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 729));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerViewLLLLLJLJLL = LLLLLJLJLL();
        if (recyclerViewLLLLLJLJLL != null) {
            recyclerViewLLLLLJLJLL.setAdapter((AbstractC21673619ry) this.LLJJJJLIIL.getValue());
        }
        RecyclerView recyclerViewLLLLLJLJLL2 = LLLLLJLJLL();
        if (recyclerViewLLLLLJLJLL2 != null) {
            recyclerViewLLLLLJLJLL2.setLayoutManager(new HorizontalCenterLayoutManager(requireSceneContext()));
        }
        RecyclerView recyclerViewLLLLLJLJLL3 = LLLLLJLJLL();
        if (recyclerViewLLLLLJLJLL3 != null) {
            recyclerViewLLLLLJLJLL3.setItemAnimator(null);
        }
        ((C0ENN) this.LLJJJJLIIL.getValue()).LLILLL = new C0ENQ(this);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) - ((C0ENN) this.LLJJJJLIIL.getValue()).LLILZLL;
        RecyclerView recyclerViewLLLLLJLJLL4 = LLLLLJLJLL();
        if (recyclerViewLLLLLJLJLL4 != null) {
            C426750GoL.LJIIL(recyclerViewLLLLLJLJLL4, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ENP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ENF) obj).LIZ;
            }
        }, Lifecycle.State.STARTED, new AwS584S0100000_5(this, 651));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0ENJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ENF) obj).LIZIZ;
            }
        }, new AwS584S0100000_5(this, 652));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0ENK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0ENF) obj).LIZJ);
            }
        }, Lifecycle.State.STARTED, new AwS371S0200000_5(view, this, 133));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c2y, viewGroup, false);
    }
}
