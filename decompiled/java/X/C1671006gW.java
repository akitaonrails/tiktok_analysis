package X;

import Y.ACListenerS137S0100000_2;
import Y.ARunnableS102S0100000_2;
import Y.ARunnableS11S0400000_2;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.IFollowService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.messagelist.api.helper.ISystemContentTemplateParser;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS25S1201000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06gW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1671006gW extends LinearLayout implements C06OA {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final /* synthetic */ C06ME LL;
    public SessionInfo LLILLJJLI;
    public final C01GW LLILLL;
    public TuxTextView LLILZ;
    public C422800Ghy LLILZIL;
    public TuxIconView LLILZLL;
    public TuxTextView LLIZ;
    public C197039127h LLIZLLLIL;
    public TuxIconView LLJ;
    public TextView LLJI;
    public TuxIconView LLJIJIL;

    private final int getAdvanceLayoutRes() {
        return R.layout.cfo;
    }

    private final int getTopCardLayoutRes() {
        return R.layout.cfp;
    }

    public final void LIZIZ() {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C786410Ut5.f0(this, 8);
        LLZLI();
        PrivacySettingsFeature privacySettings = getPrivacySettings();
        if (privacySettings != null) {
            privacySettings.LJJII("direct_message");
        }
    }

    @Override // X.C06OA
    public final void LLLZIL(C06MF c06mf) {
        this.LL.LLLZIL(c06mf);
    }

    @Override // X.C06OA
    public final void LLZLI() {
        this.LL.LLZLI();
    }

    public final int getNormalLayoutRes() {
        return R.layout.cfq;
    }

    @Override // X.C06OA
    public final void l(C06MF c06mf) {
        this.LL.l(c06mf);
    }

    private final IMUser getFromUser() {
        C909290Zln c909290Zln;
        SessionInfo sessionInfo = this.LLILLJJLI;
        if (!(sessionInfo instanceof C909290Zln) || (c909290Zln = (C909290Zln) sessionInfo) == null) {
            return null;
        }
        return c909290Zln.getFromUser();
    }

    private final String getSecUid() {
        IMUser fromUser;
        String secUid;
        SessionInfo sessionInfo = this.LLILLJJLI;
        return (!(sessionInfo instanceof C909290Zln) || (fromUser = ((C909290Zln) sessionInfo).getFromUser()) == null || (secUid = fromUser.getSecUid()) == null) ? "" : secUid;
    }

    public final void LIZ() {
        IImDmProminenceAnalytics.LIZ.getClass();
        IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
        if (iImDmProminenceAnalyticsLIZ != null) {
            iImDmProminenceAnalyticsLIZ.LJ(this.LLILLJJLI, C0I0B.LJFF.LIZIZ());
        }
        IFollowService iFollowService = (IFollowService) PluggableExtentionKt.pluggableSpiForReal(IFollowService.class);
        if (iFollowService == null) {
            return;
        }
        iFollowService.sendRequest(getUid(), getSecUid(), 1, new InterfaceC1252460ihI() { // from class: X.06gX
            @Override // X.InterfaceC1252460ihI
            public final void LIZIZ() {
                C1481605r4.LIZIZ(new ARunnableS102S0100000_2(this.LIZ, 41));
            }

            @Override // X.InterfaceC1252460ihI
            public final void LIZ(Exception exc) {
                C0XIR c0xir;
                C0XIR c0xir2;
                String string = this.LIZ.getContext().getString(2131835702);
                this.LIZ.getContext();
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!C036E.LIZ.LIZIZ()) {
                    string = this.LIZ.getContext().getString(R.string.m25);
                } else if ((exc instanceof C0XIR) && (c0xir2 = (C0XIR) exc) != null && c0xir2.getErrorMsg().length() > 0) {
                    string = c0xir2.getErrorMsg();
                } else {
                    Throwable cause = exc.getCause();
                    if ((cause instanceof C0XIR) && (c0xir = (C0XIR) cause) != null && c0xir.getErrorMsg().length() > 0) {
                        string = c0xir.getErrorMsg();
                    }
                }
                C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
                c1389890mGx.LJIIJ(string);
                c1389890mGx.LJIIJJI();
            }
        });
    }

    public final PrivacySettingsFeature getPrivacySettings() {
        return (PrivacySettingsFeature) this.LLILLL.getValue();
    }

    public final String getUid() {
        IMUser fromUser;
        String uid;
        SessionInfo sessionInfo = this.LLILLJJLI;
        return (!(sessionInfo instanceof C909290Zln) || (fromUser = ((C909290Zln) sessionInfo).getFromUser()) == null || (uid = fromUser.getUid()) == null) ? "" : uid;
    }

    public final TextView getImChatTopTipsText() {
        return this.LLJI;
    }

    public final TuxIconView getImChatTopTipsX() {
        return this.LLJIJIL;
    }

    public final SessionInfo getSessionInfo() {
        return this.LLILLJJLI;
    }

    public final C422800Ghy getTopAvatarImageView() {
        return this.LLILZIL;
    }

    public final TuxIconView getTopCloseView() {
        return this.LLJ;
    }

    public final TuxTextView getTopFollowButton() {
        return this.LLIZ;
    }

    public final TuxIconView getTopLeftIcon() {
        return this.LLILZLL;
    }

    public final C197039127h getTopSetButton() {
        return this.LLIZLLLIL;
    }

    public final TuxTextView getTopTipText() {
        return this.LLILZ;
    }

    public static void LIZJ(int i) {
        IRemindUsersAnalytics.LIZ.getClass();
        IRemindUsersAnalytics iRemindUsersAnalyticsLIZ = C1671906gf.LIZ();
        if (iRemindUsersAnalyticsLIZ != null) {
            iRemindUsersAnalyticsLIZ.LJ(i, C0I0B.LJFF.LIZIZ(), "chat_page", "chat_room");
        }
    }

    public static void LIZLLL(C1671006gW c1671006gW) {
        String strLJIIIIZZ;
        C197039127h c197039127h = c1671006gW.LLIZLLLIL;
        if (c197039127h != null) {
            c197039127h.setLoading(true);
        }
        PrivacySettingsFeature privacySettings = c1671006gW.getPrivacySettings();
        if (privacySettings == null || (strLJIIIIZZ = privacySettings.LJIIIIZZ()) == null) {
            strLJIIIIZZ = "";
        }
        PrivacySettingsFeature privacySettings2 = c1671006gW.getPrivacySettings();
        if (privacySettings2 != null) {
            privacySettings2.LJFF("direct_message", 2, C11S5.LIZ(), C1701940uOG.LIZIZ(), new AwS25S1201000_2(c1671006gW, null, strLJIIIIZZ, 1), new AwS581S0100000_2(c1671006gW, 376), true);
        }
    }

    private final void setupCardBannerViews(int i) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C786410Ut5.Sd(getTopCardLayoutRes(), C786410Ut5.ne(getContext()), this);
        this.LLILZLL = (TuxIconView) findViewById(R.id.yb6);
        this.LLILZ = (TuxTextView) findViewById(R.id.ydx);
        this.LLIZLLLIL = (C197039127h) findViewById(R.id.yd4);
        this.LLJ = (TuxIconView) findViewById(R.id.y_a);
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(i);
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
    }

    public final void LJFF(SystemContent systemContent) {
        ISystemContentTemplateParser.LIZ.getClass();
        ISystemContentTemplateParser value = C1671306gZ.LIZIZ.getValue();
        if (value != null) {
            value.LIZ(new C1672606gm(systemContent, new C0ZQZ(R.id.ydx, new C1671606gc(this)), C1671406ga.LIZ(), 0, null, null, getFromUser(), this.LLILLJJLI, 32));
        }
    }

    public final void LJI(String str) {
        SessionInfo sessionInfo;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        C786410Ut5.Sd(getNormalLayoutRes(), C786410Ut5.ne(getContext()), this);
        this.LLILZ = (TuxTextView) findViewById(R.id.ydx);
        this.LLIZ = (TuxTextView) findViewById(R.id.ya7);
        this.LLIZLLLIL = (C197039127h) findViewById(R.id.yd4);
        this.LLJ = (TuxIconView) findViewById(R.id.y_a);
        this.LLILZIL = (C422800Ghy) findViewById(R.id.y9e);
        if (Intrinsics.LJFF(str, "perm_on_reminder_banner")) {
            PrivacySettingsFeature privacySettings = getPrivacySettings();
            if (privacySettings != null && privacySettings.LJI() && (sessionInfo = this.LLILLJJLI) != null && !sessionInfo.isReportPage()) {
                C786410Ut5.f0(this, 0);
                C197039127h c197039127h = this.LLIZLLLIL;
                if (c197039127h != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS137S0100000_2(this, 31));
                    C786410Ut5.LLLLLLJ(c197039127h, 0);
                    IRemindUsersAnalytics.LIZ.getClass();
                    IRemindUsersAnalytics iRemindUsersAnalyticsLIZ = C1671906gf.LIZ();
                    if (iRemindUsersAnalyticsLIZ != null) {
                        iRemindUsersAnalyticsLIZ.LIZ("chat_page", "chat_room", C0I0B.LJFF.LIZIZ());
                    }
                }
                TuxIconView tuxIconView = this.LLJ;
                if (tuxIconView != null) {
                    C786410Ut5.a9(tuxIconView, new ACListenerS137S0100000_2(this, 32));
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    return;
                }
                return;
            }
            LIZIZ();
            return;
        }
        if (Intrinsics.LJFF(str, "perm_on_reminder_banner")) {
            return;
        }
        C786410Ut5.f0(this, 0);
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView == null) {
            return;
        }
        C786410Ut5.h9(tuxTextView, new ACListenerS137S0100000_2(this, 33));
        tuxTextView.setText(2131834735);
        tuxTextView.setTuxFont(62);
    }

    public final void setImChatTopTipsText(TextView textView) {
        this.LLJI = textView;
    }

    public final void setImChatTopTipsX(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setSessionInfo(SessionInfo sessionInfo) {
        this.LLILLJJLI = sessionInfo;
    }

    public final void setTopAvatarImageView(C422800Ghy c422800Ghy) {
        this.LLILZIL = c422800Ghy;
    }

    public final void setTopCloseView(TuxIconView tuxIconView) {
        this.LLJ = tuxIconView;
    }

    public final void setTopFollowButton(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setTopLeftIcon(TuxIconView tuxIconView) {
        this.LLILZLL = tuxIconView;
    }

    public final void setTopSetButton(C197039127h c197039127h) {
        this.LLIZLLLIL = c197039127h;
    }

    public final void setTopTipText(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public C1671006gW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new C06ME();
        this.LLILLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(804));
        C786410Ut5.f0(this, 8);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
    }

    public final void LJ(String str, String str2, Function0 function0, Function1 function1) {
        setupCardBannerViews(R.raw.icon_bitmap_horn);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iLJJJ = a0.LJJJ(spannableStringBuilder, "%1$s", 0, false, 6);
        if (iLJJJ != -1) {
            spannableStringBuilder.replace(iLJJJ, iLJJJ + 4, (CharSequence) str2);
            C786410Ut5.q2(spannableStringBuilder, new C1766806vy(function0, this, 1), iLJJJ, str2.length() + iLJJJ, 33);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(spannableStringBuilder);
            tuxTextView.setHighlightColor(0);
            tuxTextView.setTuxFont(61);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        } else {
            tuxTextView = null;
        }
        TuxIconView tuxIconView = this.LLJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
            HandlerHook.viewPost(tuxIconView, new ARunnableS11S0400000_2(tuxTextView, this, tuxIconView, function1, 1));
        }
        C786410Ut5.f0(this, 0);
    }
}
