package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import wh6.AbS685S0100000_1;

/* JADX INFO: renamed from: X.03FH, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03FH extends LinearLayout {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;

    public final void setIcon(int i) {
        this.LL.setIconRes(i);
    }

    public final void setOnCellClickListener(Function0<Unit> function0) {
        C786410Ut5.I7(new AbS685S0100000_1(function0, 0), this);
    }

    public final void setTitle(CharSequence charSequence) {
        this.LLILLJJLI.setText(charSequence);
    }

    public C03FH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cnr, this, true);
        setOrientation(1);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.fqn);
        this.LL = tuxIconView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1e);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        tuxIconView.setBackground(c384050F3z.LIZ(context));
        C427690Gpr.LJ(tuxIconView, C418440Gaw.LIZIZ(200));
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.fqo);
        setBackground(null);
    }
}
