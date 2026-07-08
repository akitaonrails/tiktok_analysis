package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.113S, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C113S<T> extends PagerAdapter {
    public final C113G LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public AnonymousClass1136 LLILZ;
    public int LLIZLLLIL;
    public InterfaceC1631620sYq<? super RecyclerView, ? super Integer, ? super Integer, Unit> LLJ;
    public final SparseArray<AnonymousClass1136> LLILZIL = new SparseArray<>();
    public List<T> LLILZLL = new ArrayList();
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, (C113S<Object>) 1030));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS573S0100000_29(this, (C113S<Object>) 1029));

    public abstract void LJJIJIL();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZLL.size();
    }

    public final void LJJIJL(boolean z) {
        C113T c113t;
        C113R c113r;
        AnonymousClass1136 anonymousClass1136 = this.LLILZ;
        if (anonymousClass1136 instanceof C113E) {
            C113E c113e = (C113E) anonymousClass1136;
            if (c113e != null) {
                c113e.LJIILJJIL(z);
                return;
            }
            return;
        }
        if (!(anonymousClass1136 instanceof C113T) || (c113t = (C113T) anonymousClass1136) == null || (c113r = c113t.LLJJIII) == null) {
            return;
        }
        c113r.LJJIJL(z);
    }

    public final int LJJIJLIJ(int i) {
        AnonymousClass1136 anonymousClass1136;
        SparseArray<AnonymousClass1136> sparseArray = this.LLILZIL;
        if (sparseArray == null || sparseArray.size() <= i || (anonymousClass1136 = this.LLILZIL.get(i)) == null) {
            return 0;
        }
        return anonymousClass1136.LIZIZ();
    }

    public final AnonymousClass1136 LJJIL(int i) {
        SparseArray<AnonymousClass1136> sparseArray = this.LLILZIL;
        if (sparseArray != null && sparseArray.size() > 0) {
            return this.LLILZIL.get(i);
        }
        return null;
    }

    public final List<EffectPointModel> LJJIZ(int i) {
        int iIntValue;
        String third;
        List<EffectPointModel> listLJJIZ;
        C0MS4 c0ms4;
        AnonymousClass1136 anonymousClass1136 = this.LLILZIL.get(i);
        if (anonymousClass1136 == null) {
            return new ArrayList();
        }
        if (anonymousClass1136 instanceof C113E) {
            C113E c113e = (C113E) anonymousClass1136;
            c113e.LJIJJ();
            return c113e.LLJL;
        }
        AnonymousClass1138 anonymousClass1138 = null;
        if (anonymousClass1136 instanceof AnonymousClass1135) {
            AnonymousClass1138 anonymousClass11382 = ((AnonymousClass1135) anonymousClass1136).LLJILLL;
            if (anonymousClass11382 != null) {
                anonymousClass1138 = anonymousClass11382;
            }
            anonymousClass1138.notifyDataSetChanged();
        } else if (anonymousClass1136 instanceof C113T) {
            C113T c113t = (C113T) anonymousClass1136;
            C443120HZe<Integer, Integer, String> value = c113t.LLJJIJIL.wQ2().getValue();
            if (value != null) {
                iIntValue = value.getSecond().intValue();
            } else {
                iIntValue = -1;
            }
            C443120HZe<Integer, Integer, String> value2 = c113t.LLJJIJIL.wQ2().getValue();
            if (value2 == null || (third = value2.getThird()) == null) {
                third = "";
            }
            if (iIntValue >= 0 && (((c0ms4 = c113t.LLJJI) == null || iIntValue != c0ms4.getCurrentItem()) && third.length() != 0)) {
                C19YA c19ya = c113t.LLJJ;
                if (c19ya != null) {
                    c19ya.selectTab(c19ya.getTabAt(iIntValue));
                }
                C0MS4 c0ms42 = c113t.LLJJI;
                if (c0ms42 != null) {
                    c0ms42.setCurrentItem(iIntValue, true);
                }
            }
            C0MS4 c0ms43 = c113t.LLJJI;
            if (c0ms43 != null) {
                int currentItem = c0ms43.getCurrentItem();
                C113R c113r = c113t.LLJJIII;
                if (c113r != null && (listLJJIZ = c113r.LJJIZ(currentItem)) != null) {
                    return listLJJIZ;
                }
            }
            return C13BV.INSTANCE;
        }
        return new ArrayList();
    }

    public final void LJJJ(int i) {
        C113T c113t;
        AnonymousClass1136 anonymousClass1136 = this.LLILZIL.get(i);
        if (anonymousClass1136 instanceof C113E) {
            C113E c113e = (C113E) anonymousClass1136;
            if (c113e != null) {
                c113e.LJIL();
                return;
            }
            return;
        }
        if (!(anonymousClass1136 instanceof C113T) || (c113t = (C113T) anonymousClass1136) == null) {
            return;
        }
        int iLJIIJJI = c113t.LJIIJJI();
        C0MS4 c0ms4 = c113t.LLJJI;
        if (c0ms4 != null) {
            c0ms4.setCurrentItem(iLJIIJJI, true);
        }
        C113R c113r = c113t.LLJJIII;
        if (c113r == null) {
            return;
        }
        c113r.LJJJ(iLJIIJJI);
    }

    public final void LJJJI(List<? extends T> list) {
        ((ArrayList) this.LLILZLL).clear();
        this.LLILZLL = new ArrayList(list);
        LJJIJIL();
        notifyDataSetChanged();
    }

    public final void LJJJIL(int i) {
        AnonymousClass1136 anonymousClass1136 = this.LLILZIL.get(i);
        if (anonymousClass1136 != null) {
            anonymousClass1136.LJIIJ();
        }
    }

    public C113S(C113G c113g, LifecycleOwner lifecycleOwner) {
        this.LLILLJJLI = c113g;
        this.LLILLL = lifecycleOwner;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        AnonymousClass1136 anonymousClass1136 = this.LLILZIL.get(i);
        if (anonymousClass1136 != null) {
            anonymousClass1136.LJIIIZ(false);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        if (Intrinsics.LJFF(this.LLILZIL.get(i), this.LLILZ)) {
            return;
        }
        AnonymousClass1136 anonymousClass1136 = this.LLILZ;
        if (anonymousClass1136 != null) {
            anonymousClass1136.LJIIIZ(false);
        }
        AnonymousClass1136 anonymousClass11362 = this.LLILZIL.get(i);
        this.LLILZ = anonymousClass11362;
        if (anonymousClass11362 != null) {
            anonymousClass11362.LJIIIZ(true);
        }
    }
}
