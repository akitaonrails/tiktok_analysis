package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0ar5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C951010ar5 extends AbstractC960470b6L<C950890aqt> {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final RecyclerView LLILLL;
    public final View LLILZ;
    public C971810bOd LLILZIL;
    public boolean LLILZLL;
    public final C01GW LLIZ;

    public C951010ar5(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_title);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_show_all);
        this.LLILLL = (RecyclerView) view.findViewById(R.id.tvr);
        this.LLILZ = view.findViewById(R.id.tv_unavailable);
        this.LLIZ = C292401Bi.LIZ(new AwS559S0100000_15(this, 606));
    }

    public final void L5(boolean z) {
        if (!z) {
            TextView textView = this.LLILLJJLI;
            if (textView != null) {
                C500260Jjc.LJLJLJ(textView, false);
            }
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                C500260Jjc.LJLJLJ(recyclerView, false);
            }
            View view = this.LLILZ;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, true);
                return;
            }
            return;
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            C500260Jjc.LJLJLJ(textView2, true);
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            C500260Jjc.LJLJLJ(recyclerView2, true);
        }
        View view2 = this.LLILZ;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, false);
        }
        C971810bOd c971810bOd = this.LLILZIL;
        if (c971810bOd == null) {
            return;
        }
        c971810bOd.LIZ();
    }

    public final void N5(C950890aqt c950890aqt) {
        Boolean boolValueOf;
        boolean zLJIILJJIL = false;
        if (this.LLILZIL == null) {
            this.LLILZIL = new C971810bOd(c950890aqt.LIZ, new C951020ar6(this), new C951000ar4(this));
            RecyclerView recyclerView = this.LLILLL;
            if (recyclerView != null) {
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80)), recyclerView);
            }
            RecyclerView recyclerView2 = this.LLILLL;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
            }
            RecyclerView recyclerView3 = this.LLILLL;
            if (recyclerView3 != null) {
                recyclerView3.setOverScrollMode(2);
            }
            RecyclerView recyclerView4 = this.LLILLL;
            if (recyclerView4 != null) {
                recyclerView4.setAdapter((AbstractC21673619ry) this.LLIZ.getValue());
            }
        }
        if (this.LLILZIL != null) {
            InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
            if (interfaceC971790bObLIZIZ != null) {
                zLJIILJJIL = interfaceC971790bObLIZIZ.LJIILJJIL();
            }
            boolValueOf = Boolean.valueOf(zLJIILJJIL);
        } else {
            boolValueOf = null;
        }
        L5(C500260Jjc.LJJJI(boolValueOf));
        TextView textView = this.LL;
        if (textView != null) {
            textView.setText(C497740JfY.LJIJI(2131854244));
        }
        TextView textView2 = this.LLILLJJLI;
        if (textView2 != null) {
            C500260Jjc.LJLIIIL(500L, textView2, new AwS594S0100000_15(this, 666));
        }
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        N5((C950890aqt) obj);
    }
}
