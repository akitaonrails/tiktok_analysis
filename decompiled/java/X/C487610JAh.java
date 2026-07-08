package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487610JAh extends C09AY implements Function0<Map<String, String>> {
    public final /* synthetic */ C2344009Gk LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ C14Z0 LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ int LLJILLL;
    public final /* synthetic */ int LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ int LLJJIJIIJIL;
    public final /* synthetic */ long LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487610JAh(C2344009Gk c2344009Gk, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, long j, C14Z0 c14z0, String str8, String str9, int i, int i2, String str10, String str11, String str12, int i3, long j2) {
        super(0);
        this.LL = c2344009Gk;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = str6;
        this.LLJ = str7;
        this.LLJI = j;
        this.LLJIJIL = c14z0;
        this.LLJILJIL = str8;
        this.LLJILJILJ = str9;
        this.LLJILLL = i;
        this.LLJJ = i2;
        this.LLJJI = str10;
        this.LLJJIII = str11;
        this.LLJJIJI = str12;
        this.LLJJIJIIJIL = i3;
        this.LLJJIJIL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, String> invoke() {
        C2344009Gk c2344009Gk = this.LL;
        String str = this.LLILLJJLI;
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("exit_method", str);
        c2344009Gk.LJ(this.LLILLL, "enter_method");
        c2344009Gk.LJIIIIZZ("result", this.LLILZ);
        c2344009Gk.LJIIIIZZ("extra_field", this.LLILZIL);
        c2344009Gk.LJIIIIZZ("group_id", this.LLILZLL);
        c2344009Gk.LJIIIIZZ("survey_id", this.LLIZ);
        c2344009Gk.LJIIIIZZ("author_id", this.LLIZLLLIL);
        c2344009Gk.LJIIIIZZ("type", this.LLJ);
        c2344009Gk.LIZLLL(this.LLJI, "stay_time");
        c2344009Gk.LIZJ(this.LLJIJIL.getType(), "multi_survey_type");
        c2344009Gk.LIZJ(this.LLJIJIL.getType(), "survey_biz_type");
        c2344009Gk.LJIIIIZZ("request_id", this.LLJILJIL);
        c2344009Gk.LJIIIIZZ("content_scope", this.LLJILJILJ);
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LIZJ(this.LLJILLL, "survey_style_group");
        c2344009Gk.LIZJ(this.LLJJ, "survey_option_style");
        c2344009Gk.LJIIIIZZ("user_id", this.LLJJI);
        c2344009Gk.LJIIIIZZ("region", this.LLJJIII);
        c2344009Gk.LJIIIIZZ("country_code", this.LLJJIJI);
        c2344009Gk.LIZJ(this.LLJJIJIIJIL, "app_id");
        c2344009Gk.LIZLLL(this.LLJJIJIL, "submit_time");
        return c2344009Gk.LIZ;
    }
}
