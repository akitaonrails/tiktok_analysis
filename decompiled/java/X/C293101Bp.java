package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: renamed from: X.01Bp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C293101Bp extends AbstractC293401Bs<Gift> {
    public final Gift LJJI;

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
    public final ImageModel LJIIIIZZ() {
        return ((Gift) this.LIZIZ).leftLogo;
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((Gift) this.LIZIZ).name;
    }

    @Override // X.AbstractC293401Bs
    public final int LJJIIJZLJL() {
        return ((Gift) this.LIZIZ).diamondCount;
    }

    public C293101Bp(Gift gift) {
        super(9, gift);
        this.LJJI = gift;
    }
}
