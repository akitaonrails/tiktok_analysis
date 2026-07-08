package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.01AY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01AY extends AbstractC1126600fQI<C292001Be> {
    public final ImageModel LJJI;

    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        return "";
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((C292001Be) this.LIZIZ).LIZ;
    }

    @Override // X.AbstractC1126600fQI
    public final long LJI() {
        return View.generateViewId();
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        return this.LJJI;
    }

    public C01AY(C292001Be c292001Be) {
        super(20, c292001Be);
        this.LJJI = new ImageModel();
    }
}
