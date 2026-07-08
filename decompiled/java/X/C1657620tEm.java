package X;

import Y.ACListenerS159S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657620tEm extends Scene {
    public final InterfaceC1657610tEl LLJI;
    public final Function0<Unit> LLJIJIL;
    public RecyclerView LLJILJIL;
    public C1651660t5A LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 168));

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI.LIZJ((InterfaceC1651360t4g) this.LLJILLL.getValue());
        this.LLJIJIL.invoke();
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View viewRequireViewById = requireViewById(R.id.okq);
        RecyclerView recyclerView = (RecyclerView) viewRequireViewById.findViewById(R.id.t0p);
        this.LLJILJIL = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        C1651660t5A c1651660t5A = new C1651660t5A(C1657630tEn.LIZ(this.LLJI));
        this.LLJILJILJ = c1651660t5A;
        RecyclerView recyclerView3 = this.LLJILJIL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(c1651660t5A);
        C422620Ghg c422620Ghg = new C422620Ghg(requireActivity());
        c422620Ghg.LJ(C800330VaR.LIZIZ(requireActivity(), R.drawable.acd));
        RecyclerView recyclerView4 = this.LLJILJIL;
        if (recyclerView4 != null) {
            recyclerView2 = recyclerView4;
        }
        recyclerView2.addItemDecoration(c422620Ghg);
        C786410Ut5.I7(new ACListenerS159S0100000_25(this, 5), viewRequireViewById);
        this.LLJI.LIZLLL((InterfaceC1651360t4g) this.LLJILLL.getValue());
    }

    public C1657620tEm(InterfaceC1657610tEl interfaceC1657610tEl, AwS569S0100000_25 awS569S0100000_25) {
        this.LLJI = interfaceC1657610tEl;
        this.LLJIJIL = awS569S0100000_25;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.ccf, viewGroup, false);
    }
}
