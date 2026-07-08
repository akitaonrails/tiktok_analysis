package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixTabAssem;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.data.PoiDetailApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187310h0D extends C09AY implements Function2<UIAssem, PoiDetailApi.PoiMultiMediumTab, Unit> {
    public final /* synthetic */ PoiAlbumMixTabAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1187310h0D(PoiAlbumMixTabAssem poiAlbumMixTabAssem) {
        super(2);
        this.LL = poiAlbumMixTabAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab) {
        String tabCode;
        String tabCode2;
        PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab2 = poiMultiMediumTab;
        Object obj = null;
        if (poiMultiMediumTab2 != null && (tabCode = poiMultiMediumTab2.getTabCode()) != null) {
            PoiDetailApi.PoiMultiMediumTab poiMultiMediumTab3 = this.LL.LLJILLL;
            if (poiMultiMediumTab3 != null) {
                tabCode2 = poiMultiMediumTab3.getTabCode();
            } else {
                tabCode2 = null;
            }
            if (!Intrinsics.LJFF(tabCode2, tabCode)) {
                Iterator it2 = ((LinkedHashMap) this.LL.LLJILJILJ).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.LJFF(((PoiDetailApi.PoiMultiMediumTab) ((Map.Entry) next).getValue()).getTabCode(), tabCode)) {
                        obj = next;
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry != null) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    this.LL.LLJILLL = (PoiDetailApi.PoiMultiMediumTab) entry.getValue();
                    C1203130hPj c1203130hPj = this.LL.LLIZLLLIL;
                    if (c1203130hPj != null) {
                        c1203130hPj.LIZ(iIntValue, true, C1203200hPq.LIZ);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
