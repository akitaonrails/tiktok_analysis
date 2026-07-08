package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qXE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553740qXE extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ C1084710eKj LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1553740qXE(C1084710eKj c1084710eKj, String str) {
        super(1);
        this.LL = c1084710eKj;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) {
        Map mapLJIIIIZZ;
        C1532310pyf c1532310pyf2 = c1532310pyf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryPreDownloadGameCardLynxTemplate isSucceed =");
        sbLIZ.append(c1532310pyf2.isSuccess());
        sbLIZ.append(", isCache = ");
        sbLIZ.append(c1532310pyf2.LJIIJ);
        sbLIZ.append(", from = ");
        sbLIZ.append(c1532310pyf2.LJIIJJI);
        C20441214yg.LIZIZ("GamePartnershipGeckoHandler", C2188811AlT.LIZIZ(sbLIZ));
        C1084710eKj c1084710eKj = this.LL;
        String str = this.LLILLJJLI;
        c1084710eKj.getClass();
        Map<String, String> mapLIZIZ = c1532310pyf2.LIZJ.LIZIZ();
        Boolean boolValueOf = Boolean.valueOf(c1532310pyf2.isSuccess());
        Boolean boolValueOf2 = Boolean.valueOf(c1532310pyf2.LJIIJ);
        String str2 = c1532310pyf2.LJIIJJI;
        int i = 1;
        if (c1532310pyf2.isSuccess()) {
            mapLJIIIIZZ = C2097608Jq.LJ();
        } else {
            Pair[] pairArr = new Pair[8];
            pairArr[0] = new Pair("error_code", String.valueOf(c1532310pyf2.LIZJ.LIZ()));
            LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZIZ;
            pairArr[1] = new Pair("gecko_error_code", String.valueOf(linkedHashMap.get("gecko")));
            String str3 = "";
            pairArr[2] = new Pair("net_library_error_code", "");
            pairArr[3] = new Pair("http_status_code", c1532310pyf2.toString());
            pairArr[4] = new Pair("gecko_error", String.valueOf(linkedHashMap.get("gecko")));
            pairArr[5] = new Pair("builtin_error", String.valueOf(linkedHashMap.get("assets")));
            Object obj = linkedHashMap.get("cdn");
            if (obj == null) {
                obj = "";
            }
            pairArr[6] = new Pair("cdn_error", obj);
            String str4 = c1532310pyf2.LIZJ.LIZ.LIZIZ;
            if (str4 != null) {
                str3 = str4;
            }
            pairArr[7] = new Pair("pipeline_error", str3);
            mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        }
        C1878360yyo.LJII(str, boolValueOf, boolValueOf2, str2, mapLJIIIIZZ);
        if (c1532310pyf2.isSuccess()) {
            C0KPJ.Ue.LJFF(this.LLILLJJLI);
        } else {
            i = 0;
        }
        C1084710eKj.LIZ = i;
        return Unit.LIZ;
    }
}
