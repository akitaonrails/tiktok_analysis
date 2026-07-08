package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.tux.input.TuxTextView;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import tikcast.api.boost.Card;
import tikcast.api.boost.ConsumeCardResponse;

/* JADX INFO: renamed from: X.01zo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C516601zo implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
        }
    }

    public static final void accept$0(C516601zo c516601zo, Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.requestGetCountDownForAllContentInternal$2");
        String strLJIIIIZZ = ((C01IS) c516601zo.l1).LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestGetCountDownForAllContentInternal successfully, source: ");
        sbLIZ.append(c516601zo.s0);
        C20441214yg.LJIIIZ(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) c516601zo.l2;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.requestGetCountDownForAllContentInternal$2");
    }

    public static final void accept$1(C516601zo c516601zo, Object obj) {
        C1C7U.LIZ("BaseCountDownForAllV2Model@d337.requestGetCountDownForAllContentInternal$3");
        String strLJIIIIZZ = ((C01IS) c516601zo.l1).LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestGetCountDownForAllContentInternal failure, source: ");
        sbLIZ.append(c516601zo.s0);
        C20441214yg.LJIIIZ(strLJIIIIZZ, C2188811AlT.LIZIZ(sbLIZ));
        Function1 function1 = (Function1) c516601zo.l2;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C1C7U.LIZIZ("BaseCountDownForAllV2Model@d337.requestGetCountDownForAllContentInternal$3");
    }

    public static final void accept$2(C516601zo c516601zo, Object obj) {
        C1C7U.LIZ("ReplayUtil@64b2.requestRemux$1");
        Integer num = (Integer) c516601zo.l1;
        if (num != null && num.intValue() > 3600) {
            C766270U4b.LIZLLL(2131842550);
        }
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(c516601zo.s0, "");
        c20337914i1.LJFF(mapLIZIZ);
        ((Function1) c516601zo.l2).invoke(1);
        C1C7U.LIZIZ("ReplayUtil@64b2.requestRemux$1");
    }

    public static final void accept$3(C516601zo c516601zo, Object obj) {
        C1C7U.LIZ("ReplayUtil@64b2.requestTranscode$1");
        Integer num = (Integer) c516601zo.l1;
        if (num != null && num.intValue() > 3600) {
            C766270U4b.LIZLLL(2131842550);
        }
        C20337914i1<Map<String, String>> c20337914i1 = InterfaceC1833600xoc.ya;
        Map<String, String> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(c516601zo.s0, "");
        c20337914i1.LJFF(mapLIZIZ);
        ((Function1) c516601zo.l2).invoke(1);
        C1C7U.LIZIZ("ReplayUtil@64b2.requestTranscode$1");
    }

    public static final void accept$4(C516601zo c516601zo, Object obj) {
        C1C7U.LIZ("RemoveTemplateApi@60ba.requestRemoveTemplate$1");
        ((Function0) c516601zo.l1).invoke();
        Activity activityLIZ = C1388190mED.LIZ((Context) c516601zo.l2);
        if (activityLIZ != null) {
            String string = c516601zo.s0;
            Context context = (Context) c516601zo.l2;
            if (string == null) {
                string = context.getString(2131821915);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("RemoveTemplateApi@60ba.requestRemoveTemplate$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(C516601zo c516601zo, Object obj) throws JSONException {
        String str;
        int i;
        C1C7U.LIZ("LiveCenterPropsCard@c17f.showFlareConfirmDialog$dialogBuilder$2$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("data:");
        sbLIZ.append(C1516000pYM.LIZJ(baseResponse.data));
        C20441214yg.LIZIZ("LiveCenterProp", C2188811AlT.LIZIZ(sbLIZ));
        if (baseResponse.data != 0) {
            JSONObject jSONObject = new JSONObject();
            String str2 = c516601zo.s0;
            Long l = (Long) c516601zo.l1;
            C1AHK c1ahk = (C1AHK) c516601zo.l2;
            jSONObject.put("boost_end_time", (int) ((ConsumeCardResponse.Data) baseResponse.data).boostEndTime);
            jSONObject.put("image_path", str2);
            jSONObject.put("card_id", l.toString());
            Card card = c1ahk.LJ;
            if (card == null || (str = card.taskId) == null) {
                str = "";
            }
            jSONObject.put("task_id", str);
            Card card2 = c1ahk.LJ;
            if (card2 != null) {
                i = card2.taskSource;
            } else {
                i = 0;
            }
            jSONObject.put("task_source", i);
            C389001fE.LIZ("live_boost_use_card", jSONObject, System.currentTimeMillis(), false);
        }
        C1C7U.LIZIZ("LiveCenterPropsCard@c17f.showFlareConfirmDialog$dialogBuilder$2$1");
    }

    public static final void accept$6(C516601zo c516601zo, Object obj) {
        C1C7U.LIZ("AdMiddlePageUtils@c2e1.startCountDown$2");
        ((Function1) c516601zo.l1).invoke(obj);
        TuxTextView tuxTextView = (TuxTextView) c516601zo.l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c516601zo.s0);
        sbLIZ.append(" (");
        sbLIZ.append(((TuxTextView) c516601zo.l2).getContext().getString(2131824727, obj));
        sbLIZ.append(')');
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        C1C7U.LIZIZ("AdMiddlePageUtils@c2e1.startCountDown$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C516601zo(Object obj, C01IS c01is, String str, Function1<? super Boolean, Unit> function1) {
        this.$t = function1;
        this.l1 = obj;
        this.s0 = c01is;
        this.l2 = str;
    }
}
