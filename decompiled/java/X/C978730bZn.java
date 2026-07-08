package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bZn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978730bZn extends RecyclerView.ViewHolder {
    public final ConstraintLayout LL;
    public final C16F5 LLILLJJLI;
    public final TuxTag LLILLL;
    public final C16F5 LLILZ;
    public final C1324720kZq LLILZIL;
    public final C978720bZm LLILZLL;

    public C978730bZn(View view) {
        super(view);
        this.LL = (ConstraintLayout) view.findViewById(R.id.dxo);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.tv_title);
        this.LLILLL = (TuxTag) view.findViewById(R.id.zyy);
        this.LLILZ = (C16F5) view.findViewById(R.id.tv_rule_subtitle);
        this.LLILZIL = (C1324720kZq) view.findViewById(R.id.lto);
        this.LLILZLL = (C978720bZm) view.findViewById(R.id.cps);
    }
}
