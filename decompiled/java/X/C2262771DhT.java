package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262771DhT extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ LinkedHashMap<String, Object> LL;
    public final /* synthetic */ String LLILLJJLI = "order_submit";
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Float LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262771DhT(LinkedHashMap linkedHashMap, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, String str2, String str3, int i3, String str4, Float f, String str5, String str6, String str7, String str8) {
        super(1);
        this.LL = linkedHashMap;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = z3;
        this.LLIZ = z4;
        this.LLIZLLLIL = i;
        this.LLJ = z5;
        this.LLJI = i2;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = i3;
        this.LLJILLL = str4;
        this.LLJJ = f;
        this.LLJJI = str5;
        this.LLJJIII = str6;
        this.LLJJIJI = str7;
        this.LLJJIJIIJIL = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        LaneParams laneParams2 = laneParams;
        laneParams2.putAll(this.LL);
        laneParams2.put("page_name", this.LLILLJJLI);
        laneParams2.put("checkout_type", this.LLILLL);
        laneParams2.put("is_chunk", Integer.valueOf(this.LLILZ ? 1 : 0));
        laneParams2.put("is_preview", Integer.valueOf(this.LLILZIL ? 1 : 0));
        laneParams2.put("is_preload", Integer.valueOf(this.LLILZLL ? 1 : 0));
        laneParams2.put("is_full_preload", Integer.valueOf(this.LLIZ ? 1 : 0));
        laneParams2.put("pre_type", Integer.valueOf(this.LLIZLLLIL));
        laneParams2.put("is_rendered", Integer.valueOf(this.LLJ ? 1 : 0));
        laneParams2.put("template", Integer.valueOf(this.LLJI));
        laneParams2.put("cart_enter_source", this.LLJIJIL);
        laneParams2.put("pdp_enter_source", this.LLJILJIL);
        laneParams2.put("source_total_times", Integer.valueOf(this.LLJILJILJ));
        String str = this.LLJILLL;
        if (str != null) {
            laneParams2.put("previous_page", str);
        }
        Float f = this.LLJJ;
        if (f != null) {
            laneParams2.put("c_device_score", Float.valueOf(f.floatValue()));
        }
        String str2 = this.LLJJI;
        if (str2 != null) {
            laneParams2.put("btm_pre", str2);
        }
        String str3 = this.LLJJIII;
        if (str3 != null) {
            laneParams2.put("btm", str3);
        }
        String str4 = this.LLJJIJI;
        if (str4 != null) {
            laneParams2.put("btm_show_id", str4);
        }
        String str5 = this.LLJJIJIIJIL;
        if (str5 != null) {
            laneParams2.put("btm_pre_show_id", str5);
        }
        return Unit.LIZ;
    }
}
