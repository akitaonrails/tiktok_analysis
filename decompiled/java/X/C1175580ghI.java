package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiCardAiSummary;
import com.ss.android.ugc.aweme.poi.mapmode.model.Location;

/* JADX INFO: renamed from: X.0ghI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175580ghI {
    public final Location LIZ;
    public final PoiCardAiSummary LIZIZ;
    public final boolean LIZJ;

    public C1175580ghI() {
        this(null, null, false);
    }

    public final int hashCode() {
        Location location = this.LIZ;
        int iHashCode = (location == null ? 0 : location.hashCode()) * 31;
        PoiCardAiSummary poiCardAiSummary = this.LIZIZ;
        return ((iHashCode + (poiCardAiSummary != null ? poiCardAiSummary.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public C1175580ghI(Location location, PoiCardAiSummary poiCardAiSummary, boolean z) {
        this.LIZ = location;
        this.LIZIZ = poiCardAiSummary;
        this.LIZJ = z;
    }
}
