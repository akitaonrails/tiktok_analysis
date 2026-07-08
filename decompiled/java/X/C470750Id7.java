package X;

import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Id7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C470750Id7 extends AbstractC470810IdD {
    public final PagingViewModel LL;
    public final View LLILLJJLI;
    public final TextView LLILLL;

    @Override // X.AbstractC470810IdD
    public final void L5() {
    }

    @Override // X.AbstractC470810IdD
    public final void I5(boolean z) {
        C470770Id9 value = this.LL.LLILLJJLI.getValue();
        View viewFindViewById = this.itemView.findViewById(R.id.w19);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        if (value != null && value.LIZ == EnumC470780IdA.FAILED && z) {
            layoutParams.height = -1;
            C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
            TextView textView = this.LLILLL;
            textView.setTextColor(textView.getResources().getColor(R.color.a3z));
            this.LLILLL.setText(2131851925);
        } else {
            layoutParams.height = -2;
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
            TextView textView2 = this.LLILLL;
            textView2.setTextColor(textView2.getResources().getColor(R.color.a3y));
            this.LLILLL.setText(2131851923);
        }
        C786410Ut5.W5(viewFindViewById, layoutParams);
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 216), this.itemView);
    }

    public C470750Id7(View view, PagingViewModel pagingViewModel) {
        super(view);
        this.LL = pagingViewModel;
        this.LLILLJJLI = view.findViewById(R.id.hbb);
        this.LLILLL = (TextView) view.findViewById(R.id.hc3);
    }
}
