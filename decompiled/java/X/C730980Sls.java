package X;

import Y.ARunnableS39S0300000_6;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.commercialize.model.LikeEffectModel;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Sls, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730980Sls extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoDiggAssem LLILZ;
    public final /* synthetic */ C731940SnQ LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C730980Sls(long j, Aweme aweme, String str, VideoDiggAssem videoDiggAssem, C731940SnQ c731940SnQ, View view) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = videoDiggAssem;
        this.LLILZIL = c731940SnQ;
        this.LLILZLL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        String url;
        String str;
        String authorUid;
        AwemeRawAd awemeRawAdLJJIIJZLJL;
        AdStyleActionModel adStyleActionModel;
        LikeEffectModel likeEffectModel;
        SimpleUriAndUrl simpleUriAndUrl;
        boolean zBooleanValue = bool.booleanValue();
        System.currentTimeMillis();
        if (zBooleanValue) {
            C734390SrN.LIZJ(this.LLILLJJLI, this.LLILLL);
        } else {
            Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(this.LLILZ)).getAweme();
            String str2 = ((VideoItemParams) C631370Opb.LIZ(this.LLILZ)).mEventType;
            String aid = null;
            if (aweme != null && (awemeRawAdLJJIIJZLJL = C1017070cZd.LJJIIJZLJL(aweme)) != null && (adStyleActionModel = awemeRawAdLJJIIJZLJL.getAdStyleActionModel()) != null && (likeEffectModel = adStyleActionModel.likeEffect) != null && (simpleUriAndUrl = likeEffectModel.likeIconUrl) != null) {
                url = simpleUriAndUrl.getUrl();
            } else {
                url = null;
            }
            if (url != null && url.length() != 0) {
                str = "image_load_fail";
            } else {
                str = "no_data";
            }
            if (aweme != null && aweme.isAd()) {
                C734390SrN.LIZ.getClass();
                ILikeEffectService iLikeEffectServiceLIZ = C734390SrN.LIZ();
                if (iLikeEffectServiceLIZ != null) {
                    iLikeEffectServiceLIZ.LJIIIIZZ(aweme, str);
                }
            } else {
                C2344009Gk c2344009Gk = new C2344009Gk();
                if (aweme != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme);
                } else {
                    authorUid = null;
                }
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                c2344009Gk.LJIIIIZZ("group_id", aid);
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("fail_reason", str);
                C20684815ws.LJIILLIIL("nova_like_button_effect_view_fail", c2344009Gk.LIZ);
            }
        }
        C731940SnQ c731940SnQ = this.LLILZIL;
        HandlerHook.viewPost(c731940SnQ, new ARunnableS39S0300000_6(c731940SnQ, this.LLILZLL, this.LLILLJJLI, this.LL, 3));
        return Unit.LIZ;
    }
}
