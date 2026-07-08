package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0giP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176270giP implements Serializable {
    public final MapBounds mapWindow;
    public final Integer recallType;
    public final EnumC1176260giO updateScene;

    public C1176270giP() {
        this(null, null, null);
    }

    public int hashCode() {
        Integer num = this.recallType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        EnumC1176260giO enumC1176260giO = this.updateScene;
        int iHashCode2 = (iHashCode + (enumC1176260giO == null ? 0 : enumC1176260giO.hashCode())) * 31;
        MapBounds mapBounds = this.mapWindow;
        return iHashCode2 + (mapBounds != null ? mapBounds.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MapDetailCardFeedApiRequest(recallType=");
        sbLIZ.append(this.recallType);
        sbLIZ.append(", updateScene=");
        sbLIZ.append(this.updateScene);
        sbLIZ.append(", mapWindow=");
        sbLIZ.append(this.mapWindow);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1176270giP(Integer num, EnumC1176260giO enumC1176260giO, MapBounds mapBounds) {
        this.recallType = num;
        this.updateScene = enumC1176260giO;
        this.mapWindow = mapBounds;
    }
}
