package X;

import android.util.Printer;

/* JADX INFO: renamed from: X.088Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C088Q extends C088V implements Printer {
    public Printer LLILLJJLI;

    public C088Q(C088C c088c) {
        super("TriggerFromLooperPrinter", c088c);
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.charAt(0) == '<' && this.LL != null) {
            C088C.LIZ();
        }
        Printer printer = this.LLILLJJLI;
        if (printer != null) {
            printer.println(str);
        }
    }
}
