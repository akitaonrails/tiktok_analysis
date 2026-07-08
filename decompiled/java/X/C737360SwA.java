package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0SwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737360SwA extends AbstractC736370SuZ {
    public final C1379170lzf LLILZ;
    public final SharePackage LLILZIL;

    @Override // X.AbstractC1376810lvr
    public final void LIZIZ(View view) {
        String aid;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AdDislikeInfo dislikeInfo;
        AwemeRawAd awemeRawAd2;
        ITalentAdRevenueShareService iTalentAdRevenueShareServiceLJIIL;
        C737310Sw5 c737310Sw5LJJLIIIJLJLI = C621180OYa.LIZIZ.LJJLIIIJLJLI(this.LLILLJJLI, this.LLILLL, "long_press");
        if (c737310Sw5LJJLIIIJLJLI != null) {
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 != null && (awemeRawAd2 = aweme2.getAwemeRawAd()) != null && (iTalentAdRevenueShareServiceLJIIL = TalentAdRevenueShareServiceImpl.LJIIL()) != null) {
                iTalentAdRevenueShareServiceLJIIL.LJ(awemeRawAd2);
            }
            Aweme aweme3 = this.LLILLJJLI;
            if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3) && (aweme = this.LLILLJJLI) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (dislikeInfo = awemeRawAd.getDislikeInfo()) != null && dislikeInfo.enable == 1) {
                C1370320llO.LIZLLL(C1388190mED.LIZ(view.getContext()), this.LLILZIL, c737310Sw5LJJLIIIJLJLI);
            } else {
                C844470XAv.LIZ.getClass();
                C1370320llO.LIZLLL(C844470XAv.LIZ(), this.LLILZIL, c737310Sw5LJJLIIIJLJLI);
            }
            if (TextUtils.equals(this.LLILLL, "homepage_hot") || TextUtils.equals(this.LLILLL, "graphic_detail") || TextUtils.equals(this.LLILZ.LLILZ, "graphic_detail")) {
                C14Z7.LIZ.getClass();
                if (!C14ZW.LIZIZ.isEmpty()) {
                    C1440005kM.LIZ(new IEvent() { // from class: X.0SRf
                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent post() {
                            C1440005kM.LIZ(this);
                            return this;
                        }

                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                        public final /* synthetic */ IEvent postSticky() {
                            C1440005kM.LIZIZ(this);
                            return this;
                        }
                    });
                }
            }
            if (C695390RPl.LIZ > 0) {
                Aweme aweme4 = this.LLILLJJLI;
                if (aweme4 == null || (aid = aweme4.getAid()) == null) {
                    aid = "";
                }
                C1440005kM.LIZ(new C2038507yh(aid));
            }
        }
    }

    public C737360SwA(C1379170lzf c1379170lzf, InterfaceC1374230lrh interfaceC1374230lrh) {
        super(c1379170lzf, interfaceC1374230lrh);
        this.LLILZ = c1379170lzf;
        this.LLILZIL = c1379170lzf.LLJILJILJ;
    }
}
