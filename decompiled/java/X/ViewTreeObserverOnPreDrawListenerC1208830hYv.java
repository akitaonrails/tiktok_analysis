package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.ss.android.ugc.aweme.mix.mixdetail.MixVideosDialog;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewTreeObserverOnPreDrawListenerC1208830hYv implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1208830hYv viewTreeObserverOnPreDrawListenerC1208830hYv) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int marginStart;
        int marginEnd;
        int marginStart2;
        int marginEnd2;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C786410Ut5.D3(((MixVideosDialog) viewTreeObserverOnPreDrawListenerC1208830hYv.l0).dS().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1208830hYv);
        MixVideosDialog mixVideosDialog = (MixVideosDialog) viewTreeObserverOnPreDrawListenerC1208830hYv.l0;
        int width = mixVideosDialog.dS().getWidth();
        int iMeasureText = (int) mixVideosDialog.NR().getPaint().measureText(mixVideosDialog.NR().getText().toString());
        View viewAS = mixVideosDialog.aS();
        ViewGroup.LayoutParams layoutParams = viewAS.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        boolean z = false;
        if (marginLayoutParams != null) {
            marginStart = marginLayoutParams.getMarginStart();
            marginEnd = marginLayoutParams.getMarginEnd();
        } else {
            marginStart = 0;
            marginEnd = 0;
        }
        int measuredWidth = marginStart + marginEnd + viewAS.getMeasuredWidth();
        View viewBS = mixVideosDialog.bS();
        ViewGroup.LayoutParams layoutParams2 = viewBS.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginStart2 = marginLayoutParams2.getMarginStart();
            marginEnd2 = marginLayoutParams2.getMarginEnd();
        } else {
            marginStart2 = 0;
            marginEnd2 = 0;
        }
        int measuredWidth2 = marginStart2 + marginEnd2 + viewBS.getMeasuredWidth();
        int iMeasureText2 = ((int) mixVideosDialog.WR().getPaint().measureText(mixVideosDialog.WR().getText().toString())) + measuredWidth;
        int iMeasureText3 = ((int) mixVideosDialog.VR().getPaint().measureText(mixVideosDialog.VR().getText().toString())) + measuredWidth2;
        int i = iMeasureText + iMeasureText2 + iMeasureText3;
        if (i > width) {
            if (iMeasureText <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) {
                if (iMeasureText2 > iMeasureText3) {
                    MixVideosDialog.mS(mixVideosDialog.WR(), ((width - iMeasureText) - iMeasureText3) - measuredWidth);
                } else {
                    MixVideosDialog.mS(mixVideosDialog.VR(), ((width - iMeasureText) - iMeasureText2) - measuredWidth2);
                }
            } else {
                int i2 = iMeasureText - (i - width);
                if (i2 >= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) {
                    MixVideosDialog.mS(mixVideosDialog.NR(), i2);
                } else {
                    int iMS = MixVideosDialog.mS(mixVideosDialog.NR(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                    if (iMeasureText2 > iMeasureText3) {
                        MixVideosDialog.mS(mixVideosDialog.WR(), ((width - iMS) - iMeasureText3) - measuredWidth);
                    } else {
                        MixVideosDialog.mS(mixVideosDialog.VR(), ((width - iMS) - iMeasureText2) - measuredWidth2);
                    }
                }
            }
            z = true;
        }
        return !z;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1208830hYv viewTreeObserverOnPreDrawListenerC1208830hYv) {
        C18Z8 c18z8;
        ViewTreeObserver viewTreeObserver;
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS562S0100000_18((RavenFragment) viewTreeObserverOnPreDrawListenerC1208830hYv.l0, 2640));
        C18Z8 c18z82 = ((RavenFragment) viewTreeObserverOnPreDrawListenerC1208830hYv.l0).LLJILJIL;
        if (c18z82 != null && c18z82.getVisibility() == 0 && (c18z8 = ((RavenFragment) viewTreeObserverOnPreDrawListenerC1208830hYv.l0).LLJILJIL) != null && (viewTreeObserver = c18z8.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1208830hYv);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1208830hYv, ViewTreeObserver.OnPreDrawListener.class);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTreeObserverOnPreDrawListenerC1208830hYv(Object obj, RavenFragment<Object> ravenFragment) {
        this.$t = ravenFragment;
        this.l0 = obj;
    }
}
