package X;

import android.content.Context;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0rXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1592520rXm {
    public static void LIZ(TextView textView, boolean z) {
        Context context;
        Integer numLIZJ;
        Context context2;
        Context context3;
        Integer numLIZJ2;
        Context context4;
        if (C1591480rW6.LIZ() == 2) {
            if (z) {
                if (textView != null && (context4 = textView.getContext()) != null) {
                    numLIZJ2 = C1308910kAL.LIZJ(R.attr.ip, context4);
                } else {
                    return;
                }
            } else if (textView == null || (context3 = textView.getContext()) == null) {
                return;
            } else {
                numLIZJ2 = C1308910kAL.LIZJ(R.attr.f500io, context3);
            }
            if (numLIZJ2 != null && textView != null) {
                C844470XAv.LIZ.getClass();
                textView.setShadowLayer(C12ES.LIZJ(12.0f, C844470XAv.LIZ()), 0.0f, 0.0f, numLIZJ2.intValue());
                return;
            }
            return;
        }
        if (C1591480rW6.LIZ() != 3) {
            return;
        }
        if (z) {
            if (textView == null || (context2 = textView.getContext()) == null) {
                return;
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.ir, context2);
            }
        } else if (textView == null || (context = textView.getContext()) == null) {
            return;
        } else {
            numLIZJ = C1308910kAL.LIZJ(R.attr.iq, context);
        }
        if (numLIZJ == null || textView == null) {
            return;
        }
        C844470XAv.LIZ.getClass();
        textView.setShadowLayer(C12ES.LIZJ(2.0f, C844470XAv.LIZ()), 0.0f, C12ES.LIZJ(1.0f, C844470XAv.LIZ()), numLIZJ.intValue());
    }
}
