package X;

import Y.ACListenerS141S0100000_6;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HYK, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYK extends RecyclerView.ViewHolder {
    public final View LL;
    public final InterfaceC450890HmB LLILLJJLI;
    public final View LLILLL;
    public Integer LLILZ;

    public C0HYK(View view, InterfaceC450890HmB interfaceC450890HmB) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC450890HmB;
        View viewFindViewById = view.findViewById(R.id.nxm);
        this.LLILLL = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.aul);
        TextView textView = (TextView) view.findViewById(R.id.vo4);
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 87), viewFindViewById);
        C786410Ut5.LJLLLLLL(0, textView);
        textView.setText(2131827091);
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
    }
}
