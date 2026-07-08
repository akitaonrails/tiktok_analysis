package X;

import X.C12ES;
import X.C1C7U;
import X.C2178631AOf;
import X.InterfaceC2178741AOq;
import Y.ARunnableS133S0100000_33;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2178631AOf extends FrameLayout implements C1A7D, InterfaceC1487050onf, InterfaceC1474360oTC {
    public final C1APD LL;
    public InterfaceC2178711AOn LLILLJJLI;
    public InterfaceC2178741AOq LLILLL;
    public View LLILZ;
    public boolean LLILZIL;
    public C1474420oTI LLILZLL;
    public C1AMG LLIZ;
    public int LLIZLLLIL;
    public InterfaceC1474410oTH LLJ;
    public InterfaceC2178671AOj LLJI;
    public C1APG LLJIJIL;
    public C1474280oT4 LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public InterfaceC1474330oT9 LLJJ;
    public C1AMJ LLJJI;
    public InterfaceC1395140mPQ LLJJIII;
    public final List<InterfaceC1487050onf> LLJJIJI;
    public Lifecycle LLJJIJIIJIL;
    public AbstractC1468760oKA LLJJIJIL;
    public InterfaceC1474390oTF LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public s LLJJJJLIIL;
    public long LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public Handler LLJLIL;
    public final ARunnableS133S0100000_33 LLJLILLLLZIIL;

    @Override // X.InterfaceC2178771AOt
    public final void LJIJ() {
    }

    @Override // X.InterfaceC1487050onf
    public final boolean LJJJJI(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, InterfaceC1487060ong interfaceC1487060ong) {
        return false;
    }

    @Override // X.InterfaceC2178771AOt
    public final void LJJJJIZL(int i, boolean z) {
    }

    @Override // X.InterfaceC1474330oT9
    public boolean LJJJJJ(C1473400oRe c1473400oRe) {
        return false;
    }

    public InterfaceC1474410oTH LJJJJZI(Context context) {
        return null;
    }

    public void LJJLIIIJILLIZJL() {
        this.LLJJJJJIL = false;
        this.LLJILJIL.LIZ();
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.pause();
        }
    }

    public void LJJLIIIJL() {
        this.LLJJJJJIL = false;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.release();
        }
        this.LLJILJIL.LIZ();
    }

    public final void LJJJJLL() {
        if (this.LLJLIL == null) {
            final Looper mainLooper = Looper.getMainLooper();
            this.LLJLIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.videoshop.mediaview.VideoPatchLayout$3
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    C1C7U.LIZ("VideoPatchLayout@c81.dismissVideoViewDelay$1");
                    super.handleMessage(message);
                    C2178631AOf c2178631AOf = this.LL;
                    InterfaceC2178741AOq interfaceC2178741AOq = c2178631AOf.LLILLL;
                    if (interfaceC2178741AOq != null && C12ES.LJIILIIL(interfaceC2178741AOq.getView())) {
                        C12ES.LJIILL(8, c2178631AOf.LLILLL.getView());
                    }
                    C1C7U.LIZIZ("VideoPatchLayout@c81.dismissVideoViewDelay$1");
                }
            };
        }
        C786410Ut5.LJLJJI(0, 500L, this.LLJLIL);
    }

    public final void LJJJJZ() {
        EnumC1471780oP2.INS.trace(this.LLILZLL, EnumC1474270oT3.VIDEO_PATCH_DO_PLAY, null, null, getVideoStateInquirer());
        this.LLJI.play();
        if (this.LLJJJJJIL) {
            return;
        }
        LJJLIIIJILLIZJL();
    }

    public final void LJJJLIIL() {
        InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
        if (interfaceC2178741AOq != null) {
            if (this.LLJJI == null) {
                this.LLJJI = new C1AMJ() { // from class: X.1APA
                };
            }
            boolean z = interfaceC2178741AOq instanceof SurfaceView;
            this.LLJJI.getClass();
            if (z) {
                setUseSurfaceView(false);
                return;
            }
            return;
        }
        C1APD c1apd = this.LL;
        c1apd.LIZ = this.LLIZLLLIL;
        Context context = getContext();
        this.LLILLJJLI = c1apd.LIZ == 0 ? new C1474470oTN(context) : new C1A76(context);
        setTextureLayout(this.LLIZ.LJI);
        Object obj = this.LLILLJJLI;
        if (obj instanceof C1474470oTN) {
            ((View) obj).setBackgroundColor(this.LLIZ.LJFF);
        }
        InterfaceC2178741AOq videoView = this.LLILLJJLI.getVideoView();
        this.LLILLL = videoView;
        videoView.setSurfaceCallback(this);
        View blackCoverView = this.LLILLJJLI.getBlackCoverView();
        this.LLILZ = blackCoverView;
        if (!this.LLJJJIL) {
            C786410Ut5.LJLLLLLL(8, blackCoverView);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.LLILLJJLI.getVideoContainer(), 0, layoutParams);
        C12ES.LJIILL(8, this.LLILLJJLI.getVideoContainer());
    }

    public final boolean LJJJLZIJ() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        return interfaceC2178671AOj != null && interfaceC2178671AOj.isPlaying();
    }

    public final boolean LJJJZ() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        return interfaceC2178671AOj == null || interfaceC2178671AOj.LJJJ();
    }

    public final boolean LJJL() {
        int i = this.LLIZLLLIL;
        return i == 1 || i == 2;
    }

    public final void LJJLIIIIJ() {
        if (this.LLJI != null) {
            if (this.LLILZLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onSurfaceCreated setSurface vid:");
                sbLIZ.append(this.LLILZLL.LIZ);
                sbLIZ.append(" title:");
                this.LLILZLL.getClass();
                sbLIZ.append((String) null);
                sbLIZ.append("hash:");
                sbLIZ.append(this.LLJI.hashCode());
                sbLIZ.append(" VideoViewType = ");
                sbLIZ.append(this.LLIZLLLIL);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLIZ.getClass();
            int i = this.LLIZLLLIL;
            if (i == 0 || i == 2) {
                this.LLJI.setSurface(getSurface());
            }
            if (this.LLIZLLLIL == 1 && this.LLJI.LJIIZILJ() && !this.LLJI.LJJJI()) {
                this.LLJI.LJJIZ(getSurfaceHolder());
            }
            this.LLJILJIL.LIZIZ();
        }
        EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
        C1474420oTI c1474420oTI = this.LLILZLL;
        EnumC1474270oT3 enumC1474270oT3 = EnumC1474270oT3.SURFACE_AVAILABLE;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("VideoViewType = ");
        sbLIZ2.append(this.LLIZLLLIL);
        enumC1471780oP2.trace(c1474420oTI, enumC1474270oT3, C2188811AlT.LIZIZ(sbLIZ2), null, getVideoStateInquirer());
    }

    public void LJJLIIIJJI() {
        if (this.LLILZLL == null) {
            return;
        }
        this.LLJJJJJIL = true;
        LJJJLIIL();
        LJJLIIIJLJLI();
        LJJLIIIJJIZ();
    }

    public void LJJLIIIJLJLI() {
        InterfaceC2178741AOq interfaceC2178741AOq;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj == null) {
            InterfaceC1474410oTH interfaceC1474410oTH = this.LLJ;
            getClass();
            C1474230oSz c1474230oSz = new C1474230oSz(interfaceC1474410oTH);
            this.LLJI = c1474230oSz;
            c1474230oSz.LLILZIL = this.LLIZLLLIL;
            return;
        }
        C1474420oTI playEntity = interfaceC2178671AOj.getPlayEntity();
        if (playEntity == null || playEntity.equals(this.LLILZLL)) {
            return;
        }
        C1474460oTM.LIZIZ(playEntity, "play_next");
        this.LLJI.release();
        if (LJJL() && !this.LLJI.LJJJJLI() && C12ES.LJIILIIL(this.LLILLL.getView()) && (interfaceC2178741AOq = this.LLILLL) != null && C12ES.LJIILIIL(interfaceC2178741AOq.getView())) {
            C12ES.LJIILL(8, this.LLILLL.getView());
        }
    }

    public int getCurrentPosition() {
        boolean z = this.LLJILJILJ;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj == null) {
            return 0;
        }
        return interfaceC2178671AOj.LJJIJLIJ(z);
    }

    public int getDuration() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj == null) {
            return 0;
        }
        return interfaceC2178671AOj.getDuration();
    }

    public s getPlayBackParams() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        return interfaceC2178671AOj != null ? interfaceC2178671AOj.LJII() : this.LLJJJJLIIL;
    }

    public Surface getSurface() {
        InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
        if (interfaceC2178741AOq != null) {
            return interfaceC2178741AOq.getSurface();
        }
        return null;
    }

    public SurfaceHolder getSurfaceHolder() {
        InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
        if (interfaceC2178741AOq != null) {
            return interfaceC2178741AOq.getSurfaceHolder();
        }
        return null;
    }

    public int getTextureLayout() {
        return this.LLILLJJLI.getTextureLayout();
    }

    public RectF getTextureRealRectF() {
        if (this.LLIZLLLIL == 0) {
            if (this.LLILLL != null) {
                return new RectF(((C1A79) this.LLILLL).getViewRect());
            }
            return null;
        }
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            return ((C1A76) interfaceC2178711AOn).getViewRect();
        }
        return null;
    }

    public float getTextureScaleX() {
        if (this.LLIZLLLIL == 0) {
            InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
            if (interfaceC2178741AOq != null) {
                return interfaceC2178741AOq.getView().getScaleX();
            }
            return 0.0f;
        }
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            return interfaceC2178711AOn.getVideoContainer().getScaleX();
        }
        return 0.0f;
    }

    public float getTextureScaleY() {
        if (this.LLIZLLLIL == 0) {
            InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
            if (interfaceC2178741AOq != null) {
                return interfaceC2178741AOq.getView().getScaleY();
            }
            return 0.0f;
        }
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            return interfaceC2178711AOn.getVideoContainer().getScaleY();
        }
        return 0.0f;
    }

    public int getTextureViewHeight() {
        if (this.LLIZLLLIL == 0) {
            InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
            if (interfaceC2178741AOq != null) {
                return interfaceC2178741AOq.getHeight();
            }
            return 0;
        }
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            return interfaceC2178711AOn.getVideoContainer().getHeight();
        }
        return 0;
    }

    public int getTextureViewWidth() {
        if (this.LLIZLLLIL == 0) {
            InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
            if (interfaceC2178741AOq != null) {
                return interfaceC2178741AOq.getWidth();
            }
            return 0;
        }
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            return interfaceC2178711AOn.getVideoContainer().getWidth();
        }
        return 0;
    }

    public TTVideoEngine getVideoEngine() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.LJJJZ();
        }
        return null;
    }

    public Bitmap getVideoFrame() {
        InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
        if (interfaceC2178741AOq != null) {
            return interfaceC2178741AOq.getBitmap();
        }
        return null;
    }

    public InterfaceC1471800oP4 getVideoStateInquirer() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            return interfaceC2178671AOj.getVideoStateInquirer();
        }
        return null;
    }

    public int getVideoViewMarginTop() {
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            return interfaceC2178711AOn.getVideoViewMarginTop();
        }
        return -1;
    }

    public int getWatchedDuration() {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj == null) {
            return 0;
        }
        return interfaceC2178671AOj.LJJIJIL();
    }

    public final void LJJJJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss surface capture view mVideoViewContainer = ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.LIZJ();
    }

    public final void LJJLI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceChanged setSurface vid:");
        sbLIZ.append(this.LLILZLL.LIZ);
        sbLIZ.append(" title:");
        this.LLILZLL.getClass();
        sbLIZ.append((String) null);
        sbLIZ.append("hash:");
        sbLIZ.append(this.LLJI.hashCode());
        sbLIZ.append(" VideoViewType = ");
        sbLIZ.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj == null || this.LLIZLLLIL != 2) {
            return;
        }
        interfaceC2178671AOj.setSurface(getSurface());
    }

    public final void LJJLIIIJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSurfaceDestroyed setSurface vid:");
        sbLIZ.append(this.LLILZLL.LIZ);
        sbLIZ.append(" title:");
        this.LLILZLL.getClass();
        sbLIZ.append((String) null);
        sbLIZ.append("hash:");
        sbLIZ.append(this.LLJI.hashCode());
        sbLIZ.append(" VideoViewType = ");
        sbLIZ.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj == null || this.LLIZLLLIL != 2) {
            return;
        }
        interfaceC2178671AOj.setSurface(null);
    }

    public final void LJJLIIIJJIZ() {
        Activity activityLIZ = C1474460oTM.LIZ(getContext());
        if (activityLIZ == null || !activityLIZ.isFinishing() || this.LLILZIL) {
            EnumC1471780oP2.INS.trace(this.LLILZLL, EnumC1474270oT3.VIDEO_PATCH_PLAY_INTERNAL, null, null, getVideoStateInquirer());
            C1AMG c1amg = this.LLIZ;
            if (c1amg != null) {
                if (this.LLIZLLLIL == 0) {
                    ((C1A79) this.LLILLL).setReuseSurfaceTexture(c1amg.LIZ);
                }
                setMute(this.LLIZ.LIZLLL);
                this.LLJJLIIIJLLLLLLLZ = this.LLIZ.LJIIJJI;
            }
            InterfaceC1395140mPQ interfaceC1395140mPQ = this.LLJJIII;
            if (interfaceC1395140mPQ != null) {
                this.LLJI.LJJIJIIJIL(interfaceC1395140mPQ);
            }
            AbstractC1468760oKA abstractC1468760oKA = this.LLJJIJIL;
            if (abstractC1468760oKA != null) {
                this.LLJI.LJJLIIIJ(abstractC1468760oKA);
            }
            this.LLJI.LJJIJL(this.LLJJJJ);
            this.LLJI.setLoop(this.LLIZ.LJ);
            this.LLJI.LJJLIIIJILLIZJL(this);
            this.LLJI.LJJLI(this.LLIZ.LJII);
            this.LLJI.setPlayEntity(this.LLILZLL);
            this.LLJI.LIZLLL(this.LLJJJJLIIL);
            this.LLJI.LJJIIZ(this);
            this.LLJI.LJJIL(this.LLJJJ);
            this.LLJI.LJJ(this.LLJILJILJ);
            this.LLJI.LJJJJZI(this.LLJILLL);
            this.LLJI.LJJIFFI(this.LLJL);
            this.LLJI.LJJJJI(this.LLIZ.LIZIZ);
            InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
            if (interfaceC2178741AOq != null) {
                interfaceC2178741AOq.setPlayEntity(this.LLILZLL);
            }
            this.LLILZLL.getClass();
            if (!TextUtils.isEmpty(null)) {
                C12ES.LJIILL(8, this.LLILLL.getView());
                LJJJJZ();
                return;
            }
            if (LJJL()) {
                setBackgroundColor(-16777216);
            }
            C12ES.LJIILL(0, this);
            Handler handler = this.LLJLIL;
            if (handler != null) {
                handler.removeMessages(0);
            }
            C12ES.LJIILL(0, this.LLILLL.getView());
            C12ES.LJIILL(0, this.LLILLJJLI.getVideoContainer());
            LJJJJLI();
            this.LLIZ.getClass();
            if (!this.LLJJLIIIJLLLLLLLZ) {
                if (LJJL()) {
                    this.LLJI.LJJIZ(getSurfaceHolder());
                } else {
                    Surface surface = getSurface();
                    if (surface != null && surface.isValid()) {
                        this.LLJI.setSurface(getSurface());
                    }
                }
                LJJJJZ();
                return;
            }
            ARunnableS133S0100000_33 aRunnableS133S0100000_33 = this.LLJLILLLLZIIL;
            if (aRunnableS133S0100000_33 != null) {
                Surface surface2 = getSurface();
                if (surface2 != null && surface2.isValid()) {
                    aRunnableS133S0100000_33.run();
                    return;
                }
                C1474280oT4 c1474280oT4 = this.LLJILJIL;
                if (c1474280oT4.LIZ == null) {
                    c1474280oT4.LIZ = new ArrayList();
                }
                ((ArrayList) c1474280oT4.LIZ).add(aRunnableS133S0100000_33);
            }
        }
    }

    public Lifecycle getObservedLifecycle() {
        return this.LLJJIJIIJIL;
    }

    public C1474420oTI getPlayEntity() {
        return this.LLILZLL;
    }

    public C1AMG getPlaySettings() {
        return this.LLIZ;
    }

    public InterfaceC2178711AOn getTextureContainer() {
        return this.LLILLJJLI;
    }

    public InterfaceC1474410oTH getVideoContext() {
        return this.LLJ;
    }

    public InterfaceC1474330oT9 getVideoPlayConfiger() {
        return this.LLJJ;
    }

    public long getVideoStopTimeStamp() {
        return this.LLJJL;
    }

    public int getVideoViewType() {
        return this.LLIZLLLIL;
    }

    public C2178631AOf(Context context) {
        super(context);
        this.LL = new C1APD();
        this.LLILZIL = false;
        this.LLIZ = C1AMG.LIZ();
        this.LLIZLLLIL = 0;
        this.LLJJIJI = new CopyOnWriteArrayList();
        this.LLJJJIL = true;
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = true;
        this.LLJL = false;
        this.LLJLILLLLZIIL = new ARunnableS133S0100000_33((C2178641AOg) this, 77);
        LJJJLL(context);
    }

    public static void LJJLIIIJLLLLLLLZ(FrameLayout.LayoutParams layoutParams) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateMarginLayoutParams. left=");
        sbLIZ.append(0);
        sbLIZ.append(", top=");
        sbLIZ.append(0);
        sbLIZ.append(", right=");
        sbLIZ.append(0);
        sbLIZ.append(", bottom=");
        sbLIZ.append(0);
        sbLIZ.append(", gravity=");
        sbLIZ.append(0);
        C2188811AlT.LIZIZ(sbLIZ);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.gravity = 0;
    }

    @Override // X.InterfaceC1474240oT0
    public final void LIZIZ(C1474520oTS c1474520oTS) {
        EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("OnUpdateVideoSize", EnumC1474430oTJ.PLAY, 6));
        int iLIZIZ = c1474520oTS.LIZIZ(1);
        int iLIZIZ2 = c1474520oTS.LIZIZ(2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateVideoSize width:");
        sbLIZ.append(iLIZIZ);
        sbLIZ.append(" height:");
        sbLIZ.append(iLIZIZ2);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.setVideoSize(iLIZIZ, iLIZIZ2);
    }

    @Override // X.InterfaceC1474330oT9
    public boolean LJIIIZ(EnumC804620VhM enumC804620VhM) {
        InterfaceC1474330oT9 interfaceC1474330oT9 = this.LLJJ;
        if (interfaceC1474330oT9 != null) {
            return interfaceC1474330oT9.LJIIIZ(enumC804620VhM);
        }
        return false;
    }

    @Override // X.InterfaceC1474330oT9
    public final C1474520oTS LJJJ(C1473400oRe c1473400oRe) {
        C1474520oTS c1474520oTSLJJJ;
        InterfaceC1474330oT9 interfaceC1474330oT9 = this.LLJJ;
        if (interfaceC1474330oT9 != null) {
            c1474520oTSLJJJ = interfaceC1474330oT9.LJJJ(c1473400oRe);
        } else {
            c1474520oTSLJJJ = C1473460oRk.LIZIZ(c1473400oRe).get(EnumC2281151EQn.Standard.getIndex());
        }
        LJJLIIJ(c1474520oTSLJJJ);
        return c1474520oTSLJJJ;
    }

    @Override // X.InterfaceC1474330oT9
    public final C1474520oTS LJJJJJL(C1470240oMY c1470240oMY) {
        C1473400oRe c1473400oRe;
        C1474520oTS c1474520oTSLJJJJJL;
        EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("SelectVideoInfoToPlay", EnumC1474430oTJ.PLAY, 6));
        if (c1470240oMY != null) {
            c1473400oRe = c1470240oMY.LIZJ;
        } else {
            c1473400oRe = null;
        }
        InterfaceC1474330oT9 interfaceC1474330oT9 = this.LLJJ;
        if (interfaceC1474330oT9 != null) {
            c1474520oTSLJJJJJL = interfaceC1474330oT9.LJJJJJL(c1470240oMY);
        } else {
            c1474520oTSLJJJJJL = C1473460oRk.LIZIZ(c1473400oRe).get(EnumC2281151EQn.Standard.getIndex());
        }
        LJJLIIJ(c1474520oTSLJJJJJL);
        return c1474520oTSLJJJJJL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1APG] */
    public void LJJJLL(Context context) {
        this.LLJILJIL = new C1474280oT4();
        this.LLJ = LJJJJZI(context);
        this.LLJIJIL = new Object() { // from class: X.1APG
        };
        ComponentCallbacks2 componentCallbacks2LIZ = C1474460oTM.LIZ(context);
        if (componentCallbacks2LIZ instanceof LifecycleOwner) {
            this.LLJJIJIIJIL = ((LifecycleOwner) componentCallbacks2LIZ).getLifecycle();
        }
    }

    public final void LJJLIIJ(C1474520oTS c1474520oTS) {
        if (c1474520oTS != null && c1474520oTS.getResolution() != EnumC2281151EQn.Auto) {
            EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("UpdateVideoSize", EnumC1474430oTJ.PLAY, 6));
            int iLIZIZ = c1474520oTS.LIZIZ(1);
            int iLIZIZ2 = c1474520oTS.LIZIZ(2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("selectVideoInfoToPlay width:");
            sbLIZ.append(iLIZIZ);
            sbLIZ.append(" height:");
            sbLIZ.append(iLIZIZ2);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLJJLI.setVideoSize(iLIZIZ, iLIZIZ2);
        }
    }

    public void setAsyncPosition(boolean z) {
        this.LLJILJILJ = z;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJ(z);
        }
    }

    public void setAsyncRelease(boolean z) {
        this.LLJILLL = z;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJJJZI(z);
        }
    }

    public void setLoop(boolean z) {
        this.LLIZ.LJ = z;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.setLoop(z);
        }
    }

    public void setMute(boolean z) {
        this.LLIZ.LIZLLL = z;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJIILJJIL(z);
        }
    }

    public void setOptimizeBlackSide(boolean z) {
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            interfaceC2178711AOn.setOptimizeBlackSide(z);
        }
    }

    public void setOptimizeNormalFillScreen(boolean z) {
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            interfaceC2178711AOn.setOptimizeNormalFillScreen(z);
        }
    }

    public void setPlayBackParams(s sVar) {
        this.LLJJJJLIIL = sVar;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LIZLLL(sVar);
        }
    }

    public void setPlayEntity(C1474420oTI c1474420oTI) {
        this.LLILZLL = c1474420oTI;
        if (c1474420oTI != null) {
            this.LLIZ = c1474420oTI.LJIIIIZZ;
        }
        this.LLJJJJJIL = false;
    }

    public void setPlayNeedSurfaceValid(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
    }

    public void setPlayUrlConstructor(InterfaceC1474390oTF interfaceC1474390oTF) {
        this.LLJJJ = interfaceC1474390oTF;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJIL(interfaceC1474390oTF);
        }
    }

    public void setReleaseEngineEnabled(boolean z) {
        if (this.LLJI == null) {
            InterfaceC1474410oTH interfaceC1474410oTH = this.LLJ;
            getClass();
            C1474230oSz c1474230oSz = new C1474230oSz(interfaceC1474410oTH);
            this.LLJI = c1474230oSz;
            c1474230oSz.LLILZIL = this.LLIZLLLIL;
        }
        this.LLJI.LJJJJZ(z);
    }

    public void setRenderMode(int i) {
        this.LLIZ.LJII = i;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJLI(i);
        }
    }

    public void setStartTime(int i) {
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJJJL(i);
        }
    }

    public void setSurfaceViewConfiger(C1AMJ c1amj) {
        this.LLJJI = c1amj;
    }

    public void setTextureCropStrategy(C1474490oTP c1474490oTP) {
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            interfaceC2178711AOn.setCropStrategy(c1474490oTP);
        }
    }

    public void setTextureLayout(int i) {
        C1AMG c1amg = this.LLIZ;
        if (c1amg != null) {
            c1amg.LJI = i;
        }
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            interfaceC2178711AOn.LIZ(i);
        }
    }

    public void setTryToInterceptPlay(boolean z) {
        this.LLJJJJ = z;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJIJL(z);
        }
    }

    public void setTtvNetClient(AbstractC1468760oKA abstractC1468760oKA) {
        this.LLJJIJIL = abstractC1468760oKA;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJLIIIJ(abstractC1468760oKA);
        }
    }

    public void setUseBlackCover(boolean z) {
        this.LLJJJIL = z;
        if (!z) {
            C12ES.LJIILL(8, this.LLILZ);
        }
    }

    public void setUseSurfaceView(boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < 24) {
                this.LLIZLLLIL = 2;
            } else {
                this.LLIZLLLIL = 1;
            }
        } else {
            this.LLIZLLLIL = 0;
        }
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJJJ(this.LLIZLLLIL);
        }
    }

    public void setVideoContext(Function1<Context, InterfaceC1474410oTH> function1) {
        if (function1 != null) {
            this.LLJ = function1.invoke(getContext());
        }
    }

    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        if (this.LLJI == null) {
            InterfaceC1474410oTH interfaceC1474410oTH = this.LLJ;
            getClass();
            C1474230oSz c1474230oSz = new C1474230oSz(interfaceC1474410oTH);
            this.LLJI = c1474230oSz;
            c1474230oSz.LLILZIL = this.LLIZLLLIL;
        }
        this.LLJI.LJJJLL(tTVideoEngine);
    }

    public void setVideoEngineFactory(InterfaceC1395140mPQ interfaceC1395140mPQ) {
        this.LLJJIII = interfaceC1395140mPQ;
    }

    public void setVideoMethodOpt(boolean z) {
        this.LLJL = z;
    }

    public void setVideoPlayConfiger(InterfaceC1474330oT9 interfaceC1474330oT9) {
        this.LLJJ = interfaceC1474330oT9;
        InterfaceC2178671AOj interfaceC2178671AOj = this.LLJI;
        if (interfaceC2178671AOj != null) {
            interfaceC2178671AOj.LJJIIZ(this);
        }
    }

    public void setVideoViewType(int i) {
        this.LLIZLLLIL = i;
    }

    public void setZoomingEnabled(boolean z) {
        InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
        if (interfaceC2178711AOn != null) {
            interfaceC2178711AOn.setZoomingEnabled(z);
        }
    }

    public void setVideoContext(InterfaceC1474410oTH interfaceC1474410oTH) {
        this.LLJ = interfaceC1474410oTH;
    }

    @Override // X.InterfaceC1474240oT0
    public void LIZJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LIZJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LIZLLL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJJJJLIIL = null;
        InterfaceC2178741AOq interfaceC2178741AOq = this.LLILLL;
        if (interfaceC2178741AOq != null) {
            interfaceC2178741AOq.setPlayEntity(null);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LIZLLL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        C12ES.LJIILL(8, this.LLILZ);
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJII(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIILJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILJJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIIZILJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIIZILJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("OnVideoReplay", EnumC1474430oTJ.PLAY, 6));
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIJJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("OnVideoRetry", EnumC1474430oTJ.PLAY, 6));
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIII(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIIZ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIIZI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIIZI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("OnEngineInitPlay", EnumC1474430oTJ.PLAY, 6));
        if (this.LLJJJIL) {
            C12ES.LJIILL(0, this.LLILZ);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIJLIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        if (this.LLJJJIL) {
            C12ES.LJIILL(0, this.LLILZ);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJLIJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LIZ(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, C1467470oI5 c1467470oI5) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJ(c2178751AOr, c1474420oTI, c1467470oI5);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJFF(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, long j) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJFF(c2178751AOr, c1474420oTI, j);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIIIIZZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        if (i == 0 || i == 2) {
            this.LLJJL = System.currentTimeMillis();
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIIIIZZ(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.InterfaceC1474360oTC
    public C1474520oTS LJIIJJI(C2178751AOr c2178751AOr, C1470240oMY c1470240oMY, C1474420oTI c1474420oTI) {
        if (this.LLJJ instanceof InterfaceC1474360oTC) {
            EnumC1471750oOz.INS.addTrace(c1474420oTI, C1471760oP0.LIZIZ("SelectVideoInfoToPlayV2", EnumC1474430oTJ.PLAY, 6));
            C1474520oTS c1474520oTSLJIIJJI = ((InterfaceC1474360oTC) this.LLJJ).LJIIJJI(c2178751AOr, c1470240oMY, c1474420oTI);
            LJJLIIJ(c1474520oTSLJIIJJI);
            return c1474520oTSLJIIJJI;
        }
        return null;
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIILL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIJI(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, e eVar) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJ(c2178751AOr, c1474420oTI, eVar);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIIJ(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIJIIJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("OnEnginePlayStart", EnumC1474430oTJ.PLAY, 6));
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIJIIJIL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474380oTE
    public void LJJIJL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474380oTE) it2.next()).LJJIJL(c2178751AOr, c1474420oTI, str);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, long j) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIZ(c2178751AOr, c1474420oTI, j);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJJJL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJJJL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.InterfaceC1474380oTE
    public void LJIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, String str) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474380oTE) it2.next()).LJIIL(c2178751AOr, c1474420oTI, i, str);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIILIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILIIL(c2178751AOr, c1474420oTI, i, i2);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIILLIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, EnumC2281151EQn enumC2281151EQn, int i) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIILLIIL(c2178751AOr, c1474420oTI, enumC2281151EQn, i);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJIJJLI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, EnumC2281151EQn enumC2281151EQn, boolean z) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJIJJLI(c2178751AOr, c1474420oTI, enumC2281151EQn, z);
        }
    }

    @Override // X.InterfaceC1474240oT0
    public void LJJIFFI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
        if (this.LLILLJJLI.getVideoWidth() * this.LLILLJJLI.getVideoHeight() == 0) {
            this.LLILLJJLI.setVideoSize(i, i2);
        }
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1474240oT0) it2.next()).LJJIFFI(c2178751AOr, c1474420oTI, i, i2);
        }
    }

    @Override // X.InterfaceC1474360oTC
    public final void LJJIJIIJI(C1474520oTS c1474520oTS, C2178751AOr c2178751AOr, C1470240oMY c1470240oMY, C1474420oTI c1474420oTI) {
        if (this.LLJJ instanceof InterfaceC1474360oTC) {
            EnumC1471750oOz.INS.addTrace(c1474420oTI, C1471760oP0.LIZIZ("OnVideoInfoSelected", EnumC1474430oTJ.PLAY, 3));
            ((InterfaceC1474360oTC) this.LLJJ).LJJIJIIJI(c1474520oTS, c2178751AOr, c1470240oMY, c1474420oTI);
        }
    }

    @Override // X.InterfaceC2178771AOt
    public void LJJII(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, boolean z, int i, boolean z2, boolean z3) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2178771AOt) it2.next()).LJJII(interfaceC1471800oP4, c1474420oTI, z, i, z2, z3);
        }
    }

    @Override // X.InterfaceC2178771AOt
    public void LJJIIJZLJL(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, InterfaceC1474410oTH interfaceC1474410oTH, boolean z, int i, boolean z2, boolean z3) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2178771AOt) it2.next()).LJJIIJZLJL(interfaceC1471800oP4, c1474420oTI, interfaceC1474410oTH, z, i, z2, z3);
        }
    }
}
