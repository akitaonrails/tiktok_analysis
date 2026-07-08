package X;

import Y.ARunnableS2S0100001_12;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425030nBd extends PagerAdapter {
    public final C19EG LLILLJJLI;
    public final Scene LLILLL;
    public final InterfaceC1425040nBe LLILZ;
    public C1DRG LLILZLL;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public List<C1419590n2r> LLILZIL = C13BV.INSTANCE;
    public final SparseArray<C1425090nBj> LLIZ = new SparseArray<>();
    public Pair<Integer, Float> LLJI = new Pair<>(-1, Float.valueOf(0.0f));

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZIL.size();
    }

    public final C1425090nBj LJJIJIL(int i) {
        C1419590n2r c1419590n2r = (C1419590n2r) C13LP.LJJJLZIJ(i, this.LLILZIL);
        if (c1419590n2r == null) {
            return null;
        }
        SparseArray<C1425090nBj> sparseArray = this.LLIZ;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.keyAt(i2);
            C1425090nBj c1425090nBjValueAt = sparseArray.valueAt(i2);
            if (Intrinsics.LJFF(c1425090nBjValueAt.getAsset().LIZ.getAsset_id(), c1419590n2r.LIZ.getAsset_id())) {
                return c1425090nBjValueAt;
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        View view = this.LLIZ.get(i, null);
        if (view != null && view.getParent() == null) {
            viewGroup.addView(view);
            return view;
        }
        C1419590n2r c1419590n2r = (C1419590n2r) C13LP.LJJJLZIJ(i, this.LLILZIL);
        if (c1419590n2r == null) {
            c1419590n2r = new C1419590n2r(new Asset(), false, 0, 0);
        }
        C1425090nBj c1425090nBj = new C1425090nBj(this.LLILLJJLI, this.LLILLL, c1419590n2r, i, this.LLILZ);
        C1DRG c1drg = this.LLILZLL;
        if (c1drg != null) {
            c1425090nBj.setDiContainer(c1drg);
        }
        this.LLIZ.put(i, c1425090nBj);
        viewGroup.addView(c1425090nBj);
        Pair<Integer, Float> pair = this.LLJI;
        int iIntValue = pair.getFirst().intValue();
        float fFloatValue = pair.getSecond().floatValue();
        if (i == iIntValue) {
            HandlerHook.viewPost(c1425090nBj, new ARunnableS2S0100001_12(c1425090nBj, fFloatValue, 0));
            this.LLJI = new Pair<>(Integer.valueOf(i), Float.valueOf(0.0f));
        }
        if (getCount() - i == 4 && !this.LLIZLLLIL && this.LLJ) {
            this.LLIZLLLIL = true;
            this.LLILZ.LIZ(true);
        }
        return c1425090nBj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        return Intrinsics.LJFF(view, obj);
    }

    public final void LJJIJL(float f, int i) {
        C1425090nBj c1425090nBjLJJIJIL = LJJIJIL(i);
        if (c1425090nBjLJJIJIL != null) {
            HandlerHook.viewPost(c1425090nBjLJJIJIL, new ARunnableS2S0100001_12(c1425090nBjLJJIJIL, f, 1));
        } else {
            this.LLJI = new Pair<>(Integer.valueOf(i), Float.valueOf(f));
        }
    }

    public final boolean LJJIJLIJ(List<C1419590n2r> list, boolean z) {
        this.LLIZLLLIL = false;
        this.LLJ = z;
        if (!C1423860n9k.LIZ(list, this.LLILZIL)) {
            this.LLIZ.clear();
            this.LLILZIL = list;
            return true;
        }
        if (!C1423860n9k.LIZIZ(this.LLILZIL, list)) {
            this.LLILZIL = list;
            notifyDataSetChanged();
        }
        return false;
    }

    public C1425030nBd(C19EG c19eg, C1423960n9u c1423960n9u, C1422800n82 c1422800n82) {
        this.LLILLJJLI = c19eg;
        this.LLILLL = c1423960n9u;
        this.LLILZ = c1422800n82;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        View view;
        if (obj instanceof View) {
            view = (View) obj;
        } else {
            view = null;
        }
        C786410Ut5.LJJJLZIJ(view, viewGroup);
        this.LLIZ.remove(i);
    }
}
