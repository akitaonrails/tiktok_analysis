package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x9M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808020x9M extends RecyclerView.ViewHolder {
    public final RadiusLayout LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final C1324720kZq LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public ValueAnimator LLIZLLLIL;
    public final /* synthetic */ C1808010x9L LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808020x9M(C1808010x9L c1808010x9L, View view) {
        super(view);
        this.LLJ = c1808010x9L;
        this.LL = (RadiusLayout) view.findViewById(R.id.dg1);
        this.LLILLJJLI = view.findViewById(R.id.pbi);
        this.LLILLL = view.findViewById(R.id.um5);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.klh);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.kli);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.umo);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.um7);
    }
}
