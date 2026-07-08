package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.01AL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AL extends AbstractC1126600fQI<C292001Be> {
    public final AbstractC1126600fQI<? extends AnonymousClass0054> LJJI;
    public final String LJJIFFI;
    public final ImageModel LJJII;
    public int LJJIII;
    public long LJJIIJ;

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((C292001Be) this.LIZIZ).LIZ;
    }

    @Override // X.AbstractC1126600fQI
    public final long LJI() {
        return View.generateViewId();
    }

    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        return this.LJJIFFI;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        return this.LJJII;
    }

    public C01AL(C292001Be c292001Be, C01AG c01ag, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        super(c01ag.getHeaderType(), c292001Be);
        this.LJJI = abstractC1126600fQI;
        this.LJJIFFI = "";
        this.LJJII = new ImageModel();
    }
}
