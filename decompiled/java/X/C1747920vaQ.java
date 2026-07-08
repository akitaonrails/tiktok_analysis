package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1747920vaQ extends C04CK {
    public static final /* synthetic */ int LJIIJJI = 0;

    public C1747920vaQ() {
        super("rd_tiktokec_product_detail_request_result", "lib_track_builtin_lane_rd");
    }

    @Override // X.AbstractC1748790vbp
    public final C1748850vbv LIZ() {
        return new C1748850vbv(new C1748840vbu("page_name", new C1747940vaS[0]), new C1748840vbu("task_type", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("is_v2", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("product_type", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("error_message", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("is_retry", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("template", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("entrance_info", new C1747940vaS[0]), new C1748840vbu("ask_enter_from", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("action_type", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("enter_method", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("enter_from_merge", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("enter_from_info", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("follow_status", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("is_ad", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("author_id", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("product_id", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("product_id", new C1747940vaS(new C1748000vaY("", ""))), new C1748840vbu("start_click_to_now", new C1747940vaS[0]), new C1748840vbu("source", new C1747940vaS[0]), new C1748840vbu("source_from", new C1747940vaS[0]), new C1748840vbu("product_source", new C1747940vaS[0]), new C1748840vbu("api_duration", new C1747940vaS[0]), new C1748840vbu("error_code", new C1747940vaS[0]), new C1748840vbu("is_success", new C1747940vaS[0]), new C1748840vbu("preload_type", new C1747940vaS[0]));
    }

    @Override // X.C04CK, X.AbstractC1748750vbl
    public final void LJI(LaneParams laneParams) {
        if (Intrinsics.LJFF(laneParams.get("is_success"), "no")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PDP_requestFailed: ErrCode ");
            sbLIZ.append(laneParams.get("error_code"));
            sbLIZ.append(" ErrMsg ");
            sbLIZ.append(laneParams.get("error_message"));
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
