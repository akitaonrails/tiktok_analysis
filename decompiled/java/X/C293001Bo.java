package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: renamed from: X.01Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C293001Bo extends AbstractC293401Bs<Gift> {
    @Override // X.AbstractC1126600fQI
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        return ((Gift) this.LIZIZ).describe;
    }

    @Override // X.AbstractC1126600fQI
    public final long LJI() {
        return ((Gift) this.LIZIZ).id;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        return ((Gift) this.LIZIZ).image;
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((Gift) this.LIZIZ).name;
    }

    @Override // X.AbstractC293401Bs
    public final int LJJIIJZLJL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    public C293001Bo(Gift gift) {
        super(22, gift);
    }
}
