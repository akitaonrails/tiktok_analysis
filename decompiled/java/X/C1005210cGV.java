package X;

import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0cGV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005210cGV implements Serializable {
    public final EnumC2007707tj btnIconType;
    public final PoiButton data;
    public final boolean isAdjustDone;
    public final boolean needReAdjust;

    public C1005210cGV() {
        this(null, null, false, false);
    }

    public final C1005210cGV copy(PoiButton poiButton, EnumC2007707tj enumC2007707tj, boolean z, boolean z2) {
        return new C1005210cGV(poiButton, enumC2007707tj, z, z2);
    }

    public final boolean isAdjustDone() {
        return this.isAdjustDone;
    }

    public C1005210cGV(PoiButton poiButton, EnumC2007707tj enumC2007707tj, boolean z, boolean z2) {
        this.data = poiButton;
        this.btnIconType = enumC2007707tj;
        this.isAdjustDone = z;
        this.needReAdjust = z2;
    }
}
