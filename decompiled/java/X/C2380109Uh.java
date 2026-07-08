package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Uh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2380109Uh extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Map<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2380109Uh(int i, String str, String str2, Map<String, ? extends Object> map) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        C0XJZ.LIZIZ(c957403oi2);
        c957403oi2.LIZLLL("error_code", Integer.valueOf(this.LL));
        c957403oi2.LIZLLL("error_msg", this.LLILLJJLI);
        c957403oi2.LIZLLL("page_name", this.LLILLL);
        Map<String, Object> map = this.LLILZ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c957403oi2.LIZLLL(entry.getKey(), entry.getValue());
            }
        }
        return Unit.LIZ;
    }
}
