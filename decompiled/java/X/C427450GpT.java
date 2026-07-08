package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GpT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427450GpT extends LinearLayout {
    public final TuxTextView LL;
    public final C427480GpW LLILLJJLI;

    public final void setProgress(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        this.LL.setText(getContext().getString(2131820747, C2188811AlT.LIZIZ(sbLIZ)));
        this.LLILLJJLI.setProgress(i);
    }

    public C427450GpT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setGravity(1);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dl9, this, true);
        this.LL = (TuxTextView) findViewById(R.id.o6j);
        this.LLILLJJLI = (C427480GpW) findViewById(R.id.o6l);
    }
}
