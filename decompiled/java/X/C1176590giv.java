package X;

import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0giv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176590giv implements Serializable {
    public final String centerPoiId;
    public final PoiLocation centerPoiLocation;
    public final String centerPoiName;

    public C1176590giv() {
        this(null, null, null);
    }

    public C1176590giv(PoiLocation poiLocation, String str, String str2) {
        this.centerPoiLocation = poiLocation;
        this.centerPoiId = str;
        this.centerPoiName = str2;
    }
}
