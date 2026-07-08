package X;

import com.bytedance.android.livesdk.livesetting.game.SmartGameAnchorAiStrategyControlConfigSetting;
import com.ss.android.ugc.aweme.ml.ab.SmartGameAnchorAIStrategyExperiment;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: renamed from: X.152D, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C152D {
    public static final ConcurrentLinkedDeque<C152G> LIZ = new ConcurrentLinkedDeque<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C152H());
    public static int LIZJ;

    public static void LIZ() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C152G c152g : LIZ) {
            arrayList.add(c152g.LIZ);
            arrayList3.add(Integer.valueOf(c152g.LIZIZ ? 1 : 0));
            arrayList2.add(Integer.valueOf(c152g.LIZJ ? 1 : 0));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setFeature, aidList: ");
        sbLIZ.append(arrayList);
        sbLIZ.append(", clickedList: ");
        sbLIZ.append(arrayList3);
        sbLIZ.append(", showList: ");
        sbLIZ.append(arrayList2);
        C20441214yg.LIZIZ("GameAnchorAiStrategyManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZIZ().getClass();
        C152E.LIZ(arrayList, "g_ttgp_anchor_aid");
        LIZIZ().getClass();
        C152E.LIZ(arrayList3, "g_ttgp_anchor_clicked");
        LIZIZ().getClass();
        C152E.LIZ(arrayList2, "g_ttgp_anchor_show");
    }

    public static C152E LIZIZ() {
        return (C152E) LIZIZ.getValue();
    }

    public static void LIZJ(int i, String str, boolean z, boolean z2, boolean z3, SmartGameAnchorAiStrategyControlConfigSetting.AnchorStrategyConfig anchorStrategyConfig, boolean z4, boolean z5, double d, double d2, long j, String str2) {
        boolean z6;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_ttgp_anchor_ai_strategy_track");
        c474500IjALIZ.LJJII(Boolean.valueOf(z4), "should_show");
        c474500IjALIZ.LJJII(str2, "track_stage");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "anchor_id");
        c474500IjALIZ.LJJII(str, "item_id");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_publisher_video");
        c474500IjALIZ.LJJII(Boolean.valueOf(z2), "ctr_filter_enable");
        c474500IjALIZ.LJJII(Boolean.valueOf(z5), "infer_success");
        c474500IjALIZ.LJJIII("infer_score", Double.valueOf(Math.round(d * 1000.0d) / 1000.0d));
        c474500IjALIZ.LJJIII("infer_score_threshold", Double.valueOf(Math.round(d2 * 1000.0d) / 1000.0d));
        c474500IjALIZ.LJJII(Long.valueOf(j), "infer_duration");
        c474500IjALIZ.LJJII(Boolean.FALSE, "infer_timeout");
        boolean z7 = false;
        c474500IjALIZ.LJJII(0, "infer_error_code");
        c474500IjALIZ.LJJII(SmartGameAnchorAIStrategyExperiment.SCENE, "infer_business_name");
        if (anchorStrategyConfig != null) {
            z6 = anchorStrategyConfig.enableInfer;
        } else {
            z6 = false;
        }
        c474500IjALIZ.LJJII(Boolean.valueOf(z6), "enable_infer");
        if (anchorStrategyConfig != null) {
            z7 = anchorStrategyConfig.enableInferGIP;
        }
        c474500IjALIZ.LJJII(Boolean.valueOf(z7), "enable_infer_gip");
        c474500IjALIZ.LJJII(Boolean.valueOf(z3), "is_ctr_feature_valid");
        c474500IjALIZ.LIZ();
    }
}
