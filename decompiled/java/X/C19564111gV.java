package X;

import Y.ARunnableS129S0100000_29;
import Y.AsS9S0101000_29;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS167S0101000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11gV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19564111gV<RESOURCE_ITEM_VIEW_HOLDER extends RecyclerView.ViewHolder> extends PagerAdapter {
    public final C21594419fC LLILLJJLI;
    public final Context LLILLL;
    public final C19563711gR LLILZ;
    public final InterfaceC1631620sYq<ViewGroup, Integer, Integer, RESOURCE_ITEM_VIEW_HOLDER> LLILZIL;
    public final InterfaceC1631620sYq<RESOURCE_ITEM_VIEW_HOLDER, Integer, C0FGT, Unit> LLILZLL;
    public final InterfaceC1631620sYq<Integer, Integer, C0FGT, Unit> LLIZ;
    public int LLJ;
    public InterfaceC19564911gd LLJIJIL;
    public final RecyclerView.RecycledViewPool LLJILJIL;
    public List<C0FGS> LLIZLLLIL = C13BV.INSTANCE;
    public final SparseArray<C19564311gX<RESOURCE_ITEM_VIEW_HOLDER>> LLJI = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLIZLLLIL.size();
    }

    public static void LJJIJIL(C19564111gV c19564111gV) {
        SparseArray<C19564311gX<RESOURCE_ITEM_VIEW_HOLDER>> sparseArray = c19564111gV.LLJI;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.keyAt(i);
            sparseArray.valueAt(i).LIZIZ();
        }
    }

    public final void LJJIJL(int i) {
        ViewGroup.LayoutParams layoutParams;
        this.LLJ = i;
        SparseArray<C19564311gX<RESOURCE_ITEM_VIEW_HOLDER>> sparseArray = this.LLJI;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.keyAt(i2);
            C19564311gX<RESOURCE_ITEM_VIEW_HOLDER> c19564311gXValueAt = sparseArray.valueAt(i2);
            View viewFindViewById = c19564311gXValueAt.LIZ.findViewById(R.id.t11);
            if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null && layoutParams.height != i) {
                layoutParams.height = i;
                RecyclerView recyclerView = (RecyclerView) c19564311gXValueAt.LIZ.findViewById(R.id.t11);
                if (recyclerView != null) {
                    recyclerView.requestLayout();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, X.11gX] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        int i2;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        C259800zU c259800zU = new C259800zU();
        C19564311gX<RESOURCE_ITEM_VIEW_HOLDER> c19564311gX = this.LLJI.get(i);
        c259800zU.element = c19564311gX;
        if (c19564311gX == 0) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LLILLL);
            if (C357780E0y.LIZ()) {
                i2 = R.layout.fsq;
            } else {
                i2 = R.layout.fsp;
            }
            View viewTd = C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false);
            if (viewTd == null) {
                viewTd = new View(this.LLILLL);
            }
            if (this.LLJ > 0 && (viewFindViewById = viewTd.findViewById(R.id.t11)) != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                layoutParams.height = this.LLJ;
            }
            RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.t11);
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(new AsS9S0101000_29(i, this, 1));
            }
            ?? c19564311gX2 = new C19564311gX(viewTd, i, this.LLILZ, new AwS167S0101000_29(this, (C19564111gV<RecyclerView.ViewHolder>) i, 14), this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLJILJIL);
            c19564311gX2.LIZIZ();
            c259800zU.element = c19564311gX2;
            c19564311gX2.LIZJ(0);
        }
        this.LLJI.put(i, (C19564311gX<RESOURCE_ITEM_VIEW_HOLDER>) c259800zU.element);
        viewGroup.addView(((C19564311gX) c259800zU.element).LIZ);
        HandlerHook.viewPost(((C19564311gX) c259800zU.element).LIZ, new ARunnableS129S0100000_29(c259800zU, 238));
        return ((C19564311gX) c259800zU.element).LIZ;
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
            this.LLJI.remove(i);
        }
    }

    public C19564111gV(C21594419fC c21594419fC, Context context, C19563711gR c19563711gR, C19564011gU c19564011gU, C19563911gT c19563911gT, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LLILLJJLI = c21594419fC;
        this.LLILLL = context;
        this.LLILZ = c19563711gR;
        this.LLILZIL = c19564011gU;
        this.LLILZLL = c19563911gT;
        this.LLIZ = interfaceC1631620sYq;
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 30);
        this.LLJILJIL = recycledViewPool;
        C19774712Yn c19774712Yn = new C19774712Yn(this, 14);
        if (c21594419fC != null) {
            c21594419fC.addOnPageChangeListener(c19774712Yn);
        }
    }
}
