package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C430480GuM extends C430470GuL {
    public C430480GuM(final Context context, final AttributeSet attributeSet) {
        new C427280GpC(context, attributeSet) { // from class: X.0GuL
            @Override // X.C427280GpC, android.view.View
            public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
                try {
                    return super.createAccessibilityNodeInfo();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJI("ClickSpanWorkaroundTextView super.createAccessibilityNodeInfo error", e);
                    return null;
                }
            }

            @Override // android.widget.TextView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                    super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJI("ClickSpanWorkaroundTextView super.onTouchEvent error", e);
                }
                if (motionEvent.getAction() == 0 && (getText() instanceof Spanned)) {
                    Spanned spanned = (Spanned) getText();
                    int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
                    int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
                    Layout layout = getLayout();
                    try {
                        int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
                        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(iU3, iU3, ClickableSpan.class);
                        if (clickableSpanArr.length > 0) {
                            ClickableSpan clickableSpan = clickableSpanArr[0];
                            if (iU3 >= spanned.getSpanStart(clickableSpan) && iU3 <= spanned.getSpanEnd(clickableSpan) && clickableSpanArr[0] != null) {
                                return true;
                            }
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                return false;
            }
        };
        setHighlightColor(0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJI("MentionTextView super.onMeasure error", e);
        }
    }
}
