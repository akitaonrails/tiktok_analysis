package X;

import android.content.Context;
import android.graphics.Color;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.ss.android.ugc.aweme.feed.model.AwemeLabelModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RZI, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RZI {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.view.View, android.widget.TextView, com.bytedance.tux.tag.TuxTag, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void LIZ(TuxTag tuxTag, List list, AwemeHybridLabelModel awemeHybridLabelModel) {
        ?? LIZ2;
        int iLIZ;
        AwemeLabelModel awemeLabelModel;
        ?? color = awemeHybridLabelModel.backgroundColor;
        String str = awemeHybridLabelModel.textColor;
        Context context = tuxTag.getContext();
        try {
            color = Color.parseColor(color);
            LIZ2 = color;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZJ("common_feed", 5, "privacy_tag", C786410Ut5.j4("parse background color failed & color: %s", Arrays.copyOf((Object[]) new Object[]{color}, 1)));
            LIZ2 = C960203pA.LIZ(R.attr.ee, context);
        }
        tuxTag.setTagBackgroundColor(LIZ2);
        if (Intrinsics.LJFF(str, "transparent")) {
            tuxTag.setTextColor(LIZ2);
        }
        String str2 = awemeHybridLabelModel.textColor;
        if (Intrinsics.LJFF(str2, "transparent")) {
            tuxTag.setHollow(true);
        } else {
            Context context2 = tuxTag.getContext();
            try {
                iLIZ = Color.parseColor(str2);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2276411E8h.LIZIZ.LIZJ("common_feed", 5, "privacy_tag", C786410Ut5.j4("parse text color failed & color: %s", Arrays.copyOf(new Object[]{str2}, 1)));
                iLIZ = C960203pA.LIZ(R.attr.ej, context2);
            }
            tuxTag.setHollow(false);
            tuxTag.setTagTextColor(iLIZ);
        }
        tuxTag.setText(awemeHybridLabelModel.text);
        UrlModel urlModel = awemeHybridLabelModel.imageUrl;
        Integer numValueOf = null;
        if (urlModel == null) {
            tuxTag.setTagIcon(null);
        } else {
            C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel)).LJJIIJ(new C738980Sym(tuxTag, 1));
        }
        if (list != null && (awemeLabelModel = (AwemeLabelModel) C13LP.LJJJLL(list)) != null) {
            numValueOf = Integer.valueOf(awemeLabelModel.getLabelType());
        }
        tuxTag.setTag(numValueOf);
    }
}
