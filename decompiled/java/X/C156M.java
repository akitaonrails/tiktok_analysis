package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.156M, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C156M extends FrameLayout {
    public final Context LL;
    public final ViewStub LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public final ViewStub LLILZLL;
    public View LLIZ;
    public TuxTextView LLIZLLLIL;
    public final ViewStub LLJ;
    public View LLJI;
    public TuxTextView LLJIJIL;
    public C156O LLJILJIL;
    public C204655156f LLJILJILJ;

    public C156M(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = context;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i_c, this, true);
        this.LLILLJJLI = (ViewStub) viewTd.findViewById(R.id.vs_prepare_status);
        this.LLILZLL = (ViewStub) viewTd.findViewById(R.id.vs_striping_status);
        this.LLJ = (ViewStub) viewTd.findViewById(R.id.vs_result_status);
        View viewFindViewById = viewTd.findViewById(R.id.v_line);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.eb);
        viewFindViewById.setBackground(c384050F3z.LIZ(context));
    }
}
