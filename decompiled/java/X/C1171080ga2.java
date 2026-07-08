package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ga2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171080ga2 extends RecyclerView.ViewHolder {
    public final ConstraintLayout LL;
    public final FrameLayout LLILLJJLI;
    public final /* synthetic */ CollectionContentAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1171080ga2(CollectionContentAssem collectionContentAssem, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c6l, viewGroup, false));
        this.LLILLL = collectionContentAssem;
        this.LL = (ConstraintLayout) this.itemView.findViewById(R.id.rc3);
        this.LLILLJJLI = (FrameLayout) this.itemView.findViewById(R.id.rcj);
    }
}
