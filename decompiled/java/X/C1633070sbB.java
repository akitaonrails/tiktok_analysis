package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.verify.FwhcLeftSidebarI2iRecallAB;
import com.ss.android.ugc.aweme.verify.FwhcLeftSidebarSelectedRecallAB;
import java.util.Map;

/* JADX INFO: renamed from: X.0sbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1633070sbB {
    public final Map<String, String> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C1633070sbB(Map map) {
        C296610Bjv.LIZ.getClass();
        boolean zLIZ = C296610Bjv.LIZ();
        boolean zIsEnabled = FwhcLeftSidebarI2iRecallAB.isEnabled();
        boolean zIsEnabled2 = FwhcLeftSidebarSelectedRecallAB.isEnabled();
        this.LIZ = map;
        this.LIZIZ = zLIZ;
        this.LIZJ = zIsEnabled;
        this.LIZLLL = zIsEnabled2;
    }

    public final Map<String, String> LIZ(Map<String, String> map) {
        C13DA c13da = new C13DA();
        c13da.putAll(this.LIZ);
        c13da.putAll(map);
        c13da.put("trending", "1");
        c13da.put("category", "default");
        c13da.put("panel", "default");
        c13da.put("count", CardStruct.IStatusCode.DEFAULT);
        c13da.put("cursor", CardStruct.IStatusCode.DEFAULT);
        c13da.put("has_category_effects", "true");
        if (this.LIZIZ) {
            c13da.put("effect_recommend_scenario", "1");
        }
        if (this.LIZJ) {
            c13da.put("fwhc_left_sidebar_i2i_recall", "true");
        }
        if (this.LIZLLL) {
            c13da.put("fwhc_left_sidebar_selected_recall", "true");
        }
        return c13da.build();
    }
}
