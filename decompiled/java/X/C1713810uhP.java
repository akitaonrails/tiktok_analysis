package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713810uhP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713810uhP(C1713750uhJ c1713750uhJ, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = z;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, String> mapLIZJ = this.LL.LIZJ();
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        mapLIZJ.put("source_verify_type", str);
        String str2 = this.LLILLL;
        mapLIZJ.put("target_verify_type", str2 != null ? str2 : "");
        mapLIZJ.put("change_reason", this.LLILZ);
        mapLIZJ.put("change_source", this.LLILZIL);
        mapLIZJ.put("trigger", this.LLILZLL);
        mapLIZJ.put("result", this.LLIZ ? "success" : "fail");
        String str3 = this.LLIZLLLIL;
        if (str3 != null) {
            mapLIZJ.put("err_code", str3);
        }
        String str4 = this.LLJ;
        if (str4 != null) {
            mapLIZJ.put("err_msg", str4);
        }
        InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
        if (interfaceC1713820uhQ != null) {
            interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_change_factor", mapLIZJ);
        }
        return Unit.LIZ;
    }
}
