package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1554060qXk extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Boolean LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554060qXk(String str, boolean z, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, Boolean bool, String str7, String str8) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = num;
        this.LLIZLLLIL = num2;
        this.LLJ = str6;
        this.LLJI = bool;
        this.LLJIJIL = str7;
        this.LLJILJIL = str8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("api_path", this.LL);
        c957403oi2.LIZLLL("success", Integer.valueOf(this.LLILLJJLI ? 1 : 0));
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        c957403oi2.LIZLLL("page_name", str);
        String str2 = this.LLILZ;
        if (str2 != null) {
            c957403oi2.LIZLLL("error_msg", str2);
        }
        String str3 = this.LLILZIL;
        if (str3 != null) {
            c957403oi2.LIZLLL("resource_path", str3);
        }
        String str4 = this.LLILZLL;
        if (str4 != null) {
            c957403oi2.LIZLLL("resource_type", str4);
        }
        Integer num = this.LLIZ;
        if (num != null) {
            c957403oi2.LIZLLL("resource_count", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.LLIZLLLIL;
        if (num2 != null) {
            c957403oi2.LIZLLL("preload_count", Integer.valueOf(num2.intValue()));
        }
        String str5 = this.LLJ;
        if (str5 != null) {
            c957403oi2.LIZLLL("preload_type", str5);
        }
        Boolean bool = this.LLJI;
        if (bool != null) {
            c957403oi2.LIZLLL("is_stream", Boolean.valueOf(bool.booleanValue()));
        }
        String str6 = this.LLJIJIL;
        if (str6 != null) {
            c957403oi2.LIZLLL("url", str6);
        }
        String str7 = this.LLJILJIL;
        if (str7 != null) {
            c957403oi2.LIZLLL("image_adapt_width", str7);
        }
        return Unit.LIZ;
    }
}
