package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnClickListenerC449870HkX extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final View LL;
    public final TextView LLILLJJLI;
    public final InterfaceC449820HkS LLILLL;
    public C451030HmP LLILZ;
    public final int LLILZIL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CommentPersonalizedEmoji commentPersonalizedEmoji;
        C451030HmP c451030HmP = this.LLILZ;
        if (c451030HmP == null) {
            return;
        }
        if (this.LLILZIL == 2 && (commentPersonalizedEmoji = c451030HmP.LJII) != null) {
            this.LLILLL.Kd(commentPersonalizedEmoji, 2, getBindingAdapterPosition());
        } else {
            this.LLILLL.Jd(2, getBindingAdapterPosition(), c451030HmP.LIZIZ);
        }
    }

    public ViewOnClickListenerC449870HkX(View view, InterfaceC449820HkS interfaceC449820HkS, int i, int i2, int i3, Aweme aweme) {
        super(view);
        interfaceC449820HkS.LJIILIIL(aweme);
        View viewFindViewById = view.findViewById(R.id.gzu);
        this.LL = viewFindViewById;
        TextView textView = (TextView) view.findViewById(R.id.h0o);
        this.LLILLJJLI = textView;
        this.LLILLL = interfaceC449820HkS;
        this.LLILZIL = i3;
        C786410Ut5.I7(this, viewFindViewById);
        C427690Gpr.LJI(viewFindViewById, null);
        if (i > 0) {
            textView.getLayoutParams().height = i;
            textView.getLayoutParams().width = i;
        }
        if (i2 > 0) {
            textView.setTextSize(0, i2);
        }
    }
}
