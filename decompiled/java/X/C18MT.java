package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18MT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18MT extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18MT(String str, Map map, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        String str;
        String str2;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("page_name", "video");
        if (this.LL) {
            str = "yes";
        } else {
            str = "no";
        }
        c957403oi2.LIZLLL("is_single_anchor", str);
        c957403oi2.LIZLLL("click_opportunity", this.LLILLJJLI);
        if (this.LL) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        c957403oi2.LIZLLL("entrance_form", str2);
        c957403oi2.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi2.LJ(this.LLILLL);
        return Unit.LIZ;
    }
}
