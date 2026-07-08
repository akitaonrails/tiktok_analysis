package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Pck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648880Pck {
    public static final void LIZIZ(View view) {
        Integer numLIZJ;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zp, view.getContext());
        if (numLIZJ2 != null) {
            view.setBackgroundColor(numLIZJ2.intValue());
        }
        if (C07GI.LIZ() && (numLIZJ = C1308910kAL.LIZJ(R.attr.ok, view.getContext())) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
    }

    public static final void LIZJ(View view) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ol, view.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
    }

    public static final int LIZ(int i, int i2) {
        try {
            C844470XAv.LIZ.getClass();
            TuxTextView tuxTextView = new TuxTextView(C844470XAv.LIZ(), null, 6, 0);
            tuxTextView.setTuxFont(i);
            tuxTextView.setLines(i2);
            tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(C1415610mwR.LIZIZ(), 1073741824), View.MeasureSpec.makeMeasureSpec(C1415610mwR.LIZ(), Integer.MIN_VALUE));
            return tuxTextView.getMeasuredHeight();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38));
        }
    }
}
