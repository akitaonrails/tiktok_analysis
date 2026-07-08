package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746320TPi extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public TuxTextView LLILZLL;
    public boolean LLIZ;

    private final ValueAnimator getAlphaInAnimator() {
        return (ValueAnimator) this.LLILLL.getValue();
    }

    private final ValueAnimator getAlphaOutAnimator() {
        return (ValueAnimator) this.LLILZIL.getValue();
    }

    private final ValueAnimator getZoomInAnimator() {
        return (ValueAnimator) this.LLILLJJLI.getValue();
    }

    private final ValueAnimator getZoomOutAnimator() {
        return (ValueAnimator) this.LLILZ.getValue();
    }

    public final void LIZ() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        ValueAnimator zoomInAnimator = getZoomInAnimator();
        if (zoomInAnimator != null) {
            zoomInAnimator.cancel();
        }
        ValueAnimator zoomOutAnimator = getZoomOutAnimator();
        if (zoomOutAnimator != null) {
            zoomOutAnimator.cancel();
        }
        ValueAnimator alphaInAnimator = getAlphaInAnimator();
        if (alphaInAnimator != null) {
            alphaInAnimator.cancel();
        }
        ValueAnimator alphaOutAnimator = getAlphaOutAnimator();
        if (alphaOutAnimator != null) {
            alphaOutAnimator.cancel();
        }
        ValueAnimator zoomInAnimator2 = getZoomInAnimator();
        if (zoomInAnimator2 != null) {
            zoomInAnimator2.start();
        }
        ValueAnimator alphaInAnimator2 = getAlphaInAnimator();
        if (alphaInAnimator2 != null) {
            alphaInAnimator2.start();
        }
    }

    public final void LIZIZ() {
        if (this.LLIZ) {
            this.LLIZ = false;
            ValueAnimator zoomInAnimator = getZoomInAnimator();
            if (zoomInAnimator != null) {
                zoomInAnimator.cancel();
            }
            ValueAnimator zoomOutAnimator = getZoomOutAnimator();
            if (zoomOutAnimator != null) {
                zoomOutAnimator.cancel();
            }
            ValueAnimator alphaInAnimator = getAlphaInAnimator();
            if (alphaInAnimator != null) {
                alphaInAnimator.cancel();
            }
            ValueAnimator alphaOutAnimator = getAlphaOutAnimator();
            if (alphaOutAnimator != null) {
                alphaOutAnimator.cancel();
            }
            ValueAnimator zoomOutAnimator2 = getZoomOutAnimator();
            if (zoomOutAnimator2 != null) {
                zoomOutAnimator2.start();
            }
            ValueAnimator alphaOutAnimator2 = getAlphaOutAnimator();
            if (alphaOutAnimator2 != null) {
                alphaOutAnimator2.start();
            }
        }
    }

    public final Interpolator getAnimInterpolator() {
        return (Interpolator) this.LL.getValue();
    }

    public C746320TPi(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(396));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 866));
        this.LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 864));
        this.LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 867));
        this.LLILZIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 865));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d32, this, true);
        this.LLILZLL = (TuxTextView) findViewById(R.id.zwr);
    }
}
