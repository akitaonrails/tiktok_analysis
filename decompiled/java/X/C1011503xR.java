package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03xR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1011503xR extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ C1019503yj LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL = false;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1011503xR(C1019503yj c1019503yj, String str, String str2, String str3, String str4, boolean z, Map map) {
        super(1);
        this.LL = c1019503yj;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLIZ = z;
        this.LLIZLLLIL = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        LinkedHashMap<String, Object> linkedHashMap = this.LL.LIZ;
        c957403oi2.getClass();
        ((HashMap) c957403oi2.LIZ).putAll(linkedHashMap);
        c957403oi2.LJ(this.LL.LIZ);
        String str = this.LLILLJJLI;
        if (str != null) {
            c957403oi2.LIZLLL("sale_price", str);
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("original_price", str2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("discount_percentage", str3);
        }
        c957403oi2.LIZLLL("quit_type", this.LLILZIL);
        c957403oi2.LIZLLL("is_proceed_sku_select", Integer.valueOf(this.LLILZLL ? 1 : 0));
        c957403oi2.LIZLLL("is_proceed_total_sku_select", Integer.valueOf(this.LLIZ ? 1 : 0));
        Map<String, Object> map = this.LLIZLLLIL;
        if (map != null) {
            c957403oi2.LJ(C00H3.LIZ(map));
        }
        return Unit.LIZ;
    }
}
