package X;

import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gi7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176090gi7 implements Serializable {
    public final PoiLocation centerPoi;
    public final String poiName;

    public C1176090gi7() {
        this(null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176090gi7)) {
            return false;
        }
        C1176090gi7 c1176090gi7 = (C1176090gi7) obj;
        return Intrinsics.LJFF(this.centerPoi, c1176090gi7.centerPoi) && Intrinsics.LJFF(this.poiName, c1176090gi7.poiName);
    }

    public C1176090gi7(PoiLocation poiLocation, String str) {
        this.centerPoi = poiLocation;
        this.poiName = str;
    }
}
