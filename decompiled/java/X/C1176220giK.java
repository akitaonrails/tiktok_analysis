package X;

import com.ss.android.ugc.aweme.placediscovery.param.MapBounds;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterOption;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: X.0giK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176220giK implements Serializable {
    public final String centerPoiId;
    public final List<PoiFeedFilterOption> filterOptionList;
    public final String fromPoiId;
    public final Boolean isUserSelectWindow;
    public final int limit;
    public final C1175660ghQ mapCategoryStatus;
    public final MapBounds mapWindow;
    public final int page;
    public final Integer recallRadius;
    public final Integer recallType;
    public final EnumC1175760gha scene;

    public C1176220giK() {
        this(1, 40, null, null, null, null, null, null, null, null, null);
    }

    public int hashCode() {
        int i = ((this.page * 31) + this.limit) * 31;
        EnumC1175760gha enumC1175760gha = this.scene;
        int iHashCode = (i + (enumC1175760gha == null ? 0 : enumC1175760gha.hashCode())) * 31;
        MapBounds mapBounds = this.mapWindow;
        int iHashCode2 = (iHashCode + (mapBounds == null ? 0 : mapBounds.hashCode())) * 31;
        String str = this.centerPoiId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fromPoiId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.recallType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.recallRadius;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C1175660ghQ c1175660ghQ = this.mapCategoryStatus;
        int iHashCode7 = (iHashCode6 + (c1175660ghQ == null ? 0 : c1175660ghQ.hashCode())) * 31;
        List<PoiFeedFilterOption> list = this.filterOptionList;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isUserSelectWindow;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "PoiMapDetailRequestData(page=" + this.page + ", limit=" + this.limit + ", scene=" + this.scene + ", mapWindow=" + this.mapWindow + ", centerPoiId=" + this.centerPoiId + ", fromPoiId=" + this.fromPoiId + ", recallType=" + this.recallType + ", recallRadius=" + this.recallRadius + ", mapCategoryStatus=" + this.mapCategoryStatus + ", filterOptionList=" + this.filterOptionList + ", isUserSelectWindow=" + this.isUserSelectWindow + ')';
    }

    public final Boolean isUserSelectWindow() {
        return this.isUserSelectWindow;
    }

    public C1176220giK(int i, int i2, EnumC1175760gha enumC1175760gha, MapBounds mapBounds, String str, String str2, Integer num, Integer num2, C1175660ghQ c1175660ghQ, List<PoiFeedFilterOption> list, Boolean bool) {
        this.page = i;
        this.limit = i2;
        this.scene = enumC1175760gha;
        this.mapWindow = mapBounds;
        this.centerPoiId = str;
        this.fromPoiId = str2;
        this.recallType = num;
        this.recallRadius = num2;
        this.mapCategoryStatus = c1175660ghQ;
        this.filterOptionList = list;
        this.isUserSelectWindow = bool;
    }
}
