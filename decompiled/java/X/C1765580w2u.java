package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS570S0100000_26;
import wh6.AbS705S0100000_26;

/* JADX INFO: renamed from: X.0w2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1765580w2u extends FrameLayout implements InterfaceC1507740pL2 {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public TextureView LL;
    public C1765620w2y LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public C19736512Jv LLILZIL;
    public ImageView LLILZLL;
    public C289601Ag LLIZ;
    public TuxTextView LLIZLLLIL;
    public View LLJ;
    public ProgressBar LLJI;
    public SmartImageView LLJIJIL;
    public C19736512Jv LLJILJIL;
    public C19736512Jv LLJILJILJ;
    public C0GXB LLJILLL;
    public boolean LLJJ;
    public ARunnableS126S0100000_26 LLJJI;
    public boolean LLJJIII;
    public InterfaceC1763420vzQ LLJJIJI;
    public C1508390pM5 LLJJIJIIJIL;
    public C0JSE LLJJIJIL;
    public int LLJJJ;
    public final C01GW LLJJJIL;
    public EnumC1153520g7i LLJJJJ;
    public boolean LLJJJJJIL;
    public final C0JSE LLJJJJLIIL;
    public int LLJJL;

    @Override // X.InterfaceC1507740pL2
    public final void i0() {
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPreparePlay(String str) {
    }

    public final void LIZ() {
        boolean z;
        int i;
        C1508390pM5 c1508390pM5 = this.LLJJIJIIJIL;
        EnumC1508950pMz enumC1508950pMz = c1508390pM5 != null ? c1508390pM5.LJIILLIIL : null;
        EnumC1508950pMz enumC1508950pMz2 = EnumC1508950pMz.PLAYER_IDLE;
        if (enumC1508950pMz != enumC1508950pMz2) {
            if (c1508390pM5 != null) {
                c1508390pM5.LJIILLIIL = EnumC1508950pMz.PLAYER_PAUSE;
            }
            getPlayerMaskFromXml().LJI();
        } else {
            C1765620w2y playerMaskFromXml = getPlayerMaskFromXml();
            C786410Ut5.LJLLLLLL(8, playerMaskFromXml.getActionBarFromXml());
            playerMaskFromXml.LIZLLL();
        }
        getPlaySideFromXml().LIZ();
        getPlayCenterFromXml().LIZ();
        getPlayerMaskFromXml().LJ();
        getPlayerMaskFromXml().LIZ(false);
        getMainHandler().removeCallbacksAndMessages(null);
        C1508390pM5 c1508390pM52 = this.LLJJIJIIJIL;
        if ((c1508390pM52 != null ? c1508390pM52.LJIILLIIL : null) == enumC1508950pMz2) {
            C786410Ut5.LLFF(0, getCoverFromXml());
            if (this.LLJJJJ == EnumC1153520g7i.PREVIEW) {
                TextureView videoSurfaceFromXml = getVideoSurfaceFromXml();
                C786410Ut5.LLIIIILZ(videoSurfaceFromXml, 0);
                C786410Ut5.Q4(0.0f, videoSurfaceFromXml);
            }
        } else {
            if (C04J1.LIZLLL && this.LLJJJJ == EnumC1153520g7i.PREVIEW) {
                z = true;
                i = 0;
            } else {
                z = false;
                i = 8;
            }
            C786410Ut5.LLFF(i, getCoverFromXml());
            TextureView videoSurfaceFromXml2 = getVideoSurfaceFromXml();
            C786410Ut5.LLIIIILZ(videoSurfaceFromXml2, 0);
            C786410Ut5.Q4(z ? 0.0f : 1.0f, videoSurfaceFromXml2);
        }
        if (this.LLJJJJJIL) {
            C786410Ut5.LLLLLLLLL(getPlayCenterFromXml(), 8);
        } else {
            C786410Ut5.LLLLLLLLL(getPlayCenterFromXml(), 0);
        }
    }

    public final void LIZIZ() {
        C1508390pM5 c1508390pM5 = this.LLJJIJIIJIL;
        if (c1508390pM5 != null) {
            c1508390pM5.LJIILLIIL = EnumC1508950pMz.PLAYER_START;
        }
        getPlaySideFromXml().LIZJ();
        getPlayCenterFromXml().LIZJ();
        getPlayerMaskFromXml().LJI();
        getPlayerMaskFromXml().LIZJ(3000L);
        getPlayerMaskFromXml().LJIIIIZZ();
        C786410Ut5.LLFF(8, getCoverFromXml());
        TextureView videoSurfaceFromXml = getVideoSurfaceFromXml();
        C786410Ut5.LLIIIILZ(videoSurfaceFromXml, 0);
        C786410Ut5.Q4(1.0f, videoSurfaceFromXml);
    }

    public final void LIZJ() {
        C1508390pM5 c1508390pM5 = this.LLJJIJIIJIL;
        if (c1508390pM5 != null) {
            c1508390pM5.pause();
        }
    }

    public final View getActionBarFromXml() {
        View view = this.LLJ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.a15);
        this.LLJ = viewFindViewById;
        return viewFindViewById;
    }

    public final SmartImageView getCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.cover);
            this.LLJIJIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final ImageView getExitFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.hff);
            this.LLILZLL = (ImageView) callbackFindViewById;
        }
        return (ImageView) callbackFindViewById;
    }

    public final Handler getMainHandler() {
        return (Handler) this.LLJJJIL.getValue();
    }

    public final C19736512Jv getPlayCenterFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qmi);
            this.LLILZIL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final C19736512Jv getPlaySideFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnd);
            this.LLJILJIL = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final TuxTextView getPlayTimeFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qnk);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1765620w2y getPlayerMaskFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qtg);
            this.LLILLJJLI = (C1765620w2y) callbackFindViewById;
        }
        return (C1765620w2y) callbackFindViewById;
    }

    public final ProgressBar getSliderCarouselFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkh);
            this.LLJI = (ProgressBar) callbackFindViewById;
        }
        return (ProgressBar) callbackFindViewById;
    }

    public final C19736512Jv getSliderCustomIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vki);
            this.LLJILJILJ = (C19736512Jv) callbackFindViewById;
        }
        return (C19736512Jv) callbackFindViewById;
    }

    public final C0GXB getSliderFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkd);
            this.LLJILLL = (C0GXB) callbackFindViewById;
        }
        return (C0GXB) callbackFindViewById;
    }

    public final C289601Ag getTimeTipsFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.xwn);
            this.LLIZ = (C289601Ag) callbackFindViewById;
        }
        return (C289601Ag) callbackFindViewById;
    }

    public final TuxTextView getTotalDurationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yfn);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getVideoDurationFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_duration);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TextureView getVideoSurfaceFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_surface);
            this.LL = (TextureView) callbackFindViewById;
        }
        return (TextureView) callbackFindViewById;
    }

    @Override // X.InterfaceC588410N5z
    public final void LJII() {
        LIZIZ();
        C786410Ut5.LLFF(8, getCoverFromXml());
        TextureView videoSurfaceFromXml = getVideoSurfaceFromXml();
        C786410Ut5.LLIIIILZ(videoSurfaceFromXml, 0);
        C786410Ut5.Q4(1.0f, videoSurfaceFromXml);
        C1508390pM5 c1508390pM5 = this.LLJJIJIIJIL;
        if (c1508390pM5 != null) {
            setVideoLength((int) (c1508390pM5.LIZLLL() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        }
    }

    public final SmartImageView getCoverView() {
        return getCoverFromXml();
    }

    public final TextureView getVideoView() {
        return getVideoSurfaceFromXml();
    }

    public final boolean getForceHideCenterControl() {
        return this.LLJJJJJIL;
    }

    public final C1508390pM5 getPlayer() {
        return this.LLJJIJIIJIL;
    }

    public final InterfaceC1763420vzQ getPlayerLogListener() {
        return this.LLJJIJI;
    }

    public final int getVideoIndex() {
        return this.LLJJL;
    }

    public final int getVideoLength() {
        return this.LLJJJ;
    }

    public final C0JSE getVideoSize() {
        return this.LLJJIJIL;
    }

    private final void setDisplayMode(EnumC1153520g7i enumC1153520g7i) {
        this.LLJJJJ = enumC1153520g7i;
        getPlayerMaskFromXml().setDisplayMode(enumC1153520g7i);
    }

    public final void LIZLLL(float f) {
        C1508390pM5 c1508390pM5 = this.LLJJIJIIJIL;
        if (c1508390pM5 != null) {
            int i = (int) (this.LLJJJ * f);
            if (c1508390pM5.LJIILLIIL == EnumC1508950pMz.PLAYER_IDLE) {
                c1508390pM5.start(i);
            } else {
                if (c1508390pM5.LJIILLIIL == EnumC1508950pMz.PLAYER_PAUSE) {
                    if (f > 0.0f) {
                        c1508390pM5.LJIILL(f * 100);
                    }
                    c1508390pM5.resume();
                    return;
                }
                c1508390pM5.LJIILL(f * 100);
            }
        }
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void LJLLI(String str) {
        C786410Ut5.LLILZIL(getPlayerMaskFromXml().getVideoErrorFromXml(), 0);
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void LL(String str) {
        C786410Ut5.LLILZIL(getPlayerMaskFromXml().getVideoRetryFromXml(), 0);
    }

    @Override // X.InterfaceC1507740pL2
    public final void ik(boolean z) {
        if (z) {
            getSliderCustomIconFromXml().LIZJ();
        } else {
            getSliderCustomIconFromXml().LIZ();
        }
        if (this.LLJJJJJIL) {
            C786410Ut5.LLLLLLLLL(getPlayCenterFromXml(), 8);
        }
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onBuffering(boolean z) {
        if (z) {
            getPlayerMaskFromXml().LJII();
            getMainHandler().removeCallbacksAndMessages(null);
            ARunnableS126S0100000_26 aRunnableS126S0100000_26 = new ARunnableS126S0100000_26(this, 125);
            this.LLJJI = aRunnableS126S0100000_26;
            C786410Ut5.LJLIIL(1000L, getMainHandler(), aRunnableS126S0100000_26);
            return;
        }
        getPlayerMaskFromXml().LIZ(true);
        getMainHandler().removeCallbacksAndMessages(null);
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPausePlay(String str) {
        LIZ();
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPlayCompleted(String str) {
        C1508390pM5 c1508390pM5 = this.LLJJIJIIJIL;
        if (c1508390pM5 != null) {
            c1508390pM5.LJIILLIIL = EnumC1508950pMz.PLAYER_IDLE;
        }
        if (c1508390pM5 != null) {
            c1508390pM5.LJIILL(0.0f);
        }
        LIZJ();
        getPlayTimeFromXml().setText(C1765670w33.LIZ(0));
        getSliderFromXml().setProgress(0);
        getSliderCarouselFromXml().setProgress(0);
        C786410Ut5.LLFF(0, getCoverFromXml());
        TextureView videoSurfaceFromXml = getVideoSurfaceFromXml();
        C786410Ut5.LLIIIILZ(videoSurfaceFromXml, 0);
        C786410Ut5.Q4(0.0f, videoSurfaceFromXml);
        getPlayerMaskFromXml().LJIIIIZZ();
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onPlayProgressChange(float f) {
        if (getPlayerMaskFromXml().LLJJI) {
            return;
        }
        float f2 = f / 100;
        getPlayTimeFromXml().setText(C1765670w33.LIZIZ(f2, this.LLJJJ));
        if (!this.LLJJ) {
            int i = (int) (f2 * 10000);
            getSliderFromXml().setProgress(i);
            getSliderCarouselFromXml().setProgress(i);
        }
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onResumePlay(String str) {
        LIZIZ();
    }

    public final void setActionBarFromXml(View view) {
        this.LLJ = view;
    }

    public final void setCoverFromXml(SmartImageView smartImageView) {
        this.LLJIJIL = smartImageView;
    }

    public final void setExitFromXml(ImageView imageView) {
        this.LLILZLL = imageView;
    }

    public final void setForceHideCenterControl(boolean z) {
        int i;
        if (this.LLJJJJJIL != z) {
            C19736512Jv playCenterFromXml = getPlayCenterFromXml();
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLLLLLLLL(playCenterFromXml, i);
        }
        this.LLJJJJJIL = z;
    }

    public final void setPlayCenterFromXml(C19736512Jv c19736512Jv) {
        this.LLILZIL = c19736512Jv;
    }

    public final void setPlaySideFromXml(C19736512Jv c19736512Jv) {
        this.LLJILJIL = c19736512Jv;
    }

    public final void setPlayTimeFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setPlayer(C1508390pM5 c1508390pM5) {
        this.LLJJIJIIJIL = c1508390pM5;
        getPlayerMaskFromXml().setPlayer(c1508390pM5);
    }

    public final void setPlayerLogListener(InterfaceC1763420vzQ interfaceC1763420vzQ) {
        this.LLJJIJI = interfaceC1763420vzQ;
    }

    public final void setPlayerMaskFromXml(C1765620w2y c1765620w2y) {
        this.LLILLJJLI = c1765620w2y;
    }

    public final void setSliderCarouselFromXml(ProgressBar progressBar) {
        this.LLJI = progressBar;
    }

    public final void setSliderCustomIconFromXml(C19736512Jv c19736512Jv) {
        this.LLJILJILJ = c19736512Jv;
    }

    public final void setSliderFromXml(C0GXB c0gxb) {
        this.LLJILLL = c0gxb;
    }

    public final void setTimeTipsFromXml(C289601Ag c289601Ag) {
        this.LLIZ = c289601Ag;
    }

    public final void setTotalDurationFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setVideoDurationFromXml(TuxTextView tuxTextView) {
        this.LLILLL = tuxTextView;
    }

    public final void setVideoIndex(int i) {
        this.LLJJL = i;
    }

    public final void setVideoLength(int i) {
        this.LLJJJ = i;
        String strLIZ = C1765670w33.LIZ(i);
        getVideoDurationFromXml().setText(strLIZ);
        getTotalDurationFromXml().setText(strLIZ);
    }

    public final void setVideoSize(C0JSE c0jse) {
        this.LLJJIJIL = c0jse;
    }

    public final void setVideoSurfaceFromXml(TextureView textureView) {
        this.LL = textureView;
    }

    public C1765580w2u(Context context, AttributeSet attributeSet) {
        EnumC1153520g7i enumC1153520g7i;
        super(context, attributeSet, R.attr.yg);
        this.LLJJIII = true;
        this.LLJJJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(634));
        EnumC1153520g7i enumC1153520g7i2 = EnumC1153520g7i.PREVIEW;
        this.LLJJJJ = enumC1153520g7i2;
        this.LLJJJJLIIL = new C0JSE(0, 0);
        C954703oH.LIZ(context, R.layout.are, this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PdpHeaderVideoPlayerView, R.attr.yg, 0);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.PdpHeaderVideoPlayerView_displayMode, 0);
        if (i != 0 && i == 1) {
            enumC1153520g7i = EnumC1153520g7i.FULL_SCREEN;
        } else {
            enumC1153520g7i = enumC1153520g7i2;
        }
        setDisplayMode(enumC1153520g7i);
        typedArrayObtainStyledAttributes.recycle();
        C786410Ut5.I7(new AbS705S0100000_26(this, 14, 42), getExitFromXml());
        C786410Ut5.I7(new AbS705S0100000_26(this, 15, 42), getPlayCenterFromXml());
        getPlayerMaskFromXml().setOnPlayerActionBarListener(new InterfaceC1765630w2z() { // from class: X.0w2x
            @Override // X.InterfaceC1765630w2z
            public final void LIZ() {
                this.LIZ.getPlayerMaskFromXml().LJFF(1);
                this.LIZ.LLJJ = true;
            }

            @Override // X.InterfaceC1765630w2z
            public final void LIZIZ() {
                C1508390pM5 player = this.LIZ.getPlayer();
                if ((player != null ? player.LJIILLIIL : null) == EnumC1508950pMz.PLAYER_START) {
                    C1508390pM5 player2 = this.LIZ.getPlayer();
                    if (player2 != null) {
                        player2.LJIJ = true;
                    }
                    this.LIZ.LIZJ();
                    return;
                }
                C1508390pM5 player3 = this.LIZ.getPlayer();
                if (player3 != null) {
                    player3.LJIJ = false;
                }
                InterfaceC1763420vzQ playerLogListener = this.LIZ.getPlayerLogListener();
                if (playerLogListener != null) {
                    playerLogListener.LIZIZ();
                }
                this.LIZ.LIZLLL(0.0f);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
            @Override // X.InterfaceC1765630w2z
            public final void LIZLLL() {
                C1508390pM5 player = this.LIZ.getPlayer();
                if (player != null) {
                    if (player.isMute()) {
                        player.LJIIIIZZ();
                    } else {
                        player.mute();
                    }
                    ?? r0 = player.LJIJI;
                    if (r0 != 0) {
                        r0.invoke();
                    }
                }
            }

            @Override // X.InterfaceC1765630w2z
            public final void LJFF() {
                C786410Ut5.LLILZIL(this.LIZ.getPlayerMaskFromXml().getVideoRetryFromXml(), 8);
                C1508390pM5 c1508390pM5 = this.LIZ.LLJJIJIIJIL;
                if (c1508390pM5 != null) {
                    c1508390pM5.resume();
                }
            }

            @Override // X.InterfaceC1765630w2z
            public final void LJI() {
                this.LIZ.getPlayer();
            }

            @Override // X.InterfaceC1765630w2z
            public final void LIZJ(float f) {
                String strLIZIZ = C1765670w33.LIZIZ(f, this.LIZ.getVideoLength());
                ((TextView) this.LIZ.getTimeTipsFromXml().findViewById(R.id.fb0)).setText(strLIZIZ);
                this.LIZ.getPlayTimeFromXml().setText(strLIZIZ);
            }

            @Override // X.InterfaceC1765630w2z
            public final void LJ(float f) {
                this.LIZ.getPlayerMaskFromXml().LIZIZ();
                this.LIZ.LIZLLL(f);
                this.LIZ.LLJJ = false;
            }
        });
        if (this.LLJJJJ == enumC1153520g7i2) {
            C786410Ut5.LJLLLLLL(8, getActionBarFromXml());
        }
        if (this.LLJJJJ == EnumC1153520g7i.FULL_SCREEN) {
            C786410Ut5.LLIIJLIL(getSliderCarouselFromXml(), 8);
        }
        getPlayerMaskFromXml().setOnMaskTap(new AwS570S0100000_26(this, 1586));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJJJJLIIL.LIZ = View.MeasureSpec.getSize(i);
        this.LLJJJJLIIL.LIZIZ = View.MeasureSpec.getSize(i2);
        C0JSE c0jse = this.LLJJIJIL;
        if (c0jse != null) {
            HandlerHook.viewPost(this, new ARunnableS95S0200000_26(this, c0jse, 11));
        }
    }

    @Override // X.InterfaceC1507740pL2, X.InterfaceC588410N5z
    public final void onBufferedPercent(String str, long j, int i) {
        getSliderFromXml().setSecondaryProgress((int) (((i * 1.0f) / 100) * 10000));
    }
}
