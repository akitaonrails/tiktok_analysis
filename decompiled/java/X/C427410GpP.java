package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427410GpP extends CardView {
    public final C427870Gq9 LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;

    public C427410GpP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.e2v, this, true);
        this.LLIZLLLIL = (C427870Gq9) findViewById(R.id.r00);
        this.LLJ = (TuxTextView) findViewById(R.id.r02);
        this.LLJI = (TuxTextView) findViewById(R.id.r01);
        findViewById(R.id.r18);
        setCardElevation(C418440Gaw.LIZIZ(2));
        setRadius(200.0f);
    }

    public static final void LJIIIIZZ(TuxTextView tuxTextView, String str) {
        if (str != null && str.length() != 0) {
            tuxTextView.setText(str);
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
    }
}
