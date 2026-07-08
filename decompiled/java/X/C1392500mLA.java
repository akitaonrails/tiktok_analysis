package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392500mLA extends C09AY implements Function1<C1361910lXp, Unit> {
    public final /* synthetic */ C1392530mLD LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392500mLA(C1392530mLD c1392530mLD) {
        super(1);
        this.LL = c1392530mLD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1361910lXp c1361910lXp) throws JSONException {
        Map<String, String> mapInvoke;
        String keyword;
        String str;
        Aweme awemeLJJLIIIJJIZ;
        Function0<? extends Map<String, String>> function0;
        C1361910lXp c1361910lXp2 = c1361910lXp;
        InterfaceC712540RxE host = c1361910lXp2.getHost();
        if (host != null && (host instanceof InterfaceC1393560mMs)) {
            InterfaceC1393560mMs interfaceC1393560mMs = (InterfaceC1393560mMs) host;
            C2344009Gk c2344009GkLJIIIZ = this.LL.LJIIIZ(interfaceC1393560mMs, c1361910lXp2.LIZLLL);
            C1400390mXt anchorMobConfiguration = interfaceC1393560mMs.getAnchorMobConfiguration();
            if (anchorMobConfiguration != null && (function0 = anchorMobConfiguration.LIZJ) != null) {
                mapInvoke = function0.invoke();
            } else {
                mapInvoke = null;
            }
            c2344009GkLJIIIZ.LJII(mapInvoke);
            c2344009GkLJIIIZ.LJIIIIZZ("click_method", c1361910lXp2.LIZJ);
            AnchorCommonStruct anchorCommonStructData = interfaceC1393560mMs.data();
            if (anchorCommonStructData != null) {
                keyword = anchorCommonStructData.getKeyword();
            } else {
                keyword = null;
            }
            c2344009GkLJIIIZ.LJIIIIZZ("anchor_entry", keyword);
            c2344009GkLJIIIZ.LJIIIIZZ("click_type", interfaceC1393560mMs.LJIIJ());
            Map<String, String> map = c2344009GkLJIIIZ.LIZ;
            if (map != null) {
                str = (String) ((HashMap) map).get("enter_from");
            } else {
                str = null;
            }
            C1205210hT5.LIZ(null, map, str, "multi_anchor_entrance_show");
            JSONObject jSONObjectLIZJ = C1065330dpT.LIZJ(map);
            if (jSONObjectLIZJ != null) {
                C735840Sti c735840Sti = C735840Sti.LIZ;
                InterfaceC1392640mLO interfaceC1392640mLO = this.LL.LL;
                if (interfaceC1392640mLO != null) {
                    awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
                } else {
                    awemeLJJLIIIJJIZ = null;
                }
                c735840Sti.getClass();
                C735840Sti.LIZIZ(awemeLJJLIIIJJIZ, jSONObjectLIZJ);
            }
            if (C729510SjV.LJJIJIL(this.LL.LL.LJJLIIIJJIZ()) && jSONObjectLIZJ != null) {
                C735840Sti c735840Sti2 = C735840Sti.LIZ;
                String strCf = this.LL.LL.Cf();
                Activity activityLIZIZ = this.LL.LL.LIZIZ();
                c735840Sti2.getClass();
                jSONObjectLIZJ.put("enter_position", C735840Sti.LJIIJ(activityLIZIZ, strCf, null));
            }
            if (C123100dR.LIZ(this.LL.LLILZ) && jSONObjectLIZJ != null) {
                jSONObjectLIZJ.put("relation_enter_method", this.LL.LLILZ);
            }
            this.LL.LJIIJ(jSONObjectLIZJ);
            C20684815ws.LJIJ("enter_multi_anchor_detail", jSONObjectLIZJ);
        }
        return Unit.LIZ;
    }
}
