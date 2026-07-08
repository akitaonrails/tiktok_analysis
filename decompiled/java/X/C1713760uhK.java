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

/* JADX INFO: renamed from: X.0uhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713760uhK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713760uhK(C1713750uhJ c1713750uhJ, boolean z, String str, String str2, boolean z2) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        if (this.LL.LIZLLL > 0 && this.LL.LJ.compareAndSet(false, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("start_init_timestamp", String.valueOf(this.LL.LIZLLL));
            linkedHashMap.put("end_init_timestamp", String.valueOf(jCurrentTimeMillis));
            linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis - this.LL.LIZLLL));
            for (Pair pair : (ArrayList) this.LL.LJFF()) {
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            for (Map.Entry<String, String> entry : this.LL.LIZLLL().entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put("success", this.LLILLJJLI ? "1" : CardStruct.IStatusCode.DEFAULT);
            if (C1714240ui6.LIZ()) {
                linkedHashMap.put("result", this.LLILLJJLI ? "1" : CardStruct.IStatusCode.DEFAULT);
            }
            String str3 = this.LLILLL;
            if (str3 != null) {
                linkedHashMap.put("err_code", str3);
            }
            String str4 = this.LLILZ;
            if (str4 != null) {
                linkedHashMap.put("err_msg", str4);
            }
            linkedHashMap.put("capability", this.LLILZIL ? "hybrid" : "native");
            C1713570uh1 c1713570uh1 = this.LL.LIZIZ;
            if (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null || (str = verifyDetail.paymentMethod) == null) {
                str = "";
            }
            linkedHashMap.put("payment_method", str);
            C1713570uh1 c1713570uh12 = this.LL.LIZIZ;
            if (c1713570uh12 == null || (verifyDetailLJIIIIZZ = c1713570uh12.LJIIIIZZ()) == null || (str2 = verifyDetailLJIIIIZZ.verifyMethod) == null) {
                str2 = "";
            }
            linkedHashMap.put("verify_method", str2);
            this.LL.getClass();
            linkedHashMap.put("jailbroken_or_rooted", C1713750uhJ.LJ());
            InterfaceC1708000uY2 interfaceC1708000uY2LIZ = C1708030uY5.LIZ.LIZ(this.LL.LJFF);
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("success", this.LLILLJJLI ? "1" : CardStruct.IStatusCode.DEFAULT);
            String str5 = this.LLILLL;
            pairArr[1] = new Pair("err_code", str5 != null ? str5 : "");
            interfaceC1708000uY2LIZ.LJ(C2097608Jq.LJIIIIZZ(pairArr), new C5183020f((Map) linkedHashMap, (Map<String, String>) 368));
            InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
            if (interfaceC1713820uhQ != null) {
                interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_init", linkedHashMap);
            }
        }
        return Unit.LIZ;
    }
}
