package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839140xxY extends RecyclerView.ViewHolder {
    public final View LL;
    public final LifecycleOwner LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxTag LLIZLLLIL;
    public final C197039127h LLJ;
    public final TuxIconView LLJI;
    public final View LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final Animation LLJILJILJ;

    public C1839140xxY(View view, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.sxd);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.sxk);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.sx_);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.sxj);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.sxb);
        this.LLIZLLLIL = (TuxTag) this.itemView.findViewById(R.id.sx9);
        this.LLJ = (C197039127h) this.itemView.findViewById(R.id.sxi);
        this.LLJI = (TuxIconView) this.itemView.findViewById(R.id.sxg);
        this.LLJIJIL = this.itemView.findViewById(R.id.sxe);
        this.LLJILJIL = C1BNE.LIZ(-1);
        this.LLJILJILJ = AnimationUtils.loadAnimation(view.getContext(), R.anim.a1);
        this.itemView.getLayoutParams().width = C814420VxA.LIZ(((double) this.itemView.getContext().getResources().getDisplayMetrics().widthPixels) * 0.885d);
    }
}
