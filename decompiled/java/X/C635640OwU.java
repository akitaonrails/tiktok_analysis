package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OwU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635640OwU extends RecyclerView.ViewHolder {
    public final View LL;
    public final C127K LLILLJJLI;
    public final C127A LLILLL;

    public C635640OwU(View view) {
        super(view);
        this.LL = view;
        C127K c127k = (C127K) view.findViewById(R.id.u1q);
        this.LLILLJJLI = c127k;
        this.LLILLL = (C127A) c127k.getAccessory();
        c127k.setOnClickListener(new AwS588S0100000_9(this, 647));
    }
}
