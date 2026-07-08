package X;

import Y.ACListenerS147S0100000_12;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.FloatWindowPlayingNoOverViewPermissionEvent;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import qo2.w;

/* JADX INFO: renamed from: X.0Ulr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781930Ulr extends C781960Ulu implements Handler.Callback {
    public static final int LLJLIL = (int) C497740JfY.LIZIZ(130.0f);
    public static final int LLJLILLLLZIIL = (int) C497740JfY.LIZIZ(231.0f);
    public DataChannel LLJJIJIIJIL;
    public final Context LLJJIJIL;
    public final View LLJJJ;
    public final TextureView LLJJJIL;
    public final LiveIconView LLJJJJ;
    public final LiveIconView LLJJJJJIL;
    public final View LLJJJJLIIL;
    public final C781940Uls LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public final BPEAHandler LLJL;

    public final void LIZ() {
        int iLJIIJ = (C12ES.LJIIJ(this.LLJJIJIL) - ((int) C497740JfY.LIZIZ(12.0f))) - LLJLIL;
        WindowManager.LayoutParams layoutParams = this.LLILLL;
        layoutParams.gravity = 8388659;
        layoutParams.x = iLJIIJ;
        this.LLILZIL = iLJIIJ;
        layoutParams.y = 0;
        this.LLILZLL = 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C781930Ulr() {
        Context contextN3 = C786410Ut5.N3(C497740JfY.LJII());
        super(contextN3);
        this.LLJJIJIL = contextN3;
        this.LLJL = new BPEAHandler(Looper.getMainLooper(), this);
        View viewSd = C786410Ut5.Sd(R.layout.hmu, C786410Ut5.ne(new C1361400lX0(contextN3, C011Z.LIZ.LJ())), null);
        this.LLILZ = viewSd;
        this.LLJILJILJ = ViewConfiguration.get(contextN3).getScaledTouchSlop();
        this.LLILZ.setOnTouchListener(new View.OnTouchListener() { // from class: X.0Ult
            public float LL;
            public float LLILLJJLI;
            public float LLILLL;
            public float LLILZ;

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                int iLJIIJ;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 2) {
                            this.LLILLL = motionEvent.getRawX() - this.LL;
                            this.LLILZ = motionEvent.getRawY() - this.LLILLJJLI;
                            if (Math.abs(this.LLILLL) > 0.0f || Math.abs(this.LLILZ) > 0.0f) {
                                C781960Ulu c781960Ulu = this;
                                int i = (int) (c781960Ulu.LLILZIL + this.LLILLL);
                                int i2 = (int) (c781960Ulu.LLILZLL + this.LLILZ);
                                if (!c781960Ulu.LLIZ) {
                                    WindowManager.LayoutParams layoutParams = c781960Ulu.LLILLL;
                                    layoutParams.x = i;
                                    c781960Ulu.LLILZIL = i;
                                    layoutParams.y = i2;
                                    c781960Ulu.LLILZLL = i2;
                                    ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(c781960Ulu, 403);
                                    if (Looper.myLooper() == Looper.getMainLooper()) {
                                        aRunnableS112S0100000_12.run();
                                    } else {
                                        C786410Ut5.LJJZZIII(C473410IhP.LIZ(), aRunnableS112S0100000_12);
                                    }
                                }
                            }
                            this.LL = motionEvent.getRawX();
                            this.LLILLJJLI = motionEvent.getRawY();
                        }
                    } else {
                        this.LLJI = motionEvent.getRawX();
                        this.LLJIJIL = motionEvent.getRawY();
                        C781960Ulu c781960Ulu2 = this;
                        float fAbs = Math.abs(c781960Ulu2.LLJI - c781960Ulu2.LLIZLLLIL);
                        C781960Ulu c781960Ulu3 = this;
                        if (fAbs <= c781960Ulu3.LLJILJILJ && Math.abs(c781960Ulu3.LLJIJIL - c781960Ulu3.LLJ) <= this.LLJILJILJ) {
                            z = false;
                        } else {
                            z = true;
                        }
                        c781960Ulu2.LLJILJIL = z;
                        C781960Ulu c781960Ulu4 = this;
                        if (c781960Ulu4.LLJILJIL) {
                            int i3 = c781960Ulu4.LLILZIL;
                            if ((i3 * 2) + view.getWidth() > C12ES.LJIIJ(c781960Ulu4.LL)) {
                                iLJIIJ = (C12ES.LJIIJ(c781960Ulu4.LL) - view.getWidth()) - c781960Ulu4.LLJJI;
                            } else {
                                iLJIIJ = c781960Ulu4.LLJJ;
                            }
                            int i4 = c781960Ulu4.LLILZLL;
                            int iLJIILLIIL = c781960Ulu4.LLJJIII;
                            if (i4 >= iLJIILLIIL) {
                                if (i4 > C497740JfY.LJIILLIIL() - c781960Ulu4.LLJJIJI) {
                                    iLJIILLIIL = C497740JfY.LJIILLIIL() - c781960Ulu4.LLJJIJI;
                                } else {
                                    iLJIILLIIL = i4;
                                }
                            }
                            if ((c781960Ulu4.LLJJIJI != 0 || c781960Ulu4.LLJJIII != 0) && i4 != iLJIILLIIL) {
                                ValueAnimator valueAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat((Property<?, Float>) View.X, i3, iLJIIJ), PropertyValuesHolder.ofFloat((Property<?, Float>) View.Y, i4, iLJIILLIIL));
                                c781960Ulu4.LLJILLL = valueAnimatorOfPropertyValuesHolder;
                                valueAnimatorOfPropertyValuesHolder.addUpdateListener(new AUListenerS262S0100000_12(c781960Ulu4, 51));
                            } else {
                                ValueAnimator valueAnimatorOfInt = ObjectAnimator.ofInt(i3, iLJIIJ);
                                c781960Ulu4.LLJILLL = valueAnimatorOfInt;
                                valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(c781960Ulu4, 52));
                            }
                            c781960Ulu4.LLJILLL.setInterpolator(new AccelerateDecelerateInterpolator());
                            c781960Ulu4.LLJILLL.addListener(new ALAdapterS9S0100000_12(c781960Ulu4, 41));
                            c781960Ulu4.LLJILLL.setDuration(300L).start();
                        }
                    }
                } else {
                    this.LLIZLLLIL = motionEvent.getRawX();
                    this.LLJ = motionEvent.getRawY();
                    this.LL = motionEvent.getRawX();
                    this.LLILLJJLI = motionEvent.getRawY();
                    C781960Ulu c781960Ulu5 = this;
                    ValueAnimator valueAnimator = c781960Ulu5.LLJILLL;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        c781960Ulu5.LLJILLL.cancel();
                    }
                }
                return this.LLJILJIL;
            }
        });
        int i = LLJLIL;
        int i2 = LLJLILLLLZIIL;
        WindowManager.LayoutParams layoutParams = this.LLILLL;
        layoutParams.width = i;
        layoutParams.height = i2;
        ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 403);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            aRunnableS112S0100000_12.run();
        } else {
            C786410Ut5.LJJZZIII(C473410IhP.LIZ(), aRunnableS112S0100000_12);
        }
        LIZ();
        View viewFindViewById = viewSd.findViewById(R.id.eqx);
        this.LLJJJ = viewFindViewById;
        this.LLJJJIL = (TextureView) viewSd.findViewById(R.id.xry);
        this.LLJJJJ = (LiveIconView) viewSd.findViewById(R.id.e26);
        this.LLJJJJJIL = (LiveIconView) viewSd.findViewById(R.id.c0n);
        LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.o9h);
        C16F5 c16f5 = (C16F5) viewSd.findViewById(R.id.o9_);
        View viewFindViewById2 = viewSd.findViewById(R.id.o99);
        this.LLJJJJLIIL = viewFindViewById2;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 405), viewFindViewById);
        }
        View viewFindViewById3 = viewSd.findViewById(R.id.e2a);
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 406), viewFindViewById3);
        }
        C781940Uls c781940Uls = new C781940Uls();
        this.LLJJL = c781940Uls;
        c781940Uls.LL = liveIconView;
        c781940Uls.LLILLJJLI = c16f5;
        c781940Uls.LLILLL = viewFindViewById2;
        View view = this.LLILZ;
        if (view != null) {
            view.setOutlineProvider(new C785830Us9(2));
            view.setClipToOutline(true);
        }
        C1143680frq.LJ(this.LLJJJJ, "tiktok_live_broadcast_demand_8", "float_window_close.png", ImageView.ScaleType.CENTER_CROP);
        C1143680frq.LJ(this.LLJJJJJIL, "tiktok_live_broadcast_demand_8", "float_window_big.png", ImageView.ScaleType.CENTER_CROP);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 100) {
            if (C0W78.LJFF(this.LLJJIJIL)) {
                C786410Ut5.LJLJJI(100, Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJL);
                return true;
            }
            DataChannel dataChannel = this.LLJJIJIIJIL;
            if (dataChannel != null) {
                dataChannel.FQ2(FloatWindowPlayingNoOverViewPermissionEvent.class);
            }
            this.LLJL.removeMessages(100);
            return true;
        }
        return true;
    }

    public final void LIZIZ(boolean z, C0UGY c0ugy) {
        if (z != (!this.LLIZ)) {
            if (z) {
                C0UVE.LJ("small_window", -1L, "start", c0ugy);
                this.LLJJLIIIJLLLLLLLZ = SystemClock.uptimeMillis();
                C0UVE.LIZIZ = true;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_small_window_real_show");
                w.LIZ.getClass();
                c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
                c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "room_id");
                c474500IjALIZ.LIZ();
                LIZ();
                ARunnableS112S0100000_12 aRunnableS112S0100000_12 = new ARunnableS112S0100000_12(this, 402);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aRunnableS112S0100000_12.run();
                } else {
                    C786410Ut5.LJJZZIII(C473410IhP.LIZ(), aRunnableS112S0100000_12);
                }
                C786410Ut5.LJLJJI(100, Mp4ScreenVideoLoadTimeout.CONTROL, this.LLJL);
                return;
            }
            C0UVE.LIZIZ = false;
            C0UVE.LJ("small_window", Long.valueOf(SystemClock.uptimeMillis() - this.LLJJLIIIJLLLLLLLZ), "end", c0ugy);
            if (!this.LLIZ) {
                this.LLILLJJLI.removeView(this.LLILZ);
                this.LLIZ = true;
            }
            ValueAnimator valueAnimator = this.LLJILLL;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.LLJILLL.cancel();
            }
            this.LLJJLIIIJLLLLLLLZ = 0L;
            C781940Uls c781940Uls = this.LLJJL;
            if (c781940Uls != null) {
                c781940Uls.LIZLLL(true);
            }
            DataChannel dataChannel = this.LLJJIJIIJIL;
            if (dataChannel != null) {
                dataChannel.zQ2(this);
            }
            this.LLJL.removeMessages(100);
            this.LLJJIJIIJIL = null;
        }
    }
}
