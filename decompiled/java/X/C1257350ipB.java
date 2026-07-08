package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.ui.CancelUploadOrReeditSheetContentFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS263S0300000_19;

/* JADX INFO: renamed from: X.0ipB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257350ipB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;
    public final /* synthetic */ IAVPublishService LLIZ;
    public final /* synthetic */ CancelUploadOrReeditSheetContentFragment LLIZLLLIL;
    public final /* synthetic */ C259800zU<AwemeDraft> LLJ;
    public final /* synthetic */ C0HTT<C737030Svd> LLJI;
    public final /* synthetic */ C09AE LLJIJIL;
    public final /* synthetic */ Context LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257350ipB(String str, String str2, String str3, String str4, String str5, Aweme aweme, IAVPublishService iAVPublishService, CancelUploadOrReeditSheetContentFragment cancelUploadOrReeditSheetContentFragment, C259800zU c259800zU, C0HTT c0htt, AnonymousClass0956 anonymousClass0956, Context context) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = aweme;
        this.LLIZ = iAVPublishService;
        this.LLIZLLLIL = cancelUploadOrReeditSheetContentFragment;
        this.LLJ = c259800zU;
        this.LLJI = c0htt;
        this.LLJIJIL = anonymousClass0956;
        this.LLJILJIL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityLIZ;
        IAVPublishService iAVPublishService;
        Activity activityLIZ2;
        C729450SjP c729450SjP;
        C1219980hqu c1219980hqu = C1219980hqu.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        c1219980hqu.getClass();
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("story_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("enter_position", str3);
        C20684815ws.LJIILLIIL("click_re_edit", C2097608Jq.LJIIIIZZ(pairArr));
        C0SPF c0spfLJJL = C1618440sDa.LIZIZ.LJJL(this.LLILZIL);
        if (c0spfLJJL != null && (c729450SjP = c0spfLJJL.LIZIZ) != null) {
            c729450SjP.LJII = true;
        }
        AwS263S0300000_19 awS263S0300000_19 = new AwS263S0300000_19(this.LLIZLLLIL, (CancelUploadOrReeditSheetContentFragment) this.LLJI, (C0HTT<C737030Svd>) this.LLILZLL, (Aweme) 28);
        Story story = this.LLILZLL.getStory();
        if (story != null) {
            story.setKeepDraft(true);
        }
        String str4 = this.LLILZ;
        if (str4 == null || (iAVPublishService = this.LLIZ) == null || !iAVPublishService.cancelPublishByClickCover(str4)) {
            C1219980hqu.LIZ(1, this.LL, this.LLILLJJLI, this.LLILLL);
            Context context = this.LLIZLLLIL.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131849380);
                c1389890mGx.LJIIJJI();
            }
        } else {
            Context context2 = this.LLIZLLLIL.getContext();
            if (context2 != null && (activityLIZ2 = C1388190mED.LIZ(context2)) != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                c1389890mGx2.LJIIIZ(2131849381);
                c1389890mGx2.LJIIJJI();
            }
            IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
            IAVDraftService iAVDraftServiceDraftService = iExternalService != null ? iExternalService.draftService() : null;
            AwemeDraft awemeDraft = this.LLJ.element;
            if (awemeDraft == null) {
                C054G c054gLIZIZ = C2296808zG.LIZIZ();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c054gLIZIZ, C2107308Nj.LIZ.LLIILII(), null, new C1257330ip9(this.LLJIJIL, this.LLJ, iAVDraftServiceDraftService, this.LLJILJIL, awS263S0300000_19, this.LL, this.LLILLJJLI, this.LLILLL, this.LLJI, this.LLILZLL, null), 2);
            } else {
                AwemeDraft awemeDraft2 = awemeDraft;
                Context context3 = this.LLJILJIL;
                String str5 = this.LL;
                String str6 = this.LLILLJJLI;
                String str7 = this.LLILLL;
                if (iAVDraftServiceDraftService != null) {
                    iAVDraftServiceDraftService.editPostedDraft(context3, awemeDraft2);
                }
                C1219980hqu.LIZ(0, str5, str6, str7);
                awS263S0300000_19.invoke();
            }
        }
        return Unit.LIZ;
    }
}
