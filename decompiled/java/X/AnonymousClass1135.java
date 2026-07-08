package X;

import Y.AObserverS231S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.1135, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1135 extends AnonymousClass1136 {
    public final Scene LLIZLLLIL;
    public final ViewGroup LLJ;
    public final C113G LLJI;
    public final C113D LLJIJIL;
    public final RecyclerView.RecycledViewPool LLJILJIL;
    public RecyclerView LLJILJILJ;
    public AnonymousClass1138 LLJILLL;
    public final C01GW LLJJ;
    public boolean LLJJI;
    public String LLJJIII;

    @Override // X.AnonymousClass1136
    public final int LIZIZ() {
        return 3;
    }

    @Override // X.AnonymousClass1136
    public final boolean LJII() {
        return true;
    }

    @Override // X.AnonymousClass1136
    public final void LJFF() {
        List<EffectModel> data;
        AnonymousClass1138 anonymousClass1138 = this.LLJILLL;
        if (anonymousClass1138 == null || (data = anonymousClass1138.getData()) == null || !(!data.isEmpty())) {
            ArrayList<EffectModel> arrayListLJ = C0F4X.LJ();
            ArrayList<EffectModel> arrayListSubList = arrayListLJ;
            if (!this.LLJI.LJIIJ) {
                arrayListSubList = arrayListLJ.subList(1, arrayListLJ.size());
            }
            AnonymousClass1138 anonymousClass11382 = this.LLJILLL;
            if (anonymousClass11382 == null) {
                anonymousClass11382 = null;
            }
            anonymousClass11382.setData(arrayListSubList);
            RecyclerView recyclerView = this.LLJILJILJ;
            (recyclerView != null ? recyclerView : null).setAdapter(LIZJ());
        }
    }

    @Override // X.AnonymousClass1136
    public final View LJI() {
        this.LLILZ = C786410Ut5.Td(C786410Ut5.ne(this.LLJ.getContext()), R.layout.by8, this.LLJ, false);
        RecyclerView recyclerView = (RecyclerView) LJ().findViewById(R.id.t11);
        this.LLJILJILJ = recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setItemAnimator(null);
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(this.LLJI.LJIILJJIL, 1, (Context) this.LLIZLLLIL.requireActivity(), false);
        RecyclerView recyclerView2 = this.LLJILJILJ;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setItemViewCacheSize(this.LLJI.LJIILJJIL);
        wrapGridLayoutManager.mRecycleChildrenOnDetach = true;
        RecyclerView.RecycledViewPool recycledViewPool = this.LLJILJIL;
        if (recycledViewPool != null) {
            RecyclerView recyclerView3 = this.LLJILJILJ;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.setRecycledViewPool(recycledViewPool);
        }
        RecyclerView recyclerView4 = this.LLJILJILJ;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        recyclerView4.setLayoutManager(wrapGridLayoutManager);
        int iLIZIZ = C1415610mwR.LIZIZ();
        C113G c113g = this.LLJI;
        int i = (iLIZIZ - ((c113g.LJJ + c113g.LJIL) * c113g.LJIILJJIL)) / 2;
        RecyclerView recyclerView5 = this.LLJILJILJ;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        C426750GoL.LJIIL(recyclerView5, Integer.valueOf(i), 0, Integer.valueOf(i - this.LLJI.LJIL), 0, 16);
        AnonymousClass1138 anonymousClass1138 = new AnonymousClass1138(this.LLJIJIL, this.LLJI);
        this.LLJILLL = anonymousClass1138;
        anonymousClass1138.LLILLL = new C113A() { // from class: X.1137
            @Override // X.C113A
            public final int LIZ(int i2) {
                return i2 - this.LIZ.LIZJ().LLLI();
            }

            @Override // X.C113A
            public final boolean LIZIZ(int i2, int i3, boolean z) {
                C113D c113d;
                if (!z || (c113d = this.LIZ.LLJIJIL) == null) {
                    return false;
                }
                return c113d.LJII(i2, i3);
            }
        };
        this.LLILZLL = new AnonymousClass1134(this, anonymousClass1138);
        LIZJ().LLLIILIL(this.LLJI.LJIIIIZZ);
        if (this.LLIZ) {
            LJFF();
        }
        ((EditEffectVideoModel) this.LLJJ.getValue()).CQ2().observe(this.LLIZLLLIL, new AObserverS231S0100000_29(this, 245));
        ((EditEffectVideoModel) this.LLJJ.getValue()).CQ2().setValue(new C19394710uH(((EditEffectVideoModel) this.LLJJ.getValue()).vQ2().LIZIZ().getValue() != null ? r0.mo51if() : 0, 0));
        ((EditEffectVideoModel) this.LLJJ.getValue()).vQ2().LJII().observe(this.LLIZLLLIL, new AObserverS231S0100000_29(this, 246));
        ((EditEffectVideoModel) this.LLJJ.getValue()).vQ2().LJIIIZ().observe(this.LLIZLLLIL, new AObserverS231S0100000_29(this, 247));
        View viewLJ = LJ();
        this.LLJ.addView(viewLJ);
        return viewLJ;
    }

    @Override // X.AnonymousClass1136
    public final C113G LIZ() {
        return this.LLJI;
    }

    @Override // X.AnonymousClass1136
    public final String LIZLLL() {
        return this.LLJJIII;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJIIJJI(String str) {
        int i;
        AnonymousClass1138 anonymousClass1138 = null;
        if (str != null) {
            int i2 = 2;
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        AnonymousClass1138 anonymousClass11382 = this.LLJILLL;
                        if (anonymousClass11382 != null) {
                            anonymousClass1138 = anonymousClass11382;
                        }
                        anonymousClass1138.LLILZ = anonymousClass1138.LLILLJJLI.LJIIJ ? 1 : 0;
                        anonymousClass1138.notifyDataSetChanged();
                        return;
                    }
                    break;
                case BaseNotice.RECOMMEND_LIVE /* 50 */:
                    if (str.equals("2")) {
                        AnonymousClass1138 anonymousClass11383 = this.LLJILLL;
                        if (anonymousClass11383 != null) {
                            anonymousClass1138 = anonymousClass11383;
                        }
                        if (!anonymousClass1138.LLILLJJLI.LJIIJ) {
                            i2 = 1;
                        }
                        anonymousClass1138.LLILZ = i2;
                        anonymousClass1138.notifyDataSetChanged();
                        return;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        AnonymousClass1138 anonymousClass11384 = this.LLJILLL;
                        if (anonymousClass11384 != null) {
                            anonymousClass1138 = anonymousClass11384;
                        }
                        if (anonymousClass1138.LLILLJJLI.LJIIJ) {
                            i2 = 3;
                        }
                        anonymousClass1138.LLILZ = i2;
                        anonymousClass1138.notifyDataSetChanged();
                        return;
                    }
                    break;
            }
        }
        AnonymousClass1138 anonymousClass11385 = this.LLJILLL;
        if (anonymousClass11385 != null) {
            anonymousClass1138 = anonymousClass11385;
        }
        if (anonymousClass1138.LLILLJJLI.LJIIJ) {
            i = 0;
        } else {
            i = -1;
        }
        anonymousClass1138.LLILZ = i;
        anonymousClass1138.notifyDataSetChanged();
    }

    public AnonymousClass1135(Scene scene, ViewGroup viewGroup, String str, C113G c113g, C113D c113d, RecyclerView.RecycledViewPool recycledViewPool) {
        super(c113g, str, new ArrayList());
        this.LLIZLLLIL = scene;
        this.LLJ = viewGroup;
        this.LLJI = c113g;
        this.LLJIJIL = c113d;
        this.LLJILJIL = recycledViewPool;
        this.LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1045));
        this.LLJJI = true;
        this.LLJJIII = scene.getString(2131833534);
    }
}
