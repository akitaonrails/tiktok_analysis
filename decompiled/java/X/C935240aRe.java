package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aRe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935240aRe extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final C1841350y17 LLILLJJLI;
    public final /* synthetic */ C443190HZl LLILLL;

    public final void I5() {
        C953770avX c953770avXLJFF;
        C953770avX c953770avXLJFF2;
        if (getAdapterPosition() < this.LLILLL.LLILLL.size()) {
            EnumC945540aiG enumC945540aiG = EnumC945540aiG.SWITCH;
            C953670avN c953670avN = C953610avH.LJJI;
            c953670avN.getClass();
            String str = C953610avH.LJJII;
            String str2 = null;
            Long l = (str == null || (c953770avXLJFF2 = C953760avW.LIZIZ.LIZ().LJFF(str)) == null) ? null : c953770avXLJFF2.LJIIL;
            c953670avN.getClass();
            String str3 = C953610avH.LJJII;
            if (str3 != null && (c953770avXLJFF = C953760avW.LIZIZ.LIZ().LJFF(str3)) != null) {
                str2 = c953770avXLJFF.LJIILIIL;
            }
            C946850akN.LJII(enumC945540aiG, l, str2);
            C443190HZl c443190HZl = this.LLILLL;
            c443190HZl.LLILLJJLI = ((Number) ListProtector.get(c443190HZl.LLILLL, getAdapterPosition())).intValue();
            InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
            if (interfaceC945610aiNLIZ != null) {
                interfaceC945610aiNLIZ.LIZIZ(this.LLILLL.LLILLJJLI);
            }
            this.LLILLL.notifyDataSetChanged();
            this.LLILLL.LL.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935240aRe(C443190HZl c443190HZl, View view) {
        super(view);
        this.LLILLL = c443190HZl;
        View viewFindViewById = view.findViewById(R.id.dyw);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_spot);
        this.LL = tuxTextView;
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.st5);
        this.LLILLJJLI = c1841350y17;
        C786410Ut5.I7(new ACListenerS150S0100000_15(this, 272), view);
        C786410Ut5.e9(c1841350y17, new ACListenerS150S0100000_15(this, 273));
        if (C497740JfY.LJJ()) {
            if (viewFindViewById != null) {
                viewFindViewById.setLayoutDirection(1);
            }
            if (tuxTextView != null) {
                tuxTextView.setTextDirection(4);
            }
        }
    }
}
