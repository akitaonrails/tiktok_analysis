package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713800uhO extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713800uhO(C1713750uhJ c1713750uhJ, String str, long j, boolean z, String str2, String str3, String str4, String str5) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Map<String, String> mapLIZJ = this.LL.LIZJ();
        mapLIZJ.put("request_api", this.LLILLJJLI);
        mapLIZJ.put("api_duration", String.valueOf(this.LLILLL));
        mapLIZJ.put("result", this.LLILZ ? "success" : "fail");
        String str = this.LLILZIL;
        if (str != null) {
            mapLIZJ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        }
        String str2 = this.LLILZLL;
        if (str2 != null) {
            mapLIZJ.put("logid", str2);
        }
        String str3 = this.LLIZ;
        if (str3 != null) {
            mapLIZJ.put("err_code", str3);
        }
        String str4 = this.LLIZLLLIL;
        if (str4 != null) {
            mapLIZJ.put("err_msg", str4);
        }
        InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
        if (interfaceC1713820uhQ != null) {
            interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_network", mapLIZJ);
        }
        return Unit.LIZ;
    }
}
