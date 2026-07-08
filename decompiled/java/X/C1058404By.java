package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04By, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1058404By {
    public final /* synthetic */ SeaPdpFragment LIZ;

    public final View LIZ() {
        View view = this.LIZ.LLLIIIIL;
        if (view != null) {
            return view.findViewById(R.id.afo);
        }
        return null;
    }

    public final ViewGroup LIZIZ() {
        View view = this.LIZ.getView();
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.eqx);
        }
        return null;
    }

    public final int LIZJ() {
        return this.LIZ.FS().GR2();
    }

    public final RecyclerView LIZLLL() {
        View view = this.LIZ.getView();
        if (view != null) {
            return (RecyclerView) view.findViewById(R.id.t0h);
        }
        return null;
    }

    public C1058404By(SeaPdpFragment seaPdpFragment) {
        this.LIZ = seaPdpFragment;
    }
}
