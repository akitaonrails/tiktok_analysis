package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.material.internal.ParcelableSparseArray;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19U6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19U6 implements C19V7 {
    public C20691815y0 LL;
    public LinearLayout LLILLJJLI;
    public C19V6 LLILLL;
    public int LLILZ;
    public C19UQ LLILZIL;
    public LayoutInflater LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public ColorStateList LLJ;
    public ColorStateList LLJI;
    public Drawable LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJI = true;
    public int LLJJIJIL = -1;
    public final C19U7 LLJJJ = new View.OnClickListener() { // from class: X.19U7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C19UP c19up = (C19UP) view;
            C19UQ c19uq = this.LL.LLILZIL;
            boolean z = true;
            if (c19uq != null) {
                c19uq.LLILLL = true;
            }
            C21548219Uq itemData = c19up.getItemData();
            C19U6 c19u6 = this.LL;
            boolean zLJIILLIIL = c19u6.LLILLL.LJIILLIIL(itemData, c19u6, 0);
            if (itemData != null && itemData.isCheckable() && zLJIILLIIL) {
                this.LL.LLILZIL.LLLI(itemData);
            } else {
                z = false;
            }
            C19U6 c19u62 = this.LL;
            C19UQ c19uq2 = c19u62.LLILZIL;
            if (c19uq2 != null) {
                c19uq2.LLILLL = false;
            }
            if (z) {
                c19u62.LJII(false);
            }
        }
    };

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
    }

    @Override // X.C19V7
    public final boolean LIZJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LIZLLL(SubMenuC21548419Us subMenuC21548419Us) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        C21548219Uq c21548219Uq;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.LL != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.LL.saveHierarchyState(sparseArray);
            C786410Ut5.LJJJ(bundle, "android:menu:list", sparseArray);
        }
        C19UQ c19uq = this.LLILZIL;
        if (c19uq != null) {
            c19uq.getClass();
            Bundle bundle2 = new Bundle();
            C21548219Uq c21548219Uq2 = c19uq.LLILLJJLI;
            if (c21548219Uq2 != null) {
                bundle2.putInt("android:menu:checked", c21548219Uq2.LIZ);
            }
            SparseArray sparseArray2 = new SparseArray();
            int size = c19uq.LL.size();
            for (int i = 0; i < size; i++) {
                C19UL c19ul = (C19UL) ListProtector.get(c19uq.LL, i);
                if ((c19ul instanceof C19UH) && (c21548219Uq = ((C19UH) c19ul).LIZ) != null && (actionView = c21548219Uq.getActionView()) != null) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray2.put(c21548219Uq.LIZ, parcelableSparseArray);
                }
            }
            C786410Ut5.LJJJ(bundle2, "android:menu:action_views", sparseArray2);
            C786410Ut5.LJJIIZI(bundle, bundle2, "android:menu:adapter");
        }
        if (this.LLILLJJLI != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.LLILLJJLI.saveHierarchyState(sparseArray3);
            C786410Ut5.LJJJ(bundle, "android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // X.C19V7
    public final int getId() {
        return this.LLILZ;
    }

    @Override // X.C19V7
    public final void LJII(boolean z) {
        C19UQ c19uq = this.LLILZIL;
        if (c19uq != null) {
            c19uq.LLLFZ();
            c19uq.notifyDataSetChanged();
        }
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
        C21548219Uq c21548219Uq;
        View actionView;
        SparseArray<Parcelable> sparseArray;
        C21548219Uq c21548219Uq2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.LL.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C19UQ c19uq = this.LLILZIL;
                c19uq.getClass();
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    c19uq.LLILLL = true;
                    int size = c19uq.LL.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        C19UL c19ul = (C19UL) ListProtector.get(c19uq.LL, i2);
                        if ((c19ul instanceof C19UH) && (c21548219Uq2 = ((C19UH) c19ul).LIZ) != null && c21548219Uq2.LIZ == i) {
                            c19uq.LLLI(c21548219Uq2);
                            break;
                        }
                        i2++;
                    }
                    c19uq.LLILLL = false;
                    c19uq.LLLFZ();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = c19uq.LL.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        C19UL c19ul2 = (C19UL) ListProtector.get(c19uq.LL, i3);
                        if ((c19ul2 instanceof C19UH) && (c21548219Uq = ((C19UH) c19ul2).LIZ) != null && (actionView = c21548219Uq.getActionView()) != null && (sparseArray = (SparseArray) sparseParcelableArray2.get(c21548219Uq.LIZ)) != null) {
                            actionView.restoreHierarchyState(sparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.LLILLJJLI.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // X.C19V7
    public final void LJIIIIZZ(Context context, C19V6 c19v6) {
        this.LLILZLL = C786410Ut5.ne(context);
        this.LLILLL = c19v6;
        this.LLJJIJIIJIL = context.getResources().getDimensionPixelOffset(R.dimen.qz);
    }
}
