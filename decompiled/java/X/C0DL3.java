package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;

/* JADX INFO: renamed from: X.0DL3, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DL3 extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function2<Integer, String, Unit> LLILLJJLI;
    public final TuxTextView LLILLL;

    public C0DL3(View view, AwS617S0100000_3 awS617S0100000_3) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = awS617S0100000_3;
        this.LLILLL = (TuxTextView) view.findViewById(R.id.x0v);
    }
}
