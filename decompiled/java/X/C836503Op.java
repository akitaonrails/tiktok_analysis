package X;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C836503Op extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836503Op(int i, String str, HashMap map, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZJ("page_name", "order_submit");
        c957403oi2.LIZJ("is_check_passed", Integer.valueOf(this.LL));
        c957403oi2.LIZIZ("api_path", this.LLILLJJLI);
        if (this.LLILLL) {
            str = "yes";
        } else {
            str = "no";
        }
        c957403oi2.LIZJ("is_retry", str);
        HashMap<String, Object> map = this.LLILZ;
        if (map != null) {
            c957403oi2.LIZIZ("anchor_show_type", map.get("anchor_show_type"));
            c957403oi2.LIZIZ("author_id", this.LLILZ.get("author_id"));
            c957403oi2.LIZIZ("enter_from_info", this.LLILZ.get("enter_from_info"));
            c957403oi2.LIZIZ("entrance_form", this.LLILZ.get("entrance_form"));
            c957403oi2.LIZIZ("entrance_info", this.LLILZ.get("entrance_info"));
            c957403oi2.LIZIZ("follow_status", this.LLILZ.get("follow_status"));
            c957403oi2.LIZIZ("product_id", this.LLILZ.get("product_id"));
            c957403oi2.LIZIZ("product_source", this.LLILZ.get("product_source"));
            c957403oi2.LIZIZ("source", this.LLILZ.get("source"));
            c957403oi2.LIZIZ("source_from", this.LLILZ.get("source_from"));
            c957403oi2.LIZIZ("source_page_type", this.LLILZ.get("source_page_type"));
        }
        return Unit.LIZ;
    }
}
