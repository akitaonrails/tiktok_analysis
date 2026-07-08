package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171220gaG extends RecyclerView.ViewHolder {
    public final boolean LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final C197039127h LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public long LLIZLLLIL;
    public final /* synthetic */ CollectionContentAssem LLJ;

    public C1171220gaG() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1171220gaG(CollectionContentAssem collectionContentAssem, ViewGroup viewGroup) {
        boolean z;
        int i;
        if (!C1171750gb7.LIZ() && !C1171200gaE.LIZ()) {
            z = false;
        } else {
            z = true;
        }
        this.LLJ = collectionContentAssem;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (z) {
            i = R.layout.c6j;
        } else {
            i = R.layout.c6r;
        }
        super(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
        this.LL = z;
        this.LLILLJJLI = (TextView) this.itemView.findViewById(R.id.e7v);
        this.LLILLL = (TextView) this.itemView.findViewById(R.id.e82);
        this.LLILZ = (C197039127h) this.itemView.findViewById(R.id.crx);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.z_i);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.z_j);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.e7u);
    }
}
