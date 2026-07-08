package X;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS135S1100000_21;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0lNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1355450lNP {
    public static final /* synthetic */ int LJFF = 0;
    public final Fragment LIZ;
    public final C19EG LIZIZ;
    public final GiftViewModel LIZJ;
    public CommentContextSource LIZLLL;
    public C197039127h LJ;

    public static void LJFF() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "recharge_panel");
        C20684815ws.LJIILLIIL("click_recharge_learn_more", c2344009Gk.LIZ);
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(EnumC1913590ztd.GIFT_RECHARGE_PAGE.getValue(), "virtual-items", false, true, false, null, false, 116), new InterfaceC1913620ztg() { // from class: X.0lNS
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public final CommentContextSource LIZLLL() {
        if (this.LIZLLL == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this.LIZ, null), "source_default_key", CommentContextSource.class, null);
            this.LIZLLL = interfaceC1555100qZQLIZIZ != null ? (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LIZLLL;
    }

    public final void LJIIIIZZ() {
        C197039127h c197039127h = this.LJ;
        if (c197039127h != null) {
            c197039127h.setText(C786410Ut5.P3(this.LIZIZ).getString(2131847371));
        }
    }

    public static void LJII() {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ();
        if (iCompliancePolicyServiceLJIIIIZZ != null) {
            EnumC1913590ztd.GIFT_RECHARGE_PAGE.getValue();
            iCompliancePolicyServiceLJIIIIZZ.LIZLLL();
        }
    }

    public final String LIZ() {
        Aweme aweme;
        String authorUid;
        CommentContextSource commentContextSourceLIZLLL = LIZLLL();
        return (commentContextSourceLIZLLL == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceLIZLLL)) == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) ? "" : authorUid;
    }

    public final String LIZIZ() {
        String strEnterFrom = CommentContextSourceKt.enterFrom(LIZLLL());
        return strEnterFrom == null ? "" : strEnterFrom;
    }

    public final String LIZJ() {
        CommentCommonModel commonModel;
        Aweme aweme;
        String aid;
        CommentContextSource commentContextSourceLIZLLL = LIZLLL();
        return (commentContextSourceLIZLLL == null || (commonModel = commentContextSourceLIZLLL.getCommonModel()) == null || (aweme = commonModel.aweme) == null || (aid = aweme.getAid()) == null) ? "" : aid;
    }

    public final void LJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", LIZIZ());
        c2344009Gk.LJIIIIZZ("group_id", LIZJ());
        c2344009Gk.LJIIIIZZ("author_id", LIZ());
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJ(this.LIZJ.vQ2().getValue(), "current_balance");
        C20684815ws.LJIILLIIL("dismiss_underage_recharge_prompt", c2344009Gk.LIZ);
    }

    public final void LJI(long j, String str) {
        ForegroundColorSpan foregroundColorSpan;
        if (!C1350950lG9.LIZIZ.LIZJ()) {
            return;
        }
        InterfaceC20318714ev interfaceC20318714evB4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4();
        Boolean bool = (Boolean) interfaceC20318714evB4.LIZJ(Boolean.TRUE, "can_recharge");
        Integer num = (Integer) interfaceC20318714evB4.LIZJ(18, "low_age_user_limit");
        String str2 = "";
        String str3 = (String) interfaceC20318714evB4.LIZJ("", "live_sdk_appeal_webview");
        if (C199499133x.LIZ(str3)) {
            if (C2222691Bz1.LJIIIIZZ()) {
                str3 = "sslocal://webcast_webview?url=https%3A%2F%2Finapp.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                str3 = "sslocal://webcast_webview?url=https%3A%2F%2Finapp-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        if (!bool.booleanValue()) {
            int iIntValue = num.intValue();
            C19EG c19eg = this.LIZIZ;
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LIZIZ(c19eg.getResources().getString(2131858225, String.valueOf(iIntValue)));
            C985403tE.LIZ(c1397580mTM, new AwS135S1100000_21(this, str3, 8));
            new C1397510mTF(c1397580mTM).LIZLLL();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", LIZIZ());
            c2344009Gk.LJIIIIZZ("group_id", LIZJ());
            c2344009Gk.LJIIIIZZ("author_id", LIZ());
            c2344009Gk.LJ(this.LIZJ.vQ2().getValue(), "current_balance");
            C20684815ws.LJIILLIIL("show_underage_recharge_prompt", c2344009Gk.LIZ);
            return;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("video_enter_from", LIZIZ());
        pairArr[1] = new Pair("video_enter_method", LIZIZ());
        pairArr[2] = new Pair("video_group_id", LIZJ());
        pairArr[3] = new Pair("video_author_id", LIZ());
        String str4 = this.LIZJ.LLJ;
        if (str4 != null) {
            str2 = str4;
        }
        pairArr[4] = new Pair("video_request_id", str2);
        pairArr[5] = new Pair("charge_reason", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        Bundle bundle = new Bundle();
        bundle.putInt("key_bundle_charge_source", 4);
        C786410Ut5.LJJJI("key_charge_reason", "short_video", bundle);
        C1355500lNU c1355500lNU = new C1355500lNU();
        if (!VideoGiftService.LJI().LIZLLL()) {
            c1355500lNU.LIZ = new C1355560lNa(this.LIZIZ.getResources().getString(2131858224), this.LIZIZ.getResources().getString(2131858222), this.LIZIZ.getResources().getString(2131858223));
            String string = this.LIZIZ.getResources().getString(2131858224);
            String string2 = this.LIZIZ.getResources().getString(2131858222);
            String string3 = this.LIZIZ.getResources().getString(2131858223);
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ), R.layout.a4j, null, false);
            ((TextView) viewTd.findViewById(R.id.swn)).setText(string);
            TextView textView = (TextView) viewTd.findViewById(R.id.sw3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string2);
            sbLIZ.append("  ");
            sbLIZ.append(string3);
            sbLIZ.append("  ");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_fill_ltr;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C419890GdH c419890GdH = new C419890GdH(c419910GdJ.LIZ(this.LIZIZ), 2);
            StyleSpan styleSpan = new StyleSpan(1);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nk, this.LIZIZ);
            if (numLIZJ != null) {
                foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            } else {
                foregroundColorSpan = null;
            }
            int iLJJJ = a0.LJJJ(strLIZIZ, string3, 0, false, 6);
            int length = string3.length() + iLJJJ;
            C786410Ut5.p2(spannableString, styleSpan, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, foregroundColorSpan, iLJJJ, length, 33);
            C786410Ut5.p2(spannableString, c419890GdH, strLIZIZ.length() - 1, strLIZIZ.length(), 33);
            C1401770ma7 c1401770ma7 = new C1401770ma7(this, 1);
            LJII();
            C786410Ut5.p2(spannableString, c1401770ma7, iLJJJ, strLIZIZ.length(), 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            c1355500lNU.LIZIZ = viewTd;
        } else {
            c1355500lNU.LIZ = null;
            bundle.putLong("key_bundle_total_coins", j);
        }
        ((HashMap) c1355500lNU.LIZJ).putAll(mapLJIIIIZZ);
        DialogFragment dialogFragmentCreateRechargeDialogFragment = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().createRechargeDialogFragment(this.LIZIZ, new InterfaceC1806230x6T() { // from class: X.0lDQ
            @Override // X.InterfaceC1806230x6T
            public final void LIZIZ(int i, int i2, String str5) {
            }

            @Override // X.InterfaceC1806230x6T
            public final void LIZ() {
                this.LIZ.getClass();
                C1355450lNP.LJFF();
            }

            @Override // X.InterfaceC1806230x6T
            public final void LIZJ() {
                this.LIZ.getClass();
                C1355450lNP.LJII();
            }

            @Override // X.InterfaceC1806230x6T
            public final void onFail() {
                C1355450lNP c1355450lNP = this.LIZ;
                c1355450lNP.LIZJ.BQ2(0, 0L, c1355450lNP.LIZIZ, "from_recharge");
            }

            @Override // X.InterfaceC1806230x6T
            public final void onSuccess(long j2) {
                C1355450lNP c1355450lNP = this.LIZ;
                c1355450lNP.LIZJ.BQ2(1, j2, c1355450lNP.LIZIZ, "from_recharge");
                this.LIZ.LJIIIIZZ();
            }
        }, bundle, c1355500lNU.LIZ());
        if (dialogFragmentCreateRechargeDialogFragment != null) {
            dialogFragmentCreateRechargeDialogFragment.showNow(this.LIZ.getChildFragmentManager(), "CommentGiftChoosePanel");
        }
    }

    public C1355450lNP(Fragment fragment, C19EG c19eg, GiftViewModel giftViewModel) {
        this.LIZ = fragment;
        this.LIZIZ = c19eg;
        this.LIZJ = giftViewModel;
    }
}
