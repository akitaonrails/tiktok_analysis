package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.04GX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GX {
    public final /* synthetic */ PdpFragment LIZ;

    public final View LIZ() {
        View view = this.LIZ.LLLIILIL;
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
        return this.LIZ.JS().BR2();
    }

    public final RecyclerView LIZLLL() {
        View view = this.LIZ.getView();
        if (view != null) {
            return (RecyclerView) view.findViewById(R.id.t0h);
        }
        return null;
    }

    public C04GX(PdpFragment pdpFragment) {
        this.LIZ = pdpFragment;
    }
}
