package X;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;

/* JADX INFO: renamed from: X.0lNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1355740lNs extends AppCompatTextView {
    public AbstractC1355710lNp LLIZLLLIL;

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC1355710lNp abstractC1355710lNp;
        try {
            super.onTouchEvent(motionEvent);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CrashlyticsWrapperService.LIZLLL().LIZJ(e);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (abstractC1355710lNp = this.LLIZLLLIL) != null) {
                        abstractC1355710lNp.LIZ(false);
                        this.LLIZLLLIL = null;
                    }
                    return false;
                }
                AbstractC1355710lNp abstractC1355710lNp2 = this.LLIZLLLIL;
                if (abstractC1355710lNp2 != null && abstractC1355710lNp2 != LJJJI(motionEvent, AbstractC1355710lNp.class)) {
                    this.LLIZLLLIL.LIZ(false);
                    this.LLIZLLLIL = null;
                }
                return false;
            }
            AbstractC1355710lNp abstractC1355710lNp3 = this.LLIZLLLIL;
            if (abstractC1355710lNp3 == null || abstractC1355710lNp3 != LJJJI(motionEvent, AbstractC1355710lNp.class)) {
                return false;
            }
            this.LLIZLLLIL.LIZ(false);
            this.LLIZLLLIL = null;
            return true;
        }
        AbstractC1355710lNp abstractC1355710lNp4 = (AbstractC1355710lNp) LJJJI(motionEvent, AbstractC1355710lNp.class);
        if (abstractC1355710lNp4 != null) {
            abstractC1355710lNp4.LIZ(true);
            this.LLIZLLLIL = abstractC1355710lNp4;
            return true;
        }
        if (LJJJI(motionEvent, ClickableSpan.class) == null) {
            return false;
        }
        return true;
    }

    public C1355740lNs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTypeface(C1697580uHE.LIZ(400, 17.0f, 0.0f, Float.valueOf(16.0f)));
    }

    public final <T extends ClickableSpan> T LJJJI(MotionEvent motionEvent, Class<T> cls) {
        if (!(getText() instanceof Spanned)) {
            return null;
        }
        Spanned spanned = (Spanned) getText();
        int x = (((int) motionEvent.getX()) - getTotalPaddingLeft()) + getScrollX();
        int y = (((int) motionEvent.getY()) - getTotalPaddingTop()) + getScrollY();
        Layout layout = getLayout();
        try {
            int iU3 = C786410Ut5.U3(layout, layout.getLineForVertical(y), x);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(iU3, iU3, cls);
            if (clickableSpanArr.length <= 0) {
                return null;
            }
            ClickableSpan clickableSpan = clickableSpanArr[0];
            if (iU3 < spanned.getSpanStart(clickableSpan) || iU3 > spanned.getSpanEnd(clickableSpan)) {
                return null;
            }
            return (T) clickableSpanArr[0];
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C1355740lNs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setTypeface(C1697580uHE.LIZ(400, 17.0f, 0.0f, Float.valueOf(16.0f)));
    }
}
