package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gaK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171260gaK extends RecyclerView.ViewHolder {
    public final CardView LL;
    public final TextView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final TuxIconView LLILZLL;
    public final /* synthetic */ CollectionListMainUIAssem LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171260gaK(CollectionListMainUIAssem collectionListMainUIAssem, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6m, viewGroup, false));
        this.LLIZ = collectionListMainUIAssem;
        this.LL = (CardView) this.itemView.findViewById(R.id.dgb);
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.p09);
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILZ = this.itemView.findViewById(R.id.h2z);
        this.LLILZIL = this.itemView.findViewById(R.id.k30);
        this.LLILZLL = (TuxIconView) this.itemView.findViewById(R.id.e5t);
    }
}
