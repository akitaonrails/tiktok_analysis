package X;

import android.net.Uri;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedbackVoteData;
import g1c.AjS1S1300000_1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.04Ho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1073004Ho {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    public static void LIZ(FeedbackVoteData feedbackVoteData, View view, ConstraintLayout constraintLayout, Map map) {
        Map mapLJ;
        boolean z;
        String str;
        PageFinder pageFinderVia = PageFinder.via(view);
        String str2 = feedbackVoteData.daInfo;
        if (str2 == null || (mapLJ = C1741890vQh.LJIIJ(str2)) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String str3 = feedbackVoteData.schema;
        if (str3 != null && !a0.LJJJIL(str3)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C786410Ut5.Y7(constraintLayout, null);
        } else {
            try {
                Uri uri = UriProtector.parse(feedbackVoteData.schema);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                linkedHashMap.putAll(mapLJ);
                linkedHashMap.put("module_zone", "review_entrance");
                feedbackVoteData = C956403oY.LIZ(uri, C1741890vQh.LJIIIIZZ(linkedHashMap)).toString();
                str = feedbackVoteData;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1019103yf.LIZ(EnumC1014603xw.ERR108, e, null);
                str = feedbackVoteData.schema;
            }
            C786410Ut5.I7(new AjS1S1300000_1(view, str, mapLJ, pageFinderVia, 1), constraintLayout);
        }
        C1748720vbi.LJI(constraintLayout, new C10515049h(), new AwS86S1000000_1(8), "c48189.d29438", pageFinderVia, new AwS115S1100000_1(mapLJ, 16));
    }
}
