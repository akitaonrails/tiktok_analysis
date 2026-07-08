package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761570Tu7 extends RecyclerView.ViewHolder {
    public final ImageView LL;
    public final View LLILLJJLI;
    public final View LLILLL;
    public final View LLILZ;
    public final TextView LLILZIL;
    public final View LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;

    public C761570Tu7(View view) {
        super(view);
        this.LL = (ImageView) view.findViewById(R.id.lkw);
        this.LLILLJJLI = view.findViewById(R.id.jyo);
        this.LLILLL = view.findViewById(R.id.lf8);
        this.LLILZ = view.findViewById(R.id.nl1);
        this.LLILZIL = (TextView) view.findViewById(R.id.tv_voice_effect_title);
        this.LLILZLL = view.findViewById(R.id.lo0);
        this.LLIZ = view.findViewById(R.id.by7);
        this.LLIZLLLIL = view.findViewById(R.id.l3k);
    }

    public final void I5(boolean z) {
        int iLIZLLL;
        TextView textView = this.LLILZIL;
        if (z) {
            iLIZLLL = C497740JfY.LIZLLL(R.attr.eu5, this.itemView.getContext());
        } else {
            iLIZLLL = C497740JfY.LIZLLL(R.attr.c9i, this.itemView.getContext());
        }
        textView.setTextColor(iLIZLLL);
        C500260Jjc.LJLJLJ(this.LLIZ, z);
        if (z) {
            this.LLILZIL.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.LLILZIL.setSelected(true);
        } else {
            this.LLILZIL.setEllipsize(TextUtils.TruncateAt.END);
            this.LLILZIL.setSelected(false);
        }
    }
}
