package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714150uhx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ String LLILLJJLI = "pin";
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Integer LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714150uhx(C1713750uhJ c1713750uhJ, String str, String str2, String str3, Integer num, Integer num2) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = num;
        this.LLIZ = num2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer num;
        Map<String, String> mapLIZJ = this.LL.LIZJ();
        mapLIZJ.put("page_id", this.LLILLJJLI);
        mapLIZJ.put("object_id", this.LLILLL);
        mapLIZJ.put("object_type", this.LLILZ);
        mapLIZJ.put("click_result", this.LLILZIL);
        mapLIZJ.put("timestamp", String.valueOf(System.currentTimeMillis()));
        if (C1714240ui6.LIZJ() && (num = this.LLILZLL) != null) {
            mapLIZJ.put("entered_digits", String.valueOf(num.intValue()));
        }
        Integer num2 = this.LLIZ;
        if (num2 != null) {
            mapLIZJ.put("attempt_seq", String.valueOf(num2.intValue()));
        }
        InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
        if (interfaceC1713820uhQ != null) {
            interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_page_click", mapLIZJ);
        }
        return Unit.LIZ;
    }
}
