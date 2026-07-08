package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: renamed from: X.0DKD, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DKD extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function2<Integer, String, Unit> LLILLJJLI;
    public final TuxTextView LLILLL;

    public C0DKD(View view, AwS617S0100000_3 awS617S0100000_3) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = awS617S0100000_3;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.x0v);
    }
}
