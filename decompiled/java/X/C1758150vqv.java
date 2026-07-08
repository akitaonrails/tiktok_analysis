package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758150vqv extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL = "evict";
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1758150vqv(Integer num, Integer num2, String str, String str2, String str3) {
        super(1);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = str3;
        this.LLILZLL = num2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("operation", this.LL);
        String str = this.LLILLJJLI;
        if (str != null) {
            c957403oi2.LIZLLL("product_id", str);
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("data_type", str2);
        }
        Integer num = this.LLILZ;
        if (num != null) {
            c957403oi2.LIZLLL("cache_size", Integer.valueOf(num.intValue()));
        }
        String str3 = this.LLILZIL;
        if (str3 != null) {
            c957403oi2.LIZLLL("memory_type", str3);
        }
        Integer num2 = this.LLILZLL;
        if (num2 != null) {
            c957403oi2.LIZLLL("memory_level", Integer.valueOf(num2.intValue()));
        }
        return Unit.LIZ;
    }
}
