package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rmy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601940rmy extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ C259800zU<C1494850p0F> LL;
    public final /* synthetic */ Exception LLILLJJLI;
    public final /* synthetic */ C1601460rmC LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ Integer LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601940rmy(C259800zU<C1494850p0F> c259800zU, Exception exc, C1601460rmC c1601460rmC, C118300cf c118300cf, boolean z, Long l, Integer num) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = exc;
        this.LLILLL = c1601460rmC;
        this.LLILZ = c118300cf;
        this.LLILZIL = z;
        this.LLILZLL = l;
        this.LLIZ = num;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        Pair[] pairArr = new Pair[10];
        C1494850p0F c1494850p0F = this.LL.element;
        pairArr[0] = new Pair("send_bytes", c1494850p0F != null ? Long.valueOf(c1494850p0F.LJIJI) : null);
        C1494850p0F c1494850p0F2 = this.LL.element;
        pairArr[1] = new Pair("received_bytes", c1494850p0F2 != null ? Long.valueOf(c1494850p0F2.LJIJJ) : null);
        pairArr[2] = new Pair("is_success", 0);
        pairArr[3] = new Pair("err_msg", this.LLILLJJLI.getMessage());
        pairArr[4] = new Pair("session_number", Integer.valueOf(this.LLILLL.LJJJIL));
        pairArr[5] = new Pair("ttnet_err_code", Integer.valueOf(this.LLILZ.element));
        pairArr[6] = new Pair("err_no_network", Boolean.valueOf(this.LLILZIL));
        C1601590rmP c1601590rmP = this.LLILLL.LJJJ;
        pairArr[7] = new Pair("parse_request_duration", c1601590rmP != null ? Long.valueOf(c1601590rmP.LIZJ) : null);
        pairArr[8] = new Pair("total_duration", this.LLILZLL);
        pairArr[9] = new Pair("retry_count", this.LLIZ);
        return C591500NHw.LIZ(pairArr);
    }
}
