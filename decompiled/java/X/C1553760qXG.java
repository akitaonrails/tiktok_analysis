package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553760qXG extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1084710eKj LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1553760qXG(C1084710eKj c1084710eKj, String str) {
        super(1);
        this.LL = c1084710eKj;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        Map mapLJIIIIZZ;
        C1533790q13 c1533790q132 = c1533790q13;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPreDownloadGameCardLynxTemplate isSucceed =");
        sbLIZ.append(c1533790q132.LIZIZ);
        sbLIZ.append(", isCache = ");
        sbLIZ.append(c1533790q132.LJI);
        sbLIZ.append(", from = ");
        sbLIZ.append(c1533790q132.LJ);
        C20441214yg.LIZIZ("GamePartnershipGeckoHandler", C2188811AlT.LIZIZ(sbLIZ));
        C1084710eKj c1084710eKj = this.LL;
        String str = this.LLILLJJLI;
        c1084710eKj.getClass();
        Boolean boolValueOf = Boolean.valueOf(c1533790q132.LIZIZ);
        Boolean boolValueOf2 = Boolean.valueOf(c1533790q132.LJI);
        String strLJII = c1533790q132.LJII(c1533790q132.LJ);
        int i = 1;
        if (c1533790q132.LIZIZ) {
            mapLJIIIIZZ = C2097608Jq.LJ();
        } else {
            Pair[] pairArr = new Pair[8];
            pairArr[0] = new Pair("error_code", String.valueOf(c1533790q132.LIZLLL.LIZIZ));
            pairArr[1] = new Pair("gecko_error_code", String.valueOf(c1533790q132.LIZLLL.LIZJ()));
            c1533790q132.LIZLLL.getClass();
            pairArr[2] = new Pair("net_library_error_code", String.valueOf(0));
            pairArr[3] = new Pair("http_status_code", String.valueOf(c1533790q132.LIZLLL.LIZJ));
            String str2 = c1533790q132.LIZLLL.LIZ.get("gecko");
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            pairArr[4] = new Pair("gecko_error", str2);
            String str4 = c1533790q132.LIZLLL.LIZ.get("builtin");
            if (str4 == null) {
                str4 = "";
            }
            pairArr[5] = new Pair("builtin_error", str4);
            String str5 = c1533790q132.LIZLLL.LIZ.get("cdn");
            if (str5 == null) {
                str5 = "";
            }
            pairArr[6] = new Pair("cdn_error", str5);
            String str6 = c1533790q132.LIZLLL.LIZ.get("_pipeline");
            if (str6 != null) {
                str3 = str6;
            }
            pairArr[7] = new Pair("pipeline_error", str3);
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        }
        C1878360yyo.LJII(str, boolValueOf, boolValueOf2, strLJII, mapLJIIIIZZ);
        if (c1533790q132.LIZIZ) {
            C0KPJ.Ue.LJFF(this.LLILLJJLI);
        } else {
            i = 0;
        }
        C1084710eKj.LIZ = i;
        return Unit.LIZ;
    }
}
