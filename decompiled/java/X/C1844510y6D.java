package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0y6D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1844510y6D extends RecyclerView.ViewHolder {
    public final C16F5 LL;
    public final C19RC LLILLJJLI;
    public final C19RC LLILLL;
    public final LiveIconView LLILZ;
    public final /* synthetic */ C1844500y6C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844510y6D(C1844500y6C c1844500y6C, View view) {
        super(view);
        this.LLILZIL = c1844500y6C;
        this.LL = (C16F5) view.findViewById(R.id.zx6);
        this.LLILLJJLI = (C19RC) view.findViewById(R.id.lo9);
        this.LLILLL = (C19RC) view.findViewById(R.id.loa);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.lo_);
    }
}
