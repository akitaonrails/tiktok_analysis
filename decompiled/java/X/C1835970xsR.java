package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS127S0100000_27;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Size;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveReplayHighlightVideobarSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayVideoPlayOptEnableSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1835970xsR extends FrameLayout implements InterfaceC1488080opK {
    public static final /* synthetic */ int LLJLL = 0;
    public C1835980xsS LL;
    public TuxTextView LLILLJJLI;
    public C376400EpK LLILLL;
    public TuxTextView LLILZ;
    public C19736512Jv LLILZIL;
    public TextureView LLILZLL;
    public C038P LLIZ;
    public ImageView LLIZLLLIL;
    public C19736512Jv LLJ;
    public C0GXB LLJI;
    public AppCompatImageView LLJIJIL;
    public final C1836060xsa LLJILJIL;
    public TuxTextView LLJILJILJ;
    public Function0<Float> LLJILLL;
    public float LLJJ;
    public Function1<? super Boolean, Unit> LLJJI;
    public Function1<? super Float, Float> LLJJIII;
    public C1834730xqR LLJJIJI;
    public boolean LLJJIJIIJIL;
    public ARunnableS127S0100000_27 LLJJIJIL;
    public boolean LLJJJ;
    public InterfaceC1836050xsZ LLJJJIL;
    public Window LLJJJJ;
    public Size LLJJJJJIL;
    public long LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public Bitmap LLJLIL;
    public final ARunnableS112S0100000_12 LLJLILLLLZIIL;

    @Override // X.InterfaceC1488080opK
    public final void onDecoderBuffering(boolean z) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onPausePlay(String str) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onPreparePlay(String str) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onResumePlay(String str) {
    }

    @Override // X.InterfaceC1488080opK
    public final void onVideoSizeChanged(String str, int i, int i2) {
    }

    public final void LIZIZ() {
        if (LiveReplayVideoPlayOptEnableSetting.INSTANCE.enable()) {
            C1836060xsa c1836060xsa = this.LLJILJIL;
            RunnableC1836000xsU runnableC1836000xsU = c1836060xsa.LJ;
            if (runnableC1836000xsU != null) {
                c1836060xsa.LJFF.removeCallbacks(runnableC1836000xsU);
                C20441214yg.LIZIZ("LiveReplayVideoResizeManager", "Cancelled pending resize task");
            }
            c1836060xsa.LJ = null;
            c1836060xsa.LIZ = null;
            c1836060xsa.LIZIZ = 0;
            c1836060xsa.LIZJ = 0;
            c1836060xsa.LIZLLL = false;
        }
        HandlerHook.viewRemoveCallbacks(this, this.LLJLILLLLZIIL);
        LIZ(true);
    }

    public final void LIZJ() {
        InterfaceC1836050xsZ interfaceC1836050xsZ = this.LLJJJIL;
        if (interfaceC1836050xsZ != null) {
            interfaceC1836050xsZ.pause();
            LJ();
        }
    }

    public final void LIZLLL() {
        InterfaceC1836050xsZ interfaceC1836050xsZ;
        if (this.LLJJJ || C1835120xr4.LIZ != EnumC1508960pN0.PLAYER_PAUSE || (interfaceC1836050xsZ = this.LLJJJIL) == null) {
            return;
        }
        this.LLJJJ = false;
        interfaceC1836050xsZ.LJIIIZ();
        LJFF();
    }

    public final void LJ() {
        if (C1835120xr4.LIZ != EnumC1508960pN0.PLAYER_IDLE) {
            C1835120xr4.LIZ = EnumC1508960pN0.PLAYER_PAUSE;
        }
        C376400EpK playCenterFromXml = getPlayCenterFromXml();
        playCenterFromXml.setImageDrawable(playCenterFromXml.LL);
        C1834730xqR c1834730xqR = this.LLJJIJI;
        if (c1834730xqR != null && c1834730xqR.LJFF) {
            C376400EpK playCenterFromXml2 = getPlayCenterFromXml();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(playCenterFromXml2);
            playCenterFromXml2.setAlpha(1.0f);
        }
        getPlaySideFromXml().LIZ();
        getPlayerMaskFromXml().LIZLLL();
        getPlayerMaskFromXml().LIZ(false);
        getMainHandler().removeCallbacksAndMessages(null);
    }

    public final void LJI() {
        InterfaceC1836050xsZ interfaceC1836050xsZ = this.LLJJJIL;
        if (interfaceC1836050xsZ != null) {
            this.LLJJJ = true;
            interfaceC1836050xsZ.pause();
            LJ();
        }
    }

    public final ImageView getCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cover);
            this.LLIZLLLIL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final AppCompatImageView getIvSpiritPreviewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.lve);
            this.LLJIJIL = (AppCompatImageView) callbackFindViewById;
        }
        return (AppCompatImageView) callbackFindViewById;
    }

    public final Handler getMainHandler() {
        return (Handler) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C376400EpK getPlayCenterFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qmi);
            this.LLILLL = (C376400EpK) callbackFindViewById;
        }
        return (C376400EpK) callbackFindViewById;
    }

    public final C19736512Jv getPlaySideFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnd);
            this.LLJ = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final TuxTextView getPlayTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnk);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1835980xsS getPlayerMaskFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qtg);
            this.LL = (C1835980xsS) callbackFindViewById;
        }
        return (C1835980xsS) callbackFindViewById;
    }

    public final C19736512Jv getSliderCustomIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vki);
            this.LLILZIL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final C0GXB getSliderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkd);
            this.LLJI = (C0GXB) callbackFindViewById;
        }
        return (C0GXB) callbackFindViewById;
    }

    public final TuxTextView getVideoDurationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_duration);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TextureView getVideoSurfaceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_surface);
            this.LLILZLL = (TextureView) callbackFindViewById;
        }
        return (TextureView) callbackFindViewById;
    }

    public final C038P getVideoViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_view);
            this.LLIZ = (C038P) callbackFindViewById;
        }
        return (C038P) callbackFindViewById;
    }

    public final void LJFF() {
        C786410Ut5.LLILIL(getIvSpiritPreviewFromXml(), 4);
        C038P videoViewFromXml = getVideoViewFromXml();
        int visibility = videoViewFromXml.getVisibility();
        videoViewFromXml.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, videoViewFromXml);
        C1835980xsS playerMaskFromXml = getPlayerMaskFromXml();
        int visibility2 = playerMaskFromXml.getVisibility();
        playerMaskFromXml.setVisibility(0);
        C1602160rnK.LIZIZ(visibility2, 0, playerMaskFromXml);
        C1835120xr4.LIZ = EnumC1508960pN0.PLAYER_START;
        C1834730xqR c1834730xqR = this.LLJJIJI;
        if (c1834730xqR != null && c1834730xqR.LJFF) {
            C376400EpK playCenterFromXml = getPlayCenterFromXml();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(playCenterFromXml);
            playCenterFromXml.setAlpha(0.0f);
        }
        C376400EpK playCenterFromXml2 = getPlayCenterFromXml();
        playCenterFromXml2.setImageDrawable(playCenterFromXml2.LLILLJJLI);
        getPlaySideFromXml().LIZJ();
        C1836080xsc.LIZ().removeCallbacksAndMessages(null);
        getPlayerMaskFromXml().LIZLLL();
        getPlayerMaskFromXml().getClass();
    }

    public final TextureView getVideoView() {
        return getVideoSurfaceFromXml();
    }

    public final Function0<Float> getCurrentPercentage() {
        return this.LLJILLL;
    }

    public final float getCurrentProgress() {
        return this.LLJJ;
    }

    public final C1834730xqR getParams() {
        return this.LLJJIJI;
    }

    public final InterfaceC1836050xsZ getPlayer$live_release() {
        return this.LLJJJIL;
    }

    public final Function1<Float, Float> getSeekbarTouchCallback() {
        return this.LLJJIII;
    }

    public final Function1<Boolean, Unit> getStartAndPauseCallback() {
        return this.LLJJI;
    }

    public final long getVideoLength$live_release() {
        return this.LLJJJJLIIL;
    }

    public final Size getVideoSize$live_release() {
        return this.LLJJJJJIL;
    }

    public final Window getWindow$live_release() {
        return this.LLJJJJ;
    }

    public final void LIZ(boolean z) {
        getMainHandler().removeCallbacksAndMessages(null);
        this.LLJJIJIL = null;
        C1835980xsS playerMaskFromXml = getPlayerMaskFromXml();
        playerMaskFromXml.getClass();
        C1836080xsc.LIZ().removeCallbacksAndMessages(null);
        C1836080xsc.LIZIZ = null;
        playerMaskFromXml.LLJJIII = false;
        playerMaskFromXml.LLJJIJI = false;
        playerMaskFromXml.LLJJIJIIJIL = false;
        if (z) {
            playerMaskFromXml.LLJJI = null;
            InterfaceC1836050xsZ interfaceC1836050xsZ = this.LLJJJIL;
            if (interfaceC1836050xsZ != null) {
                interfaceC1836050xsZ.release();
            }
        }
        this.LLJJJ = true;
        C1835120xr4.LIZ = EnumC1508960pN0.PLAYER_IDLE;
    }

    public final void LJIIIIZZ(float f) {
        float fMin = Math.min(Math.max(f, 0.0f), 1.0f);
        InterfaceC1836050xsZ interfaceC1836050xsZ = this.LLJJJIL;
        if (interfaceC1836050xsZ != null) {
            interfaceC1836050xsZ.LJIILL(fMin * 100);
        }
    }

    public final void LJIIJJI(boolean z) {
        HandlerHook.viewRemoveCallbacks(this, this.LLJLILLLLZIIL);
        C500260Jjc.LLFFF(this.LLJILJILJ);
        if (z) {
            TuxTextView tuxTextView = this.LLJILJILJ;
            if (tuxTextView != null) {
                tuxTextView.setText(C1383370m6R.LJIIJ(2131855638));
            }
        } else {
            TuxTextView tuxTextView2 = this.LLJILJILJ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(C1383370m6R.LJIIJ(2131855648));
            }
        }
        HandlerHook.viewPostDelay(this, this.LLJLILLLLZIIL, 2000L);
    }

    public final void LJIIL(Bitmap bitmap) {
        if (Intrinsics.LJFF(bitmap, this.LLJLIL)) {
            return;
        }
        this.LLJLIL = bitmap;
        C786410Ut5.LLILIL(getIvSpiritPreviewFromXml(), 0);
        C038P videoViewFromXml = getVideoViewFromXml();
        int visibility = videoViewFromXml.getVisibility();
        videoViewFromXml.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, videoViewFromXml);
        C1835980xsS playerMaskFromXml = getPlayerMaskFromXml();
        int visibility2 = playerMaskFromXml.getVisibility();
        playerMaskFromXml.setVisibility(4);
        C1602160rnK.LIZIZ(visibility2, 4, playerMaskFromXml);
        getIvSpiritPreviewFromXml().setImageBitmap(bitmap);
        getIvSpiritPreviewFromXml().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    @Override // X.InterfaceC1488080opK
    public final void LL(String str) {
        C786410Ut5.LLILZIL(getPlayerMaskFromXml().getVideoRetryFromXml(), 0);
    }

    @Override // X.InterfaceC1488080opK
    public final void onBuffering(boolean z) {
        if (z) {
            getPlayerMaskFromXml().LIZLLL();
            getMainHandler().removeCallbacksAndMessages(null);
            ARunnableS127S0100000_27 aRunnableS127S0100000_27 = new ARunnableS127S0100000_27(this, 48);
            this.LLJJIJIL = aRunnableS127S0100000_27;
            C786410Ut5.LJLIIL(1000L, getMainHandler(), aRunnableS127S0100000_27);
            return;
        }
        getPlayerMaskFromXml().LIZ(true);
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1488080opK
    public final void onPlayCompleted(String str) {
        C786410Ut5.LJZI(0, getCoverFromXml());
        getSliderFromXml().setProgress(0);
        getPlayerMaskFromXml().getClass();
    }

    @Override // X.InterfaceC1488080opK
    public final void onPlayProgressChange(float f) {
        C1834730xqR c1834730xqR;
        if (getPlayerMaskFromXml().LLJJIII) {
            return;
        }
        float f2 = f / 100;
        C1834730xqR c1834730xqR2 = this.LLJJIJI;
        if (c1834730xqR2 != null && c1834730xqR2.LJII) {
            this.LLJJ = f;
        }
        getPlayTimeFromXml().setText(C1765670w33.LIZIZ(f2, (int) (this.LLJJJJLIIL / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        if (!this.LLJJL && (c1834730xqR = this.LLJJIJI) != null && C500260Jjc.LJJIJIIJIL(Boolean.valueOf(c1834730xqR.LJII))) {
            getSliderFromXml().setProgress((int) (f2 * 10000));
        }
    }

    public final void setCoverFromXml(ImageView imageView) {
        this.LLIZLLLIL = imageView;
    }

    public final void setCurrentPercentage(Function0<Float> function0) {
        this.LLJILLL = function0;
    }

    public final void setCurrentProgress(float f) {
        this.LLJJ = f;
    }

    public final void setGeneralPopup$live_release(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setIvSpiritPreviewFromXml(AppCompatImageView appCompatImageView) {
        this.LLJIJIL = appCompatImageView;
    }

    public final void setParams(C1834730xqR c1834730xqR) {
        long jLongValue;
        InterfaceC1836050xsZ interfaceC1836050xsZ;
        Window window;
        boolean z;
        boolean z2;
        Long l;
        this.LLJJIJI = c1834730xqR;
        if (c1834730xqR != null && (l = c1834730xqR.LIZJ) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        setVideoLength$live_release(jLongValue);
        C1834730xqR c1834730xqR2 = this.LLJJIJI;
        if (c1834730xqR2 != null) {
            interfaceC1836050xsZ = c1834730xqR2.LIZ;
        } else {
            interfaceC1836050xsZ = null;
        }
        this.LLJJJIL = interfaceC1836050xsZ;
        if (c1834730xqR2 != null) {
            window = c1834730xqR2.LIZIZ;
        } else {
            window = null;
        }
        this.LLJJJJ = window;
        this.LLJJJJJIL = null;
        C1835980xsS playerMaskFromXml = getPlayerMaskFromXml();
        if (playerMaskFromXml != null) {
            playerMaskFromXml.setNeedAnimation(true);
        }
        C1835980xsS playerMaskFromXml2 = getPlayerMaskFromXml();
        if (playerMaskFromXml2 != null) {
            C1834730xqR c1834730xqR3 = this.LLJJIJI;
            if (c1834730xqR3 != null) {
                z2 = c1834730xqR3.LIZLLL;
            } else {
                z2 = true;
            }
            playerMaskFromXml2.setNeedHide(z2);
        }
        C1835980xsS playerMaskFromXml3 = getPlayerMaskFromXml();
        if (playerMaskFromXml3 != null) {
            C1834730xqR c1834730xqR4 = this.LLJJIJI;
            if (c1834730xqR4 != null && c1834730xqR4.LJI) {
                z = true;
            } else {
                z = false;
            }
            playerMaskFromXml3.setAlwaysHideTimeView(z);
        }
        C1834730xqR c1834730xqR5 = this.LLJJIJI;
        if (c1834730xqR5 != null && c1834730xqR5.LJ) {
            C1835980xsS playerMaskFromXml4 = getPlayerMaskFromXml();
            if (playerMaskFromXml4 != null) {
                playerMaskFromXml4.LJFF();
                return;
            }
            return;
        }
        C1835980xsS playerMaskFromXml5 = getPlayerMaskFromXml();
        if (playerMaskFromXml5 == null) {
            return;
        }
        if (LiveReplayHighlightVideobarSetting.INSTANCE.enable()) {
            playerMaskFromXml5.LLJLIL = false;
        }
        C786410Ut5.LJLLLLLL(8, playerMaskFromXml5.getActionBarFromXml());
        playerMaskFromXml5.LIZJ();
    }

    public final void setPlayCenterFromXml(C376400EpK c376400EpK) {
        this.LLILLL = c376400EpK;
    }

    public final void setPlaySideFromXml(C19736512Jv c19736512Jv) {
        this.LLJ = c19736512Jv;
    }

    public final void setPlayTimeFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setPlayer$live_release(InterfaceC1836050xsZ interfaceC1836050xsZ) {
        this.LLJJJIL = interfaceC1836050xsZ;
    }

    public final void setPlayerMaskFromXml(C1835980xsS c1835980xsS) {
        this.LL = c1835980xsS;
    }

    public final void setSeekbarTouchCallback(Function1<? super Float, Float> function1) {
        this.LLJJIII = function1;
    }

    public final void setSliderCustomIconFromXml(C19736512Jv c19736512Jv) {
        this.LLILZIL = c19736512Jv;
    }

    public final void setSliderFromXml(C0GXB c0gxb) {
        this.LLJI = c0gxb;
    }

    public final void setSliding$live_release(boolean z) {
        this.LLJJL = z;
    }

    public final void setStartAndPauseCallback(Function1<? super Boolean, Unit> function1) {
        this.LLJJI = function1;
    }

    public final void setVideoDurationFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setVideoLength$live_release(long j) {
        this.LLJJJJLIIL = j;
        String strLIZ = C1765670w33.LIZ((int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        getVideoDurationFromXml().setText(strLIZ);
        getPlayerMaskFromXml().setTotalDuration(strLIZ);
    }

    public final void setVideoSize$live_release(Size size) {
        this.LLJJJJJIL = size;
    }

    public final void setVideoSurfaceFromXml(TextureView textureView) {
        this.LLILZLL = textureView;
    }

    public final void setVideoViewFromXml(C038P c038p) {
        this.LLIZ = c038p;
    }

    public final void setWindow$live_release(Window window) {
        this.LLJJJJ = window;
    }

    public C1835970xsR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILJIL = new C1836060xsa();
        this.LLJILLL = new AwS571S0100000_27(this, 1146);
        this.LLJJJ = true;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(452));
        this.LLJL = "";
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dh1, this, true);
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.thy);
        C500260Jjc.LJLIIIL(500L, getPlayCenterFromXml(), new AwS606S0100000_27(this, 378));
        getPlayerMaskFromXml().setOnPlayerActionBarListener(new InterfaceC1836070xsb() { // from class: X.0xsT
            @Override // X.InterfaceC1836070xsb
            public final void LIZ() {
                this.LIZ.getPlayerMaskFromXml().LJ(1);
                this.LIZ.setSliding$live_release(true);
            }

            @Override // X.InterfaceC1836070xsb
            public final void LIZIZ() {
                if (C1835120xr4.LIZ == EnumC1508960pN0.PLAYER_START) {
                    Function1<Boolean, Unit> startAndPauseCallback = this.LIZ.getStartAndPauseCallback();
                    if (startAndPauseCallback != null) {
                        startAndPauseCallback.invoke(Boolean.FALSE);
                    }
                    this.LIZ.LJI();
                    return;
                }
                Function1<Boolean, Unit> startAndPauseCallback2 = this.LIZ.getStartAndPauseCallback();
                if (startAndPauseCallback2 != null) {
                    startAndPauseCallback2.invoke(Boolean.TRUE);
                }
                C1835970xsR c1835970xsR = this.LIZ;
                c1835970xsR.LJIIIZ(c1835970xsR.getCurrentPercentage().invoke().floatValue(), false);
            }

            @Override // X.InterfaceC1836070xsb
            public final void LIZLLL() {
                InterfaceC1836050xsZ player$live_release = this.LIZ.getPlayer$live_release();
                if (player$live_release != null) {
                    C1835970xsR c1835970xsR = this.LIZ;
                    if (player$live_release.isMute()) {
                        player$live_release.LJIIIIZZ();
                        c1835970xsR.getSliderCustomIconFromXml().LIZ();
                    } else {
                        player$live_release.mute();
                        c1835970xsR.getSliderCustomIconFromXml().LIZJ();
                    }
                }
            }

            @Override // X.InterfaceC1836070xsb
            public final void LJFF() {
                C786410Ut5.LLILZIL(this.LIZ.getPlayerMaskFromXml().getVideoRetryFromXml(), 8);
                C1835970xsR c1835970xsR = this.LIZ;
                InterfaceC1836050xsZ interfaceC1836050xsZ = c1835970xsR.LLJJJIL;
                if (interfaceC1836050xsZ != null) {
                    c1835970xsR.LLJJJ = false;
                    interfaceC1836050xsZ.retry();
                    c1835970xsR.LJFF();
                }
            }

            @Override // X.InterfaceC1836070xsb
            public final void LIZJ(float f) {
                C1834730xqR params = this.LIZ.getParams();
                if (params != null && params.LJII) {
                    return;
                }
                String strLIZIZ = C1765670w33.LIZIZ(f, (int) (this.LIZ.getVideoLength$live_release() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                this.LIZ.setCurrentProgress(f);
                this.LIZ.getPlayerMaskFromXml().setCurrentProgress(strLIZIZ);
                this.LIZ.getPlayTimeFromXml().setText(strLIZIZ);
            }

            @Override // X.InterfaceC1836070xsb
            public final void LJ(float f) {
                Function1<Float, Float> seekbarTouchCallback;
                C1835980xsS playerMaskFromXml = this.LIZ.getPlayerMaskFromXml();
                C786410Ut5.LLLLLLLLLL(playerMaskFromXml.getTimeTipsFromXml(), 8);
                if (playerMaskFromXml.LLJJIJI) {
                    playerMaskFromXml.LJ(2);
                } else {
                    playerMaskFromXml.LJ(0);
                }
                if (this.LIZ.getSeekbarTouchCallback() != null && (seekbarTouchCallback = this.LIZ.getSeekbarTouchCallback()) != null) {
                    f = seekbarTouchCallback.invoke(Float.valueOf(f)).floatValue();
                }
                this.LIZ.LJIIIZ(f, false);
                this.LIZ.setSliding$live_release(false);
            }

            @Override // X.InterfaceC1836070xsb
            public final void LJI(float f, int i) {
                InterfaceC1836050xsZ player$live_release = this.LIZ.getPlayer$live_release();
                if (player$live_release != null) {
                    player$live_release.LJII(f, i);
                }
            }
        });
        this.LLJLILLLLZIIL = new ARunnableS112S0100000_12(this, 321);
    }

    @Override // X.InterfaceC1488080opK
    public final void LJII(float f, int i) {
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, f);
        }
    }

    public final void LJIIIZ(float f, boolean z) {
        if (f > 1.0f) {
            f = 1.0f;
        }
        InterfaceC1836050xsZ interfaceC1836050xsZ = this.LLJJJIL;
        if (interfaceC1836050xsZ != null) {
            this.LLJJJ = false;
            float f2 = this.LLJJJJLIIL * f;
            if (C1835120xr4.LIZ != EnumC1508960pN0.PLAYER_IDLE && !z) {
                if (C1835120xr4.LIZ == EnumC1508960pN0.PLAYER_PAUSE) {
                    if (f >= 0.0f) {
                        interfaceC1836050xsZ.LJIILL(100 * f);
                        this.LLJJ = f;
                    }
                    interfaceC1836050xsZ.LJIIIZ();
                } else {
                    interfaceC1836050xsZ.LJIILL(f * 100);
                }
            } else {
                interfaceC1836050xsZ.start((int) f2);
            }
            LJFF();
        }
    }

    public final void LJIILIIL(int i, int i2) {
        if (i != 0 && i2 != 0) {
            this.LLJJJJJIL = new Size(i, i2);
            requestLayout();
        }
    }

    @Override // X.InterfaceC1488080opK
    public final void LLJJIJIL(int i, String str) {
        C786410Ut5.LLILZIL(getPlayerMaskFromXml().getVideoErrorFromXml(), 0);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0xsU, java.lang.Runnable] */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        final Size size;
        boolean z;
        boolean z2;
        long j;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            final int size2 = View.MeasureSpec.getSize(i);
            final int size3 = View.MeasureSpec.getSize(i2);
            if (!this.LLJJIJIIJIL && (size = this.LLJJJJJIL) != null) {
                if (LiveReplayVideoPlayOptEnableSetting.INSTANCE.enable()) {
                    C1835980xsS playerMaskFromXml = getPlayerMaskFromXml();
                    if (playerMaskFromXml != null) {
                        z = playerMaskFromXml.LLJJIJI;
                    } else {
                        z = false;
                    }
                    final C1836060xsa c1836060xsa = this.LLJILJIL;
                    c1836060xsa.getClass();
                    if (size.getWidth() > 0 && size.getHeight() > 0 && size2 > 0 && size3 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        C20441214yg.LIZIZ("LiveReplayVideoResizeManager", "Invalid parameters, skipping resize");
                        return;
                    }
                    if (Intrinsics.LJFF(c1836060xsa.LIZ, size) && c1836060xsa.LIZIZ == size2 && c1836060xsa.LIZJ == size3 && !c1836060xsa.LIZLLL) {
                        C20441214yg.LIZIZ("LiveReplayVideoResizeManager", "Parameters unchanged, skipping resize");
                        return;
                    }
                    if (c1836060xsa.LJ != null) {
                        return;
                    }
                    if (z) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    ?? r5 = new Runnable() { // from class: X.0xsU
                        public final /* synthetic */ boolean LLILZLL = false;

                        public final void LIZ() {
                            try {
                                try {
                                    C1836060xsa c1836060xsa2 = c1836060xsa;
                                    C1835970xsR c1835970xsR = this;
                                    Size size4 = size;
                                    int i3 = size2;
                                    int i4 = size3;
                                    boolean z3 = this.LLILZLL;
                                    c1836060xsa2.getClass();
                                    C038P videoViewFromXml = c1835970xsR.getVideoViewFromXml();
                                    if (videoViewFromXml != null) {
                                        C1836030xsX.LIZ(videoViewFromXml, size4, i3, i4, z3);
                                    } else {
                                        C20441214yg.LJ("LiveReplayVideoResizeManager", "VideoView is null, cannot resize");
                                    }
                                    C1836060xsa c1836060xsa3 = c1836060xsa;
                                    Size size5 = size;
                                    int i5 = size2;
                                    int i6 = size3;
                                    boolean z4 = this.LLILZLL;
                                    c1836060xsa3.LIZ = size5;
                                    c1836060xsa3.LIZIZ = i5;
                                    c1836060xsa3.LIZJ = i6;
                                    c1836060xsa3.LIZLLL = z4;
                                    C20441214yg.LIZIZ("LiveReplayVideoResizeManager", "Resize executed successfully");
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c1836060xsa.getClass();
                                    C20441214yg.LJFF("LiveReplayVideoResizeManager", "Error executing resize", e);
                                }
                                c1836060xsa.LJ = null;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c1836060xsa.LJ = null;
                                throw th;
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LiveReplayVideoResizeManager@2201.scheduleResize$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LiveReplayVideoResizeManager@2201.scheduleResize$1");
                        }
                    };
                    c1836060xsa.LJ = r5;
                    C786410Ut5.LJLIIL(j, c1836060xsa.LJFF, r5);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Resize scheduled with delay: ");
                    sbLIZ.append(j);
                    sbLIZ.append("ms");
                    C20441214yg.LIZIZ("LiveReplayVideoResizeManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                HandlerHook.viewPost(this, new Runnable() { // from class: X.0xsW
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveReplayClipVideoPlayerView@6495.onMeasure$1$1");
                        try {
                            C1836030xsX.LIZ(this.LL.getVideoViewFromXml(), size, size2, size3, false);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveReplayClipVideoPlayerView@6495.onMeasure$1$1");
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC1488080opK
    public final void LLLIZZ(int i, int i2, long j) {
        C786410Ut5.LJZI(8, getCoverFromXml());
        C786410Ut5.LLILZIL(getPlayerMaskFromXml().getVideoErrorFromXml(), 8);
    }

    @Override // X.InterfaceC1488080opK
    public final void onBufferedPercent(String str, long j, int i) {
        getSliderFromXml().setSecondaryProgress((int) (((i * 1.0f) / 100) * 10000));
    }
}
