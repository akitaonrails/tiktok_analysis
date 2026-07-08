package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487620JAi extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ C2344009Gk LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C14Z0 LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Integer LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ int LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ int LLJJIJI;
    public final /* synthetic */ long LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487620JAi(C2344009Gk c2344009Gk, String str, String str2, String str3, String str4, long j, String str5, String str6, C14Z0 c14z0, String str7, String str8, Integer num, int i, int i2, String str9, String str10, String str11, int i3, long j2) {
        super(0);
        this.LL = c2344009Gk;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = j;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = c14z0;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = num;
        this.LLJILJILJ = i;
        this.LLJILLL = i2;
        this.LLJJ = str9;
        this.LLJJI = str10;
        this.LLJJIII = str11;
        this.LLJJIJI = i3;
        this.LLJJIJIIJIL = j2;
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
        c2344009Gk.LIZLLL(this.LLILZLL, "stay_time");
        c2344009Gk.LJIIIIZZ("exit_method", this.LLIZ);
        c2344009Gk.LJIIIIZZ("result", this.LLIZLLLIL);
        c2344009Gk.LIZJ(1, "is_fixed_survey");
        c2344009Gk.LIZJ(this.LLJ.getType(), "multi_survey_type");
        c2344009Gk.LIZJ(this.LLJ.getType(), "survey_biz_type");
        c2344009Gk.LJIIIIZZ("request_id", this.LLJI);
        c2344009Gk.LJIIIIZZ("content_scope", this.LLJIJIL);
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LJ(this.LLJILJIL, "aweme_type");
        c2344009Gk.LIZJ(this.LLJILJILJ, "survey_style_group");
        c2344009Gk.LIZJ(this.LLJILLL, "survey_option_style");
        c2344009Gk.LJIIIIZZ("user_id", this.LLJJ);
        c2344009Gk.LJIIIIZZ("region", this.LLJJI);
        c2344009Gk.LJIIIIZZ("country_code", this.LLJJIII);
        c2344009Gk.LIZJ(this.LLJJIJI, "app_id");
        c2344009Gk.LIZLLL(this.LLJJIJIIJIL, "submit_time");
        return c2344009Gk.LIZ;
    }
}
