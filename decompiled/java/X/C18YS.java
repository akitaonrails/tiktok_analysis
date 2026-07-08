package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18YS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18YS extends C214906198m {
    public AwS576S0100000_32 LL;
    public final C01GW LLILLJJLI;

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        AwS576S0100000_32 awS576S0100000_32;
        super.dismiss();
        if (!((C0ZQZ) this.LLILLJJLI.getValue()).LIZJ() || (awS576S0100000_32 = this.LL) == null) {
            return;
        }
        awS576S0100000_32.invoke();
    }

    public C18YS(Context context) {
        setContentView(C786410Ut5.LJLLJ(context, R.layout.cr1, null));
        setWidth(-1);
        setHeight(-1);
        setInputMethodMode(2);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1682));
    }
}
