package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0HkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewOnClickListenerC449880HkY extends RecyclerView.ViewHolder implements View.OnClickListener {
    public final ArrayList<TextView> LL;
    public final View LLILLJJLI;
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
            this.LLILLL.Kd(commentPersonalizedEmoji, 4, getBindingAdapterPosition());
        } else {
            this.LLILLL.Jd(2, getBindingAdapterPosition(), c451030HmP.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC449880HkY(View view, InterfaceC449820HkS interfaceC449820HkS, int i, Aweme aweme) {
        super(view);
        ArrayList<TextView> arrayList = new ArrayList<>();
        this.LL = arrayList;
        interfaceC449820HkS.LJIILIIL(aweme);
        this.LLILLL = interfaceC449820HkS;
        this.LLILZIL = i;
        arrayList.add(view.findViewById(R.id.h0p));
        arrayList.add(view.findViewById(R.id.h0q));
        arrayList.add(view.findViewById(R.id.h0r));
        View viewFindViewById = view.findViewById(R.id.gzu);
        this.LLILLJJLI = viewFindViewById;
        C786410Ut5.I7(this, viewFindViewById);
    }
}
