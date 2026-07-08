package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ECW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ECW extends PagerAdapter {
    public final C0ECT LLILLJJLI;
    public final List<C357590E0f> LLILLL;
    public final SparseArray<C0EBW> LLILZ = new SparseArray<>();
    public C0EBW LLILZIL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLL.size();
    }

    public C0ECW(C0ECT c0ect, List list) {
        this.LLILLJJLI = c0ect;
        this.LLILLL = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        C357590E0f c357590E0f = (C357590E0f) ListProtector.get(this.LLILLL, i);
        C0EBW c0ebw = this.LLILZ.get(i);
        if (c0ebw == null) {
            C0EBQ c0ebqLIZ = this.LLILLJJLI.LIZ(c357590E0f, viewGroup);
            this.LLILZ.put(i, c0ebqLIZ);
            return c0ebqLIZ.LIZLLL();
        }
        View viewLIZ = c0ebw.LIZ();
        viewGroup.addView(viewLIZ);
        return viewLIZ;
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
        C0EBW c0ebw = this.LLILZ.get(i);
        if (c0ebw != null) {
            c0ebw.LIZIZ(false);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        if (Intrinsics.LJFF(this.LLILZ.get(i), this.LLILZIL)) {
            return;
        }
        C0EBW c0ebw = this.LLILZIL;
        if (c0ebw != null) {
            c0ebw.LIZIZ(false);
        }
        C0EBW c0ebw2 = this.LLILZ.get(i);
        this.LLILZIL = c0ebw2;
        if (c0ebw2 != null) {
            c0ebw2.LIZIZ(true);
        }
    }
}
