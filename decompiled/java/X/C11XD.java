package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS63S1200000_29;
import android.app.Activity;
import android.os.Looper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.landscape.trafficincentives.OneMinuteTrafficIncentivesSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.11XD, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@InterfaceC20647615qs("profile_long_video_traffic_incentive_promo")
public final class C11XD extends AbstractC20660115st<View> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final Activity LL;
    public final C1257230ioz LLILLJJLI;
    public final C01GW LLILLL;
    public final Keva LLILZ;
    public final BPEAHandler LLILZIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public final OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig LJIIL() {
        return (OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig) this.LLILLL.getValue();
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return C11XE.LIZIZ();
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        String str;
        OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfigLJIIL;
        String str2;
        int iIntValue;
        View viewFindViewById;
        Integer num;
        String str3;
        C1257230ioz c1257230ioz = this.LLILLJJLI;
        C20514915Pf c20514915Pf = null;
        if (c1257230ioz != null) {
            C20515215Pi c20515215Pi = c1257230ioz.LIZ;
            OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfigLJIIL2 = LJIIL();
            String str4 = "";
            if (oneMinuteTrafficProfileConfigLJIIL2 == null || (str = oneMinuteTrafficProfileConfigLJIIL2.h5Url) == null) {
                str = "";
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.drawable.d06;
            c20515215Pi.LJFF(c419910GdJ);
            c20515215Pi.LIZ.LJIILIIL = new ACListenerS131S0200000_29(this, c20515215Pi, 24);
            OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfigLJIIL3 = LJIIL();
            if (oneMinuteTrafficProfileConfigLJIIL3 != null && oneMinuteTrafficProfileConfigLJIIL3.text != null && (oneMinuteTrafficProfileConfigLJIIL = LJIIL()) != null && oneMinuteTrafficProfileConfigLJIIL.highlightText != null) {
                OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfigLJIIL4 = LJIIL();
                if (oneMinuteTrafficProfileConfigLJIIL4 == null || (str2 = oneMinuteTrafficProfileConfigLJIIL4.text) == null) {
                    str2 = "";
                }
                OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfigLJIIL5 = LJIIL();
                if (oneMinuteTrafficProfileConfigLJIIL5 != null && (str3 = oneMinuteTrafficProfileConfigLJIIL5.highlightText) != null) {
                    str4 = str3;
                }
                SpannableString spannableString = new SpannableString(str4);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan((int) 4294847573L), 0, spannableString.length(), 33);
                C786410Ut5.p2(spannableString, new StyleSpan(1), 0, spannableString.length(), 33);
                String strLJJJLL = a0.LJJJLL(str4, str2);
                C1057450dcl c1057450dcl = c20515215Pi.LIZ;
                c1057450dcl.LJ = strLJJJLL;
                c1057450dcl.LJFF = spannableString;
                OneMinuteTrafficIncentivesSettings.OneMinuteTrafficProfileConfig oneMinuteTrafficProfileConfigLJIIL6 = LJIIL();
                if (oneMinuteTrafficProfileConfigLJIIL6 != null && (num = oneMinuteTrafficProfileConfigLJIIL6.timeIntervalForAutoDismiss) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c20515215Pi.LIZ.LIZIZ = ((long) iIntValue) * 1000;
                c20515215Pi.LJ();
                c20514915Pf = c20515215Pi.LJ;
                if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
                    viewFindViewById.setClickable(true);
                    C786410Ut5.I7(new ACListenerS63S1200000_29(this, str, c20515215Pi, 0), viewFindViewById);
                }
                Keva keva = this.LLILZ;
                keva.storeInt("traffic_incentives_popup_show", keva.getInt("traffic_incentives_popup_show", 0) + 1);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("current_page", "profile_page");
                C20684815ws.LJIILLIIL("traffic_incentive_activity_notice_show", c2344009Gk.LIZ);
            }
        }
        return c20514915Pf;
    }

    public C11XD(C0TGX c0tgx, C19EG c19eg, C1257230ioz c1257230ioz) {
        super(c0tgx);
        this.LL = c19eg;
        this.LLILLJJLI = c1257230ioz;
        this.LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(79));
        this.LLILZ = Keva.getRepo(C11XE.LIZ());
        this.LLILZIL = new BPEAHandler(Looper.getMainLooper());
    }
}
