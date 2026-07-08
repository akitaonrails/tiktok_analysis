package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS397S0200000_31;

/* JADX INFO: renamed from: X.14n3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20369114n3 extends AbstractC960470b6L<C1868260yiW> {
    public final InterfaceC20368414mw LL;
    public final C16F5 LLILLJJLI;
    public final C1841350y17 LLILLL;
    public final ViewGroup LLILZ;

    public final void L5(C1868260yiW c1868260yiW) {
        this.LLILLJJLI.setText(c1868260yiW.LIZ.LIZLLL);
        this.LLILLL.setChecked(c1868260yiW.LIZ.LIZIZ);
        C500260Jjc.LJLIIIL(500L, this.LLILZ, new AwS397S0200000_31(this, c1868260yiW, 116));
        this.LLILLL.setClickable(false);
    }

    public C20369114n3(View view, InterfaceC20368414mw interfaceC20368414mw) {
        super(view);
        this.LL = interfaceC20368414mw;
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.qoy);
        this.LLILLL = (C1841350y17) view.findViewById(R.id.qpa);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.qp9);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C1868260yiW) obj);
    }
}
