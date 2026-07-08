package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import Y.ARunnableS3S0101100_8;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mcm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572460Mcm extends FrameLayout {
    public ForwardMedia LL;
    public C572370Mcd LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;
    public Function0<Unit> LLILZIL;
    public C572410Mch LLILZLL;
    public Function1<? super String, Unit> LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public C572380Mce LLJ;
    public C572410Mch LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public final ARunnableS3S0101100_8 LLJILLL;

    public final void LJ() {
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        LinearLayout errorContainer = getErrorContainer();
        if (errorContainer != null) {
            C786410Ut5.LJZL(8, errorContainer);
        }
        FrameLayout previewCard = getPreviewCard();
        if (previewCard != null) {
            C786410Ut5.LJZ(0, previewCard);
        }
        LinearLayout bottomBar = getBottomBar();
        if (bottomBar != null) {
            C786410Ut5.LJZL(0, bottomBar);
        }
        FrameLayout progressIndicator = getProgressIndicator();
        if (progressIndicator != null) {
            C786410Ut5.LJZ(0, progressIndicator);
        }
        LIZ(0);
    }

    public final void LIZLLL() {
        VideoPublishEditModel videoPublishEditModel;
        if (this.LLJILJILJ) {
            return;
        }
        this.LLJILJILJ = true;
        C572350Mcb c572350Mcb = C572350Mcb.LIZ;
        C572410Mch c572410Mch = this.LLJI;
        if (c572410Mch == null || (videoPublishEditModel = c572410Mch.LIZIZ) == null) {
            C572380Mce c572380Mce = this.LLJ;
            videoPublishEditModel = c572380Mce != null ? c572380Mce.LIZIZ : null;
        }
        c572350Mcb.getClass();
        if (videoPublishEditModel != null) {
            C0CHQ.LIZ().getPublishService().LJJJLL();
            C1431870nMf.LJIIIIZZ(videoPublishEditModel);
        }
    }

    public final void LJFF() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        FrameLayout previewCard = getPreviewCard();
        if (previewCard != null) {
            C786410Ut5.LJZ(4, previewCard);
        }
        LinearLayout bottomBar = getBottomBar();
        if (bottomBar != null) {
            C786410Ut5.LJZL(4, bottomBar);
        }
        LinearLayout errorContainer = getErrorContainer();
        if (errorContainer != null) {
            C786410Ut5.LJZL(0, errorContainer);
        }
        C197039127h retryButton = getRetryButton();
        if (retryButton != null) {
            C786410Ut5.U8(retryButton, new ACListenerS143S0100000_8(this, 86));
        }
    }

    private final View getAiTip() {
        return findViewById(R.id.as_);
    }

    private final LinearLayout getBottomBar() {
        return (LinearLayout) findViewById(R.id.cbh);
    }

    private final C197039127h getEditButton() {
        return (C197039127h) findViewById(R.id.d7c);
    }

    private final LinearLayout getErrorContainer() {
        return (LinearLayout) findViewById(R.id.hb0);
    }

    private final TuxNavBar getNavBar() {
        return (TuxNavBar) findViewById(R.id.p15);
    }

    private final C197039127h getPostButton() {
        return (C197039127h) findViewById(R.id.d7u);
    }

    private final FrameLayout getPreviewCard() {
        return (FrameLayout) findViewById(R.id.rpb);
    }

    private final SmartImageView getPreviewImage() {
        return (SmartImageView) findViewById(R.id.rqu);
    }

    private final FrameLayout getProgressIndicator() {
        return (FrameLayout) findViewById(R.id.s9b);
    }

    private final TuxTextView getProgressPercentage() {
        return (TuxTextView) findViewById(R.id.tv_progress_percentage);
    }

    private final C426320Gne getProgressRing() {
        return (C426320Gne) findViewById(R.id.s9m);
    }

    private final C197039127h getRetryButton() {
        return (C197039127h) findViewById(R.id.d7x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZLLLIL = null;
        C572380Mce c572380Mce = this.LLJ;
        if (c572380Mce != null) {
            c572380Mce.LIZ();
        }
        this.LLJ = null;
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLJI = null;
        this.LLILZLL = null;
        this.LLJILJILJ = false;
    }

    public final Function0<Unit> getBeforeEdit() {
        return this.LLILZIL;
    }

    public final Function0<Unit> getBeforePublish() {
        return this.LLILZ;
    }

    public final C572370Mcd getConfig() {
        return this.LLILLJJLI;
    }

    public final Function0<Unit> getDismissSheet() {
        return this.LLILLL;
    }

    public final Function1<String, Unit> getOnPublishStart() {
        return this.LLIZ;
    }

    public final C572410Mch getPrefilledResult() {
        return this.LLILZLL;
    }

    public final ForwardMedia getSource() {
        return this.LL;
    }

    public C572460Mcm(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLJILLL = new ARunnableS3S0101100_8(this, 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void LIZ(int i) {
        C426320Gne progressRing = getProgressRing();
        if (progressRing != null) {
            progressRing.LIZ(i, false);
        }
        TuxTextView progressPercentage = getProgressPercentage();
        if (progressPercentage != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append('%');
            progressPercentage.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZJ(AwS552S0100000_8 awS552S0100000_8) {
        this.LLILLL = awS552S0100000_8;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZIZ = "close";
        c1251150ifB.LIZJ(new AwS552S0100000_8(awS552S0100000_8, 399));
        TuxNavBar navBar = getNavBar();
        int i = 0;
        if (navBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = getContext().getString(2131821444);
            c0om1.LIZJ = c1250250idj;
            c0om1.LIZIZ(c1251150ifB);
            navBar.setNavActions(c0om1);
        }
        View viewFindViewById = findViewById(R.id.rpb);
        if (viewFindViewById != null) {
            viewFindViewById.setClipToOutline(true);
        }
        C197039127h postButton = getPostButton();
        if (postButton != null) {
            C786410Ut5.w5(postButton, 0.4f);
        }
        C197039127h postButton2 = getPostButton();
        if (postButton2 != null) {
            C786410Ut5.U8(postButton2, new ACListenerS143S0100000_8(this, 87));
        }
        C197039127h editButton = getEditButton();
        if (editButton != null) {
            C786410Ut5.U8(editButton, new ACListenerS112S0200000_8(this, awS552S0100000_8, 8));
        }
        View aiTip = getAiTip();
        if (aiTip != null) {
            C572410Mch c572410Mch = this.LLJI;
            if (c572410Mch == null || !c572410Mch.LIZ()) {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, aiTip);
        }
    }

    public final void LJI(String str) {
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        FrameLayout progressIndicator = getProgressIndicator();
        if (progressIndicator != null) {
            C786410Ut5.LJZ(8, progressIndicator);
        }
        SmartImageView previewImage = getPreviewImage();
        int i = 0;
        if (previewImage != null) {
            C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(new C0VSJ(str));
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(8);
            c1331670kl3LJII.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJII.LJJLIIIJL = true;
            c1331670kl3LJII.LJJ(previewImage);
            C786410Ut5.h3(c1331670kl3LJII);
            C786410Ut5.LLFF(0, previewImage);
        }
        C197039127h postButton = getPostButton();
        if (postButton != null) {
            C786410Ut5.w5(postButton, 1.0f);
        }
        View aiTip = getAiTip();
        if (aiTip != null) {
            C572410Mch c572410Mch = this.LLJI;
            if (c572410Mch == null || !c572410Mch.LIZ()) {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, aiTip);
        }
    }

    public final void LJII(Context context) {
        C572370Mcd c572370Mcd;
        ForwardMedia forwardMedia = this.LL;
        if (forwardMedia == null || (c572370Mcd = this.LLILLJJLI) == null) {
            return;
        }
        C572410Mch c572410Mch = this.LLILZLL;
        if (c572410Mch != null) {
            this.LLJI = c572410Mch;
            LJI(c572410Mch.LIZ);
            LIZIZ(context, c572410Mch);
            LIZLLL();
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C572380Mce c572380Mce = this.LLJ;
        if (c572380Mce != null) {
            c572380Mce.LIZ();
        }
        this.LLJ = null;
        C572350Mcb c572350Mcb = C572350Mcb.LIZ;
        AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        AwS374S0200000_8 awS374S0200000_8 = new AwS374S0200000_8(this, context, 80);
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(this, 398);
        AwS587S0100000_8 awS587S0100000_82 = new AwS587S0100000_8(this, 301);
        c572350Mcb.getClass();
        this.LLIZLLLIL = C23250099c.LIZLLL(C572350Mcb.LJ(), null, null, new C572400Mcg(context, forwardMedia, c572370Mcd, awS374S0200000_8, awS552S0100000_8, awS587S0100000_82, awS587S0100000_8, null), 3);
    }

    public final void LJIIIIZZ(int i) {
        int iLJJIJIIJI;
        int progress;
        if (i < 0) {
            return;
        }
        EnumC314970CWh[] enumC314970CWhArrValues = EnumC314970CWh.values();
        int length = enumC314970CWhArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                EnumC314970CWh enumC314970CWh = enumC314970CWhArrValues[i2];
                if (enumC314970CWh.getProgress() == i) {
                    iLJJIJIIJI = C13LQ.LJJIJIIJI(enumC314970CWh, enumC314970CWhArrValues);
                    break;
                }
                i2++;
            } else {
                iLJJIJIIJI = -1;
                break;
            }
        }
        EnumC314970CWh enumC314970CWh2 = (EnumC314970CWh) C13LQ.LJJIIZ(iLJJIJIIJI + 1, enumC314970CWhArrValues);
        if (enumC314970CWh2 != null) {
            progress = enumC314970CWh2.getProgress();
        } else {
            progress = i;
        }
        int i3 = this.LLJIJIL;
        if (i < i3) {
            LIZ(i3);
            return;
        }
        this.LLJIJIL = i;
        this.LLJILJIL = i;
        HandlerHook.viewRemoveCallbacks(this, this.LLJILLL);
        int i4 = progress - i;
        if (i4 > 0) {
            this.LLJILLL.i1 = Math.min(99, progress);
            ARunnableS3S0101100_8 aRunnableS3S0101100_8 = this.LLJILLL;
            long j = (long) ((31.0f / i4) * 50);
            if (j < 5) {
                j = 5;
            }
            aRunnableS3S0101100_8.j2 = j;
            LIZ(this.LLJILJIL);
            ARunnableS3S0101100_8 aRunnableS3S0101100_82 = this.LLJILLL;
            HandlerHook.viewPostDelay(this, aRunnableS3S0101100_82, aRunnableS3S0101100_82.j2);
            return;
        }
        LIZ(i);
    }

    public final void setBeforeEdit(Function0<Unit> function0) {
        this.LLILZIL = function0;
    }

    public final void setBeforePublish(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setConfig(C572370Mcd c572370Mcd) {
        this.LLILLJJLI = c572370Mcd;
    }

    public final void setDismissSheet(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setOnPublishStart(Function1<? super String, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setPrefilledResult(C572410Mch c572410Mch) {
        this.LLILZLL = c572410Mch;
    }

    public final void setSource(ForwardMedia forwardMedia) {
        this.LL = forwardMedia;
    }

    public final void LIZIZ(final Context context, final C572410Mch c572410Mch) {
        C197039127h postButton;
        final C572370Mcd c572370Mcd = this.LLILLJJLI;
        if (c572370Mcd != null && (postButton = getPostButton()) != null) {
            C786410Ut5.U8(postButton, new View.OnClickListener() { // from class: X.0Mcl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C572460Mcm c572460Mcm = this.LL;
                    if (c572460Mcm.LLJI == null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
                        c1389890mGx.LJIIIZ(2131821520);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    Function0<Unit> beforePublish = c572460Mcm.getBeforePublish();
                    if (beforePublish != null) {
                        beforePublish.invoke();
                    }
                    if (Intrinsics.LJFF(c572370Mcd.getShootWay(), "mt_help_post_card_search")) {
                        c572410Mch.LIZIZ.creativeModel.postLandingModel.landingBack = false;
                    }
                    C572350Mcb c572350Mcb = C572350Mcb.LIZ;
                    Context context2 = context;
                    C572410Mch c572410Mch2 = c572410Mch;
                    VideoPublishEditModel videoPublishEditModel = c572410Mch2.LIZIZ;
                    CreativeInfo creativeInfo = c572410Mch2.LIZJ;
                    C572370Mcd c572370Mcd2 = c572370Mcd;
                    Function1<String, Unit> onPublishStart = this.LL.getOnPublishStart();
                    c572350Mcb.getClass();
                    C572350Mcb.LJII(context2, videoPublishEditModel, creativeInfo, c572370Mcd2, onPublishStart);
                    Function0<Unit> dismissSheet = this.LL.getDismissSheet();
                    if (dismissSheet != null) {
                        dismissSheet.invoke();
                    }
                }
            });
        }
    }
}
