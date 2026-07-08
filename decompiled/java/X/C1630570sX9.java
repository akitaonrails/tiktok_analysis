package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630570sX9 extends AbstractC1643790ssT {
    public final TextView LLILZ;

    public C1630570sX9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.AbstractC1643790ssT
    public final void LJ() {
        String string;
        TextView textView = this.LLILZ;
        Context context = getContext();
        C20510015Ni c20510015Ni = C20510015Ni.LIZ;
        if (c20510015Ni.LIZIZ()) {
            string = context.getString(2131829441);
        } else {
            int i = C1626980sRM.LIZ[c20510015Ni.LJI().ordinal()];
            string = context.getString(i != 1 ? i != 2 ? 2131829445 : 2131829436 : 2131829437);
        }
        textView.setText(string);
    }

    public C1630570sX9(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fvd, this, true);
        this.LLILZ = (TextView) findViewById(R.id.tv_panel_error_title);
    }
}
