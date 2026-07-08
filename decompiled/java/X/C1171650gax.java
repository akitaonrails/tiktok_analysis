package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListChooseAssem;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171650gax extends RecyclerView.ViewHolder {
    public final /* synthetic */ CollectionListChooseAssem LL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1171650gax(CollectionListChooseAssem collectionListChooseAssem, ViewGroup viewGroup) {
        int i;
        boolean z;
        View viewFindViewById;
        this.LL = collectionListChooseAssem;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        collectionListChooseAssem.getClass();
        if (C0BKG.LIZ()) {
            i = R.layout.c6o;
        } else {
            i = R.layout.c6n;
        }
        super(C786410Ut5.Td(layoutInflaterNe, i, viewGroup, false));
        if (!C1336205Ku.LIZJ().LIZJ() && !C1336205Ku.LIZ(false).getImPrivacySettings().LJI()) {
            z = false;
        } else {
            z = true;
        }
        if (C1171750gb7.LIZIZ(z)) {
            if (C0BKG.LIZ() && (viewFindViewById = this.itemView.findViewById(R.id.cover)) != null) {
                C1378990lzN.LIZIZ(viewFindViewById, Float.valueOf(C418440Gaw.LIZIZ(4)), null, null, null, null, 30);
            }
            CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ();
            if (collaborativeCollectionConfigLIZJ != null && collaborativeCollectionConfigLIZJ.guideType == 1) {
                C1171870gbJ.LIZ.getClass();
                if (!C1171870gbJ.LIZ().getBoolean("collaborative_red_tag_", false)) {
                    ((TextView) this.itemView.findViewById(R.id.desc)).setText(2131847928);
                    View viewFindViewById2 = this.itemView.findViewById(R.id.x0r);
                    C786410Ut5.LJLLLLLL(0, viewFindViewById2);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
                    viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
                    C1171870gbJ.LIZ().storeBoolean("collaborative_red_tag_", true);
                }
            }
        }
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.desc);
        C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1208840hYw(tuxTextView, 0));
    }
}
