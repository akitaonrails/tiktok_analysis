package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.ICommerceToolsTcmService;
import com.ss.android.ugc.aweme.ecommerce.publish.aidubbing.IAIDubbingService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS82S1000000_32;

/* JADX INFO: renamed from: X.1940, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1940 extends C193N<InterfaceC855180Xgi, C190T, C10J1> implements InterfaceC855180Xgi {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public static final int LLJJJJ;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public AnonymousClass1944 LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public final C01GW LLJJIII;
    public final Function0<C190T> LLJJIJI;
    public final C10J1 LLJJIJIIJIL;
    public final InterfaceC1738600vLO LLJJIJIL;
    public final C10J3 LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1940.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1940.class, "context", "getContext()Landroid/content/Context;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1940.class, "moreOptionsPanelApiComponent", "getMoreOptionsPanelApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/MoreOptionsPanelApiComponent;", 0);
        c09r3.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJJJ = 8;
    }

    private final void R5() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 3600.0f);
        valueAnimatorOfFloat.setDuration(3600L);
        String string = getContext().getString(2131822786);
        String string2 = getContext().getString(2131822787);
        final SpannableString spannableString = new SpannableString(string);
        final SpannableString spannableString2 = new SpannableString(string2);
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, getContext());
        final int iIntValue = numLIZJ != null ? numLIZJ.intValue() : 0;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, getContext());
        final int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1k, getContext());
        final int iIntValue3 = numLIZJ3 != null ? numLIZJ3.intValue() : 0;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.1945
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int iIntValue4;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue <= 3000.0f) {
                    iIntValue4 = iIntValue;
                } else if (fFloatValue > 3000.0f && fFloatValue <= 3300.0f) {
                    iIntValue4 = ((Integer) argbEvaluator.evaluate((fFloatValue - LivePreCreateNextRoomPlayer.ENABLE) / 300.0f, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2))).intValue();
                } else {
                    iIntValue4 = ((Integer) argbEvaluator.evaluate((fFloatValue - 3300) / 300.0f, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3))).intValue();
                }
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue4), 0, spannableString.length(), 33);
                C786410Ut5.p2(spannableString2, new ForegroundColorSpan(iIntValue4), 0, spannableString2.length(), 33);
                this.i3(new AnonymousClass1946(fFloatValue, spannableString, spannableString2));
            }
        });
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("redesign_more_option_hint", 0);
        if (i <= 10) {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("redesign_more_option_hint", i + 1);
        }
        valueAnimatorOfFloat.start();
        this.LLJILJILJ = true;
        String creationId = Z4().getCreationId();
        if (C1441320nbu.LJFF(creationId)) {
            return;
        }
        Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeString("has_show_ugc_template_tips", creationId);
    }

    private final void C5() {
        this.LLJI = AnonymousClass1944.AI_DUBBING;
        this.LLJILLL = true;
        i3(new AwS611S0100000_32(this, 101));
        this.LLJIJIL = false;
        this.LLJILJIL = false;
    }

    private final void D5() {
        String string;
        if (this.LLJIJIL && ((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LJIIJJI()) {
            this.LLJILJIL = true;
            this.LLJI = AnonymousClass1944.BC;
            string = getContext().getString(2131849967);
        } else if (((ICommerceToolsTcmService) ServiceManager.get().getService(ICommerceToolsTcmService.class)).LJIIJJI()) {
            this.LLJILJIL = true;
            this.LLJI = AnonymousClass1944.BC;
            string = getContext().getString(2131849968);
        } else {
            string = "";
        }
        if (string.length() > 0) {
            i3(new AwS82S1000000_32(string, 3));
        }
    }

    private final void E5() {
        this.LLJI = AnonymousClass1944.BULLETIN_AUTO_SHARE;
        i3(new AwS611S0100000_32(this, 102));
        Z4().creativeModel.transientPostPageModel.LJJJZ = true;
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bb_auto_share_show_times");
        sbLIZ.append(C0XQ7.LJFF().getCurUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        repo.storeInt(strLIZIZ, repo.getInt(strLIZIZ, 0) + 1);
    }

    private final void H5() {
        this.LLJI = AnonymousClass1944.PRIVACY;
        i3(new AwS611S0100000_32(this, 103));
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("new_more_option_hint", 0);
        if (i < 3) {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("new_more_option_hint", i + 1);
        }
    }

    private final void M5() {
        this.LLJI = AnonymousClass1944.PRIVACY_DEFAULT_ON;
        i3(new AwS611S0100000_32(this, 104));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("type", "comment_reuse_content");
        C20684815ws.LJIILLIIL("show_disclosure_privacy_status", c2344009Gk.LIZ);
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("privacy_setting_default_on");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    private final void N5() {
        this.LLJI = AnonymousClass1944.TEMPLATE;
        i3(new AwS611S0100000_32(this, 105));
        this.LLJIJIL = false;
        this.LLJILJIL = false;
    }

    private final InterfaceC214732191u d5() {
        return (InterfaceC214732191u) this.LLJ.getValue(this, LLJJJIL[2]);
    }

    private final IAVPublishPageUIRefactorService k5() {
        return (IAVPublishPageUIRefactorService) this.LLJJIII.getValue();
    }

    private final void n5() {
        String string;
        int i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0);
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishEnhancement -> clickAdvancedSettingsTimes = ");
        sbLIZ.append(i);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        boolean z = i < 3;
        boolean zLIZ = C1442630ne1.LIZ();
        if (z && zLIZ) {
            this.LLJI = AnonymousClass1944.HD;
            this.LLJIJIL = true;
            string = getContext().getString(2131845609);
        } else {
            string = null;
        }
        i3(new AwS82S1000000_32(string, 2));
    }

    public final VideoPublishEditModel Z4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJJIL[0]);
    }

    public final Context getContext() {
        return (Context) this.LLIZLLLIL.getValue(this, LLJJJIL[1]);
    }

    @Override // X.InterfaceC855180Xgi
    public void sU1() {
        if (this.LLJIJIL) {
            i3(AFwS278S0000000_32.get$arr$(68));
            this.LLJIJIL = false;
            D5();
        }
    }

    private final boolean K4() {
        if (C1428470nHB.LJJZZI(Z4())) {
            return false;
        }
        return !(Z4().mIsFromDraft && C1441320nbu.LJ()) && !this.LLJILJILJ && C376910Eq9.LIZIZ(Z4()) && C376910Eq9.LIZLLL(Z4()) && !C1441320nbu.LJ() && C1441320nbu.LIZIZ() && !C288140BRc.LIZ() && this.LLJI == AnonymousClass1944.TEMPLATE;
    }

    private final boolean P4() {
        return Z4().creativeModel.transientPostPageModel.LJJIIZI;
    }

    @Override // X.InterfaceC855180Xgi
    public void Lj1() {
        t5(C1428470nHB.LJJZZI(Z4()), false);
        if (K4()) {
            R5();
        }
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        t5(C1428470nHB.LJJZZI(Z4()), false);
    }

    public final int T4() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorServiceK5 = k5();
        return (iAVPublishPageUIRefactorServiceK5 == null || !iAVPublishPageUIRefactorServiceK5.enableRefactorPublishIcon()) ? R.raw.icon_ellipsis_horizontal : R.raw.icon_gear;
    }

    @Override // X.InterfaceC855180Xgi
    public void xz() {
        t5(C1428470nHB.LJJZZI(Z4()), true);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJJ;
    }

    public C10J1 O4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190T> o2() {
        return this.LLJJIJI;
    }

    public AnonymousClass1940(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), Context.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC214732191u.class, null);
        this.LLJI = AnonymousClass1944.NONE;
        this.LLJJI = "";
        this.LLJJIII = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(91));
        this.LLJJIJI = new AwS576S0100000_32(this, 282);
        this.LLJJIJIIJIL = new C10J1(new AwS611S0100000_32(this, 97), null);
        this.LLJJIJIL = EnumC214771193h.MORE;
        this.LLJJJ = AnonymousClass1938.LIZ;
    }

    @Override // X.InterfaceC855180Xgi
    public void T32(boolean z) {
        if (z) {
            this.LLJJI = "";
            i3(new AwS611S0100000_32(this, 99));
            Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
        } else {
            this.LLJJI = "";
            i3(new AwS611S0100000_32(this, 100));
        }
    }

    @Override // X.InterfaceC855180Xgi
    public void nw(boolean z) {
        i3(new AwS44S0010000_32(z, 4));
    }

    public final void x5(boolean z) {
        IAIDubbingService iAIDubbingService;
        int i;
        if (!z) {
            return;
        }
        C1653260t7k.LIZ("click_publish_more_entrance");
        C19721512Eb c19721512Eb = C19721512Eb.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = Z4();
        c19721512Eb.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModelZ4.getCreationId());
        c0lab.LJ("enter_from", "video_post_page");
        c0lab.LJ("shoot_way", videoPublishEditModelZ4.mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModelZ4));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModelZ4));
        C580270MpN.LIZIZ(videoPublishEditModelZ4, c0lab, false);
        C20684815ws.LJIILLIIL("click_advanced_settings_entrance", c0lab.LIZ);
        C10HZ.LIZ.getClass();
        C10HZ.LIZIZ = false;
        d5().LIZ();
        i3(new AwS611S0100000_32(this, 98));
        if (P4()) {
            Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
            i3(AFwS278S0000000_32.get$arr$(69));
        }
        if (this.LLJIJIL && (i = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("click_advanced_settings_times", 0)) < 3) {
            Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeInt("click_advanced_settings_times", i + 1);
        }
        if (this.LLJILLL && (iAIDubbingService = (IAIDubbingService) PluggableExtentionKt.pluggableSpi$default(IAIDubbingService.class, false, false, false, 14, null)) != null) {
            iAIDubbingService.LIZIZ();
        }
        AnonymousClass1944 anonymousClass1944 = this.LLJI;
        Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("click_advanced_settings_times_normally");
        sbLIZ.append(anonymousClass1944);
        int i2 = repo.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        Keva repo2 = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("click_advanced_settings_times_normally");
        sbLIZ2.append(anonymousClass1944);
        repo2.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2 + 1);
        if (this.LLJI == AnonymousClass1944.PRIVACY_DEFAULT_ON) {
            this.LLJI = AnonymousClass1944.NONE;
            i3(AFwS278S0000000_32.get$arr$(70));
        }
        if (this.LLJI == AnonymousClass1944.BULLETIN_AUTO_SHARE) {
            this.LLJI = AnonymousClass1944.NONE;
            i3(AFwS278S0000000_32.get$arr$(71));
        }
        if (this.LLJI == AnonymousClass1944.AI_DUBBING) {
            this.LLJI = AnonymousClass1944.NONE;
            i3(AFwS278S0000000_32.get$arr$(72));
        }
    }

    private final void t5(boolean z, boolean z2) {
        boolean z3;
        if (this.LLJJ && !z2) {
            return;
        }
        this.LLJJ = true;
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.isRefactorNewUserMoreOptionGuideEnable()) {
            return;
        }
        IAIDubbingService iAIDubbingService = (IAIDubbingService) PluggableExtentionKt.pluggableSpi$default(IAIDubbingService.class, false, false, false, 14, null);
        if (iAIDubbingService != null && iAIDubbingService.LIZJ(Z4())) {
            C5();
            return;
        }
        C19721512Eb c19721512Eb = C19721512Eb.LIZ;
        VideoPublishEditModel videoPublishEditModelZ4 = Z4();
        c19721512Eb.getClass();
        C214824195i c214824195i = C214824195i.LIZIZ;
        if (c214824195i.LJIILL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bb_auto_share_show_times");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt(C2188811AlT.LIZIZ(sbLIZ), 0) < 1 && !c214824195i.isPrivateAccount() && !videoPublishEditModelZ4.creativeModel.privacySettingModel.isSubscribeOnly && videoPublishEditModelZ4.isPrivate() == 0) {
                E5();
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModelZ42 = Z4();
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "publish_privacy_setting_default_on", false) == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            Keva repo = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("privacy_setting_default_on");
            sbLIZ2.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            if (!repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ2), false) && videoPublishEditModelZ42.commentSetting != 3 && videoPublishEditModelZ42.creativeModel.privacySettingModel.contentReusePermission != 2) {
                M5();
                return;
            }
        }
        if (!C19224110It.LIZ() && Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getInt("new_more_option_hint", 0) < 3) {
            AnonymousClass1944 anonymousClass1944 = AnonymousClass1944.PRIVACY;
            Keva repo2 = Keva.getRepo("TOOLS_PUBLISH_REPO_NAME");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("click_advanced_settings_times_normally");
            sbLIZ3.append(anonymousClass1944);
            if (repo2.getInt(C2188811AlT.LIZIZ(sbLIZ3), 0) < 1) {
                H5();
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModelZ43 = Z4();
        if (videoPublishEditModelZ43 != null && ((!videoPublishEditModelZ43.mIsFromDraft || !C1441320nbu.LJ()) && C376910Eq9.LIZIZ(videoPublishEditModelZ43) && !C1441320nbu.LJFF(videoPublishEditModelZ43.getCreationId()) && C1441320nbu.LIZIZ() && C376910Eq9.LIZLLL(videoPublishEditModelZ43) && !Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("select_publish_with_template_anchor_clicked", false) && !C288140BRc.LIZ())) {
            N5();
        } else {
            n5();
            D5();
        }
    }
}
