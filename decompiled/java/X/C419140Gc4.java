package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419140Gc4 extends LinearLayout {
    public final int LL;
    public final TuxTextView LLILLJJLI;
    public C1765700w36 LLILLL;
    public int LLILZ;

    public final void setCountDowInfo(String str) {
        if (!Intrinsics.LJFF(str, this.LLILLJJLI.getText())) {
            this.LLILLJJLI.setText(str);
        }
    }

    public C419140Gc4(int i, Context context) {
        super(context, null, 0);
        this.LL = i;
        setOrientation(0);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextAlignment(5);
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColorRes(R.attr.eh);
        tuxTextView.setMaxLines(1);
        this.LLILLJJLI = tuxTextView;
        addView(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
    }
}
