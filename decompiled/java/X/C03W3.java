package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03W3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03W3 extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03W3(String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi2.LIZLLL("toast_name", "error_remind");
        String str = this.LL;
        if (str != null) {
            c957403oi2.LIZLLL("toast_content", str);
        }
        String str2 = this.LLILLJJLI;
        if (str2 != null) {
            c957403oi2.LIZLLL("error_code", str2);
        }
        c957403oi2.LIZLLL("request_name", this.LLILLL);
        String str3 = this.LLILZ;
        if (str3 != null) {
            c957403oi2.LIZLLL("previous_page", str3);
        }
        String str4 = this.LLILZIL;
        if (str4 != null) {
            c957403oi2.LIZLLL("page_name", str4);
        }
        return Unit.LIZ;
    }
}
