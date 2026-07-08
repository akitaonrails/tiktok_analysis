package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03OH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03OH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Boolean LL;
    public final /* synthetic */ String LLILLJJLI = null;
    public final /* synthetic */ String LLILLL = null;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ Long LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Boolean LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ Long LLJ;
    public final /* synthetic */ Boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03OH(Boolean bool, Long l, Long l2, Integer num, Boolean bool2, Boolean bool3, Long l3, Boolean bool4) {
        super(0);
        this.LL = bool;
        this.LLILZ = l;
        this.LLILZIL = l2;
        this.LLILZLL = num;
        this.LLIZ = bool2;
        this.LLIZLLLIL = bool3;
        this.LLJ = l3;
        this.LLJI = bool4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C03O0 c03o0 = C03O0.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean bool = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        Long l = this.LLILZ;
        Long l2 = this.LLILZIL;
        Integer num = this.LLILZLL;
        Boolean bool2 = this.LLIZ;
        Boolean bool3 = this.LLIZLLLIL;
        Long l3 = this.LLJ;
        Boolean bool4 = this.LLJI;
        c03o0.getClass();
        linkedHashMap.putAll(C03O0.LIZIZ);
        if (bool != null) {
            linkedHashMap.put("is_success", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        if (str != null) {
            linkedHashMap.put("code", str);
        }
        if (str2 != null) {
            linkedHashMap.put("fail_reason", str2);
        }
        if (l != null) {
            linkedHashMap.put("cost", Long.valueOf(l.longValue()));
        }
        if (l2 != null) {
            linkedHashMap.put("total_cost", Long.valueOf(l2.longValue()));
        }
        if (num != null) {
            linkedHashMap.put("chunk_index", Integer.valueOf(num.intValue()));
        }
        if (bool2 != null) {
            linkedHashMap.put("begin_render", Integer.valueOf(bool2.booleanValue() ? 1 : 0));
        }
        if (bool3 != null) {
            linkedHashMap.put("last_chunk", Integer.valueOf(bool3.booleanValue() ? 1 : 0));
        }
        if (l3 != null) {
            linkedHashMap.put("server_inner_total_cost", Long.valueOf(l3.longValue()));
        }
        if (bool4 != null) {
            linkedHashMap.put("is_first_load", Integer.valueOf(bool4.booleanValue() ? 1 : 0));
        }
        C03O0.LLF("rd_tiktokec_chunk_duration", linkedHashMap);
        return Unit.LIZ;
    }
}
