package X;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vL5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738410vL5 extends View implements InterfaceC2186471Ahh {
    public final C1749190vcT LL;
    public final C1748470vbJ LLILLJJLI;

    public C1738410vL5(Context context) {
        super(context);
        this.LL = new C1749190vcT(context, null, 6);
        this.LLILLJJLI = new C1748470vbJ(context, null, 6);
    }

    @Override // X.InterfaceC2186471Ahh
    public final void LIZ(Function1<? super EditText, Unit> function1) {
        function1.invoke(this.LLILLJJLI.getEditText());
    }

    @Override // X.InterfaceC2186471Ahh
    public final C1749190vcT LIZIZ(String str) {
        C1749190vcT c1749190vcT = this.LL;
        c1749190vcT.LJII(str);
        c1749190vcT.setFormField(this.LLILLJJLI);
        return c1749190vcT;
    }

    @Override // X.InterfaceC2186471Ahh
    public void setClearButton(boolean z) {
        this.LLILLJJLI.LJFF(z);
    }

    @Override // X.InterfaceC2186471Ahh
    public void setErrorMsg(String str) {
        if (str != null && str.length() != 0) {
            C1749190vcT c1749190vcT = this.LL;
            c1749190vcT.LJFF(true);
            c1749190vcT.LIZJ(str);
            return;
        }
        this.LL.LJFF(false);
    }

    @Override // X.InterfaceC2186471Ahh
    public void setInputMode(int i) {
        this.LLILLJJLI.LJII(i);
    }

    @Override // X.InterfaceC2186471Ahh
    public void setPlaceholder(String str) {
        this.LLILLJJLI.LJIIJ(str);
    }

    @Override // X.InterfaceC2186471Ahh
    public void setText(String str) {
        this.LLILLJJLI.LJIILIIL(str);
    }
}
