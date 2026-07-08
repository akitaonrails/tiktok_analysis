package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487630JAj extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ C2344009Gk LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ int LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487630JAj(C2344009Gk c2344009Gk, String str, String str2, String str3, String str4, Integer num, int i, String str5, String str6, int i2, int i3, String str7, String str8, String str9, int i4) {
        super(0);
        this.LL = c2344009Gk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = num;
        this.LLIZ = i;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = i2;
        this.LLJIJIL = i3;
        this.LLJILJIL = str7;
        this.LLJILJILJ = str8;
        this.LLJILLL = str9;
        this.LLJJ = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        C2344009Gk c2344009Gk = this.LL;
        String str = this.LLILLJJLI;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("survey_id", this.LLILLL);
        c2344009Gk.LJIIIIZZ("author_id", this.LLILZ);
        c2344009Gk.LJIIIIZZ("type", this.LLILZIL);
        c2344009Gk.LJ(this.LLILZLL, "privacy_policy_show");
        c2344009Gk.LIZJ(this.LLIZ, "multi_survey_type");
        c2344009Gk.LIZJ(this.LLIZ, "survey_biz_type");
        c2344009Gk.LJIIIIZZ("request_id", this.LLIZLLLIL);
        c2344009Gk.LJIIIIZZ("content_scope", this.LLJ);
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LIZJ(this.LLJI, "survey_style_group");
        c2344009Gk.LIZJ(this.LLJIJIL, "survey_option_style");
        c2344009Gk.LJIIIIZZ("user_id", this.LLJILJIL);
        c2344009Gk.LJIIIIZZ("region", this.LLJILJILJ);
        c2344009Gk.LJIIIIZZ("country_code", this.LLJILLL);
        c2344009Gk.LIZJ(this.LLJJ, "app_id");
        return c2344009Gk.LIZ;
    }
}
