package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.047u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10476047u extends HorizontalScrollView {
    public final LinearLayout LL;
    public final LinkedList<TuxTextView> LLILLJJLI;

    public C10476047u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-2, -2));
        this.LL = linearLayout;
        this.LLILLJJLI = new LinkedList<>();
        setHorizontalScrollBarEnabled(false);
        addView(linearLayout);
    }
}
