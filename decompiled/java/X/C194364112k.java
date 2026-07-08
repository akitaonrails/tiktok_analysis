package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.effect.download.EffectDownloadController;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.112k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194364112k extends AbstractC480450Isl {
    public List<EffectCategoryResponse> LLJ;
    public final Context LLJI;
    public Fragment LLJIJIL;
    public final List<Effect> LLJILJIL;
    public final EffectDownloadController LLJILJILJ;
    public final boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJ.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (i == getCount() - 1) {
            return this.LLJI.getString(2131849531);
        }
        return ((EffectCategoryResponse) ListProtector.get(this.LLJ, i)).getName();
    }

    @Override // X.AbstractC480450Isl
    public final Fragment LJJIJIL(int i) {
        if (i == getCount() - 1 && !this.LLJJ) {
            return new TimeEffectTabFragment();
        }
        FilterEffectTabFragment filterEffectTabFragmentAS = FilterEffectTabFragment.aS(((EffectCategoryResponse) ListProtector.get(this.LLJ, i)).getKey(), ((EffectCategoryResponse) ListProtector.get(this.LLJ, i)).getTotalEffects(), this.LLJJI, this.LLJILLL);
        filterEffectTabFragmentAS.LLJI = this.LLJILJILJ;
        return filterEffectTabFragmentAS;
    }

    public final void setData(List<EffectCategoryResponse> list) {
        this.LLJ = list;
        ((ArrayList) this.LLJILJIL).clear();
        ArrayList<Effect> arrayList = new ArrayList();
        Iterator<EffectCategoryResponse> it2 = this.LLJ.iterator();
        while (it2.hasNext()) {
            List<Effect> totalEffects = it2.next().getTotalEffects();
            if (totalEffects != null) {
                arrayList.addAll(totalEffects);
            }
        }
        int iLIZIZ = C0CHQ.LIZ().LJJJ().LIZIZ();
        if (iLIZIZ >= 0) {
            for (int i = 0; i < iLIZIZ && i < arrayList.size(); i++) {
                Effect effect = (Effect) ListProtector.get(arrayList, i);
                this.LLJILJILJ.getClass();
                if (!EffectDownloadController.LJ(effect)) {
                    ((ArrayList) this.LLJILJIL).add(effect);
                }
            }
        } else {
            for (Effect effect2 : arrayList) {
                this.LLJILJILJ.getClass();
                if (!EffectDownloadController.LJ(effect2)) {
                    ((ArrayList) this.LLJILJIL).add(effect2);
                }
            }
        }
        this.LLJILJILJ.LJIIJ(this.LLJILJIL);
        notifyDataSetChanged();
    }

    public C194364112k(C19EG c19eg, FragmentManager fragmentManager, boolean z) {
        super(fragmentManager, 0);
        this.LLJ = new ArrayList();
        this.LLJILJIL = new ArrayList();
        this.LLJJ = false;
        this.LLJJI = true;
        this.LLJI = c19eg;
        this.LLJILLL = z;
        InterfaceC194315110n interfaceC194315110n = new InterfaceC194315110n() { // from class: X.112n
            @Override // X.InterfaceC194315110n
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC194315110n
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC194315110n
            public final void LIZJ() {
            }
        };
        C194365112l c194365112l = new C194365112l();
        c194365112l.LIZ = 3;
        c194365112l.LIZIZ = interfaceC194315110n;
        this.LLJILJILJ = c194365112l.LIZ();
        C0CHQ.LIZ().initDownloadableModel();
    }

    @Override // X.AbstractC480450Isl, androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) throws Throwable {
        this.LLJIJIL = (Fragment) obj;
        super.LJJIIZ(viewGroup, i, obj);
    }
}
