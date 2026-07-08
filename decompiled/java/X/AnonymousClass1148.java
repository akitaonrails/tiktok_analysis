package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1148, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1148 extends PagerAdapter {
    public final Context LLILLJJLI;
    public final ArrayList<AnonymousClass1149> LLILLL;
    public final C0FMR LLILZ;
    public final C114C LLILZIL;
    public final Function0<VideoPublishEditModel> LLILZLL;
    public final SparseArray<C114A> LLIZ = new SparseArray<>();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        C114A c114a = this.LLIZ.get(i);
        if (c114a == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fsu, viewGroup, false);
            Context context = this.LLILLJJLI;
            C114C c114c = this.LLILZIL;
            AnonymousClass1149 anonymousClass1149 = (AnonymousClass1149) ListProtector.get(this.LLILLL, i);
            C114A c114a2 = new C114A(context, c114c, anonymousClass1149, this.LLILZ, viewTd, i, this.LLILZLL);
            if (anonymousClass1149.LIZIZ != null) {
                c114a2.LJIIL = (RecyclerView) viewTd.findViewById(R.id.tv6);
                c114a2.LJIIIZ = viewTd.findViewById(R.id.tf5);
                c114a2.LJIIJ = viewTd.findViewById(R.id.tep);
                c114a2.LJIIJJI = (TextView) viewTd.findViewById(R.id.tf0);
                c114a2.LJIILIIL = (C1749280vcc) viewTd.findViewById(R.id.vqg);
                View view = c114a2.LJIIIZ;
                if (view != null) {
                    C786410Ut5.I7(new ACListenerS163S0100000_29(c114a2, 290), view);
                }
                c114a2.LIZ();
            }
            this.LLIZ.put(i, c114a2);
            viewGroup.addView(viewTd);
            return viewTd;
        }
        View view2 = c114a.LJ;
        viewGroup.addView(view2);
        return view2;
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass1148(Context context, ArrayList<AnonymousClass1149> arrayList, C0FMR c0fmr, C114C c114c, Function0<? extends VideoPublishEditModel> function0) {
        this.LLILLJJLI = context;
        this.LLILLL = arrayList;
        this.LLILZ = c0fmr;
        this.LLILZIL = c114c;
        this.LLILZLL = function0;
    }
}
