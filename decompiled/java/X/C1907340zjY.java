package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907340zjY extends RelativeLayout {
    public static final int LLILLL = C341940Daq.LIZ(10.0d);
    public int LL;
    public boolean LLILLJJLI;

    static {
        C341940Daq.LIZ(6.0d);
        C341940Daq.LIZ(14.0d);
    }

    public final boolean getRiVideoRightShowed() {
        return this.LLILLJJLI;
    }

    public final int getRightCoverTopMargin() {
        return this.LL;
    }

    public final void setRiVideoRightShowed(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setRightCoverTopMargin(int i) {
        this.LL = i;
    }

    public C1907340zjY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View viewFindViewById;
        C1907120zjC c1907120zjC;
        C637570Ozb rightNotificationCoverWithIconFromXml;
        boolean z;
        int measuredHeight;
        int i3;
        super.onMeasure(i, i2);
        View viewFindViewById2 = findViewById(R.id.peb);
        if (viewFindViewById2 == null || (viewFindViewById = findViewById(R.id.peh)) == null || (c1907120zjC = (C1907120zjC) findViewById(R.id.pf0)) == null) {
            return;
        }
        View viewFindViewById3 = findViewById(R.id.pdq);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.pe4);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.pe2);
        C424560Gko rightNotificationCoverFromXml = c1907120zjC.getRightNotificationCoverFromXml();
        boolean z2 = true;
        if ((rightNotificationCoverFromXml != null && rightNotificationCoverFromXml.getVisibility() == 0) || ((rightNotificationCoverWithIconFromXml = c1907120zjC.getRightNotificationCoverWithIconFromXml()) != null && rightNotificationCoverWithIconFromXml.getVisibility() == 0)) {
            z = true;
        } else {
            z = false;
        }
        this.LLILLJJLI = z;
        if (viewFindViewById3.getVisibility() != 0) {
            z2 = false;
        }
        if (this.LLILLJJLI) {
            int measuredHeight2 = getMeasuredHeight();
            int measuredHeight3 = viewFindViewById.getMeasuredHeight();
            if (viewFindViewById4.getMeasuredHeight() != 0) {
                measuredHeight = viewFindViewById4.getMeasuredHeight();
            } else {
                measuredHeight = viewFindViewById5.getMeasuredHeight();
            }
            int measuredHeight4 = c1907120zjC.getMeasuredHeight();
            if (measuredHeight3 <= measuredHeight && !z2) {
                i3 = (measuredHeight2 - measuredHeight4) / 2;
            } else {
                i3 = LLILLL;
            }
            this.LL = i3;
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View viewFindViewById = findViewById(R.id.pf0);
        if (viewFindViewById != null && this.LLILLJJLI) {
            viewFindViewById.setTop(this.LL);
            viewFindViewById.setBottom((viewFindViewById.getMeasuredHeight() + r1) - 1);
        }
    }
}
