package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListChooseAssem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171630gav extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public CollectionDetail LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ CollectionListChooseAssem LLIZ;

    public final void I5(String str) {
        String str2;
        String string;
        Integer num;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLIZ.Go().LLILZLL);
        c2344009Gk.LJIIIIZZ("enter_method", this.LLIZ.Go().LLIZ);
        CollectionDetail collectionDetail = this.LLILZIL;
        String str3 = null;
        if (collectionDetail != null) {
            str2 = collectionDetail.id;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("collection_id", str2);
        CollectionDetail collectionDetail2 = this.LLILZIL;
        if (collectionDetail2 != null) {
            str3 = collectionDetail2.name;
        }
        c2344009Gk.LJIIIIZZ("collection_name", str3);
        CollectionDetail collectionDetail3 = this.LLILZIL;
        if (collectionDetail3 == null || (num = collectionDetail3.type) == null || (string = num.toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("system_collection_type", string);
        c2344009Gk.LIZJ(this.LLILZLL, "order");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1171630gav(CollectionListChooseAssem collectionListChooseAssem, ViewGroup viewGroup) {
        this.LLIZ = collectionListChooseAssem;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        collectionListChooseAssem.getClass();
        super(C786410Ut5.Td(layoutInflaterNe, R.layout.c6u, viewGroup, false));
        C2211751BhN.LIZ(this.itemView, new C1209080hZK(this, viewGroup, collectionListChooseAssem, 1));
        this.LL = (TextView) this.itemView.findViewById(R.id.p09);
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.videos);
        this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.k1x);
    }
}
