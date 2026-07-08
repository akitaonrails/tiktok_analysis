package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;

/* JADX INFO: renamed from: X.012c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2684012c extends AbstractC1126600fQI<Gift> {
    @Override // X.AbstractC1126600fQI
    public final String LIZJ() {
        String str = ((Gift) this.LIZIZ).describe;
        return str == null ? "red envelope" : str;
    }

    @Override // X.AbstractC1126600fQI
    public final long LJI() {
        return ((Gift) this.LIZIZ).id;
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJII() {
        ImageModel imageModel = ((Gift) this.LIZIZ).image;
        if (imageModel != null) {
            return imageModel;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC1126600fQI
    public final ImageModel LJIIIIZZ() {
        return ((Gift) this.LIZIZ).leftLogo;
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIIZ() {
        return ((Gift) this.LIZIZ).name;
    }

    @Override // X.AbstractC1126600fQI
    public final String LJIIJ() {
        String str;
        Gift.SchemeInfo schemeInfo = ((Gift) this.LIZIZ).schemeInfo;
        return (schemeInfo == null || (str = schemeInfo.schemeUrl) == null) ? "" : str;
    }

    public C2684012c(Gift gift) {
        super(10, gift);
    }
}
