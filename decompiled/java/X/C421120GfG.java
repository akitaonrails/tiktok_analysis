package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421120GfG extends C421130GfH {
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public String LLILZIL;

    public C421120GfG(Context context, AttributeSet attributeSet) {
        TuxTextView tuxTextView;
        super(context, attributeSet, 0);
        this.LLILZIL = "";
        View viewSd = C786410Ut5.Sd(R.layout.fqa, C786410Ut5.ne(context), this);
        this.LLILLJJLI = viewSd;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context);
        if (numLIZJ != null) {
            setBackgroundColor(numLIZJ.intValue());
        }
        setGravity(16);
        setRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C427690Gpr.LJ(this, C418440Gaw.LIZIZ(16));
        if (viewSd != null) {
            tuxTextView = (TuxTextView) viewSd.findViewById(R.id.gz1);
        } else {
            tuxTextView = null;
        }
        this.LLILLL = tuxTextView;
        this.LLILZ = viewSd != null ? (TuxTextView) viewSd.findViewById(R.id.text) : null;
    }
}
