package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429640Gt0 extends FrameLayout {
    public LinearLayout LL;
    public TuxTextView LLILLJJLI;

    public final TuxTextView getAdTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.abc);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final LinearLayout getAdTagLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.a6r);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setAdTagFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setAdTagLayoutFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public C429640Gt0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.azo, this, true);
    }

    public static String LIZ(int i, String str, boolean z) {
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, Math.max(i - 1, 1)));
            sbLIZ.append("... ");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str.substring(0, Math.max(i, 1)));
        sbLIZ2.append("...");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LIZIZ(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        C786410Ut5.q2(spannableStringBuilder, obj, Math.max(0, Math.min(i, i2)), Math.min(spannableStringBuilder.length(), Math.max(i, i2)), 33);
    }
}
