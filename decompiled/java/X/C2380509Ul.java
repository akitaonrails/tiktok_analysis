package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380509Ul extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1494690ozz LLILZLL;
    public final /* synthetic */ C1494600ozq LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380509Ul(int i, String str, String str2, String str3, String str4, C1494690ozz c1494690ozz, C1494600ozq c1494600ozq, Map<String, ? extends Object> map) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = c1494690ozz;
        this.LLIZ = c1494600ozq;
        this.LLIZLLLIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        C0XJZ.LIZIZ(c957403oi2);
        c957403oi2.LIZLLL("error_code", Integer.valueOf(this.LL));
        c957403oi2.LIZLLL("error_msg", this.LLILLJJLI);
        String str = this.LLILLL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("path", str);
        c957403oi2.LIZLLL("page_name", this.LLILZ);
        String str3 = this.LLILZIL;
        if (str3 == null) {
            str3 = "";
        }
        c957403oi2.LIZLLL("host", str3);
        String str4 = this.LLILZLL.traceCode;
        if (str4 != null) {
            str2 = str4;
        }
        c957403oi2.LIZLLL("log_id", str2);
        C1494600ozq c1494600ozq = this.LLIZ;
        if (c1494600ozq instanceof C1494850p0F) {
            c957403oi2.LIZLLL("duration", Long.valueOf(c1494600ozq.LJIILLIIL));
            c957403oi2.LIZLLL("is_socket_reused", Integer.valueOf(this.LLIZ.LJJI ? 1 : 0));
        }
        Map<String, Object> map = this.LLIZLLLIL;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }
}
