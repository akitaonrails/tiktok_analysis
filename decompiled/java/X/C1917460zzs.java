package X;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1917460zzs extends C2217421BqW implements Function1<String, Unit> {
    public C1917460zzs(Object obj) {
        super(1, obj, C1917450zzr.class, "onShowPopupActionFail", "onShowPopupActionFail(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        C1917450zzr c1917450zzr = (C1917450zzr) this.receiver;
        c1917450zzr.getClass();
        Pair[] pairArr = new Pair[2];
        Object obj = ((LinkedHashMap) c1917450zzr.LIZIZ).get("ban_type");
        if (obj == null) {
            obj = "";
        }
        pairArr[0] = new Pair("ban_type", obj);
        pairArr[1] = new Pair("error_reason", str2);
        C1876900ywS.LIZIZ(C2097608Jq.LJIIIIZZ(pairArr));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShowPopupAction Failed: ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return Unit.LIZ;
    }
}
