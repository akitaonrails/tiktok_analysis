package X;

import android.text.TextWatcher;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856430Xij<METADATA> {
    public final Function0<InterfaceC856090XiB<METADATA>> LIZ;
    public final AbstractC857980XlE<METADATA> LIZIZ;
    public C857480XkQ<METADATA> LIZJ;

    public final C857480XkQ<METADATA> LIZ() {
        if (this.LIZJ == null) {
            InterfaceC856090XiB<METADATA> interfaceC856090XiBInvoke = this.LIZ.invoke();
            C857480XkQ<METADATA> c857480XkQ = new C857480XkQ<>(interfaceC856090XiBInvoke, this.LIZIZ);
            this.LIZJ = c857480XkQ;
            interfaceC856090XiBInvoke.removeTextChangedListener((TextWatcher) c857480XkQ.LIZLLL.getValue());
            interfaceC856090XiBInvoke.addTextChangedListener((TextWatcher) c857480XkQ.LIZLLL.getValue());
        }
        C857480XkQ<METADATA> c857480XkQ2 = this.LIZJ;
        if (c857480XkQ2 == null) {
            return null;
        }
        return c857480XkQ2;
    }

    public C856430Xij(Function0 function0, C858450Xlz c858450Xlz) {
        this.LIZ = function0;
        this.LIZIZ = c858450Xlz;
    }
}
