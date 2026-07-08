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
import com.ss.android.ugc.aweme.feed.landscape.weeklyreport.WeeklyReportIncentivesSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11XG, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@InterfaceC20647615qs("traffic_incentives_weekly_report_profile_promo")
public final class C11XG extends AbstractC20660115st<View> {
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

    public final WeeklyReportIncentivesSettings.WeeklyReportProfileConfig LJIIL() {
        return (WeeklyReportIncentivesSettings.WeeklyReportProfileConfig) this.LLILLL.getValue();
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return C11XF.LIZIZ();
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        String str;
        WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfigLJIIL;
        String str2;
        int iIntValue;
        View viewFindViewById;
        Integer num;
        String str3;
        WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfigLJIIL2 = LJIIL();
        String str4 = "";
        if (weeklyReportProfileConfigLJIIL2 == null || (str = weeklyReportProfileConfigLJIIL2.h5Url) == null) {
            str = "";
        }
        C1257230ioz c1257230ioz = this.LLILLJJLI;
        C20514915Pf c20514915Pf = null;
        if (c1257230ioz != null) {
            C20515215Pi c20515215Pi = c1257230ioz.LIZ;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.drawable.d06;
            c20515215Pi.LJFF(c419910GdJ);
            c20515215Pi.LIZ.LJIILIIL = new ACListenerS131S0200000_29(this, c20515215Pi, 49);
            WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfigLJIIL3 = LJIIL();
            if (weeklyReportProfileConfigLJIIL3 != null && weeklyReportProfileConfigLJIIL3.text != null && (weeklyReportProfileConfigLJIIL = LJIIL()) != null && weeklyReportProfileConfigLJIIL.highlightText != null) {
                WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfigLJIIL4 = LJIIL();
                if (weeklyReportProfileConfigLJIIL4 == null || (str2 = weeklyReportProfileConfigLJIIL4.text) == null) {
                    str2 = "";
                }
                WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfigLJIIL5 = LJIIL();
                if (weeklyReportProfileConfigLJIIL5 != null && (str3 = weeklyReportProfileConfigLJIIL5.highlightText) != null) {
                    str4 = str3;
                }
                SpannableString spannableString = new SpannableString(str2);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan((int) 4294847573L), spannableString.length() - str4.length(), spannableString.length(), 33);
                C786410Ut5.p2(spannableString, new StyleSpan(1), spannableString.length() - str4.length(), spannableString.length(), 33);
                c20515215Pi.LIZ.LJFF = spannableString;
                WeeklyReportIncentivesSettings.WeeklyReportProfileConfig weeklyReportProfileConfigLJIIL6 = LJIIL();
                if (weeklyReportProfileConfigLJIIL6 != null && (num = weeklyReportProfileConfigLJIIL6.timeIntervalForAutoDismiss) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                c20515215Pi.LIZ.LIZIZ = ((long) iIntValue) * 1000;
                c20515215Pi.LJ();
                c20514915Pf = c20515215Pi.LJ;
                if (c20514915Pf != null && (viewFindViewById = c20514915Pf.findViewById(R.id.evm)) != null) {
                    viewFindViewById.setClickable(true);
                    C786410Ut5.I7(new ACListenerS63S1200000_29(this, str, c20515215Pi, 1), viewFindViewById);
                }
                Keva keva = this.LLILZ;
                keva.storeInt("weekly_report_popup_show", keva.getInt("weekly_report_popup_show", 0) + 1);
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("current_page", "profile_page");
                C20684815ws.LJIILLIIL("traffic_incentive_strategy_notice_show", c2344009Gk.LIZ);
            }
        }
        return c20514915Pf;
    }

    public C11XG(C0TGX c0tgx, C19EG c19eg, C1257230ioz c1257230ioz) {
        super(c0tgx);
        this.LL = c19eg;
        this.LLILLJJLI = c1257230ioz;
        this.LLILLL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(80));
        this.LLILZ = Keva.getRepo(C11XF.LIZ());
        this.LLILZIL = new BPEAHandler(Looper.getMainLooper());
    }
}
