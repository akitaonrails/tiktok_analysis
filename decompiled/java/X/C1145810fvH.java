package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public /* synthetic */ class C1145810fvH extends C2217421BqW implements Function1<C1145820fvI, Unit> {
    public C1145810fvH(C1145480fuk c1145480fuk) {
        super(1, c1145480fuk, C1145480fuk.class, "report", "report(Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/audience/render/AudienceBoardRenderSnapshot;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1145820fvI c1145820fvI) throws JSONException {
        C1145820fvI c1145820fvI2 = c1145820fvI;
        this.receiver.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoration_audience_render");
        c474500IjALIZ.LJJII(String.valueOf(c1145820fvI2.LIZ), "board_id");
        c474500IjALIZ.LJJII(String.valueOf(c1145820fvI2.LIZIZ), "board_version");
        c474500IjALIZ.LJJII(String.valueOf(c1145820fvI2.LIZJ), "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(c1145820fvI2.LIZLLL), "room_id");
        c474500IjALIZ.LJJII(c1145820fvI2.LJ, "location");
        c474500IjALIZ.LJJII(Integer.valueOf(c1145820fvI2.LJFF), "application_result");
        List<C1145800fvG> list = c1145820fvI2.LJIIJ;
        JSONObject jSONObject = new JSONObject();
        for (C1145800fvG c1145800fvG : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c1145800fvG.LIZJ);
            jSONObject2.put("item_type", c1145800fvG.LIZIZ);
            jSONObject2.put("resource_download_time_ms", c1145800fvG.LIZLLL);
            Integer num = c1145800fvG.LJ;
            if (num != null) {
                jSONObject2.put("resource_error_code", num.intValue());
            }
            Integer num2 = c1145800fvG.LJFF;
            if (num2 != null) {
                jSONObject2.put("image_size", num2.intValue());
            }
            jSONObject.put(String.valueOf(c1145800fvG.LIZ), jSONObject2);
        }
        c474500IjALIZ.LJJII(C786410Ut5.J3(jSONObject), "board_item_status");
        c474500IjALIZ.LJJIII("image_fetch_success_ratio", Double.valueOf(c1145820fvI2.LJIIJJI));
        c474500IjALIZ.LJJIII("font_fetch_success_ratio", Double.valueOf(c1145820fvI2.LJIIL));
        c474500IjALIZ.LJJIII("text_item_render_success_ratio", Double.valueOf(c1145820fvI2.LJIILIIL));
        Long l = c1145820fvI2.LJI;
        if (l != null) {
            c474500IjALIZ.LJJII(Integer.valueOf((int) l.longValue()), "initial_render_duration");
        }
        Long l2 = c1145820fvI2.LJII;
        if (l2 != null) {
            c474500IjALIZ.LJJII(Integer.valueOf((int) l2.longValue()), "total_render_duration");
        }
        Integer num3 = c1145820fvI2.LJIIIIZZ;
        if (num3 != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num3.intValue()), "first_error_code");
        }
        String str = c1145820fvI2.LJIIIZ;
        if (str != null) {
            c474500IjALIZ.LJJII(str, "error_details");
        }
        Long l3 = c1145820fvI2.LJIILJJIL;
        if (l3 != null) {
            c474500IjALIZ.LJJII(Integer.valueOf((int) l3.longValue()), "early_exit_board_load_time");
        }
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
