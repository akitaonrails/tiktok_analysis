package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Okc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C628280Okc extends C09AY implements Function1<C2344009Gk, C2344009Gk> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628280Okc(int i, Boolean bool, String str, String str2, String str3, boolean z) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = bool;
        this.LLILZ = str2;
        this.LLILZIL = z;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2344009Gk invoke(C2344009Gk c2344009Gk) {
        String str;
        C2344009Gk c2344009Gk2 = c2344009Gk;
        String str2 = this.LL;
        c2344009Gk2.getClass();
        c2344009Gk2.LJIIIIZZ("tt_template_id", str2);
        c2344009Gk2.LIZJ(this.LLILLJJLI, "tt_template_type");
        Boolean bool = this.LLILLL;
        if (bool != null) {
            c2344009Gk2.LIZJ(bool.booleanValue() ? 1 : 0, "is_cache");
        }
        c2344009Gk2.LJIIIIZZ("template_interface", this.LLILZ);
        c2344009Gk2.LIZJ(this.LLILZIL ? 1 : 0, "error_code");
        if (this.LLILZIL || (str = this.LLILZLL) == null) {
            str = "";
        }
        c2344009Gk2.LJIIIIZZ("error_msg", str);
        return c2344009Gk2;
    }
}
