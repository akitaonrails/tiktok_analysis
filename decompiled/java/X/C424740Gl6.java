package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424740Gl6 extends TuxTextView {
    public C424740Gl6(Context context) {
        int i;
        super(context, null, 0);
        if (C04J1.LIZ) {
            setBackgroundResource(R.drawable.b2h);
            i = 71;
        } else {
            setBackgroundResource(R.drawable.b2g);
            i = 72;
        }
        setTuxFont(i);
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0);
        setGravity(17);
    }

    public final void setIsSelected(boolean z) {
        int i;
        setSelected(z);
        boolean z2 = C04J1.LIZ;
        boolean z3 = C04J1.LIZ;
        int i2 = R.attr.ee;
        if (z3) {
            if (!z) {
                i2 = R.attr.eh;
            }
        } else if (z) {
            i2 = R.attr.a1h;
        }
        setTextColor(C960203pA.LIZ(i2, getContext()));
        if (z3) {
            if (z) {
                i = 72;
            } else {
                i = 71;
            }
            setTuxFont(i);
        }
    }

    public final void setTitle(String str) {
        setText(str);
    }
}
