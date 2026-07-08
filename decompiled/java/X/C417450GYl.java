package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417450GYl extends FrameLayout {
    public final LinearLayout LL;
    public final LinearLayout LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;

    public final void setHighGearDuration(long j) {
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('s');
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void setLowGearDuration(long j) {
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('s');
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public C417450GYl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.gar, this);
        setBackground(C800330VaR.LIZIZ(context, R.drawable.e7q));
        this.LL = (LinearLayout) getRootView().findViewById(R.id.ns3);
        this.LLILLL = (C16F5) getRootView().findViewById(R.id.m28);
        this.LLILLJJLI = (LinearLayout) getRootView().findViewById(R.id.jmc);
        this.LLILZ = (C16F5) getRootView().findViewById(R.id.m29);
    }
}
