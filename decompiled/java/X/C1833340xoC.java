package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833340xoC extends RecyclerView.ViewHolder {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final /* synthetic */ C1833330xoB LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833340xoC(C1833330xoB c1833330xoB, View view) {
        super(view);
        this.LLILZ = c1833330xoB;
        this.LL = (C16F5) view.findViewById(R.id.zp1);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.tv_rank_num);
        this.LLILLL = (C16F5) view.findViewById(R.id.tv_post_num);
    }
}
