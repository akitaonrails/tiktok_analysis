package X;

import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0LJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540840LJa extends LinearLayout {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;
    public final View LLILZIL;
    public View.OnClickListener LLILZLL;

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.LLILZLL = onClickListener;
    }

    public final void setStartIconRes(int i) {
        this.LLILLL.setIconRes(i);
    }

    public final void setSubtitle(String str) {
        this.LLILZ.setText(str);
    }

    public final void setTitle(String str) {
        this.LL.setText(str);
    }

    public C540840LJa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bhb, this, true);
        setOrientation(1);
        this.LL = (TuxTextView) findViewById(R.id.y3b);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.y1g);
        this.LLILLL = (TuxIconView) findViewById(R.id.y37);
        this.LLILZ = (TuxTextView) findViewById(R.id.wmw);
        View viewFindViewById = findViewById(R.id.y0w);
        this.LLILZIL = viewFindViewById;
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 137), viewFindViewById);
    }
}
