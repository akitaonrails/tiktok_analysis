package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491160JNy extends FrameLayout {
    public C12P2 LL;
    public RelativeLayout LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public View LLILZIL;
    public long LLILZLL;
    public C0JO2 LLIZ;
    public final C054G LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public ObjectAnimator LLJILJILJ;
    public ObjectAnimator LLJILLL;
    public AnonymousClass0956 LLJJ;

    private final View getBufferBar() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.cxv);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    private final C16F5 getVideoDurationTV() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.yg3);
            this.LLILLL = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C12P2 getSeekBar() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.vkd);
            this.LL = (C12P2) callbackFindViewById;
        }
        return (C12P2) callbackFindViewById;
    }

    public final C16F5 getVideoCurrentTimeTV() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.fbg);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final RelativeLayout getVideoDurationContainer() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_seek_duration);
            this.LLILLJJLI = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    public final void setBufferBarVisibility(boolean z) {
        float width;
        if (z) {
            C500260Jjc.LLFFF(getBufferBar());
            View bufferBar = getBufferBar();
            if (bufferBar != null) {
                if (getBufferBar() != null) {
                    width = r0.getWidth() / 2.0f;
                } else {
                    width = 0.0f;
                }
                bufferBar.setPivotX(width);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(getBufferBar(), (Property<View, Float>) View.SCALE_X, 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LLJILJILJ = objectAnimatorOfFloat;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(getBufferBar(), (Property<View, Float>) View.SCALE_Y, 0.0f, 1.0f);
            objectAnimatorOfFloat2.setDuration(500L);
            objectAnimatorOfFloat2.setRepeatCount(-1);
            objectAnimatorOfFloat2.setRepeatMode(1);
            objectAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            C786410Ut5.Pd(objectAnimatorOfFloat2);
            this.LLJILLL = objectAnimatorOfFloat2;
            return;
        }
        C500260Jjc.LJIILLIIL(getBufferBar());
        ObjectAnimator objectAnimator = this.LLJILJILJ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LLJILLL;
        if (objectAnimator2 == null) {
            return;
        }
        objectAnimator2.cancel();
    }

    public final void setDefaultPlayMode(int i) {
        this.LLJ = i;
    }

    public final void setDuration(long j) {
        this.LLILZLL = j;
        C16F5 videoDurationTV = getVideoDurationTV();
        if (videoDurationTV != null) {
            videoDurationTV.setText(C0JO6.LIZ((int) (j / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
        }
    }

    public final void setEnableClickToSeek(boolean z) {
        C12P2 seekBar = getSeekBar();
        if (seekBar != null) {
            seekBar.setEnableClickToSeek(z);
        }
    }

    public final void setOnDragMode(int i) {
        this.LLJI = i;
    }

    public final void setPostDragMode(int i) {
        this.LLJIJIL = i;
    }

    public final void setSeekbarChangeListener(C0JO2 c0jo2) {
        this.LLIZ = c0jo2;
    }

    public final void setSeekbarProgress(float f) {
        C12P2 seekBar = getSeekBar();
        if (seekBar != null) {
            seekBar.setProgress(f);
        }
        C16F5 videoCurrentTimeTV = getVideoCurrentTimeTV();
        if (videoCurrentTimeTV != null) {
            videoCurrentTimeTV.setText(C0JO6.LIZ((int) ((f / 100.0f) * (this.LLILZLL / 1000.0f))));
        }
    }

    public final void setSeekbarSecondaryProgress(int i) {
        C12P2 seekBar = getSeekBar();
        if (seekBar != null) {
            seekBar.setSecondaryProgress(i);
        }
    }

    public final void setSeekbarShowType(int i) {
        AnonymousClass0956 anonymousClass0956 = this.LLJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C12P2 seekBar = getSeekBar();
        if (seekBar != null) {
            seekBar.setSeekBarShowType(i);
        }
    }

    public final void setSeekbarVisibility(boolean z) {
        int i;
        C12P2 seekBar = getSeekBar();
        if (seekBar != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.a0(seekBar, i);
        }
    }

    public final void setShouldShowSecondaryTimerOnDrag(boolean z) {
        this.LLJILJIL = z;
    }

    public C491160JNy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfl, this, true);
        C12P2 seekBar = getSeekBar();
        if (seekBar != null) {
            seekBar.setOnSeekBarChangeListener(new C0JO2() { // from class: X.0JNz
                @Override // X.C0JO2
                public final void onStartTrackingTouch(SeekBar seekBar2) {
                    AnonymousClass0956 anonymousClass0956 = this.LL.LLJJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C0JO2 c0jo2 = this.LL.LLIZ;
                    if (c0jo2 != null) {
                        c0jo2.onStartTrackingTouch(seekBar2);
                    }
                    C12P2 seekBar3 = this.LL.getSeekBar();
                    if (seekBar3 != null) {
                        seekBar3.setSeekBarShowType(this.LL.LLJI);
                    }
                    C491160JNy c491160JNy = this.LL;
                    if (c491160JNy.LLJILJIL) {
                        C500260Jjc.LLFFF(c491160JNy.getVideoDurationContainer());
                    }
                }

                @Override // X.C0JO2
                public final void onStopTrackingTouch(SeekBar seekBar2) {
                    C0JO2 c0jo2 = this.LL.LLIZ;
                    if (c0jo2 != null) {
                        c0jo2.onStopTrackingTouch(seekBar2);
                    }
                    C12P2 seekBar3 = this.LL.getSeekBar();
                    if (seekBar3 != null) {
                        seekBar3.setSeekBarShowType(this.LL.LLJIJIL);
                    }
                    C491160JNy c491160JNy = this.LL;
                    AnonymousClass0956 anonymousClass0956 = c491160JNy.LLJJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c491160JNy.LLJJ = C23250099c.LIZLLL(c491160JNy.LLIZLLLIL, null, null, new C0JO0(c491160JNy, null), 3);
                    C491160JNy c491160JNy2 = this.LL;
                    if (c491160JNy2.LLJILJIL) {
                        C500260Jjc.LJIILLIIL(c491160JNy2.getVideoDurationContainer());
                    }
                }

                @Override // X.C0JO2
                public final void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                    C16F5 videoCurrentTimeTV;
                    C0JO2 c0jo2 = this.LL.LLIZ;
                    if (c0jo2 != null) {
                        c0jo2.onProgressChanged(seekBar2, i, z);
                    }
                    if (z && (videoCurrentTimeTV = this.LL.getVideoCurrentTimeTV()) != null) {
                        videoCurrentTimeTV.setText(C0JO6.LIZ((int) ((i / 10000.0f) * (this.LL.LLILZLL / ((long) LSPassThroughRecordSizeConfig.DEFAULT)))));
                    }
                }
            });
        }
        C12P2 seekBar2 = getSeekBar();
        if (seekBar2 != null) {
            seekBar2.setDisableSeekTouch(false);
        }
        C12P2 seekBar3 = getSeekBar();
        if (seekBar3 != null) {
            seekBar3.setForceDispatchTouchEvent(true);
        }
        C12P2 seekBar4 = getSeekBar();
        if (seekBar4 != null) {
            seekBar4.bringToFront();
        }
        C12P2 seekBar5 = getSeekBar();
        if (seekBar5 != null) {
            seekBar5.setTranslationZ(10.0f);
        }
        this.LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        this.LLJI = 2;
        this.LLJIJIL = 1;
        this.LLJILJIL = true;
    }
}
