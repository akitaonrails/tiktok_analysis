package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.core.resource.LynxResourceLoader;

/* JADX INFO: renamed from: X.0jvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1299740jvY implements Runnable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ LynxResourceLoader LLILZLL;

    public final void LIZ() {
        InterfaceC1299820jvg interfaceC1299820jvg = this.LLILZLL.LJ.get();
        if (interfaceC1299820jvg == null) {
            return;
        }
        LynxError lynxError = new LynxError(this.LL, C786410Ut5.j4("%s %s failed, the error message is: %s", new Object[]{"LynxResourceLoader", this.LLILLJJLI, this.LLILLL}), "Please refer to the solution in Doc 'LynxError FAQ' on the official website.", "error");
        lynxError.LJIIIIZZ(this.LLILZ);
        lynxError.LIZ("src", this.LLILZIL);
        interfaceC1299820jvg.onErrorOccurred(lynxError);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LynxResourceLoader@b53f.reportError$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxResourceLoader@b53f.reportError$1");
    }

    public RunnableC1299740jvY(LynxResourceLoader lynxResourceLoader, int i, String str, String str2, String str3, String str4) {
        this.LLILZLL = lynxResourceLoader;
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }
}
