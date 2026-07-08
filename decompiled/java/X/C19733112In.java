package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import kotlin.jvm.internal.AwS395S0200000_29;

/* JADX INFO: renamed from: X.12In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19733112In {
    public static C19733312Ip LIZ(Context context, C19732812Ik c19732812Ik) {
        c19732812Ik.getClass();
        AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(context, c19732812Ik, 39);
        C19733212Io c19733212Io = new C19733212Io(context);
        awS395S0200000_29.invoke(c19733212Io);
        C19733312Ip c19733312IpLIZ = c19733212Io.LIZ();
        TextView textView = c19733312IpLIZ.getTextView();
        if (textView != null) {
            if (C12VA.LIZ().LJFF) {
                textView.setTextSize(12.0f);
                C19734012Iw.LIZJ(textView);
            } else {
                textView.setTextSize(11.0f);
                textView.setTypeface(Typeface.defaultFromStyle(0));
                return c19733312IpLIZ;
            }
        }
        return c19733312IpLIZ;
    }
}
