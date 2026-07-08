package Y;

import X.C1001410cAN;
import X.C1001420cAO;
import X.C1017070cZd;
import X.C1022820ciu;
import X.C1042650dEt;
import X.C1043460dGC;
import X.C1490740otc;
import X.C1AF0;
import X.C1C7U;
import X.C20684815ws;
import X.C2184171Adz;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C786410Ut5;
import X.C999500c7I;
import X.EnumC1001380cAK;
import X.EnumC599900Nfw;
import X.ViewOnLayoutChangeListenerC998530c5j;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.feed.card.FeedAdLynxCard;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS3S1110000_16 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1490740otc c1490740otc = C1490740otc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPreconnectStatus, url: ");
        sbLIZ.append(this.s0);
        C1490740otc.LIZIZ(c1490740otc, C2188811AlT.LIZIZ(sbLIZ), null, "CommerceLandPageSSPContext_", 2);
        C1043460dGC c1043460dGC = C1043460dGC.LIZ;
        String str = this.s0;
        c1043460dGC.getClass();
        try {
            Uri uri = UriProtector.parse(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(uri.getScheme());
            sbLIZ2.append("://");
            sbLIZ2.append(uri.getHost());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (strLIZIZ != null && !a0.LJJJIL(strLIZIZ)) {
                if (!((C1042650dEt) this.l1).LJIILIIL.contains(strLIZIZ)) {
                    C1490740otc c1490740otc2 = C1490740otc.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("miss preconnect, ");
                    sbLIZ3.append(this.s0);
                    C1490740otc.LIZIZ(c1490740otc2, C2188811AlT.LIZIZ(sbLIZ3), null, "CommerceLandPageSSPContext_", 2);
                    ((C1042650dEt) this.l1).LJIIZILJ.add(strLIZIZ);
                    return;
                }
                C1490740otc c1490740otc3 = C1490740otc.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("hit preconnect, ");
                sbLIZ4.append(this.s0);
                C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ4), null, "CommerceLandPageSSPContext_", 2);
                ((C1042650dEt) this.l1).LJIILLIIL.add(strLIZIZ);
                if (this.z2) {
                    ((C1042650dEt) this.l1).LJIILL.add(strLIZIZ);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("socket reused, ");
                    sbLIZ5.append(this.s0);
                    C1490740otc.LIZIZ(c1490740otc3, C2188811AlT.LIZIZ(sbLIZ5), null, "CommerceLandPageSSPContext_", 2);
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "get host failed on network optimization");
        }
        C1490740otc c1490740otc4 = C1490740otc.LIZ;
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("domain null or blank, url: ");
        sbLIZ6.append(this.s0);
        C1490740otc.LIZIZ(c1490740otc4, C2188811AlT.LIZIZ(sbLIZ6), null, "CommerceLandPageSSPContext_", 2);
    }

    public final void LIZ$1() {
        String str;
        AwemeCommerceStruct commerceVideoAuthInfo;
        C999500c7I c999500c7I = (C999500c7I) this.l1;
        String str2 = c999500c7I.LLJJIII;
        String creativeId = null;
        if (str2 == null || str2.length() == 0) {
            FeedAdLynxCard feedAdLynxCard = c999500c7I.LLILZIL;
            str = (feedAdLynxCard == null || !feedAdLynxCard.LLJJJJJIL) ? "data_load_fail" : feedAdLynxCard.LLJJJJLIIL ? null : "load_timeout";
        } else {
            str = c999500c7I.LLJJIII;
        }
        if ((Intrinsics.LJFF(str, "comment_block") || Intrinsics.LJFF(str, "share_block")) && C1017070cZd.LJL(((C999500c7I) this.l1).LLJI) && !Intrinsics.LJFF(this.s0, "user_interact")) {
            return;
        }
        if (str == null || str.length() == 0) {
            C999500c7I c999500c7I2 = (C999500c7I) this.l1;
            if (!c999500c7I2.LLJILJIL || this.z2) {
                c999500c7I2.LLJILJIL = true;
                DataCenter dataCenter = c999500c7I2.LLILZLL;
                if (dataCenter != null) {
                    dataCenter.zQ2(Boolean.TRUE, "ad_feed_card_show_state");
                }
                DataCenter dataCenter2 = ((C999500c7I) this.l1).LLILZLL;
                if (dataCenter2 != null) {
                    dataCenter2.zQ2(Boolean.TRUE, "AD_ACTION_MOVE_OUT_DESC_AND_GONE");
                }
                C999500c7I c999500c7I3 = (C999500c7I) this.l1;
                FrameLayout frameLayout = c999500c7I3.LLILLL;
                if (frameLayout != null) {
                    frameLayout.addOnLayoutChangeListener((ViewOnLayoutChangeListenerC998530c5j) c999500c7I3.LLJILLL.getValue());
                }
                C999500c7I c999500c7I4 = (C999500c7I) this.l1;
                C786410Ut5.LJLIIL(200L, c999500c7I4.LLIZ, new ARunnableS21S1100000_16(c999500c7I4, this.s0, 6));
                return;
            }
            return;
        }
        FeedAdLynxCard feedAdLynxCard2 = ((C999500c7I) this.l1).LLILZIL;
        if (feedAdLynxCard2 != null) {
            String str3 = this.s0;
            if (str3 == null) {
                str3 = "normal";
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", feedAdLynxCard2.LLILZ);
            c1022820ciuLIZLLL.LIZJ("card", "refer");
            c1022820ciuLIZLLL.LIZIZ(str, "fail_reason");
            if (Intrinsics.LJFF(str, "load_timeout")) {
                c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(feedAdLynxCard2.LLJJIJI), "failed_reason_status");
            }
            C1001410cAN c1001410cAN = C1001410cAN.LIZIZ;
            c1022820ciuLIZLLL.LIZIZ(c1001410cAN.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT, "use_idle_preload");
            c1022820ciuLIZLLL.LIZIZ(str3, "show_type");
            if (c1001410cAN.LIZIZ()) {
                Aweme aweme = feedAdLynxCard2.LLILLL;
                C1001420cAO c1001420cAOLJIIIIZZ = c1001410cAN.LJIIIIZZ(aweme != null ? aweme.getAid() : null, EnumC1001380cAK.CARD_OPERATION, EnumC599900Nfw.FEED);
                c1022820ciuLIZLLL.LIZIZ((c1001420cAOLJIIIIZZ == null || !c1001420cAOLJIIIIZZ.LIZ()) ? CardStruct.IStatusCode.DEFAULT : "1", "idle_preload_status");
            }
            c1022820ciuLIZLLL.LJII();
            if (feedAdLynxCard2.LLILLL == null || !(!TextUtils.isEmpty(C1017070cZd.LJJJJ(r0)))) {
                return;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aweme2 = feedAdLynxCard2.LLILLL;
            if (aweme2 != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null) {
                creativeId = commerceVideoAuthInfo.getCreativeId();
            }
            c2344009Gk.LJIIIIZZ("cid", creativeId);
            c2344009Gk.LJIIIIZZ("enter_method", C1017070cZd.LJJJJ(feedAdLynxCard2.LLILLL));
            c2344009Gk.LJIIIIZZ("fail_reason", str);
            C20684815ws.LJIILLIIL("ad_feedback_other_show_fail", c2344009Gk.LIZ);
        }
    }

    public static final void run$0(ARunnableS3S1110000_16 aRunnableS3S1110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceLandPageSSPContext@54b7.onPreconnectStatus$1");
        try {
            aRunnableS3S1110000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceLandPageSSPContext@54b7.onPreconnectStatus$1");
    }

    public static final void run$1(ARunnableS3S1110000_16 aRunnableS3S1110000_16) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAdCardDelegate@b34a.show$showRunnable$1");
        try {
            aRunnableS3S1110000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAdCardDelegate@b34a.show$showRunnable$1");
    }

    public ARunnableS3S1110000_16(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
