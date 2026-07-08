package X;

import Y.ACListenerS119S0200000_16;
import Y.ALAdapterS12S0100000_16;
import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1077400e8w implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1077400e8w viewTreeObserverOnGlobalLayoutListenerC1077400e8w) {
        String desc;
        C786410Ut5.C3(((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077400e8w);
        TextView textViewLJIJI = ((AdNewFakeUserProfileHeaderWidget) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l1).LJIJI();
        if (textViewLJIJI != null) {
            LinearLayout linearLayout = (LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0;
            AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget = (AdNewFakeUserProfileHeaderWidget) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l1;
            String strSubstring = null;
            if (linearLayout.getVisibility() == 0) {
                int width = textViewLJIJI.getWidth();
                int width2 = linearLayout.getWidth();
                C786410Ut5.R7(linearLayout, new ACListenerS119S0200000_16(textViewLJIJI, adNewFakeUserProfileHeaderWidget, 5));
                TextPaint paint = textViewLJIJI.getPaint();
                if (textViewLJIJI.getLayout() == null) {
                    Aweme aweme = adNewFakeUserProfileHeaderWidget.LLIZLLLIL;
                    if (aweme != null) {
                        strSubstring = aweme.getDesc();
                    }
                    textViewLJIJI.setText(strSubstring);
                    return;
                }
                int lineStart = textViewLJIJI.getLayout().getLineStart(2);
                int lineEnd = textViewLJIJI.getLayout().getLineEnd(2);
                float f = width;
                float f2 = width2;
                if (f <= paint.measureText("...") + f2) {
                    C19MB c19mb = new C19MB();
                    c19mb.LJII((ConstraintLayout) adNewFakeUserProfileHeaderWidget.LLILLL);
                    c19mb.LJFF(R.id.nhm);
                    c19mb.LJIIIIZZ(R.id.nhm, 4, R.id.s15, 4);
                    c19mb.LJIIIIZZ(R.id.nhm, 6, R.id.s15, 7);
                    c19mb.LJIILL(R.id.nhm, -2);
                    c19mb.LJIIJJI(R.id.nhm, -2);
                    c19mb.LIZIZ((ConstraintLayout) adNewFakeUserProfileHeaderWidget.LLILLL);
                } else {
                    while (f - paint.measureText(textViewLJIJI.getText().subSequence(lineStart, lineEnd).toString()) < paint.measureText("...") + f2) {
                        lineEnd--;
                    }
                }
                StringBuilder sb = new StringBuilder();
                Aweme aweme2 = adNewFakeUserProfileHeaderWidget.LLIZLLLIL;
                if (aweme2 != null && (desc = aweme2.getDesc()) != null) {
                    strSubstring = desc.substring(0, lineEnd);
                }
                sb.append(strSubstring);
                sb.append("...");
                textViewLJIJI.setText(sb.toString());
                return;
            }
            C786410Ut5.R7(linearLayout, null);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1077400e8w viewTreeObserverOnGlobalLayoutListenerC1077400e8w) {
        View view;
        BottomSheetBehavior bottomSheetBehavior;
        Integer numValueOf;
        float f;
        TuxSheetBehavior tuxSheetBehavior;
        TuxSheet tuxSheet = ((C1058500deS) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0).LLILZIL;
        if (tuxSheet != null && (view = tuxSheet.getView()) != null) {
            int measuredHeight = view.getMeasuredHeight();
            C16BC<?> c16bcLIZ = ((C1058500deS) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0).LIZ();
            if (C299110Bnx.LIZ()) {
                if ((c16bcLIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLIZ) != null) {
                    numValueOf = Integer.valueOf(tuxSheetBehavior.getPeekHeight());
                } else {
                    return;
                }
            } else if (!(c16bcLIZ instanceof BottomSheetBehavior) || (bottomSheetBehavior = (BottomSheetBehavior) c16bcLIZ) == null) {
                return;
            } else {
                numValueOf = Integer.valueOf(bottomSheetBehavior.getPeekHeight());
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (measuredHeight > 0 && iIntValue > 0) {
                    C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077400e8w);
                    C1058500deS c1058500deS = (C1058500deS) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0;
                    c1058500deS.LLILZLL = measuredHeight;
                    c1058500deS.LLIZ = iIntValue;
                    if (C294480BgU.LIZ() >= 3) {
                        f = iIntValue;
                    } else {
                        f = measuredHeight * 0.73f;
                    }
                    c1058500deS.LLJIJIL = f;
                    C1058500deS c1058500deS2 = (C1058500deS) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0;
                    c1058500deS2.LLJI = C814420VxA.LIZIZ(c1058500deS2.LLILZLL * c1058500deS2.LLJ);
                    ((C1058500deS) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0).getClass();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(C1619980sG4.LJIILIIL());
                    C1058500deS c1058500deS3 = (C1058500deS) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0;
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(c1058500deS3, 37));
                    valueAnimatorOfFloat.addListener(new ALAdapterS12S0100000_16(c1058500deS3, 13));
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1077400e8w viewTreeObserverOnGlobalLayoutListenerC1077400e8w) {
        if (((BaseCaptionSheetFragment) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0).isVisible() && ((ViewOnAttachStateChangeListenerC20604515jv) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l1).getChildCount() > 1) {
            ((BaseCaptionSheetFragment) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l0).MR();
            C786410Ut5.C3(((ViewOnAttachStateChangeListenerC20604515jv) viewTreeObserverOnGlobalLayoutListenerC1077400e8w.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077400e8w);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1077400e8w(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
