package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19Vi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21550019Vi extends BaseAdapter {
    public int LL = -1;
    public final /* synthetic */ C21551919Wb LLILLJJLI;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public final void LIZIZ() {
        C19V6 c19v6 = this.LLILLJJLI.LLILLL;
        C21548219Uq c21548219Uq = c19v6.LJIJJLI;
        if (c21548219Uq != null) {
            c19v6.LJIIIIZZ();
            ArrayList<C21548219Uq> arrayList = c19v6.LJIIIZ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (ListProtector.get(arrayList, i) == c21548219Uq) {
                    this.LL = i;
                    return;
                }
            }
        }
        this.LL = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C19V6 c19v6 = this.LLILLJJLI.LLILLL;
        c19v6.LJIIIIZZ();
        int size = c19v6.LJIIIZ.size();
        this.LLILLJJLI.getClass();
        return this.LL < 0 ? size : size - 1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        LIZIZ();
        super.notifyDataSetChanged();
    }

    public C21550019Vi(C21551919Wb c21551919Wb) {
        this.LLILLJJLI = c21551919Wb;
        LIZIZ();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final C21548219Uq getItem(int i) {
        C19V6 c19v6 = this.LLILLJJLI.LLILLL;
        c19v6.LJIIIIZZ();
        ArrayList<C21548219Uq> arrayList = c19v6.LJIIIZ;
        this.LLILLJJLI.getClass();
        int i2 = this.LL;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C21548219Uq) ListProtector.get(arrayList, i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = C786410Ut5.Td(this.LLILLJJLI.LLILLJJLI, R.layout.hu, viewGroup, false);
        }
        ((InterfaceC21549619Ve) view).LJIIJJI(getItem(i));
        return view;
    }
}
