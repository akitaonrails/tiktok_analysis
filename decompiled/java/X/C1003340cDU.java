package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AutoAdIntroUtils;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cDU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003340cDU extends C09AY implements Function1<C770770ULj, Unit> {
    public final /* synthetic */ AutoAdIntroUtils LL;
    public final /* synthetic */ AutoData LLILLJJLI;
    public final /* synthetic */ AwemeRawAd LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003340cDU(AutoAdIntroUtils autoAdIntroUtils, AutoData autoData, AwemeRawAd awemeRawAd, int i, int i2, String str, int i3) {
        super(1);
        this.LL = autoAdIntroUtils;
        this.LLILLJJLI = autoData;
        this.LLILLL = awemeRawAd;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = str;
        this.LLIZ = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C770770ULj c770770ULj) {
        Activity activityLIZIZ;
        boolean z;
        List<String> list;
        c770770ULj.LIZIZ = true;
        AutoAdIntroUtils autoAdIntroUtils = this.LL;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        String openUrl = this.LLILLJJLI.getOpenUrl();
        String webUrl = this.LLILLJJLI.getWebUrl();
        AwemeRawAd awemeRawAd = this.LLILLL;
        int size = 0;
        if (this.LLILZ == 2 && this.LLILZIL == 2) {
            z = true;
        } else {
            z = false;
        }
        autoAdIntroUtils.LIZJ(activityLIZIZ, "auto_disclaimer_halfscreen", openUrl, webUrl, awemeRawAd, z);
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "click", this.LLILLL);
        c1022820ciuLIZLLL.LIZJ("auto_disclaimer_halfscreen", "refer");
        AdDisclaimer disclaimer = this.LLILLL.getDisclaimer();
        if (disclaimer != null && (list = disclaimer.pidList) != null) {
            size = list.size();
        }
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(size), "product_counts");
        c1022820ciuLIZLLL.LIZIZ(this.LLILZLL, "product_id");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LLIZ), "DisclaimerType");
        c1022820ciuLIZLLL.LJII();
        return Unit.LIZ;
    }
}
