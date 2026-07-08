package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TUY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUY extends RecyclerView.ViewHolder {
    public final C127K LL;
    public final AnonymousClass1278 LLILLJJLI;

    public C0TUY(View view) {
        super(view);
        this.LLILLJJLI = new AnonymousClass1278(view.getContext());
        ((C127K) view.findViewById(R.id.dle)).setAccessory(this.LLILLJJLI);
        view.findViewById(R.id.dle).setBackgroundColor(C1308910kAL.LIZJ(R.attr.zq, view.getContext()).intValue());
        this.LL = (C127K) view.findViewById(R.id.dle);
    }
}
