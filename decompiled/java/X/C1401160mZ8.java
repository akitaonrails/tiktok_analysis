package X;

import Y.AObserverS210S0100000_6;
import Y.AsS48S0100000_21;
import android.os.SystemClock;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.detail.DetailViewModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mZ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401160mZ8 {
    public RecyclerView LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJII;
    public InterfaceC1401150mZ7 LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJFF = -1;
    public final ConcurrentHashMap<Integer, Integer> LJI = new ConcurrentHashMap<>();
    public final long LJIIIIZZ = 500;
    public int LJIIIZ = -1;

    static {
        new Pair(0, 0);
    }

    public final void LIZIZ() {
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter;
        int iFindLastCompletelyVisibleItemPosition;
        AbstractC21673619ry adapter2;
        Integer numValueOf;
        C20746816Gk c20746816GkLJ = LJ(this.LIZ);
        if (c20746816GkLJ == null) {
            return;
        }
        RecyclerView recyclerView = this.LIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        RecyclerView recyclerView2 = this.LIZ;
        int i = 0;
        if (recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null || adapter.getItemCount() <= 0 || (iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition()) < 0) {
            return;
        }
        while (true) {
            RecyclerView recyclerView3 = this.LIZ;
            if (recyclerView3 != null && (adapter2 = recyclerView3.getAdapter()) != null && (numValueOf = Integer.valueOf(adapter2.getItemViewType(i))) != null && (numValueOf.intValue() == 110008 || numValueOf.intValue() == 110007 || numValueOf.intValue() == 110006)) {
                break;
            } else if (i == iFindLastCompletelyVisibleItemPosition) {
                return;
            } else {
                i++;
            }
        }
        this.LJIIIZ = i;
        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
        if (viewFindViewByPosition == null) {
            return;
        }
        int[] iArr = new int[2];
        c20746816GkLJ.getLocationOnScreen(iArr);
        int height = (iArr[1] + c20746816GkLJ.getHeight()) / 2;
        new Pair(Integer.valueOf(iArr[1]), Integer.valueOf(iArr[1] + c20746816GkLJ.getHeight()));
        this.LJ = viewFindViewByPosition.getHeight();
        this.LIZIZ = (viewFindViewByPosition.getHeight() / 4) + height;
        this.LIZJ = height - (viewFindViewByPosition.getHeight() / 4);
        int[] iArr2 = new int[2];
        viewFindViewByPosition.getLocationOnScreen(iArr2);
        int i2 = iArr2[1];
        this.LIZLLL = i2;
        new Pair(Integer.valueOf(i2 - this.LIZIZ), Integer.valueOf(i));
    }

    public C1401160mZ8() {
        new Pair(0, 0);
    }

    public static C20746816Gk LJ(View view) {
        View view2 = null;
        if (view == null) {
            return null;
        }
        if (view instanceof C20746816Gk) {
            return (C20746816Gk) view;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        }
        return LJ(view2);
    }

    public final void LIZJ(int i) {
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        Object objFindViewHolderForAdapterPosition;
        InterfaceC1401180mZA interfaceC1401180mZA;
        Object objFindViewHolderForAdapterPosition2;
        InterfaceC1401180mZA interfaceC1401180mZA2;
        RecyclerView.LayoutManager layoutManager2;
        LinearLayoutManager linearLayoutManager2;
        InterfaceC1401180mZA interfaceC1401180mZA3;
        Object objFindViewHolderForAdapterPosition3;
        InterfaceC1401180mZA interfaceC1401180mZA4;
        InterfaceC1401180mZA interfaceC1401180mZA5 = null;
        Object objFindViewHolderForAdapterPosition4 = null;
        if (i < 0) {
            C584710MwX.LIZIZ = i;
            RecyclerView recyclerView = this.LIZ;
            if (recyclerView != null) {
                layoutManager2 = recyclerView.getLayoutManager();
            } else {
                layoutManager2 = null;
            }
            if ((layoutManager2 instanceof GridLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        RecyclerView recyclerView2 = this.LIZ;
                        if (recyclerView2 != null) {
                            objFindViewHolderForAdapterPosition3 = recyclerView2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        } else {
                            objFindViewHolderForAdapterPosition3 = null;
                        }
                        if ((objFindViewHolderForAdapterPosition3 instanceof InterfaceC1401180mZA) && (interfaceC1401180mZA4 = (InterfaceC1401180mZA) objFindViewHolderForAdapterPosition3) != null) {
                            interfaceC1401180mZA4.onPause();
                        }
                        if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                int i2 = this.LJFF;
                if (i2 >= 0) {
                    RecyclerView recyclerView3 = this.LIZ;
                    if (recyclerView3 != null) {
                        objFindViewHolderForAdapterPosition4 = recyclerView3.findViewHolderForAdapterPosition(i2);
                    }
                    if ((objFindViewHolderForAdapterPosition4 instanceof InterfaceC1401180mZA) && (interfaceC1401180mZA3 = (InterfaceC1401180mZA) objFindViewHolderForAdapterPosition4) != null) {
                        interfaceC1401180mZA3.onPause();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C584710MwX.LIZIZ = i;
        RecyclerView recyclerView4 = this.LIZ;
        if (recyclerView4 != null) {
            layoutManager = recyclerView4.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition2 = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition2 = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition2 <= iFindLastVisibleItemPosition2) {
                int i3 = iFindFirstVisibleItemPosition2;
                while (true) {
                    RecyclerView recyclerView5 = this.LIZ;
                    if (recyclerView5 != null) {
                        objFindViewHolderForAdapterPosition2 = recyclerView5.findViewHolderForAdapterPosition(i3);
                    } else {
                        objFindViewHolderForAdapterPosition2 = null;
                    }
                    if ((objFindViewHolderForAdapterPosition2 instanceof InterfaceC1401180mZA) && (interfaceC1401180mZA2 = (InterfaceC1401180mZA) objFindViewHolderForAdapterPosition2) != null) {
                        interfaceC1401180mZA2.onPause();
                    }
                    if (i3 == iFindLastVisibleItemPosition2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            int i4 = this.LJFF;
            if (i4 >= 0) {
                RecyclerView recyclerView6 = this.LIZ;
                if (recyclerView6 != null) {
                    objFindViewHolderForAdapterPosition = recyclerView6.findViewHolderForAdapterPosition(i4);
                } else {
                    objFindViewHolderForAdapterPosition = null;
                }
                if ((objFindViewHolderForAdapterPosition instanceof InterfaceC1401180mZA) && (interfaceC1401180mZA = (InterfaceC1401180mZA) objFindViewHolderForAdapterPosition) != null) {
                    interfaceC1401180mZA.onPause();
                }
            }
            if (iFindFirstVisibleItemPosition2 <= i && i <= iFindLastVisibleItemPosition2) {
                RecyclerView recyclerView7 = this.LIZ;
                if (recyclerView7 != null) {
                    viewHolderFindViewHolderForAdapterPosition = recyclerView7.findViewHolderForAdapterPosition(i);
                } else {
                    viewHolderFindViewHolderForAdapterPosition = null;
                }
                if (viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC1401180mZA) {
                    interfaceC1401180mZA5 = (InterfaceC1401180mZA) viewHolderFindViewHolderForAdapterPosition;
                }
                if (!this.LJIIL && interfaceC1401180mZA5 != null) {
                    interfaceC1401180mZA5.i2(i);
                }
                this.LJII = SystemClock.elapsedRealtime();
            }
        }
    }

    public final void LIZ(ViewModelStoreOwner viewModelStoreOwner, LifecycleOwner lifecycleOwner, RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AsS48S0100000_21(this, 8));
        }
        ((DetailViewModel) new ViewModelProvider(viewModelStoreOwner).get(DetailViewModel.class)).LLILLJJLI.observe(lifecycleOwner, new AObserverS210S0100000_6(LJ(this.LIZ), 57));
        C20746816Gk c20746816GkLJ = LJ(this.LIZ);
        if (c20746816GkLJ != null) {
            c20746816GkLJ.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0mZ9
                @Override // X.InterfaceC1809520xBm
                public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                    this.LIZ.getClass();
                    C1401160mZ8 c1401160mZ8 = this.LIZ;
                    if (c1401160mZ8.LIZIZ == 0 || c1401160mZ8.LIZJ == 0) {
                        c1401160mZ8.LIZIZ();
                    }
                    this.LIZ.LIZLLL(i2 - i4, true, false);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0121, code lost:
    
        LIZJ(-1);
        r13.LJI.clear();
        r13.LJFF = -1;
        r0 = r13.LJIIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x012d, code lost:
    
        if (r0 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012f, code lost:
    
        r0.LIZ(2);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[LOOP:0: B:22:0x0042->B:32:0x0064, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401160mZ8.LIZLLL(int, boolean, boolean):void");
    }
}
