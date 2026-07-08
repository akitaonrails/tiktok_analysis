package X;

import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196990hFp extends C09AY implements Function1<PoiSubTag, Boolean> {
    public final /* synthetic */ C1196950hFl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1196990hFp(C1196950hFl c1196950hFl) {
        super(1);
        this.LL = c1196950hFl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PoiSubTag poiSubTag) {
        String str;
        String string;
        PoiSubTag poiSubTag2 = poiSubTag;
        Map<String, String> map = PoiCoreConfig.LIZ.poiAnchorSubTagFrequencyMap;
        String str2 = null;
        if (map != null) {
            Integer num = poiSubTag2.type;
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            str = map.get(string);
        } else {
            str = null;
        }
        C1197010hFr c1197010hFr = C1197010hFr.LIZ;
        PoiDataStruct poiDataStruct = this.LL.LLJJJJJIL;
        if (poiDataStruct != null) {
            str2 = poiDataStruct.poiId;
        }
        c1197010hFr.getClass();
        boolean z = false;
        if (str2 != null && str != null) {
            if (C1197010hFr.LIZIZ.get(C1197010hFr.LIZ(str2, str)) != null) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
