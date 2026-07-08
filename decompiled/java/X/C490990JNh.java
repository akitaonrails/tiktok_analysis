package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import wh6.AbS689S0100000_7;

/* JADX INFO: renamed from: X.0JNh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490990JNh extends AbstractC490940JNc {
    public View LLILZ;
    public LiveIconView LLILZIL;
    public View LLILZLL;
    public View LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public LiveIconView LLJI;
    public C1390410mHn LLJIJIL;
    public View LLJILJIL;
    public C16F5 LLJILJILJ;
    public View LLJILLL;
    public C16F5 LLJJ;
    public C16F5 LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public C09AE LLJJIJIIJIL;

    @Override // X.AbstractC490940JNc
    public int getSeekbarDefaultPlayMode() {
        return 102;
    }

    private final LiveIconView getBackBtn() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cnb);
            this.LLILZIL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    private final View getBottomGradient() {
        View view = this.LLJJIJI;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.cdo);
        this.LLJJIJI = viewFindViewById;
        return viewFindViewById;
    }

    private final C16F5 getCreatorName() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f8f);
            this.LLJILJILJ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final C16F5 getTitle() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_title);
            this.LLJJ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final View getTitleContainer() {
        View view = this.LLJILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.video_title_container);
        this.LLJILLL = viewFindViewById;
        return viewFindViewById;
    }

    private final C16F5 getTitleExpandToggle() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.y1h);
            this.LLJJI = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final View getTopGradient() {
        View view = this.LLJJIII;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.f833yab);
        this.LLJJIII = viewFindViewById;
        return viewFindViewById;
    }

    private final C16F5 getVideoCurrentTimeSecondary() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fbl);
            this.LLIZLLLIL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final C16F5 getVideoDurationSecondary() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yg4);
            this.LLJ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    private final View getVideoInfoContainer() {
        View view = this.LLJILJIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.video_info_container);
        this.LLJILJIL = viewFindViewById;
        return viewFindViewById;
    }

    public final View getContentContainer() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.m5b);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    public final C1390410mHn getLoadingBall() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nld);
            this.LLJIJIL = (C1390410mHn) callbackFindViewById;
        }
        return (C1390410mHn) callbackFindViewById;
    }

    public final View getPlayContainer() {
        View view = this.LLILZLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.qmk);
        this.LLILZLL = viewFindViewById;
        return viewFindViewById;
    }

    public final LiveIconView getPlayPauseButton() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qn_);
            this.LLJI = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final View getTopBar() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.y9j);
        this.LLIZ = viewFindViewById;
        return viewFindViewById;
    }

    @Override // X.AbstractC490940JNc, X.C0JN0
    public final void LIZ() {
        super.LIZ();
        C23250099c.LIZLLL(getCoroutineScope(), null, null, new C491110JNt(this, null), 3);
    }

    @Override // X.AbstractC490940JNc, X.C0JN0
    public final void LIZIZ() {
        C489660JIe c489660JIe;
        super.LIZIZ();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(76, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        View topGradient = getTopGradient();
        if (topGradient != null) {
            topGradient.setBackground(gradientDrawable);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{Color.argb(76, 0, 0, 0), Color.argb(0, 0, 0, 0)});
        View bottomGradient = getBottomGradient();
        if (bottomGradient != null) {
            bottomGradient.setBackground(gradientDrawable2);
        }
        C491160JNy seekbarContainer = getSeekbarContainer();
        if (seekbarContainer != null) {
            seekbarContainer.setOnDragMode(102);
        }
        C491160JNy seekbarContainer2 = getSeekbarContainer();
        if (seekbarContainer2 != null) {
            seekbarContainer2.setPostDragMode(102);
        }
        C491160JNy seekbarContainer3 = getSeekbarContainer();
        if (seekbarContainer3 != null) {
            seekbarContainer3.setEnableClickToSeek(true);
        }
        String strLIZ = C0JO6.LIZ(getPlayerChannel().LIZIZ() / LSPassThroughRecordSizeConfig.DEFAULT);
        C16F5 videoDurationSecondary = getVideoDurationSecondary();
        if (videoDurationSecondary != null) {
            videoDurationSecondary.setText(strLIZ);
        }
        LiveIconView backBtn = getBackBtn();
        if (backBtn != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 23), backBtn);
        }
        LiveIconView playPauseButton = getPlayPauseButton();
        if (playPauseButton != null) {
            C786410Ut5.I7(new AbS689S0100000_7(this, 24), playPauseButton);
        }
        AbstractC489650JId abstractC489650JId = getPlayerChannel().LIZIZ.LIZIZ.LIZIZ;
        if (abstractC489650JId == null || !(abstractC489650JId instanceof C489660JIe) || (c489660JIe = (C489660JIe) abstractC489650JId) == null) {
            C500260Jjc.LJIILLIIL(getVideoInfoContainer());
        } else {
            C500260Jjc.LLFFF(getVideoInfoContainer());
            C16F5 creatorName = getCreatorName();
            if (creatorName != null) {
                creatorName.setText(c489660JIe.LIZ);
            }
            C16F5 title = getTitle();
            if (title != null) {
                title.setText(c489660JIe.LIZIZ);
            }
        }
        View contentContainer = getContentContainer();
        if (contentContainer != null) {
            C500260Jjc.LJIILLIIL(contentContainer);
        }
    }

    public final C09AE getMinimiseOverlayUIJob() {
        return C23250099c.LIZLLL(getCoroutineScope(), null, null, new C491020JNk(this, null), 3);
    }

    public C490990JNh(Context context) {
        super(context);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfg, this, true);
    }

    @Override // X.AbstractC490940JNc, X.C0JO2
    public final void onStartTrackingTouch(SeekBar seekBar) {
        super.onStartTrackingTouch(seekBar);
        C09AE c09ae = this.LLJJIJIIJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
    }

    @Override // X.AbstractC490940JNc, X.C0JO2
    public final void onStopTrackingTouch(SeekBar seekBar) {
        super.onStopTrackingTouch(seekBar);
        C09AE c09ae = this.LLJJIJIIJIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJJIJIIJIL = getMinimiseOverlayUIJob();
    }

    public final void setCurrentTimeSecondaryText(String str) {
        C16F5 videoCurrentTimeSecondary = getVideoCurrentTimeSecondary();
        if (videoCurrentTimeSecondary != null) {
            videoCurrentTimeSecondary.setText(str);
        }
    }

    @Override // X.AbstractC490940JNc, X.C0JO2
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (!z) {
            return;
        }
        setCurrentTimeSecondaryText(C0JO6.LIZ((int) ((i / 10000.0f) * (getPlayerChannel().LIZIZ() / LSPassThroughRecordSizeConfig.DEFAULT))));
    }
}
