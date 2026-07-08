package X;

import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380609Um extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0X52<?> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Map<String, Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380609Um(int i, String str, C0X52<?> c0x52, String str2, Object obj, Map<String, ? extends Object> map) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = c0x52;
        this.LLILZ = str2;
        this.LLILZIL = obj;
        this.LLILZLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        C0XJZ.LIZIZ(c957403oi2);
        c957403oi2.LIZLLL("error_code", Integer.valueOf(this.LL));
        c957403oi2.LIZLLL("error_msg", this.LLILLJJLI);
        c957403oi2.LIZLLL("path", new URL(this.LLILLL.LIZ.LIZ).getPath());
        c957403oi2.LIZLLL("page_name", this.LLILZ);
        c957403oi2.LIZLLL("host", new URL(this.LLILLL.LIZ.LIZ).getHost());
        c957403oi2.LIZLLL("log_id", C2381909Uz.LIZIZ(this.LLILLL));
        Object obj = this.LLILZIL;
        if (obj instanceof C1494850p0F) {
            c957403oi2.LIZLLL("duration", Long.valueOf(((C1494600ozq) obj).LJIILLIIL));
            c957403oi2.LIZLLL("is_socket_reused", Integer.valueOf(((C1494600ozq) this.LLILZIL).LJJI ? 1 : 0));
        }
        Map<String, Object> map = this.LLILZLL;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }
}
