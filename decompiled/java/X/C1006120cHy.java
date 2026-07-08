package X;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0cHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006120cHy extends RecyclerView.ViewHolder {
    public final View LL;
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC346201Wa<C1006040cHq> LLILLL;

    public C1006120cHy(AnonymousClass0951 anonymousClass0951, View view, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = anonymousClass0951;
        LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).launchWhenStarted(new C1006110cHx(this, (TextView) view.findViewById(R.id.wlc), null));
    }
}
