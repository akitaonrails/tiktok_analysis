package X;

import Y.ACListenerS133S0200000_31;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20373314nj extends AbstractC960470b6L<C20373014ng> {
    public final InterfaceC20373214ni LL;
    public final EditText LLILLJJLI;
    public final EditText LLILLL;
    public final ImageView LLILZ;
    public TextWatcher LLILZIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LLILLJJLI.removeTextChangedListener(this.LLILZIL);
        this.LLILLL.removeTextChangedListener(null);
    }

    public C20373314nj(View view, InterfaceC20373214ni interfaceC20373214ni) {
        super(view);
        this.LL = interfaceC20373214ni;
        this.LLILLJJLI = (EditText) view.findViewById(R.id.gnm);
        this.LLILLL = (EditText) view.findViewById(R.id.gng);
        this.LLILZ = (ImageView) view.findViewById(R.id.cm1);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C20373014ng c20373014ng = (C20373014ng) obj;
        this.LLILLJJLI.setText(c20373014ng.LIZ.title);
        EditText editText = this.LLILLL;
        String str = (String) C13LP.LJJJLL(c20373014ng.LIZ.content);
        if (str == null) {
            str = "";
        }
        editText.setText(str);
        C16HQ c16hq = new C16HQ(c20373014ng, 5);
        this.LLILZIL = c16hq;
        this.LLILLJJLI.addTextChangedListener(c16hq);
        C16HQ c16hq2 = new C16HQ(c20373014ng, 6);
        this.LLILZIL = c16hq2;
        this.LLILLL.addTextChangedListener(c16hq2);
        C786410Ut5.Q7(this.LLILZ, new ACListenerS133S0200000_31(this, c20373014ng, 36));
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS610S0100000_31(this, 528));
    }
}
