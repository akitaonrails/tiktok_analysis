package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.ui.CancelUploadOrReeditSheetContentFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ipA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257340ipA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ IAVPublishService LLILZIL;
    public final /* synthetic */ CancelUploadOrReeditSheetContentFragment LLILZLL;
    public final /* synthetic */ C0HTT<C737030Svd> LLIZ;
    public final /* synthetic */ Aweme LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1257340ipA(String str, String str2, String str3, String str4, IAVPublishService iAVPublishService, CancelUploadOrReeditSheetContentFragment cancelUploadOrReeditSheetContentFragment, C0HTT<C737030Svd> c0htt, Aweme aweme) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = iAVPublishService;
        this.LLILZLL = cancelUploadOrReeditSheetContentFragment;
        this.LLIZ = c0htt;
        this.LLIZLLLIL = aweme;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Activity activityLIZ;
        IAVPublishService iAVPublishService;
        Activity activityLIZ2;
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
        C20684815ws.LJIILLIIL("click_cancel_upload", C2097608Jq.LJIIIIZZ(pairArr));
        String str4 = this.LLILZ;
        if (str4 == null || (iAVPublishService = this.LLILZIL) == null || !iAVPublishService.cancelPublishByClickCover(str4)) {
            Context context = this.LLILZLL.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131849380);
                c1389890mGx.LJIIJJI();
            }
            C1219980hqu.LIZ(1, this.LL, this.LLILLJJLI, this.LLILLL);
        } else {
            Context context2 = this.LLILZLL.getContext();
            if (context2 != null && (activityLIZ2 = C1388190mED.LIZ(context2)) != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                c1389890mGx2.LJIIIZ(2131849381);
                c1389890mGx2.LJIIJJI();
            }
            this.LLIZ.LLIIL(new C737030Svd(2, this.LLIZLLLIL));
            C1219980hqu.LIZ(0, this.LL, this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
