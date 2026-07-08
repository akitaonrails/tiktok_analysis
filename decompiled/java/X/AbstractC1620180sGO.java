package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0sGO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1620180sGO<T> extends RecyclerView.ViewHolder implements InterfaceC1259900itI {
    public static final /* synthetic */ int LLILZ = 0;
    public Aweme LL;
    public SmartImageView LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC1259900itI
    public final void H() {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView == null || smartImageView.getController() == null || this.LLILLJJLI.getController().LIZ() == null) {
            return;
        }
        Animatable animatableLIZ = this.LLILLJJLI.getController().LIZ();
        if (animatableLIZ instanceof InterfaceC1316680kMs) {
            ((InterfaceC1316680kMs) animatableLIZ).LIZ();
        }
    }

    @Override // X.InterfaceC1259900itI
    public final void c1() {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            smartImageView.LJII();
        }
    }

    @Override // X.InterfaceC1259900itI
    public final void y4() {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            smartImageView.LJI();
        }
    }

    public static boolean N5() {
        if (C20595415iS.LIZIZ()) {
            return false;
        }
        boolean zLIZIZ = C0VO3.LIZIZ("profile_aweme_post_use_dynamic_cover", false);
        boolean z = ((Number) C1842707Jp.LIZ.getValue()).intValue() == 1;
        boolean z2 = C0BIW.LIZIZ;
        if (z || z2) {
            return zLIZIZ;
        }
        return true;
    }

    public boolean L5() {
        if (C20595415iS.LIZIZ()) {
            return false;
        }
        this.itemView.getContext();
        try {
            if (C036E.LIZ.LIZIZ() && !C0XJA.LIZ(this.itemView.getContext())) {
                return false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C01GW c01gw = C0BIW.LIZ;
        return C0VO3.LIZIZ("use_dynamic_cover", !((this instanceof C1620170sGN) ^ true) || !C0BIW.LIZJ);
    }

    @Override // X.InterfaceC1259900itI
    public final boolean b5() {
        return this.LLILLL;
    }

    public AbstractC1620180sGO(View view) {
        super(view);
    }

    public void LJLJJLL(boolean z) {
        this.LLILLJJLI.setAttached(z);
    }

    @Override // X.InterfaceC1259900itI
    public final void setUserVisibleHint(boolean z) {
        SmartImageView smartImageView = this.LLILLJJLI;
        if (smartImageView != null) {
            smartImageView.setUserVisibleHint(z);
        }
    }

    public final void I5(int i, Object obj) {
        this.LLILLJJLI.setUserVisibleHint(false);
    }
}
