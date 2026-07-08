package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: X.19Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21552619Wi implements InterfaceC21551219Vu, C19V7, AdapterView.OnItemClickListener {
    public Rect LL;

    @Override // X.C19V7
    public final boolean LIZJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final boolean LJ(C21548219Uq c21548219Uq) {
        return false;
    }

    @Override // X.C19V7
    public final void LJIIIIZZ(Context context, C19V6 c19v6) {
    }

    public abstract void LJIIJ(C19V6 c19v6);

    public abstract void LJIIL(View view);

    public abstract void LJIILIIL(boolean z);

    public abstract void LJIILJJIL(int i);

    public abstract void LJIILL(int i);

    public abstract void LJIILLIIL(PopupWindow.OnDismissListener onDismissListener);

    public abstract void LJIIZILJ(boolean z);

    public abstract void LJIJ(int i);

    @Override // X.C19V7
    public final int getId() {
        return 0;
    }

    public static boolean LJIJI(C19V6 c19v6) {
        int size = c19v6.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c19v6.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static int LJIIJJI(C21549919Vh c21549919Vh, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = c21549919Vh.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = c21549919Vh.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = c21549919Vh.getView(i4, view, frameLayout);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        C21549919Vh c21549919Vh;
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            c21549919Vh = (C21549919Vh) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            c21549919Vh = (C21549919Vh) listAdapter;
        }
        C19V6 c19v6 = c21549919Vh.LL;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (!(this instanceof ViewOnKeyListenerC21552919Wl)) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c19v6.LJIILLIIL(menuItem, this, i2);
    }
}
