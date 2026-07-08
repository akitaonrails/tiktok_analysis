package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487640JAk extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ C2344009Gk LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ C14Z0 LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ int LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487640JAk(C2344009Gk c2344009Gk, String str, String str2, String str3, Integer num, C14Z0 c14z0, String str4, String str5, int i, int i2, String str6, String str7, String str8, int i3) {
        super(0);
        this.LL = c2344009Gk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = num;
        this.LLILZLL = c14z0;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        C2344009Gk c2344009Gk = this.LL;
        String str = this.LLILLJJLI;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("survey_id", this.LLILLL);
        c2344009Gk.LJIIIIZZ("author_id", this.LLILZ);
        c2344009Gk.LJ(this.LLILZIL, "enter_method");
        c2344009Gk.LIZJ(this.LLILZLL.getType(), "multi_survey_type");
        c2344009Gk.LIZJ(this.LLILZLL.getType(), "survey_biz_type");
        c2344009Gk.LJIIIIZZ("request_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("content_scope", this.LLIZLLLIL);
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LIZJ(this.LLJ, "survey_style_group");
        c2344009Gk.LIZJ(this.LLJI, "survey_option_style");
        c2344009Gk.LJIIIIZZ("user_id", this.LLJIJIL);
        c2344009Gk.LJIIIIZZ("region", this.LLJILJIL);
        c2344009Gk.LJIIIIZZ("country_code", this.LLJILJILJ);
        c2344009Gk.LIZJ(this.LLJILLL, "app_id");
        return c2344009Gk.LIZ;
    }
}
