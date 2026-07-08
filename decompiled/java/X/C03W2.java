package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03W2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03W2 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03W2(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
        this.LLIZLLLIL = str8;
        this.LLJ = j;
        this.LLJI = str9;
        this.LLJIJIL = str10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("request_name", this.LL);
        c957403oi2.LIZLLL("page_name", "payment_method");
        String str = this.LLILLJJLI;
        if (str != null) {
            c957403oi2.LIZLLL("previous_page", str);
        }
        String str2 = this.LLILLL;
        if (str2 != null) {
            c957403oi2.LIZLLL("order_id", str2);
        }
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("pay_type", str3);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            c957403oi2.LIZLLL("pay_result", str4);
        }
        String str5 = this.LLILZLL;
        if (str5 != null) {
            c957403oi2.LIZLLL("pay_error_code", str5);
        }
        String str6 = this.LLIZ;
        if (str6 != null) {
            c957403oi2.LIZLLL("redirect_url", str6);
        }
        String str7 = this.LLIZLLLIL;
        if (str7 != null) {
            c957403oi2.LIZLLL("fail_reason", str7);
        }
        c957403oi2.LIZLLL("api_duration", Long.valueOf(this.LLJ));
        String str8 = this.LLJI;
        if (str8 != null) {
            c957403oi2.LIZLLL("order_status", str8);
        }
        String str9 = this.LLJIJIL;
        if (str9 != null) {
            c957403oi2.LIZLLL("payment_method_id", str9);
        }
        return Unit.LIZ;
    }
}
