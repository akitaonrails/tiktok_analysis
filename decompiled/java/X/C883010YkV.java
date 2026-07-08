package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883010YkV {
    public final C0YHC LIZ;
    public final C054G LIZIZ;

    public C883010YkV(C0YHC c0yhc) {
        C1DFH c1dfh = C0PEM.LIZ;
        this.LIZ = c0yhc;
        this.LIZIZ = C2296808zG.LIZ(c1dfh.plus(C2296908zH.LIZ()));
    }

    public static void LIZIZ(C883010YkV c883010YkV) {
        c883010YkV.getClass();
        C882400YjW.LIZ.getClass();
        C0YUF c0yufLIZLLL = C882400YjW.LIZLLL();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("init_result", EnumC883260Yku.PROCEED_TO_LOGIN_SDK);
        jSONObject.put("prev_init_result", "none");
        jSONObject.put("has_token", C0YUM.LIZIZ());
        ((C882690Yjz) c0yufLIZLLL).LIZLLL(jSONObject, "tt_im_init_result");
    }

    public final void LIZ(EnumC883260Yku enumC883260Yku, Function1<? super EnumC883260Yku, Unit> function1, EnumC883260Yku enumC883260Yku2) throws JSONException {
        int i;
        if (enumC883260Yku2 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_result", enumC883260Yku);
            jSONObject.put("prev_init_result", enumC883260Yku2);
            if (enumC883260Yku == enumC883260Yku2) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("recovered", i);
            jSONObject.put("has_token", C0YUM.LIZIZ());
            C882400YjW.LIZ.getClass();
            ((C882690Yjz) C882400YjW.LIZLLL()).LIZLLL(jSONObject, "tt_im_init_result");
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C883000YkU(this, enumC883260Yku, function1, enumC883260Yku2, null), 3);
    }
}
