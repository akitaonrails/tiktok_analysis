package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1170790gZZ extends RecyclerView.ViewHolder {
    public final /* synthetic */ CollectionListMainUIAssem LL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1170790gZZ(CollectionListMainUIAssem collectionListMainUIAssem, ViewGroup viewGroup) {
        int i;
        this.LL = collectionListMainUIAssem;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        collectionListMainUIAssem.getClass();
        if (C295040BhO.LIZ() && Intrinsics.LJFF(collectionListMainUIAssem.Go().LLILLL, "personal_homepage")) {
            i = R.layout.c6q;
        } else {
            i = R.layout.c6p;
        }
        super(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
    }
}
