package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.108E, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C108E extends C09AY implements Function1<C770770ULj, Unit> {
    public final /* synthetic */ C127A LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108E(C127A c127a, boolean z, boolean z2) {
        super(1);
        this.LL = c127a;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C770770ULj c770770ULj) throws JSONException {
        String str;
        C770770ULj c770770ULj2 = c770770ULj;
        C108F c108f = C108F.LIZ;
        boolean zLJIILIIL = this.LL.LJIILIIL();
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        c108f.getClass();
        int i = 1;
        c770770ULj2.LIZIZ = true;
        c770770ULj2.LIZ(true);
        C108F.LIZJ(C108I.LLILZLL, z, z2, Boolean.valueOf(zLJIILIIL));
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "personal_homepage");
        if (zLJIILIIL) {
            str = "on";
        } else {
            str = "off";
        }
        pairArr[1] = new Pair("to_status", str);
        pairArr[2] = new Pair("action", "change_status");
        c1163504gr.onEventV3("change_viewer_status", C2097608Jq.LJIIIIZZ(pairArr));
        C191880104w c191880104w = C191880104w.LIZ;
        JSONObject jSONObject = new JSONObject();
        if (!zLJIILIIL) {
            i = 2;
        }
        jSONObject.put("viewer_history_setting", String.valueOf(i));
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("extra", C786410Ut5.J3(jSONObject)));
        c191880104w.getClass();
        C191880104w.LJIILJJIL(2, "viewer_history", mapLIZJ).LJJIIJ(new C19334110kV(c770770ULj2, 9)).LJJLL(new C09JN() { // from class: X.00Pr
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MergeViewHistoryPopupManager@4d54.onConfirmClick$3");
                C1C7U.LIZIZ("MergeViewHistoryPopupManager@4d54.onConfirmClick$3");
            }
        }, new C09JN() { // from class: X.00Ps
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MergeViewHistoryPopupManager@4d54.onConfirmClick$4");
                C1C7U.LIZIZ("MergeViewHistoryPopupManager@4d54.onConfirmClick$4");
            }
        });
        return Unit.LIZ;
    }
}
