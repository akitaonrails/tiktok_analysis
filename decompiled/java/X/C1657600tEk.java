package X;

import Y.AObjectS241S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.bytedance.scene.Scene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657600tEk extends Scene {
    public final InterfaceC1657610tEl LLJI;
    public final LiveEvent<Boolean> LLJIJIL;
    public RecyclerView LLJILJIL;
    public C1651660t5A LLJILJILJ;
    public boolean LLJJ;
    public final int LLJILLL = C366700EZg.LIZIZ(32.0d, C0CHQ.LIZ);
    public Pair<Integer, Integer> LLJJI = new Pair<>(0, 0);
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 170));

    public final List<C1650980t44> LLLII() {
        List<C1650980t44> items = this.LLJI.getItems();
        int iQp = this.LLJI.Qp();
        C1650980t44 c1650980t44LIZ = this.LLJI.LIZ();
        if (items.size() <= iQp) {
            ArrayList arrayList = new ArrayList();
            if (items.size() > iQp) {
                arrayList.addAll(items.subList(0, iQp));
                return arrayList;
            }
            arrayList.addAll(items);
            return arrayList;
        }
        int i = iQp - (c1650980t44LIZ != null ? 1 : 0);
        ArrayList arrayList2 = new ArrayList();
        if (items.size() > i) {
            arrayList2.addAll(items.subList(0, i));
        } else {
            arrayList2.addAll(items);
        }
        if (c1650980t44LIZ != null) {
            arrayList2.add(c1650980t44LIZ);
        }
        return arrayList2;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJI.LIZJ((InterfaceC1651360t4g) this.LLJJIII.getValue());
    }

    public final View LLLIIIIL(int i) {
        Iterator<C1650980t44> it2 = this.LLJI.getItems().iterator();
        int i2 = 0;
        while (true) {
            RecyclerView recyclerView = null;
            if (!it2.hasNext()) {
                return null;
            }
            C1650980t44 next = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (next.LL == i) {
                    if (i2 >= this.LLJI.Qp() - 1) {
                        RecyclerView recyclerView2 = this.LLJILJIL;
                        if (recyclerView2 != null) {
                            recyclerView = recyclerView2;
                        }
                        return recyclerView.getChildAt(this.LLJI.Qp() - 1);
                    }
                    RecyclerView recyclerView3 = this.LLJILJIL;
                    if (recyclerView3 != null) {
                        recyclerView = recyclerView3;
                    }
                    return recyclerView.getChildAt(i2);
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RecyclerView recyclerView = (RecyclerView) requireViewById(R.id.t0o);
        this.LLJILJIL = recyclerView;
        RecyclerView recyclerView2 = null;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity(), 1, false));
        C1651660t5A c1651660t5A = new C1651660t5A(LLLII());
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
        this.LLJIJIL.LIZ(this, new AObjectS241S0100000_8(this, 4));
        this.LLJI.LIZLLL((InterfaceC1651360t4g) this.LLJJIII.getValue());
    }

    public final C1650980t44 xv(int i) {
        for (C1650980t44 c1650980t44 : this.LLJI.getItems()) {
            if (c1650980t44.LL == i) {
                return c1650980t44;
            }
        }
        return null;
    }

    public C1657600tEk(InterfaceC1657610tEl interfaceC1657610tEl, C560530Lyd c560530Lyd) {
        this.LLJI = interfaceC1657610tEl;
        this.LLJIJIL = c560530Lyd;
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.cch, viewGroup, false);
    }
}
