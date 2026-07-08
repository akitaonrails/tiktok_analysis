package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MFG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MFG extends C0MFE<String> {
    public Function1<? super Boolean, Unit> LLJILJIL;

    @Override // X.C0MFE
    public final void LIZIZ() {
        C1389890mGx c1389890mGx = new C1389890mGx(this);
        c1389890mGx.LJIIJ(C21291518Tx.LJ(EnumC21291418Tw.INPUT_TEXT_LIMIT_TOAST, new Object[0]));
        c1389890mGx.LJIIJJI();
    }

    public final Function1<Boolean, Unit> getOnTextFilledStateChanged() {
        return this.LLJILJIL;
    }

    @Override // X.C0MFE, X.InterfaceC565110MEj
    public String getInputResult() {
        return getCurrentContent();
    }

    public C0MFG(Context context) {
        super(context, null, 0);
    }

    @Override // X.C0MFE
    public final void LIZ(boolean z) {
        Function1<? super Boolean, Unit> function1 = this.LLJILJIL;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public final void setOnTextFilledStateChanged(Function1<? super Boolean, Unit> function1) {
        this.LLJILJIL = function1;
    }
}
