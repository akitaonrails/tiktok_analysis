package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19Vh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21549919Vh extends BaseAdapter {
    public final C19V6 LL;
    public int LLILLJJLI = -1;
    public boolean LLILLL;
    public final boolean LLILZ;
    public final LayoutInflater LLILZIL;
    public final int LLILZLL;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final void LIZIZ() {
        C19V6 c19v6 = this.LL;
        C21548219Uq c21548219Uq = c19v6.LJIJJLI;
        if (c21548219Uq != null) {
            c19v6.LJIIIIZZ();
            ArrayList<C21548219Uq> arrayList = c19v6.LJIIIZ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (ListProtector.get(arrayList, i) == c21548219Uq) {
                    this.LLILLJJLI = i;
                    return;
                }
            }
        }
        this.LLILLJJLI = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<C21548219Uq> arrayListLJIIJJI;
        if (this.LLILZ) {
            C19V6 c19v6 = this.LL;
            c19v6.LJIIIIZZ();
            arrayListLJIIJJI = c19v6.LJIIIZ;
        } else {
            arrayListLJIIJJI = this.LL.LJIIJJI();
        }
        return this.LLILLJJLI < 0 ? arrayListLJIIJJI.size() : arrayListLJIIJJI.size() - 1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        LIZIZ();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C21548219Uq getItem(int i) {
        ArrayList<C21548219Uq> arrayListLJIIJJI;
        if (this.LLILZ) {
            C19V6 c19v6 = this.LL;
            c19v6.LJIIIIZZ();
            arrayListLJIIJJI = c19v6.LJIIIZ;
        } else {
            arrayListLJIIJJI = this.LL.LJIIJJI();
        }
        int i2 = this.LLILLJJLI;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C21548219Uq) ListProtector.get(arrayListLJIIJJI, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = C786410Ut5.Td(this.LLILZIL, this.LLILZLL, viewGroup, false);
        }
        int i3 = getItem(i).LIZIZ;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).LIZIZ;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.LL.LJIIL() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC21549619Ve interfaceC21549619Ve = (InterfaceC21549619Ve) view;
        if (this.LLILLL) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC21549619Ve.LJIIJJI(getItem(i));
        return view;
    }

    public C21549919Vh(C19V6 c19v6, LayoutInflater layoutInflater, boolean z, int i) {
        this.LLILZ = z;
        this.LLILZIL = layoutInflater;
        this.LL = c19v6;
        this.LLILZLL = i;
        LIZIZ();
    }
}
