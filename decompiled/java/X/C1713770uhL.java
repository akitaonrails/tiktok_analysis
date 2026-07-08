package X;

import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713770uhL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713770uhL(C1713750uhJ c1713750uhJ, String str, boolean z, String str2, String str3, String str4, Long l) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        VerifyDetail verifyDetailLJIIIIZZ;
        String str2;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : (ArrayList) this.LL.LJFF()) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        for (Map.Entry<String, String> entry : this.LL.LIZLLL().entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        linkedHashMap.put("request_api", this.LLILLJJLI);
        linkedHashMap.put("success", this.LLILLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        String str3 = this.LLILZ;
        if (str3 != null) {
            linkedHashMap.put("logId", str3);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            linkedHashMap.put("err_code", str4);
        }
        String str5 = this.LLILZLL;
        if (str5 != null) {
            linkedHashMap.put("err_msg", str5);
        }
        Long l = this.LLIZ;
        if (l != null) {
            linkedHashMap.put("api_duration", l.toString());
        }
        C1713570uh1 c1713570uh1 = this.LL.LIZIZ;
        String str6 = "";
        if (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null || (str = verifyDetail.paymentMethod) == null) {
            str = "";
        }
        linkedHashMap.put("payment_method", str);
        C1713570uh1 c1713570uh12 = this.LL.LIZIZ;
        if (c1713570uh12 != null && (verifyDetailLJIIIIZZ = c1713570uh12.LJIIIIZZ()) != null && (str2 = verifyDetailLJIIIIZZ.verifyMethod) != null) {
            str6 = str2;
        }
        linkedHashMap.put("verify_method", str6);
        this.LL.getClass();
        linkedHashMap.put("jailbroken_or_rooted", C1713750uhJ.LJ());
        InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
        if (interfaceC1713820uhQ != null) {
            interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_error_report", linkedHashMap);
        }
        return Unit.LIZ;
    }
}
