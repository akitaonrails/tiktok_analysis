package X;

import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.data.EventModel;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.0h1T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1188090h1T implements Serializable {
    public Map<String, EventModel> events;
    public String poiId;
    public PoiListApi.PoiMergedListResponse poiInitPostModule;
    public C0TT3 poiPostBusinessType;
    public InterfaceC1181010gq3 poiSlashContainer;
    public final String typeLevel;

    public C1188090h1T() {
        this(null, null, null, null, null, null);
    }

    public final C1188090h1T copy(String str, String str2, Map<String, EventModel> map, InterfaceC1181010gq3 interfaceC1181010gq3, PoiListApi.PoiMergedListResponse poiMergedListResponse, C0TT3 c0tt3) {
        return new C1188090h1T(str, str2, map, interfaceC1181010gq3, poiMergedListResponse, c0tt3);
    }

    public final void setEvents(Map<String, EventModel> map) {
        this.events = map;
    }

    public final void setPoiId(String str) {
        this.poiId = str;
    }

    public final void setPoiInitPostModule(PoiListApi.PoiMergedListResponse poiMergedListResponse) {
        this.poiInitPostModule = poiMergedListResponse;
    }

    public final void setPoiPostBusinessType(C0TT3 c0tt3) {
        this.poiPostBusinessType = c0tt3;
    }

    public final void setPoiSlashContainer(InterfaceC1181010gq3 interfaceC1181010gq3) {
        this.poiSlashContainer = interfaceC1181010gq3;
    }

    public C1188090h1T(String str, String str2, Map<String, EventModel> map, InterfaceC1181010gq3 interfaceC1181010gq3, PoiListApi.PoiMergedListResponse poiMergedListResponse, C0TT3 c0tt3) {
        this.poiId = str;
        this.typeLevel = str2;
        this.events = map;
        this.poiSlashContainer = interfaceC1181010gq3;
        this.poiInitPostModule = poiMergedListResponse;
        this.poiPostBusinessType = c0tt3;
    }
}
