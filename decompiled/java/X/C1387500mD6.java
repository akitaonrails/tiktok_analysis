package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mD6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387500mD6 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0HTT<C737030Svd> LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ IExternalService LLILZIL;
    public final /* synthetic */ AwemeDraft LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387500mD6(C0HTT<C737030Svd> c0htt, Aweme aweme, boolean z, Context context, IExternalService iExternalService, AwemeDraft awemeDraft, String str, String str2, String str3, Function0<Unit> function0) {
        super(0);
        this.LL = c0htt;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
        this.LLILZ = context;
        this.LLILZIL = iExternalService;
        this.LLILZLL = awemeDraft;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0HTT<C737030Svd> c0htt = this.LL;
        if (c0htt != null) {
            C737030Svd c737030Svd = new C737030Svd(2, this.LLILLJJLI);
            c737030Svd.LJIJ = Boolean.valueOf(this.LLILLL);
            c0htt.LLIIL(c737030Svd);
        }
        Context context = this.LLILZ;
        if (C0XJA.LIZIZ == null) {
            C0XJA.LIZIZ = C0XF1.LIZ(context);
        }
        if (C0XJA.LIZIZ != C0XF2.NONE) {
            this.LLILZIL.draftService().editPostedDraft(this.LLILZ, this.LLILZLL);
        }
        Aweme aweme = this.LLILLJJLI;
        String str = this.LLIZ;
        String str2 = this.LLIZLLLIL;
        String str3 = this.LLJ;
        String str4 = C729510SjV.LJJ(aweme) ? "story" : "post";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("impr_id", str3);
        c2344009Gk.LJIIIIZZ("story_type", str4);
        AwemeStatistics statistics = aweme.getStatistics();
        c2344009Gk.LIZLLL(statistics != null ? statistics.getPlayCount() : 0L, "item_vv");
        c2344009Gk.LIZJ(0, "is_posted_draft");
        c2344009Gk.LJIIIIZZ("tab_name", str2);
        c2344009Gk.LIZJ(C1387490mD5.LIZJ(aweme.getCreateTime()) ? 1 : 0, "is_post_in_24h");
        if (C298650BnD.LIZ()) {
            c2344009Gk.LIZJ((aweme.isSubOnlyVideo() && AwemeExtKt.isPhotoMode(aweme)) ? 1 : 0, "is_sub_only_photo");
        }
        if (C298640BnC.LIZ()) {
            c2344009Gk.LIZJ(C1447940nma.LIZIZ(aweme), "preview_photo_cnt");
        }
        C20684815ws.LJIILLIIL("delete_and_reedit", c2344009Gk.LIZ);
        Function0<Unit> function0 = this.LLJI;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
