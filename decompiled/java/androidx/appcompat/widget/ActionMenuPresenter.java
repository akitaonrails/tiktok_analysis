package androidx.appcompat.widget;

import X.AbstractC21552619Wi;
import X.C18K0;
import X.C19V6;
import X.C19VD;
import X.C19VH;
import X.C19VI;
import X.C19VJ;
import X.C19VK;
import X.C19VM;
import X.C19VN;
import X.C19VW;
import X.C21514319Hp;
import X.C21548219Uq;
import X.C21552719Wj;
import X.C2189641Amo;
import X.C786410Ut5;
import X.InterfaceC21549519Vd;
import X.InterfaceC21549619Ve;
import X.SubMenuC21548419Us;
import X.ViewOnClickListenerC21547919Un;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes34.dex */
public final class ActionMenuPresenter extends C19VK {
    public C21514319Hp LLJI;
    public Drawable LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public final SparseBooleanArray LLJJIJIIJIL;
    public C19VJ LLJJIJIL;
    public C19VI LLJJJ;
    public C19VH LLJJJIL;
    public C19VW LLJJJJ;
    public final C19VM LLJJJJJIL;
    public int LLJJJJLIIL;

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        SavedState savedState = new SavedState();
        savedState.openSubMenuId = this.LLJJJJLIIL;
        return savedState;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        int size;
        ArrayList<C21548219Uq> arrayListLJIIJJI;
        int i;
        boolean z;
        boolean z2;
        C19V6 c19v6 = this.LLILLL;
        if (c19v6 != null) {
            arrayListLJIIJJI = c19v6.LJIIJJI();
            size = arrayListLJIIJJI.size();
        } else {
            size = 0;
            arrayListLJIIJJI = null;
        }
        int i2 = this.LLJJIII;
        int i3 = this.LLJJI;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.LLIZLLLIL;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(arrayListLJIIJJI, i4);
            int i7 = c21548219Uq.LJJI;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z3 = true;
            }
            if (this.LLJJIJI && c21548219Uq.LJJIIJ) {
                i2 = 0;
            }
            i4++;
        }
        if (this.LLJILJILJ && (z3 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.LLJJIJIIJIL;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            C21548219Uq c21548219Uq2 = (C21548219Uq) ListProtector.get(arrayListLJIIJJI, i9);
            int i11 = c21548219Uq2.LJJI;
            if ((i11 & 2) == i) {
                View viewLJIIJ = LJIIJ(c21548219Uq2, null, viewGroup);
                viewLJIIJ.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewLJIIJ.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                int i12 = c21548219Uq2.LIZIZ;
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                c21548219Uq2.LJII(z);
            } else if ((i11 & 1) == z) {
                int i13 = c21548219Uq2.LIZIZ;
                boolean z4 = sparseBooleanArray.get(i13);
                if ((i8 > 0 || z4) && i3 > 0) {
                    z2 = true;
                    if (z) {
                        View viewLJIIJ2 = LJIIJ(c21548219Uq2, null, viewGroup);
                        viewLJIIJ2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        int measuredWidth2 = viewLJIIJ2.getMeasuredWidth();
                        i3 -= measuredWidth2;
                        if (i10 == 0) {
                            i10 = measuredWidth2;
                        }
                        z2 = true & (i3 + i10 > 0);
                        if (z2 && i13 != 0) {
                            sparseBooleanArray.put(i13, true);
                        }
                        i8--;
                        c21548219Uq2.LJII(z2);
                    }
                } else {
                    z2 = false;
                }
                if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i9; i14++) {
                        C21548219Uq c21548219Uq3 = (C21548219Uq) ListProtector.get(arrayListLJIIJJI, i14);
                        if (c21548219Uq3.LIZIZ == i13) {
                            if ((c21548219Uq3.LJJ & 32) == 32) {
                                i8++;
                            }
                            c21548219Uq3.LJII(false);
                        }
                    }
                }
                if (z2) {
                    i8--;
                }
                c21548219Uq2.LJII(z2);
            } else {
                c21548219Uq2.LJII(false);
            }
            i9++;
            i = 2;
            z = true;
        }
        return z;
    }

    public final boolean LJIIJJI() {
        Object obj;
        C19VH c19vh = this.LLJJJIL;
        if (c19vh != null && (obj = this.LLIZLLLIL) != null) {
            ((View) obj).removeCallbacks(c19vh);
            this.LLJJJIL = null;
            return true;
        }
        C19VJ c19vj = this.LLJJIJIL;
        if (c19vj == null) {
            return false;
        }
        if (c19vj.LIZIZ()) {
            c19vj.LJIIIZ.dismiss();
        }
        return true;
    }

    public final boolean LJIIL() {
        C19VJ c19vj = this.LLJJIJIL;
        return c19vj != null && c19vj.LIZIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.19VH, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.19VJ] */
    public final boolean LJIILIIL() {
        C19V6 c19v6;
        if (!this.LLJILJILJ || LJIIL() || (c19v6 = this.LLILLL) == null || this.LLIZLLLIL == null || this.LLJJJIL != null) {
            return false;
        }
        c19v6.LJIIIIZZ();
        if (c19v6.LJIIIZ.isEmpty()) {
            return false;
        }
        final Context context = this.LLILLJJLI;
        final C19V6 c19v62 = this.LLILLL;
        final C21514319Hp c21514319Hp = this.LLJI;
        final ?? r3 = new C21552719Wj(context, c19v62, c21514319Hp) { // from class: X.19VJ
            @Override // X.C21552719Wj
            public final void LIZJ() {
                C19V6 c19v63 = this.LJIIL.LLILLL;
                if (c19v63 != null) {
                    c19v63.LIZJ(true);
                }
                this.LJIIL.LLJJIJIL = null;
                super.LIZJ();
            }

            {
                this.LJI = 8388613;
                C19VM c19vm = this.LJIIL.LLJJJJJIL;
                this.LJIIIIZZ = c19vm;
                AbstractC21552619Wi abstractC21552619Wi = this.LJIIIZ;
                if (abstractC21552619Wi != null) {
                    abstractC21552619Wi.LJI(c19vm);
                }
            }
        };
        ?? r1 = new Runnable(r3) { // from class: X.19VH
            public final C19VJ LL;

            public final void LIZ() {
                C19VX c19vx;
                C19V6 c19v63 = this.LLILLJJLI.LLILLL;
                if (c19v63 != null && (c19vx = c19v63.LJ) != null) {
                    c19vx.LIZIZ(c19v63);
                }
                View view = (View) this.LLILLJJLI.LLIZLLLIL;
                if (view != null && view.getWindowToken() != null) {
                    C19VJ c19vj = this.LL;
                    if (c19vj.LIZIZ()) {
                        this.LLILLJJLI.LLJJIJIL = this.LL;
                    } else if (c19vj.LJFF != null) {
                        c19vj.LIZLLL(0, 0, false, false);
                        this.LLILLJJLI.LLJJIJIL = this.LL;
                    }
                }
                this.LLILLJJLI.LLJJJIL = null;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    LIZ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }

            {
                this.LL = r3;
            }
        };
        this.LLJJJIL = r1;
        ((View) this.LLIZLLLIL).post(r1);
        return true;
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2189641Amo(7);
        public int openSubMenuId;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.openSubMenuId);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19VM] */
    public ActionMenuPresenter(Context context) {
        super(context);
        this.LLJJIJIIJIL = new SparseBooleanArray();
        this.LLJJJJJIL = new InterfaceC21549519Vd() { // from class: X.19VM
            @Override // X.InterfaceC21549519Vd
            public final boolean LIZIZ(C19V6 c19v6) {
                ActionMenuPresenter actionMenuPresenter = this.LL;
                if (c19v6 == actionMenuPresenter.LLILLL) {
                    return false;
                }
                actionMenuPresenter.LLJJJJLIIL = ((SubMenuC21548419Us) c19v6).LJJII.LIZ;
                InterfaceC21549519Vd interfaceC21549519Vd = actionMenuPresenter.LLILZIL;
                if (interfaceC21549519Vd == null) {
                    return false;
                }
                return interfaceC21549519Vd.LIZIZ(c19v6);
            }

            @Override // X.InterfaceC21549519Vd
            public final void LIZ(C19V6 c19v6, boolean z) {
                if (c19v6 instanceof SubMenuC21548419Us) {
                    c19v6.LJIIJ().LIZJ(false);
                }
                InterfaceC21549519Vd interfaceC21549519Vd = this.LL.LLILZIL;
                if (interfaceC21549519Vd != null) {
                    interfaceC21549519Vd.LIZ(c19v6, z);
                }
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.19VI, X.19Wj] */
    @Override // X.C19V7
    public final boolean LIZLLL(final SubMenuC21548419Us subMenuC21548419Us) {
        boolean z;
        if (!subMenuC21548419Us.hasVisibleItems()) {
            return false;
        }
        SubMenuC21548419Us subMenuC21548419Us2 = subMenuC21548419Us;
        while (true) {
            C19V6 c19v6 = subMenuC21548419Us2.LJJIFFI;
            if (c19v6 == this.LLILLL) {
                break;
            }
            subMenuC21548419Us2 = (SubMenuC21548419Us) c19v6;
        }
        C21548219Uq c21548219Uq = subMenuC21548419Us2.LJJII;
        ViewGroup viewGroup = (ViewGroup) this.LLIZLLLIL;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                final View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof InterfaceC21549619Ve) && ((InterfaceC21549619Ve) childAt).getItemData() == c21548219Uq) {
                    if (childAt != 0) {
                        this.LLJJJJLIIL = subMenuC21548419Us.LJJII.LIZ;
                        int size = subMenuC21548419Us.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size) {
                                MenuItem item = subMenuC21548419Us.getItem(i2);
                                if (item.isVisible() && item.getIcon() != null) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        final Context context = this.LLILLJJLI;
                        ?? r1 = new C21552719Wj(context, subMenuC21548419Us, childAt) { // from class: X.19VI
                            @Override // X.C21552719Wj
                            public final void LIZJ() {
                                ActionMenuPresenter actionMenuPresenter = this.LJIIL;
                                actionMenuPresenter.LLJJJ = null;
                                actionMenuPresenter.LLJJJJLIIL = 0;
                                super.LIZJ();
                            }

                            {
                                if ((subMenuC21548419Us.LJJII.LJJ & 32) != 32) {
                                    View view = this.LJIIL.LLJI;
                                    this.LJFF = view == null ? (View) this.LJIIL.LLIZLLLIL : view;
                                }
                                C19VM c19vm = this.LJIIL.LLJJJJJIL;
                                this.LJIIIIZZ = c19vm;
                                AbstractC21552619Wi abstractC21552619Wi = this.LJIIIZ;
                                if (abstractC21552619Wi != null) {
                                    abstractC21552619Wi.LJI(c19vm);
                                }
                            }
                        };
                        this.LLJJJ = r1;
                        r1.LJII = z;
                        AbstractC21552619Wi abstractC21552619Wi = r1.LJIIIZ;
                        if (abstractC21552619Wi != null) {
                            abstractC21552619Wi.LJIILIIL(z);
                        }
                        C19VI c19vi = this.LLJJJ;
                        if (!c19vi.LIZIZ()) {
                            if (c19vi.LJFF == null) {
                                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                            }
                            c19vi.LIZLLL(0, 0, false, false);
                        }
                        InterfaceC21549519Vd interfaceC21549519Vd = this.LLILZIL;
                        if (interfaceC21549519Vd != null) {
                            interfaceC21549519Vd.LIZIZ(subMenuC21548419Us);
                        }
                        return true;
                    }
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19V7
    public final void LJII(boolean z) {
        int size;
        int i;
        C21548219Uq itemData;
        ViewGroup viewGroup = (ViewGroup) this.LLIZLLLIL;
        ArrayList<C21548219Uq> arrayList = null;
        if (viewGroup != null) {
            C19V6 c19v6 = this.LLILLL;
            if (c19v6 != null) {
                c19v6.LJIIIIZZ();
                ArrayList<C21548219Uq> arrayListLJIIJJI = this.LLILLL.LJIIJJI();
                int size2 = arrayListLJIIJJI.size();
                i = 0;
                for (int i2 = 0; i2 < size2; i2++) {
                    C21548219Uq c21548219Uq = (C21548219Uq) ListProtector.get(arrayListLJIIJJI, i2);
                    if ((c21548219Uq.LJJ & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof InterfaceC21549619Ve) {
                            itemData = ((InterfaceC21549619Ve) childAt).getItemData();
                        } else {
                            itemData = null;
                        }
                        View viewLJIIJ = LJIIJ(c21548219Uq, childAt, viewGroup);
                        if (c21548219Uq != itemData) {
                            viewLJIIJ.setPressed(false);
                            viewLJIIJ.jumpDrawablesToCurrentState();
                        }
                        if (viewLJIIJ != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewLJIIJ.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(viewLJIIJ, viewGroup2);
                            }
                            ((ViewGroup) this.LLIZLLLIL).addView(viewLJIIJ, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.LLJI) {
                    i++;
                } else {
                    C786410Ut5.LJJLIL(i, viewGroup);
                }
            }
        }
        ((View) this.LLIZLLLIL).requestLayout();
        C19V6 c19v62 = this.LLILLL;
        if (c19v62 != null) {
            c19v62.LJIIIIZZ();
            ArrayList<C21548219Uq> arrayList2 = c19v62.LJIIIIZZ;
            int size3 = arrayList2.size();
            for (int i3 = 0; i3 < size3; i3++) {
            }
        }
        C19V6 c19v63 = this.LLILLL;
        if (c19v63 != null) {
            c19v63.LJIIIIZZ();
            arrayList = c19v63.LJIIIZ;
        }
        if (this.LLJILJILJ && arrayList != null && ((size = arrayList.size()) != 1 ? size > 0 : (!((C21548219Uq) ListProtector.get(arrayList, 0)).LJJIIJ))) {
            if (this.LLJI == null) {
                this.LLJI = new C21514319Hp(this, this.LL);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.LLJI.getParent();
            if (viewGroup3 != this.LLIZLLLIL) {
                if (viewGroup3 != null) {
                    C786410Ut5.LJJJLZIJ(this.LLJI, viewGroup3);
                }
                ViewGroup viewGroup4 = (ViewGroup) this.LLIZLLLIL;
                C21514319Hp c21514319Hp = this.LLJI;
                viewGroup4.getClass();
                C19VN c19vn = new C19VN();
                ((LinearLayout.LayoutParams) c19vn).gravity = 16;
                c19vn.LIZ = true;
                viewGroup4.addView(c21514319Hp, c19vn);
            }
        } else {
            C21514319Hp c21514319Hp2 = this.LLJI;
            if (c21514319Hp2 != null) {
                Object parent = c21514319Hp2.getParent();
                Object obj = this.LLIZLLLIL;
                if (parent == obj) {
                    C786410Ut5.LJJJLZIJ(this.LLJI, (ViewGroup) obj);
                }
            }
        }
        ((C19VD) this.LLIZLLLIL).setOverflowReserved(this.LLJILJILJ);
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).openSubMenuId) > 0 && (menuItemFindItem = this.LLILLL.findItem(i)) != null) {
            LIZLLL((SubMenuC21548419Us) menuItemFindItem.getSubMenu());
        }
    }

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
        LJIIJJI();
        C19VI c19vi = this.LLJJJ;
        if (c19vi != null && c19vi.LIZIZ()) {
            c19vi.LJIIIZ.dismiss();
        }
        InterfaceC21549519Vd interfaceC21549519Vd = this.LLILZIL;
        if (interfaceC21549519Vd != null) {
            interfaceC21549519Vd.LIZ(c19v6, z);
        }
    }

    @Override // X.C19V7
    public final void LJIIIIZZ(Context context, C19V6 c19v6) {
        this.LLILLJJLI = context;
        C786410Ut5.ne(context);
        this.LLILLL = c19v6;
        Resources resources = context.getResources();
        C18K0 c18k0 = new C18K0(context);
        if (!this.LLJILLL) {
            this.LLJILJILJ = true;
        }
        this.LLJJ = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.LLJJIII = c18k0.LIZ();
        int measuredWidth = this.LLJJ;
        if (this.LLJILJILJ) {
            if (this.LLJI == null) {
                C21514319Hp c21514319Hp = new C21514319Hp(this, this.LL);
                this.LLJI = c21514319Hp;
                if (this.LLJILJIL) {
                    c21514319Hp.setImageDrawable(this.LLJIJIL);
                    this.LLJIJIL = null;
                    this.LLJILJIL = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.LLJI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.LLJI.getMeasuredWidth();
        } else {
            this.LLJI = null;
        }
        this.LLJJI = measuredWidth;
        resources.getDisplayMetrics();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View LJIIJ(C21548219Uq c21548219Uq, View view, ViewGroup viewGroup) {
        InterfaceC21549619Ve interfaceC21549619Ve;
        View actionView = c21548219Uq.getActionView();
        int i = 0;
        if (actionView == null || c21548219Uq.LJ()) {
            if (view instanceof InterfaceC21549619Ve) {
                interfaceC21549619Ve = (InterfaceC21549619Ve) view;
            } else {
                interfaceC21549619Ve = (InterfaceC21549619Ve) C786410Ut5.Td(this.LLILZ, this.LLIZ, viewGroup, false);
            }
            interfaceC21549619Ve.LJIIJJI(c21548219Uq);
            ViewOnClickListenerC21547919Un viewOnClickListenerC21547919Un = (ViewOnClickListenerC21547919Un) interfaceC21549619Ve;
            viewOnClickListenerC21547919Un.setItemInvoker((C19VD) this.LLIZLLLIL);
            if (this.LLJJJJ == null) {
                this.LLJJJJ = new C19VW(this);
            }
            viewOnClickListenerC21547919Un.setPopupCallback(this.LLJJJJ);
            actionView = (View) interfaceC21549619Ve;
        }
        if (c21548219Uq.LJJIIJ) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, actionView);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((LinearLayoutCompat) viewGroup).checkLayoutParams(layoutParams)) {
            C786410Ut5.W5(actionView, C19VD.LJIIIIZZ(layoutParams));
        }
        return actionView;
    }
}
