package X;

import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389720FPu extends TuxTextView {
    public C389720FPu(Context context) {
        super(context, null, 0);
        setBackgroundResource(R.drawable.b2i);
        setTuxFont(92);
        setTextColor(C960203pA.LIZ(R.attr.ee, context));
        setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 0);
        setGravity(17);
    }

    public final void setIsSelected(boolean z) {
        setSelected(z);
    }

    public final void setTitle(String str) {
        setText(str);
    }
}
