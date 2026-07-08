package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03WE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WE extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WE(long j, long j2, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("page_name", "payment_method");
        String str = this.LL;
        if (str != null) {
            c957403oi2.LIZLLL("previous_page", str);
        }
        c957403oi2.LIZLLL("is_success", Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("error_code", str2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("fail_reason", str3);
        }
        c957403oi2.LIZLLL("api_duration", Long.valueOf(this.LLILZIL));
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LLILZLL));
        c957403oi2.LIZLLL("total_duration", Long.valueOf(this.LLILZIL + this.LLILZLL));
        String str4 = this.LLIZ;
        if (str4 != null) {
            c957403oi2.LIZLLL("entrance_info", str4);
        }
        String str5 = this.LLIZLLLIL;
        if (str5 != null) {
            c957403oi2.LIZLLL("entrance_form", str5);
        }
        String str6 = this.LLJ;
        if (str6 != null) {
            c957403oi2.LIZLLL("source_page_type", str6);
        }
        String str7 = this.LLJI;
        if (str7 != null) {
            c957403oi2.LIZLLL("order_id", str7);
        }
        return Unit.LIZ;
    }
}
