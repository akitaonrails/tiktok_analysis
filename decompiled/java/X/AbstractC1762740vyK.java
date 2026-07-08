package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0vyK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1762740vyK extends PagerAdapter {
    public final LinkedList<View> LLILLJJLI = new LinkedList<>();
    public final LayoutInflater LLILLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean LJJIFFI(View view, Object obj) {
        return view == obj;
    }

    public abstract View LJJIJIL(int i, View view, ViewGroup viewGroup);

    public void LJJIJL(View view) {
    }

    public AbstractC1762740vyK(LayoutInflater layoutInflater) {
        this.LLILLL = layoutInflater;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object LJJI(int i, ViewGroup viewGroup) {
        View viewRemoveFirst;
        if (!this.LLILLJJLI.isEmpty()) {
            viewRemoveFirst = this.LLILLJJLI.removeFirst();
        } else {
            viewRemoveFirst = null;
        }
        View viewLJJIJIL = LJJIJIL(i, viewRemoveFirst, viewGroup);
        viewGroup.addView(viewLJJIJIL);
        return viewLJJIJIL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj == null) {
            return;
        }
        View view = (View) obj;
        C786410Ut5.LJJJLZIJ(view, viewGroup);
        this.LLILLJJLI.add(view);
        LJJIJL(view);
    }
}
