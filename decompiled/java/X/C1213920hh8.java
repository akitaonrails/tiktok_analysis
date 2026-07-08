package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1213920hh8 extends FrameLayout {
    public final TuxTextView LL;
    public SearchKeyFramePoint LLILLJJLI;

    public C1213920hh8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setDuration(int i) {
    }

    public C1213920hh8(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f4g, this, true);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.ube);
        this.LL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(51);
        }
    }
}
