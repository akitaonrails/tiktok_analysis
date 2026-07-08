package X;

import Y.ACListenerS105S0200000_1;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03DR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03DR extends RecyclerView.ViewHolder {
    public final View LL;
    public final TextView LLILLJJLI;

    public C03DR(View view, Function1<? super Integer, Unit> function1) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.x29);
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.fkh), new ACListenerS105S0200000_1(function1, this, 21));
    }
}
