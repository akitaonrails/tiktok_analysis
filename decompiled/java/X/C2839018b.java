package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.018b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2839018b extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ long LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ boolean LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;
    public final /* synthetic */ List<JavaOnlyMap> LLJJIJIL;
    public final /* synthetic */ List<String> LLJJJ;
    public final /* synthetic */ List<Long> LLJJJIL;
    public final /* synthetic */ List<Long> LLJJJJ;
    public final /* synthetic */ List<Long> LLJJJJJIL;
    public final /* synthetic */ List<String> LLJJJJLIIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2839018b(String str, String str2, String str3, boolean z, long j, long j2, String str4, boolean z2, boolean z3, long j3, long j4, long j5, long j6, long j7, String str5, boolean z4, String str6, String str7, String str8, List<JavaOnlyMap> list, List<String> list2, List<Long> list3, List<Long> list4, List<Long> list5, List<String> list6) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = str4;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
        this.LLJI = j3;
        this.LLJIJIL = j4;
        this.LLJILJIL = j5;
        this.LLJILJILJ = j6;
        this.LLJILLL = j7;
        this.LLJJ = str5;
        this.LLJJI = z4;
        this.LLJJIII = str6;
        this.LLJJIJI = str7;
        this.LLJJIJIIJIL = str8;
        this.LLJJIJIL = list;
        this.LLJJJ = list2;
        this.LLJJJIL = list3;
        this.LLJJJJ = list4;
        this.LLJJJJJIL = list5;
        this.LLJJJJLIIL = list6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        final List<JavaOnlyMap> list = this.LLJJIJIL;
        final List<String> list2 = this.LLJJJ;
        final List<Long> list3 = this.LLJJJIL;
        final List<Long> list4 = this.LLJJJJ;
        final List<Long> list5 = this.LLJJJJJIL;
        final List<String> list6 = this.LLJJJJLIIL;
        AbstractC1539010q9T abstractC1539010q9T = new AbstractC1539010q9T() { // from class: X.0dst
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                if (C2179508gL.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1 && (interfaceC1531560pxS instanceof C1537910q7h)) {
                    List<JavaOnlyMap> list7 = list;
                    Object obj = list2;
                    Object obj2 = list3;
                    Object obj3 = list4;
                    Object obj4 = list5;
                    Object obj5 = list6;
                    C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
                    C1067460dsu c1067460dsuLIZIZ = C1067320dsg.LIZIZ("");
                    c1067460dsuLIZIZ.LIZ("gift_list", list7);
                    if (obj == null) {
                        obj = C13BV.INSTANCE;
                    }
                    c1067460dsuLIZIZ.LIZ("campaign_gift_list", obj);
                    if (obj2 == null) {
                        obj2 = C13BV.INSTANCE;
                    }
                    c1067460dsuLIZIZ.LIZ("viewer_picks_panel_top_gift_ids", obj2);
                    if (obj3 == null) {
                        obj3 = C13BV.INSTANCE;
                    }
                    c1067460dsuLIZIZ.LIZ("viewer_picks_panel_gift_ids", obj3);
                    if (obj4 == null) {
                        obj4 = C13BV.INSTANCE;
                    }
                    c1067460dsuLIZIZ.LIZ("current_wish_gift_ids", obj4);
                    if (obj5 == null) {
                        obj5 = C13BV.INSTANCE;
                    }
                    c1067460dsuLIZIZ.LIZ("recommended_contents", obj5);
                    c1537910q7h.LJIJJLI(c1067460dsuLIZIZ);
                }
            }
        };
        sparkContext2.getClass();
        sparkContext2.LJJ(AbstractC1539010q9T.class, abstractC1539010q9T);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(100 * 0.73f);
        sbLIZ.append('%');
        sparkContext2.LJJJZ("height", C2188811AlT.LIZIZ(sbLIZ));
        sparkContext2.LJJJZ("entrance", this.LL);
        sparkContext2.LJJJZ("source", this.LLILLJJLI);
        sparkContext2.LJJJZ("anchor_tag", this.LLILLL);
        sparkContext2.LJJJLZIJ(this.LLILZ ? 1 : 0, "is_during_vw");
        sparkContext2.LJJJZ("modify_gift_pick_id", String.valueOf(this.LLILZIL));
        sparkContext2.LJJJLZIJ((int) this.LLILZLL, "modify_gift_id");
        sparkContext2.LJJJZ("viewer_wish_content", this.LLIZ);
        sparkContext2.LJJJLZIJ(this.LLIZLLLIL ? 1 : 0, "is_priority_gift");
        sparkContext2.LJJJLZIJ(this.LLJ ? 1 : 0, "has_selected_priority_gift");
        sparkContext2.LJJJLZIJ((int) this.LLJI, "maximum_count");
        sparkContext2.LJJJLZIJ((int) this.LLJIJIL, "banner_template_id");
        sparkContext2.LJJJLZIJ((int) this.LLJILJIL, "imported_template_id");
        sparkContext2.LJJJLZIJ((int) this.LLJILJILJ, "recommended_gift_id");
        sparkContext2.LJJJLZIJ((int) this.LLJILLL, "recommended_priority_gift_price");
        sparkContext2.LJJJZ("activity_type", this.LLJJ);
        sparkContext2.LJJJLZIJ(!this.LLJJI ? 1 : 0, "is_activity_on");
        sparkContext2.LJJJZ("campaign_info", this.LLJJIII);
        sparkContext2.LJJJZ("campaign_name", this.LLJJIJI);
        sparkContext2.LJJJZ("campaign_activity_id", this.LLJJIJIIJIL);
        return Unit.LIZ;
    }
}
